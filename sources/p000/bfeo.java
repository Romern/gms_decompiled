package p000;

import android.telephony.CellLocation;

/* renamed from: bfeo */
final /* synthetic */ class bfeo implements Runnable {

    /* renamed from: a */
    private final bfev f113576a;

    /* renamed from: b */
    private final int f113577b;

    /* renamed from: c */
    private final String f113578c;

    /* renamed from: d */
    private final CellLocation f113579d;

    /* renamed from: e */
    private final int f113580e;

    /* renamed from: f */
    private final long f113581f;

    public bfeo(bfev bfev, int i, String str, CellLocation cellLocation, int i2, long j) {
        this.f113576a = bfev;
        this.f113577b = i;
        this.f113578c = str;
        this.f113579d = cellLocation;
        this.f113580e = i2;
        this.f113581f = j;
    }

    public final void run() {
        bfev bfev = this.f113576a;
        bfev.f113606a.mo61589a(this.f113577b, this.f113578c, this.f113579d, this.f113580e, this.f113581f);
    }
}
