public class Main {
    public static void main(String[] args) {
        Main books = new Main();
        System.out.println(books.book());

        Calculate calc = new Calculate();
        System.out.println("Сумма: " + calc.add(2, 3));
        System.out.println("Разность: " + calc.subtract(2, 3));
        System.out.println("Множення: " + calc.multiply(2, 3));
        System.out.println("Ділення: " + calc.divide(5, 2));


        BankAccount account = new BankAccount(1000, 500);
        account.deposit(200);
        account.withdraw(300);
        System.out.println("Общий баланс: " + account.getBalance() + " гривен.");
        System.out.println("Баланс накоплений: " + account.getSavingsBalance() + " гривен.");


        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle sides:" + " ");
        triangle.imageSlides();
        System.out.println("Square:"  + " " + triangle.sSlides());
        System.out.println("Sum:"  + " " + triangle.sumSlides());


        StudentList studentList = new StudentList();
        studentList.addStudent("Іван", "Петров", 4.5);
        studentList.addStudent("Марія", "Іванова", 3.8);
        studentList.displayAllStudents();

        studentList.removeStudent(0);

        System.out.println("List after removing a student:");
        studentList.displayAllStudents();

    }

    String book() {
        Book fireorIce = new Book("FireOrIce", "Darth", 1999);
        return "Name = " + fireorIce.namebook + "\n " + "Creator book: " + fireorIce.creator + "\n " + "Years create this book: " + fireorIce.year;
    }


}