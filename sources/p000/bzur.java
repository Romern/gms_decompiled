package p000;

/* renamed from: bzur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzur extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzur f171456c;

    /* renamed from: d */
    private static volatile bxxk f171457d;

    /* renamed from: a */
    public bztn f171458a;

    /* renamed from: b */
    public bztm f171459b;

    static {
        bzur bzur = new bzur();
        f171456c = bzur;
        bxvk.m124024a(bzur.class, bzur);
    }

    private bzur() {
        bxtx bxtx = bxtx.f164797b;
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
            return bxvk.m124022a(f171456c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzur();
        } else {
            if (i2 == 4) {
                return new bxvd(f171456c);
            }
            if (i2 == 5) {
                return f171456c;
            }
            bxxk bxxk = f171457d;
            if (bxxk == null) {
                synchronized (bzur.class) {
                    bxxk = f171457d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171456c);
                        f171457d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
