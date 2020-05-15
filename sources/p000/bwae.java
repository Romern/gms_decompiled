package p000;

/* renamed from: bwae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwae extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final bwae f158618k;

    /* renamed from: l */
    private static volatile bxxk f158619l;

    /* renamed from: a */
    public int f158620a;

    /* renamed from: b */
    public int f158621b;

    /* renamed from: c */
    public boolean f158622c;

    /* renamed from: d */
    public boolean f158623d;

    /* renamed from: e */
    public boolean f158624e;

    /* renamed from: f */
    public boolean f158625f;

    /* renamed from: g */
    public boolean f158626g;

    /* renamed from: h */
    public boolean f158627h;

    /* renamed from: i */
    public boolean f158628i;

    /* renamed from: j */
    public boolean f158629j;

    static {
        bwae bwae = new bwae();
        f158618k = bwae;
        GeneratedMessageLite.m124024a(bwae.class, bwae);
    }

    private bwae() {
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
            return GeneratedMessageLite.m124022a(f158618k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b", new Object[]{"a", "b", bwad.f158617a, "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new bwae();
        } else {
            if (i2 == 4) {
                return new bxvd(f158618k);
            }
            if (i2 == 5) {
                return f158618k;
            }
            bxxk bxxk = f158619l;
            if (bxxk == null) {
                synchronized (bwae.class) {
                    bxxk = f158619l;
                    if (bxxk == null) {
                        bxxk = new bxve(f158618k);
                        f158619l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
