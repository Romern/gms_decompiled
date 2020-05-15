package p000;

/* renamed from: amnj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amnj extends bxvk implements bxxd {

    /* renamed from: c */
    public static final amnj f75484c;

    /* renamed from: d */
    private static volatile bxxk f75485d;

    /* renamed from: a */
    public int f75486a;

    /* renamed from: b */
    public long f75487b;

    static {
        amnj amnj = new amnj();
        f75484c = amnj;
        bxvk.m124024a(amnj.class, amnj);
    }

    private amnj() {
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
            return bxvk.m124022a(f75484c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new amnj();
        } else {
            if (i2 == 4) {
                return new bxvd(f75484c);
            }
            if (i2 == 5) {
                return f75484c;
            }
            bxxk bxxk = f75485d;
            if (bxxk == null) {
                synchronized (amnj.class) {
                    bxxk = f75485d;
                    if (bxxk == null) {
                        bxxk = new bxve(f75484c);
                        f75485d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
