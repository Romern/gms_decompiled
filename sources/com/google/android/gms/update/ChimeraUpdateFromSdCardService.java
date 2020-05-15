package com.google.android.gms.update;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.Service;
import java.io.File;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChimeraUpdateFromSdCardService extends Service {

    /* renamed from: d */
    public static final /* synthetic */ int f109439d = 0;

    /* renamed from: e */
    private static alai f109440e = alai.m60751a();

    /* renamed from: a */
    public StateWatcher f109441a;

    /* renamed from: b */
    public volatile int f109442b;

    /* renamed from: c */
    public File f109443c;

    /* renamed from: f */
    private avkl f109444f;

    /* renamed from: a */
    public final void mo59655a() {
        sendBroadcast(new Intent("com.google.android.gms.update.UpdateFromSdCard.STATUS_CHANGED"));
    }

    public final IBinder onBind(Intent intent) {
        if (intent.getAction().equals("com.google.android.gms.update.BIND_SDCARD_SERVICE")) {
            avkl avkl = this.f109444f;
            avkl.asBinder();
            return avkl;
        }
        Log.w("CmaUpdateFromSdCardS", "onBind for sdcard is called with an unexpected intent, returning null.");
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        StateWatcher stateWatcher = new StateWatcher(this, new avjx(this));
        this.f109442b = 1;
        this.f109441a = stateWatcher;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.gservices.intent.action.GSERVICES_CHANGED");
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("com.google.android.checkin.CHECKIN_COMPLETE");
        stateWatcher.f109452a.registerReceiver(stateWatcher, intentFilter);
        stateWatcher.f109452a.getSharedPreferences("update", 0).edit().putInt("battery_state", stateWatcher.f109453b).apply();
        this.f109444f = new avkl(this);
    }

    public final void onDestroy() {
        StateWatcher stateWatcher = this.f109441a;
        stateWatcher.f109452a.unregisterReceiver(stateWatcher);
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        if (f109440e.mo40053b() > 0) {
            stopSelf();
            return 2;
        }
        if (intent == null || !"com.google.android.gms.update.UpdateFromSdCard.VERIFIER_RESULT_CHANGED".equals(intent.getAction())) {
            this.f109442b = 1;
        } else {
            if (intent.getBooleanExtra("verifier_task_result", false)) {
                int i4 = this.f109441a.f109453b;
                if (i4 == 0) {
                    i3 = 4;
                } else if (i4 == 1 || i4 == 2) {
                    i3 = 1040;
                } else {
                    Log.e("CmaUpdateFromSdCardS", "Unknown battery state, cannot handle!");
                }
            } else {
                i3 = 263;
            }
            this.f109442b = i3;
        }
        mo59655a();
        stopSelf();
        return 2;
    }
}
