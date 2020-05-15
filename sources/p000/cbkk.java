package p000;

/* renamed from: cbkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbkk extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cbkk f177417d;

    /* renamed from: e */
    private static volatile bxxk f177418e;

    /* renamed from: a */
    public cbma f177419a;

    /* renamed from: b */
    public cbkj f177420b;

    /* renamed from: c */
    public cbmo f177421c;

    static {
        cbkk cbkk = new cbkk();
        f177417d = cbkk;
        bxvk.m124024a(cbkk.class, cbkk);
    }

    private cbkk() {
        bxxn bxxn = bxxn.f165040b;
        bxtx bxtx = bxtx.f164797b;
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
            return bxvk.m124022a(f177417d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbkk();
        } else {
            if (i2 == 4) {
                return new bxvd(f177417d);
            }
            if (i2 == 5) {
                return f177417d;
            }
            bxxk bxxk = f177418e;
            if (bxxk == null) {
                synchronized (cbkk.class) {
                    bxxk = f177418e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177417d);
                        f177418e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
