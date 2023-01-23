package com.donghyeon.myspringreactor;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.util.Arrays;
import java.util.Map;

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

//    @Test
//    public void distinct() {
//        Flux<String> animalFlux = Flux.just("dog", "cat", "bird", "dog", "bird", "anteater")
//                .distinct();
//        StepVerifier.create(animalFlux)
//                .expectNext("dog", "cat", "bird", "anteater")
//                .verifyComplete();
//    }

//    @Test
//    public void map() {
//        Flux<Player> playerFlux = Flux
//                .just("Michael Jordan", "Scottie Pippen", "Steve Kerr")
//                .map(n -> {
//                    String[] split = n.split("\\s");
//                    return new Player(split[0], split[1]);
//                });
//        playerFlux.subscribe(player -> System.out.println(player.firstName + " " + player.lastName));
//    }

//    @Test
//    public void flatMap() {
//        Flux<Player> playerFlux = Flux
//                .just("Michael Jordan", "Scottie Pippen", "Steve Kerr")
//                .flatMap(player -> Mono.just(player)
//                        .map(mappedPlayer -> {
//                            String[] split = mappedPlayer.split("\\s");
//                            return new Player(split[0], split[1]);
//                        }))
//                .subscribeOn(Schedulers.parallel());
//
//        List<Player> playerList  = new ArrayList<>();
//        playerList.add(new Player("Michael", "Jordan"));
//        playerList.add(new Player("Scottie", "Pippen"));
//        playerList.add(new Player("Steve", "Kerr"));
//
//        playerFlux.subscribe(player -> System.out.printf("%s %s\n", player.firstName, player.lastName));
//    }
//
//    class Player {
//        private String firstName;
//        private String lastName;
//
//        Player(String firstName, String lastName) {
//            this.firstName = firstName;
//            this.lastName = lastName;
//        }
//    }

//    @Test
//    public void buffer() {
//        Flux<String> fruitFlux = Flux.fromStream(Stream.of("apple", "orange", "banana", "kiwi", "strawberry"));
//        Flux<List<String>> bufferedFlux = fruitFlux.buffer(3);
//        StepVerifier.create(bufferedFlux)
//                .expectNext(Arrays.asList("apple", "orange", "banana"))
//                .expectNext(Arrays.asList("kiwi", "strawberry"))
//                .verifyComplete();
//    }

//    @Test
//    public void buffer() {
//        Flux<String> fruitFlux = Flux.just("apple", "orange", "banana", "kiwi", "strawberry")
//                .buffer(3)
//                .flatMap(bufferedList -> Flux.fromIterable(bufferedList)
//                        .map(fruit -> fruit.toUpperCase())
//                        .subscribeOn(Schedulers.parallel()).log());
//        fruitFlux.subscribe();
//    }

//    @Test
//    public void collectList() {
//        Flux<String> fruitFlux = Flux.fromArray(new String[]{"apple", "orange", "banana", "kiwi", "strawberry"});
//        Mono<List<String>> fruitListMono = fruitFlux.collectList();
//        StepVerifier.create(fruitListMono)
//                .expectNext(Arrays.asList("apple", "orange", "banana", "kiwi", "strawberry"))
//                .verifyComplete();
//    }

//    @Test
//    public void collectMap() {
//        Flux<String> animalFlux = Flux
//                .just("aardvark", "elephant", "koala", "eagle", "kangaroo");
//        Mono<Map<Character, String >> animalMapMono = animalFlux.collectMap(a -> a.charAt(0));
//        StepVerifier.create(animalMapMono)
//                .expectNextMatches(map -> {
//                    return map.size() == 3 &&
//                            map.get('a').equals("aardvark") &&
//                            map.get('e').equals("eagle") &&
//                            map.get('k').equals("kangaroo");
//                })
//                .verifyComplete();
//    }

//    @Test
//    public void all() {
//        Flux<String> animalFlux = Flux.just("aardvark", "elephant", "koala", "eagle", "kangaroo");
//        Mono<Boolean> hasAMono = animalFlux.all(a -> a.contains("a"));
//        Mono<Boolean> hasKMono = animalFlux.all(a -> a.contains("k"));
//        StepVerifier.create(hasAMono)
//                .expectNext(true)
//                .verifyComplete();
//        StepVerifier.create(hasKMono)
//                .expectNext(false)
//                .verifyComplete();
//    }

    @Test
    public void any() {
        Flux<String> animalFlux = Flux.fromIterable(Arrays.asList("aardvark", "elephant", "koala", "eagle", "kangaroo"));
        Mono<Boolean> hasTMono = animalFlux.any(a -> a.contains("t"));
        StepVerifier.create(hasTMono)
                .expectNext(true)
                .verifyComplete();

        Mono<Boolean> hasZMono = animalFlux.any(a -> a.contains("z"));
        StepVerifier.create(hasZMono)
                .expectNext(false)
                .verifyComplete();
    }

}
