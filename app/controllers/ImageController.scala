package controllers

import java.io.File
import java.nio.file.Files

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}
import utils.Utils

import scala.concurrent.ExecutionContext

@Singleton
class ImageController @Inject()(cc:ControllerComponents)(implicit exec:ExecutionContext) extends AbstractController(cc) {


  def getImageByPath(name: String) = Action { implicit request =>
    val ifModifiedSinceStr = request.headers.get(IF_MODIFIED_SINCE)
    val path = s"${Utils.path}/$name"
    val file = new File(path)
    val lastModifiedStr = file.lastModified().toString
    val MimeType = if(path.contains("png")) "image/png" else "image/jpg"
    val byteArray = Files.readAllBytes(file.toPath)
    if (ifModifiedSinceStr.isDefined && ifModifiedSinceStr.get == lastModifiedStr) {
      NotModified
    } else {
      Ok(byteArray).as(MimeType).withHeaders(LAST_MODIFIED -> file.lastModified().toString)
    }
  }





}
