 public class switchjava {
    static void calc(double a, double b){
        double result = a + b;
        System.out.println(result);
    }
     switch (operator) {
         case '+':
             result = numA + numB;
             break;
         case '-':
             result = numA - numB;
             break;
         case '*':
             result = numA * numB;
             break;
         case '/':
             if (numB != 0) {
                 result = numA / numB;
             } else {
                 System.out.println("Ошибка: деление на ноль невозможно.");
                 return;
             }
             break;
         default:
             System.out.println("Ошибка: неверный оператор.");
             return;
     }






}
