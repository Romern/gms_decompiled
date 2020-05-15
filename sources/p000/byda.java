package p000;

/* renamed from: byda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byda extends bxvk implements bxxd {

    /* renamed from: e */
    public static final byda f165750e;

    /* renamed from: f */
    private static volatile bxxk f165751f;

    /* renamed from: a */
    public int f165752a;

    /* renamed from: b */
    public long f165753b;

    /* renamed from: c */
    public long f165754c;

    /* renamed from: d */
    public int f165755d;

    static {
        byda byda = new byda();
        f165750e = byda;
        bxvk.m124024a(byda.class, byda);
    }

    private byda() {
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
            return bxvk.m124022a(f165750e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new byda();
        } else {
            if (i2 == 4) {
                return new bxvd(f165750e);
            }
            if (i2 == 5) {
                return f165750e;
            }
            bxxk bxxk = f165751f;
            if (bxxk == null) {
                synchronized (byda.class) {
                    bxxk = f165751f;
                    if (bxxk == null) {
                        bxxk = new bxve(f165750e);
                        f165751f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
