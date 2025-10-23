****LECTURE NOTES****
---

*Concepts of Object-Orientation*
- Like most modern languages, Java supports programming using the object-orientated paradigm, key concepts are:
  - Classes and Objects
  - Encapsulation 
  - Inheritance 
  - Polymorphism
- Each of these concepts maps to specific keywords or implementation techniques within Java

*Classes and Objects*

- Classes are the central concept within Java, they contain attributes and methods, each class is typically defined with a single ``.java`` file
- Objects are run-time instantiations of classes, created using the ``new`` operator. Eg. ``s = new Student()``
- A special method called the constructor is executed first to perform object initialisation
- Inheritance is implemented using the ``extends`` keyword. The sub-type inherits from a super-type
- Encapsulation is enforced using private, protected and public visibility modifiers

*Review of Core Java*

- The special keywords ``this`` and ``super`` allow explicit access to either the object itself or the ``super-type`` respectively
- Methods defined in sub-types can override methods appearing in the super-type (helps to support polymorphic behaviour)
- Classes can be identified as ``abstract``, meaning that they cannot be directly instantiated
- Abstract classes can also include abstract methods, which do not include implementation code
- The ``main()`` method is the program entry point, often appearing in a `Driver` class