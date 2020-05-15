package p000;

/* renamed from: amkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amkt extends bxvk implements bxxd {

    /* renamed from: e */
    public static final amkt f75085e;

    /* renamed from: f */
    private static volatile bxxk f75086f;

    /* renamed from: a */
    public int f75087a;

    /* renamed from: b */
    public boolean f75088b;

    /* renamed from: c */
    public boolean f75089c;

    /* renamed from: d */
    public boolean f75090d;

    static {
        amkt amkt = new amkt();
        f75085e = amkt;
        bxvk.m124024a(amkt.class, amkt);
    }

    private amkt() {
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
            return bxvk.m124022a(f75085e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new amkt();
        } else {
            if (i2 == 4) {
                return new bxvd(f75085e);
            }
            if (i2 == 5) {
                return f75085e;
            }
            bxxk bxxk = f75086f;
            if (bxxk == null) {
                synchronized (amkt.class) {
                    bxxk = f75086f;
                    if (bxxk == null) {
                        bxxk = new bxve(f75085e);
                        f75086f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
