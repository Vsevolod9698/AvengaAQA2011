package Exception;

public class Exception1 {

        public static void main(String args[]) {
            try {
                int array[] = new int[2];
                System.out.println("Отримати доступ до третього елементу масиву:" + array[3]);
            }catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Вийняток" + e);
            }
            System.out.println("Поза блоком"); //Checked
        }
    }

