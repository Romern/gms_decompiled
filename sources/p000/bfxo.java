package p000;

/* renamed from: bfxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfxo extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bfxo f115595b;

    /* renamed from: c */
    private static volatile bxxk f115596c;

    /* renamed from: a */
    public int f115597a;

    static {
        bfxo bfxo = new bfxo();
        f115595b = bfxo;
        GeneratedMessageLite.m124024a(bfxo.class, bfxo);
    }

    private bfxo() {
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
            return GeneratedMessageLite.m124022a(f115595b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bfxo();
        } else {
            if (i2 == 4) {
                return new bxvd(f115595b);
            }
            if (i2 == 5) {
                return f115595b;
            }
            bxxk bxxk = f115596c;
            if (bxxk == null) {
                synchronized (bfxo.class) {
                    bxxk = f115596c;
                    if (bxxk == null) {
                        bxxk = new bxve(f115595b);
                        f115596c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
