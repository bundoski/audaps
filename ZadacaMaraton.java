/*

Да се дефинира интерфејс IMaraton со методи:

Atleticar najdobroVreme() - го враќа победникот на маратонот
int atleticariOd(String s) - го враќа бројот на атлетичари со земја на потекло s.
Да се дефинира класа Atleticar.
За секој атлетичар се чуваат податоци за име String,
пол String, возраст int и време на истрчување изразено во
секунди double и земја на потекло String. За оваа класа треба да се
на располагање следните методи:

конструктори (default и со параметри)
set и get методи
toString() - формат: име / возраст / земја на потекло / време на истрчување (сите параметри одделени со празно место)
Да се дефинира класа Maraton што го имплементира интерфејсот IMaraton. За секој маратонот се чуваат податоци за местото на одржување String, година int, низа од атлетичари Atleticar[]. За оваа класа да се имплементираат:

конструктори (default и со параметри)
set и get методи
toString() - место на одржување / година / атлетичарите учесници на маратонот (сите параметри одделени со нов ред)
najdobroVreme()
atleticariOd(String s)
 */

import java.util.Scanner;

public class ZadacaMaraton {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        Atleticar[] atleticari = new Atleticar[n];

        String ime;
        String pol;
        int vozrast;
        double vreme;
        String zemja;

        input.nextLine();

        for(int i=0;i<n;i++)
        {
            ime = input.nextLine();
            pol = input.nextLine();
            vozrast = input.nextInt();
            vreme = input.nextDouble();
            input.nextLine();
            zemja = input.nextLine();
            atleticari[i]=new Atleticar(ime,pol,vozrast,vreme,zemja);
        }

        String mesto;
        int godina;
        String zemjaP;
        mesto = input.nextLine();
        godina = input.nextInt();
        input.nextLine();

        Maraton m1 = new Maraton(mesto, godina, atleticari);
        System.out.print(m1.toString());

        zemjaP = input.nextLine();
        System.out.println("Prvo mesto: " + m1.najdobroVreme().toString());
        System.out.println("Ima vkupno " + m1.atleticariOd(zemjaP) + " atleticar/i od " + zemjaP);
    }
}