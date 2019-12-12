@RestController
public class HelloController{
	
	@RequestMapping("index")
	public String index(){
		return "Hello World!";
	}
}