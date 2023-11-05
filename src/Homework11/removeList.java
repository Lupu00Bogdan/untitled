package Homework11;
import java.util.LinkedList;

public class removeList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("mere");
        list.add("pere");
        list.add("prune");
        list.add("portocale");
        System.out.println("Lista initiala de fructe:");
        System.out.println(list);

        String removed = list.removeFirst();
        System.out.println("Fructele scoase din lista din lista: " + removed);
        System.out.println(list);
    }
}
