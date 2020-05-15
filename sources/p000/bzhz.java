package p000;

/* renamed from: bzhz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzhz extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzhz f170135c;

    /* renamed from: d */
    private static volatile bxxk f170136d;

    /* renamed from: a */
    public int f170137a;

    /* renamed from: b */
    public int f170138b;

    static {
        bzhz bzhz = new bzhz();
        f170135c = bzhz;
        GeneratedMessageLite.m124024a(bzhz.class, bzhz);
    }

    private bzhz() {
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
            return GeneratedMessageLite.m124022a(f170135c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bzhy.f170134a});
        } else if (i2 == 3) {
            return new bzhz();
        } else {
            if (i2 == 4) {
                return new bxvd(f170135c);
            }
            if (i2 == 5) {
                return f170135c;
            }
            bxxk bxxk = f170136d;
            if (bxxk == null) {
                synchronized (bzhz.class) {
                    bxxk = f170136d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170135c);
                        f170136d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
