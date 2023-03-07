package grafs;
import java.util.ArrayList;
import java.util.List;

public class DFS {

    public static class Node {

        public String value;
        List<Node> children = new ArrayList<>();

        public Node(String value) {
            this.value = value;
        }

        //O(V+E) T; O(V) S
        //O(V+E) T->cate varfuri sunt de atatea ori apelam recursiv si adunam muchiile; ne luam array ajutator in care punem rezultatul; e in fctie de nr de varfuri O(V) S
        //N(adica V)--> nr de varfuri
        public List<String> depthFirstSearch(List<String> array) {
            array.add(this.value);
            for (int i = 0; i < children.size(); i++) {
                children.get(i).depthFirstSearch(array);
            }
            return array;
        }
    }
}
