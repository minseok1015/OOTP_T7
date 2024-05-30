pipeline {
    agent any

    tools {
        // Install the Gradle version configured as "gradle" and add it to the path.
        gradle "gradle"
    }

    stages {
        stage('Checkout') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main', credentialsId: 'github-repo-token', url: 'https://github.com/minseok1015/OOTP_T7'
            }
        }
        stage('Build') {
            steps {
                // Run Gradle on a Unix agent.
                sh "./gradlew clean build"

                // To run Gradle on a Windows agent, use
                // bat "gradlew clean build"
            }
        }
    }

    post {
        // If Gradle was able to run the tests, even if some of the tests
        // failed, record the test results and archive the jar file.
        success {
            junit '**/build/test-results/test/*.xml'
            archiveArtifacts 'build/libs/*.jar'
        }
    }
}
