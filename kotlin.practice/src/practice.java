public class practice{
    public static void main(String[]args)
    {
//        Object[] objects = new Object[3];
//        objects[0] = "foo";
//        objects[1] = 5;
//        objects[2] = true;
//
//
//
//        for (Object object : objects
//             ) {
//            System.out.println(object);
//        }

//        short value = Short.parseShort("11111111",2);
//
//        byte bValue = Byte.parseByte("1111",2);
//        System.out.println(Byte.MIN_VALUE);
//        System.out.println(bValue);

        byte value = -1;
        System.out.println( value >>> 1);

        Singleton.getInstance().myFun();

        MyStatic myStatic = new MyStatic();
        System.out.println(myStatic.name);
        System.out.println(myStatic.value);
        MyStatic.fun();
    }

    static class MyStatic{
        private static String name;
        private Integer value;

        public MyStatic(){
            name = "Name";
            value = 123;
        }

        static void fun(){
            System.out.println(name);
        }
    }
}