package sampleswf

class HelloWorldController {

    def helloWorldService

    static allowedMethods = [index: 'GET', testin: 'POST']

    def index() {

        log.error("IN HELLO WORLD CONTROLLER!!!!! index method")

    }

    def testin(){

        log.error("IN HELLO WORLD CONTROLLER!!!!!")

        helloWorldService.serviceMethod()

        render (view: 'index')
    }
}
