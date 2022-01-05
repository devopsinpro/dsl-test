
job('super-seed') {
        scm {
          git {
            remote {
              url ("git@github.com:devopsinpro/dsl-test.git")
              credentials('jenkins-github-ssh')
            }
          }
        }
        steps {
          dsl {
            external('Jenkinsfile')
            removeAction('DELETE')
          }
        }
      }
