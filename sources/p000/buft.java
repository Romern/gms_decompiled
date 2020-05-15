package p000;

/* renamed from: buft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buft extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final buft f153736d;

    /* renamed from: e */
    private static volatile bxxk f153737e;

    /* renamed from: a */
    public int f153738a;

    /* renamed from: b */
    public int f153739b;

    /* renamed from: c */
    public int f153740c;

    static {
        buft buft = new buft();
        f153736d = buft;
        GeneratedMessageLite.m124024a(buft.class, buft);
    }

    private buft() {
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
            return GeneratedMessageLite.m124022a(f153736d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဌ\u0001", new Object[]{"a", "b", bufq.f153734a, "c", bufs.f153735a});
        } else if (i2 == 3) {
            return new buft();
        } else {
            if (i2 == 4) {
                return new bxvd(f153736d);
            }
            if (i2 == 5) {
                return f153736d;
            }
            bxxk bxxk = f153737e;
            if (bxxk == null) {
                synchronized (buft.class) {
                    bxxk = f153737e;
                    if (bxxk == null) {
                        bxxk = new bxve(f153736d);
                        f153737e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
