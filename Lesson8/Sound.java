package G.Lesson8;

public enum Sound {
    MEOW {
        @Override
        public String makeSound() {
            return "Мяу!";
        }
    },
    WOOF {
        @Override
        public String makeSound() {
            return "Гав!";
        }
    },
    CHIRP {
        @Override
        public String makeSound() {
            return "Чирик!";
        }
    },
    MOO {
        @Override
        public String makeSound() {
            return "Му!";
        }
    },
    QUACK {
        @Override
        public String makeSound() {
            return "Кря!";
        }
    },
    BULK {
        @Override
        public String makeSound() {
            return "Бульк!";
        }
    };

    public abstract String makeSound();
}
