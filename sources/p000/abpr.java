package p000;

/* renamed from: abpr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abpr extends bxvk implements bxxd {

    /* renamed from: d */
    public static final abpr f57891d;

    /* renamed from: e */
    private static volatile bxxk f57892e;

    /* renamed from: a */
    public int f57893a;

    /* renamed from: b */
    public bxwc f57894b = bxxn.f165040b;

    /* renamed from: c */
    public int f57895c;

    static {
        abpr abpr = new abpr();
        f57891d = abpr;
        bxvk.m124024a(abpr.class, abpr);
    }

    private abpr() {
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
            return bxvk.m124022a(f57891d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"a", "b", abpx.class, "c"});
        } else if (i2 == 3) {
            return new abpr();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (boolean[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f57891d;
            }
            bxxk bxxk = f57892e;
            if (bxxk == null) {
                synchronized (abpr.class) {
                    bxxk = f57892e;
                    if (bxxk == null) {
                        bxxk = new bxve(f57891d);
                        f57892e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo32277a() {
        if (!this.f57894b.mo73666a()) {
            this.f57894b = bxvk.m124021a(this.f57894b);
        }
    }
}
