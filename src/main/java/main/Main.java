
package main;

import controller.FasilitasController;
import view.FasilitasView;

public class Main {

    public static void main(String[] args) {
        
        FasilitasView view = new FasilitasView();
        FasilitasController controller = new FasilitasController(view);

        int pilihan;
        do {
            view.tampilkanJudul();
            view.tampilkanMenu();
            
            pilihan = view.pilihMenu();
            
            switch (pilihan) {
                case 1:
                    controller.tampilkanFasilitas();
                    break;
                case 2:
                    controller.tambahFasilitas();
                    break;
                case 3:
                    controller.hapusFasilitas();
                    break;
                case 4:
                    controller.updateFasilitas();
                    break;
                case 5:
                    view.tampilkanPesan("Program selesai. Terima kasih sudah menggunakan program ini!");
                    break;
                    
                default:
                    view.tampilkanPesan("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }
}
