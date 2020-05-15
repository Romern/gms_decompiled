package p000;

/* renamed from: bmly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmly extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmly f129989c;

    /* renamed from: d */
    private static volatile bxxk f129990d;

    /* renamed from: a */
    public bxwc f129991a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f129992b = bxxn.f165040b;

    static {
        bmly bmly = new bmly();
        f129989c = bmly;
        GeneratedMessageLite.m124024a(bmly.class, bmly);
    }

    private bmly() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f129989c, "\u0001\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", new Object[]{"a", bmne.class, "b", bmmv.class});
        } else if (i2 == 3) {
            return new bmly();
        } else {
            if (i2 == 4) {
                return new bxvd(f129989c);
            }
            if (i2 == 5) {
                return f129989c;
            }
            bxxk bxxk = f129990d;
            if (bxxk == null) {
                synchronized (bmly.class) {
                    bxxk = f129990d;
                    if (bxxk == null) {
                        bxxk = new bxve(f129989c);
                        f129990d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
