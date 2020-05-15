package p000;

/* renamed from: abqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abqb extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final abqb f57936c;

    /* renamed from: d */
    private static volatile bxxk f57937d;

    /* renamed from: a */
    public String f57938a = "";

    /* renamed from: b */
    public String f57939b = "";

    static {
        abqb abqb = new abqb();
        f57936c = abqb;
        GeneratedMessageLite.m124024a(abqb.class, abqb);
    }

    private abqb() {
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
            return GeneratedMessageLite.m124022a(f57936c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new abqb();
        } else {
            if (i2 == 4) {
                return new bxvd(f57936c);
            }
            if (i2 == 5) {
                return f57936c;
            }
            bxxk bxxk = f57937d;
            if (bxxk == null) {
                synchronized (abqb.class) {
                    bxxk = f57937d;
                    if (bxxk == null) {
                        bxxk = new bxve(f57936c);
                        f57937d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
