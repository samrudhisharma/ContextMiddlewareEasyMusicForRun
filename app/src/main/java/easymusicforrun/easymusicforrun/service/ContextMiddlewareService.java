package easymusicforrun.easymusicforrun.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.IBinder;

import easymusicforrun.easymusicforrun.IContextInterface;

public class ContextMiddlewareService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();



    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    @Override
    public void onRebind(Intent intent) {
        super.onRebind(intent);
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return true;
    }

    @Override
        public void onDestroy() {
            super.onDestroy();
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
