package string;

public class Palindrom {
//absesba - palindrom

    //sol1
    //parcurgem de la sfarsit la final
    //construim un string in care adaugam fiecare caracter din parcurgere
    //verfic daca cuvantul de input este egal cu cuvantul inversat

    //sol2 //LEFT - RIGHT : la left adaugam, iar la right scadem
    //incepem cu un indice left de la inceputul sintrg-ului si right pointeaza spre ultimul caracter
    //compar caracterele de la left si de la right
    //daca nu sunt egale, inchei parcurgerea
    //fac asta atat timp cat left<right
    //daca reuesesc sa parcurg pana la final, returnez true

    //sol3
    //luam prima jumatate din string
    //o inversam
    //vedem daca jumatatea inversata este egala cu cealalta jumatate

    //sol4
    //parcurgem cu for pana la mijloc
    //veirific daca elementul de la indicele i este egal cu elementul de la length-i
    //daca nu sunt egale, inchei algoritmul
    //iterativ sau recursiv

    //isPalindrom(str, i)
    //if(i>=j) , return true//cond de oprire
    //j = str.lengt-i-1  // j - cu ce vreau eu sa compar
    //if(str[i] != str[j]) //daca str la poz i daca e diferit de str la pozitia j
    //return false // daca e diferit, ies din recursivitate
    //daca nu, apelez recursiv isPalindrom(str, i+1) //i+1 -> urmatorul i
}
