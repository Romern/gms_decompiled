package p000;

/* renamed from: tix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tix extends bxvk implements bxxd {

    /* renamed from: d */
    public static final tix f46160d;

    /* renamed from: e */
    private static volatile bxxk f46161e;

    /* renamed from: a */
    public bxwc f46162a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f46163b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f46164c = bxxn.f165040b;

    static {
        tix tix = new tix();
        f46160d = tix;
        bxvk.m124024a(tix.class, tix);
    }

    private tix() {
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
            return bxvk.m124022a(f46160d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001a\u0002\u001a\u0003\u001a", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new tix();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (int[]) null);
            }
            if (i2 == 5) {
                return f46160d;
            }
            bxxk bxxk = f46161e;
            if (bxxk == null) {
                synchronized (tix.class) {
                    bxxk = f46161e;
                    if (bxxk == null) {
                        bxxk = new bxve(f46160d);
                        f46161e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
