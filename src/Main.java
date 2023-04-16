public class Main {
    public static void main(String[] args) {

        //1. Stwórz klasę Dog z prywatnymi polami: imię oraz rasa psa. Zastanów się, dla których stworzyć
        //gettery i settery –imię psa można zmienić, lecz rasę -nie.
        //Dla klasy zdefiniuj także toString() – dzięki, której wyświetlisz informację o obiekcie w konsoli.

        Dog dog = new Dog("Borys", "Owczarek niemiecki");
        Dog dog1 = new Dog("Brutus", "Labrador");
        Dog dog2 = new Dog("Linda", "Jamnik");

        System.out.println("Dog nr 1: " + dog.toString() + "\nDog nr 2: " + dog1.toString() + "\nDog nr 3: " + dog2.toString());

        dog.setImie("Luna");
        dog1.setImie("Aleks");
        System.out.println("   " + "\n" + "Aktualizacja imion: ");
        System.out.println("Dog nr 1: " + dog.toString() + "\nDog nr 2: " + dog1.toString() + "\nDog nr 3: " + dog2.toString());

    }
}