# Programming Project 3, Phase 1, Problems 1-2
Carlos F. Meneses • 03/24/2015 • Bergen Community College • Advanced Java Programming

# Problem 1
StringApp.java: Reads strings from the user until the user enters "DONE". If a string is entered that has too many characters (say 20), throw the exception. The exception StringTooLongException catches and handles the exception if it is thrown. Handle the exception by printing an appropriate message, and then continue processing more strings. (see also: StringTooLongException.java)

StringTooLongException: This exception gets thrown if the user enters a string which has 20 or more characters. (see also: StringApp.java)

# Problem 2
InvalidDocumentCodeApp.java: Throws InvalidDocumentCodeException when an improper designation for a document (neither unclassified, confidential, or proprietary) is encountered during processing. If a document designation is encountered that doesn’t fit that description, the exception is thrown. (see also: InvalidDocumentCodException.java)

InvalidDocumentCodeExcepion.java: Creates excpetion class for App. (see also: InvalidDocumentCodeApp.java)