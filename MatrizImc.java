public class MatrizImc {
    public static void main(String[] args) {
        MatrizImc matrizImc = new MatrizImc();
        matrizImc.executar();
    }

    public void executar(){
        double[][] dadosPessoas = new double[5][5];
        dadosPessoas[0][0] = 1;
        dadosPessoas[0][1] = 1.70;
        dadosPessoas[0][2] = 80;

        dadosPessoas[1][0] = 2;
        dadosPessoas[1][1] = 1.72;
        dadosPessoas[1][2] = 90;

        dadosPessoas[2][0] = 3;
        dadosPessoas[2][1] = 1.62;
        dadosPessoas[2][2] = 61;

        dadosPessoas[3][0] = 4;
        dadosPessoas[3][1] = 1.90;
        dadosPessoas[3][2] = 84;

        dadosPessoas[4][0] = 5;
        dadosPessoas[4][1] = 1.53;
        dadosPessoas[4][2] = 49;

        double mediaAltura = 0;
        double mediaPeso = 0;
        double maisAlta = dadosPessoas[0][1];
        double maisBaixa = dadosPessoas[0][1];
        double maisPesada = dadosPessoas[0][2];
        double maisLeve = dadosPessoas[0][2];

        
        for(int i=0; i < 5; i++){
            double nome = dadosPessoas[i][0];
            double altura = dadosPessoas[i][1];
            double peso = (int) dadosPessoas[i][2];
            double imc = (altura * altura)/ peso;
            System.out.println("");
            System.out.printf("A pessoa %.1f tem o IMC = %.2f. ", nome, imc);
        }

        for(int i=0; i< dadosPessoas.length; i++){
            double altura = dadosPessoas[i][1];
            mediaAltura += altura/5;
            System.out.println("");
        }
        System.out.printf("A média aritmética das alturas é de: %f", mediaAltura);
    
        for(int i=0; i<dadosPessoas.length; i++){
            double peso = dadosPessoas[i][2];
            mediaPeso += peso/5;
            System.out.println("");
        }
        System.out.printf("A média aritmética dos pesos é de: %f", mediaPeso);
        System.out.println("");

        for(int i=0; i<dadosPessoas.length; i++){
            if (dadosPessoas[i][1] > maisAlta) {
                maisAlta = dadosPessoas[i][1];
            }
            if (dadosPessoas[i][1] < maisBaixa) {
                maisBaixa = dadosPessoas[i][1];
            }
            if (dadosPessoas[i][2] > maisPesada) {
                maisPesada = dadosPessoas[i][2];
            }
            if (dadosPessoas[i][2] < maisLeve) {
                maisLeve = dadosPessoas[i][2];
            }
        }

        System.out.println("A pessoa mais alta tem: " + maisAlta);
        System.out.println("A pessoa mais baixa tem: " + maisBaixa);
        System.out.println("A pessoa mais pesada tem: " + maisPesada);
        System.out.println("A pessoa mais leve tem: " + maisLeve);
    }
}


// A média aritmética de altura
// A média aritmética de peso
// O nome e IMC de cada uma das pessoas
// O nome da pessoa mais alta e sua altura
// O nome da pessoa mais baixa e sua altura
// O nome da pessoa mais pesada e seu peso
// O nome da pessoa mais leve e seu peso
// O nome da pessoa com o maior IMC e seu valor
// O nome da pessoa com o menor IMC e seu valor
// Considere o cálculo do IMC como: IMC = (altura * altura) / peso

