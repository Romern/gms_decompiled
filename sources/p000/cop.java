package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: cop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cop extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ coq f11740a;

    public cop(coq coq) {
        this.f11740a = coq;
    }

    public final void onReceive(Context context, Intent intent) {
        coq coq = this.f11740a;
        boolean z = coq.f11741a;
        coq.f11741a = coq.m7222a(context);
        coq coq2 = this.f11740a;
        boolean z2 = coq2.f11741a;
        if (z != z2) {
            ccc ccc = coq2.f11742b;
            if (z2) {
                synchronized (ccc.f6460b) {
                    cpb cpb = ccc.f6459a;
                    for (cpv cpv : crd.m7391a(cpb.f11760a)) {
                        if (!cpv.mo8115e() && !cpv.mo8116f()) {
                            cpv.mo8112b();
                            if (cpb.f11762c) {
                                cpb.f11761b.add(cpv);
                            } else {
                                cpv.mo8111a();
                            }
                        }
                    }
                }
            }
        }
    }
}
