# **Software Systems Development (SE3) – Exceptions**


---

## **Errors in Programs**
- Most programs have **errors** — some critical, some minor.  
- Two main categories:
  - **Syntax Errors** → occur when language rules are broken (must be fixed before compilation).  
  - **Logical Errors** → occur at run-time (bugs).  

Even in bug-free programs, **run-time errors** can occur due to unavoidable circumstances:
- e.g. trying to open an unknown file or divide by zero.

---

## **The Exception Mechanism**
- Many languages (including Java) have an **exception handling mechanism** to handle run-time errors gracefully.  
- **Exceptions** are signals that something has gone wrong.  
- If not handled → program terminates with a **stack trace**.  
- Stack traces are for developers, **not end-users**.

---

## **Why Use the Exception Mechanism**
- Improves **robustness** and **code quality**.  
- Keeps normal logic and error-handling logic separate.  
- Reduces code repetition and improves readability.  

---

## **Try-Catch Blocks**
Used to **detect and handle exceptions**.

```java
try {
    String ageStr = scanner.nextLine();
    int value = Integer.parseInt(ageStr);
    System.out.println("In five years you will be " + (value + 5));
} catch (NumberFormatException e) {
    System.out.println("The age entered is not a number");
}
```

### Behaviour:
- If no exception → executes all code in `try`, skips `catch`.  
- If an exception occurs → execution jumps to matching `catch` block.  
- If no match → exception propagates upwards → program terminates.

---

## **Types of Exceptions**
Common Java exceptions include:
- `NumberFormatException`
- `ArithmeticException`
- `FileNotFoundException`
- `ArrayIndexOutOfBoundsException`

Each exception type helps identify and handle different error situations precisely.

---

## **Handling Multiple Exceptions**
### (a) Single Catch Block with Multiple Types:
```java
try {
    String divisor = scanner.nextLine();
    result = total / Integer.parseInt(divisor);
} catch (ArithmeticException | NumberFormatException e) {
    System.out.println("A non-numeric value or a 0 was entered");
}
```

### (b) Multiple Catch Blocks:
```java
try {
    String divisor = scanner.nextLine();
    result = total / Integer.parseInt(divisor);
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by 0");
} catch (NumberFormatException e) {
    System.out.println("Value must be a number");
}
```
> Only one `catch` block executes per exception.

---

## **The `finally` Clause**
- Executes **always**, whether an exception occurs or not.  
- Commonly used for **cleanup tasks** like closing files or network connections.  

```java
try {
    // code
} catch (Exception e) {
    // handle
} finally {
    // always runs
}
```

---

## **Automatic Resource Management**
- Java provides **try-with-resources** for auto-closing resources:

```java
try (FileReader file = new FileReader(filePath)) {
    // use file
} catch (IOException e) {
    // handle error
}
// file automatically closed
```

---

## **When to Handle Exceptions**
Ask yourself:  
> “Could the exception occur if the code was written differently?”

- If **yes** → fix the code.  
- If **no** (it’s unavoidable) → handle it using `try...catch`.  

---

## **Throwing Exceptions**
- Causing an exception intentionally is called **throwing**.  
- Useful for signalling errors across different code sections.

```java
int gen_hash(String pwd) throws InvalidPWException {
    if (pwd.length() < 5 || pwd.length() > 32)
        throw new InvalidPWException();
    return pwd.hash();
}
```

Handling:
```java
try {
    int hashVal = gen_hash(password);
} catch (InvalidPWException e) {
    System.out.println("Password does not conform to requirements");
}
```

---

## **Exception Propagation**
- Exceptions **propagate up the call stack** until caught.  
- Can be handled in higher-level methods (like `main()`).

```java
method1() {
    try { method2(); }
    catch (Exception e) { /* handle */ }
}

method2() throws Exception {
    method3();
}

method3() throws Exception {
    method4();
}

method4() {
    throw new Exception();
}
```

---

## **`throw` vs `throws`**
| Keyword | Purpose |
|----------|----------|
| `throw`  | Used to *cause* an exception |
| `throws` | Declares that a method *might* throw an exception |

Example:
```java
void riskyMethod() throws IOException {
    throw new IOException("File not found");
}
```

> Unchecked exceptions (like `RuntimeException`) do **not** require `throws`.

---

## **Passing Parameters & Messages**
You can include custom messages in exceptions:

```java
throw new InvalidPWException("Password too short");
```

Access message:
```java
catch (InvalidPWException e) {
    System.err.print("Validation failed: " + e.getMessage());
}
```

---

## **Creating Custom Exceptions**
Custom exceptions extend the `Exception` class:

```java
class MyException extends Exception {
    MyException(String msg) {
        super("My exception occurred: " + msg);
    }
}
```

Used to:
- Add extra attributes  
- Provide specific messages  
- Handle custom problems in `catch` blocks  

---

## **Summary**
- Exceptions are crucial for **robust programs**.  
- Always handle unavoidable exceptions using `try...catch`.  
- Use **`finally`** or **try-with-resources** for cleanup.  
- **Throw exceptions** to signal problems clearly.  
- Learn from **stack traces** — don’t ignore them!  

---