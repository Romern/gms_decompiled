package com.google.android.gms.gcm.registration;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import com.google.android.gms.gcm.GcmProxyIntentOperation;
import com.google.android.gms.iid.MessengerCompat;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PushMessagingRegistrarChimeraProxy extends TracingIntentService {
    public PushMessagingRegistrarChimeraProxy() {
        super(PushMessagingRegistrarChimeraProxy.class.getSimpleName());
    }

    public final IBinder onBind(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.REGISTER".equals(action)) {
            aalt aalt = aakb.m21381a().f28342c;
            Messenger messenger = aalt.f28418a;
            if (messenger != null) {
                return messenger.getBinder();
            }
            MessengerCompat messengerCompat = aalt.f28419b;
            throw new IllegalStateException("Both messengers are null");
        }
        "com.google.android.gms.gcm.WEARABLE".equals(action);
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        aajg.m21335a((Context) this);
    }

    /* renamed from: a */
    public static void m24334a(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str : extras.keySet()) {
                if (str.startsWith("GOOG.")) {
                    intent.removeExtra(str);
                }
            }
        }
        aakb a = aakb.m21381a();
        if (intent.getStringExtra("cliv") != null) {
            aalt aalt = a.f28342c;
            Messenger b = aara.m21849b(intent);
            if (b != null) {
                try {
                    Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTRATION");
                    int i = Build.VERSION.SDK_INT;
                    intent2.putExtra("google.messenger", aalt.f28418a);
                    intent2.putExtra("registration_id", String.valueOf(intent.getStringExtra("kid")).concat(":MESSENGER"));
                    Message obtain = Message.obtain();
                    obtain.obj = intent2;
                    b.send(obtain);
                } catch (RemoteException e) {
                    Log.w("GCM", "Application making request no longer running");
                }
            } else {
                Log.w("GCM", "Request missing reply messenger, dropping");
            }
        } else {
            if (aajg.m21344d() != 0) {
                aakw aakw = a.f28341b;
                String b2 = aakw.mo16954b();
                String c = aakw.mo16955c();
                if (b2 != null) {
                    intent.putExtra("GOOG.USER_AID", b2);
                }
                if (c != null) {
                    intent.putExtra("GOOG.USER_TOKEN", c);
                }
            }
            GcmProxyIntentOperation.m24313a(context, intent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6499a(Intent intent) {
        if (intent != null) {
            m24334a(this, intent);
        }
    }
}
