package organization;
    public class Inheritance {
        public static void main(String args[]) {
            Manager manager = new Manager();
            Labour labour = new Labour();

            System.out.println("manager salary is :" + manager.salary);
            System.out.println("salary with incentive is:" + manager.incentive);
            System.out.println("labour salary is :" + labour.salary);
            System.out.println("salary with overtime is :" + labour.overtime);

        }
    }

