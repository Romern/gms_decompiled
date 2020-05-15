package p000;

/* renamed from: cixb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cixb extends bxvk implements bxxd {

    /* renamed from: m */
    public static final cixb f191646m;

    /* renamed from: n */
    private static volatile bxxk f191647n;

    /* renamed from: a */
    public int f191648a;

    /* renamed from: b */
    public int f191649b;

    /* renamed from: c */
    public bxtx f191650c = bxtx.f164797b;

    /* renamed from: d */
    public bxtx f191651d = bxtx.f164797b;

    /* renamed from: e */
    public bxtx f191652e = bxtx.f164797b;

    /* renamed from: f */
    public int f191653f;

    /* renamed from: g */
    public ciwz f191654g;

    /* renamed from: h */
    public bxwc f191655h = bxxn.f165040b;

    /* renamed from: i */
    public cixa f191656i;

    /* renamed from: j */
    public int f191657j;

    /* renamed from: k */
    public int f191658k;

    /* renamed from: l */
    public bxtx f191659l = bxtx.f164797b;

    static {
        cixb cixb = new cixb();
        f191646m = cixb;
        bxvk.m124024a(cixb.class, cixb);
    }

    private cixb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return bxvk.m124022a(f191646m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0000\u0001ဋ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဋ\u0004\u0006ဉ\u0005\u0007\u001b\tဉ\u0007\nဋ\b\u000bဋ\t\rည\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", ciwz.class, "i", "j", "k", "l"});
        } else if (i2 == 3) {
            return new cixb();
        } else {
            if (i2 == 4) {
                return new ciww();
            }
            if (i2 == 5) {
                return f191646m;
            }
            bxxk bxxk = f191647n;
            if (bxxk == null) {
                synchronized (cixb.class) {
                    bxxk = f191647n;
                    if (bxxk == null) {
                        bxxk = new bxve(f191646m);
                        f191647n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo86621c() {
        if (!this.f191655h.mo73666a()) {
            this.f191655h = bxvk.m124021a(this.f191655h);
        }
    }
}
