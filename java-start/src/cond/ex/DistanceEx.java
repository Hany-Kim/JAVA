package cond.ex;

public class DistanceEx {
    public static void main(String[] args) {
        int distance = 105;
        String rideThing = "";

        if(distance <= 1){
            rideThing = "도보";
        }
        else if(distance <= 10){
            rideThing = "자전거";
        }
        else if(distance <= 100){
            rideThing = "자동차";
        }
        else {
            rideThing = "비행기";
        }
        System.out.println(rideThing + "를 이용하세요");
    }
}
