public class Library {

    public int[] roll(int n) {
    Random random = new Random();
    int[] rolls = new int[n];
    for (int i = 0; i < n; i++){
    rolls[i] = random.nextInt(6)+1;
}
    there is an error here on line 9
return rolls;
}