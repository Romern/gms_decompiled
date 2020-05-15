package p000;

/* renamed from: btyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btyl extends bxvk implements bxxd {

    /* renamed from: g */
    public static final btyl f152937g;

    /* renamed from: h */
    private static volatile bxxk f152938h;

    /* renamed from: a */
    public int f152939a;

    /* renamed from: b */
    public boolean f152940b;

    /* renamed from: c */
    public long f152941c;

    /* renamed from: d */
    public int f152942d;

    /* renamed from: e */
    public long f152943e;

    /* renamed from: f */
    public long f152944f;

    static {
        btyl btyl = new btyl();
        f152937g = btyl;
        bxvk.m124024a(btyl.class, btyl);
    }

    private btyl() {
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
            return bxvk.m124022a(f152937g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဃ\u0001\u0003ဋ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new btyl();
        } else {
            if (i2 == 4) {
                return new bxvd(f152937g);
            }
            if (i2 == 5) {
                return f152937g;
            }
            bxxk bxxk = f152938h;
            if (bxxk == null) {
                synchronized (btyl.class) {
                    bxxk = f152938h;
                    if (bxxk == null) {
                        bxxk = new bxve(f152937g);
                        f152938h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
