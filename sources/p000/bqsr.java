package p000;

@Deprecated
/* renamed from: bqsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqsr extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bqsr f141560b;

    /* renamed from: c */
    private static volatile bxxk f141561c;

    /* renamed from: a */
    public bxwc f141562a = bxxn.f165040b;

    static {
        bqsr bqsr = new bqsr();
        f141560b = bqsr;
        bxvk.m124024a(bqsr.class, bqsr);
    }

    private bqsr() {
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
            return bxvk.m124022a(f141560b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", bqsg.class});
        } else if (i2 == 3) {
            return new bqsr();
        } else {
            if (i2 == 4) {
                return new bxvd(f141560b);
            }
            if (i2 == 5) {
                return f141560b;
            }
            bxxk bxxk = f141561c;
            if (bxxk == null) {
                synchronized (bqsr.class) {
                    bxxk = f141561c;
                    if (bxxk == null) {
                        bxxk = new bxve(f141560b);
                        f141561c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
