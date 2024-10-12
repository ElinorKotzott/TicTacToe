import java.util.Objects;
import java.util.Scanner;

public class Logic {
    Scanner scanner = new Scanner(System.in);

    boolean isPlayerTwosTurn = false;
    boolean isOneGamePlayed = false;


    public void beforeTheGame(Board board) {
        if (!isOneGamePlayed) {
            System.out.println("Welcome to TicTacToe. Type numbers 1 to 9 as shown in the picture to set your marker. \nPlayer one will be represented by x, player two will be represented by o.");
            board.drawBoard();
        } else {
            System.out.println("Good job! Do you want to play again?");
        }
        while (true) {
            if (!isOneGamePlayed) {
                System.out.println("Do you want to start a game? Press 'c' to confirm");
            } else {
                System.out.println("Press 'c' to confirm");
            }
            String input = scanner.nextLine();
            if ("c".equalsIgnoreCase(input)) {
                board.emptyBoard();
                board.drawBoard();
                playGame(board);
            }
        }
    }


    public void playGame(Board board) {

        while (true) {
            if (!isPlayerTwosTurn) {
                System.out.println("Player one, enter a number!");
            } else {
                System.out.println("Player two, enter a number!");
            }
            String input = scanner.nextLine();
            if ((!Objects.equals(input, "1")) && (!Objects.equals(input, "2")) && (!Objects.equals(input, "3")) && (!Objects.equals(input, "4"))
                    && (!Objects.equals(input, "5")) && (!Objects.equals(input, "6")) && (!Objects.equals(input, "7")) && (!Objects.equals(input, "8")) && (!Objects.equals(input, "9"))) {
                continue;
            }


            //TODO: Method!
            /*
            if (Objects.equals(board.boardArray[0][0], " ")) {
                        if (!isPlayerTwosTurn) {
                            board.boardArray[0][0] = "x";
                            checkWin(isPlayerTwosTurn, board);
                            isPlayerTwosTurn = true;
                        } else {
                            board.boardArray[0][0] = "o";
                            checkWin(isPlayerTwosTurn, board);
                            isPlayerTwosTurn = false;
                        }
                        break;
                    }
                    System.out.println("That slot is already taken, please enter a different number!");
                    break;
             */

            switch (input) {
                case "1":
                    if (Objects.equals(board.boardArray[0][0], " ")) {
                        if (!isPlayerTwosTurn) {
                            board.boardArray[0][0] = "x";
                            checkWin(isPlayerTwosTurn, board);
                            isPlayerTwosTurn = true;
                        } else {
                            board.boardArray[0][0] = "o";
                            checkWin(isPlayerTwosTurn, board);
                            isPlayerTwosTurn = false;
                        }
                        break;
                    }
                    System.out.println("That slot is already taken, please enter a different number!");
                    break;

                case "2":
                    if (Objects.equals(board.boardArray[0][1], " ")) {
                        if (!isPlayerTwosTurn) {
                            board.boardArray[0][1] = "x";
                            checkWin(isPlayerTwosTurn, board);
                            isPlayerTwosTurn = true;
                        } else {
                            board.boardArray[0][1] = "o";
                            checkWin(isPlayerTwosTurn, board);
                            isPlayerTwosTurn = false;
                        }
                        break;

                    }
                    System.out.println("That slot is already taken, please enter a different number!");
                    break;

                case "3":
                    if (Objects.equals(board.boardArray[0][2], " ")) {
                        if (!isPlayerTwosTurn) {
                            board.boardArray[0][2] = "x";
                            checkWin(isPlayerTwosTurn, board);
                            isPlayerTwosTurn = true;
                        } else {
                            board.boardArray[0][2] = "o";
                            checkWin(isPlayerTwosTurn, board);
                            isPlayerTwosTurn = false;
                        }
                        break;
                    }
                    System.out.println("That slot is already taken, please enter a different number!");
                    break;

                case "4":
                    if (Objects.equals(board.boardArray[1][0], " ")) {
                        if (!isPlayerTwosTurn) {
                            board.boardArray[1][0] = "x";
                            checkWin(isPlayerTwosTurn, board);
                            isPlayerTwosTurn = true;
                        } else {
                            board.boardArray[1][0] = "o";
                            checkWin(isPlayerTwosTurn, board);
                            isPlayerTwosTurn = false;
                        }
                        break;
                    }
                    System.out.println("That slot is already taken, please enter a different number!");
                    break;

                case "5":
                    if (Objects.equals(board.boardArray[1][1], " ")) {
                        if (!isPlayerTwosTurn) {
                            board.boardArray[1][1] = "x";
                            checkWin(isPlayerTwosTurn, board);
                            isPlayerTwosTurn = true;
                        } else {
                            board.boardArray[1][1] = "o";
                            checkWin(isPlayerTwosTurn, board);
                            isPlayerTwosTurn = false;
                        }
                        break;
                    }
                    System.out.println("That slot is already taken, please enter a different number!");
                    break;

                case "6":
                    if (Objects.equals(board.boardArray[1][2], " ")) {
                        if (!isPlayerTwosTurn) {
                            board.boardArray[1][2] = "x";
                            checkWin(isPlayerTwosTurn, board);
                            isPlayerTwosTurn = true;
                        } else {
                            board.boardArray[1][2] = "o";
                            checkWin(isPlayerTwosTurn, board);
                            isPlayerTwosTurn = false;
                        }
                        break;
                    }
                    System.out.println("That slot is already taken, please enter a different number!");
                    break;

                case "7":
                    if (Objects.equals(board.boardArray[2][0], " ")) {
                        if (!isPlayerTwosTurn) {
                            board.boardArray[2][0] = "x";
                            checkWin(isPlayerTwosTurn, board);
                            isPlayerTwosTurn = true;
                        } else {
                            board.boardArray[2][0] = "o";
                            checkWin(isPlayerTwosTurn, board);
                            isPlayerTwosTurn = false;
                        }
                        break;
                    }
                    System.out.println("That slot is already taken, please enter a different number!");
                    break;

                case "8":
                    if (Objects.equals(board.boardArray[2][1], " ")) {
                        if (!isPlayerTwosTurn) {
                            board.boardArray[2][1] = "x";
                            checkWin(isPlayerTwosTurn, board);
                            isPlayerTwosTurn = true;
                        } else {
                            board.boardArray[2][1] = "o";
                            checkWin(isPlayerTwosTurn, board);
                            isPlayerTwosTurn = false;
                        }
                        break;
                    }
                    System.out.println("That slot is already taken, please enter a different number!");
                    break;

                case "9":
                    if (Objects.equals(board.boardArray[2][2], " ")) {
                        if (!isPlayerTwosTurn) {
                            board.boardArray[2][2] = "x";
                            checkWin(isPlayerTwosTurn, board);
                            isPlayerTwosTurn = true;
                        } else {
                            board.boardArray[2][2] = "o";
                            checkWin(isPlayerTwosTurn, board);
                            isPlayerTwosTurn = false;
                        }
                        break;
                    }
                    System.out.println("That slot is already taken, please enter a different number!");
                    break;

                default:
                    break;
            }
            board.drawBoard();
        }
    }

