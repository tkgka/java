import gsm.util.*;

public class GSM14 {
    public static void main(String[] args) {
        // ��ȭ 3���� MovieArray�� �����ϰ� ����Ͻÿ�.
        MovieArray gsm = new MovieArray(3);
        gsm.add(new MovieVO("�����", "�۰�ȣ", 10000, 15));
        gsm.add(new MovieVO("����", "�۰�ȣ", 10000, 12));
        gsm.add(new MovieVO("������ �߾�", "���ȯ", 10000, 12));

        for(int i = 0; i<gsm.size();i++){
            System.out.println(gsm.get(i));
        }

}
}