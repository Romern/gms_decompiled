package p000;

/* renamed from: btmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btmj extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btmj f149495b;

    /* renamed from: c */
    private static volatile bxxk f149496c;

    /* renamed from: a */
    public int f149497a;

    static {
        btmj btmj = new btmj();
        f149495b = btmj;
        bxvk.m124024a(btmj.class, btmj);
    }

    private btmj() {
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
            return bxvk.m124022a(f149495b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btmj();
        } else {
            if (i2 == 4) {
                return new bxvd(f149495b);
            }
            if (i2 == 5) {
                return f149495b;
            }
            bxxk bxxk = f149496c;
            if (bxxk == null) {
                synchronized (btmj.class) {
                    bxxk = f149496c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149495b);
                        f149496c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
