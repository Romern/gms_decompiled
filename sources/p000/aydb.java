package p000;

import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: aydb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aydb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ConnectionConfiguration f97197a;

    /* renamed from: b */
    final /* synthetic */ aydn f97198b;

    public aydb(aydn aydn, ConnectionConfiguration connectionConfiguration) {
        this.f97198b = aydn;
        this.f97197a = connectionConfiguration;
    }

    public final void run() {
        aydn aydn = this.f97198b;
        if (aydn.f97226g == null) {
            aydn.f97226g = new aycs(aydn.f97220a);
        }
        this.f97198b.f97226g.mo53911a(this.f97197a);
    }
}
