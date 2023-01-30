public class print_alphabets {
    public static void main(String[] args) {
        int n=9;

        //pattern for 'A'
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                if ((i+j==2 || j-i ==n-3)|| (i==0 && j>2 && j<n-3) || (i>2 && (j==0||j==n-1)) || (i==(n-1)/2) )
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("    ");
            //print pattern for 'B'
            for (int j=0; j<n; j++)
            {
                if (((i==0 || i==n-1) && j<n-3) || (i+j==n+5) || (i<2 && j-i==n-3) || (i>=2 && i<n-3 && j==n-1) || j==0 || i==(n-1)/2 )
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("    ");
            //print pattern for 'C'
            for (int j=0; j<n; j++)
            {
                if (((i==0 || i==n-1) && j>2) || (i+j==2) || (i-j==6) || (i>=2 && i<n-3 && j==0) )
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("    ");
            //print pattern for 'D'
            for (int j=0; j<n; j++)
            {
                if (((i==0 || i==n-1) && j<n-3) || (i+j==n+5) || (i<2 && j-i==n-3) || (i>=2 && i<n-3 && j==n-1) || j==0 )
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("    ");
            //print pattern for 'E'
            for (int j=0; j<n; j++)
            {
                if (i==0 || i==n-1 || j==0 || i==(n-1)/2 )
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("    ");
            //print pattern for 'F'
            for (int j=0; j<n; j++)
            {
                if (i==0 || j==0 || i==(n-1)/2 )
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("    ");
            //print pattern for 'G'
            for (int j=0; j<n; j++)
            {
                if ((i==0 && j>2) || (i==n-1 && j>2 && j<n-3) || (i+j==n+5) || (i>2 && i<n-3 && j==0) || (i+j)==2 || (i-j==6) || (i==(n-1)/2 && j>(n-1)/2) || (i>(n-1)/2 && j==n-1 && i<n-3) )
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("    ");
            //print pattern for 'H'
            for (int j=0; j<n; j++)
            {
                if (j==0 || j==n-1 || i==(n-1)/2 )
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
