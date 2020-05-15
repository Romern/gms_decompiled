package com.google.android.gms.location.reporting.service;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        bgzo.m100459a(context);
        if (sse.m36205a(context) && chcs.m148228D()) {
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("GCM message received ");
            sb.append(valueOf);
            bgur.m100011a("GCoreUlr", sb.toString());
            Bundle extras = intent.getExtras();
            if (extras != null) {
                for (String str : extras.keySet()) {
                    String valueOf2 = String.valueOf(intent.getExtras().get(str));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(valueOf2).length());
                    sb2.append("     ");
                    sb2.append(str);
                    sb2.append(": ");
                    sb2.append(valueOf2);
                    sb2.toString();
                }
            }
            bguv.m100042a("UlrGcmNotificationReceived");
            String a = aakz.m21424a(context).mo16960a(intent);
            if ("send_error".equals(a)) {
                String valueOf3 = String.valueOf(intent.getExtras());
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 16);
                sb3.append("GCM send error: ");
                sb3.append(valueOf3);
                bgur.m100025c("GCoreUlr", sb3.toString());
            } else if ("deleted_messages".equals(a)) {
                String valueOf4 = String.valueOf(intent.getExtras());
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 66);
                sb4.append("GCM server deleted pending messages because they were collapsible.");
                sb4.append(valueOf4);
                bgur.m100011a("GCoreUlr", sb4.toString());
            } else if ("gcm".equals(a)) {
                bgvt bgvt = null;
                if (!intent.hasExtra("ulr_notification")) {
                    bgur.m100025c("GCoreUlr", "Dropping non-ULR GCM message");
                } else {
                    String stringExtra = intent.getStringExtra("ulr_notification");
                    if (stringExtra == null || stringExtra.isEmpty()) {
                        Log.e("GCoreUlr", "Received GCM notification with empty data extra.");
                    } else {
                        try {
                            byte[] decode = Base64.decode(stringExtra, 0);
                            try {
                                bgvt bgvt2 = (bgvt) bxvk.m124016a(bgvt.f117740e, decode, bxus.m123744c());
                                if ((bgvt2.f117742a & 1) != 0 && !bgvt2.f117743b.isEmpty()) {
                                    bgvt = bgvt2;
                                } else {
                                    bgur.m100025c("GCoreUlr", "Received notification missing account name");
                                }
                            } catch (bxwf e) {
                                bgur.m100021b("GCoreUlr", "Error parsing notification", e);
                            }
                        } catch (IllegalArgumentException e2) {
                            bgur.m100021b("GCoreUlr", "Error decoding notification", e2);
                        }
                    }
                }
                if (bgvt != null) {
                    Account account = new Account(bgvt.f117743b, "com.google");
                    String a2 = aeqm.m52397a(account);
                    long j = bgvt.f117744c;
                    StringBuilder sb5 = new StringBuilder(String.valueOf(a2).length() + 61);
                    sb5.append("Received GCM notification for ");
                    sb5.append(a2);
                    sb5.append(" timestamp:");
                    sb5.append(j);
                    bgur.m100011a("GCoreUlr", sb5.toString());
                    if ((bgvt.f117742a & 4) != 0) {
                        bgvs bgvs = bgvt.f117745d;
                        if (bgvs == null) {
                            bgvs = bgvs.f117736c;
                        }
                        if ((bgvs.f117738a & 1) == 0) {
                            bgur.m100025c("GCoreUlr", "Received null value for primary device state");
                        } else {
                            String a3 = aeqm.m52397a(account);
                            boolean z = bgvs.f117739b;
                            StringBuilder sb6 = new StringBuilder(String.valueOf(a3).length() + 43);
                            sb6.append("Changing primary device state for ");
                            sb6.append(a3);
                            sb6.append(" to ");
                            sb6.append(z);
                            bgur.m100011a("GCoreUlr", sb6.toString());
                            boolean z2 = bgvs.f117739b;
                            Intent a4 = bgxx.m100271a(context, "com.google.android.location.reporting.CHANGE_PRIMARY_DEVICE");
                            a4.putExtra("account", account);
                            a4.putExtra("isPrimaryDevice", z2);
                            bgzo.m100465a(context, a4);
                        }
                        bguv.m100042a("UlrGcmPrimaryDeviceNotification");
                        return;
                    }
                    bgxm.m100247a(context, "GcmBroadcastReceiver", account);
                    bgyc bgyc = new bgyc(context);
                    Intent intent2 = new Intent("com.google.android.location.settings.REMOTE_CHANGED");
                    intent2.putExtra("account", account);
                    bgyc.f117992a.sendBroadcast(intent2);
                    bguv.m100042a("UlrGcmSettingsNotification");
                }
            }
        }
    }
}
