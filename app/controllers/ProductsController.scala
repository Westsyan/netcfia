package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}

class ProductsController   @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def cgmd302Page = Action{
    Ok(views.html.products.cgmd302())
  }

  def cgmd402Page = Action{
    Ok(views.html.products.cgmd402())
  }

  def cgmd502Page = Action{
    Ok(views.html.products.cgmd502())
  }

  def chezaiPage = Action{
    Ok(views.html.products.chezai())
  }

  def wurenjiPage = Action{
    Ok(views.html.products.wurenji())
  }

  def zhihuiPage = Action{
    Ok(views.html.products.zhihui())
  }

  def nongyexinxiPage = Action{
    Ok(views.html.products.nongyexinxi())
  }

  def zuowuguanliPage = Action{
    Ok(views.html.products.zuowuguanli())
  }

  def yaoganPage = Action{
    Ok(views.html.products.yaogan())
  }

  def moniPage = Action{
    Ok(views.html.products.moni())
  }

}
