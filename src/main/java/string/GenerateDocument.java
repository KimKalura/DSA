package string;

import java.util.HashMap;
import java.util.Map;

public class GenerateDocument {


    public static void main(String[] args) {
        //characters: !nub nstun  (1))
        //document: sunt bun! (2)

        //expl:se poate genera un document(2) avand aceste caractere (1) daca frecventa caracterelor unice din stringul (1), adica de cate ori apare...
        //...fiecare caracter, e mai mare sau egal decat frecventa caracterelor unice care apare la (2)

        String s1 = "!nub nstun";
        String s2 = "sunt bun!";
        System.out.println(generateDocument(s1, s2));
    }
    //pt a calcula frecventa fiecarui caracter ne folosim de mapa
    //1.cream o mapa identica pt doc;
    //2.parcurgem si comparam daca valorile de la aceasi cheie sunt mai mari
    //renuntam la 1+2
    //parcurgem mapa si verificam daca valorile de la fiecare cheie sunt mai mari sau egale cu 0-fac asta in timp ce decrementez

    //cand apare fiecare din mapa ->K=V
    //care sunt cuv care incep cu aceeasi litera
    //carac nu sunt ordonate, pt cau au in spate hash table

    //O(N+M) T- avem 2 inputuri si o data il parcurgem pe primul si o data pe al doilea; O(C) S, unde C este nr de caractere  unice din characters,
    //N este(mapa) lungimea lui characters, M este lungimea lui document

    public static boolean generateDocument(String characters, String document) {
        Map<Character, Integer> mapCharacters = new HashMap<>();
        for (Character ch : characters.toCharArray()) {
            if (!mapCharacters.containsKey(ch)) {
                mapCharacters.put(ch, 1);
            } else {
                mapCharacters.put(ch, mapCharacters.get(ch) + 1);
            }
        }
        for (Character ch : document.toCharArray()) {
            if (!mapCharacters.containsKey(ch) || mapCharacters.get(ch) == 0) {
                return false;
            }
            mapCharacters.put(ch, mapCharacters.get(ch) - 1);
        }
        return true;
    }
}