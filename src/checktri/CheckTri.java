
package checktri;

public class CheckTri {

    public static String checkTriType(int a, int b, int c) {
        String triTypeString = "";
        if (a > 0 && b > 0 && c > 0) {
            if (a == b && b == c && a == c)
                triTypeString = "Equilateral Triangle";
            else if (a == b || b == c || a == c) 
                triTypeString = "Isosceles Triangle";
            else if (a != b && b != c && a != c) 
                triTypeString = "Scalene";
                if((a^2)+(b^2)>(c^2) || (a^2)+(c^2)>(b^2) || (b^2)+(c^2)>(a^2))
                    triTypeString = "Invalid!!!";
                
            else
                triTypeString = "Invalid!!!";
        }
        if(a <= 0 || b <= 0 || a <= 0)
                triTypeString = "Invalid!!!";
        return triTypeString;

        }
    }
