# GitBucket Runner

Run `sbt package` and copy generated `/target/scala-2.12/gitbucket-helloworld-plugin_2.12-1.0.0.jar` to `~/.gitbucket/plugins/` (If the directory does not exist, create it by hand before copying the jar).


## Push


### headers

```
Content-Type: application/x-www-form-urlencoded
X-Github-Event: push
X-Github-Delivery: 99bb0d12-3014-42b8-8f19-2e9730da8679
Content-Length: 3981
Host: localhost:8080
Connection: Keep-Alive
User-Agent: Apache-HttpClient/4.5.3 (Java/1.8.0_121)
Accept-Encoding: gzip,deflate
```


### payload

```json
{
    "pusher": {
        "name": "k33g",
        "email": "ph.charriere@gmail.com"
    },
    "sender": {
        "login": "k33g",
        "email": "ph.charriere@gmail.com",
        "type": "User",
        "site_admin": true,
        "created_at": "2017-05-26T08:42:49Z",
        "url": "http://localhost:8080/api/v3/users/k33g",
        "html_url": "http://localhost:8080/k33g",
        "avatar_url": "http://localhost:8080/k33g/_avatar"
    },
    "ref": "refs/heads/master",
    "before": "5ca540329fb25125d00e2c1cb0a6905e369a9085",
    "after": "bee081695f284ebaea5539908ff490afa955b1f1",
    "commits": [
        {
            "id": "49a1ffaf9f2624edaa34d084963fac51b10e4392",
            "message": "Update README.md",
            "timestamp": "2017-05-26T08:46:50Z",
            "added": [],
            "removed": [],
            "modified": [
                "README.md"
            ],
            "author": {
                "name": "Philippe CHARRIERE",
                "email": "ph.charriere@gmail.com",
                "date": "2017-05-26T08:46:50Z"
            },
            "committer": {
                "name": "Philippe CHARRIERE",
                "email": "ph.charriere@gmail.com",
                "date": "2017-05-26T08:46:50Z"
            },
            "url": "http://localhost:8080/k33g/hello-world-js/commit/49a1ffaf9f2624edaa34d084963fac51b10e4392"
        },
        {
            "id": "5ca540329fb25125d00e2c1cb0a6905e369a9085",
            "message": "Initial commit",
            "timestamp": "2017-05-26T08:43:25Z",
            "added": [
                "README.md"
            ],
            "removed": [],
            "modified": [],
            "author": {
                "name": "Philippe CHARRIERE",
                "email": "ph.charriere@gmail.com",
                "date": "2017-05-26T08:43:25Z"
            },
            "committer": {
                "name": "Philippe CHARRIERE",
                "email": "ph.charriere@gmail.com",
                "date": "2017-05-26T08:43:25Z"
            },
            "url": "http://localhost:8080/k33g/hello-world-js/commit/5ca540329fb25125d00e2c1cb0a6905e369a9085"
        }
    ],
    "repository": {
        "name": "hello-world-js",
        "full_name": "k33g/hello-world-js",
        "description": "",
        "watchers": 0,
        "forks": 0,
        "private": false,
        "default_branch": "master",
        "owner": {
            "login": "k33g",
            "email": "ph.charriere@gmail.com",
            "type": "User",
            "site_admin": true,
            "created_at": "2017-05-26T08:42:49Z",
            "url": "http://localhost:8080/api/v3/users/k33g",
            "html_url": "http://localhost:8080/k33g",
            "avatar_url": "http://localhost:8080/k33g/_avatar"
        },
        "forks_count": 0,
        "watchers_count": 0,
        "url": "http://localhost:8080/k33g/hello-world-js",
        "http_url": "http://localhost:8080/git/k33g/hello-world-js.git",
        "clone_url": "http://localhost:8080/git/k33g/hello-world-js.git",
        "html_url": "http://localhost:8080/k33g/hello-world-js"
    },
    "compare": "http://localhost:8080/k33g/hello-world-js/compare/5ca540329fb25125d00e2c1cb0a6905e369a9085...bee081695f284ebaea5539908ff490afa955b1f1",
    "head_commit": {
        "id": "5ca540329fb25125d00e2c1cb0a6905e369a9085",
        "message": "Initial commit",
        "timestamp": "2017-05-26T08:43:25Z",
        "added": [
            "README.md"
        ],
        "removed": [],
        "modified": [],
        "author": {
            "name": "Philippe CHARRIERE",
            "email": "ph.charriere@gmail.com",
            "date": "2017-05-26T08:43:25Z"
        },
        "committer": {
            "name": "Philippe CHARRIERE",
            "email": "ph.charriere@gmail.com",
            "date": "2017-05-26T08:43:25Z"
        },
        "url": "http://localhost:8080/k33g/hello-world-js/commit/5ca540329fb25125d00e2c1cb0a6905e369a9085"
    }
}
```

