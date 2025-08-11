# 🏦 Java Banking System

A simple, interactive, console-based banking application written in Java. This system allows users to **create accounts**, **deposit money**, **withdraw funds**, **check balances**, and **transfer money between accounts** — all from a terminal window.

---

## 📂 Project Structure

```
src/
├── UserInterface.java   # Main entry point for the banking application (UI & menu)
├── Proccessing.java     # Handles core banking logic: account creation, search, transactions
├── Getdata.java         # Represents an account and its operations (data model)
```

---

## 🚀 Features

- **Create Account** – Open a new account with an initial deposit and unique account number.
- **Deposit Money** – Add funds to an existing account.
- **Withdraw Money** – Remove funds from an account (if balance allows).
- **Check Bank Balance** – View the current balance for any account.
- **Transfer Funds** – Move money between two accounts.
- **Exit** – Close the program.

---

## 🛠 Requirements

- **Java JDK 8 or later**
- A terminal or command prompt to run the application

---

## 📦 How to Compile and Run

1. **Clone or download** this repository.
2. Open a terminal in the project root folder.
3. Compile all `.java` files in the `src` directory:
   ```bash
   javac src/*.java
   ```
4. Run the program:
   ```bash
   java -cp src UserInterface
   ```

---

## 📋 Menu Options

When you run the program, you’ll see:

```text
Welcome to our Bank
Enter your choice:
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Bank Balance
5. Transfer Fund
6. Exit
```
Follow the prompts to perform banking operations.

---

## 📌 Notes & Limitations

- **Unique Account Numbers:** Each account must have a unique account number.
- **In-Memory Storage:** All data is stored in memory (no database). All account information is lost when the program exits.
- **Validation:** Withdrawal and transfer operations will fail if the account balance is insufficient.
- **No Persistent Storage:** This application is for demonstration and educational purposes only.
- **Single-Session Use:** Once the program exits, all user data is lost.

---

## 🤝 Contribution

Contributions, bug reports, and suggestions are welcome! Please open an issue or submit a pull request.

---
