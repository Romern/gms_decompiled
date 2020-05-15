package com.google.android.gms.fastpair.devices;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DevicesListFragment$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ wsl f31483a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DevicesListFragment$1(wsl wsl, String str) {
        super(str);
        this.f31483a = wsl;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
            srn srn = wtw.f51331a;
            this.f31483a.mo29354a();
        } else if ("android.location.PROVIDERS_CHANGED".equals(action)) {
            srn srn2 = wtw.f51331a;
            this.f31483a.mo29354a();
        } else if (action.equals("android.net.conn.CONNECTIVITY_CHANGE") && !isInitialStickyBroadcast()) {
            srn srn3 = wtw.f51331a;
            this.f31483a.mo29354a();
        }
    }
}
