package com.google.android.gms.googlehelp;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.chimera.WakefulBroadcastReceiver;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import com.google.android.gms.googlehelp.helpactivities.OpenHelpRtcChimeraActivity;
import com.google.android.gms.googlehelp.metrics.MetricsIntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmChimeraBroadcastReceiver extends WakefulBroadcastReceiver {
    /* renamed from: b */
    private static final boolean m66335b(Context context, Intent intent) {
        Intent addFlags = new Intent().setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.googlehelp.helpactivities.OpenHelpRtcActivity")).addFlags(805306368);
        Bundle extras = intent.getExtras();
        if (extras == null) {
            Log.e("gH_GcmBroadcastReceiver", "Received screenshare invite with no bundle");
            return false;
        } else if (!"MOBILE_SCREENSHARE".equals(extras.getString("type"))) {
            return false;
        } else {
            String a = OpenHelpRtcChimeraActivity.m66589a(extras);
            if (TextUtils.isEmpty(a)) {
                Log.e("gH_GcmBroadcastReceiver", "Received screenshare invite with no invitation ID");
                return false;
            }
            String a2 = abcx.m47461a(a);
            m66334a(context, a2, "com.google.android.apps.helprtc", MfiClientException.TYPE_MFICLIENT_NOT_FOUND);
            addFlags.putExtra("launch_source_key", "launch_source_gcm_value");
            for (String str : extras.keySet()) {
                Object obj = extras.get(str);
                if (obj != null) {
                    addFlags.putExtra(str, obj.toString());
                }
            }
            try {
                context.startActivity(addFlags);
                return true;
            } catch (ActivityNotFoundException | SecurityException e) {
                m66334a(context, a2, "com.google.android.apps.helprtc", MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED);
                Log.e("gH_GcmBroadcastReceiver", "Unable to start the screenshare activity.", e);
                return true;
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null && "gcm".equals(aakz.m21424a(context).mo16960a(intent)) && !m66335b(context, intent)) {
            String stringExtra = intent.getStringExtra("type");
            if ("CHAT_TYPING".equals(stringExtra)) {
                m66333a(context, ChatRequestAndConversationChimeraService.m66440a(context, intent));
            } else if ("CHAT_MESSAGE".equals(stringExtra)) {
                m66333a(context, ChatRequestAndConversationChimeraService.m66439a(context));
            } else if ("CHAT_QUEUE".equals(stringExtra)) {
                m66333a(context, ChatRequestAndConversationChimeraService.m66441a(context, intent.getStringExtra("version")));
            }
        }
    }

    /* renamed from: a */
    private final void m66333a(Context context, Intent intent) {
        WakefulBroadcastReceiver.startWakefulService(context, intent);
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
    }

    /* renamed from: a */
    static final void m66334a(Context context, String str, String str2, int i) {
        MetricsIntentOperation.m66597a(context, str, str2, 88, i, true);
    }
}
