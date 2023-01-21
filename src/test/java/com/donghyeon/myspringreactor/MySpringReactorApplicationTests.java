package com.donghyeon.myspringreactor;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

@SpringBootTest
class MySpringReactorApplicationTests {

    @Test
    void contextLoads() {
    }

//    @Test
//    public void createAFlux_just() {
//        Flux<String> fruitFlux = Flux.just("Apple", "Orange", "Grape", "Banana", "Strawberry");
////        fruitFlux.subscribe(fruit -> System.out.println("Here's some fruit: " + fruit));
//
//        StepVerifier.create(fruitFlux)
//                .expectNext("Apple")
//                .expectNext("Orange")
//                .expectNext("Grape")
//                .expectNext("Banana")
//                .expectNext("Strawberry")
//                .verifyComplete();
//    }
//
//    @Test
//    public void createAFlux_fromArray() {
//        String[] fruits = new String[] {"Apple", "Orange", "Grape", "Banana", "Strawberry"};
//        Flux<String> fruitFlux = Flux.fromArray(fruits);
//
//        StepVerifier.create(fruitFlux)
//                .expectNext("Apple")
//                .expectNext("Orange")
//                .expectNext("Grape")
//                .expectNext("Banana")
//                .expectNext("Strawberry")
//                .verifyComplete();
//    }

//    @Test
//    public void createAFlux_fromIterable() {
//        List<String> fruitList = new ArrayList<>();
//        fruitList.add("Apple");
//        fruitList.add("Orange");
//        fruitList.add("Grape");
//        fruitList.add("Banana");
//        fruitList.add("Strawberry");
//        Flux<String> fruitFlux = Flux.fromIterable(fruitList);
//        StepVerifier.create(fruitFlux)
//                .expectNext("Apple")
//                .expectNext("Orange")
//                .expectNext("Grape")
//                .expectNext("Banana")
//                .expectNext("Strawberry")
//                .verifyComplete();
//    }

//    @Test
//    public void createAFlux_fromStream() {
//        Stream<String> fruitStreams = Stream.of("Apple", "Orange", "Grape", "Banana", "Strawberry");
//        Flux<String> fruitFlux = Flux.fromStream(fruitStreams);
//        StepVerifier.create(fruitFlux)
//                .expectNext("Apple")
//                .expectNext("Orange")
//                .expectNext("Grape")
//                .expectNext("Banana")
//                .expectNext("Strawberry")
//                .verifyComplete();
//    }
//        @Test
//    public void createAFlux_range() {
//        Flux<Integer> intervalFlux = Flux.range(1, 5);
//        StepVerifier.create(intervalFlux)
//                .expectNext(1)
//                .expectNext(2)
//                .expectNext(3)
//                .expectNext(4)
//                .expectNext(5)
//                .verifyComplete();
//    }

//        @Test
//        public void createAFlux_interval() {
//            Flux<Long> intervalFlux = Flux.interval(Duration.ofSeconds(1)).take(5);
//            StepVerifier.create(intervalFlux)
//                    .expectNext(0L)
//                    .expectNext(1L)
//                    .expectNext(2L)
//                    .expectNext(3L)
//                    .expectNext(4L)
//                    .verifyComplete();
//        }

//    @Test
//    public void mergeFluxes() throws InterruptedException {
//        Flux<String> characterFlux = Flux.fromIterable(Arrays.asList("Garfield", "Kojak", "Barbossa"))
//                .delayElements(Duration.ofMillis(500L));
//        Flux<String> foodFlux = Flux.just("Lasagna", "Lollipops", "Apples")
//                .delaySubscription(Duration.ofMillis(250L))
//                .delayElements(Duration.ofMillis(500L));
//
//        Flux<String> mergedFlux = characterFlux.mergeWith(foodFlux);
//        mergedFlux.subscribe(ele -> System.out.println(ele));
//
//        StepVerifier.create(mergedFlux)
//                .expectNext("Garfield")
//                .expectNext("Lasagna")
//                .expectNext("Kojak")
//                .expectNext("Lollipops")
//                .expectNext("Barbossa")
//                .expectNext("Apples")
//                .verifyComplete();
//        Thread.sleep(5000L);
//    }

//    @Test
//    public void zipFluxes() {
//        Flux<String> characterFlux = Flux.fromArray(new String[]{"Garfield", "Kojak", "Barbossa"});
//        Flux<String> foodFlux = Flux.just("Lasagna", "Lollipops", "Apples");
//
//        Flux<Tuple2<String, String>> zippedFlux = Flux.zip(characterFlux, foodFlux);
//
//        StepVerifier.create(zippedFlux)
//                .expectNextMatches(ele -> ele.getT1().equals("Garfield") && ele.getT2().equals("Lasagna"))
//                .expectNextMatches(ele -> ele.getT1().equals("Kojak") && ele.getT2().equals("Lollipops"))
//                .expectNextMatches(ele -> ele.getT1().equals("Barbossa") && ele.getT2().equals("Apples"))
//                .verifyComplete();
//    }

//    @Test
//    public void zipFluxesToObject() {
//        Flux<String> characterFlux = Flux.fromStream(Stream.of("Garfield", "Kojak", "Barbossa"));
//        Flux<String> foodFlux = Flux.fromStream(Arrays.stream(new String[]{"Lasagna", "Lollipops", "Apples"}));
//        Flux<String> zippedFlux = Flux.zip(characterFlux, foodFlux, (c, f) -> c + " eats " + f);
//
//        StepVerifier.create(zippedFlux)
//                .expectNext("Garfield eats Lasagna")
//                .expectNext("Kojak eats Lollipops")
//                .expectNext("Barbossa eats Apples")
//                .verifyComplete();
//    }

//    @Test
//    public void firstFlux() {
//        Flux<String> slowFlux = Flux.fromIterable(Arrays.asList("tortoise", "snail", "sloth"))
//                .delaySubscription(Duration.ofMillis(100L));
//        Flux<String> fastFlux = Flux.fromArray(new String[]{"hare", "cheetah", "squirrel"});
//        Flux<String> firstFlux = Flux.firstWithSignal(slowFlux, fastFlux);
//
//        StepVerifier.create(firstFlux)
//                .expectNext("hare")
//                .expectNext("cheetah")
//                .expectNext("squirrel")
//                .verifyComplete();
//    }

//    @Test
//    public void skipAFew() {
//        Flux<String> skipFlux = Flux.just("one", "two", "skip a few", "ninety nine", "one hundred")
//                .skip(3);
//        StepVerifier.create(skipFlux)
//                .expectNext("ninety nine", "one hundred")
//                .verifyComplete();
//    }

//    @Test
//    public void skipAFewSeconds() throws InterruptedException {
//        System.out.println("start " + LocalDateTime.now());
//        Flux<String> skipFlux = Flux.fromArray(new String[]{"one", "two", "skip a few", "ninety nine", "one hundred"})
//                .delayElements(Duration.ofSeconds(1L))
//                .skip(Duration.ofSeconds(4));
//        skipFlux.subscribe(ele -> System.out.println(ele + LocalDateTime.now()));
//        StepVerifier.create(skipFlux)
//                .expectNext("ninety nine", "one hundred")
//                .verifyComplete();
//        Thread.sleep(7000L);
//    }

//    @Test
//    public void take() {
//        Flux<String> nationParkFlux = Flux.just(
//                "Yellowstone", "Yosemite", "Grand Canyon", "Zion", "Grand Teton")
//                .take(3);
//        StepVerifier.create(nationParkFlux)
//                .expectNext("Yellowstone", "Yosemite", "Grand Canyon")
//                .verifyComplete();
//    }

//    @Test
//    public void take() {
//        Flux<String> nationParkFlux = Flux.fromStream(Stream.of("Yellowstone", "Yosemite", "Grand Canyon", "Zion", "Grand Teton"))
//                .delayElements(Duration.ofSeconds(1))
//                .take(Duration.ofMillis(3500));
//        StepVerifier.create(nationParkFlux)
//                .expectNext("Yellowstone", "Yosemite", "Grand Canyon")
//                .verifyComplete();
//    }

//    @Test
//    public void filter() {
//        Flux<String> nationalParkFlux = Flux.fromIterable(Arrays.asList("Yellowstone", "Yosemite", "Grand Canyon", "Zion", "Grand Teton"))
//                .filter(park -> !park.contains(" "));
//        StepVerifier.create(nationalParkFlux)
//                .expectNext("Yellowstone", "Yosemite", "Zion")
//                .verifyComplete();
//    }

    @Test
    public void distinct() {
        Flux<String> animalFlux = Flux.just("dog", "cat", "bird", "dog", "bird", "anteater")
                .distinct();
        StepVerifier.create(animalFlux)
                .expectNext("dog", "cat", "bird", "anteater")
                .verifyComplete();
    }

}
