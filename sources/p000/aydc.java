package p000;

import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: aydc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aydc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ConnectionConfiguration f97199a;

    /* renamed from: b */
    final /* synthetic */ aydn f97200b;

    public aydc(aydn aydn, ConnectionConfiguration connectionConfiguration) {
        this.f97200b = aydn;
        this.f97199a = connectionConfiguration;
    }

    public final void run() {
        aydn aydn = this.f97200b;
        if (aydn.f97228i == null) {
            aydn.f97228i = new ayds(this.f97199a);
        }
    }
}
