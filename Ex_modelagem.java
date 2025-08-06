import java.util.ArrayList;

public class Ex_modelagem {
    public static void main(String args[]) {
        System.out.println(fatorial(3));
        System.out.println(somatorio(0));
        System.out.println(fibon(6));
        System.out.println(double_somatorio(1, 6));
        System.out.println(pal("pooiioop"));
        System.out.println(convBase2(8));
    }

    /*
     * Assinatura: int fatorial(int n)
     * 
     * retorna o fatorial de um número N inteiro
     * 
     * 
     * Casos base:
     * f(1) = 1
     * f(2) = 2 * 1 = 2
     * f(3) = 3 * 2 * 1 = 6
     * 
     */
    public static int fatorial(int n) throws IllegalArgumentException {
        if (n == 0)
            return 1;
        else if (n < 0)
            throw new IllegalArgumentException();
        else
            return n * fatorial(n - 1);
    }

    /*
     * Assinatura: int somatorio (int n)
     * 
     * retorna o somatorio de um número N até 0
     * 
     * se número for maior que 0:
     * diminui e repete até 0;
     * 
     * se menor que 0:
     * soma 1 e repete até 0;
     * 
     * Casos base:
     * somatorio(5) = 5-1 -> 4-1 -> 3-1 -> 2-1 -> 1-1 -> 0
     * somatorio(-5) = 5-1 -> 4-1 -> 3-1 -> 2-1 -> 1-1 -> 0
     */
    public static int somatorio(int n) {
        if (n > 0)
            return somatorio(n - 1);
        if (n < 0)
            return somatorio(n + 1);
        else
            return 0;
    }

    /*Assinatura: int fibon(int n)
     * 
     * retorna a sequencia de fibonnaci até N
     * 
     * se menor que 0:
     * retorna 0
     * 
     * se igual a 1:
     * retorna 1
     * 
     * se não:
     * continua a recursão com fibon(n-1) + fibon(n-2)
     * 
     * Casos base:
     * fibon(1) = 1
     * fibon(2) = 1
     * fibon(3) = fibon(2) + fibon(1) = 1 + 1 = 2
     * fibon(4) = fibon(3) + fibon(2) = 2 + 1 = 3
     * fibon(5) = fibon(4) + fibon(3) = 3 + 2 = 5
     */
    public static int fibon(int n) {
        if (n <= 0)
            return 0;
        if (n == 1)
            return 1;
        else
            return fibon(n - 1) + fibon(n - 2);
    }

    public static int double_somatorio(int k, int j) {
        if (k < j)
            return k + double_somatorio(k + 1, j);
        if (k > j)
            return double_somatorio(j, k);
        else
            return 0;
    }

    /*
     * Assinatura: boolean pal(string s)
     * 
     * caso base:
     * pal length <= 1
     * retorna true
     * 
     * 
     */
    public static boolean pal(String s) {
        if (s.length() <= 1)
            return true;
        if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;
        return pal(s.substring(1, s.length() - 1));
    }

    /*
     * Assinatura: String convBase(int n)
     * 
     * caso base:
     * se n == 0
     * return 0
     * 
     * se n == 1
     * return 1
     */
    public static String convBase2(int n) {
        if (n == 0)
            return "0";
        if (n == 1)
            return "1";
        return (convBase2(n / 2) + (n % 2));

    }

    public static int somatorioArray(ArrayList<Integer> lista, int i) {
        return 0;
    }
}
