package p000;

/* renamed from: bpki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpki extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpki f137969c;

    /* renamed from: d */
    private static volatile bxxk f137970d;

    /* renamed from: a */
    public int f137971a;

    /* renamed from: b */
    public int f137972b;

    static {
        bpki bpki = new bpki();
        f137969c = bpki;
        bxvk.m124024a(bpki.class, bpki);
    }

    private bpki() {
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
            return bxvk.m124022a(f137969c, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဋ\u0004", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpki();
        } else {
            if (i2 == 4) {
                return new bxvd(f137969c);
            }
            if (i2 == 5) {
                return f137969c;
            }
            bxxk bxxk = f137970d;
            if (bxxk == null) {
                synchronized (bpki.class) {
                    bxxk = f137970d;
                    if (bxxk == null) {
                        bxxk = new bxve(f137969c);
                        f137970d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
