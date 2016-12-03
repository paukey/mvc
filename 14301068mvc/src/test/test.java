package test;
import MVC.Controller;
import MVC.RequestMapping;
import MVC.ModelView;

/**
 * 
 * ¿ØÖÆÆ÷Àà
 *
 */
@Controller
public class test {
	@RequestMapping("/hello")
	public ModelView hello(ModelView mdv) {
		ModelView mav=mdv;
		// TODO Auto-generated constructor stub
		mav.setViewName("test");
		mav.addObject("name", mav.getMap("name"));
		mav.addObject("pas", mav.getMap("pas"));
		return mav;
	}
}
