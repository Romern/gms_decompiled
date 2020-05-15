package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: spg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class spg extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ sph f44925a;

    public spg(sph sph) {
        this.f44925a = sph;
    }

    public final void onReceive(Context context, Intent intent) {
        blji b = this.f44925a.f44914a.mo16696b("onAlarm");
        try {
            this.f44925a.mo25927b();
            if (b != null) {
                b.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
