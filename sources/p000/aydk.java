package p000;

import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: aydk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aydk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ConnectionConfiguration f97213a;

    /* renamed from: b */
    final /* synthetic */ aydn f97214b;

    public aydk(aydn aydn, ConnectionConfiguration connectionConfiguration) {
        this.f97214b = aydn;
        this.f97213a = connectionConfiguration;
    }

    public final void run() {
        aydn aydn = this.f97214b;
        if (aydn.f97226g == null) {
            aydn.f97226g = new aycs(aydn.f97220a);
        }
        this.f97214b.f97226g.mo53911a(this.f97213a);
    }
}
