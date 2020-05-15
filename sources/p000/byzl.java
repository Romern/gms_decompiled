package p000;

/* renamed from: byzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byzl extends bxvg implements bxvh {

    /* renamed from: d */
    public static final byzl f169119d;

    /* renamed from: f */
    private static volatile bxxk f169120f;

    /* renamed from: a */
    public int f169121a;

    /* renamed from: b */
    public int f169122b;

    /* renamed from: c */
    public byzc f169123c;

    /* renamed from: e */
    private byte f169124e = 2;

    static {
        byzl byzl = new byzl();
        f169119d = byzl;
        bxvk.m124024a(byzl.class, byzl);
    }

    private byzl() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169124e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169124e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f169119d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", bzbm.f169259a, "c"});
        } else if (i2 == 3) {
            return new byzl();
        } else {
            if (i2 == 4) {
                return new bxvf(f169119d);
            }
            if (i2 == 5) {
                return f169119d;
            }
            bxxk bxxk = f169120f;
            if (bxxk == null) {
                synchronized (byzl.class) {
                    bxxk = f169120f;
                    if (bxxk == null) {
                        bxxk = new bxve(f169119d);
                        f169120f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
