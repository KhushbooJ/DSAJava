package main.java.puzzles;

public class WordSearchMatrix {

    public static void main(String[] args) {
        String[][] board = {{"A","B","C","E"},{"S","F","C","S"},{"A","D","E","E"}};
        String word = "ESCES";
        boolean isPresent = true;
        int k=0;
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                if(board[i][j].equals(String.valueOf(word.charAt(k)))) {
                    int x=i; int y=j;
                    while(k < word.length() - 1) {
                        String nextLetter = String.valueOf(word.charAt(k+1));
                        k++;

                        //letter to right
                        if((y+1 < board[0].length && board[x][y+1].equals(nextLetter))) {
                            y++;
                        } else if ((y-1 >=0 && board[x][y-1].equals(nextLetter))) {
                            y--;
                        } else if((x+1 < board.length && board[x+1][y].equals(nextLetter))) {
                            x++;
                        } else if ((x-1 >= 0 && board[x-1][y].equals(nextLetter))) {
                            x--;
                        } else {
                            isPresent = false;
                        }
                    }

                }
            }
        }
        System.out.println(isPresent);
    }
}
