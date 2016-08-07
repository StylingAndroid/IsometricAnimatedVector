node('connected') {
   stage 'Checkout'
   tool name: 'jgit', type: 'hudson.plugins.git.GitTool'
   git branch: '*', credentialsId: 'e60a77cd-eb1f-4565-95b1-606d8cb7fdc6', url: 'git@github.com:StylingAndroid/IsometricAnimatedVectorPrivate.git'

   stage 'Build'
   sh "./gradlew clean assemble"

   stage "Static Analysis"
   sh "./gradlew check"

   stage "Reporting"
   step([$class: 'LintPublisher', canComputeNew: false, defaultEncoding: '', healthy: '', pattern: '**/build/**/lint-results*.xml', unHealthy: '', unstableTotalAll: '0'])
   step([$class: 'CheckStylePublisher', canComputeNew: false, defaultEncoding: '', healthy: '', pattern: '**/build/**/checkstyle/*.xml', unHealthy: '', unstableTotalAll: '0'])
   step([$class: 'FindBugsPublisher', canComputeNew: false, defaultEncoding: '', excludePattern: '', healthy: '', includePattern: '', pattern: '**/build/**/findbugs/*.xml', unHealthy: '', unstableTotalAll: '0'])
   step([$class: 'PmdPublisher', canComputeNew: false, defaultEncoding: '', healthy: '', pattern: '**/build/**/pmd/*.xml', unHealthy: '', unstableTotalAll: '0'])
}
