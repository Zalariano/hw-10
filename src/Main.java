public class Main {
    public static void main(String[] args) {

        //Задание номер 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();

        //Задание номер 2
        String firstName1 = "Ivan";
        String middleName1 = "Ivanovich";
        String lastName1 = "Ivanov";
        String fullName1 = lastName1 + ' ' + firstName1 + ' ' + middleName1;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName1.toUpperCase());
        System.out.println();

        //Задание номер 3
        String firstName2 = "Семён";
        String middleName2= "Семёнович";
        String lastName2= "Иванов";
        String fullName2 = lastName2 + ' ' + firstName2 + ' ' + middleName2;
        fullName2 = fullName2.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName2);
    }
}