5.1 a. for , while
    b. after
    c. switch
    d. continue
    e. conditional AND
    f. false
    e. static
    
5.2
        a. False. The default case is optional. If no default action is needed, then there’s no need
        for a default case
        b. False. The break statement is used to exit the switch statement. The break
        statement is not required for the last case in a switch statement.
        c.False. Both of the relational expressions must be true for the entire expression to be true when using the && operator
        d. True
        e. True
        f. False.  The switch statement does not provide a mechanism for testing ranges of values,
        so every value that must be tested should be listed in a separate case label.
        g. True.
    
5.3
a.1 sum = 0;
2 for (count = 1; count <= 99; count += 2) {
3 sum += count;
4. }
b.double result = Math.pow(2 . 5, 3);
c.
1. i = 1;
2
3 while (i <= 20) {
4 System.out.print(i);
5
6 if (i % 5 == 0) {
7 System.out.println();
8 }
9 else {
10 System.out.print('\t');
11 }
12
13 ++i;
14 }

d.
1 for (i = 1; i <= 20; i++) {
2 System.out.print(i);
3
4 if (i % 5 == 0) {
5 System.out.println();
6 }
7 else {
8 System.out.print('\t');
9 }
10 }
 
 5.4
a) Error: The semicolon after the while header causes an infinite loop, and there’s a missing left brace.
Correction: Replace the semicolon by a {, or remove both the ; and the }.
b) Error: Using a floating-point number to control a for statement may not work, because
floating-point numbers are represented only approximately by most computers.
Correction: Use an integer, and perform the proper calculation to get the values you desire, as in:
1 for (k = 1; k != 10; k++) {
2 System.out.println((double) k / 10);
3 }
c) Error: The missing code is the break statement in the statements for the first case.
Correction: Add a break statement at the end of the statements for the first case. This
omission is not necessarily an error if you want the statement of case 2: to execute every
time the case 1: statement executes.
d) Error: An improper relational operator is used in the while’s continuation condition.
Correction: Use <= rather than <, or change 10 to 11.


 
 5.5    1: Control variable: A variable used to count the iterations, such as count.

        2:  Initial value: The starting value assigned to the control variable.

        3: Loop-continuation condition: A condition that determines whether the loop should continue .

         4: Increment (or decrement): An operation that changes the control variable after each iteration, bringing it closer to the condition that terminates the loop.

  5.6  Compare and contrast while and for

  Both while and for are pretest iteration statements, meaning they test the loop-continuation       condition before executing the loop body. Therefore, either loop can execute zero or more times.5.7. If you need to execute the body of a loop at least once, would it be better to use a do…while
statement or a while statement?
Yes, it is better to use a do...while statement when you need the body of a loop to execute at least once.


5.7. If you need to execute the body of a loop at least once, would it be better to use a do…while
statement or a while statement?
Yes, it is better to use a do...while statement when you need the body of a loop to execute at least once.

5.8. Compare and contrast the break and continue statements.
Break completely terminates the loop while continue skips the current iteration.

5.9. Find and correct the error(s) in each of the following segments of code:
a) while (i = 1; i <= 10, i+)
System.out.println(i);
corrected errors
int i = 1;
while (i <= 10) {
    System.out.println(i);
    i++;
}
