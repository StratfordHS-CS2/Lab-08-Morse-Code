[![Build Status](https://travis-ci.com/StratfordHS-CS2/lab-08-morse-code-username.svg)](https://travis-ci.com/StratfordHS-CS2/lab-08-morse-code-username)

# Lab 08 - Morse Code

## Lab Goal
This lab was designed to give you practice using a `switch` statement in Java. It also will give you some more practice with Strings.

## Instructions
Complete the `translate` method. This method takes a string in Morse Code and translates it to a text string.  The text string is returned.
* You must translate all the characters below (A-Z,0-9).
* All translated characters will be uppercase.
* If you receive a Morse Code letter that is not translatable it should translate to "?".
* Each Morse Code letter will be separated by a single space.
* You may edit the `main()` method if you wish, but it is not required.

## Morse Code

| Letter | Morse Code |
|---|---|
|A| .- |
|B| -... |
|C| -.-. |
|D| -.. |
|E| . |
|F| ..-. |
|G| --. |
|H| .... |
|I| .. |
|J| .--- |
|K| -.- |
|L| .-.. |
|M| -- |
|N| -. |
|O| --- |
|P| .--. |
|Q| --.- |
|R| .-. |
|S| ... |
|T| - |
|U| ..- |
|V| ...- |
|X| -..- |
|W| .-- |
|Y| -.-- |
|Z| --.. |
|0| ----- |
|2| ..--- |
|1| .---- |
|3| ...-- |
|4| ....- |
|5| ..... |
|6| -.... |
|7| --... |
|8| ---.. |
|9| ----. |
|?| unknown |

## The Switch Statement
* [Switch Statement - Geeks for Geeks](https://www.geeksforgeeks.org/switch-statement-in-java/)
* [Switch Statement - Tutorials Point](https://www.tutorialspoint.com/java/switch_statement_in_java.htm)

## Notes
* The Checkstyle config url is http://www.daveavis.com/cs/checkstyle_SHS.xml
* Make sure you modify the link at the top of your **Readme.md** to reflect your username if you want the badge at the top to represent the status of your code.

## Grading
* 30 - All letters work
* 30 - All numbers work
* 10 - Unknown cases are handled with a question mark
* 20 - Used a `switch` statement instead of a string of `if` statements
* 10 - style

Note that these are potential maximums; the computer can only check so much.  If your code passes Checkstyle, but I see non-descriptive variable names, then your style grade will go down.  If your code passes all tests, but I see code that was copied off of the internet or from another student your grade will go *way* down.
