import java.util.Scanner;
public class TestaData {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);
        int d, m, a;

        System.out.println("Inicialização sem parâmetros");
        Data data = new Data();
        System.out.println("Método retDia: "+ data.retDia());
        System.out.println("Método retMes: "+ data.retMes());
        System.out.println("Método retAno: "+ data.retAno());

        System.out.println("Inicialização com parâmetros ");
        System.out.println("Digite o dia, o mês e o ano: ");
        Data data2 = new Data(ler.nextInt(), ler.nextInt(), ler.nextInt());
        System.out.println("Método retDia: "+ data.retDia());
        System.out.println("Método retMes: "+ data.retMes());
        System.out.println("Método retAno: "+ data.retAno());

        System.out.println("Métodos para atribuição ");
        System.out.print("entraDia: ");
        data.entraDia();

        System.out.print("entraMes: ");
        data.entraMes();

        System.out.print("entraAno: ");
        data.entraAno();

        System.out.println("Método retDia: " + data.retDia());
        System.out.println("Método retMes: " + data.retMes());
        System.out.println("Método retAno: " + data.retAno());

        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println("método que retorna em formato dd/mm/aaaa: " + data.mostra1());

        System.out.println();
        System.out.println("método que retorna em formato dd/mes_por_extensao/aaaa: " + data.mostra2());

        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println("método que retorna a quantidade de dias transcorridos no ano: " + data.diasTranscorridos());


        System.out.println();
        System.out.println("-----------------------------------------------------");
        data.apresentaDataAtual();

    }
}
