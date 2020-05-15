package p000;

/* renamed from: bqsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqsl extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bqsl f141541c;

    /* renamed from: d */
    private static volatile bxxk f141542d;

    /* renamed from: a */
    public int f141543a;

    /* renamed from: b */
    public bxwc f141544b = bxxn.f165040b;

    static {
        bqsl bqsl = new bqsl();
        f141541c = bqsl;
        bxvk.m124024a(bqsl.class, bqsl);
    }

    private bqsl() {
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
            return bxvk.m124022a(f141541c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"a", "b", bqsk.class});
        } else if (i2 == 3) {
            return new bqsl();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (int[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f141541c;
            }
            bxxk bxxk = f141542d;
            if (bxxk == null) {
                synchronized (bqsl.class) {
                    bxxk = f141542d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141541c);
                        f141542d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
