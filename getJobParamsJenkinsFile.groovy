pipeline{
    agent {
        label 'master'
    }
    stages{
        stage('paramCount'){
            steps{
                script{
                    println params.size()
                    params.each {param ->
                        println "${param.key} -> ${param.value} "
                    }
                }
            }
        }
    }
}
