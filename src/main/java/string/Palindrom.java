package string;

public class Palindrom {
    //absesba - palindrom
    public static void main(String[] args) {
        //sol1
        System.out.println("Solutie 1");
        boolean isPalindrom = isPalindrom("absesba");
        System.out.println(isPalindrom);

        //sol2
        System.out.println("Solutie 2");
        String input = "absesba";
        if (isPalindrome2(input)) {
            System.out.println(input + " este palindrom.");
        } else {
            System.out.println(input + " nu este palindrom.");
        }

        //sol3
        System.out.println("Solutie 3");
        System.out.println(isPalindrome3("absesba"));

        //sol4
        //ITERATV
        System.out.println("Solutie 4 - ITERATIV");
        System.out.println(isPalindromIterative("absesba"));

        //RECURSIV
        System.out.println("Solutie 4 - RECURSIV");
        System.out.println(isPalindromRecursive("absesba"));

    }


    //sol1
    //parcurgem de la sfarsit la final
    //construim un string in care adaugam fiecare caracter din parcurgere
    //verfic daca cuvantul de input este egal cu cuvantul inversat
    public static boolean isPalindrom(String word) {
        boolean isPalindrom = false;
        String reverseString = "";

        for (int i = word.length() - 1; i >= 0; i--) { //1.inversam cuvantul
            reverseString += word.charAt(i);
        }
        System.out.println(reverseString);
        if (word.equals(reverseString)) {  //2. verific daca cuv invrsat este egal cu cuv. initial
            isPalindrom = true;  //daca sunt egale e adevarat
        }
        return isPalindrom;
    }

    //sol2 //LEFT - RIGHT : la left adaugam, iar la right scadem
    //incepem cu un indice left de la inceputul sintrg-ului si right pointeaza spre ultimul caracter
    //compar caracterele de la left si de la right
    //daca nu sunt egale, inchei parcurgerea
    //fac asta atat timp cat left<right
    //daca reuesesc sa parcurg pana la final, returnez true
    public static boolean isPalindrome2(String str) {
        // Eliminăm spațiile și convertim șirul la litere mici pentru a ignora literele mari/mici.
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Caracterele nu sunt egale, deci nu este palindrom
            }
            left++; // Incrementăm indicele din stânga
            right--; // Decrementăm indicele din dreapta
        }

        return true; // Am parcurs șirul și toate caracterele au fost egale, deci este palindrom
    }

    //sol3
    //luam prima jumatate din string
    //o inversam
    //vedem daca jumatatea inversata este egala cu cealalta jumatate
    public static boolean isPalindrome3(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();//*Eliminăm spațiile și convertim șirul la litere mici pentru a ignora literele mari/mici.
        int length = str.length();
        int mid = length / 2;
        String firstHalf = str.substring(0, mid);  // Extragem prima jumătate a șirului.
        String secondHalf = str.substring(length % 2 == 0 ? mid : mid + 1);// Extragem a doua jumătate a șirului. Dacă lungimea este impară, ignorăm caracterul din mijloc.
        String reversedFirstHalf = new StringBuilder(firstHalf).reverse().toString();// Inversăm prima jumătate a șirului.
        return reversedFirstHalf.equals(secondHalf);// Comparam jumățățile pentru a verifica dacă este palindrom.
    }

    //sol4
    //parcurgem cu for pana la mijloc
    //verific daca elementul de la indicele i este egal cu elementul de la length-i
    //daca nu sunt egale, inchei algoritmul
    //iterativ sau recursiv

    //ITERATIV
    public static boolean isPalindromIterative(String text) {
        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    //RECURSIV
    public static boolean isPalindromRecursive(String text) {
        return isPalindromRecursiveHelper(text, 0, text.length() - 1);
    }

    private static boolean isPalindromRecursiveHelper(String text, int start, int end) {
        if (start >= end) {  //caz de bază: când am parcurs toate caracterele sau avem un singur caracter
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) { //verificăm dacă caracterele de la început și sfârșit sunt egale
            return false;
        }

        return isPalindromRecursiveHelper(text, start + 1, end - 1); //continuăm verificarea pentru caracterele din interiorul șirului
    }

    //isPalindrom(str, i)
    //if(i>=j) , return true//cond de oprire
    //j = str.lengt-i-1  // j - cu ce vreau eu sa compar
    //if(str[i] != str[j]) //daca str la poz i daca e diferit de str la pozitia j
    //return false // daca e diferit, ies din recursivitate
    //daca nu, apelez recursiv isPalindrom(str, i+1) //i+1 -> urmatorul i
    public static boolean isPalindrom5(String str) {
        return isPalindromHelper(str, 0);
    }

    private static boolean isPalindromHelper(String str, int i) {
        int j = str.length() - i - 1;
        if (i >= j) {
            return true;
        }
        if (str.charAt(i) != str.charAt(j)) {
            return false;
        }
        return isPalindromHelper(str, i + 1);// Continuă recursivitatea pentru următorul i
    }
}
