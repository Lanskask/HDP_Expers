package controllers

import javax.inject._
import models.{DB, Person}
import play.api.data.Form
import play.api.data.Forms._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class Application @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  val personForm: Form[Person] = Form (
    mapping (
      "name" -> text
    )(Person.apply)(Person.unapply)
  )

  def addPerson = Action { implicit request =>
    val person = personForm.bindFromRequest.get
    DB.save(person)
    Redirect(routes.Application.index)
  }
}
