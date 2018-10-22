package fr.p10.miage.rps.model;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import static org.testng.Assert.*;

public class RockPaperScissorsTest {

    RockPaperScissors rps;

    @BeforeMethod
    public void setUp() {
        this.rps = new RockPaperScissors();
    }

    @AfterMethod
    public void tearDown() {
        this.rps = null;
    }

    @Test
    public void testPlay() {
    }

    @Test
    void testWinPlay(String p1, String p2){
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2), Result.WIN));
    }
}