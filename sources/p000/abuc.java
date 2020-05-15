package p000;

/* renamed from: abuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abuc extends bxvk implements bxxd {

    /* renamed from: e */
    public static final abuc f58343e;

    /* renamed from: f */
    private static volatile bxxk f58344f;

    /* renamed from: a */
    public int f58345a;

    /* renamed from: b */
    public int f58346b;

    /* renamed from: c */
    public int f58347c;

    /* renamed from: d */
    public double f58348d;

    static {
        abuc abuc = new abuc();
        f58343e = abuc;
        bxvk.m124024a(abuc.class, abuc);
    }

    private abuc() {
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
            return bxvk.m124022a(f58343e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003က\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new abuc();
        } else {
            if (i2 == 4) {
                return new bxvd(f58343e);
            }
            if (i2 == 5) {
                return f58343e;
            }
            bxxk bxxk = f58344f;
            if (bxxk == null) {
                synchronized (abuc.class) {
                    bxxk = f58344f;
                    if (bxxk == null) {
                        bxxk = new bxve(f58343e);
                        f58344f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
