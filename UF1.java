import java.util.Scanner;


public class UF1 {

    static Scanner scan = new Scanner(System.in);

    public static void main(final String[] args) {
        //moneda();
        //dau();
        //numero();
        //centenas();
        //numCaract();
        //separarDecim();
        //enterONo();
        //esNumPositiuONegatiuANDEnterOReal();
        //Numerosistrings();
        //Curiositatmatematica();
    }

    public static void moneda() {
        int cara = 0;
        int creu = 0;
        int cc;


        for (int i = 0; i < 10; i++) {
            cc = (int) (Math.random() * 2);
            if (cc == 0) ++cara;
            else creu++;
        }

        System.out.println("Cara: " + cara + " o " + cara * 10 + "%");
        System.out.println("Creu: " + creu + " o " + creu * 10 + "%");
    }

    public static void dau() {
        int dau = 0, num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0;

        for (int i = 0; i < 1000000; i++) {
            dau = (int) (Math.random() * 6);
            switch (dau) {
                case 1: ++num1; break;
                case 2: ++num2; break;
                case 3: ++num3; break;
                case 4: ++num4; break;
                case 5: ++num5; break;
                case 6: ++num6; break;
            }
        }
        System.out.printf("Numero 1: %.2f %% \n", ((float) num1 / 10000));
        System.out.printf("Numero 2: %.2f %% \n", ((float) num1 / 10000));
        System.out.printf("Numero 3: %.2f %% \n", ((float) num1 / 10000));
        System.out.printf("Numero 4: %.2f %% \n", ((float) num1 / 10000));
        System.out.printf("Numero 5: %.2f %% \n", ((float) num1 / 10000));
        System.out.printf("Numero 6: %.2f %% \n", ((float) num1 / 10000));
    }

    public static void numero() {
        int num = 1234567890;
        String r = "";

        do {
            r= (num % 10) + r;
            num /= 10;
        } while (num > 0);
        //System.out.println(r);

    }

    public static void centenas() {
    int n =1234567890;
    String num = Integer.toString(n);
    int l = num.length();
    String r = "";
    int nc=num.length() -1;



        for (int i= 0; i < 3;++i){
           // r= num.charAt(nc);
                    --nc;
        }
    }

    public static void numCaract(){
        double n= -14587.552454;
        String s= "" + n;
        int l= s.length();
        boolean esReal;
        boolean esNegatiu;

        if(s.charAt(0) == '-') esNegatiu=true;
        else esNegatiu = false;
        //esNegatiu = s.charAt(0) == '-';


        if (esNegatiu = true) System.out.println("Es negatiu");
        if (esReal = true) System.out.println("Es real");
    }

    public static void separarDecim() {
        double n= 123.456;
        String s = "" + n;
        String enter = "";
        String decimal = "";
        int ndx= s.indexOf('.');

    }
    public static void enterONo() {
        double n=  1234.990;
        String s = "" + n;
        boolean real = true;
        int punts=0;

        if(s.charAt(0) == '-' || s.charAt(0) == '+')
            s= s.substring(1);

        for (int i= 0; i < s.length(); ++i){
            if(s.charAt(i) == '.')++punts;
            else if (s.charAt(i) < '0' || s.charAt(i) > '9') real =false;
            }
        if(punts > 1) real=false;

        if (real) System.out.println("Es entre");
        else System.out.println("No es entre");
    }


    public static void esNumPositiuONegatiuANDEnterOReal(){
        int n =-1234;
        String s = "" + n;
        boolean positiu = true,negatiu = true,enter = true,real = true;

//Elimina espais,+,-...

        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            s = s.substring(1);
            if (s.charAt(0) == '+') negatiu = true;
        }





//Escriu una frase depenent de la condicio
    if (enter){
        int valor= Integer.parseInt(s);
        if(negatiu) valor = -valor;
    }
    }

    public static void Numerosistrings() {
        String s = "123.456";
        boolean esNegatiu = false;
        boolean esPositiu = false;
        boolean esReal = false;
        boolean esZero = false;
        char c;
        int i = 0;
        int ndx = -1;
        int punts = 0;
        int l = s.length();
    }

        public static void Curiositatmatematica() {
            int n;
        for (int i = 1; i <= 9; ++i) {
            n = (i * 100 + i * 10 + i) / (i + i + i);
            System.out.println("Dígit " + i + ": " + n);
        }
    }






