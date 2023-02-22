package ss10_dsa_list.exercise.simulation_array_list;

public class MyListTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        MyList<Integer> List = new MyList();
        List.add(5);
        List.add(6);
        List.add(7);
//        List.add(0,"Neymar");
//        List.add(1,20);
//        List.remove(0);
//        List.clear();
//            System.out.println(List.get(0));
//            System.out.println(List.get(1));
//            System.out.println(List.get(2));
//            System.out.println(List.contains(5));
//            System.out.println(List.size());
//            System.out.println(List.indexOf(7));

        for (int i = 0; i < List.size(); i++) {
            System.out.println(List.get(i));
        }



    }

}
