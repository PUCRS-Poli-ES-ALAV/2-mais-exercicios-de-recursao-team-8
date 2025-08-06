public class Ex_modelagem {
    public static void main(String args[]){
        System.out.println(fatorial(3));
        System.out.println(somatorio(0));
        System.out.println(fibon(6));
        System.out.println(double_somatorio(1,6));
    }
    /*
     * Assinatura: int fatorial(int n)
     * retorna o fatorial de um número inteiro 
     * 
     * Casos base:
     * f(1) = 1
     * f(2) = 2
     * 
    */
    public static int fatorial(int n) throws IllegalArgumentException{
        if(n == 0)
        return 1;
        else if(n < 0)
        throw new IllegalArgumentException();
        else
        return n * fatorial(n-1);
    }

    public static int somatorio(int n){
        if(n > 0)
        return somatorio(n-1);
        if(n < 0)
        return somatorio(n+1);
        else
        return 0;
    }

    public static int fibon(int n){
        if(n <= 0)
        return 0;
        if(n == 1)
        return 1;
        else
        return fibon(n-1) + fibon(n-2);
    }

    public static int double_somatorio(int k, int j){
        if(k<j)
        return k + double_somatorio(k+1, k);
        if(k>j)
        return double_somatorio(j, k);
        else
        return 0;
    }

    public static boolean pal(String s){
        
        return false;
    }
}

