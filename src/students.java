import java.util.Scanner;

public class students {
    Scanner sc = new Scanner(System.in);

    //Atributos
    int id;
    String fullName;
    int age;
    String address;
    String phone;
    int yearSchool;
    float pensionValue;

    //Constructor
    public students(int ID, String Name, int age_, String address_, String phone_, int yearSchool_, float pensionValue_){
        this.id = ID;
        this.fullName = Name;
        this.age = age_;
        this.address = address_;
        this.phone = phone_;
        this.yearSchool = yearSchool_;
        this.pensionValue = pensionValue_;
    }

    //Metodos

    //Tiene que devolver los atributos como una cadena de texto
    public void imprimir(){
        
    }
}