import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*ArrayList<String> arrayList = new ArrayList<>(List.of(
                "Apple",
                "Banana",
                "Cherry",
                "Date",
                "Elderberry"
        ));

        System.out.println(arrayList);

        arrayList.remove("Cherry");
        arrayList.add(1, "Fig");
        System.out.println(arrayList);

        System.out.println(arrayList.get(2));
        System.out.println(arrayList.contains("Apple"));
        System.out.println(arrayList.size());

        HashSet<Integer> hashSet = new HashSet<>(List.of(
                10,
                20,
                30,
                40,
                50
        ));

        System.out.println(hashSet);
        hashSet.add(30);
        System.out.println(hashSet);
        hashSet.remove(40);
        System.out.println(hashSet);
        System.out.println(hashSet.contains(20));

        ArrayList<Object> arrayList = new ArrayList<>(List.of(hashSet.toArray()));

        System.out.println(arrayList);

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 20);
        hashMap.put("Bob", 22);
        hashMap.put("Charlie", 23);
        hashMap.put("David", 21);

        System.out.println(hashMap);
        System.out.println(hashMap.get("Bob"));
        hashMap.remove("David");
        System.out.println(hashMap);
        System.out.println(hashMap.containsKey("Alice"));

        hashMap.forEach((name, age) -> {
            System.out.println("Name: " + name + ", age: " + age);
        });

        ArrayList<Integer> arrayList = new ArrayList<>(List.of(
                45,
                12,
                89,
                23,
                76
        ));

        Collections.sort(arrayList);
        for(int value : arrayList) {
            System.out.println(value);
        }

        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            if(iterator.next() > 50) {
                iterator.remove();
            }
        }

        System.out.println(arrayList);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Task1");
        linkedList.add("Task2");
        linkedList.add("Task3");
        linkedList.add("Task4");

        System.out.println(linkedList.poll());
        System.out.println(linkedList.peek());
        System.out.println(linkedList);
        linkedList.clear();
        System.out.println(linkedList);

        LinkedList<String> deque = new LinkedList<>();
        deque.add("Front1");
        deque.add("Front2");
        deque.add("Middle");
        deque.add("Back1");
        deque.add("Back2");

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        deque.addFirst("first1");
        deque.addLast("back3");
        System.out.println(deque);

        ArrayList<Integer> arrayList = new ArrayList<>(List.of(
                5,
                12,
                17,
                21,
                34,
                60,
                2
        ));

        System.out.println(arrayList.stream().filter(number -> number % 2 == 0)
                .filter(number -> number < 20).toList());

        ArrayList<String> arrayList = new ArrayList<>(List.of(
                "Apple",
                "Banana",
                "Cherry"
        ));

        ArrayList<String> arrayList1 = new ArrayList<>(List.of(
                "Banana",
                "Apple",
                "Cherry"
        ));

        System.out.println(arrayList.equals(arrayList1));
        Collections.sort(arrayList);
        Collections.sort(arrayList1);

        System.out.println(arrayList.equals(arrayList1));

        HashSet<Object> hashSet = new HashSet<>(arrayList);

        System.out.println(hashSet);
        System.out.println(arrayList1);

        System.out.println(hashSet.equals(arrayList1));

        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("Alice", 85));
        arrayList.add(new Student("Bob", 72));
        arrayList.add(new Student("Charlie", 90));
        arrayList.add(new Student("David", 78));

        arrayList.sort(Comparator.comparingInt(Student::getScore));
        System.out.println(arrayList);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(List.of(
                "Apple",
                "Banana",
                "Cherry",
                "Date",
                "Apple"
        ));

        System.out.println(linkedHashSet);
        linkedHashSet.remove("Apple");
        linkedHashSet.add("Apple");
        System.out.println(linkedHashSet);*/
    }
}

/* class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}*/