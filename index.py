"""
  15 mins time box.
  Please think out loud so we can get a sense of your thought process.
  Ask questions when you are stuck.
  Finishing it is not a requirement.
  Syntax is not important you are welcome to code in any language you are familiar with.
"""

# Mapping of Roman numerals to their integer values
ROMAN_MAP = {
    'I': 1,
    'V': 5,
    'X': 10,
    'L': 50,
    'C': 100,
    'D': 500,
    'M': 1000
}

""" RULES FOR CALCULATION:
 * Iterate through the string and compare the current character's value
 * to the value of the character to its right.
 * 1. ADDITION: If the current value is greater than or equal to the value on the right, 
      add the current value. (e.g., VI -> 5 >= 1, so add 5).
 * 2. SUBTRACTION: If the current value is smaller than the value on the right, 
      subtract the current value. (e.g., IV -> 1 < 5, so subtract 1).
 * Examples:
 * VI (5 + 1 = 6)
 * IV (-1 + 5 = 4)
"""

def roman_to_int(s: str) -> int:
    """
    :param s: str
    :return: int
    """
    # TODO Your code here
    return "test"

if __name__ == "__main__":
    print(roman_to_int("IV"))
