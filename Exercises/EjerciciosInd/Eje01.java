import java.util.ArrayList;
class Eje01 {
    public static void m3(ArrayList<Integer> list){
        for (int i = list.size() - 2; i > 0; i--) {
            int a = list.get(i);
            int b = list.get(i + 1);
            list.set(i, a + b);
            System.out.println(i+" "+list.size());
        }
        System.out.println(list);
    }
    public static void m2(ArrayList<Integer> list){
        for (int i = list.size() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                list.add(list.get(i));
            } else {
                list.add(0,list.get(i));
            }
        
            System.out.println(i+" "+list.size());
        }
        System.out.println(list);
    }
    
    public static void main(String[] args){
        ArrayList<Integer> valores = new ArrayList<Integer>();
/*         valores.add(10);
        valores.add(20);
        valores.add(30);
        valores.add(40); */
        valores.add(0,8);
        valores.add(1,2);
        valores.add(2,9);
        valores.add(2,7);
        valores.add(2,4);
        // valores.add(3,40);

        m2(valores);
    }
}