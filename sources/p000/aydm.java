package p000;

import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: aydm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aydm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ConnectionConfiguration f97217a;

    /* renamed from: b */
    final /* synthetic */ aydn f97218b;

    public aydm(aydn aydn, ConnectionConfiguration connectionConfiguration) {
        this.f97218b = aydn;
        this.f97217a = connectionConfiguration;
    }

    public final void run() {
        aydn aydn = this.f97218b;
        if (aydn.f97228i == null) {
            aydn.f97228i = new ayds(this.f97217a);
        }
    }
}
