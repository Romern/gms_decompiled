package p000;

import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: aydj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aydj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ConnectionConfiguration f97211a;

    /* renamed from: b */
    final /* synthetic */ aydn f97212b;

    public aydj(aydn aydn, ConnectionConfiguration connectionConfiguration) {
        this.f97212b = aydn;
        this.f97211a = connectionConfiguration;
    }

    public final void run() {
        aycm aycm = this.f97212b.f97225f;
        if (aycm != null) {
            aycm.mo53901b(this.f97211a);
        }
    }
}