## Pull Request

### Creation

```json
{"action":"opened","number":4,"repository":{"name":"hector","full_name":"GBTools/hector","description":"","watchers":0,"forks":0,"private":false,"default_branch":"master","owner":{"login":"GBTools","email":"GBTools@devnull","type":"Organization","site_admin":false,"created_at":"2017-09-10T03:59:23Z","url":"http://localhost:8080/api/v3/users/GBTools","html_url":"http://localhost:8080/GBTools","avatar_url":"http://localhost:8080/GBTools/_avatar"},"forks_count":0,"watchers_count":0,"url":"http://localhost:8080/api/v3/repos/GBTools/hector","http_url":"http://localhost:8080/git/GBTools/hector.git","clone_url":"http://localhost:8080/git/GBTools/hector.git","html_url":"http://localhost:8080/GBTools/hector"},"pull_request":{"number":4,"updated_at":"2017-09-10T06:22:12Z","created_at":"2017-09-10T06:22:12Z","head":{"sha":"3b9fc2d5c1e8ca028ad3901fad06521b55963962","ref":"wip-wip","repo":{"name":"hector","full_name":"GBTools/hector","description":"","watchers":0,"forks":0,"private":false,"default_branch":"master","owner":{"login":"GBTools","email":"GBTools@devnull","type":"Organization","site_admin":false,"created_at":"2017-09-10T03:59:23Z","url":"http://localhost:8080/api/v3/users/GBTools","html_url":"http://localhost:8080/GBTools","avatar_url":"http://localhost:8080/GBTools/_avatar"},"forks_count":0,"watchers_count":0,"url":"http://localhost:8080/api/v3/repos/GBTools/hector","http_url":"http://localhost:8080/git/GBTools/hector.git","clone_url":"http://localhost:8080/git/GBTools/hector.git","html_url":"http://localhost:8080/GBTools/hector"},"label":"wip-wip","user":{"login":"GBTools","email":"GBTools@devnull","type":"Organization","site_admin":false,"created_at":"2017-09-10T03:59:23Z","url":"http://localhost:8080/api/v3/users/GBTools","html_url":"http://localhost:8080/GBTools","avatar_url":"http://localhost:8080/GBTools/_avatar"}},"base":{"sha":"1aef8d9b79a02e6c53d6627129c0dfb30f303ad7","ref":"master","repo":{"name":"hector","full_name":"GBTools/hector","description":"","watchers":0,"forks":0,"private":false,"default_branch":"master","owner":{"login":"GBTools","email":"GBTools@devnull","type":"Organization","site_admin":false,"created_at":"2017-09-10T03:59:23Z","url":"http://localhost:8080/api/v3/users/GBTools","html_url":"http://localhost:8080/GBTools","avatar_url":"http://localhost:8080/GBTools/_avatar"},"forks_count":0,"watchers_count":0,"url":"http://localhost:8080/api/v3/repos/GBTools/hector","http_url":"http://localhost:8080/git/GBTools/hector.git","clone_url":"http://localhost:8080/git/GBTools/hector.git","html_url":"http://localhost:8080/GBTools/hector"},"label":"master","user":{"login":"GBTools","email":"GBTools@devnull","type":"Organization","site_admin":false,"created_at":"2017-09-10T03:59:23Z","url":"http://localhost:8080/api/v3/users/GBTools","html_url":"http://localhost:8080/GBTools","avatar_url":"http://localhost:8080/GBTools/_avatar"}},"merged":false,"title":"Update notes.txt","body":"hello","user":{"login":"k33g","email":"ph.charriere@gmail.com","type":"User","site_admin":true,"created_at":"2017-05-26T08:42:49Z","url":"http://localhost:8080/api/v3/users/k33g","html_url":"http://localhost:8080/k33g","avatar_url":"http://localhost:8080/k33g/_avatar"},"html_url":"http://localhost:8080/GBTools/hector/pull/4","url":"http://localhost:8080/api/v3/repos/GBTools/hector/pulls/4","commits_url":"http://localhost:8080/api/v3/repos/GBTools/hector/pulls/4/commits","review_comments_url":"http://localhost:8080/api/v3/repos/GBTools/hector/pulls/4/comments","review_comment_url":"http://localhost:8080/api/v3/repos/GBTools/hector/pulls/comments/{number}","comments_url":"http://localhost:8080/api/v3/repos/GBTools/hector/issues/4/comments","statuses_url":"http://localhost:8080/api/v3/repos/GBTools/hector/statuses/3b9fc2d5c1e8ca028ad3901fad06521b55963962"},"sender":{"login":"k33g","email":"ph.charriere@gmail.com","type":"User","site_admin":true,"created_at":"2017-05-26T08:42:49Z","url":"http://localhost:8080/api/v3/users/k33g","html_url":"http://localhost:8080/k33g","avatar_url":"http://localhost:8080/k33g/_avatar"}}
```

