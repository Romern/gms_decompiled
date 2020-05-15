package p000;

/* renamed from: cajo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cajo extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final cajo f174843h;

    /* renamed from: i */
    private static volatile bxxk f174844i;

    /* renamed from: a */
    public int f174845a;

    /* renamed from: b */
    public boolean f174846b;

    /* renamed from: c */
    public boolean f174847c;

    /* renamed from: d */
    public boolean f174848d;

    /* renamed from: e */
    public boolean f174849e;

    /* renamed from: f */
    public boolean f174850f;

    /* renamed from: g */
    public boolean f174851g;

    static {
        cajo cajo = new cajo();
        f174843h = cajo;
        GeneratedMessageLite.m124024a(cajo.class, cajo);
    }

    private cajo() {
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
            return GeneratedMessageLite.m124022a(f174843h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new cajo();
        } else {
            if (i2 == 4) {
                return new bxvd(f174843h);
            }
            if (i2 == 5) {
                return f174843h;
            }
            bxxk bxxk = f174844i;
            if (bxxk == null) {
                synchronized (cajo.class) {
                    bxxk = f174844i;
                    if (bxxk == null) {
                        bxxk = new bxve(f174843h);
                        f174844i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
