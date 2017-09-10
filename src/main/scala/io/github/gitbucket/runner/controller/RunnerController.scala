package io.github.gitbucket.runner.controller

import gitbucket.core.controller.ControllerBase
import org.json4s.JValue

//import org.scalatra.json._
//import org.json4s._
import org.json4s.JsonDSL._
//import org.json4s.Extraction.decompose
//import org.json4s.jackson.JsonMethods.{parse, compact}

class RunnerController extends ControllerBase {

  println("👋 Hey I'm starting routes ...")

  case class Author(name: JValue, email: JValue, date: JValue) {}
  case class Committer(name: JValue, email: JValue, date: JValue)


  case class HeadCommit(
    id: JValue,
    message: JValue,
    timestamp: JValue,
    added: JValue,
    removed: JValue,
    modified: JValue,
    author: Author,
    commiter: Committer,
    url: JValue
  ) {}

  case class Owner(login: JValue,email: JValue,userType: JValue,isSiteAdmin: JValue,createdAt: JValue,url: JValue,htmlUrl: JValue,avatarUrl: JValue)

  case class Repository(
    name: JValue,
    fullName: JValue,
    description: JValue,
    watchers: JValue,
    forks: JValue,
    isPrivate: JValue,
    defaultBranch: JValue,
    owner: Owner,
    forksCount: JValue,
    watchersCount: JValue,
    url: JValue,
    httpUrl: JValue,
    cloneUrl: JValue,
    htmlUrl: JValue
  )

  // here create something to put parameters
  get("/runner"){
    "Hello World!"
  }

  /**
    *
    */

  post("/runner") {

    val gitHubEvent = request.getHeader("X-Github-Event")


    println(s"👋 GitHub Event: ${gitHubEvent}")
    //val payload = params.get("payload")

    val rawPayload = request.body
    val payload = Option(rawPayload)

    payload match {
      case None => println("😡 Huston? We have a problem!")
      case Some(content) => {
        val parsedContent = parse(content)

        // search and read content of Runnerfile.groovy

        val repository = Repository(
          parsedContent \ "repository" \ "name",
          parsedContent \ "repository" \ "full_name",
          parsedContent \ "repository" \ "description",
          parsedContent \ "repository" \ "watchers",
          parsedContent \ "repository" \ "forks",
          parsedContent \ "repository" \ "private",
          parsedContent \ "repository" \ "default_branch",
          Owner(
            parsedContent \ "repository" \ "owner" \ "login",
            parsedContent \ "repository" \ "owner" \ "email",
            parsedContent \ "repository" \ "owner" \ "type",
            parsedContent \ "repository" \ "owner" \ "site_admin",
            parsedContent \ "repository" \ "owner" \ "created_at",
            parsedContent \ "repository" \ "owner" \ "url",
            parsedContent \ "repository" \ "owner" \ "html_url",
            parsedContent \ "repository" \ "owner" \ "avatar_url"
          ),
          parsedContent \ "repository" \ "forks_count",
          parsedContent \ "repository" \ "watchers_count",
          parsedContent \ "repository" \ "url",
          parsedContent \ "repository" \ "http_url",
          parsedContent \ "repository" \ "clone_url",
          parsedContent \ "repository" \ "html_url",
        )

        gitHubEvent match {
          case "pull_request" => {
            println(rawPayload)

            println("📦 Repository:")
            println(s"  cloneUrl: ${repository.cloneUrl}")
            println(s"  fullName: ${repository.fullName}")
            println(s"  htmlUrl: ${repository.htmlUrl}")
            println(s"  httpUrl: ${repository.httpUrl}")
            println(s"  url: ${repository.url}")

          }
          case "push" => {
            val pusher = parsedContent \ "pusher"
            val sender = parsedContent \ "sender"

            val ref = parsedContent \ "ref"

            println(s"☘️ ${ref}")

            println("📦 Repository:")
            println(s"  cloneUrl: ${repository.cloneUrl}")
            println(s"  fullName: ${repository.fullName}")
            println(s"  htmlUrl: ${repository.htmlUrl}")
            println(s"  httpUrl: ${repository.httpUrl}")
            println(s"  url: ${repository.url}")

            //println(repository)

            val headCommit = HeadCommit(
              parsedContent \ "head_commit" \ "id",
              parsedContent \ "head_commit" \ "message",
              parsedContent \ "head_commit" \ "timestamp",
              parsedContent \ "head_commit" \ "added",
              parsedContent \ "head_commit" \ "removed",
              parsedContent \ "head_commit" \ "modified",
              Author(parsedContent \ "head_commit" \ "author" \ "name", parsedContent \ "head_commit" \ "author" \ "email", parsedContent \ "head_commit" \ "author" \ "date"),
              Committer(parsedContent \ "head_commit" \ "author" \ "name", parsedContent \ "head_commit" \ "author" \ "email", parsedContent \ "head_commit" \ "author" \ "date"),
              parsedContent \ "head_commit" \ "url"
            )

            println("🤔 Head Commit:")
            println(s"${headCommit.id} : ${headCommit.message}")
            //println(headCommit)
          }
        }



      } // end Some
    }

    //println(payload)
    val res =("Message" -> "OK") ~ ("Remark" -> "RAS")
    res
  }

}
