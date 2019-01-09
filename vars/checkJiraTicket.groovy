#!/usr/bin/groovy

def call(icpRegistryUrl, icpRegistryCredsId, icpRegistryNamespace, serviceName, path) {
  sh """
  mkdir -p ${path}docker
  cp ${path}target/*.jar ${path}docker/
  cp -r ${path}src/main/docker/* ${path}docker/
  """

  docker.withRegistry("https://${icpRegistryUrl}", "${icpRegistryCredsId}") {
      def myImage = docker.build("${icpRegistryNamespace}/${serviceName}:${env.BUILD_TIMESTAMP}", "${path}/docker")
      myImage.push()
  }
}
