package p000;

/* renamed from: bzqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzqf extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bzqf f170982f;

    /* renamed from: j */
    private static volatile bxxk f170983j;

    /* renamed from: a */
    public bxwc f170984a;

    /* renamed from: b */
    public String f170985b;

    /* renamed from: c */
    public String f170986c;

    /* renamed from: d */
    public String f170987d;

    /* renamed from: e */
    public String f170988e;

    /* renamed from: g */
    private int f170989g;

    /* renamed from: h */
    private String f170990h = "";

    /* renamed from: i */
    private byte f170991i = 2;

    static {
        bzqf bzqf = new bzqf();
        f170982f = bzqf;
        GeneratedMessageLite.m124024a(bzqf.class, bzqf);
    }

    private bzqf() {
        bxxn bxxn = bxxn.f165040b;
        this.f170984a = bxxn.f165040b;
        this.f170985b = "";
        this.f170986c = "lang.form_submitted";
        this.f170987d = "";
        this.f170988e = "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f170991i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f170991i = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f170982f, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0001\u0001\u0001ᔈ\u0000\u0003\u001b\u0004ဈ\u0001\u0006ဈ\u0003\nဈ\u0005\u000bဈ\u0006", new Object[]{"g", "h", "a", bzqi.class, "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bzqf();
        } else {
            if (i2 == 4) {
                return new bxvd(f170982f);
            }
            if (i2 == 5) {
                return f170982f;
            }
            bxxk bxxk = f170983j;
            if (bxxk == null) {
                synchronized (bzqf.class) {
                    bxxk = f170983j;
                    if (bxxk == null) {
                        bxxk = new bxve(f170982f);
                        f170983j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
