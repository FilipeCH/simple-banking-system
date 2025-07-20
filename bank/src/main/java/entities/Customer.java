package entities;

public class Customer extends Person{
    Integer id;
    
    // acounts related attributes
    String accountNumber;
    String agency;
    Double balance;
    String accountType;
    String email;
    String password;
    
    public Customer(String name, Character sexo, String birthDate, String address, String cpf) {
        super(name, sexo, birthDate, address, cpf);
    }
    

    public Customer(String name, Character sexo, String birthDate, String address, String cpf, String agency,
                    String accountType, String email, String password) {
        super(name, sexo, birthDate, address, cpf);


        this.id = null; // id can be set later, e.g., by a database
        this.accountNumber = null; // account number can be generated later

        this.balance = 0.0; // initial balance is set to zero
        
        this.agency = agency;
        this.accountType = accountType;
        
        this.email = email;
        this.password = password;
    }


    public Integer getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAgency() {
        return agency;
    }

    public Double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }


    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }





}