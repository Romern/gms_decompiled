package p000;

/* renamed from: bzra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzra extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzra f171097c;

    /* renamed from: d */
    private static volatile bxxk f171098d;

    /* renamed from: a */
    public int f171099a;

    /* renamed from: b */
    public int f171100b;

    static {
        bzra bzra = new bzra();
        f171097c = bzra;
        bxvk.m124024a(bzra.class, bzra);
    }

    private bzra() {
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
            return bxvk.m124022a(f171097c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bzrb.f171101a});
        } else if (i2 == 3) {
            return new bzra();
        } else {
            if (i2 == 4) {
                return new bxvd(f171097c);
            }
            if (i2 == 5) {
                return f171097c;
            }
            bxxk bxxk = f171098d;
            if (bxxk == null) {
                synchronized (bzra.class) {
                    bxxk = f171098d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171097c);
                        f171098d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
