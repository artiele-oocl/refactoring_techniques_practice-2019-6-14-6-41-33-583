package com.tws.refactoring.extract_variable;

import com.tws.refactoring.extract_method.OwingPrinter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BannerRenderTest {
    @Test
    public void printIEonMac() {
        //given
        BannerRender bannerRender = new BannerRender();
        //when
        String actual = bannerRender.renderBanner("MAC", "IE");
        //then
        String expected =  "IE on Mac?";
        assertEquals(expected, actual);
    }
    @Test
    public void printBanner() {
        //given
        BannerRender bannerRender = new BannerRender();
        //when
        String actual = bannerRender.renderBanner("MAC", "Chrome");
        //then
        String expected =  "banner";
        assertEquals(expected, actual);
    }
}
