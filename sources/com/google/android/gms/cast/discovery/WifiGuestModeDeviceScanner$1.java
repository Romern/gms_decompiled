package com.google.android.gms.cast.discovery;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WifiGuestModeDeviceScanner$1 extends aacn {

    /* renamed from: a */
    public final /* synthetic */ pnj f29870a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiGuestModeDeviceScanner$1(pnj pnj, String str) {
        super(str);
        this.f29870a = pnj;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        this.f29870a.f39640e.mo23861b("WiFi scan complete - checking for guest mode device.");
        this.f29870a.f39642g.execute(new pni(this));
    }
}
