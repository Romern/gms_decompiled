package p000;

/* renamed from: bmvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmvk extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmvk f131057d;

    /* renamed from: e */
    private static volatile bxxk f131058e;

    /* renamed from: a */
    public int f131059a;

    /* renamed from: b */
    public bxwc f131060b = bxxn.f165040b;

    /* renamed from: c */
    public boolean f131061c;

    static {
        bmvk bmvk = new bmvk();
        f131057d = bmvk;
        bxvk.m124024a(bmvk.class, bmvk);
    }

    private bmvk() {
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
            return bxvk.m124022a(f131057d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0001\u0000\u0003\u001b\u0004ဇ\u0000", new Object[]{"a", "b", bmvm.class, "c"});
        } else if (i2 == 3) {
            return new bmvk();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (short[]) null);
            }
            if (i2 == 5) {
                return f131057d;
            }
            bxxk bxxk = f131058e;
            if (bxxk == null) {
                synchronized (bmvk.class) {
                    bxxk = f131058e;
                    if (bxxk == null) {
                        bxxk = new bxve(f131057d);
                        f131058e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
