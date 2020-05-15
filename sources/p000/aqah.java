package p000;

/* renamed from: aqah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqah extends bxvk implements bxxd {

    /* renamed from: f */
    public static final aqah f85378f;

    /* renamed from: g */
    private static volatile bxxk f85379g;

    /* renamed from: a */
    public int f85380a;

    /* renamed from: b */
    public String f85381b = "";

    /* renamed from: c */
    public boolean f85382c;

    /* renamed from: d */
    public boolean f85383d;

    /* renamed from: e */
    public String f85384e = "";

    static {
        aqah aqah = new aqah();
        f85378f = aqah;
        bxvk.m124024a(aqah.class, aqah);
    }

    private aqah() {
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
            return bxvk.m124022a(f85378f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new aqah();
        } else {
            if (i2 == 4) {
                return new bxvd(f85378f);
            }
            if (i2 == 5) {
                return f85378f;
            }
            bxxk bxxk = f85379g;
            if (bxxk == null) {
                synchronized (aqah.class) {
                    bxxk = f85379g;
                    if (bxxk == null) {
                        bxxk = new bxve(f85378f);
                        f85379g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
