package p000;

/* renamed from: bmhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmhk extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bmhk f129435h;

    /* renamed from: i */
    private static volatile bxxk f129436i;

    /* renamed from: a */
    public int f129437a;

    /* renamed from: b */
    public bmdn f129438b;

    /* renamed from: c */
    public bmhl f129439c;

    /* renamed from: d */
    public bxwc f129440d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f129441e = bxxn.f165040b;

    /* renamed from: f */
    public int f129442f = -1;

    /* renamed from: g */
    public bmjf f129443g;

    static {
        bmhk bmhk = new bmhk();
        f129435h = bmhk;
        GeneratedMessageLite.m124024a(bmhk.class, bmhk);
    }

    private bmhk() {
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
            return GeneratedMessageLite.m124022a(f129435h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001b\u0006ဉ\u0003\u0007င\u0002", new Object[]{"a", "b", "c", "d", bmhc.class, "e", bmot.class, "g", "f"});
        } else if (i2 == 3) {
            return new bmhk();
        } else {
            if (i2 == 4) {
                return new bxvd(f129435h);
            }
            if (i2 == 5) {
                return f129435h;
            }
            bxxk bxxk = f129436i;
            if (bxxk == null) {
                synchronized (bmhk.class) {
                    bxxk = f129436i;
                    if (bxxk == null) {
                        bxxk = new bxve(f129435h);
                        f129436i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
