package p000;

/* renamed from: aqcy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqcy extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final aqcy f85726g;

    /* renamed from: h */
    private static volatile bxxk f85727h;

    /* renamed from: a */
    public int f85728a;

    /* renamed from: b */
    public int f85729b;

    /* renamed from: c */
    public aqcs f85730c;

    /* renamed from: d */
    public aqct f85731d;

    /* renamed from: e */
    public aqcu f85732e;

    /* renamed from: f */
    public aqcu f85733f;

    static {
        aqcy aqcy = new aqcy();
        f85726g = aqcy;
        GeneratedMessageLite.m124024a(aqcy.class, aqcy);
    }

    private aqcy() {
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
            return GeneratedMessageLite.m124022a(f85726g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", aqcf.m71347b(), "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new aqcy();
        } else {
            if (i2 == 4) {
                return new bxvd(f85726g);
            }
            if (i2 == 5) {
                return f85726g;
            }
            bxxk bxxk = f85727h;
            if (bxxk == null) {
                synchronized (aqcy.class) {
                    bxxk = f85727h;
                    if (bxxk == null) {
                        bxxk = new bxve(f85726g);
                        f85727h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
