****LECTURE NOTES****
---
**Conventions and Comments**
- Use of programming Conventions and correct Comments are much more
important than many programmers think
- Without comments no “real” program can be maintained
- Conventions and comments improve the quality of produced code, making
it more robust, reusable and maintainable
- Conventions and comments support communication between teams of
developers
- Many languages, including Java, have a standard set of programming
conventions that should always be followed

**Java Conventions**
Class names should be singular nouns that begin with a capital letter, e.g.
``Person, Picture, Board, Image``
- Identifier names (attributes, variables, parameters) should also be nouns,
but start with a lowercase letter, e.g. ``totalValue, stockLevel``
- Identifier names should be plural if they represent a collection or array, e.g.
enrolledStudents
- Constant values (attributes prefixed with final) should be uppercase and
separated using an underscore, e.g. ``MAX_TEMP = 100;``
- Methods should be verbs, start with a lower-case letter and indicate what
action the method performs, e.g. ``getTotalValue(), isEnrolled()``

**Java Comments**
- The Java language supports three distinct type of comments -
- ``// Single line comments, that terminate at the end of line``
- ``/* Multi-line C style comments that *May span more than one line */``
- ``/** Multi-line Javadoc style comments that may * span more than one line and contain special tags */``
- The last of these allows for the automatic generation of program documentation using a tool called ``javadoc``

**Using Regular Comments**
- Use regular (non-javadoc) comments to describe algorithms or reasoning behind pieces of code
- These type of comments often appear within method code blocks
- Don’t use comments that provide a simple direct English translation, e.g. ``count = count + 1; // add one to count``
- The above comment would only be useful to a someone with no programming knowledge
- Comments should include information that can not be easily derived from looking at the program, i.e. comments should say something that is not obvious or easily derivable from the code