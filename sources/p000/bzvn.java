package p000;

/* renamed from: bzvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzvn extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzvn f171532c;

    /* renamed from: d */
    private static volatile bxxk f171533d;

    /* renamed from: a */
    public int f171534a;

    /* renamed from: b */
    public int f171535b;

    static {
        bzvn bzvn = new bzvn();
        f171532c = bzvn;
        GeneratedMessageLite.m124024a(bzvn.class, bzvn);
    }

    private bzvn() {
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
            return GeneratedMessageLite.m124022a(f171532c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bzvk.f171523a});
        } else if (i2 == 3) {
            return new bzvn();
        } else {
            if (i2 == 4) {
                return new bxvd(f171532c);
            }
            if (i2 == 5) {
                return f171532c;
            }
            bxxk bxxk = f171533d;
            if (bxxk == null) {
                synchronized (bzvn.class) {
                    bxxk = f171533d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171532c);
                        f171533d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
