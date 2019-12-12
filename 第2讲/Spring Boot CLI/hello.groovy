@RestController
class HelloController{
	
	@RequestMapping("index")
	String index(){
		"Hello World!"
	}
}