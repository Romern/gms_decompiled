package p000;

/* renamed from: btxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btxu extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btxu f152857e;

    /* renamed from: f */
    private static volatile bxxk f152858f;

    /* renamed from: a */
    public int f152859a;

    /* renamed from: b */
    public btyd f152860b;

    /* renamed from: c */
    public btyd f152861c;

    /* renamed from: d */
    public long f152862d;

    static {
        btxu btxu = new btxu();
        f152857e = btxu;
        bxvk.m124024a(btxu.class, btxu);
    }

    private btxu() {
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
            return bxvk.m124022a(f152857e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btxu();
        } else {
            if (i2 == 4) {
                return new bxvd(f152857e);
            }
            if (i2 == 5) {
                return f152857e;
            }
            bxxk bxxk = f152858f;
            if (bxxk == null) {
                synchronized (btxu.class) {
                    bxxk = f152858f;
                    if (bxxk == null) {
                        bxxk = new bxve(f152857e);
                        f152858f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
