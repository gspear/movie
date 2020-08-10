# movie


1. Create Empty Intellij Project
1. Add Module - movie-catalog-service, Add spring boot, spring mvc, lombok, micrometer and promethus dependency
1. Add Module - movie-info-service, Add spring boot, spring mvc, lombok, micrometer and promethus dependency
1. Add Module - ratings-data-service, Add spring boot, spring mvc, lombok, micrometer and promethus dependency
<<<<<<< HEAD
git 
=======
1. For each of the service add to application yaml property below
management:
  endpoints:
    web:
      exposure:
        include: "*"
1. Add Dockerfile to each of the project
1. Update pom to add spotify plugin, so that on mvn packge docker image is created during CI/CD builds
>>>>>>> docker
