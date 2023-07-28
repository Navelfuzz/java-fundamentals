# CF 401 Java Fundamentals Labs

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

## Lab: Class 04