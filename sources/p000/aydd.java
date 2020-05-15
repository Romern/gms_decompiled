package p000;

import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: aydd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aydd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ConnectionConfiguration f97201a;

    /* renamed from: b */
    final /* synthetic */ aydn f97202b;

    public aydd(aydn aydn, ConnectionConfiguration connectionConfiguration) {
        this.f97202b = aydn;
        this.f97201a = connectionConfiguration;
    }

    public final void run() {
        this.f97202b.mo53954b(this.f97201a);
    }
}
