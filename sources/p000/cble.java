package p000;

/* renamed from: cble */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cble extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cble f177480a;

    /* renamed from: b */
    private static volatile bxxk f177481b;

    static {
        cble cble = new cble();
        f177480a = cble;
        bxvk.m124024a(cble.class, cble);
    }

    private cble() {
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
            return bxvk.m124022a(f177480a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cble();
        }
        if (i2 == 4) {
            return new bxvd(f177480a);
        }
        if (i2 == 5) {
            return f177480a;
        }
        bxxk bxxk = f177481b;
        if (bxxk == null) {
            synchronized (cble.class) {
                bxxk = f177481b;
                if (bxxk == null) {
                    bxxk = new bxve(f177480a);
                    f177481b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
