package p000;

/* renamed from: butx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class butx extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final butx f154893h;

    /* renamed from: i */
    private static volatile bxxk f154894i;

    /* renamed from: a */
    public int f154895a;

    /* renamed from: b */
    public int f154896b;

    /* renamed from: c */
    public butv f154897c;

    /* renamed from: d */
    public butw f154898d;

    /* renamed from: e */
    public butq f154899e;

    /* renamed from: f */
    public butt f154900f;

    /* renamed from: g */
    public butu f154901g;

    static {
        butx butx = new butx();
        f154893h = butx;
        GeneratedMessageLite.m124024a(butx.class, butx);
    }

    private butx() {
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
            return GeneratedMessageLite.m124022a(f154893h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", butr.f154867a, "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new butx();
        } else {
            if (i2 == 4) {
                return new bxvd(f154893h);
            }
            if (i2 == 5) {
                return f154893h;
            }
            bxxk bxxk = f154894i;
            if (bxxk == null) {
                synchronized (butx.class) {
                    bxxk = f154894i;
                    if (bxxk == null) {
                        bxxk = new bxve(f154893h);
                        f154894i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
