package Chapter9;

import org.junit.jupiter.api.*;

/**
 * This Class demonstrates use of different annotations from Junit5
 * <ol>
 *     <li>Sanity Testing     : Test fot basic functionality after a fix, change or addition of a feature/li>
 *     <li>Regression Test    : After confirmation that a fix has been done correctly test if nothing was affected</li>
 *     <li>Integration Test   : Test to see if different components of the system work well together</li>
 * </ol>
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ExploreAnnotations {

    @BeforeAll
    static void setup(){
        System.err.println("Setup");
    }

    @AfterAll
    static void tearDown(){
        System.out.println("Realising all resources");
    }

    @BeforeEach
    void beforeEachTest(){
        System.out.println("Before each test case");
    }

    @AfterEach
    void afterEachTest(){
        System.out.println("After each test case");
    }

    @Test
    @DisplayName("TC1 - First Test")
    @Order(1)
    @Tag("Sanity")
    void firstTest(){
        System.out.println("-----Fist Test Method");
    }

    @Test
    @DisplayName("TC2 - Second Test")
    @Order(2)
    @Tag("Integration")
    @Tag("Regression")
    void secondTest(){
        System.out.println("-----Second Test Method");
    }

    @Test
    @DisplayName("TC3 - Third Test")
    @Tag("Sanity")
    @Order(3)
    void thirdTest(){
        System.out.println("-----Third Test Method");
    }

    @Test
    @DisplayName("TC4 - Test Sum")
    @Order(4)
    @Tag("Regression")
    void testSum(){
        //Arrange - Inputs and expected results
        int num1 = 6;
        int num2 = 3;
        int expectedSum = 9;
        System.out.println("Test Sum");
    }
}
