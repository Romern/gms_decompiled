package p000;

/* renamed from: bbjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbjs extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bbjs f102776g;

    /* renamed from: h */
    private static volatile bxxk f102777h;

    /* renamed from: a */
    public int f102778a;

    /* renamed from: b */
    public String f102779b = "";

    /* renamed from: c */
    public String f102780c = "";

    /* renamed from: d */
    public String f102781d = "";

    /* renamed from: e */
    public String f102782e = "";

    /* renamed from: f */
    public String f102783f = "";

    static {
        bbjs bbjs = new bbjs();
        f102776g = bbjs;
        GeneratedMessageLite.m124024a(bbjs.class, bbjs);
    }

    private bbjs() {
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
            return GeneratedMessageLite.m124022a(f102776g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bbjs();
        } else {
            if (i2 == 4) {
                return new bxvd(f102776g);
            }
            if (i2 == 5) {
                return f102776g;
            }
            bxxk bxxk = f102777h;
            if (bxxk == null) {
                synchronized (bbjs.class) {
                    bxxk = f102777h;
                    if (bxxk == null) {
                        bxxk = new bxve(f102776g);
                        f102777h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
