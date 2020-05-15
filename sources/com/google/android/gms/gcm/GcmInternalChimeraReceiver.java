package com.google.android.gms.gcm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GcmInternalChimeraReceiver extends BroadcastReceiver {
    /* renamed from: a */
    private static void m24310a(Context context, Intent intent, String str) {
        boolean equals = "1".equals(intent.getStringExtra("wake"));
        StringBuilder sb = new StringBuilder(str.length() + 42);
        sb.append("com.google.android.gms.");
        sb.append(str);
        sb.append(".GcmReceiverService");
        intent.setClassName(context, sb.toString());
        if (equals) {
            aseo.m73885c(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("from");
        if ("google.com/iid".equals(stringExtra) || "gcm.googleapis.com/refresh".equals(stringExtra)) {
            Log.i("GCM", "Fanning out Instance ID message for GMS");
            intent.setClassName(context, "com.google.android.gms.chimera.GmsIntentOperationService$PersistentInternalReceiver");
            intent.setAction("com.google.firebase.INSTANCE_ID_EVENT");
            context.sendBroadcast(intent);
        } else {
            String stringExtra2 = intent.getStringExtra("from");
            String stringExtra3 = intent.getStringExtra("gcms");
            String stringExtra4 = intent.getStringExtra("gcmb");
            String stringExtra5 = intent.getStringExtra("subtype");
            if (Log.isLoggable("GCM", 4)) {
                String valueOf = String.valueOf(stringExtra2);
                Log.i("GCM", valueOf.length() == 0 ? new String("Message from ") : "Message from ".concat(valueOf));
            }
            if (stringExtra3 != null) {
                m24310a(context, intent, stringExtra3);
            } else if (stringExtra4 != null) {
                StringBuilder sb = new StringBuilder(stringExtra4.length() + 44);
                sb.append("com.google.android.gms.");
                sb.append(stringExtra4);
                sb.append(".GcmBroadcastReceiver");
                intent.setClassName(context, sb.toString());
                context.sendOrderedBroadcast(intent, null);
            } else if (intent.hasExtra("com.google.android.gms.GCM_TYPE")) {
                if ("REMOTE_POLICY".equals(intent.getStringExtra("com.google.android.gms.GCM_TYPE"))) {
                    byte[] decode = Base64.decode(intent.getStringExtra("com.google.android.gms.GCM_PAYLOAD"), 0);
                    Intent intent2 = new Intent();
                    intent2.setComponent(new ComponentName(context, "com.google.android.gms.mdm.services.GcmReceiverService"));
                    intent2.putExtra("payload", decode);
                    context.startService(intent2);
                }
            } else if (stringExtra5 == null) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(stringExtra2).length() + 52);
                sb2.append("Dropping message to GMS from ");
                sb2.append(stringExtra2);
                sb2.append(" as no component is set");
                Log.e("GCM", sb2.toString());
            } else {
                m24310a(context, intent, stringExtra5);
            }
        }
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
    }
}
