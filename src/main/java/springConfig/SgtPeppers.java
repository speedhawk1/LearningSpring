package springConfig;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/3/8.
 */
@Component
public class SgtPeppers implements CompactDisc{

    private String title = "Lonely Hearts";
    private String artist = "for the Beatles";
    @Override
    public void play() {
        System.out.println(title + artist);
    }
}

