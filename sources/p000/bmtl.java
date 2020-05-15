package p000;

/* renamed from: bmtl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmtl extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bmtl f130860e;

    /* renamed from: f */
    private static volatile bxxk f130861f;

    /* renamed from: a */
    public String f130862a = "";

    /* renamed from: b */
    public String f130863b = "";

    /* renamed from: c */
    public String f130864c = "";

    /* renamed from: d */
    public bmth f130865d;

    static {
        bmtl bmtl = new bmtl();
        f130860e = bmtl;
        GeneratedMessageLite.m124024a(bmtl.class, bmtl);
    }

    private bmtl() {
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
            return GeneratedMessageLite.m124022a(f130860e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\t", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bmtl();
        } else {
            if (i2 == 4) {
                return new bxvd(f130860e);
            }
            if (i2 == 5) {
                return f130860e;
            }
            bxxk bxxk = f130861f;
            if (bxxk == null) {
                synchronized (bmtl.class) {
                    bxxk = f130861f;
                    if (bxxk == null) {
                        bxxk = new bxve(f130860e);
                        f130861f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
