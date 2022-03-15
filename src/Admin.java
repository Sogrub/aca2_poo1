import java.util.Scanner;

public class Admin {
    Scanner sc = new Scanner(System.in);

    // Atributos
    int id;
    String fullName;
    int age;
    String address;
    String phone;
    String workArea;
    String contract;
    String workTime;
    String transport;

    // Constructor
    public Admin(int ID, String Name, int age_, String address_, String phone_, String workArea_,
            String contract_, String workTime_, String transport_) {
        this.id = ID;
        this.fullName = Name;
        this.age = age_;
        this.address = address_;
        this.phone = phone_;
        this.workArea = workArea_;
        this.contract = contract_;
        this.workTime = workTime_;
        this.transport = transport_;
    }

    // Metodos

    // Tiene que devolver los atributos como una cadena de texto
    public String imprimir() {

        String text = "Id: " + this.id + " Nombre: " + this.fullName + " Edad: " + this.age +
                " Dirección: " + this.address + " Telefono: " + this.phone +
                " Area Trabajo: " + this.workArea + " Tipo de Contrato: " + this.contract;

        return text;
    }

    public String horario() {
        return this.workTime;
    }

    public String transporte() {
        return this.transport;
    }
}