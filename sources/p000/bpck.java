package p000;

/* renamed from: bpck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpck extends GeneratedMessageLite implements bxxd {

    /* renamed from: p */
    public static final bpck f135742p;

    /* renamed from: q */
    private static volatile bxxk f135743q;

    /* renamed from: a */
    public int f135744a;

    /* renamed from: b */
    public int f135745b;

    /* renamed from: c */
    public int f135746c;

    /* renamed from: d */
    public int f135747d;

    /* renamed from: e */
    public int f135748e;

    /* renamed from: f */
    public int f135749f;

    /* renamed from: g */
    public int f135750g;

    /* renamed from: h */
    public int f135751h;

    /* renamed from: i */
    public int f135752i;

    /* renamed from: j */
    public int f135753j;

    /* renamed from: k */
    public int f135754k;

    /* renamed from: l */
    public int f135755l;

    /* renamed from: m */
    public int f135756m;

    /* renamed from: n */
    public int f135757n;

    /* renamed from: o */
    public int f135758o;

    static {
        bpck bpck = new bpck();
        f135742p = bpck;
        GeneratedMessageLite.m124024a(bpck.class, bpck);
    }

    private bpck() {
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
            return GeneratedMessageLite.m124022a(f135742p, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bင\n\fင\u000b\rင\f\u000eင\r", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
        } else if (i2 == 3) {
            return new bpck();
        } else {
            if (i2 == 4) {
                return new bxvd(f135742p);
            }
            if (i2 == 5) {
                return f135742p;
            }
            bxxk bxxk = f135743q;
            if (bxxk == null) {
                synchronized (bpck.class) {
                    bxxk = f135743q;
                    if (bxxk == null) {
                        bxxk = new bxve(f135742p);
                        f135743q = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
