class juice {
    /*enums are the collection of elements of a single variable this could be
    * juiceSize = SMALL or
    * juiceSize  = MEDIUM or
    * juiceSize = LARGE
    * */
    enum juiceSize{
        SMALL,
        MEDIUM,
        LARGE
    }
    juiceSize size;
}
public class enums {
    public static void main(String args[])  {
        juice j = new juice();
        j.size = juice.juiceSize.SMALL;
        System.out.println("size: " + j.size);
        j.size = juice.juiceSize.MEDIUM;
        System.out.println("size: " + j.size);
        j.size = juice.juiceSize.LARGE;
        System.out.println("size: " + j.size);
    }
}
