import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class generictype{

    public static void main(String args[]){
//        MyName<String> myName = new MyName<String>();
//        myName.setMemeber("good");
//        System.out.println(myName.getMemeber());
//        System.out.println(getResult("good", 123));
//
//        Integer[] array = new Integer[]{1,2,3,4,5};
//        List<Integer> list = Arrays.asList(array);
//        System.out.println(sum2(list));

        GenericWildcard<? extends List> foo = null;
        foo = new GenericWildcard<ArrayList>();
        System.out.println(foo.toString());
    }

    public static class GenericWildcard2<T extends List> {
        private T foo;

        public void setFoo(T foo) {
            this.foo = foo;
        }

        public T getFoo() {
            return foo;
        }
    }

    public static class GenericWildcard<T> {
        private T foo;

        public void setFoo(T foo) {
            this.foo = foo;
        }

        public T getFoo() {
            return foo;
        }
    }

    private static class MyName<T>{
        T memeber;

        public void setMemeber(T memeber) {
            this.memeber = memeber;
        }

        public T getMemeber() {
            return memeber;
        }
    }

    private static <T extends String, S extends Integer> String getResult(T myStr, S myNum){
        String result = myStr + myNum.toString();
        return result;
    }
//
//    private static T getAnotherResult(T){
//
//    }

    private static int sum(List<Integer> list){
        int sum = 0;
        for( int element : list){
            sum += element;
        }

        return sum;
    }

    private static <T extends Number> T sum2(List<T> list){
//        T sum;
//        for( T element : list){
//            sum += element;
//        }

        return list.get(0);
    }
}