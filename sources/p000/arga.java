package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: arga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arga implements Runnable {

    /* renamed from: a */
    final /* synthetic */ argb f87630a;

    public arga(argb argb) {
        this.f87630a = argb;
    }

    public final void run() {
        argb argb = this.f87630a;
        argg argg = argb.f87632b;
        arjf arjf = argb.f87633c;
        arjc arjc = argb.f87631a;
        argg.f87654a.mo48666c(2);
        arml.m73129a(argg.f87654a, 8);
        arfh arfh = argg.f87655b;
        sdo.m34959a(arjc);
        if (arfh.f87591i && arfh.f87589g != null) {
            try {
                arfh.mo48482b();
            } finally {
                arfh.m72644c(arjf, new Status(0));
            }
        } else {
            arfh.m72644c(arjf, new Status(10552));
        }
    }
}
