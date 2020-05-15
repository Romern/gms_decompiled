package p000;

/* renamed from: cadh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cadh extends bxvk implements bxxd {

    /* renamed from: j */
    public static final cadh f172669j;

    /* renamed from: k */
    private static volatile bxxk f172670k;

    /* renamed from: a */
    public int f172671a;

    /* renamed from: b */
    public long f172672b;

    /* renamed from: c */
    public long f172673c;

    /* renamed from: d */
    public String f172674d = "";

    /* renamed from: e */
    public bxwc f172675e = bxxn.f165040b;

    /* renamed from: f */
    public cadb f172676f;

    /* renamed from: g */
    public cadc f172677g;

    /* renamed from: h */
    public cadd f172678h;

    /* renamed from: i */
    public cadg f172679i;

    static {
        cadh cadh = new cadh();
        f172669j = cadh;
        bxvk.m124024a(cadh.class, cadh);
    }

    private cadh() {
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
            return bxvk.m124022a(f172669j, "\u0001\b\u0000\u0001\u0002\t\b\u0000\u0001\u0000\u0002ဈ\u0003\u0003\u001b\u0004ဉ\u0004\u0005ဉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bဂ\u0001\tဂ\u0002", new Object[]{"a", "d", "e", cada.class, "f", "g", "h", "i", "b", "c"});
        } else if (i2 == 3) {
            return new cadh();
        } else {
            if (i2 == 4) {
                return new bxvd(f172669j);
            }
            if (i2 == 5) {
                return f172669j;
            }
            bxxk bxxk = f172670k;
            if (bxxk == null) {
                synchronized (cadh.class) {
                    bxxk = f172670k;
                    if (bxxk == null) {
                        bxxk = new bxve(f172669j);
                        f172670k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
