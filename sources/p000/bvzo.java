package p000;

/* renamed from: bvzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvzo extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvzo f158535d;

    /* renamed from: e */
    private static volatile bxxk f158536e;

    /* renamed from: a */
    public int f158537a;

    /* renamed from: b */
    public byfo f158538b;

    /* renamed from: c */
    public bvzn f158539c;

    static {
        bvzo bvzo = new bvzo();
        f158535d = bvzo;
        bxvk.m124024a(bvzo.class, bvzo);
    }

    private bvzo() {
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
            return bxvk.m124022a(f158535d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvzo();
        } else {
            if (i2 == 4) {
                return new bxvd(f158535d);
            }
            if (i2 == 5) {
                return f158535d;
            }
            bxxk bxxk = f158536e;
            if (bxxk == null) {
                synchronized (bvzo.class) {
                    bxxk = f158536e;
                    if (bxxk == null) {
                        bxxk = new bxve(f158535d);
                        f158536e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
