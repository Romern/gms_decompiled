package p000;

/* renamed from: bmju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmju extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bmju f129743h;

    /* renamed from: i */
    private static volatile bxxk f129744i;

    /* renamed from: a */
    public int f129745a;

    /* renamed from: b */
    public long f129746b;

    /* renamed from: c */
    public bmjy f129747c;

    /* renamed from: d */
    public bxwc f129748d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f129749e = bxxn.f165040b;

    /* renamed from: f */
    public boolean f129750f;

    /* renamed from: g */
    public String f129751g = "";

    static {
        bmju bmju = new bmju();
        f129743h = bmju;
        bxvk.m124024a(bmju.class, bmju);
    }

    private bmju() {
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
            return bxvk.m124022a(f129743h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001ဂ\u0000\u0003\u001b\u0004\u001b\u0005ဇ\u0002\u0006ဈ\u0003\u0007ဉ\u0001", new Object[]{"a", "b", "d", bmjy.class, "e", bmjy.class, "f", "g", "c"});
        } else if (i2 == 3) {
            return new bmju();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (boolean[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f129743h;
            }
            bxxk bxxk = f129744i;
            if (bxxk == null) {
                synchronized (bmju.class) {
                    bxxk = f129744i;
                    if (bxxk == null) {
                        bxxk = new bxve(f129743h);
                        f129744i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
