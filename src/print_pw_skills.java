public class print_pw_skills {
    public static void main(String[] args) {
        int n=9;
        // pattern for 'P'
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                if (j==0 || (i==0 && j<5) || (i>0 && j==((n-1)/2)+1 && i<(n-1)/2) || (i==(n-1)/2 && j<((n-1)/2)+1))
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("   ");
            //pattern for 'W'
            for (int j=0; j<n; j++)
            {
                if (j==0 || j==n-1 || (i>=(n-1)/2 && (i+j==n-1 || i-j==0)))
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("      ");
            //pattern for 'S'
            for (int j=0; j<n; j++)
            {
                if ((i==0 && j>2) || i+j==2 || (i>2 && i<(n-1)/2 && j==0) || (i==(n-1)/2 && j>0 && j<n-2) || (i>(n-1)/2 && i<(n-3) && j==n-1) || i+j==n+5 || (i==n-1 && j<n-3) )
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("   ");
            //patter for 'K'
            for (int j=0; j<n; j++)
            {
                if (j==0 || i+j==(n-1)/2 || i-j==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("   ");
            //pattern for 'I'
            for (int j=0; j<n; j++)
            {
                if (i==0 || i==n-1 || j==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("   ");
            //pattern for 'L'
            for (int j=0; j<n; j++)
            {
                if (j==0 || i==(n-1))
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("   ");
            //pattern for 'L'
            for (int j=0; j<n; j++)
            {
                if (j==0 || i==(n-1))
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("   ");
            //pattern for 'S'
            for (int j=0; j<n; j++)
            {
                if ((i==0 && j>2) || i+j==2 || (i>2 && i<(n-1)/2 && j==0) || (i==(n-1)/2 && j>0 && j<n-2) || (i>(n-1)/2 && i<(n-3) && j==n-1) || i+j==n+5 || (i==n-1 && j<n-3) )
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
