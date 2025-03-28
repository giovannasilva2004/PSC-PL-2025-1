public class Operadores{
    public static void main(String[] args){
        //operadores aritiméticos
        int a = 10;
        int b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a%b); //modulo (sobra na divisão)

        //operadores de comparação
        int c = 20;
        int d = 15;
        System.out.println(c==d);
        System.out.println(c!=d);
        System.out.println(c>d); 
        System.out.println(c<d);
        System.out.println(c>=d);
        System.out.println(c<=d);

        //operadores lógicos 
        boolean e = true;
        boolean f = false;
        System.out.println(e && f);
        System.out.println(e || f);
        System.out.println(!e); //inverte o valor de e 
        

        //operadores de atribuição
        int g = 10;
        
        g+=5; // g = g + 5 = 15
        g-=5; // g = g - 5 = 5
        g/=5; // g = g / 5 = 2
        g*=5; // g = g * 5 = 50
        g%=5; // g = g % 5 = 0




        System.out.println("olá mundo cruel");
    }
}