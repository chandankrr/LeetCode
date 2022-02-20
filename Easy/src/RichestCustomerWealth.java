public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } };
        
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }
    
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int customerWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                customerWealth += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, customerWealth);
        }
        return maxWealth;
    }
}
