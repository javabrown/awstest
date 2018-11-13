package com.javabrown.aws.awstest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@RestController
public class Controller {
    @RequestMapping("/")
    public String home(){
        return "AWS Test Home";
    }

    @RequestMapping(value="/states", method = RequestMethod.GET)
    public List<String> getUsStates() throws URISyntaxException, IOException {
//        Path path = Paths.get(getClass()
//                .getClassLoader().getResource("/us_states.json").toURI());
//        return Files.lines(path).collect(Collectors.joining("\n"));
        return IntStream.range(1,10)
                .mapToObj(i->String.format("response-%s", i)).collect(Collectors.toList());
    }
}
