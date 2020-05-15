package com.google.android.gms.fitness.notifications;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: b */
    private static final srn f32195b = zvt.m46581a();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo18995a(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("action");
        if (stringExtra == null) {
            bnsl bnsl = (bnsl) f32195b.mo68387b();
            bnsl.mo68432a("com.google.android.gms.fitness.notifications.GcmChimeraBroadcastReceiver", "a", 44, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Received a chime message without any action");
            return;
        }
        String stringExtra2 = intent.getStringExtra("account");
        if (stringExtra2 == null) {
            bnsl bnsl2 = (bnsl) f32195b.mo68387b();
            bnsl2.mo68432a("com.google.android.gms.fitness.notifications.GcmChimeraBroadcastReceiver", "a", 50, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Received a chime message without any account");
        } else if (!yzq.m45107a(context).mo30874b().mo30715b().contains(stringExtra2)) {
            bnsl bnsl3 = (bnsl) f32195b.mo68387b();
            bnsl3.mo68432a("com.google.android.gms.fitness.notifications.GcmChimeraBroadcastReceiver", "a", 57, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Received a chime message with an account not available on this device");
        } else if (!"sync".equals(stringExtra)) {
            bnsl bnsl4 = (bnsl) f32195b.mo68387b();
            bnsl4.mo68432a("com.google.android.gms.fitness.notifications.GcmChimeraBroadcastReceiver", "a", 63, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68420a("Invalid chime message with action: %s", bryx.m114908a(stringExtra));
        } else {
            zvm.m46572a(context, stringExtra2, cadu.SERVER_INITIATED);
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (ceab.f182124a.mo6606a().mo78655f() && "gcm".equals(aakz.m21424a(context).mo16960a(intent))) {
            String stringExtra = intent.getStringExtra("action");
            if (stringExtra == null) {
                bnsl bnsl = (bnsl) f32195b.mo68387b();
                bnsl.mo68432a("com.google.android.gms.fitness.notifications.GcmChimeraBroadcastReceiver", "a", 44, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Received a chime message without any action");
                return;
            }
            String stringExtra2 = intent.getStringExtra("account");
            if (stringExtra2 == null) {
                bnsl bnsl2 = (bnsl) f32195b.mo68387b();
                bnsl2.mo68432a("com.google.android.gms.fitness.notifications.GcmChimeraBroadcastReceiver", "a", 50, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Received a chime message without any account");
            } else if (!yzq.m45107a(context).mo30874b().mo30715b().contains(stringExtra2)) {
                bnsl bnsl3 = (bnsl) f32195b.mo68387b();
                bnsl3.mo68432a("com.google.android.gms.fitness.notifications.GcmChimeraBroadcastReceiver", "a", 57, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Received a chime message with an account not available on this device");
            } else if (!"sync".equals(stringExtra)) {
                bnsl bnsl4 = (bnsl) f32195b.mo68387b();
                bnsl4.mo68432a("com.google.android.gms.fitness.notifications.GcmChimeraBroadcastReceiver", "a", 63, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68420a("Invalid chime message with action: %s", bryx.m114908a(stringExtra));
            } else {
                zvm.m46572a(context, stringExtra2, cadu.SERVER_INITIATED);
            }
        }
    }
}
