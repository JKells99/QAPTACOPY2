package com.keyin;

import com.keyin.SuggestionEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

@ExtendWith(MockitoExtension.class)
public class SuggestionEnginneTest {
    private SuggestionEngine suggestionEngine = new SuggestionEngine();



    @Test
    public void testGenerateSuggestions() throws Exception {
        URI uri = ClassLoader.getSystemResource("words.txt").toURI();
        Path path = Paths.get(uri);
        suggestionEngine.loadDictionaryData(path);

//        Assertions.assertTrue(testInstanceSame);
        Assertions.assertTrue(suggestionEngine.generateSuggestions("hellw").contains("hello"));
    }
    @Test
    public void testGenerateSuggestionsExactMatch() throws Exception {
        URI uri = ClassLoader.getSystemResource("words.txt").toURI();
        Path path = Paths.get(uri);
        suggestionEngine.loadDictionaryData(path);

//        Assertions.assertTrue(testInstanceSame);
        Assertions.assertTrue(suggestionEngine.generateSuggestions("hello").contains(""));
    }


//    @Test
//    public  void testArrayOutOfBoundsException() throws IOException, URISyntaxException {
//        URI uri = ClassLoader.getSystemResource("words.txt").toURI();
//        Path path = Paths.get(uri);
//        suggestionEngine.loadDictionaryData(path);
//
//        Exception exception = Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,()->{
//            suggestionEngine.generateSuggestions("");
//        });
//        Assertions.assertEquals("");
//
//    }

    //    @Test
//    public void testMakePayment_InvalidAmount() {
//        double invalidAmount = -50.0;
//
//        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
//            paymentService.makePayment(invalidAmount);
//        });
//        Assertions.assertEquals("Amount Must Be more Than Zero", exception.getMessage());
//
//        verify(paymentProcessor, never()).processPayment(anyDouble());
//    }


}

