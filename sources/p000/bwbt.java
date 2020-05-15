package p000;

/* renamed from: bwbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwbt extends bxvk implements bxxd {

    /* renamed from: k */
    public static final bwbt f158758k;

    /* renamed from: l */
    private static volatile bxxk f158759l;

    /* renamed from: a */
    public String f158760a = "";

    /* renamed from: b */
    public String f158761b = "";

    /* renamed from: c */
    public long f158762c;

    /* renamed from: d */
    public String f158763d = "";

    /* renamed from: e */
    public String f158764e = "";

    /* renamed from: f */
    public String f158765f = "";

    /* renamed from: g */
    public int f158766g;

    /* renamed from: h */
    public String f158767h = "";

    /* renamed from: i */
    public String f158768i = "";

    /* renamed from: j */
    public boolean f158769j;

    static {
        bwbt bwbt = new bwbt();
        f158758k = bwbt;
        bxvk.m124024a(bwbt.class, bwbt);
    }

    private bwbt() {
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
            return bxvk.m124022a(f158758k, "\u0000\n\u0000\u0000\u0001\u000e\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0006Ȉ\bȈ\tȈ\n\f\u000bȈ\fȈ\u000e\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new bwbt();
        } else {
            if (i2 == 4) {
                return new bxvd(f158758k);
            }
            if (i2 == 5) {
                return f158758k;
            }
            bxxk bxxk = f158759l;
            if (bxxk == null) {
                synchronized (bwbt.class) {
                    bxxk = f158759l;
                    if (bxxk == null) {
                        bxxk = new bxve(f158758k);
                        f158759l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
