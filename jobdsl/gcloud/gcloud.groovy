pipelineJob('gcloud') {
  definition {
    cpsScm {
        scm {
          git {
            remote {
              url ('git@github.com:devopsinpro/dsl-test.git')
              credentials('jenkins-github-ssh')
            }
          }
        }
        scriptPath("gcloud/Jenkinsfile")
    }
  }
}
