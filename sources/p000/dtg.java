package p000;

import java.util.Map;

/* renamed from: dtg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dtg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ dtl f13981a;

    public dtg(dtl dtl) {
        this.f13981a = dtl;
    }

    public final void run() {
        for (Map.Entry entry : this.f13981a.f13991b.f14001d.entrySet()) {
            ((drk) entry.getValue()).mo9472a(((dri) entry.getKey()).mo9484a(), null);
        }
    }
}
