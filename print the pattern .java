class GfG
{
    void printPat(int n)
    {
         // Your code here
         StringBuilder pattern = new StringBuilder();

        for (int i = n; i >= 1; i--) {
            for (int j = n; j > 0; j--) {
                for (int k = 0; k < i; k++) {
                    pattern.append(j).append(" ");
                }
            }
            pattern.append("$");
        }

        System.out.print(pattern);
    }
}
