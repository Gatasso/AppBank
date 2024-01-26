package java.dev.galasso.matheus.test;

//public class AppBank {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Account acc01 = new Account("Matheus", "0001", "Checking");
//        acc01.initialMenu();
//        //operações interativas
//        String commandMenu = "Running";
//        while (!commandMenu.equals("Q")) {
//
//            acc01.creditLimit();
//            acc01.setMaintenanceTax();
//            acc01.menu();
//            commandMenu = scanner.next();
//
//            switch (commandMenu) {
//                case "Q":
//                    System.out.println("Sessão Encerrada");
//                    break;
//                case "C":
//                    refresh();
//                    acc01.check();
//                    break;
//                case "D":
//                    refresh();
//                    acc01.deposit(scanner);
//                    break;
//                case "W":
//                    refresh();
//                    acc01.withdraw(scanner);
//                    break;
//                case "P":
//                    refresh();
//                    acc01.payBills(scanner);
//                    break;
//                case "I":
//                    refresh();
//                    SavingAccount SAcc = new SavingAccount(acc01.getNameClient(), acc01.getIdCode(), "Saving", "Saver");
//                    int chooseOption = 0;
//                    while (!(chooseOption == 4)) {
//                        SAcc.menu();
//                        chooseOption = scanner.nextInt();
//                        SAcc.optionsMenu(scanner, chooseOption);
//                    }
//                    break;
//                default:
//                    System.out.println("Opção inválida");
//            }
//
//        }
//        scanner.close();
//    }
//
//    public static void refresh() {
//        for (int i = 0; i < 100; i++) {
//            System.out.println(" ");
//
//        }
//    }
//}