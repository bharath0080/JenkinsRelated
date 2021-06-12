import org.jenkins.plugins.lockableresources.LockableResourcesManager as LRM 
pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                script {
                    if(LRM.get().fromName("Lock_Resources") == null) {
                        lock(resource: "Lock_Resources") {
                        }
                    } else {
                        println "LOCK ACQUIRED BY NAOTHER BUILD"
                        println LRM.get().fromName("Lock_Resources")
                    }
                }
            }
        }
    }
}
