import java.io.BufferedReader;

public class Sample2_2
{
    public static void main(string[] args)throws IOException
    {
        System.out.println("請輸入整數：");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Interger.parseInt(br.readLine());

        if(num == 1)
            System.out.println("輸入的是1");
            System.out.println("選擇的是1");
        
        System.out.println("結束處理！");
    }
}