package p000;

/* renamed from: bosm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bosm extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bosm f134615e;

    /* renamed from: f */
    private static volatile bxxk f134616f;

    /* renamed from: a */
    public int f134617a;

    /* renamed from: b */
    public boolean f134618b;

    /* renamed from: c */
    public bosl f134619c;

    /* renamed from: d */
    public bxwc f134620d = bxxn.f165040b;

    static {
        bosm bosm = new bosm();
        f134615e = bosm;
        bxvk.m124024a(bosm.class, bosm);
    }

    private bosm() {
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
            return bxvk.m124022a(f134615e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", bosl.class});
        } else if (i2 == 3) {
            return new bosm();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (char[][][]) null);
            }
            if (i2 == 5) {
                return f134615e;
            }
            bxxk bxxk = f134616f;
            if (bxxk == null) {
                synchronized (bosm.class) {
                    bxxk = f134616f;
                    if (bxxk == null) {
                        bxxk = new bxve(f134615e);
                        f134616f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
