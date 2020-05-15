package p000;

/* renamed from: amog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amog extends bxvk implements bxxd {

    /* renamed from: e */
    public static final amog f75587e;

    /* renamed from: f */
    private static volatile bxxk f75588f;

    /* renamed from: a */
    public int f75589a;

    /* renamed from: b */
    public String f75590b = "";

    /* renamed from: c */
    public long f75591c;

    /* renamed from: d */
    public int f75592d;

    static {
        amog amog = new amog();
        f75587e = amog;
        bxvk.m124024a(amog.class, amog);
    }

    private amog() {
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
            return bxvk.m124022a(f75587e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", amoe.f75586a});
        } else if (i2 == 3) {
            return new amog();
        } else {
            if (i2 == 4) {
                return new bxvd(f75587e);
            }
            if (i2 == 5) {
                return f75587e;
            }
            bxxk bxxk = f75588f;
            if (bxxk == null) {
                synchronized (amog.class) {
                    bxxk = f75588f;
                    if (bxxk == null) {
                        bxxk = new bxve(f75587e);
                        f75588f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
