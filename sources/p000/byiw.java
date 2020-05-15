package p000;

/* renamed from: byiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byiw extends bxvk implements bxxd {

    /* renamed from: a */
    public static final byiw f166618a;

    /* renamed from: b */
    private static volatile bxxk f166619b;

    static {
        byiw byiw = new byiw();
        f166618a = byiw;
        bxvk.m124024a(byiw.class, byiw);
    }

    private byiw() {
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
            return bxvk.m124022a(f166618a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new byiw();
        }
        if (i2 == 4) {
            return new bxvd(f166618a);
        }
        if (i2 == 5) {
            return f166618a;
        }
        bxxk bxxk = f166619b;
        if (bxxk == null) {
            synchronized (byiw.class) {
                bxxk = f166619b;
                if (bxxk == null) {
                    bxxk = new bxve(f166618a);
                    f166619b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
