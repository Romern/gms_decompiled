package p000;

/* renamed from: bmfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmfy extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final bmfy f129189l;

    /* renamed from: m */
    private static volatile bxxk f129190m;

    /* renamed from: a */
    public int f129191a;

    /* renamed from: b */
    public int f129192b = 0;

    /* renamed from: c */
    public Object f129193c;

    /* renamed from: d */
    public blwj f129194d;

    /* renamed from: e */
    public blwj f129195e;

    /* renamed from: f */
    public blwj f129196f;

    /* renamed from: g */
    public String f129197g = "";

    /* renamed from: h */
    public String f129198h = "";

    /* renamed from: i */
    public String f129199i = "";

    /* renamed from: j */
    public bxwc f129200j = bxxn.f165040b;

    /* renamed from: k */
    public String f129201k = "";

    static {
        bmfy bmfy = new bmfy();
        f129189l = bmfy;
        GeneratedMessageLite.m124024a(bmfy.class, bmfy);
    }

    private bmfy() {
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
            return GeneratedMessageLite.m124022a(f129189l, "\u0001\n\u0001\u0001\u0001\f\n\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007\u001b\nြ\u0000\u000bြ\u0000\fဈ\b", new Object[]{"c", "b", "a", "d", "e", "f", "g", "h", "i", "j", bmfx.class, bmfz.class, bmga.class, "k"});
        } else if (i2 == 3) {
            return new bmfy();
        } else {
            if (i2 == 4) {
                return new bxvd(f129189l);
            }
            if (i2 == 5) {
                return f129189l;
            }
            bxxk bxxk = f129190m;
            if (bxxk == null) {
                synchronized (bmfy.class) {
                    bxxk = f129190m;
                    if (bxxk == null) {
                        bxxk = new bxve(f129189l);
                        f129190m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
