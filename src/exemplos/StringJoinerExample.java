package exemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringJoinerExample {

    public static void main(String[] args) {
        String names = "Teste0, Teste1, Teste2, Teste3, Teste4";
        System.out.println(names);
        List<String> nameList = namesToList(names);

        String joinedNames = joinNames(nameList);
        System.out.println(joinedNames);
    }

    //devolve uma list com os nomes delimitados por ","
    private static List<String> namesToList(String names) {
        List<String> nameList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(names, ",");

        while (st.hasMoreTokens()){
            String name = st.nextToken().trim();
            nameList.add(name);
            System.out.println(name);
        }
        return nameList;
    }

    //devolve uma String com todos os nomes delimitados por ","
    private static String joinNames(List<String> nameList) {
        StringJoiner joiner = new StringJoiner(", ");
        nameList.forEach((name) -> {
            joiner.add(name);
        });
        return joiner.toString();
    }
}
