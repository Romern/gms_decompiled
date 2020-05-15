package p000;

/* renamed from: aaph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaph extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final aaph f28760j;

    /* renamed from: k */
    private static volatile bxxk f28761k;

    /* renamed from: a */
    public int f28762a;

    /* renamed from: b */
    public aapl f28763b;

    /* renamed from: c */
    public bxun f28764c;

    /* renamed from: d */
    public bxun f28765d;

    /* renamed from: e */
    public int f28766e;

    /* renamed from: f */
    public int f28767f;

    /* renamed from: g */
    public int f28768g;

    /* renamed from: h */
    public aapf f28769h;

    /* renamed from: i */
    public int f28770i;

    static {
        aaph aaph = new aaph();
        f28760j = aaph;
        GeneratedMessageLite.m124024a(aaph.class, aaph);
    }

    private aaph() {
        bxvm bxvm = bxvm.f164965b;
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
            return GeneratedMessageLite.m124022a(f28760j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\bဌ\u0006\tဉ\u0007\nင\b", new Object[]{"a", "b", "c", "d", "e", aaot.f28719a, "f", aapg.f28759a, "g", aapx.m21802b(), "h", "i"});
        } else if (i2 == 3) {
            return new aaph();
        } else {
            if (i2 == 4) {
                return new bxvd(f28760j);
            }
            if (i2 == 5) {
                return f28760j;
            }
            bxxk bxxk = f28761k;
            if (bxxk == null) {
                synchronized (aaph.class) {
                    bxxk = f28761k;
                    if (bxxk == null) {
                        bxxk = new bxve(f28760j);
                        f28761k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
