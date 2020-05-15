package p000;

/* renamed from: bxhr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxhr extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxhr f163456d;

    /* renamed from: e */
    private static volatile bxxk f163457e;

    /* renamed from: a */
    public int f163458a;

    /* renamed from: b */
    public int f163459b;

    /* renamed from: c */
    public int f163460c;

    static {
        bxhr bxhr = new bxhr();
        f163456d = bxhr;
        bxvk.m124024a(bxhr.class, bxhr);
    }

    private bxhr() {
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
            return bxvk.m124022a(f163456d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", bxcg.f162782a, "c", bxco.m122578b()});
        } else if (i2 == 3) {
            return new bxhr();
        } else {
            if (i2 == 4) {
                return new bxvd(f163456d);
            }
            if (i2 == 5) {
                return f163456d;
            }
            bxxk bxxk = f163457e;
            if (bxxk == null) {
                synchronized (bxhr.class) {
                    bxxk = f163457e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163456d);
                        f163457e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
