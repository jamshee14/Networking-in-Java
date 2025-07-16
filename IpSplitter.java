import java.util.Scanner;
public class IpSplitter{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the IP address: ");
        String ip=scan.nextLine();
        String[] parts=ip.split("\\.");
        System.out.println(parts.length);
        if (parts.length!=4){
            System.out.println("ip address is not correct");
        }else {
        System.out.println("The IP address is correct and parts are:");
        System.out.println("Part 1:"+parts[0]);
        System.out.println("Part 2:"+parts[1]);
        System.out.println("Part 3:"+parts[2]);
        System.out.println("Part 4:"+parts[3]);}

        scan.close();
    }
}