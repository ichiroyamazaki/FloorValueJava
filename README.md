# FloorValueJava

A Java console application that calculates a purchase total and demonstrates the use of `Math.floor()`, `Math.ceil()`, and `Math.round()`.

## Overview

FloorValueJava is a beginner-friendly Java programming exercise that simulates a basic purchase receipt. The user enters an item name, quantity, and unit price. The application calculates the total amount and displays three different rounding results.

## Features

- **Item Input:** Accepts the name of the purchased item.
- **Quantity Input:** Reads the quantity as an integer.
- **Price Input:** Reads the item's price as a decimal number.
- **Total Calculation:** Multiplies the price by the quantity.
- **Floor Value:** Uses `Math.floor()` to round the total down to the nearest integer.
- **Ceiling Value:** Uses `Math.ceil()` to round the total up to the nearest integer.
- **Rounded Value:** Uses `Math.round()` to round the total to the nearest integer.
- **Receipt Display:** Prints the item details and calculated values.

## Technologies Used

- Java
- `java.util.Scanner`
- `Math.floor()`
- `Math.ceil()`
- `Math.round()`

## Project Structure

```text
FloorValueJava/
├── LabExer22.java
└── README.md
```

## Requirements

- Java Development Kit (JDK)
- A Java-compatible IDE or command-line environment

## Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/ichiroyamazaki/FloorValueJava.git
cd FloorValueJava
```

### 2. Compile the program

The source declares the package `LabExer22`. Save the file inside a directory named `LabExer22` before compiling:

```bash
javac LabExer22/LabExer22.java
```

### 3. Run the program

```bash
java LabExer22.LabExer22
```

Run the commands from the directory containing the `LabExer22` folder.

## How It Works

1. The program prompts the user for an item name.
2. It requests the item quantity and unit price.
3. It calculates the total using `itemPrice * itemQuantity`.
4. It displays the purchase details as a receipt.
5. It calculates and displays the floor, ceiling, and rounded total.
6. It closes the input scanner.

## Example

Suppose the user enters the following:

```text
Enter the name of the item you are purchasing:
Notebook
Enter Quantity:
3
Enter Price:
12.75
```

The calculated total is `38.25`, producing the following results:

```text
--- Receipt ---
Item Name: Notebook
Quantity: 3
Price: 12.75
Total Amount: 38.25
----------------
Floor Value: 38.0
Ceiling Value: 39.0
Rounded Value: 38
----------------
```

## Understanding the Rounding Methods

| Method | Result for `38.25` | Description |
|---|---:|---|
| `Math.floor()` | `38.0` | Returns the greatest integer value less than or equal to the input, represented as a `double`. |
| `Math.ceil()` | `39.0` | Returns the smallest integer value greater than or equal to the input, represented as a `double`. |
| `Math.round()` | `38` | Returns the nearest integer as a `long` for a `double` input. |

## Limitations

- Invalid numeric input is not explicitly handled.
- The program does not validate negative quantities or prices.
- Monetary values use `double`, which can introduce floating-point precision issues.
- The application handles one purchase per execution.
- Rounding is demonstrated mathematically and is not a complete currency-formatting or financial accounting solution.

## Author

**Ichiro Yamazaki**

GitHub: https://github.com/ichiroyamazaki

## License

No license has been verified. Check the repository for licensing information before redistributing or modifying the project.
