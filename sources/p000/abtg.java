package p000;

/* renamed from: abtg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abtg extends bxvk implements bxxd {

    /* renamed from: f */
    public static final abtg f58218f;

    /* renamed from: g */
    private static volatile bxxk f58219g;

    /* renamed from: a */
    public int f58220a;

    /* renamed from: b */
    public int f58221b = 604800;

    /* renamed from: c */
    public int f58222c = 1;

    /* renamed from: d */
    public int f58223d = 2;

    /* renamed from: e */
    public int f58224e = 2;

    static {
        abtg abtg = new abtg();
        f58218f = abtg;
        bxvk.m124024a(abtg.class, abtg);
    }

    private abtg() {
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
            return bxvk.m124022a(f58218f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new abtg();
        } else {
            if (i2 == 4) {
                return new bxvd(f58218f);
            }
            if (i2 == 5) {
                return f58218f;
            }
            bxxk bxxk = f58219g;
            if (bxxk == null) {
                synchronized (abtg.class) {
                    bxxk = f58219g;
                    if (bxxk == null) {
                        bxxk = new bxve(f58218f);
                        f58219g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
