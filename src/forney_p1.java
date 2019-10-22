import java.util.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.security.SecureRandom;
class CAI
{
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    public static void main(String arg[])
    {
        while(true)
        {
            On_go();
        }
    }
    static void On_go()
    {

        System.out.println("Choose the difficulty level:");
        System.out.println("Level-1");
        System.out.println("Level-2");
        System.out.println("Level-3");
        System.out.println("Level-4");
        Scanner sc=new Scanner(System.in);
        int level=sc.nextInt();
        System.out.println("Type of Arithmetic");

        System.out.println("Addition-1");
        System.out.println("Multiplication-2");
        System.out.println("Subtraction-3");
        System.out.println("Division-4");
        System.out.println("Mixer of all-5");
        int type_ar=sc.nextInt();

        solve_problem(level,type_ar);
    }

    static void solve_problem(int level,int type_ar)
    {
        int counter=0;

        switch (type_ar) {
            case 1:
                for(int i=1;i<=10;i++)
                {
                    counter+=addition(level);
                }
                break;
            case 2:
                for(int i=1;i<=10;i++)
                {
                    counter+=multiplication(level);
                }
                break;
            case 3:
                for(int i=1;i<=10;i++)
                {
                    counter+=substraction(level);
                }
                break;
            case 4:
                for(int i=1;i<=10;i++)
                {
                    counter+=division(level);
                }

                break;
            case 5:
                for(int i=1;i<=10;i++)
                {
                    int ran=Random(1,4);
                    if(ran==1)
                    {
                        counter+=addition(level);
                    }
                    if(ran==2)
                    {
                        counter+=multiplication(level);
                    }
                    if(ran==3)
                    {
                        counter+=substraction(level);
                    }
                    if(ran==4)
                    {
                        counter+=division(level);
                    }
                }
                break;

            default:
                System.out.println("Invalid Number");
                return;

        }




        if((double)((double)counter/10)*100>=(double)75)
        {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else
        {
            System.out.println("Please ask your teacher for extra help");
        }
    }

    static int addition(int level)
    {
        int a=0;
        int b=0;
        if(level==1)
        {
            a=Random(0,9);
            b=Random(0,9);
        }
        if(level==2)
        {
            a=Random(10,99);
            b=Random(10,99);
        }
        if(level==3)
        {
            a=Random(100,999);
            b=Random(100,999);
        }
        if(level==4)
        {
            a=Random(1000,9999);
            b=Random(1000,9999);
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("How much is "+a+" plus "+b);
        int answer=sc.nextInt();
        if(answer==a+b)
        {
            int choose=Random(1,4);
            if(choose==1)
            {
                System.out.println("Very good!");
            }
            if(choose==2)
            {
                System.out.println("Excellent!");
            }
            if(choose==3)
            {
                System.out.println("Nice work!");
            }
            if(choose==4)
            {
                System.out.println("Keep up the good work!");
            }
            return 1;
        }
        else
        {


            int ch=Random(1,4);
            if(ch==1)
            {
                System.out.println("No. Please try again.");
            }
            if(ch==2)
            {
                System.out.println("Wrong. Try once more.");
            }
            if(ch==3)
            {
                System.out.println("Don't give up!");
            }
            if(ch==4)
            {
                System.out.println("No. Keep trying");
            }


            while(true)
            {
                int ans=sc.nextInt();

                if(ans==a+b)
                {
                    int choose=Random(1,4);
                    if(choose==1)
                    {
                        System.out.println("Very good!");
                    }
                    if(choose==2)
                    {
                        System.out.println("Excellent!");
                    }
                    if(choose==3)
                    {
                        System.out.println("Nice work!");
                    }
                    if(choose==4)
                    {
                        System.out.println("Keep up the good work!");
                    }

                    return 0;
                }
                else
                {
                    int choose=Random(1,4);
                    if(choose==1)
                    {
                        System.out.println("No. Please try again.");
                    }
                    if(choose==2)
                    {
                        System.out.println("Wrong. Try once more.");
                    }
                    if(choose==3)
                    {
                        System.out.println("Don't give up!");
                    }
                    if(choose==4)
                    {
                        System.out.println("No. Keep trying");
                    }
                }
            }
        }

    }

    static int substraction(int level)
    {
        int a=0,b=0;
        if(level==1)
        {
            a=Random(0,9);
            b=Random(0,9);
        }
        if(level==2)
        {
            a=Random(10,99);
            b=Random(10,99);
        }
        if(level==3)
        {
            a=Random(100,999);
            b=Random(100,999);
        }
        if(level==4)
        {
            a=Random(1000,9999);
            b=Random(1000,9999);
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("How much is "+a+" subtract "+b);
        int answer=sc.nextInt();
        if(answer==b-a)
        {
            int choose=Random(1,4);
            if(choose==1)
            {
                System.out.println("Very good!");
            }
            if(choose==2)
            {
                System.out.println("Excellent!");
            }
            if(choose==3)
            {
                System.out.println("Nice work!");
            }
            if(choose==4)
            {
                System.out.println("Keep up the good work!");
            }
            return 1;
        }
        else
        {
            int ch=Random(1,4);
            if(ch==1)
            {
                System.out.println("No. Please try again.");
            }
            if(ch==2)
            {
                System.out.println("Wrong. Try once more.");
            }
            if(ch==3)
            {
                System.out.println("Don't give up!");
            }
            if(ch==4)
            {
                System.out.println("No. Keep trying");
            }
            while(true)
            {
                int ans=sc.nextInt();

                if(ans==b-a)
                {
                    int choose=Random(1,4);
                    if(choose==1)
                    {
                        System.out.println("Very good!");
                    }
                    if(choose==2)
                    {
                        System.out.println("Excellent!");
                    }
                    if(choose==3)
                    {
                        System.out.println("Nice work!");
                    }
                    if(choose==4)
                    {
                        System.out.println("Keep up the good work!");
                    }

                    return 0;
                }
                else
                {
                    int choose=Random(1,4);
                    if(choose==1)
                    {
                        System.out.println("No. Please try again.");
                    }
                    if(choose==2)
                    {
                        System.out.println("Wrong. Try once more.");
                    }
                    if(choose==3)
                    {
                        System.out.println("Don't give up!");
                    }
                    if(choose==4)
                    {
                        System.out.println("No. Keep trying");
                    }
                }
            }
        }
    }

    static int multiplication(int level)
    {
        int a=0,b=0;
        if(level==1)
        {
            a=Random(0,9);
            b=Random(0,9);
        }
        if(level==2)
        {
            a=Random(10,99);
            b=Random(10,99);
        }
        if(level==3)
        {
            a=Random(100,999);
            b=Random(100,999);
        }
        if(level==4)
        {
            a=Random(1000,9999);
            b=Random(1000,9999);
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("How much is "+a+" times "+b);
        int answer=sc.nextInt();
        if(answer==b*a)
        {
            int choose=Random(1,4);
            if(choose==1)
            {
                System.out.println("Very good!");
            }
            if(choose==2)
            {
                System.out.println("Excellent!");
            }
            if(choose==3)
            {
                System.out.println("Nice work!");
            }
            if(choose==4)
            {
                System.out.println("Keep up the good work!");
            }
            return 1;
        }
        else
        {
            int ch=Random(1,4);
            if(ch==1)
            {
                System.out.println("No. Please try again.");
            }
            if(ch==2)
            {
                System.out.println("Wrong. Try once more.");
            }
            if(ch==3)
            {
                System.out.println("Don't give up!");
            }
            if(ch==4)
            {
                System.out.println("No. Keep trying");
            }

            while(true)
            {
                int ans=sc.nextInt();

                if(ans==b*a)
                {
                    int choose=Random(1,4);
                    if(choose==1)
                    {
                        System.out.println("Very good!");
                    }
                    if(choose==2)
                    {
                        System.out.println("Excellent!");
                    }
                    if(choose==3)
                    {
                        System.out.println("Nice work!");
                    }
                    if(choose==4)
                    {
                        System.out.println("Keep up the good work!");
                    }

                    return 0;
                }
                else
                {
                    int choose=Random(1,4);
                    if(choose==1)
                    {
                        System.out.println("No. Please try again.");
                    }
                    if(choose==2)
                    {
                        System.out.println("Wrong. Try once more.");
                    }
                    if(choose==3)
                    {
                        System.out.println("Don't give up!");
                    }
                    if(choose==4)
                    {
                        System.out.println("No. Keep trying");
                    }
                }
            }
        }
    }

    static int division(int level)
    {
        float a=0,b=0;
        if(level==1)
        {
            a=Random(1,9);
            b=Random(1,9);
        }
        if(level==2)
        {
            a=Random(10,99);
            b=Random(10,99);
        }
        if(level==3)
        {
            a=Random(100,999);
            b=Random(100,999);
        }
        if(level==4)
        {
            a=Random(1000,999);
            b=Random(1000,999);
        }
        Scanner sc=new Scanner(System.in);


        System.out.println("How much is "+a+" Divide "+b);
        String answer=sc.nextLine();
        // System.out.println(df2.format(b/a));
        if(answer.equals(df2.format(b/a)))
        {
            int choose=Random(1,4);
            if(choose==1)
            {
                System.out.println("Very good!");
            }
            if(choose==2)
            {
                System.out.println("Excellent!");
            }
            if(choose==3)
            {
                System.out.println("Nice work!");
            }
            if(choose==4)
            {
                System.out.println("Keep up the good work!");
            }
            return 1;
        }
        else
        {
            int ch=Random(1,4);
            if(ch==1)
            {
                System.out.println("No. Please try again.");
            }
            if(ch==2)
            {
                System.out.println("Wrong. Try once more.");
            }
            if(ch==3)
            {
                System.out.println("Don't give up!");
            }
            if(ch==4)
            {
                System.out.println("No. Keep trying");
            }
            while(true)
            {
                String ans=sc.nextLine();
                //System.out.println(df2.format(b/a));

                if(ans.equals(df2.format(b/a)))
                {
                    int choose=Random(1,4);
                    if(choose==1)
                    {
                        System.out.println("Very good!");
                    }
                    if(choose==2)
                    {
                        System.out.println("Excellent!");
                    }
                    if(choose==3)
                    {
                        System.out.println("Nice work!");
                    }
                    if(choose==4)
                    {
                        System.out.println("Keep up the good work!");
                    }

                    return 0;
                }
                else
                {
                    int choose=Random(1,4);
                    if(choose==1)
                    {
                        System.out.println("No. Please try again.");
                    }
                    if(choose==2)
                    {
                        System.out.println("Wrong. Try once more.");
                    }
                    if(choose==3)
                    {
                        System.out.println("Don't give up!");
                    }
                    if(choose==4)
                    {
                        System.out.println("No. Keep trying");
                    }
                }
            }
        }
    }


    public static int Random(int min, int max){
        SecureRandom rand = new SecureRandom();
        int x = (int)(rand.nextDouble()*((max-min)+1))+min;
        return x;
    }

}
