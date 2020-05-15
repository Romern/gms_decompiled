package p000;

/* renamed from: abem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abem extends bxvk implements bxxd {

    /* renamed from: c */
    public static final abem f57255c;

    /* renamed from: d */
    private static volatile bxxk f57256d;

    /* renamed from: a */
    public bxwc f57257a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f57258b = bxxn.f165040b;

    static {
        abem abem = new abem();
        f57255c = abem;
        bxvk.m124024a(abem.class, abem);
    }

    private abem() {
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
            return bxvk.m124022a(f57255c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", abee.class, "b", abee.class});
        } else if (i2 == 3) {
            return new abem();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f57255c;
            }
            bxxk bxxk = f57256d;
            if (bxxk == null) {
                synchronized (abem.class) {
                    bxxk = f57256d;
                    if (bxxk == null) {
                        bxxk = new bxve(f57255c);
                        f57256d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
