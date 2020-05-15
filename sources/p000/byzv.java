package p000;

/* renamed from: byzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byzv extends bxvg implements bxvh {

    /* renamed from: c */
    public static final byzv f169179c;

    /* renamed from: f */
    private static volatile bxxk f169180f;

    /* renamed from: a */
    public String f169181a = "";

    /* renamed from: b */
    public int f169182b;

    /* renamed from: d */
    private int f169183d;

    /* renamed from: e */
    private byte f169184e = 2;

    static {
        byzv byzv = new byzv();
        f169179c = byzv;
        bxvk.m124024a(byzv.class, byzv);
    }

    private byzv() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169184e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169184e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f169179c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဌ\u0001", new Object[]{"d", "a", "b", bzbv.f169276a});
        } else if (i2 == 3) {
            return new byzv();
        } else {
            if (i2 == 4) {
                return new bxvf(f169179c);
            }
            if (i2 == 5) {
                return f169179c;
            }
            bxxk bxxk = f169180f;
            if (bxxk == null) {
                synchronized (byzv.class) {
                    bxxk = f169180f;
                    if (bxxk == null) {
                        bxxk = new bxve(f169179c);
                        f169180f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
