package p000;

/* renamed from: bivg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bivg extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bivg f121975e;

    /* renamed from: g */
    private static volatile bxxk f121976g;

    /* renamed from: a */
    public int f121977a;

    /* renamed from: b */
    public int f121978b;

    /* renamed from: c */
    public boolean f121979c;

    /* renamed from: d */
    public int f121980d;

    /* renamed from: f */
    private byte f121981f = 2;

    static {
        bivg bivg = new bivg();
        f121975e = bivg;
        GeneratedMessageLite.m124024a(bivg.class, bivg);
    }

    private bivg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121981f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121981f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121975e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ᔄ\u0000\u0002ဇ\u0001\u0004င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bivg();
        } else {
            if (i2 == 4) {
                return new bxvd(f121975e);
            }
            if (i2 == 5) {
                return f121975e;
            }
            bxxk bxxk = f121976g;
            if (bxxk == null) {
                synchronized (bivg.class) {
                    bxxk = f121976g;
                    if (bxxk == null) {
                        bxxk = new bxve(f121975e);
                        f121976g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
