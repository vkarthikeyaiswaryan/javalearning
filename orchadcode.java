// Orchard code 

import java.util.Scanner;
public class orchadcode
{
public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    String ashok = sc.nextLine();
    String anand = sc.nextLine();
    char as[] = ashok.toCharArray();
    char an[] = anand.toCharArray();
    int placementlelo_as=combination(as,as.length);
    int placementlelo_an=combination(an,an.length);
    if(placementlelo_as==0 && placementlelo_an==0)
        System.out.print("Invalid input");
    if(placementlelo_as>placementlelo_an)
        System.out.print("Ashok");
    else if(placementlelo_an > placementlelo_as)
        System.out.print("Anand");
    else 
        System.out.print("Draw");
}

static int combination(char arr[],int n)
{
    int placementlelo=0;
    String s="";
    for(int i=0;i<n;i++)
    {
        s=""+arr[i];
        for(int j=i+1;j<n;j++)
        {
            s+=arr[j];
            if(s.charAt(0)!=arr[j])
            {
                for(int k=j+1;k<n;k++)
                {
                    if(s.charAt(1)!=arr[k])
                        placementlelo++;
                }
            }
            s=""+arr[i];
        }
    }
    return placementlelo;
}
}
