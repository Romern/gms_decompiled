package p000;

/* renamed from: birf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class birf extends bxvk implements bxxd {

    /* renamed from: e */
    public static final birf f121401e;

    /* renamed from: g */
    private static volatile bxxk f121402g;

    /* renamed from: a */
    public int f121403a;

    /* renamed from: b */
    public int f121404b;

    /* renamed from: c */
    public int f121405c;

    /* renamed from: d */
    public int f121406d = 1;

    /* renamed from: f */
    private byte f121407f = 2;

    static {
        birf birf = new birf();
        f121401e = birf;
        bxvk.m124024a(birf.class, birf);
    }

    private birf() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121407f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121407f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121401e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", bivs.f122043a});
        } else if (i2 == 3) {
            return new birf();
        } else {
            if (i2 == 4) {
                return new bxvd(f121401e);
            }
            if (i2 == 5) {
                return f121401e;
            }
            bxxk bxxk = f121402g;
            if (bxxk == null) {
                synchronized (birf.class) {
                    bxxk = f121402g;
                    if (bxxk == null) {
                        bxxk = new bxve(f121401e);
                        f121402g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
