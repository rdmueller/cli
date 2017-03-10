class HelloWorldControllerTest {
    @Test
    void helloWorldShouldWork() {
        def greeting = new HelloWorldController()
                            .hello("Reader")
        assert  greeting ==~ "Hello, Reader[\r\n]+"

    }
}