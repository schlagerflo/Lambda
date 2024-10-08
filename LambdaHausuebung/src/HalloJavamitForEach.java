import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach
{
    List<String> list;

    public HalloJavamitForEach ()
    {
        list = new ArrayList<>();
        list.add("Begriff 1");
        list.add("Begriff 2");
        list.add("Begriff 3");
    }

    public void showList ()
    {
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println();
        list.forEach(item -> System.out.println(item));

        System.out.println();
        list.forEach(System.out::println);
    }

}
