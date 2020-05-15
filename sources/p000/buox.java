package p000;

/* renamed from: buox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buox {

    /* renamed from: a */
    public final buph f154601a;

    /* renamed from: b */
    public final bujf f154602b;

    /* renamed from: c */
    public final buoz f154603c;

    /* renamed from: d */
    public final bupd f154604d;

    /* renamed from: e */
    public int f154605e = 0;

    /* renamed from: f */
    public int f154606f = 0;

    public buox(bujf bujf, buoz buoz) {
        bmxy.m108588a(true);
        bmxy.m108588a(true);
        this.f154602b = bujf;
        this.f154603c = buoz;
        buph buph = new buph(buoz.f154611d, buoz.f154612e, buoz.f154613f);
        this.f154601a = buph;
        buph.f154639d = 3;
        int i = buoz.f154618k;
        int i2 = i - 1;
        bupd bupd = null;
        if (i != 0) {
            if (i2 != 0 && i2 == 1) {
                bupd = new bupd();
            }
            this.f154604d = bupd;
            return;
        }
        throw null;
    }
}
