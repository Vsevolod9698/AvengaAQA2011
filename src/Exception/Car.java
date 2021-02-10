package Exception;

public class Car {
        String name;
        boolean clearOfSnow;
        boolean warmUp;

        public Car(String name) {
            this.name = name;

        }
        public static void main(String [] args){

        }
        public void autoСleaning(){
            System.out.println("Авто очищене від снігу");

        }
        public void warm(){
            System.out.println("Авто прогріте");
        }
        public void ride() throws CarIsNotReadyException{
            System.out.println("Їдемо кататися на авто");
            if (clearOfSnow && warmUp){
                System.out.println("Кайф, їдемо кататися" + name + "це прекрасно");
            }
            else {
                throw new CarIsNotReadyException("Авто" + name + " не готове до виїзду");
            }
        }








    }




