package p000;

/* renamed from: btxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btxt extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btxt f152853c;

    /* renamed from: d */
    private static volatile bxxk f152854d;

    /* renamed from: a */
    public bxwc f152855a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f152856b = bxxn.f165040b;

    static {
        btxt btxt = new btxt();
        f152853c = btxt;
        bxvk.m124024a(btxt.class, btxt);
    }

    private btxt() {
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
            return bxvk.m124022a(f152853c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", btyc.class, "b", btye.class});
        } else if (i2 == 3) {
            return new btxt();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (float[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f152853c;
            }
            bxxk bxxk = f152854d;
            if (bxxk == null) {
                synchronized (btxt.class) {
                    bxxk = f152854d;
                    if (bxxk == null) {
                        bxxk = new bxve(f152853c);
                        f152854d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
