package p000;

/* renamed from: aaim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaim extends bxvk implements bxxd {

    /* renamed from: g */
    public static final aaim f28200g;

    /* renamed from: h */
    private static volatile bxxk f28201h;

    /* renamed from: a */
    public int f28202a;

    /* renamed from: b */
    public String f28203b = "";

    /* renamed from: c */
    public String f28204c = "";

    /* renamed from: d */
    public String f28205d = "";

    /* renamed from: e */
    public String f28206e = "";

    /* renamed from: f */
    public String f28207f = "";

    static {
        aaim aaim = new aaim();
        f28200g = aaim;
        bxvk.m124024a(aaim.class, aaim);
    }

    private aaim() {
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
            return bxvk.m124022a(f28200g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new aaim();
        } else {
            if (i2 == 4) {
                return new bxvd(f28200g);
            }
            if (i2 == 5) {
                return f28200g;
            }
            bxxk bxxk = f28201h;
            if (bxxk == null) {
                synchronized (aaim.class) {
                    bxxk = f28201h;
                    if (bxxk == null) {
                        bxxk = new bxve(f28200g);
                        f28201h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
