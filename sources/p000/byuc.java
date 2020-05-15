package p000;

/* renamed from: byuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byuc extends bxvk implements bxxd {

    /* renamed from: c */
    public static final byuc f167758c;

    /* renamed from: d */
    private static volatile bxxk f167759d;

    /* renamed from: a */
    public bxwc f167760a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f167761b = bxxn.f165040b;

    static {
        byuc byuc = new byuc();
        f167758c = byuc;
        bxvk.m124024a(byuc.class, byuc);
    }

    private byuc() {
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
            return bxvk.m124022a(f167758c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", byts.class, "b", byty.class});
        } else if (i2 == 3) {
            return new byuc();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (boolean[]) null);
            }
            if (i2 == 5) {
                return f167758c;
            }
            bxxk bxxk = f167759d;
            if (bxxk == null) {
                synchronized (byuc.class) {
                    bxxk = f167759d;
                    if (bxxk == null) {
                        bxxk = new bxve(f167758c);
                        f167759d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
