package sampleswf;

import com.amazonaws.services.simpleworkflow.flow.annotations.Execute;
import com.amazonaws.services.simpleworkflow.flow.annotations.Workflow;
import com.amazonaws.services.simpleworkflow.flow.annotations.WorkflowRegistrationOptions;

/**
 * Created by sudhakar.vasiraju on 1/22/15.
 */
@Workflow
@WorkflowRegistrationOptions(defaultExecutionStartToCloseTimeoutSeconds = 3600)

public interface GreeterWorkflow {

    @Execute(version = "1.0")
    public void greet();

}
