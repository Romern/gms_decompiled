package p000;

import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: aydl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aydl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ConnectionConfiguration f97215a;

    /* renamed from: b */
    final /* synthetic */ aydn f97216b;

    public aydl(aydn aydn, ConnectionConfiguration connectionConfiguration) {
        this.f97216b = aydn;
        this.f97215a = connectionConfiguration;
    }

    public final void run() {
        aycs aycs = this.f97216b.f97226g;
        if (aycs != null) {
            aycs.mo53913b(this.f97215a);
        }
    }
}
