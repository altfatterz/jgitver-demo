![Java CI](https://github.com/altfatterz/jgitver-demo/workflows/Java%20CI/badge.svg)

```bash
$ http :8080/actuator/info
```

```json
{
    "app": {
        "description": "jgitver calculates a project semver compatible version from a git repository",
        "name": "jgitver-demo"
    },
    "build": {
        "artifact": "jgitver-demo",
        "group": "com.example",
        "name": "jgitver-demo",
        "time": "2020-04-09T20:38:44.439Z",
        "version": "0.0.2-1"
    },
    "git": {
        "branch": "master",
        "commit": {
            "id": "de5248a",
            "time": "2020-03-07T21:46:14Z"
        }
    }
}
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
6. .https://docs.spring.io/spring-boot/docs/2.3.x/reference/htmlsingle/#howto-build

