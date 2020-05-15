package p000;

import android.net.Network;

/* renamed from: aklh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aklh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aklk f72194a;

    /* renamed from: b */
    private final Network f72195b;

    public aklh(aklk aklk, Network network) {
        this.f72194a = aklk;
        this.f72195b = network;
    }

    public final void run() {
        synchronized (this.f72194a.f72204f) {
            if (this.f72195b.equals(this.f72194a.f72205g)) {
                this.f72194a.mo39543d();
            }
        }
    }
}
