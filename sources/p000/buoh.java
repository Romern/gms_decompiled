package p000;

/* renamed from: buoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buoh extends bxvk implements bxxd {

    /* renamed from: c */
    public static final buoh f154523c;

    /* renamed from: d */
    private static volatile bxxk f154524d;

    /* renamed from: a */
    public float f154525a;

    /* renamed from: b */
    public float f154526b;

    static {
        buoh buoh = new buoh();
        f154523c = buoh;
        bxvk.m124024a(buoh.class, buoh);
    }

    private buoh() {
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
            return bxvk.m124022a(f154523c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new buoh();
        } else {
            if (i2 == 4) {
                return new bxvd(f154523c);
            }
            if (i2 == 5) {
                return f154523c;
            }
            bxxk bxxk = f154524d;
            if (bxxk == null) {
                synchronized (buoh.class) {
                    bxxk = f154524d;
                    if (bxxk == null) {
                        bxxk = new bxve(f154523c);
                        f154524d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
