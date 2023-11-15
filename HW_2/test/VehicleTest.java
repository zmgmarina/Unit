package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.assertj.core.api.Assertions.*;


class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    void setup() {
        car = new Car("BMW","X3",2018);
        motorcycle = new Motorcycle("YAMAHA","R1",2007);
    }

    @Test
    @DisplayName("Car является экземпляром транспортного средства")
    void carIsVehicle() {
        assertThat(car).isInstanceOf(Vehicle.class);
    }

    @Test
    @DisplayName("Car имеет 4 колеса")
    void carHaveFourWheels() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    @DisplayName("Motorcycle создается с 2-мя колесами")
    void motorcycleHaveTwoWheels() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    @DisplayName("Car развивает скорость 60 в режиме тестового вождения ")
    void carSpeedTest() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    @DisplayName("Motorcycle развивает скорость 75 в режиме тестового вождения ")
    void motorcycleSpeedTest() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    @DisplayName("в режиме парковки машина останавливается (speed = 0)")
    void carParkTest() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    @DisplayName("Motorcycle в режиме парковки останавливается (speed = 0)")
    void motorcycleParkTest() {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }

}

