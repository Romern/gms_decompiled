package p000;

/* renamed from: bipl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bipl extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bipl f121177b;

    /* renamed from: d */
    private static volatile bxxk f121178d;

    /* renamed from: a */
    public boolean f121179a;

    /* renamed from: c */
    private int f121180c;

    static {
        bipl bipl = new bipl();
        f121177b = bipl;
        bxvk.m124024a(bipl.class, bipl);
    }

    private bipl() {
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
            return bxvk.m124022a(f121177b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bipl();
        } else {
            if (i2 == 4) {
                return new bxvd(f121177b);
            }
            if (i2 == 5) {
                return f121177b;
            }
            bxxk bxxk = f121178d;
            if (bxxk == null) {
                synchronized (bipl.class) {
                    bxxk = f121178d;
                    if (bxxk == null) {
                        bxxk = new bxve(f121177b);
                        f121178d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
