# CF 401 Java Fundamentals Labs

## Files

        ├── basiclibrary
        │   ├── lib
        │   │   ├── main
        │   │   │   ├── java
        │   │   │   │   ├── basiclibrary
        │   │   │   │   │   ├── Library.java
        │   │   ├── test
        │   │   │   ├── java
        │   │   │   │   ├── basiclibrary
        │   │   │   │   │   ├── LibraryTest.java
        ├── basics
        │   ├── Main.java
        ├── linter
        │   ├── app
        │   │   ├── src
        │   │   │   ├── main
        │   │   │   │   ├── java
        │   │   │   │   │   ├── App.java  
        │   │   │   │   ├── resources
        │   │   │   │   │   ├── gates.js
        │   │   │   ├── test
        │   │   │   │   ├── java
        │   │   │   │   │   ├── AppTest.java  
        │   │   │   │   ├── resources
        │   │   │   │   │   ├── emptyFile.js
        │   │   │   │   │   ├── fewErrors.js
        │   │   │   │   │   ├── manyErrors.js
        │   │   │   │   │   ├── noErrors.js
        │   │   │   │   │   ├── oneError.js

## Lab: Class 01

Java Primitives and Control Flow:
Directories: basics
Files: Main.java

### Feature Tasks

**Pluralize**
Write a function called `pluralize` that accepts a word and a number that returns a string with the word pluralized with 
an "s" if the number is zero, or greater than one.

**Flipping Coins**
Write a function called `flipNHeads` that accepts an integer `n` and flips coins until `n` heads are flipped in a row. 
Simulate coin flipping by choosing a random number between `0` and `1`. Numbers below `.5` are considered tails. 
Numbers at and above `.5` are considered heads. Print out `heads` or `tails` on one line for each flip. Print 
`It took FLIPS flips to flip N heads in a row.` once `n` heads have been in a row.

**Command Line Clock**
Write a method `clock` that uses Java's built-in `LocalDateTime` object to constantly print out the current time to 
the console, second by second. The program should run until someone manually kills it with `CTRL-C` or presses the stop
button in their IDE. Each time should only be printed once. Your program should detect when the seconds increase and 
only print something out when the timestamp changes. 

## Lab: Class 02

Arrays, Loops, Imports, ArrayLists
Directories: basiclibrary  
Files: Library.java, LibraryTest.java

### Feature Tasks

**Rolling Dice**
Write a method called `roll` that accepts an integer `n` and rolls a six-sided dice `n` times. The method should 
return an array containing the values of the rolls.

**Contains Duplicates**
Write a method called `containsDuplicates` that returns `true` or `false` depending on whether the array contains 
duplicate values.

**Calculating Averages**
Write a method that accepts an array of integers and calculates and returns the average of all the values in the array.

**Arrays of Arrays**
Given an array of arrays calculate the average value for each array and return the array with the lowest average.

## Lab: Class 03

Maps, File I/O, and Testing
Directories: linter
Files: App.java, AppTest.java

### Feature Tasks

**Analyzing Weather Data**

Use the October Seattle weather data above. Iterate through all of the data to find the min and max values. 
Use a `HashSet` of type `Integer` to keep track of all the unique temperatures seen. Finally, iterate from the min 
temp to the max temp and create a String containing any temperature not seen during the month. Return that String.

**Tallying Election**

Write a function called `tally` that accepts a List of Strings representing votes and returns one string to show what 
got the most votes.

**File I/O JavaScript Linter**

Write a method that reads a JavaScript file with a given `Path`, and generates an error message whenever it finds a 
line that doesn’t end in a semi-colon.

Read through the file line by line. Create a string that contains a message such as `"Line 3: Missing semicolon."` 
if a line is missing a semicolon.

* Don’t show an error if the line is empty.
* Don’t show an error if the line ends with an opening curly brace `{`
* Don’t show an error if the line ends with an closing curly brace `}`
* Don’t show an error if the line contains `if` or `else`

Call that method in your `main` method on the file `gates.js`, and print out the resulting error message.

## Lab: Class 04