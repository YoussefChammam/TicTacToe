import java.util.Arrays;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("please enter case name you desire to fill.");
        String A1 = "-";
        String A2 = "-";
        String A3 = "-";
        String B1 = "-";
        String B2 = "-";
        String B3 = "-";
        String C1 = "-";
        String C2 = "-";
        String C3 = "-";
        String[] firstRow = {A1, A2, A3};
        String[] secondRow = {B1, B2, B3};
        String[] thirdRow = {C1, C2, C3};
        String[][] Grille = {firstRow, secondRow, thirdRow};
 

        int playerturn = 1;
        boolean gameISON = true;
        boolean allfull = false;
        XOrO Player1 = new XOrO();

        while (gameISON) {
            int vide = 10;
            int assigningp1 = Player1.XorO();
            int i = assigningp1 / 10;
            int j = assigningp1 % 10;
            if (playerturn == 1) {
                Grille[i][j] = "x";
                playerturn = 2;
            } else {
                Grille[i][j] = "o";
                playerturn = 1;
            }
            for (int ab = 0; ab < firstRow.length ; ab++) {
                for (int bc = 0; bc < Grille.length; bc++) {
                    if (!Grille[ab][bc].equals("-")) {
                        vide -= 1;
                    }
                    if (vide == 0) {
                        allfull = true;
                    }
                }
            }
                boolean hori1 = ((Grille[0][0].equals(Grille[0][1]) && Grille[0][0].equals(Grille[0][2])) && !Grille[0][0].equals("-"));
                boolean hori2 = ((Grille[1][0].equals(Grille[1][1]) && Grille[1][0].equals(Grille[1][2])) && !Grille[1][0].equals("-"));
                boolean hori3 = ((Grille[2][0].equals(Grille[2][1]) && Grille[2][1].equals(Grille[2][2])) && !Grille[2][0].equals("-"));
                boolean verti1 = ((Grille[0][0].equals(Grille[1][0]) && Grille[1][0].equals(Grille[2][0])) && !Grille[1][0].equals("-"));
                boolean verti2 = ((Grille[0][1].equals(Grille[1][1]) && Grille[1][1].equals(Grille[2][1])) && !Grille[1][1].equals("-"));
                boolean verti3 = ((Grille[0][2].equals(Grille[1][2]) && Grille[1][2].equals(Grille[2][2])) && !Grille[1][2].equals("-"));
                boolean diago1 = ((Grille[0][0].equals(Grille[1][1]) && Grille[1][1].equals(Grille[2][2])) && !Grille[1][1].equals("-"));
                boolean diago2 = ((Grille[0][2].equals(Grille[1][1]) && Grille[1][1].equals(Grille[2][0])) && !Grille[1][1].equals("-"));
            gameISON = !hori1 && !hori2 && !hori3 && !verti1 && !verti2 && !verti3 && !diago1 && !diago2;

            System.out.println(Arrays.deepToString(Grille[0]));
            System.out.println("----------------");
            System.out.println(Arrays.deepToString(Grille[1]));
            System.out.println("----------------");
            System.out.println(Arrays.deepToString(Grille[2]));

            }


        System.out.println(" player " + playerturn + " lost !");
        if (allfull){
                System.out.println("it's a tie !");
            }
        }
    }
