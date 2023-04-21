public class App {
    public static void main(String[] args) throws Exception {
                                        /* VETORES */
        int[] v10 = new int[10];  //a quantidade de reserva de memória que ele ira ter será 10;
        v10[4] = 10;  //para buscar uma posição exata basta indicar um índice;
        // o índice começa do 0, ou seja, dado um vetor [1, 2, 3, 4], o índice 0 seria o número 1;

                                        /* MATRIZES */
        int[][] matriz = new int[5][5];
        matriz[2][2] = 10;

        System.out.println(v10[4]);
        System.out.println(matriz[2][2]);
    }
}
