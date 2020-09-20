import hudson.model.Job
import hudson.model.ParametersAction
import jenkins.model.Jenkins

for (Job job : Jenkins.instanceOrNull.getAllItems(Job.class)) {

        println("------------------------------------------------")
       
        def build = job.getBuilds().getLastBuild()
        def parameters = build?.getAllActions().find{ it instanceof ParametersAction }?.parameters
        if(parameters == null){
            println "No Parameters for "+job.fullName+" Job"
        } else {
             parameters.each {
                println "parameter ${it.name}: ${it.value}"
            }
        }
        
}
