package controllers

import javax.inject._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def homePage = Action {
    Ok(views.html.home.index())
  }

  def newsPage = Action{
    Ok(views.html.news.news())
  }

  def contactPage = Action{
    Ok(views.html.about.contact())
  }

  def successPage = Action{
    Ok(views.html.success.success())
  }

  def fruitPage = Action{
    Ok(views.html.sliderx.fruit())
  }

  def productPage = Action{
    Ok(views.html.sliderx.product())
  }

  def guanhuaiPage = Action{
    Ok(views.html.guanhuai.guanhuai())
  }

}
