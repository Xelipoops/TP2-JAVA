import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        //Protocolo de programación:
        // Agregar los ejercicios al switch con el numero correspondiente.
        // la idea es poder correrlos unos detras de otros, así que inicialicen las variables que vayan a usar en cada ejercicio (que no se vaya a romper poque ya traía un valor de otro ejercicio.)



        Scanner sc = new Scanner(System.in);

        System.out.print("ingrese un numero para dirigirse al ejercicio: ");
        int ejercicio = sc.nextInt();

        //definan todas las variables acá al principio y se reutilizan (les das un uso distinto en cada ejercicio.)
        int numero;
        int num1;
        int num2;
        int num3;
        double precio;
        String string1;
        String string2;
        String string3;
        char char1;





        switch (ejercicio)
        {


            case 3:
            {
                //Codifique un algoritmo que solicite el ingreso de un numero de 3 dígitos (100 -999)
                // y por medio del uso de las operaciones matemáticas módulo 10 y división
                //por 10 efectué la suma de los 3 dígitos del número.

                System.out.print("ingrese un numero:");
                numero = sc.nextInt();
                num1 = (numero / 10 / 10);
                num2 = (numero / 10 % 10);
                num3 = (numero % 10);
                numero = num1 + num2 + num3;
                System.out.print("la suma de " + num1 + " + " + num2 + " + " + num3 + " es " + numero);
                break;

            }
            case 4:
            {

                System.out.print("ingrese una cantidad de dinero: ");
                precio = sc.nextDouble();
                System.out.print("Usted tiene un total de: ");

                if (precio >= 200)
                {
                    num1 = (int) precio / 200;
                    precio = precio - (num1 * 200);
                    if (num1 == 1) {System.out.print( " " + num1 + " billete de 200;");}
                    else {System.out.print( " " + num1 + " billetes de 200;");}

                }
                if (precio >= 100)
                {
                    num1 = (int) precio / 100;
                    precio = precio - (num1 * 100);
                    if (num1 == 1) {System.out.print( " " + num1 + " billete de 100;");}
                    else {System.out.print( " " + num1 + " billetes de 100;");}

                }
                if (precio >= 50)
                {
                    num1 = (int) precio / 50;
                    precio = precio - (num1 * 50);
                    if (num1 == 1) {System.out.print( " " + num1 + " billete de 50;");}
                    else {System.out.print( " " + num1 + " billetes de 50;");}

                }
                if (precio >= 20)
                {
                    num1 = (int) precio / 20;
                    precio = precio - (num1 * 20);
                    if (num1 == 1) {System.out.print( " " + num1 + " billete de 20;");}
                    else {System.out.print( " " + num1 + " billetes de 20;");}

                }
                if (precio >= 10)
                {
                    num1 = (int) precio / 10;
                    precio = precio - (num1 * 10);
                    if (num1 == 1) {System.out.print( " " + num1 + " billete de 10;");}
                    else {System.out.print( " " + num1 + " billetes de 10;");}

                }
                if (precio >= 5)
                {
                    num1 = (int) precio / 5;
                    precio = precio - (num1 * 5);
                    if (num1 == 1) {System.out.print( " " + num1 + " billete de 5;");}
                    else {System.out.print( " " + num1 + " billetes de 5;");}

                }
                if (precio >= 2)
                {
                    num1 = (int) precio / 2;
                    precio = precio - (num1 * 2);
                    if (num1 == 1) {System.out.print( " " + num1 + " billete de 2;");}
                    else {System.out.print( " " + num1 + " billetes de 2;");}

                }
                if (precio >= 1)
                {
                    num1 = (int) precio;
                    precio = precio - (num1);
                    if (num1 == 1) {System.out.print( " " + num1 + " billete de 1;");}
                    else {System.out.print( " " + num1 + " billetes de 1;");}

                }
                if (precio < 1)
                {
                    string1 = String.valueOf(precio);
                    string3 = "00";
                    string1= string1 + string3;
                    string2 = string1.substring(2,4);
                    num2 = Integer.parseInt(string2);
                    if (num2 >= 50)
                    {
                        num1 = num2 / 50;
                        num2 = num2 - (num1 * 50);
                        System.out.print( " " + num1 + " moneda de 50;");

                    }
                    if (num2 >= 25)
                    {
                        num1 = num2 / 25;
                        num2 = num2 - (num1 * 25);
                        System.out.print( " " + num1 + " moneda de 25;");

                    }
                    if (num2 >= 10)
                    {
                        num1 = num2 / 10;
                        num2 = num2 - (num1 * 10);
                        if (num1 == 1) {System.out.print( " " + num1 + " moneda de 10;");}
                        else {System.out.print( " " + num1 + " monedas de 10;");}

                    }
                    if (num2 >= 5)
                    {
                        num1 = num2 / 5;
                        if (num1 == 1) {System.out.print( " " + num1 + " moneda de 5;");}
                        else {System.out.print( " " + num1 + " monedas de 5;");}

                    }

                }
                break;


            }
            case 5:
            {
                System.out.print("Ingrese un numero: ");
                numero = sc.nextInt();
                string1 = String.valueOf(numero);
                System.out.print("El entero convertido en cadena es "+ string1);
            }
            case 6:
            {
                string1= "La lluvia en Mendoza es escasa";
                numero= string1.length();
                System.out.print("'La lluvia en Mendoza es escasa' tiene " + numero + " caracteres.");
            }
            case 7 , 8:
            {
                int contador = 0;

                System.out.print("Ingrese una frase: ");
                sc.nextLine();
                string1 = sc.nextLine();
                numero= string1.length();
                System.out.print( "'" + string1 + "' tiene " + numero + " caracteres.");

                for (int i = 0; i < numero; i++)
                {
                    char1 = string1.charAt(i);
                    if (char1 == 'a' || char1 == 'e' || char1 == 'i' || char1 == 'o' || char1 == 'u')
                    {
                        contador ++;
                    }
                }
                System.out.println("La frase '" + string1 + "' tiene " + contador + " vocales.");
                string2 = string1.replace('a' , 'e');
                System.out.print("La frase '" + string1 + "' con sus a reemplazadas por e: '" + string2 + "'");
            }
            case 9:
            {
                string1= "La lluvia en Mendoza es escasa";
                num1= string1.length();
                byte[] result = string1.getBytes();
                for (int i = 0; i < num1; i++)
                {
                    System.out.println(result [i] + " ");
                }
            }

        }




    }
}