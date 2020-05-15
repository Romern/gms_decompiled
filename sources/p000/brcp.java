package p000;

/* renamed from: brcp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brcp extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final brcp f142406g;

    /* renamed from: h */
    private static volatile bxxk f142407h;

    /* renamed from: a */
    public int f142408a;

    /* renamed from: b */
    public bral f142409b;

    /* renamed from: c */
    public bxwc f142410c = bxxn.f165040b;

    /* renamed from: d */
    public brao f142411d;

    /* renamed from: e */
    public String f142412e = "";

    /* renamed from: f */
    public brdl f142413f;

    static {
        brcp brcp = new brcp();
        f142406g = brcp;
        GeneratedMessageLite.m124024a(brcp.class, brcp);
    }

    private brcp() {
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
            return GeneratedMessageLite.m124022a(f142406g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဈ\u0002\u0006ဉ\u0004", new Object[]{"a", "b", "c", bree.class, "d", "e", "f"});
        } else if (i2 == 3) {
            return new brcp();
        } else {
            if (i2 == 4) {
                return new bxvd(f142406g);
            }
            if (i2 == 5) {
                return f142406g;
            }
            bxxk bxxk = f142407h;
            if (bxxk == null) {
                synchronized (brcp.class) {
                    bxxk = f142407h;
                    if (bxxk == null) {
                        bxxk = new bxve(f142406g);
                        f142407h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
