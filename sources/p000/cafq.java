package p000;

/* renamed from: cafq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cafq extends bxvk implements bxxd {

    /* renamed from: j */
    public static final cafq f172942j;

    /* renamed from: k */
    private static volatile bxxk f172943k;

    /* renamed from: a */
    public int f172944a;

    /* renamed from: b */
    public int f172945b;

    /* renamed from: c */
    public bxtx f172946c = bxtx.f164797b;

    /* renamed from: d */
    public int f172947d;

    /* renamed from: e */
    public long f172948e;

    /* renamed from: f */
    public long f172949f;

    /* renamed from: g */
    public caft f172950g;

    /* renamed from: h */
    public cafu f172951h;

    /* renamed from: i */
    public bxwc f172952i = bxxn.f165040b;

    static {
        cafq cafq = new cafq();
        f172942j = cafq;
        bxvk.m124024a(cafq.class, cafq);
    }

    private cafq() {
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
            return bxvk.m124022a(f172942j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဌ\u0000\u0002ည\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\b\u001b", new Object[]{"a", "b", cafs.f172958a, "c", "d", "e", "f", "g", "h", "i", cafr.class});
        } else if (i2 == 3) {
            return new cafq();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f172942j;
            }
            bxxk bxxk = f172943k;
            if (bxxk == null) {
                synchronized (cafq.class) {
                    bxxk = f172943k;
                    if (bxxk == null) {
                        bxxk = new bxve(f172942j);
                        f172943k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
