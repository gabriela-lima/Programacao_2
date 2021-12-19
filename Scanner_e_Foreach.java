import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String v = sc.nextLine();
    System.out.println(v);

    int i = sc.nextInt();
    System.out.println(i);
    //sc.Close(); //LEMBRAR DE FECHAR O SCANNER NO FINAL DO PROGRAMA (NAO É OBRIGATORIO)

    //FOREACH
    double[] hello = {1.2 , 1.5, 1.9};
    for(double element: hello)
    {
      System.out.println(element);
    }
  }
}
