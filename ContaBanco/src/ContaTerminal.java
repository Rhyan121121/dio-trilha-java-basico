void main() {
    Scanner sc = new Scanner(System.in);
    final String WELCOME_MESSAGE = "Bem vindo a criação de conta !";

    System.out.println(WELCOME_MESSAGE);

    System.out.println("Digite seu nome:");
    var name = sc.nextLine();
    System.out.println("Digite sua Agência:");
    var agency = sc.nextLine();
    System.out.println("Digite o número da sua Conta:");
    int accountNumber = sc.nextInt();
    System.out.println("Digite sua Saldo:");
    double saldo = sc.nextDouble();

    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque !",name,agency,accountNumber,saldo);

    }