    //TODO: You need 3 methods, one checks for diagonal wins, one for row wins one for column wins. If either return true, you get in here
    public void checkWin(boolean isPlayerTwosTurn, Board board) {

        if(checkRowWin(board.boardArray) || checkColumnWin(board.boardArray) || checkDiagonalWin(board.boardArray)) {
            if (!isPlayerTwosTurn) {
                board.drawBoard();
                System.out.println("Congrats, player one, you won!");
                isOneGamePlayed = true;
                beforeTheGame(board);
            } else {
                board.drawBoard();
                System.out.println("Congrats, player two, you won!");
                isOneGamePlayed = true;
                beforeTheGame(board);
            }
        } else {
            for (int i = 0; i < board.boardArray.length; i++) {
                for (int j = 0; j < board.boardArray[i].length; j++) {
                    if (Objects.equals(board.boardArray[i][j], " ")) {
                        return;
                    }
                }
            }
            System.out.println("Nobody won!");
            isOneGamePlayed = true;
            beforeTheGame(board);
        }

    }

    public boolean checkRowWin(String[][] boardArray) {

        for (int i = 0; i < boardArray.length; i++) {
            int numberOfX = 0;
            int numberOfO = 0;
            for (int j = 0; j < boardArray[i].length; j++) {
                if (boardArray[i][j] == "x") {
                    numberOfX++;
                }
                if (boardArray[i][j] == "o") {
                    numberOfO++;
                }
            }
            if (numberOfO == 3 || numberOfX == 3) {
                return true;
            }
        }

        return false;
    }

    public boolean checkColumnWin(String[][] boardArray) {
        for (int i = 0; i < boardArray[0].length; i++) {
            int numberOfX = 0;
            int numberOfO = 0;
            for (int j = 0; j < boardArray.length; j++) {
                if (boardArray[j][i] == "x") {
                    numberOfX++;
                }
                if (boardArray[j][i] == "o") {
                    numberOfO++;
                }
            }
            if (numberOfO == 3 || numberOfX == 3) {
                return true;
            }
        }
        return false;
    }

    public boolean checkDiagonalWin(String[][] boardArray) {
        int numberOfX = 0;
        int numberOfO = 0;
        for (int i = 0; i < boardArray[0].length; i++) {
            if (boardArray[i][i] == "x") {
                numberOfX++;
            }
            if (boardArray[i][i] == "o") {
                numberOfO++;
            }
        }

        if (numberOfO == 3 || numberOfX == 3) {
            return true;
        }

         numberOfX = 0;
         numberOfO = 0;

        for (int j = 0; j < boardArray.length; j++) {
            if (boardArray[j][boardArray.length - j - 1] == "x") {
                numberOfX++;
            }
            if (boardArray[j][boardArray.length - j - 1] == "o") {
                numberOfO++;
            }
        }
        if (numberOfO == 3 || numberOfX == 3) {
            return true;
        }
        return false;
    }

}

//
