package p000;

/* renamed from: bsab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsab extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bsab f143825b;

    /* renamed from: c */
    private static volatile bxxk f143826c;

    /* renamed from: a */
    public bxwc f143827a = bxxn.f165040b;

    static {
        bsab bsab = new bsab();
        f143825b = bsab;
        GeneratedMessageLite.m124024a(bsab.class, bsab);
    }

    private bsab() {
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
            return GeneratedMessageLite.m124022a(f143825b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bsah.class});
        } else if (i2 == 3) {
            return new bsab();
        } else {
            if (i2 == 4) {
                return new bxvd(f143825b);
            }
            if (i2 == 5) {
                return f143825b;
            }
            bxxk bxxk = f143826c;
            if (bxxk == null) {
                synchronized (bsab.class) {
                    bxxk = f143826c;
                    if (bxxk == null) {
                        bxxk = new bxve(f143825b);
                        f143826c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
