package p000;

/* renamed from: came */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class came extends bxvk implements bxxd {

    /* renamed from: c */
    public static final came f175260c;

    /* renamed from: d */
    private static volatile bxxk f175261d;

    /* renamed from: a */
    public String f175262a = "";

    /* renamed from: b */
    public String f175263b = "";

    static {
        came came = new came();
        f175260c = came;
        bxvk.m124024a(came.class, came);
    }

    private came() {
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
            return bxvk.m124022a(f175260c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new came();
        } else {
            if (i2 == 4) {
                return new bxvd(f175260c);
            }
            if (i2 == 5) {
                return f175260c;
            }
            bxxk bxxk = f175261d;
            if (bxxk == null) {
                synchronized (came.class) {
                    bxxk = f175261d;
                    if (bxxk == null) {
                        bxxk = new bxve(f175260c);
                        f175261d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}