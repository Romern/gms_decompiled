package p000;

/* renamed from: bzby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzby extends bxvg implements bxvh {

    /* renamed from: c */
    public static final bzby f169278c;

    /* renamed from: e */
    private static volatile bxxk f169279e;

    /* renamed from: a */
    public int f169280a;

    /* renamed from: b */
    public int f169281b;

    /* renamed from: d */
    private byte f169282d = 2;

    static {
        bzby bzby = new bzby();
        f169278c = bzby;
        GeneratedMessageLite.m124024a(bzby.class, bzby);
    }

    private bzby() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169282d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169282d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f169278c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bzaz.f169241a});
        } else if (i2 == 3) {
            return new bzby();
        } else {
            if (i2 == 4) {
                return new bxvf(f169278c);
            }
            if (i2 == 5) {
                return f169278c;
            }
            bxxk bxxk = f169279e;
            if (bxxk == null) {
                synchronized (bzby.class) {
                    bxxk = f169279e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169278c);
                        f169279e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
