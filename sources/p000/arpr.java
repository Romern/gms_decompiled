package p000;

import com.google.android.chimera.Activity;
import com.google.android.gms.smartdevice.d2d.p065ui.TargetChimeraActivity;

/* renamed from: arpr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arpr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Activity f88088a;

    /* renamed from: b */
    final /* synthetic */ arps f88089b;

    public arpr(arps arps, Activity activity) {
        this.f88089b = arps;
        this.f88088a = activity;
    }

    public final void run() {
        srl srl = this.f88089b.f88101l;
        if (srl != null) {
            srl.mo21850a((TargetChimeraActivity) this.f88088a);
        }
    }
}
