package p000;

/* renamed from: bsae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsae extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bsae f143833b;

    /* renamed from: c */
    private static volatile bxxk f143834c;

    /* renamed from: a */
    public bxwc f143835a = bxxn.f165040b;

    static {
        bsae bsae = new bsae();
        f143833b = bsae;
        GeneratedMessageLite.m124024a(bsae.class, bsae);
    }

    private bsae() {
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
            return GeneratedMessageLite.m124022a(f143833b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", brzs.class});
        } else if (i2 == 3) {
            return new bsae();
        } else {
            if (i2 == 4) {
                return new bxvd(f143833b);
            }
            if (i2 == 5) {
                return f143833b;
            }
            bxxk bxxk = f143834c;
            if (bxxk == null) {
                synchronized (bsae.class) {
                    bxxk = f143834c;
                    if (bxxk == null) {
                        bxxk = new bxve(f143833b);
                        f143834c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
