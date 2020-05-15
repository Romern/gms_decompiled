package com.google.android.gms.trustlet.place.internal;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class HomeLure$GoogleAccountChangeBroadcastReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ auxg f109274a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeLure$GoogleAccountChangeBroadcastReceiver(auxg auxg) {
        super("trustlet_place");
        this.f109274a = auxg;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        auxg auxg = this.f109274a;
        aunx aunx = auxg.f92694a;
        if (auxg.f92699f.getBoolean("auth_trust_agent_pref_place_lure_notification_do_not_show", false)) {
            auxg.mo51012b();
        }
    }
}
