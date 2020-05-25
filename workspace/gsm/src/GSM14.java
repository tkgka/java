import gsm.util.*;

public class GSM14 {
    public static void main(String[] args) {
        // 영화 3편을 MovieArray에 저장하고 출력하시오.
        MovieArray gsm = new MovieArray(3);
        gsm.add(new MovieVO("기생충", "송강호", 10000, 15));
        gsm.add(new MovieVO("괴물", "송강호", 10000, 12));
        gsm.add(new MovieVO("살인의 추억", "김수환", 10000, 12));

        for(int i = 0; i<gsm.size();i++){
            System.out.println(gsm.get(i));
        }

}
}