import java.io.IOException;
import java.sql.Connection;
import java.util.*;
public class Two {
    public static void main(String[] args) throws IOException {
        Student[] stus = FileUtil.parseStudents("C:\\Users\\white matter\\Desktop\\students.txt");
        Map<String, String> map1 = new HashMap<>();
        for (int i = 0; i < stus.length; i++) {
            map1.put(stus[i].getStuid(), stus[i].getName());
        }

        Map<String, String> res = new HashMap<>();
        for (Map.Entry<String, String> entry : map1.entrySet()) {
            if (res.containsKey(entry.getValue())) {
                res.put((entry.getValue()), res.get(entry.getValue()) + 1);
            } else {
                res.put(entry.getValue(), "1");
            }
        }
        List<Map.Entry<String, String>> OK = new ArrayList<Map.Entry<String, String>>(res.entrySet());
        Collections.sort(OK, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                //o1 to o2升序   o2 to o1降序
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        //------------------------根据下面由次数最多到次数最少排序的最终结果，第一个名字是李鑫，且有多少个1，那么这个名字就使用了多少次数----------------
        System.out.println("==============名字使用次数最多的是 李鑫 " +"他的使用次数为姓名后面出现了多少个1，即 18次");
        System.out.println(OK);
        System.out.println("-----------------打印台往上拉看结果----------");
    }
}

