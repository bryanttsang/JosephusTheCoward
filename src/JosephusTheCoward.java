public class JosephusTheCoward
{
    public static void main(String args[])
    {
        int people = 100;
        int power;
        for (power = 1; Math.pow(2, power) <= people; power++) {}
        System.out.println(2 * (people - (int) Math.pow(2, power - 1)) + 1);
    }
}
