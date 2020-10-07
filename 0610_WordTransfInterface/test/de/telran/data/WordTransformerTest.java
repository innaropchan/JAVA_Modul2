package de.telran.data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordTransformerTest {

    @Test
    public void testTransformToUpperCase() {
        WordTransformer wordTransformer = new WordTransformer();
        String s = wordTransformer.transform("aa RTYUI fgh GHFj", new ToUpperCase());
        Assert.assertTrue("AGHJ KLU jgkslg TTT", true);
    }

    @Test
    public void testTransformToLowerCae() {
        WordTransformer wordTransformer = new WordTransformer();
        String s = wordTransformer.transform("aa RTYUI fgh GHFj", new ToLowerCase());
        Assert.assertTrue("aghj kLU jgkslg ttt", true);
    }

    @Test
    public void testTransformToStarCase() {
        WordTransformer wordTransformer = new WordTransformer();
        String s = wordTransformer.transform("aa RTYUI fgh GHFj", new ToStarCase());
        Assert.assertTrue("AGHJ kLU ****** ttT", true);
    }
}
