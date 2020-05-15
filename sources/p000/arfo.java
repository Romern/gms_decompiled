package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: arfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arfo implements Runnable {

    /* renamed from: a */
    final /* synthetic */ arfp f87604a;

    public arfo(arfp arfp) {
        this.f87604a = arfp;
    }

    public final void run() {
        arfa arfa;
        arfp arfp = this.f87604a;
        argg argg = arfp.f87605a;
        arjf arjf = arfp.f87606b;
        argg.f87654a.mo48666c(2);
        arml.m73129a(argg.f87654a, 12);
        arfh arfh = argg.f87655b;
        if (arfh.f87591i && (arfa = arfh.f87589g) != null) {
            arfa.mo48477a().mo50371a(new arfg(arfh, arjf));
        } else {
            arfh.m72645d(arjf, new Status(10552));
        }
    }
}
