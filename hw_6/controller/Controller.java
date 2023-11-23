package tasks.hw_6.controller;

import tasks.hw_6.model.ActivityOfList;

public class Controller {
        ActivityOfList activityOfList;

        public Controller(){
            this.activityOfList = new ActivityOfList();
        }

        public int[] createList() {
            return activityOfList.createList();
        }


        public double averageList(int[] array) {
            return activityOfList.averageList(array);
        }

        public void compareList(double resultAverageOne, double resultAverageTwo){
           activityOfList.compareList(resultAverageOne, resultAverageTwo);
        }



}

