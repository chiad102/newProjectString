public class Main {
    public static void main(String[] args) {
        String firstName = "Иванов";
        String middleName = "Семён";
        String lastName = "Семёнович";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        String withouYo = fullName.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + withouYo);
    }
}