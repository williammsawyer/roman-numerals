/*
  15 mins time box.
  Please think out loud so we can get a sense of your thought process.
  Ask questions when you are stuck.
  Finishing it is not a requirement.
  Syntax is not important; you are welcome to code in any language you are familiar with.
*/

// Mapping of Roman numerals to their integer values
val romanMap = mapOf(
    'I' to 1,
    'V' to 5,
    'X' to 10,
    'L' to 50,
    'C' to 100,
    'D' to 500,
    'M' to 1000
)

/* THE LOGIC:
 *
 * GENERAL RULE (Addition):
 * - Usually, you simply sum up the values of the symbols.
 * - Example: VI -> 5 + 1 = 6
 * - Example: VII -> 5 + 1 + 1 = 7
 *
 * THE EXCEPTION (Subtraction):
 * - If a smaller value appears *before* a larger value, it is subtracted from the total.
 * - Example: IV -> -1 + 5 = 4 
     Because I(1) is smaller than V(5), we subtract.  
 * - Example: IX -> -1 + 10 = 9 
     Because I(1) is smaller than X(10), we subtract.  
 *
 * COMPLEX EXAMPLE:
 * XIV -> 10 - 1 + 5 = 14
 */

fun romanToInt(s: String): Int {
    // TODO: Your code here
    return 0
}

fun main() {
    println(romanToInt("IV"))
}
