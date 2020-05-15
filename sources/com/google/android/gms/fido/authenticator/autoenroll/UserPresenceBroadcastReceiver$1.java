package com.google.android.gms.fido.authenticator.autoenroll;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UserPresenceBroadcastReceiver$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ xbz f31662a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserPresenceBroadcastReceiver$1(String str, xbz xbz) {
        super(str);
        this.f31662a = xbz;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String action;
        sek sek = xca.f51907a;
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("onReceive intent: ");
        sb.append(valueOf);
        char c = 0;
        sek.mo25414c(sb.toString(), new Object[0]);
        if (intent != null && (action = intent.getAction()) != null) {
            if (action.hashCode() != 823795052 || !action.equals("android.intent.action.USER_PRESENT")) {
                c = 65535;
            }
            if (c == 0) {
                this.f31662a.mo18636a();
            }
        }
    }
}
