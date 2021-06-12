# JenkinsRelated

This repo is related to Jenkins and Jenkinsfiles ( And is still under developement of adding more groovy scripts )

Below is the files and their descrption for the files.

- deleteJobs.groovy
- getAllParams.groovy
- getJobParamsJenkinsFile.groovy
- lockBranchJob.groovy
- gitCommands.md
  - Basic GIT commands
- generalCommands.md
  - General useful commands in day-to-day activities.
- dockerCommands.md
  - Basic docker commands

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

### lockBranchJob.groovy
- For multi-branch pipeline in Jenkins, if we want to disable the parallel execution of multiple branch jobs, we can make you use of `LockableResourcesManager` in Jenkins.
- Install the plugin [lockable-resources](https://plugins.jenkins.io/lockable-resources/)
- `lockBranchJob.groovy` provides example the usage of same. We can code a little bit more to fail/abort the build which is trying to build when an another build is in-progress.

### get the password/decrypt the password from credentials.xml
 - Get the encrypted text from the `credentials.xml`
 - Make use of `hudson.util.Secret.decrypt()` function that Jenkins provides
 -  In Jenkins, go to: `<JENKINS_URL>/script` page.
    - Run the command: `println(hudson.util.Secret.decrypt("{XXX=}"))`
    - `println(hudson.util.Secret.fromString("{XXX=}").getPlainText())`
      where `{XXX=}` is your encrypted password. This will print the plain password.
    - To do opposite, run:
      `println(hudson.util.Secret.fromString("some_text").getEncryptedValue())`
