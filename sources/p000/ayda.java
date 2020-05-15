package p000;

import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: ayda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayda implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ConnectionConfiguration f97195a;

    /* renamed from: b */
    final /* synthetic */ aydn f97196b;

    public ayda(aydn aydn, ConnectionConfiguration connectionConfiguration) {
        this.f97196b = aydn;
        this.f97195a = connectionConfiguration;
    }

    public final void run() {
        aydn aydn = this.f97196b;
        if (aydn.f97225f == null) {
            aydn.f97225f = new aycm(aydn.f97220a);
        }
        this.f97196b.f97225f.mo53900a(this.f97195a);
    }
}
