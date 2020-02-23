![Java CI](https://github.com/altfatterz/jgitver-demo/workflows/Java%20CI/badge.svg)

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
