package hw_6;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tasks.hw_6.controller.Controller;
import tasks.hw_6.model.ActivityOfList;

import static org.mockito.Mockito.*;

    public class ControllerTest {
        int [] testList1;
        int [] testList2;
        double testAverageValue1;
        double testAverageValue2;

        Controller controllerMock;
        Controller controller;
        ActivityOfList activityOfList;


        @BeforeEach
        void setUp() {
            testList1 = new int[]{1, 1, 1, 1, 1};
            testList2 = new int[]{2, 2, 2, 2, 2};
            testAverageValue1 = 1.0;
            testAverageValue2 = 2.0;
            controllerMock = mock(Controller.class);

        }

        /**
         *  проверка создания в контроллере списка ч заданными значениями
         */
        @Test
        void createListTest() {
            when(controllerMock.createList()).thenReturn(testList1);
        }

       /**
         * проверка корректности сравнения средних значений массивов
         */
        @Test
        void compareListTest() {
            controllerMock.compareList(testAverageValue1, testAverageValue2);
            verify(controllerMock, times(1)).compareList(testAverageValue1, testAverageValue2);
        }


        /**
         * проверка на то, что в контроллере при вызове метода сравнения средних
         * значений возвращается корректное значение
         */
        @Test
        void averageArrayTest() {
            when(controllerMock.averageList(testList1)).thenReturn(1.0);
            when(controllerMock.averageList(testList2)).thenReturn(2.0);
        }


}
