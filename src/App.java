import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        students student1 = new students(0, "Carlos Alonso", 14, "Calle 23 5 42", "3112063020", 2022, 300000);
        students student2 = new students(1, "Daniela Lopez", 13, "Calle 5 17 30", "3104225025", 2022, 300000);
        students student3 = new students(2, "Sofia Lara", 14, "Calle 50 2 20", "3125429746", 2022, 300000);
        students[] arrayStudents = {student1, student2, student3};
        System.out.println("Bienvenidos al registro de Estudiantes y administrativos: \n");
        for (int i = 0; i < arrayStudents.length; i++) {
            System.out.println("los datos son: \n" + 
            "Id: " + arrayStudents[i].id + "\n" + 
            "Nombre: " + arrayStudents[i].fullName + "\n" + 
            "Edad: " + arrayStudents[i].age + "\n" + 
            "Dirección: " + arrayStudents[i].address + "\n" + 
            "Telefono: " + arrayStudents[i].phone + "\n" + 
            "Año escolar: " + arrayStudents[i].yearSchool + "\n" + 
            "Valor Pension: " + arrayStudents[i].pensionValue);
        }
        /*System.out.println("Marca 1 si es estudiante o 2 si es administrativo:");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("Ingresaras a un Estudiante");
        } else if (n == 2) {
            System.out.println("Ingresaras a un Administrativo");
        } else {
            System.out.println("El número ingresado no es correcto");
        }*/

    }
}
