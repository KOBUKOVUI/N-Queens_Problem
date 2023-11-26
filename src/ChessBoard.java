public class ChessBoard {
    public char chessBoard [][];
    ChessBoard (){
        chessBoard = new char[8][8];
        for(int i = 0; i < 8; i ++){
            for(int j = 0; j < 8; j ++ ){
                chessBoard[i][j]= '0'; 
            }
        }
    }
    public void printTheChessBoard(){
        for (int i = 0; i < 8; i ++){
            for (int j = 0; j < 8; j ++){
                System.out.print(chessBoard[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public boolean validPlace( int R, int C){
        for(int i = 0; i < 8; i ++){
            if (chessBoard[R][i] == '1'){
                return false; 
            }
        }
        for(int i = 0; i < 8; i ++){
            if(chessBoard[i][C] == '1'){
                return false; 
            }
        }
        for (int i = R, j = C; j >= 0 && i >=0;  j--, i -- ){
            if(chessBoard[i][j] == '1'){
                return false; 
            }
        }
        for (int i = R, j = C; i >= 0 && j < 8; i --, j ++){
            if(chessBoard[i][j] == '1'){
                return false;
            }
        }
        return true; 
    }
    public void nQueenProblem (int R){
        if(R == 8 ){
            printTheChessBoard(); 
        }
        else{
            for (int i = 0; i < 8; i ++){
            if(validPlace(R, i)){
                chessBoard[R][i] = '1'; 
                nQueenProblem(R + 1);
                chessBoard[R][i] = '0'; 
                }
            }
        }
    }
}
