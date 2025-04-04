package bai3;

class Car {
    private String engine;
    private int seats;
    private String color;

    public static class Builder {
        private String engine;
        private int seats;
        private String color;

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.engine = engine;
            car.seats = seats;
            car.color = color;
            return car;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", seats=" + seats +
                ", color='" + color + '\'' +
                '}';
    }
}
