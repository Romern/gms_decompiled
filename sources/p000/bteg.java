package p000;

/* renamed from: bteg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bteg extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bteg f148499b;

    /* renamed from: c */
    private static volatile bxxk f148500c;

    /* renamed from: a */
    public int f148501a;

    static {
        bteg bteg = new bteg();
        f148499b = bteg;
        bxvk.m124024a(bteg.class, bteg);
    }

    private bteg() {
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
            return bxvk.m124022a(f148499b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bteg();
        } else {
            if (i2 == 4) {
                return new bxvd(f148499b);
            }
            if (i2 == 5) {
                return f148499b;
            }
            bxxk bxxk = f148500c;
            if (bxxk == null) {
                synchronized (bteg.class) {
                    bxxk = f148500c;
                    if (bxxk == null) {
                        bxxk = new bxve(f148499b);
                        f148500c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
