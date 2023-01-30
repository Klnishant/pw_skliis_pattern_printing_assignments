public class print_full_name {
    public static void main(String[] args) {
        int n=9;
        //pattern for 'N'
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                if(i-j==0 || j==0 || j==n-1)
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
                if (i==0 || i==n-1 || j==(n-1)/2)
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
            System.out.print("   ");
            //pattern for 'H'
            for (int j=0; j<n; j++)
            {
                if (j==0 || j==n-1 || i==(n-1)/2 )
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("   ");
            //pattern for 'A'
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
            //pattern for 'N'
            for (int j=0; j<n; j++)
            {
                if(i-j==0 || j==0 || j==n-1)
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("   ");
            //pattern for 'T'
            for (int j=0; j<n; j++)
            {
                if(i==0 || j==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("      ");
            //pattern for 'K'
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
            //pattern for 'A'
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
            //pattern for 'U'
            for (int j=0; j<n; j++)
            {
                if ((j==0 && i<n-3) || (i>=n-3 && i-j==n-3) || (i>=n-3 && i+j==n+5) || (j==n-1 && i<n-3) || (i==n-1 && j>2 && j<n-3))
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("    ");
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
            //pattern for 'H'
            for (int j=0; j<n; j++)
            {
                if (j==0 || j==n-1 || i==(n-1)/2 )
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("   ");
            //pattern for 'A'
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
            System.out.println();
        }
    }
}
