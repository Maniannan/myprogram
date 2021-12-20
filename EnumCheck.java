package com.employee.employeeMongoOperation;


    enum TrafficSignal{
        RED;
        private String action;

        public String getAction(){
            return this.action;
        }
    }


public class EnumCheck {
    public static void main(String args[]){
        TrafficSignal[] traficsignal = TrafficSignal.values();
        for(TrafficSignal tf: traficsignal){
           System.out.println( tf.name() + "---->" + tf.getAction());
        }

    }

}
