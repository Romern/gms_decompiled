package p000;

/* renamed from: buym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buym extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final buym f155312c;

    /* renamed from: d */
    private static volatile bxxk f155313d;

    /* renamed from: a */
    public int f155314a;

    /* renamed from: b */
    public int f155315b;

    static {
        buym buym = new buym();
        f155312c = buym;
        GeneratedMessageLite.m124024a(buym.class, buym);
    }

    private buym() {
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
            return GeneratedMessageLite.m124022a(f155312c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", buyo.f155322a});
        } else if (i2 == 3) {
            return new buym();
        } else {
            if (i2 == 4) {
                return new bxvd(f155312c);
            }
            if (i2 == 5) {
                return f155312c;
            }
            bxxk bxxk = f155313d;
            if (bxxk == null) {
                synchronized (buym.class) {
                    bxxk = f155313d;
                    if (bxxk == null) {
                        bxxk = new bxve(f155312c);
                        f155313d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
