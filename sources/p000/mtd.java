package p000;

@Deprecated
/* renamed from: mtd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mtd extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final mtd f34646j;

    /* renamed from: k */
    private static volatile bxxk f34647k;

    /* renamed from: a */
    public int f34648a;

    /* renamed from: b */
    public long f34649b;

    /* renamed from: c */
    public int f34650c;

    /* renamed from: d */
    public int f34651d;

    /* renamed from: e */
    public String f34652e = "";

    /* renamed from: f */
    public int f34653f;

    /* renamed from: g */
    public boolean f34654g;

    /* renamed from: h */
    public long f34655h;

    /* renamed from: i */
    public String f34656i = "";

    static {
        mtd mtd = new mtd();
        f34646j = mtd;
        GeneratedMessageLite.m124024a(mtd.class, mtd);
    }

    private mtd() {
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
            return GeneratedMessageLite.m124022a(f34646j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဇ\u0005\u0007ဂ\u0006\bဈ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new mtd();
        } else {
            if (i2 == 4) {
                return new bxvd(f34646j);
            }
            if (i2 == 5) {
                return f34646j;
            }
            bxxk bxxk = f34647k;
            if (bxxk == null) {
                synchronized (mtd.class) {
                    bxxk = f34647k;
                    if (bxxk == null) {
                        bxxk = new bxve(f34646j);
                        f34647k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
