package p000;

/* renamed from: cbbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbbi extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final cbbi f176567e;

    /* renamed from: f */
    private static volatile bxxk f176568f;

    /* renamed from: a */
    public String f176569a = "";

    /* renamed from: b */
    public String f176570b = "";

    /* renamed from: c */
    public String f176571c = "";

    /* renamed from: d */
    public String f176572d = "";

    static {
        cbbi cbbi = new cbbi();
        f176567e = cbbi;
        GeneratedMessageLite.m124024a(cbbi.class, cbbi);
    }

    private cbbi() {
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
            return GeneratedMessageLite.m124022a(f176567e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cbbi();
        } else {
            if (i2 == 4) {
                return new bxvd(f176567e);
            }
            if (i2 == 5) {
                return f176567e;
            }
            bxxk bxxk = f176568f;
            if (bxxk == null) {
                synchronized (cbbi.class) {
                    bxxk = f176568f;
                    if (bxxk == null) {
                        bxxk = new bxve(f176567e);
                        f176568f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
