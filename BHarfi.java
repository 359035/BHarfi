/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bharfi;

/**
 *
 * @author Samsung
 */
public class BHarfi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] desen = new String[7][4];

        for (int i = 0; i < desen.length; i++) {
            for (int j = 0; j < desen[i].length; j++) {
                if (i == 0 || i == 3||i==6) {
                    desen[i][j] = "*";
                } else if (j == 0 || j == 3) {
                    desen[i][j] = "*";
                } else {
                    desen[i][j] = " ";
                }
            }
        }

        for (String[] row : desen) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }

    }

}
