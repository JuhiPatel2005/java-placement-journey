public class RichestCustomer {
    public int maximumWealth(int[][] accounts) {
        int[] wealth = new int[accounts.length];
        int index = 0;
        for(int[] account : accounts){
            if(account == null){
                wealth[index] = 0;
                index++;
            }else {
                int sum = 0;
                for(int i : account){
                    sum += i;
                }
                wealth[index] = sum;
                index++;
            }
        }
        int max = wealth[0];
        for(int i : wealth){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    public static void main(String args[]){
      RichestCustomer ans = new RichestCustomer();
      int[][] accounts = {{20,60,30}, {10,50,70}};
      int an = ans.maximumWealth(accounts);
      System.out.println("Richest Customer Wealth: "+ an);
    }
}

