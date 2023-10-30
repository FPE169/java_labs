package Lab_4.Season;

public enum Season {
    SPRING(19) {
        @Override
        public String getDescription() {
            return "Прохладное время года";
        }
    },
    SUMMER(30) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(10) {
        @Override
        public String getDescription() {
            return "Прохладное время года";
        }
    },
    WINTER(-15) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    };

    private int averageTemperature;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "Время года";
    }
}
