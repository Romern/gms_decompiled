package p000;

/* renamed from: bztj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bztj extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bztj f171335b;

    /* renamed from: c */
    private static volatile bxxk f171336c;

    /* renamed from: a */
    public String f171337a = "";

    static {
        bztj bztj = new bztj();
        f171335b = bztj;
        bxvk.m124024a(bztj.class, bztj);
    }

    private bztj() {
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
            return bxvk.m124022a(f171335b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bztj();
        } else {
            if (i2 == 4) {
                return new bxvd(f171335b);
            }
            if (i2 == 5) {
                return f171335b;
            }
            bxxk bxxk = f171336c;
            if (bxxk == null) {
                synchronized (bztj.class) {
                    bxxk = f171336c;
                    if (bxxk == null) {
                        bxxk = new bxve(f171335b);
                        f171336c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
