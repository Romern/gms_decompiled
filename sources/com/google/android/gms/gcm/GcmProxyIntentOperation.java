package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GcmProxyIntentOperation extends IntentOperation {
    /* renamed from: a */
    public static void m24313a(Context context, Intent intent) {
        aajg.m21335a(context);
        if (aajg.m21344d() == 0) {
            m24314a(intent, 0);
            return;
        }
        Intent intent2 = new Intent("com.google.android.gcm.USER_FORWARD");
        intent2.setClassName(context, "com.google.android.gms.chimera.GmsIntentOperationService$PersistentInternalReceiver");
        intent2.putExtra("intent", intent);
        intent2.putExtra("userSerial", aajg.m21344d());
        aajg.m21337a(context, intent2);
    }

    public final void onHandleIntent(Intent intent) {
        if (!"com.google.android.gcm.USER_FORWARD".equals(intent.getAction())) {
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
            sb.append("Unexpected intent: ");
            sb.append(valueOf);
            Log.w("GCM", sb.toString());
            return;
        }
        m24314a((Intent) intent.getParcelableExtra("intent"), intent.getIntExtra("userSerial", -1));
    }

    /* renamed from: a */
    private static void m24314a(Intent intent, int i) {
        sdo.m34970a(aajg.m21344d() == 0);
        if (i < 0) {
            Log.w("GCM", "Dispatching intent with invalid user serial");
            return;
        }
        String action = intent.getAction();
        aakb a = aakb.m21381a();
        if ("com.google.android.gcm.intent.SEND".equals(action)) {
            aajt f = a.mo16921f();
            if (!aytw.m84813a(f.f28298a)) {
                GcmSenderChimeraProxy.m24316a(f.f28298a);
                f.f28299b.execute(new aajj(f, intent, i));
            }
        } else if ("com.google.android.gms.gcm.MESSENGER_IPC_USER_FORWARD".equals(action)) {
            aalt aalt = a.f28342c;
            Parcelable parcelableExtra = intent.getParcelableExtra("msg");
            if (!(parcelableExtra instanceof Message)) {
                String valueOf = String.valueOf(intent);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                sb.append("Invalid forwarded request: ");
                sb.append(valueOf);
                Log.w("GCM", sb.toString());
                return;
            }
            aalt.mo16979a((Message) parcelableExtra, i);
        } else if ("com.google.android.c2dm.intent.REGISTER".equals(action)) {
            aaqx e = a.mo16920e();
            aara a2 = aara.m21844a(1, i, intent, Collections.emptyMap());
            if (a2 != null) {
                e.mo17195a(a2);
            }
        } else if ("com.google.android.c2dm.intent.UNREGISTER".equals(action)) {
            aaqx e2 = a.mo16920e();
            aara a3 = aara.m21844a(2, i, intent, aara.m21847a(0));
            if (a3 != null) {
                e2.mo17195a(a3);
            }
        } else if ("android.intent.action.PACKAGE_REPLACED".equals(action)) {
            aamh a4 = GcmPackageIntentOperation.m24312a(intent, i);
            if (a4 != null) {
                aakb.m21381a().mo16918c().mo16946a(a4);
            }
        } else if ("android.intent.action.PACKAGE_FULLY_REMOVED".equals(action)) {
            aamh a5 = GcmPackageIntentOperation.m24312a(intent, i);
            if (a5 != null) {
                aakb.m21381a().mo16918c().mo16949b(a5);
            }
        } else {
            String valueOf2 = String.valueOf(intent);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 29);
            sb2.append("Unexpected forwarded intent: ");
            sb2.append(valueOf2);
            Log.w("GCM", sb2.toString());
        }
    }
}
