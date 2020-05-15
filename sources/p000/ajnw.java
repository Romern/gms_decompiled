package p000;

/* renamed from: ajnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajnw extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final ajnw f71022h;

    /* renamed from: i */
    private static volatile bxxk f71023i;

    /* renamed from: a */
    public int f71024a;

    /* renamed from: b */
    public int f71025b;

    /* renamed from: c */
    public ajnl f71026c;

    /* renamed from: d */
    public ajne f71027d;

    /* renamed from: e */
    public ajnm f71028e;

    /* renamed from: f */
    public ajnp f71029f;

    /* renamed from: g */
    public ajnb f71030g;

    static {
        ajnw ajnw = new ajnw();
        f71022h = ajnw;
        GeneratedMessageLite.m124024a(ajnw.class, ajnw);
    }

    private ajnw() {
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
            return GeneratedMessageLite.m124022a(f71022h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", ajnv.m58897b(), "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new ajnw();
        } else {
            if (i2 == 4) {
                return new bxvd(f71022h);
            }
            if (i2 == 5) {
                return f71022h;
            }
            bxxk bxxk = f71023i;
            if (bxxk == null) {
                synchronized (ajnw.class) {
                    bxxk = f71023i;
                    if (bxxk == null) {
                        bxxk = new bxve(f71022h);
                        f71023i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
