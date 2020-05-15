package p000;

/* renamed from: bkkg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkkg extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bkkg f124537e;

    /* renamed from: g */
    private static volatile bxxk f124538g;

    /* renamed from: a */
    public int f124539a = 0;

    /* renamed from: b */
    public Object f124540b;

    /* renamed from: c */
    public String f124541c = "";

    /* renamed from: d */
    public String f124542d = "";

    /* renamed from: f */
    private int f124543f;

    static {
        bkkg bkkg = new bkkg();
        f124537e = bkkg;
        bxvk.m124024a(bkkg.class, bkkg);
    }

    private bkkg() {
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
            return bxvk.m124022a(f124537e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ြ\u0000", new Object[]{"b", "a", "f", "c", "d", bybt.class});
        } else if (i2 == 3) {
            return new bkkg();
        } else {
            if (i2 == 4) {
                return new bxvd(f124537e);
            }
            if (i2 == 5) {
                return f124537e;
            }
            bxxk bxxk = f124538g;
            if (bxxk == null) {
                synchronized (bkkg.class) {
                    bxxk = f124538g;
                    if (bxxk == null) {
                        bxxk = new bxve(f124537e);
                        f124538g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
