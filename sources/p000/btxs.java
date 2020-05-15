package p000;

/* renamed from: btxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btxs extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btxs f152847e;

    /* renamed from: f */
    private static volatile bxxk f152848f;

    /* renamed from: a */
    public int f152849a;

    /* renamed from: b */
    public btyc f152850b;

    /* renamed from: c */
    public long f152851c;

    /* renamed from: d */
    public long f152852d;

    static {
        btxs btxs = new btxs();
        f152847e = btxs;
        bxvk.m124024a(btxs.class, btxs);
    }

    private btxs() {
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
            return bxvk.m124022a(f152847e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btxs();
        } else {
            if (i2 == 4) {
                return new bxvd(f152847e);
            }
            if (i2 == 5) {
                return f152847e;
            }
            bxxk bxxk = f152848f;
            if (bxxk == null) {
                synchronized (btxs.class) {
                    bxxk = f152848f;
                    if (bxxk == null) {
                        bxxk = new bxve(f152847e);
                        f152848f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
