package p000;

/* renamed from: byxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byxk extends bxvk implements bxxd {

    /* renamed from: d */
    public static final byxk f168748d;

    /* renamed from: e */
    private static volatile bxxk f168749e;

    /* renamed from: a */
    public int f168750a;

    /* renamed from: b */
    public bxwc f168751b = bxxn.f165040b;

    /* renamed from: c */
    public bywz f168752c;

    static {
        byxk byxk = new byxk();
        f168748d = byxk;
        bxvk.m124024a(byxk.class, byxk);
    }

    private byxk() {
        bxvm bxvm = bxvm.f164965b;
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
            return bxvk.m124022a(f168748d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဉ\u0000", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byxk();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (short[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f168748d;
            }
            bxxk bxxk = f168749e;
            if (bxxk == null) {
                synchronized (byxk.class) {
                    bxxk = f168749e;
                    if (bxxk == null) {
                        bxxk = new bxve(f168748d);
                        f168749e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
