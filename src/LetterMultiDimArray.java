public class LetterMultiDimArray {

    public static void main(String[] args) {
        String[][] letterB = new String[7][4];


        for (int i = 0; i < letterB.length; i++) {          //İlk bakışta göze farklı gelebilir kod. 1. ,4. ,7. satırda
            for (int j = 0; j < letterB[i].length ; j++) {  //3 yıldız kullanınca göze daha çok B gibi göründü.
                    if(i==0||i==3||i==6) {                  //                   ÇIKTISI
                        if (j != 3) {                      // *  *  *
                            letterB[i][j] = " * ";         // *        *
                        }else{                             // *        *
                            letterB[i][j] = "   ";         // *  *  *
                        }                                  // *        *
                    }else{                                 // *        *
                        if(j==0||j==3){                    // *  *  *
                            letterB[i][j] = " * ";
                        }else{
                            letterB[i][j] = "   ";
                        }
                    }
            }
        }
        for (String[] row : letterB){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }


    }
}
