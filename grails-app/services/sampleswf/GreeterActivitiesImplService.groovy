package sampleswf


class GreeterActivitiesImplService implements GreeterActivities{


    @Override
    String getName() {
        log.error("in getName of GreeterActivitiesImplService ....")
        return "World"
    }

    @Override
    String getGreeting(String name) {
        log.error("in getGreeting of GreeterActivitiesImplService ....")
        return "Hello " + name + "!";
    }

    @Override
    void say(String what) {
        log.error("in say of GreeterActivitiesImplService ...."+what)
    }
}
