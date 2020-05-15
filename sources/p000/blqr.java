package p000;

/* renamed from: blqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blqr extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final blqr f127394f;

    /* renamed from: g */
    private static volatile bxxk f127395g;

    /* renamed from: a */
    public int f127396a;

    /* renamed from: b */
    public blrk f127397b;

    /* renamed from: c */
    public blqp f127398c;

    /* renamed from: d */
    public int f127399d;

    /* renamed from: e */
    public blqw f127400e;

    static {
        blqr blqr = new blqr();
        f127394f = blqr;
        GeneratedMessageLite.m124024a(blqr.class, blqr);
    }

    private blqr() {
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
            return GeneratedMessageLite.m124022a(f127394f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", blqq.f127393a, "e"});
        } else if (i2 == 3) {
            return new blqr();
        } else {
            if (i2 == 4) {
                return new bxvd(f127394f);
            }
            if (i2 == 5) {
                return f127394f;
            }
            bxxk bxxk = f127395g;
            if (bxxk == null) {
                synchronized (blqr.class) {
                    bxxk = f127395g;
                    if (bxxk == null) {
                        bxxk = new bxve(f127394f);
                        f127395g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
