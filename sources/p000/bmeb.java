package p000;

/* renamed from: bmeb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmeb extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bmeb f128902g;

    /* renamed from: i */
    private static volatile bxxk f128903i;

    /* renamed from: a */
    public int f128904a;

    /* renamed from: b */
    public bmdn f128905b;

    /* renamed from: c */
    public bxwc f128906c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f128907d = bxxn.f165040b;

    /* renamed from: e */
    public bmjf f128908e;

    /* renamed from: f */
    public bmnu f128909f;

    /* renamed from: h */
    private byte f128910h = 2;

    static {
        bmeb bmeb = new bmeb();
        f128902g = bmeb;
        GeneratedMessageLite.m124024a(bmeb.class, bmeb);
    }

    private bmeb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f128910h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f128910h = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f128902g, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0002\u0001\u0001ဉ\u0000\u0002Л\u0003ဉ\u0001\u0007\u001b\tဉ\u0002", new Object[]{"a", "b", "c", bmea.class, "e", "d", bmot.class, "f"});
        } else if (i2 == 3) {
            return new bmeb();
        } else {
            if (i2 == 4) {
                return new bmdz();
            }
            if (i2 == 5) {
                return f128902g;
            }
            bxxk bxxk = f128903i;
            if (bxxk == null) {
                synchronized (bmeb.class) {
                    bxxk = f128903i;
                    if (bxxk == null) {
                        bxxk = new bxve(f128902g);
                        f128903i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
