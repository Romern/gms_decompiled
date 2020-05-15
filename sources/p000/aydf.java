package p000;

import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: aydf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aydf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ConnectionConfiguration f97205a;

    /* renamed from: b */
    final /* synthetic */ aydn f97206b;

    public aydf(aydn aydn, ConnectionConfiguration connectionConfiguration) {
        this.f97206b = aydn;
        this.f97205a = connectionConfiguration;
    }

    public final void run() {
        aycs aycs = this.f97206b.f97226g;
        if (aycs != null) {
            aycs.mo53913b(this.f97205a);
        }
    }
}
