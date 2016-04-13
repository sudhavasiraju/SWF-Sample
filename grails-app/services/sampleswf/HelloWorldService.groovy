package sampleswf

import grails.transaction.Transactional

@Transactional
class HelloWorldService {

    def serviceMethod() {
        log.error("Hellow World!!!!! in Service")

        GreeterWorkflow greeter = new GreeterWorkflowImplService();
        greeter.greet();
    }
}
