package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}

class BusinessController  @Inject()(cc: ControllerComponents) extends AbstractController(cc) {



  def nongtianganzhiPage = Action{
    Ok(views.html.business.nongtianganzhi())
  }

  def shengzhangyucePage = Action{
    Ok(views.html.business.shengzhangyuce())
  }

  def guangpujiancePage = Action{
    Ok(views.html.business.guangpujiance())
  }

  def shengchanliPage = Action{
    Ok(views.html.business.shengchanli())
  }

  def sheshiPage = Action{
    Ok(views.html.business.sheshi())
  }

  def shuichanPage = Action{
    Ok(views.html.business.shuichan())
  }

  def xumuPage = Action{
    Ok(views.html.business.xumu())
  }

  def nongchanpinPage = Action{
    Ok(views.html.business.nongchanpin())
  }



}
