package p000;

/* renamed from: ammb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ammb extends GeneratedMessageLite implements bxxd {

    /* renamed from: o */
    public static final ammb f75247o;

    /* renamed from: p */
    private static volatile bxxk f75248p;

    /* renamed from: a */
    public int f75249a;

    /* renamed from: b */
    public long f75250b;

    /* renamed from: c */
    public boolean f75251c;

    /* renamed from: d */
    public long f75252d;

    /* renamed from: e */
    public int f75253e;

    /* renamed from: f */
    public int f75254f;

    /* renamed from: g */
    public int f75255g;

    /* renamed from: h */
    public int f75256h;

    /* renamed from: i */
    public int f75257i;

    /* renamed from: j */
    public int f75258j;

    /* renamed from: k */
    public int f75259k;

    /* renamed from: l */
    public int f75260l;

    /* renamed from: m */
    public int f75261m;

    /* renamed from: n */
    public int f75262n;

    static {
        ammb ammb = new ammb();
        f75247o = ammb;
        GeneratedMessageLite.m124024a(ammb.class, ammb);
    }

    private ammb() {
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
            return GeneratedMessageLite.m124022a(f75247o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဌ\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bင\n\fင\u000b\rဌ\f", new Object[]{"a", "b", "c", "d", "e", amlz.f75245a, "f", "g", "h", "i", "j", "k", "l", "m", "n", amma.f75246a});
        } else if (i2 == 3) {
            return new ammb();
        } else {
            if (i2 == 4) {
                return new bxvd(f75247o);
            }
            if (i2 == 5) {
                return f75247o;
            }
            bxxk bxxk = f75248p;
            if (bxxk == null) {
                synchronized (ammb.class) {
                    bxxk = f75248p;
                    if (bxxk == null) {
                        bxxk = new bxve(f75247o);
                        f75248p = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
