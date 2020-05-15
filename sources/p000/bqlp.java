package p000;

/* renamed from: bqlp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqlp extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bqlp f141129f;

    /* renamed from: g */
    private static volatile bxxk f141130g;

    /* renamed from: a */
    public long f141131a;

    /* renamed from: b */
    public int f141132b;

    /* renamed from: c */
    public long f141133c;

    /* renamed from: d */
    public long f141134d;

    /* renamed from: e */
    public bxwc f141135e = bxxn.f165040b;

    static {
        bqlp bqlp = new bqlp();
        f141129f = bqlp;
        bxvk.m124024a(bqlp.class, bqlp);
    }

    private bqlp() {
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
            return bxvk.m124022a(f141129f, "\u0000\u0005\u0000\u0000\u0002\u0006\u0005\u0000\u0001\u0000\u0002\u0002\u0003\u0004\u0004\u0002\u0005\u0002\u0006\u001b", new Object[]{"a", "b", "c", "d", "e", bqma.class});
        } else if (i2 == 3) {
            return new bqlp();
        } else {
            if (i2 == 4) {
                return new bxvd(f141129f);
            }
            if (i2 == 5) {
                return f141129f;
            }
            bxxk bxxk = f141130g;
            if (bxxk == null) {
                synchronized (bqlp.class) {
                    bxxk = f141130g;
                    if (bxxk == null) {
                        bxxk = new bxve(f141129f);
                        f141130g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
