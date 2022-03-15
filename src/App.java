import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // Aqui se crea el objeto estudiante
        Students student1 = new Students(0, "Carlos Alonso", 14, "Calle 23 5 42", "3112063020", 2022, 300000, "Mañana",
                "Publico");
        Students student2 = new Students(1, "Daniela Lopez", 13, "Calle 5 17 30", "3104225025", 2022, 300000, "Tarde",
                "Bicicleta");
        Students student3 = new Students(2, "Sofia Lara", 14, "Calle 50 2 20", "3125429746", 2022, 300000, "Noches",
                "Carro");

        // Aqui se crea el objeto Administrativo
        Admin admin1 = new Admin(0, "Brayan Martinez", 26, "Calle 80 Bis Sur 94 21", "3112063020", "Programacion",
                "Indefinido", "Mañanita", "Patineta");
        Admin admin2 = new Admin(1, "Diego Burgos", 25, "Calle 17 a sur 5 42", "3146560105", "Reciclador", "Obra/Labor",
                "Noche", "Triciclo");
        Admin admin3 = new Admin(2, "Daiana Diaz", 99, "Calle 114 27 41", "3213210478", "Psicologo", "Fijo", "Noche",
                "Caballo");

        Students[] arrayStudents = { student1, student2, student3 };
        Admin[] arrayAdmin = { admin1, admin2, admin3 };

        System.out.println("Bienvenidos al registro de Estudiantes y administrativos: \n");
        System.out.println("Datos estudiantes");
        for (int i = 0; i < arrayStudents.length; i++) {
            System.out.println("los datos son: \n" +
                    arrayStudents[i].imprimir());
        }

        System.out.println("\n Datos Adminitrativos");
        for (int i = 0; i < arrayAdmin.length; i++) {
            System.out.println("los datos son: \n" +
                    arrayAdmin[i].imprimir());
        }

        System.out.println("\n Marca 1 si es estudiante o 2 si es administrativo:");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("Consulta horario marcando 1 o 2 para consultar transporte");
            int x = sc.nextInt();
            if (x == 1) {
                for (int i = 0; i < arrayStudents.length; i++) {
                    System.out.println("El horario de " + arrayStudents[i].fullName + " es: \n" +
                            arrayStudents[i].horario());
                }
            } else if (x == 2) {
                for (int i = 0; i < arrayStudents.length; i++) {
                    System.out.println("el transportes de " + arrayStudents[i].fullName + " es: \n" +
                            arrayStudents[i].transporte());
                }
            } else {
                System.out.println("El número ingresado no es correcto");
            }
        } else if (n == 2) {
            System.out.println("Consulta horario marcando 1 o 2 para consultar transporte");
            int x = sc.nextInt();
            if (x == 1) {
                for (int i = 0; i < arrayAdmin.length; i++) {
                    System.out.println("El horario de " + arrayAdmin[i].fullName + " es: \n" +
                            arrayAdmin[i].horario());
                }
            } else if (x == 2) {
                for (int i = 0; i < arrayAdmin.length; i++) {
                    System.out.println("el transportes de " + arrayAdmin[i].fullName + " es: \n" +
                            arrayAdmin[i].transporte());
                }
            } else {
                System.out.println("El número ingresado no es correcto");
            }
        } else {
            System.out.println("El número ingresado no es correcto");
        }

    }
}
