package com.google.android.chimera;

import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class IntentService extends Service {

    /* renamed from: CT */
    private volatile Looper f7634CT;

    /* renamed from: b */
    private volatile del f7635b;

    /* renamed from: c */
    private String f7636c;

    /* renamed from: d */
    private boolean f7637d;

    public IntentService(String str) {
        this.f7636c = str;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        String str = this.f7636c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 15);
        sb.append("IntentService[");
        sb.append(str);
        sb.append("]");
        HandlerThread handlerThread = new HandlerThread(sb.toString());
        handlerThread.start();
        this.f7634CT = handlerThread.getLooper();
        this.f7635b = new del(this, this.f7634CT);
    }

    public void onDestroy() {
        this.f7634CT.quit();
    }

    public abstract void onHandleIntent(Intent intent);

    public void onStart(Intent intent, int i) {
        Message obtainMessage = this.f7635b.obtainMessage();
        obtainMessage.arg1 = i;
        obtainMessage.obj = intent;
        this.f7635b.sendMessage(obtainMessage);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        onStart(intent, i2);
        return this.f7637d ? 3 : 2;
    }

    public void setIntentRedelivery(boolean z) {
        this.f7637d = z;
    }
}
