package p000;

/* renamed from: bxap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxap extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxap f161732c;

    /* renamed from: d */
    public static final bxvj f161733d;

    /* renamed from: e */
    private static volatile bxxk f161734e;

    /* renamed from: a */
    public int f161735a;

    /* renamed from: b */
    public int f161736b;

    static {
        bxap bxap = new bxap();
        f161732c = bxap;
        GeneratedMessageLite.m124024a(bxap.class, bxap);
        bwog bwog = bwog.f160437f;
        bxap bxap2 = f161732c;
        f161733d = GeneratedMessageLite.m124006a(bwog, bxap2, bxap2, 228982937, bxzf.MESSAGE);
    }

    private bxap() {
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
            return GeneratedMessageLite.m124022a(f161732c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bxaq.f161737a});
        } else if (i2 == 3) {
            return new bxap();
        } else {
            if (i2 == 4) {
                return new bxvd(f161732c);
            }
            if (i2 == 5) {
                return f161732c;
            }
            bxxk bxxk = f161734e;
            if (bxxk == null) {
                synchronized (bxap.class) {
                    bxxk = f161734e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161732c);
                        f161734e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
