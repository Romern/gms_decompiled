package p000;

/* renamed from: bkzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkzn extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bkzn f125624f;

    /* renamed from: g */
    private static volatile bxxk f125625g;

    /* renamed from: a */
    public int f125626a;

    /* renamed from: b */
    public long f125627b;

    /* renamed from: c */
    public int f125628c;

    /* renamed from: d */
    public bkzm f125629d;

    /* renamed from: e */
    public bxwc f125630e = bxxn.f165040b;

    static {
        bkzn bkzn = new bkzn();
        f125624f = bkzn;
        bxvk.m124024a(bkzn.class, bkzn);
    }

    private bkzn() {
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
            return bxvk.m124022a(f125624f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဃ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004\u001a", new Object[]{"a", "b", "c", blax.f125801a, "d", "e"});
        } else if (i2 == 3) {
            return new bkzn();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (boolean[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f125624f;
            }
            bxxk bxxk = f125625g;
            if (bxxk == null) {
                synchronized (bkzn.class) {
                    bxxk = f125625g;
                    if (bxxk == null) {
                        bxxk = new bxve(f125624f);
                        f125625g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
