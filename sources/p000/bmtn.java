package p000;

/* renamed from: bmtn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmtn extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bmtn f130877c;

    /* renamed from: d */
    private static volatile bxxk f130878d;

    /* renamed from: a */
    public String f130879a = "";

    /* renamed from: b */
    public String f130880b = "";

    static {
        bmtn bmtn = new bmtn();
        f130877c = bmtn;
        bxvk.m124024a(bmtn.class, bmtn);
    }

    private bmtn() {
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
            return bxvk.m124022a(f130877c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0002\b", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bmtn();
        } else {
            if (i2 == 4) {
                return new bxvd(f130877c);
            }
            if (i2 == 5) {
                return f130877c;
            }
            bxxk bxxk = f130878d;
            if (bxxk == null) {
                synchronized (bmtn.class) {
                    bxxk = f130878d;
                    if (bxxk == null) {
                        bxxk = new bxve(f130877c);
                        f130878d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
