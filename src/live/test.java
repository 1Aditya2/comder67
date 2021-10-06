package live;
import music.play.playable1;
import music.string.veena;
import music.wind.saxophone;

public class test {
    public static void main(String[] args) {
        veena v=new veena();
        v.play();
        saxophone s=new saxophone();
        s.play();
        playable1 p[]={v,s};
        for (int i = 0; i < p.length; i++) {
            p[i].play();
        }
    }
}