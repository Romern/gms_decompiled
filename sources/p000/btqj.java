package p000;

/* renamed from: btqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btqj extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btqj f149958e;

    /* renamed from: f */
    private static volatile bxxk f149959f;

    /* renamed from: a */
    public int f149960a;

    /* renamed from: b */
    public long f149961b;

    /* renamed from: c */
    public btnd f149962c;

    /* renamed from: d */
    public long f149963d;

    static {
        btqj btqj = new btqj();
        f149958e = btqj;
        bxvk.m124024a(btqj.class, btqj);
    }

    private btqj() {
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
            return bxvk.m124022a(f149958e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u0002\u0003\t\u0004\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btqj();
        } else {
            if (i2 == 4) {
                return new bxvd(f149958e);
            }
            if (i2 == 5) {
                return f149958e;
            }
            bxxk bxxk = f149959f;
            if (bxxk == null) {
                synchronized (btqj.class) {
                    bxxk = f149959f;
                    if (bxxk == null) {
                        bxxk = new bxve(f149958e);
                        f149959f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
