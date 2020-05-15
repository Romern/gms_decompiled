package p000;

/* renamed from: msz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class msz extends bxvk implements bxxd {

    /* renamed from: j */
    public static final msz f34606j;

    /* renamed from: k */
    private static volatile bxxk f34607k;

    /* renamed from: a */
    public int f34608a;

    /* renamed from: b */
    public long f34609b;

    /* renamed from: c */
    public int f34610c;

    /* renamed from: d */
    public int f34611d;

    /* renamed from: e */
    public String f34612e = "";

    /* renamed from: f */
    public int f34613f;

    /* renamed from: g */
    public boolean f34614g;

    /* renamed from: h */
    public long f34615h;

    /* renamed from: i */
    public String f34616i = "";

    static {
        msz msz = new msz();
        f34606j = msz;
        bxvk.m124024a(msz.class, msz);
    }

    private msz() {
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
            return bxvk.m124022a(f34606j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဇ\u0005\u0007ဂ\u0006\bဈ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new msz();
        } else {
            if (i2 == 4) {
                return new bxvd(f34606j);
            }
            if (i2 == 5) {
                return f34606j;
            }
            bxxk bxxk = f34607k;
            if (bxxk == null) {
                synchronized (msz.class) {
                    bxxk = f34607k;
                    if (bxxk == null) {
                        bxxk = new bxve(f34606j);
                        f34607k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
