package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: bdis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdis extends BroadcastReceiver {

    /* renamed from: a */
    public final bdif f105705a;

    /* renamed from: b */
    public final bmzi f105706b;

    /* renamed from: c */
    private final bmzi f105707c;

    public bdis(bdif bdif, bmzi bmzi, bmzi bmzi2) {
        this.f105705a = bdif;
        this.f105706b = bmzi;
        this.f105707c = bmzi2;
    }

    public final void onReceive(Context context, Intent intent) {
        bmzi bmzi;
        bqgk bqgk;
        intent.getAction();
        if (this.f105705a.f105691b) {
            context.unregisterReceiver(this);
        } else if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction()) && (bmzi = this.f105707c) != null && (bqgk = (bqgk) bmzi.mo6606a()) != null) {
            bdhp.m90826a(bqga.m112776a(new bdir(this), bqgk));
        }
    }
}
