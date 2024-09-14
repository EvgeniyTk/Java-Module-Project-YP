public class Race {
    String leaderCarName = ""; //Название автомобиля-лидера
    int leaderDistance = 0; //Дистанция автомобиля-лидера

    public void setLeaderCar(Car car) {
        int distanceNewCar = 24 * car.speed;
        if (distanceNewCar >= leaderDistance) {
            this.leaderDistance = distanceNewCar;
            this.leaderCarName = car.carName;
        }
    }
}
