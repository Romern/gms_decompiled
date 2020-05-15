package p000;

import android.os.CancellationSignal;

/* renamed from: bdzh */
final /* synthetic */ class bdzh implements Runnable {

    /* renamed from: a */
    private final CancellationSignal f106683a;

    public bdzh(CancellationSignal cancellationSignal) {
        this.f106683a = cancellationSignal;
    }

    public final void run() {
        bdzj.m91633a(this.f106683a);
    }
}