### Merge on master

action = closed
pull_request / base / ref (origin) 
pull_request / base / label (origin) 

pull_request / head / ref
pull_request / head / label

merged = true

```json
{"action":"closed","number":4,"repository":{"name":"hector","full_name":"GBTools/hector","description":"","watchers":0,"forks":0,"private":false,"default_branch":"master","owner":{"login":"GBTools","email":"GBTools@devnull","type":"Organization","site_admin":false,"created_at":"2017-09-10T03:59:23Z","url":"http://localhost:8080/api/v3/users/GBTools","html_url":"http://localhost:8080/GBTools","avatar_url":"http://localhost:8080/GBTools/_avatar"},"forks_count":0,"watchers_count":0,"url":"http://localhost:8080/api/v3/repos/GBTools/hector","http_url":"http://localhost:8080/git/GBTools/hector.git","clone_url":"http://localhost:8080/git/GBTools/hector.git","html_url":"http://localhost:8080/GBTools/hector"},"pull_request":{"number":4,"updated_at":"2017-09-10T06:24:46Z","created_at":"2017-09-10T06:22:12Z","head":{"sha":"3b9fc2d5c1e8ca028ad3901fad06521b55963962","ref":"wip-wip","repo":{"name":"hector","full_name":"GBTools/hector","description":"","watchers":0,"forks":0,"private":false,"default_branch":"master","owner":{"login":"GBTools","email":"GBTools@devnull","type":"Organization","site_admin":false,"created_at":"2017-09-10T03:59:23Z","url":"http://localhost:8080/api/v3/users/GBTools","html_url":"http://localhost:8080/GBTools","avatar_url":"http://localhost:8080/GBTools/_avatar"},"forks_count":0,"watchers_count":0,"url":"http://localhost:8080/api/v3/repos/GBTools/hector","http_url":"http://localhost:8080/git/GBTools/hector.git","clone_url":"http://localhost:8080/git/GBTools/hector.git","html_url":"http://localhost:8080/GBTools/hector"},"label":"wip-wip","user":{"login":"GBTools","email":"GBTools@devnull","type":"Organization","site_admin":false,"created_at":"2017-09-10T03:59:23Z","url":"http://localhost:8080/api/v3/users/GBTools","html_url":"http://localhost:8080/GBTools","avatar_url":"http://localhost:8080/GBTools/_avatar"}},"base":{"sha":"1aef8d9b79a02e6c53d6627129c0dfb30f303ad7","ref":"master","repo":{"name":"hector","full_name":"GBTools/hector","description":"","watchers":0,"forks":0,"private":false,"default_branch":"master","owner":{"login":"GBTools","email":"GBTools@devnull","type":"Organization","site_admin":false,"created_at":"2017-09-10T03:59:23Z","url":"http://localhost:8080/api/v3/users/GBTools","html_url":"http://localhost:8080/GBTools","avatar_url":"http://localhost:8080/GBTools/_avatar"},"forks_count":0,"watchers_count":0,"url":"http://localhost:8080/api/v3/repos/GBTools/hector","http_url":"http://localhost:8080/git/GBTools/hector.git","clone_url":"http://localhost:8080/git/GBTools/hector.git","html_url":"http://localhost:8080/GBTools/hector"},"label":"master","user":{"login":"GBTools","email":"GBTools@devnull","type":"Organization","site_admin":false,"created_at":"2017-09-10T03:59:23Z","url":"http://localhost:8080/api/v3/users/GBTools","html_url":"http://localhost:8080/GBTools","avatar_url":"http://localhost:8080/GBTools/_avatar"}},"merged":true,"merged_at":"2017-09-10T06:24:46Z","merged_by":{"login":"k33g","email":"ph.charriere@gmail.com","type":"User","site_admin":true,"created_at":"2017-05-26T08:42:49Z","url":"http://localhost:8080/api/v3/users/k33g","html_url":"http://localhost:8080/k33g","avatar_url":"http://localhost:8080/k33g/_avatar"},"title":"Update notes.txt","body":"hello","user":{"login":"k33g","email":"ph.charriere@gmail.com","type":"User","site_admin":true,"created_at":"2017-05-26T08:42:49Z","url":"http://localhost:8080/api/v3/users/k33g","html_url":"http://localhost:8080/k33g","avatar_url":"http://localhost:8080/k33g/_avatar"},"html_url":"http://localhost:8080/GBTools/hector/pull/4","url":"http://localhost:8080/api/v3/repos/GBTools/hector/pulls/4","commits_url":"http://localhost:8080/api/v3/repos/GBTools/hector/pulls/4/commits","review_comments_url":"http://localhost:8080/api/v3/repos/GBTools/hector/pulls/4/comments","review_comment_url":"http://localhost:8080/api/v3/repos/GBTools/hector/pulls/comments/{number}","comments_url":"http://localhost:8080/api/v3/repos/GBTools/hector/issues/4/comments","statuses_url":"http://localhost:8080/api/v3/repos/GBTools/hector/statuses/3b9fc2d5c1e8ca028ad3901fad06521b55963962"},"sender":{"login":"k33g","email":"ph.charriere@gmail.com","type":"User","site_admin":true,"created_at":"2017-05-26T08:42:49Z","url":"http://localhost:8080/api/v3/users/k33g","html_url":"http://localhost:8080/k33g","avatar_url":"http://localhost:8080/k33g/_avatar"}}

```

