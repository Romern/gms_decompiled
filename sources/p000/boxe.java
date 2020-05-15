package p000;

/* renamed from: boxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boxe extends bxvk implements bxxd {

    /* renamed from: k */
    public static final boxe f135231k;

    /* renamed from: l */
    private static volatile bxxk f135232l;

    /* renamed from: a */
    public int f135233a;

    /* renamed from: b */
    public String f135234b = "";

    /* renamed from: c */
    public String f135235c = "";

    /* renamed from: d */
    public long f135236d;

    /* renamed from: e */
    public long f135237e;

    /* renamed from: f */
    public String f135238f = "";

    /* renamed from: g */
    public String f135239g = "";

    /* renamed from: h */
    public int f135240h;

    /* renamed from: i */
    public int f135241i;

    /* renamed from: j */
    public int f135242j;

    static {
        boxe boxe = new boxe();
        f135231k = boxe;
        bxvk.m124024a(boxe.class, boxe);
    }

    private boxe() {
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
            return bxvk.m124022a(f135231k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006င\u0006\u0007င\u0007\bင\b\tဂ\u0002", new Object[]{"a", "b", "c", "e", "f", "g", "h", "i", "j", "d"});
        } else if (i2 == 3) {
            return new boxe();
        } else {
            if (i2 == 4) {
                return new bxvd(f135231k);
            }
            if (i2 == 5) {
                return f135231k;
            }
            bxxk bxxk = f135232l;
            if (bxxk == null) {
                synchronized (boxe.class) {
                    bxxk = f135232l;
                    if (bxxk == null) {
                        bxxk = new bxve(f135231k);
                        f135232l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
