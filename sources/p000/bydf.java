package p000;

/* renamed from: bydf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bydf extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bydf f165769j;

    /* renamed from: k */
    private static volatile bxxk f165770k;

    /* renamed from: a */
    public int f165771a;

    /* renamed from: b */
    public bmts f165772b;

    /* renamed from: c */
    public int f165773c;

    /* renamed from: d */
    public bxwc f165774d = bxxn.f165040b;

    /* renamed from: e */
    public int f165775e;

    /* renamed from: f */
    public ByteString f165776f = ByteString.f164797b;

    /* renamed from: g */
    public String f165777g = "";

    /* renamed from: h */
    public long f165778h;

    /* renamed from: i */
    public byde f165779i;

    static {
        bydf bydf = new bydf();
        f165769j = bydf;
        GeneratedMessageLite.m124024a(bydf.class, bydf);
    }

    private bydf() {
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
            return GeneratedMessageLite.m124022a(f165769j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0000\u0001ဉ\u0000\u0003င\u0001\u0004\u001a\u0005င\u0002\u0006ည\u0003\u0007ဈ\u0004\bဂ\u0005\tဉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bydf();
        } else {
            if (i2 == 4) {
                return new bydd();
            }
            if (i2 == 5) {
                return f165769j;
            }
            bxxk bxxk = f165770k;
            if (bxxk == null) {
                synchronized (bydf.class) {
                    bxxk = f165770k;
                    if (bxxk == null) {
                        bxxk = new bxve(f165769j);
                        f165770k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
