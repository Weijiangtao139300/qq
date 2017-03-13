package weijiangtao.bwie.com.qq;

import android.app.Application;
import android.view.View;

import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.UMShareAPI;

/**
 * Created by asus on 2017/3/13.
 */

public class Myapp extends Application{

    {
        PlatformConfig.setQQZone("100424468", "c7394704798a158208a74ab60104f0ba");
    }
    @Override
    public void onCreate() {
        super.onCreate();
        UMShareAPI.get(this);
        
        
    }
}
