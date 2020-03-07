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

GitHub Registry:

1. Create a GitHub Personal Access token
2. Save it in ~/GH_TOKEN.txt

```bash
$ cat ~/GH_TOKEN.txt | docker login -u altfatterz docker.pkg.github.com --password-stdin
$ docker tag IMAGE_ID docker.pkg.github.com/altfatterz/two-step-login/IMAGE_NAME:VERSION
$ docker push docker.pkg.github.com/altfatterz/two-step-login/IMAGE_NAME:VERSION
```

```
$ ./gradlew version
> Task :version
Version: 0.0.0-12
```




Resources
1. https://martinheinz.dev/blog/6
2. https://medium.com/@shanemyrick/publishing-to-github-packages-with-gradle-and-github-actions-4ad842634c4e
3. https://github.com/smyrick/kotlin-extensions/blob/master/.github/workflows/publish-release.yml
4. https://zoltanaltfatter.com/2019/08/16/dockerizing-spring-boot-apps-with-jib/
5. https://medium.com/curiosity-driven-development/how-to-dockerize-a-spring-boot-app-with-googles-jib-53dcac56a2e1

1. Create with Jib
2. Version the docker image with jgitver
3. Publish the docker image to GitHub Packages
