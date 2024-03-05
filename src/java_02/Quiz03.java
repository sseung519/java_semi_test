package java_02;

public class Quiz03 {
    /*
    【문항3】 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다. 이 클래스의 멤버중에
     static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인지 서술하세요. (단, 모든 병사의 공격력과 방어력은 같아야 한다.)(10점)

     답: weapon과 armor와 이것을 올려주는 weaponUp(), armorUp() 에 static을 주어야한다. 모든 병사의 공격력과 방어력을 같이 공유하려면 weapon과 armor에 static을 붙여
     정적으로 만들어줘야한다.
     */
    int x = 0, y = 0; // Marine의 위치좌표(x,y) int hp = 60; // 현재 체력
    int weapon = 6; // 공격력
    int armor = 0; // 방어력
    void weaponUp() { weapon++;
    }
    void armorUp() { armor++;
    }
    void move(int x, int y) {
        this.x = x; // this.x는 인스턴스 변수, x는 지역변수 this.y = y; // this.y는 인스턴스 변수, y는 지역변수
    }
}
