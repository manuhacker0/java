public class Genericmethod
{
    public static < E > void printarry (E inputarry[])
    {
        for(E element : inputarry)
        {
            System.out.print("%s",element);
        }
        System.out.println();
    }
}