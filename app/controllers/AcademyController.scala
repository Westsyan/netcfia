package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}

class AcademyController  @Inject()(cc: ControllerComponents) extends AbstractController(cc) {



  def introPage = Action{
    Ok(views.html.academy.intro())
  }

  def speechPage = Action{
    Ok(views.html.academy.speech())
  }

  def elitePage = Action{
    Ok(views.html.academy.elite())
  }

  def wenhuaPage = Action{
    Ok(views.html.academy.wenhua())
  }

  def lichengPage = Action{
    Ok(views.html.academy.licheng())
  }

  def zizhiPage = Action{
    Ok(views.html.academy.zizhi())
  }

  def guanhuaiPage = Action{
    Ok(views.html.academy.guanhuai())
  }

  def guwenPage = Action{
    Ok(views.html.academy.guwen())
  }

  def nijun = Action{
    Ok(views.html.academy.eliteInfo.nijun())
  }

  def yaoxia = Action{
    Ok(views.html.academy.eliteInfo.yaoxia())
  }

  def zhangxiaohu = Action{
    Ok(views.html.academy.eliteInfo.zhangxiaohu())
  }

  def caoqiang = Action{
    Ok(views.html.academy.eliteInfo.caoqiang())
  }

  def zhanglanping = Action{
    Ok(views.html.academy.eliteInfo.zhanglanping())
  }

  def wanghongting = Action{
    Ok(views.html.academy.eliteInfo.wanghongting())
  }

  def caoyongheng = Action{
    Ok(views.html.academy.eliteInfo.caoyongheng())
  }

}
