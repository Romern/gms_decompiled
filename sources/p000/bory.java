package p000;

/* renamed from: bory */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bory extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bory f134528e;

    /* renamed from: f */
    private static volatile bxxk f134529f;

    /* renamed from: a */
    public int f134530a;

    /* renamed from: b */
    public bxwc f134531b = bxxn.f165040b;

    /* renamed from: c */
    public long f134532c;

    /* renamed from: d */
    public int f134533d;

    static {
        bory bory = new bory();
        f134528e = bory;
        bxvk.m124024a(bory.class, bory);
    }

    private bory() {
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
            return bxvk.m124022a(f134528e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000\u0003င\u0001", new Object[]{"a", "b", borx.class, "c", "d"});
        } else if (i2 == 3) {
            return new bory();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (float[][]) null);
            }
            if (i2 == 5) {
                return f134528e;
            }
            bxxk bxxk = f134529f;
            if (bxxk == null) {
                synchronized (bory.class) {
                    bxxk = f134529f;
                    if (bxxk == null) {
                        bxxk = new bxve(f134528e);
                        f134529f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
