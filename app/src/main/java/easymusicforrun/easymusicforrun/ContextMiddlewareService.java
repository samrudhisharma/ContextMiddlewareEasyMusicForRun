package easymusicforrun.easymusicforrun;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

public class ContextMiddlewareService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();



    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    @Override
    public void onDestroy() {
    }

    /*
    *   Implement functions in the interface.
    *   Since some functions and/or variables of the superclass might be required, it is better to call an external function from
    *   the interface.
     */
    private final IContextInterface.Stub mBinder = new IContextInterface.Stub() {


        /*
         * This function immediately returns the result without using a callback interface.
         * Avoid using functions that work synchronously if there is a possibility of delay in getting the required response.
         */
        public boolean isJackPluggedIn() {
            System.out.println("Checking");
            AudioManager audioManager = (AudioManager) ContextMiddlewareService.super.getApplicationContext().getSystemService(Context.AUDIO_SERVICE);
            return audioManager.isWiredHeadsetOn();
        }

    };



}
