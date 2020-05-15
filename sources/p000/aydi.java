package p000;

import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: aydi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aydi implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ConnectionConfiguration f97209a;

    /* renamed from: b */
    final /* synthetic */ aydn f97210b;

    public aydi(aydn aydn, ConnectionConfiguration connectionConfiguration) {
        this.f97210b = aydn;
        this.f97209a = connectionConfiguration;
    }

    public final void run() {
        aydn aydn = this.f97210b;
        if (aydn.f97225f == null) {
            aydn.f97225f = new aycm(aydn.f97220a);
        }
        this.f97210b.f97225f.mo53900a(this.f97209a);
    }
}
