package p000;

/* renamed from: bvtw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvtw extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bvtw f157626b;

    /* renamed from: c */
    private static volatile bxxk f157627c;

    /* renamed from: a */
    public bxwc f157628a = bxxn.f165040b;

    static {
        bvtw bvtw = new bvtw();
        f157626b = bvtw;
        GeneratedMessageLite.m124024a(bvtw.class, bvtw);
    }

    private bvtw() {
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
            return GeneratedMessageLite.m124022a(f157626b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bvud.class});
        } else if (i2 == 3) {
            return new bvtw();
        } else {
            if (i2 == 4) {
                return new bxvd(f157626b);
            }
            if (i2 == 5) {
                return f157626b;
            }
            bxxk bxxk = f157627c;
            if (bxxk == null) {
                synchronized (bvtw.class) {
                    bxxk = f157627c;
                    if (bxxk == null) {
                        bxxk = new bxve(f157626b);
                        f157627c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
