package p000;

/* renamed from: bzqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzqm extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzqm f171030d;

    /* renamed from: e */
    private static volatile bxxk f171031e;

    /* renamed from: a */
    public int f171032a;

    /* renamed from: b */
    public boolean f171033b;

    /* renamed from: c */
    public String f171034c = "";

    static {
        bzqm bzqm = new bzqm();
        f171030d = bzqm;
        bxvk.m124024a(bzqm.class, bzqm);
    }

    private bzqm() {
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
            return bxvk.m124022a(f171030d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzqm();
        } else {
            if (i2 == 4) {
                return new bxvd(f171030d);
            }
            if (i2 == 5) {
                return f171030d;
            }
            bxxk bxxk = f171031e;
            if (bxxk == null) {
                synchronized (bzqm.class) {
                    bxxk = f171031e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171030d);
                        f171031e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
