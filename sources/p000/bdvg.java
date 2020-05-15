package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: bdvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdvg extends BroadcastReceiver {

    /* renamed from: a */
    public final bdve f106497a;

    /* renamed from: b */
    public final ayte f106498b;

    /* renamed from: c */
    private final bdul f106499c;

    public bdvg(bdul bdul, bdve bdve, ayte ayte) {
        this.f106499c = bdul;
        this.f106497a = bdve;
        this.f106498b = ayte;
    }

    public final void onReceive(Context context, Intent intent) {
        long b = this.f106498b.mo54418b();
        if ("com.google.android.gms.udc.action.FACS_CACHE_UPDATED".equals(intent.getAction())) {
            bqga.m112781a(this.f106499c.mo58389b(), new bdvf(this, b, goAsync()), bqfb.INSTANCE);
        }
    }
}
