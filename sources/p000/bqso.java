package p000;

/* renamed from: bqso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqso extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bqso f141552c;

    /* renamed from: d */
    private static volatile bxxk f141553d;

    /* renamed from: a */
    public int f141554a;

    /* renamed from: b */
    public bqsp f141555b;

    static {
        bqso bqso = new bqso();
        f141552c = bqso;
        bxvk.m124024a(bqso.class, bqso);
    }

    private bqso() {
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
            return bxvk.m124022a(f141552c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqso();
        } else {
            if (i2 == 4) {
                return new bxvd(f141552c);
            }
            if (i2 == 5) {
                return f141552c;
            }
            bxxk bxxk = f141553d;
            if (bxxk == null) {
                synchronized (bqso.class) {
                    bxxk = f141553d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141552c);
                        f141553d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
