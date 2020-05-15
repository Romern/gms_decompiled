package com.google.android.gms.audiomodem;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AudioModemBroadcastReceiver extends aacn {

    /* renamed from: a */
    public final Context f9848a;

    /* renamed from: b */
    public final adzt f9849b;

    /* renamed from: c */
    public boolean f9850c;

    /* renamed from: d */
    private final gcy f9851d;

    public AudioModemBroadcastReceiver(Context context, adzt adzt, gcy gcy) {
        super("nearby");
        this.f9848a = context;
        this.f9849b = adzt;
        this.f9851d = gcy;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".endsWith(intent.getAction())) {
            srn srn = gdv.f17985a;
            gcy gcy = this.f9851d;
            if (gcy.f17901f) {
                gem gem = gcy.f17900e;
                gem.f18052c = true;
                gem.mo11738b();
            }
            if (gcy.f17899d) {
                gcy.f17898c.mo11742b();
            }
        }
    }
}
