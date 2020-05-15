package com.google.android.gms.auth.setup.devicesignals;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LockScreenChimeraService extends Service {

    /* renamed from: a */
    public static boolean f11287a = false;

    /* renamed from: b */
    private BroadcastReceiver f11288b;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ScreenOffReceiver extends aacn {
        public ScreenOffReceiver() {
            super("auth_account");
        }

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                juu.m17357a(context).mo14120b();
            }
        }
    }

    /* renamed from: a */
    public static Intent m6899a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.setup.devicesignals.LockScreenService");
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        f11287a = true;
        ScreenOffReceiver screenOffReceiver = new ScreenOffReceiver();
        this.f11288b = screenOffReceiver;
        registerReceiver(screenOffReceiver, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    public final void onDestroy() {
        unregisterReceiver(this.f11288b);
        f11287a = false;
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null || !intent.getBooleanExtra("is_boot", false)) {
            return 1;
        }
        juu.m17357a(this).mo14118a();
        return 1;
    }
}
