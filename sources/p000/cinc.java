package p000;

/* renamed from: cinc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cinc extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cinc f190914c;

    /* renamed from: d */
    private static volatile bxxk f190915d;

    /* renamed from: a */
    public int f190916a;

    /* renamed from: b */
    public cina f190917b;

    static {
        cinc cinc = new cinc();
        f190914c = cinc;
        bxvk.m124024a(cinc.class, cinc);
    }

    private cinc() {
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
            return bxvk.m124022a(f190914c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cinc();
        } else {
            if (i2 == 4) {
                return new bxvd(f190914c);
            }
            if (i2 == 5) {
                return f190914c;
            }
            bxxk bxxk = f190915d;
            if (bxxk == null) {
                synchronized (cinc.class) {
                    bxxk = f190915d;
                    if (bxxk == null) {
                        bxxk = new bxve(f190914c);
                        f190915d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
