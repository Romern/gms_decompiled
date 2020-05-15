package p000;

/* renamed from: bzul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzul extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzul f171433c;

    /* renamed from: d */
    private static volatile bxxk f171434d;

    /* renamed from: a */
    public bxwc f171435a = bxxn.f165040b;

    /* renamed from: b */
    public bzuf f171436b;

    static {
        bzul bzul = new bzul();
        f171433c = bzul;
        bxvk.m124024a(bzul.class, bzul);
    }

    private bzul() {
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
            return bxvk.m124022a(f171433c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\t", new Object[]{"a", bzuc.class, "b"});
        } else if (i2 == 3) {
            return new bzul();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (boolean[]) null);
            }
            if (i2 == 5) {
                return f171433c;
            }
            bxxk bxxk = f171434d;
            if (bxxk == null) {
                synchronized (bzul.class) {
                    bxxk = f171434d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171433c);
                        f171434d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
