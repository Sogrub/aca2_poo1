import java.util.Scanner;

public class Students {
    Scanner sc = new Scanner(System.in);

    // Atributos
    int id;
    String fullName;
    int age;
    String address;
    String phone;
    int yearSchool;
    float pensionValue;
    String workTime;
    String transport;

    // Constructor
    public Students(int ID, String Name, int age_, String address_, String phone_, int yearSchool_,
            float pensionValue_, String workTime_, String transport_) {
        this.id = ID;
        this.fullName = Name;
        this.age = age_;
        this.address = address_;
        this.phone = phone_;
        this.yearSchool = yearSchool_;
        this.pensionValue = pensionValue_;
        this.workTime = workTime_;
        this.transport = transport_;
    }

    // Metodos

    // Tiene que devolver los atributos como una cadena de texto
    public String imprimir() {

        String text = "Id: " + this.id + " Nombre: " + this.fullName + " Edad: " + this.age +
                " Dirección: " + this.address + " Telefono: " + this.phone +
                " Año escolar: " + this.yearSchool + " Valor pensión: " + this.pensionValue;
        return text;
    }

    public String horario() {
        return this.workTime;
    }

    public String transporte() {
        return this.transport;
    }
}