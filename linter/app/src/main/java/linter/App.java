/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws IOException {
        Path gatesPath;
        if (args.length > 0) {
            gatesPath = Paths.get(args[0]).toAbsolutePath();
        } else {
            gatesPath = Paths.get("src/main/resources/gates.js");
        }
        String errors = linter(gatesPath);
    }

    public static String linter(Path path) throws IOException {
        Scanner scanner = new Scanner(path);
        int lineNumber = 0;
        String errors = "There are errors on lines: ";
        while (scanner.hasNextLine()) {
            String buffer = scanner.nextLine();
            lineNumber++;
            boolean noError = (buffer.equals("") || buffer.contains("if") || buffer.contains("else") || buffer.endsWith("{") || buffer.endsWith("}") || buffer.endsWith(";"));
            if (!noError) {
                errors = errors + "\n" + lineNumber;
                System.out.println("Line " + lineNumber + ": Missing semicolon.");
            }
        }
        return errors;
    }
}