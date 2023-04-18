package Ejercicio2;

import java.util.Scanner;

public class ToyPrincipal {
    public static void main(String[] args) {
        String opc = "1";
        ToyRepository repo = new ToyRepositoryImpl();
        do {
            Scanner s = new Scanner(System.in);
            System.out.print("Menu \n 1. Agregar  \n 2. Listar \n 3. Editar " +
                    "\n 4. Eliminar  \n 5. Salir \n =>");
            opc = s.next();
            switch (opc){
                case "1": {
                    System.out.println("Product Id: ");
                    Integer Id = s.nextInt();
                    System.out.println("Toy name: ");
                    String Name = s.next();
                    System.out.println("Toy Category");
                    String Category = s.next();
                    int Price = s.nextInt();
                    System.out.println("Quantity: ");
                    double Quantity = s.nextDouble();
                    repo.save(new Toy(Id,Name,Price,Quantity));
                    break;
                }
            }  case  "2"
        }
    }

}
