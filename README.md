# JenkinsRelated

This repo is related to Jenkins and Jenkinsfiles ( And is still under developement of adding more groovy scripts )

Below is the files and their descrption for the files.

- deleteJobs.groovy
- getAllParams.groovy
- getJobParamsJenkinsFile.groovy

### deleteJobs.groovy

- This groovy file is for deleting the jobs present in the Jenkins.
- Script expects a string parameter which later in the script converted to list and used in the further steps.
- This script needs to be executed in a `Freestyle` job under `build` section of `Execute System groovy script` step.
  
### getAllParams.groovy

- This script lists all the paramters( i.e. paraters in smiple terms implies the `parameters` in the Jenkins job)
- This script needs to be executed in a `Freestyle` job under `build` section of `Execute System groovy script` step.
 
### getJobParamsJenkinsFile.groovy

- Similar to the above `getAllParams.groovy` script, this `Jenkinsfile` prints the paramters( i.e. paraters in smiple terms implies the `parameters` in the Jenkins job)
- This is not a `freestyle` job but a `pipeline` job type.
