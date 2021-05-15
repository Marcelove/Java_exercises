
public class Asics {

    public static void main (String[] args){

        int[] intArray1 = new int[]{1, 3, 15, 11, 2}; 
        int[] intArray2 = new int[]{23, 127, 235, 19, 8}; 

       
        menorDiferenca(intArray1, intArray2);

    }

    public static void menorDiferenca (int[] intArray1, int[] intArray2) {

        int a = 0;
        int b = 0;
        int flag = 0;
        int candidato1 = 0;
        int candidato2 = 0;
        int menorDiferencaAtual = 0;

        for (a = 0; a < 5; a++) {

            for (b = 0; b < 5; b++){

                if ((intArray1[a] - intArray2[b]) >= 0){
                    menorDiferencaAtual = intArray1[a] - intArray2[b];
                    candidato1 = intArray1[a];
                    candidato2 = intArray2[b];
                    flag = 1;
                    break;
                }

            }
        }

        if (flag == 0){
            System.out.println("Im sorry. You gave me some numbers that I cant work with. Probably they are all negative");
            return;
        }


        for (a = 0; a < 5; a++) {

            for (b = 0; b < 5; b++){

                if((a == 0) && (b == 0)){

                    if ((intArray1[a] - intArray2[b]) >= 0){
                        menorDiferencaAtual = intArray1[a] - intArray2[b];
                        candidato1 = intArray1[a];
                        candidato2 = intArray2[b];
                    }
                }

                else {

                    if ((intArray1[a] - intArray2[b]) >= 0){

                        if ((intArray1[a] - intArray2[b]) < menorDiferencaAtual){

                            menorDiferencaAtual = intArray1[a] - intArray2[b];
                            candidato1 = intArray1[a];
                            candidato2 = intArray2[b];
                        }
                    }
                }

            }
        }

        //output: 3. That is, the pair (11,8).

        System.out.println(menorDiferencaAtual + ". That is, the pair (" + candidato1 + "," + candidato2 + ").");
    }

}