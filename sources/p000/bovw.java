package p000;

/* renamed from: bovw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bovw extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final bovw f135063l;

    /* renamed from: m */
    private static volatile bxxk f135064m;

    /* renamed from: a */
    public int f135065a;

    /* renamed from: b */
    public int f135066b;

    /* renamed from: c */
    public int f135067c;

    /* renamed from: d */
    public long f135068d;

    /* renamed from: e */
    public bovv f135069e;

    /* renamed from: f */
    public bovm f135070f;

    /* renamed from: g */
    public bovt f135071g;

    /* renamed from: h */
    public bovq f135072h;

    /* renamed from: i */
    public bovh f135073i;

    /* renamed from: j */
    public bovo f135074j;

    /* renamed from: k */
    public long f135075k;

    static {
        bovw bovw = new bovw();
        f135063l = bovw;
        GeneratedMessageLite.m124024a(bovw.class, bovw);
    }

    private bovw() {
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
            return GeneratedMessageLite.m124022a(f135063l, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0005ဉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bဉ\b\nဉ\n\u000bဉ\u000b\fဂ\u0003\rဂ\f", new Object[]{"a", "b", "c", bovp.f135039a, "e", "f", "g", "h", "i", "j", "d", "k"});
        } else if (i2 == 3) {
            return new bovw();
        } else {
            if (i2 == 4) {
                return new bxvd(f135063l);
            }
            if (i2 == 5) {
                return f135063l;
            }
            bxxk bxxk = f135064m;
            if (bxxk == null) {
                synchronized (bovw.class) {
                    bxxk = f135064m;
                    if (bxxk == null) {
                        bxxk = new bxve(f135063l);
                        f135064m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
