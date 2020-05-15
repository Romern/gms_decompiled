package p000;

/* renamed from: bnsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bnsr {
    STRING('s', bnst.GENERAL, "-#", true),
    BOOLEAN('b', bnst.BOOLEAN, "-", true),
    CHAR('c', bnst.CHARACTER, "-", true),
    DECIMAL('d', bnst.INTEGRAL, "-0+ ,(", false),
    OCTAL('o', bnst.INTEGRAL, "-#0(", false),
    HEX('x', bnst.INTEGRAL, "-#0(", true),
    FLOAT('f', bnst.FLOAT, "-#0+ ,(", false),
    EXPONENT('e', bnst.FLOAT, "-#0+ (", true),
    GENERAL('g', bnst.FLOAT, "-0+ ,(", true),
    EXPONENT_HEX('a', bnst.FLOAT, "-#0+ ", true);
    

    /* renamed from: k */
    public static final bnsr[] f132094k = new bnsr[26];

    /* renamed from: l */
    public final char f132096l;

    /* renamed from: m */
    public final bnst f132097m;

    /* renamed from: n */
    public final int f132098n;

    /* renamed from: o */
    public final String f132099o;

    static {
        bnsr[] values = values();
        for (bnsr bnsr : values) {
            f132094k[m110331a(bnsr.f132096l)] = bnsr;
        }
    }

    private bnsr(char c, bnst bnst, String str, boolean z) {
        this.f132096l = c;
        this.f132097m = bnst;
        this.f132098n = bnss.m110334a(str, z);
        StringBuilder sb = new StringBuilder(2);
        sb.append("%");
        sb.append(c);
        this.f132099o = sb.toString();
    }

    /* renamed from: a */
    public static int m110331a(char c) {
        return (c | ' ') - 'a';
    }
}
