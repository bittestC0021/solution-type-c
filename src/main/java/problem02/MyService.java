package problem02;

public class MyService extends BaseService {
	public void service(String state) {
		if(state.equals("낮"))
			System.out.println(day()+"서비스시작");
		else if (state.equals("오후"))
			System.out.println(afternoon()+"서비스시작");
		else
			System.out.println(night()+"서비스시작");
	}
	
	public String afternoon() {
		return "오후";
	}
}
