package p000;

/* renamed from: aqcp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqcp extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final aqcp f85687e;

    /* renamed from: f */
    private static volatile bxxk f85688f;

    /* renamed from: a */
    public int f85689a;

    /* renamed from: b */
    public aqcd f85690b;

    /* renamed from: c */
    public aqdb f85691c;

    /* renamed from: d */
    public aqcd f85692d;

    static {
        aqcp aqcp = new aqcp();
        f85687e = aqcp;
        GeneratedMessageLite.m124024a(aqcp.class, aqcp);
    }

    private aqcp() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f85687e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new aqcp();
        } else {
            if (i2 == 4) {
                return new bxvd(f85687e);
            }
            if (i2 == 5) {
                return f85687e;
            }
            bxxk bxxk = f85688f;
            if (bxxk == null) {
                synchronized (aqcp.class) {
                    bxxk = f85688f;
                    if (bxxk == null) {
                        bxxk = new bxve(f85687e);
                        f85688f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
