package p000;

import android.nfc.Tag;

/* renamed from: aill */
final /* synthetic */ class aill implements Runnable {

    /* renamed from: a */
    private final ailq f69130a;

    /* renamed from: b */
    private final Tag f69131b;

    public aill(ailq ailq, Tag tag) {
        this.f69130a = ailq;
        this.f69131b = tag;
    }

    public final void run() {
        this.f69130a.mo37648a(this.f69131b);
    }
}
