
package helper;

import java.util.Scanner;

public class InputHelper {
    
    private static final Scanner input = new Scanner(System.in);
    
    public static String inputString(String pesan) {
        while (true) {
            System.out.print(pesan);
            
            String data = input.nextLine().trim();
            
            if(!data.isEmpty()) {
                return data;
            }
            System.out.println("Input tidak boleh kosong!");
        }
    }
    public static int inputInteger(String pesan) {
        while (true) {
            System.out.print(pesan);
            
            try {
                int angka = Integer.parseInt(input.nextLine().trim());
                
                if (angka >= 0) {
                    return angka;
                }
                
                System.out.println("Angka tidak boleh negatif!");
                
            }catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
            }
        }
    }
    public static String inputKondisi() {
        
        while (true) {
            
            System.out.println("1. Baik");
            System.out.println("2. Cukup");
            System.out.println("3. Rusak");
            
            int pilihan = inputInteger("Pilih kondisi Fasilitas (1-3): ");

            switch (pilihan) {
                case 1:
                    return "Baik";
                case 2:
                    return "Cukup";
                case 3:
                    return "Rusak";
                default:
                    System.out.println("Pilihan kondisi tidak valid!");
            }
        }
    }
}
