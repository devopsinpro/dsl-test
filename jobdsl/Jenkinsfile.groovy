pipelineJob('JenkinsFile-Test') {
  definition {
    cpsScm {
        scm {
          git {
            remote {
              url ('https://github.com/devopsinpro/dsl-test.git')
              credentials('jenkins-github-ssh')
            }
          }
        }
        scriptPath("auth/Jenkinsfile")
    }
  }
}