package p000;

/* renamed from: kwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kwk extends bxvk implements bxxd {

    /* renamed from: d */
    public static final kwk f25275d;

    /* renamed from: e */
    private static volatile bxxk f25276e;

    /* renamed from: a */
    public int f25277a;

    /* renamed from: b */
    public kwg f25278b;

    /* renamed from: c */
    public kws f25279c;

    static {
        kwk kwk = new kwk();
        f25275d = kwk;
        bxvk.m124024a(kwk.class, kwk);
    }

    private kwk() {
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
            return bxvk.m124022a(f25275d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\t\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new kwk();
        } else {
            if (i2 == 4) {
                return new bxvd(f25275d);
            }
            if (i2 == 5) {
                return f25275d;
            }
            bxxk bxxk = f25276e;
            if (bxxk == null) {
                synchronized (kwk.class) {
                    bxxk = f25276e;
                    if (bxxk == null) {
                        bxxk = new bxve(f25275d);
                        f25276e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
