package p000;

/* renamed from: abqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abqa extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final abqa f57930e;

    /* renamed from: f */
    private static volatile bxxk f57931f;

    /* renamed from: a */
    public String f57932a = "";

    /* renamed from: b */
    public String f57933b = "";

    /* renamed from: c */
    public bxwc f57934c = bxxn.f165040b;

    /* renamed from: d */
    public long f57935d;

    static {
        abqa abqa = new abqa();
        f57930e = abqa;
        GeneratedMessageLite.m124024a(abqa.class, abqa);
    }

    private abqa() {
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
            return GeneratedMessageLite.m124022a(f57930e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\u0002", new Object[]{"a", "b", "c", abqb.class, "d"});
        } else if (i2 == 3) {
            return new abqa();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (int[]) null);
            }
            if (i2 == 5) {
                return f57930e;
            }
            bxxk bxxk = f57931f;
            if (bxxk == null) {
                synchronized (abqa.class) {
                    bxxk = f57931f;
                    if (bxxk == null) {
                        bxxk = new bxve(f57930e);
                        f57931f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
