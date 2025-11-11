import java.io.BufferedReader;

public class Sample2_6 {
    public static void main(String[] args) throws IOException {
        
        System.out.println("請輸入a 或 b:");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
        string str = br.readLine();
        char letter = str.charAt(0);
        
        switch (letter)
        {
            case 'a':
            {
                System.out.println("輸入的是a");
                break;
            }
                
            case 'b':
            {
                System.out.println("輸入的是b");
                break;
            }

            default:
            {
                System.out.println("請輸入a或b");
                break;
            }
                
        }
    }
}
