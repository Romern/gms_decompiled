package p000;

/* renamed from: bted */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bted extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bted f148495c;

    /* renamed from: d */
    private static volatile bxxk f148496d;

    /* renamed from: a */
    public int f148497a;

    /* renamed from: b */
    public int f148498b;

    static {
        bted bted = new bted();
        f148495c = bted;
        bxvk.m124024a(bted.class, bted);
    }

    private bted() {
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
            return bxvk.m124022a(f148495c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bted();
        } else {
            if (i2 == 4) {
                return new bxvd(f148495c);
            }
            if (i2 == 5) {
                return f148495c;
            }
            bxxk bxxk = f148496d;
            if (bxxk == null) {
                synchronized (bted.class) {
                    bxxk = f148496d;
                    if (bxxk == null) {
                        bxxk = new bxve(f148495c);
                        f148496d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
