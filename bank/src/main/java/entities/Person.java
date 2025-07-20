package entities;

public class Person {
    String name;
    Character sexo;
    String birthDate;
    
    String address;
    String cpf;
    
    
    public Person(String name, Character sexo, String birthDate, String address, String cpf) {
        this.name = name;
        this.sexo = sexo;
        this.birthDate = birthDate;
        this.address = address;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }
    
    public Character getSexo() {
        return sexo;
    }
    
    public String getBirthDate() {
        return birthDate;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", sexo=" + sexo + ", birthDate=" + birthDate + ", address=" + address
                + ", cpf=" + cpf + "]";
    }
    
}
