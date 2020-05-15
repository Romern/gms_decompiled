package p000;

/* renamed from: ataq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ataq extends bxvk implements bxxd {

    /* renamed from: f */
    public static final ataq f89963f;

    /* renamed from: g */
    private static volatile bxxk f89964g;

    /* renamed from: a */
    public int f89965a;

    /* renamed from: b */
    public bmsy f89966b;

    /* renamed from: c */
    public bxwc f89967c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f89968d = bxxn.f165040b;

    /* renamed from: e */
    public int f89969e;

    static {
        ataq ataq = new ataq();
        f89963f = ataq;
        bxvk.m124024a(ataq.class, ataq);
    }

    private ataq() {
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
            return bxvk.m124022a(f89963f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003င\u0001\u0004\u001b", new Object[]{"a", "b", "c", bmsz.class, "e", "d", btma.class});
        } else if (i2 == 3) {
            return new ataq();
        } else {
            if (i2 == 4) {
                return new atap();
            }
            if (i2 == 5) {
                return f89963f;
            }
            bxxk bxxk = f89964g;
            if (bxxk == null) {
                synchronized (ataq.class) {
                    bxxk = f89964g;
                    if (bxxk == null) {
                        bxxk = new bxve(f89963f);
                        f89964g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
