package p000;

/* renamed from: bavn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bavn extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bavn f101895f;

    /* renamed from: g */
    private static volatile bxxk f101896g;

    /* renamed from: a */
    public int f101897a;

    /* renamed from: b */
    public int f101898b;

    /* renamed from: c */
    public int f101899c;

    /* renamed from: d */
    public long f101900d;

    /* renamed from: e */
    public int f101901e;

    static {
        bavn bavn = new bavn();
        f101895f = bavn;
        GeneratedMessageLite.m124024a(bavn.class, bavn);
    }

    private bavn() {
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
            return GeneratedMessageLite.m124022a(f101895f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0003\u0004ဂ\u0002", new Object[]{"a", "b", bavl.f101894a, "c", bavj.f101893a, "e", bavh.f101892a, "d"});
        } else if (i2 == 3) {
            return new bavn();
        } else {
            if (i2 == 4) {
                return new bxvd(f101895f);
            }
            if (i2 == 5) {
                return f101895f;
            }
            bxxk bxxk = f101896g;
            if (bxxk == null) {
                synchronized (bavn.class) {
                    bxxk = f101896g;
                    if (bxxk == null) {
                        bxxk = new bxve(f101895f);
                        f101896g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
