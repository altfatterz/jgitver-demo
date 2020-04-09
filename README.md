![Java CI](https://github.com/altfatterz/jgitver-demo/workflows/Java%20CI/badge.svg)

Example code for blog post: [https://zoltanaltfatter.com/2020/04/10/semantic-versioning-with-jgitver/](https://zoltanaltfatter.com/2020/04/10/semantic-versioning-with-jgitver/) 


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




GitHub Registry (Private):

1. Create a GitHub Personal Access token
2. Save it in ~/GH_TOKEN.txt

```bash
$ cat ~/GH_TOKEN.txt | docker login -u altfatterz docker.pkg.github.com --password-stdin
$ docker tag IMAGE_ID docker.pkg.github.com/altfatterz/two-step-login/IMAGE_NAME:VERSION
$ docker push docker.pkg.github.com/altfatterz/two-step-login/IMAGE_NAME:VERSION
```
