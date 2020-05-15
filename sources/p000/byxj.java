package p000;

/* renamed from: byxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byxj extends bxvk implements bxxd {

    /* renamed from: c */
    public static final byxj f168744c;

    /* renamed from: d */
    private static volatile bxxk f168745d;

    /* renamed from: a */
    public int f168746a;

    /* renamed from: b */
    public int f168747b = -1;

    static {
        byxj byxj = new byxj();
        f168744c = byxj;
        bxvk.m124024a(byxj.class, byxj);
    }

    private byxj() {
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
            return bxvk.m124022a(f168744c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bzbp.f169261a});
        } else if (i2 == 3) {
            return new byxj();
        } else {
            if (i2 == 4) {
                return new bxvd(f168744c);
            }
            if (i2 == 5) {
                return f168744c;
            }
            bxxk bxxk = f168745d;
            if (bxxk == null) {
                synchronized (byxj.class) {
                    bxxk = f168745d;
                    if (bxxk == null) {
                        bxxk = new bxve(f168744c);
                        f168745d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
