class Address {
    String area;
    String city;
    String state;
    int pincode;

    Address(String area, String city, String state, int pincode) {
        this.area = area;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    Address(Address old) { // Deep copy constructor
        this.area = old.area;
        this.city = old.city;
        this.state = old.state;
        this.pincode = old.pincode;
    }

    public void displayAddress() {
        System.out.println("Address Info");
        System.out.println("Area: " + area);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("PinCode: " + pincode);
    }
}

class AccountDetails {
    long accountNumber;
    String ifscCode;
    String accountType;
    double balance;

    AccountDetails(long accountNumber, String ifscCode, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
        this.accountType = accountType;
        this.balance = balance;
    }

    AccountDetails(AccountDetails old) { // Deep copy constructor
        this.accountNumber = old.accountNumber;
        this.ifscCode = old.ifscCode;
        this.accountType = old.accountType;
        this.balance = old.balance;
    }

    public void displayAccount() {
        System.out.println("Account Details");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("IFSC Code: " + ifscCode);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}

class Bank {
    String accName;
    String branch;
    String email;
    Address address;
    AccountDetails account;

    Bank(String accName, String branch, String email, Address address, AccountDetails account) {
        this.accName = accName;
        this.branch = branch;
        this.email = email;
        this.address = new Address(address); // Deep copy
        this.account = new AccountDetails(account); // Deep copy
    }

    Bank(Bank old) { // Deep copy constructor
        this.accName = old.accName;
        this.branch = old.branch;
        this.email = old.email;
        this.address = new Address(old.address);
        this.account = new AccountDetails(old.account);
    }

    public void displayBankDetails() {
        System.out.println("Bank Account Details");
        System.out.println("Account Holder: " + accName);
        System.out.println("Branch: " + branch);
        System.out.println("Email: " + email);
        System.out.println();
        address.displayAddress();
        System.out.println();
        account.displayAccount();
    }
}

public class DeepCopyCons {
    public static void main(String[] args) {
        Address addr = new Address("MG Road", "Mumbai", "MH", 400001);
        AccountDetails acc = new AccountDetails(1234567890L, "SBIN0001234", "Savings", 50000.75);
        
        Bank original = new Bank("Amit Sharma", "SBI Mumbai", "amitsharma@gmail.com", addr, acc);
        original.displayBankDetails();
        
        System.out.println("____________________________________________________");
        System.out.println("Copy Below");
        
        Bank copy = new Bank(original); // Creating deep copy
        copy.displayBankDetails();
        
        System.out.println("____________________________________________________");
        System.out.println("Copy After Change");
        copy.account.balance = 100000.50; // Changing the balance in copied object
        copy.address.city = "Pune"; // Changed the city name in copied object
        copy.displayBankDetails();
        
        System.out.println("____________________________________________________");
        System.out.println("Original obj after change in copy obj");
        original.displayBankDetails(); // Original detials remains same
    }
}
