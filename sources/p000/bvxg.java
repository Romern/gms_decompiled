package p000;

/* renamed from: bvxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvxg extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bvxg f158058b;

    /* renamed from: c */
    private static volatile bxxk f158059c;

    /* renamed from: a */
    public bxwc f158060a = bxxn.f165040b;

    static {
        bvxg bvxg = new bvxg();
        f158058b = bvxg;
        GeneratedMessageLite.m124024a(bvxg.class, bvxg);
    }

    private bvxg() {
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
            return GeneratedMessageLite.m124022a(f158058b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bvvs.class});
        } else if (i2 == 3) {
            return new bvxg();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (int[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f158058b;
            }
            bxxk bxxk = f158059c;
            if (bxxk == null) {
                synchronized (bvxg.class) {
                    bxxk = f158059c;
                    if (bxxk == null) {
                        bxxk = new bxve(f158058b);
                        f158059c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
