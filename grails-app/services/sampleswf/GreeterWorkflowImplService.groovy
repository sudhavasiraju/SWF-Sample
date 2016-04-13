package sampleswf

import com.amazonaws.services.simpleworkflow.flow.core.Promise
import grails.transaction.Transactional

@Transactional
class GreeterWorkflowImplService implements GreeterWorkflow {

       // private GreeterActivities operations = new GreeterActivitiesImplService()

    private GreeterActivitiesClient operations = new GreeterActivitiesClientImpl()

    @Override
    void greet() {
        log.error("in greet of GreeterWorkflowImplService ....")

        Promise<String> name = operations.getName();
        Promise<String> greeting = operations.getGreeting(name);
        operations.say(greeting);


    }
}
