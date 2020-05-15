package p000;

/* renamed from: amok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amok extends bxvk implements bxxd {

    /* renamed from: b */
    public static final amok f75623b;

    /* renamed from: c */
    private static volatile bxxk f75624c;

    /* renamed from: a */
    public bxwc f75625a = bxxn.f165040b;

    static {
        amok amok = new amok();
        f75623b = amok;
        bxvk.m124024a(amok.class, amok);
    }

    private amok() {
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
            return bxvk.m124022a(f75623b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
        } else if (i2 == 3) {
            return new amok();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (byte[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f75623b;
            }
            bxxk bxxk = f75624c;
            if (bxxk == null) {
                synchronized (amok.class) {
                    bxxk = f75624c;
                    if (bxxk == null) {
                        bxxk = new bxve(f75623b);
                        f75624c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
