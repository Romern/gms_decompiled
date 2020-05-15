package p000;

/* renamed from: bpxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpxa extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpxa f139602c;

    /* renamed from: d */
    private static volatile bxxk f139603d;

    /* renamed from: a */
    public int f139604a;

    /* renamed from: b */
    public boolean f139605b;

    static {
        bpxa bpxa = new bpxa();
        f139602c = bpxa;
        bxvk.m124024a(bpxa.class, bpxa);
    }

    private bpxa() {
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
            return bxvk.m124022a(f139602c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpxa();
        } else {
            if (i2 == 4) {
                return new bxvd(f139602c);
            }
            if (i2 == 5) {
                return f139602c;
            }
            bxxk bxxk = f139603d;
            if (bxxk == null) {
                synchronized (bpxa.class) {
                    bxxk = f139603d;
                    if (bxxk == null) {
                        bxxk = new bxve(f139602c);
                        f139603d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
