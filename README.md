![Java CI](https://github.com/altfatterz/jgitver-demo/workflows/Java%20CI/badge.svg)

This is work in progress

Default image name:

```
docker.io/library/jgitver-demo:0.0.1-SNAPSHOT
```

CNB (Cloud Native Buildpack)
- is turning the source code into a runnable OCI image.

Buildpacks provide a higher-level abstraction for building apps compared to Dockerfiles

https://hub.docker.com/r/cloudfoundry/cnb


```
./gradlew version
```

```
Version: 0.0.0-NOT_A_GIT_REPOSITORY
```


```
./gradlew bootBuildImage
```

Resources
https://martinheinz.dev/blog/6
https://medium.com/@shanemyrick/publishing-to-github-packages-with-gradle-and-github-actions-4ad842634c4e
https://github.com/smyrick/kotlin-extensions/blob/master/.github/workflows/publish-release.yml
https://zoltanaltfatter.com/2019/08/16/dockerizing-spring-boot-apps-with-jib/

1. Create with Jib
2. Version the docker image with jgitver
3. Publish the docker image to GitHub Packages
