public class nonAccessModifiers {
    private static int count = 0;

    protected static int getCount()  {
        return count;
    }

    private static void addCount()  {
        count++;
    }

    nonAccessModifiers()  {
        nonAccessModifiers.addCount();
    }

    public static void main(String args[])  {
        System.out.println("Starting count: " + nonAccessModifiers.getCount());

        for (int i = 0; i < 100; i++)  {
            new nonAccessModifiers();
        }
        System.out.println("End count: " + nonAccessModifiers.getCount());
    }
}
