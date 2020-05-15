package p000;

/* renamed from: mrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mrj extends bxvk implements bxxd {

    /* renamed from: i */
    public static final mrj f34426i;

    /* renamed from: j */
    private static volatile bxxk f34427j;

    /* renamed from: a */
    public int f34428a;

    /* renamed from: b */
    public long f34429b;

    /* renamed from: c */
    public String f34430c = "";

    /* renamed from: d */
    public long f34431d;

    /* renamed from: e */
    public long f34432e;

    /* renamed from: f */
    public int f34433f;

    /* renamed from: g */
    public int f34434g;

    /* renamed from: h */
    public int f34435h;

    static {
        mrj mrj = new mrj();
        f34426i = mrj;
        bxvk.m124024a(mrj.class, mrj);
    }

    private mrj() {
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
            return bxvk.m124022a(f34426i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဌ\u0004\u0005င\u0005\u0006ဂ\u0003\u0007င\u0006", new Object[]{"a", "b", "c", "d", "f", mri.f34425a, "g", "e", "h"});
        } else if (i2 == 3) {
            return new mrj();
        } else {
            if (i2 == 4) {
                return new bxvd(f34426i);
            }
            if (i2 == 5) {
                return f34426i;
            }
            bxxk bxxk = f34427j;
            if (bxxk == null) {
                synchronized (mrj.class) {
                    bxxk = f34427j;
                    if (bxxk == null) {
                        bxxk = new bxve(f34426i);
                        f34427j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
