package p000;

/* renamed from: cbkb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbkb extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbkb f177386d;

    /* renamed from: e */
    private static volatile bxxk f177387e;

    /* renamed from: a */
    public cbmo f177388a;

    /* renamed from: b */
    public int f177389b;

    /* renamed from: c */
    public int f177390c;

    static {
        cbkb cbkb = new cbkb();
        f177386d = cbkb;
        GeneratedMessageLite.m124024a(cbkb.class, cbkb);
    }

    private cbkb() {
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
            return GeneratedMessageLite.m124022a(f177386d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\f\u0003\f", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbkb();
        } else {
            if (i2 == 4) {
                return new bxvd(f177386d);
            }
            if (i2 == 5) {
                return f177386d;
            }
            bxxk bxxk = f177387e;
            if (bxxk == null) {
                synchronized (cbkb.class) {
                    bxxk = f177387e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177386d);
                        f177387e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
