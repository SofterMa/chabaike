package qianfeng.httplib;

/**
 * Created by wukai on 16/6/20.
 */
public class HttpHelper {

	private static HttpHelper  Instance;  //单例模式
	private RequestQueue mQueue;

    //懒汉式单例模式，双重检查锁定
	private static HttpHelper getInstance(){

		if (Instance == null){
		synchronized (HttpHelper.class){
			if (Instance == null){
				Instance = new HttpHelper();
			}
		}
		}
		return Instance;
	}


	private HttpHelper(){
		mQueue = new RequestQueue();

	}



	public static void addRequest(Request request){
		getInstance().mQueue.addRequest(request);
	}


}