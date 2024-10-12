public class Board {
    int yyy;
    String[][] boardArray = new String[3][3];

    public Board() {
        int value = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boardArray[i][j] = String.valueOf(value);
                value++;
            }
        }
    }


    public void drawBoard() {
        System.out.println(boardArray[0][0] + "  | " + boardArray[0][1] + " |  " + boardArray[0][2]);
        System.out.println("___|___|___");
        System.out.println(boardArray[1][0] + "  | " + boardArray[1][1] + " |  " + boardArray[1][2]);
        System.out.println("___|___|___ ");
        System.out.println(boardArray[2][0] + "  | " + boardArray[2][1] + " |  " + boardArray[2][2]);

    }

    public void emptyBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boardArray[i][j] = boardArray[i][j] = " ";
            }
        }
    }
}
