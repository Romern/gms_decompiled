package com.google.android.gms.drive.api;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RealtimeService$PauseCommunicationReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ ubw f30760a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealtimeService$PauseCommunicationReceiver(ubw ubw) {
        super("drive");
        this.f30760a = ubw;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (((PowerManager) context.getSystemService("power")).isScreenOn()) {
            ubw ubw = this.f30760a;
            sbw sbw = ubw.f47196a;
            if (ubw.f47206k.mo28343a()) {
                ubw ubw2 = this.f30760a;
                ((soc) ubw2.f47202g).submit(ubw2.f47205j);
                return;
            }
        }
        ubw ubw3 = this.f30760a;
        sbw sbw2 = ubw.f47196a;
        ((soc) ubw3.f47202g).submit(ubw3.f47204i);
    }
}
