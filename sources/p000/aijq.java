package p000;

import com.google.android.gms.beacon.BleSighting;

/* renamed from: aijq */
final /* synthetic */ class aijq implements Runnable {

    /* renamed from: a */
    private final aijr f68984a;

    /* renamed from: b */
    private final BleSighting f68985b;

    public aijq(aijr aijr, BleSighting bleSighting) {
        this.f68984a = aijr;
        this.f68985b = bleSighting;
    }

    public final void run() {
        aijr aijr = this.f68984a;
        BleSighting bleSighting = this.f68985b;
        aikx aikx = aijr.f68986a;
        int i = aikx.f69072i;
        aikx.mo37613a(bleSighting);
    }
}
