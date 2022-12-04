package Animals;

public class Zoo {
    public static void main(String[] args) {

        Herbivores gazelle = new Herbivores("Газель", 3, "Полупустыня", 70, "Трава");
        Herbivores giraffe = new Herbivores("Жираф", 4, "Тропические степи", 60, "Листья");
        Herbivores horse = new Herbivores("Лошадь", 5, "Конюншни", 60, "Сено");

        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);

        Predators hyena = new Predators("Гиена", 4, "Саванна", 60, "Падаль");
        Predators tiger = new Predators("Тигр", 5, "Саванна", 60, "Мясо животных" );
        Predators bear = new Predators("Медведь", 6, "Лес", 120, "Всеядные");

        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);

        Amphibians frog = new Amphibians("Лягушка", 2, "Водоём");
        Amphibians grasSnake = new Amphibians("Уж пресноводный", 1, "Водоём");

        System.out.println(frog);
        System.out.println(grasSnake);

        NotFling peacock = new NotFling("Павлин", 3, "Саванна", "ходьба");
        NotFling penguin = new NotFling("Пингвин", 3, "Антарктика", "ходьба и плавание");
        NotFling dodoBird = new NotFling("птица Додо", 2,"Джунгли", "ходьба");

        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodoBird);

        Fling seagull = new Fling("Чайка", 2, "Берега водоёмов", "полёт");
        Fling albatross = new Fling("Альбатрос", 4, "Берега водоёмов", "полёт");
        Fling falcon = new Fling("Сокол", 5, "Степь", "полёт");

        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);

    }
}
