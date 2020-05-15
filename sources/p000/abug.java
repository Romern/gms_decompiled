package p000;

/* renamed from: abug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abug extends bxvk implements bxxd {

    /* renamed from: c */
    public static final abug f58383c;

    /* renamed from: d */
    private static volatile bxxk f58384d;

    /* renamed from: a */
    public bxwc f58385a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f58386b = bxxn.f165040b;

    static {
        abug abug = new abug();
        f58383c = abug;
        bxvk.m124024a(abug.class, abug);
    }

    private abug() {
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
            return bxvk.m124022a(f58383c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", abue.class, "b", abuf.class});
        } else if (i2 == 3) {
            return new abug();
        } else {
            if (i2 == 4) {
                return new bxvd(f58383c);
            }
            if (i2 == 5) {
                return f58383c;
            }
            bxxk bxxk = f58384d;
            if (bxxk == null) {
                synchronized (abug.class) {
                    bxxk = f58384d;
                    if (bxxk == null) {
                        bxxk = new bxve(f58383c);
                        f58384d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
