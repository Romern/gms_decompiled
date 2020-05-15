package p000;

/* renamed from: buzt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buzt extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final buzt f155423f;

    /* renamed from: g */
    private static volatile bxxk f155424g;

    /* renamed from: a */
    public int f155425a;

    /* renamed from: b */
    public int f155426b = 1;

    /* renamed from: c */
    public buzx f155427c;

    /* renamed from: d */
    public buzv f155428d;

    /* renamed from: e */
    public buzu f155429e;

    static {
        buzt buzt = new buzt();
        f155423f = buzt;
        GeneratedMessageLite.m124024a(buzt.class, buzt);
    }

    private buzt() {
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
            return GeneratedMessageLite.m124022a(f155423f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0004", new Object[]{"a", "b", buzy.f155447a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new buzt();
        } else {
            if (i2 == 4) {
                return new bxvd(f155423f);
            }
            if (i2 == 5) {
                return f155423f;
            }
            bxxk bxxk = f155424g;
            if (bxxk == null) {
                synchronized (buzt.class) {
                    bxxk = f155424g;
                    if (bxxk == null) {
                        bxxk = new bxve(f155423f);
                        f155424g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
