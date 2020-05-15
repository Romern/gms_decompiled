package p000;

/* renamed from: bpvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpvw extends bxvk implements bxxd {

    /* renamed from: m */
    public static final bpvw f139435m;

    /* renamed from: n */
    private static volatile bxxk f139436n;

    /* renamed from: a */
    public int f139437a;

    /* renamed from: b */
    public int f139438b;

    /* renamed from: c */
    public int f139439c;

    /* renamed from: d */
    public int f139440d = -1;

    /* renamed from: e */
    public long f139441e;

    /* renamed from: f */
    public long f139442f;

    /* renamed from: g */
    public long f139443g;

    /* renamed from: h */
    public long f139444h;

    /* renamed from: i */
    public long f139445i;

    /* renamed from: j */
    public double f139446j;

    /* renamed from: k */
    public double f139447k;

    /* renamed from: l */
    public double f139448l;

    static {
        bpvw bpvw = new bpvw();
        f139435m = bpvw;
        bxvk.m124024a(bpvw.class, bpvw);
    }

    private bpvw() {
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
            return bxvk.m124022a(f139435m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tက\b\nက\t\u000bက\n", new Object[]{"a", "b", "c", "d", bpvu.f139434a, "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i2 == 3) {
            return new bpvw();
        } else {
            if (i2 == 4) {
                return new bxvd(f139435m);
            }
            if (i2 == 5) {
                return f139435m;
            }
            bxxk bxxk = f139436n;
            if (bxxk == null) {
                synchronized (bpvw.class) {
                    bxxk = f139436n;
                    if (bxxk == null) {
                        bxxk = new bxve(f139435m);
                        f139436n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
