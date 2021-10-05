public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        return (daysSkipped > 5) ? 0.85 : 1;
    }
    public int multiplierPerProductsSold(int productsSold) {
        return (productsSold > 20) ? 13 : 10;
    }
    public double bonusForProductSold(int productsSold) {
        
        return (productsSold > 20) ? productsSold* 13 : productsSold * 10;
    }
    public double finalSalary(int daysSkipped, int productsSold) {
         double skipped = (daysSkipped > 5)? 0.85 : 1;
         int multi = (productsSold > 20) ? 13 : 10;
         double bonus = (productsSold > 20) ? productsSold* 13 : productsSold * 10;
         double salary =  ((multi *  productsSold) + (1000 * skipped));
         return (salary > 2000)? 2000 : salary;
    } 
}
