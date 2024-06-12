public class Main {
    public static void main(String[] args) {
        try {
            Admin admin = new Admin("Admin", "One");

            Employee emp1 = admin.addEmployee("Employee", "One");
            Employee emp2 = admin.addEmployee("Employee", "Two");

            BankAccount bla1 = new BankAccount();
            BankAccount bla2 = new BankAccount();
            BankAccount bla3 = new BankAccount();
            BankAccount bla4 = new BankAccount();

            Client client1 = emp1.addClient("Client", "1", bla1);
            Client client2 = emp1.addClient("Client", "2", bla2);
            Client client3 = emp2.addClient("Client", "3", bla3);
            Client client4 = emp2.addClient("Client", "4", bla4);

            emp1.depositToAccount(bla1, 1000);
            emp1.depositToAccount(bla2, 2000);
            emp2.depositToAccount(bla3, 3000);
            emp2.depositToAccount(bla4, 4000);

            bla1.transfer(bla2, 200);
            printBalances(bla1, bla2, bla3, bla4);

            bla2.transfer(bla3, 500);
            printBalances(bla1, bla2, bla3, bla4);

            bla3.transfer(bla4, 1000);
            printBalances(bla1, bla2, bla3, bla4);

            bla4.transfer(bla1, 1500);
            printBalances(bla1, bla2, bla3, bla4);

            bla1.transfer(bla2, 200);
            printBalances(bla1, bla2, bla3, bla4);

            bla1.transfer(bla2, 200);
            printBalances(bla1, bla2, bla3, bla4);

            bla1.transfer(bla2, 200);
            printBalances(bla1, bla2, bla3, bla4);

            bla1.transfer(bla2, 200);
            printBalances(bla1, bla2, bla3, bla4);

            bla1.transfer(bla2, 200);
            printBalances(bla1, bla2, bla3, bla4);

            bla1.transfer(bla2, 200);
            printBalances(bla1, bla2, bla3, bla4);

        } catch (AccountOperationException e) {
            e.printStackTrace();
        }
    }

    private static void printBalances(BankAccount... accounts) {
        for (BankAccount account : accounts) {
            System.out.println("Balance: " + account.checkBalance());
        }
        System.out.println();
    }
}