### Merge between branches

action = closed
pull_request / base / ref (origin) 
pull_request / base / label (origin) 

pull_request / head / ref
pull_request / head / label

merged = true

```json
{"action":"closed","number":5,"repository":{"name":"hector","full_name":"GBTools/hector","description":"","watchers":0,"forks":0,"private":false,"default_branch":"master","owner":{"login":"GBTools","email":"GBTools@devnull","type":"Organization","site_admin":false,"created_at":"2017-09-10T03:59:23Z","url":"http://localhost:8080/api/v3/users/GBTools","html_url":"http://localhost:8080/GBTools","avatar_url":"http://localhost:8080/GBTools/_avatar"},"forks_count":0,"watchers_count":0,"url":"http://localhost:8080/api/v3/repos/GBTools/hector","http_url":"http://localhost:8080/git/GBTools/hector.git","clone_url":"http://localhost:8080/git/GBTools/hector.git","html_url":"http://localhost:8080/GBTools/hector"},"pull_request":{"number":5,"updated_at":"2017-09-10T06:28:51Z","created_at":"2017-09-10T06:28:35Z","head":{"sha":"156e897d99cb79d7118473b734d99bdc7286c333","ref":"wip-b","repo":{"name":"hector","full_name":"GBTools/hector","description":"","watchers":0,"forks":0,"private":false,"default_branch":"master","owner":{"login":"GBTools","email":"GBTools@devnull","type":"Organization","site_admin":false,"created_at":"2017-09-10T03:59:23Z","url":"http://localhost:8080/api/v3/users/GBTools","html_url":"http://localhost:8080/GBTools","avatar_url":"http://localhost:8080/GBTools/_avatar"},"forks_count":0,"watchers_count":0,"url":"http://localhost:8080/api/v3/repos/GBTools/hector","http_url":"http://localhost:8080/git/GBTools/hector.git","clone_url":"http://localhost:8080/git/GBTools/hector.git","html_url":"http://localhost:8080/GBTools/hector"},"label":"wip-b","user":{"login":"GBTools","email":"GBTools@devnull","type":"Organization","site_admin":false,"created_at":"2017-09-10T03:59:23Z","url":"http://localhost:8080/api/v3/users/GBTools","html_url":"http://localhost:8080/GBTools","avatar_url":"http://localhost:8080/GBTools/_avatar"}},"base":{"sha":"2e8ac7e20c54ee47961c480ffb41f2bfb582c14b","ref":"wip-a","repo":{"name":"hector","full_name":"GBTools/hector","description":"","watchers":0,"forks":0,"private":false,"default_branch":"master","owner":{"login":"GBTools","email":"GBTools@devnull","type":"Organization","site_admin":false,"created_at":"2017-09-10T03:59:23Z","url":"http://localhost:8080/api/v3/users/GBTools","html_url":"http://localhost:8080/GBTools","avatar_url":"http://localhost:8080/GBTools/_avatar"},"forks_count":0,"watchers_count":0,"url":"http://localhost:8080/api/v3/repos/GBTools/hector","http_url":"http://localhost:8080/git/GBTools/hector.git","clone_url":"http://localhost:8080/git/GBTools/hector.git","html_url":"http://localhost:8080/GBTools/hector"},"label":"wip-a","user":{"login":"GBTools","email":"GBTools@devnull","type":"Organization","site_admin":false,"created_at":"2017-09-10T03:59:23Z","url":"http://localhost:8080/api/v3/users/GBTools","html_url":"http://localhost:8080/GBTools","avatar_url":"http://localhost:8080/GBTools/_avatar"}},"merged":true,"merged_at":"2017-09-10T06:28:51Z","merged_by":{"login":"k33g","email":"ph.charriere@gmail.com","type":"User","site_admin":true,"created_at":"2017-05-26T08:42:49Z","url":"http://localhost:8080/api/v3/users/k33g","html_url":"http://localhost:8080/k33g","avatar_url":"http://localhost:8080/k33g/_avatar"},"title":"Update notes.txt","body":"","user":{"login":"k33g","email":"ph.charriere@gmail.com","type":"User","site_admin":true,"created_at":"2017-05-26T08:42:49Z","url":"http://localhost:8080/api/v3/users/k33g","html_url":"http://localhost:8080/k33g","avatar_url":"http://localhost:8080/k33g/_avatar"},"html_url":"http://localhost:8080/GBTools/hector/pull/5","url":"http://localhost:8080/api/v3/repos/GBTools/hector/pulls/5","commits_url":"http://localhost:8080/api/v3/repos/GBTools/hector/pulls/5/commits","review_comments_url":"http://localhost:8080/api/v3/repos/GBTools/hector/pulls/5/comments","review_comment_url":"http://localhost:8080/api/v3/repos/GBTools/hector/pulls/comments/{number}","comments_url":"http://localhost:8080/api/v3/repos/GBTools/hector/issues/5/comments","statuses_url":"http://localhost:8080/api/v3/repos/GBTools/hector/statuses/156e897d99cb79d7118473b734d99bdc7286c333"},"sender":{"login":"k33g","email":"ph.charriere@gmail.com","type":"User","site_admin":true,"created_at":"2017-05-26T08:42:49Z","url":"http://localhost:8080/api/v3/users/k33g","html_url":"http://localhost:8080/k33g","avatar_url":"http://localhost:8080/k33g/_avatar"}}

```



