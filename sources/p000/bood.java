package p000;

/* renamed from: bood */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bood extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final bood f133892k;

    /* renamed from: l */
    private static volatile bxxk f133893l;

    /* renamed from: a */
    public long f133894a;

    /* renamed from: b */
    public String f133895b = "";

    /* renamed from: c */
    public String f133896c = "";

    /* renamed from: d */
    public int f133897d;

    /* renamed from: e */
    public int f133898e;

    /* renamed from: f */
    public String f133899f = "";

    /* renamed from: g */
    public String f133900g = "";

    /* renamed from: h */
    public long f133901h;

    /* renamed from: i */
    public String f133902i = "";

    /* renamed from: j */
    public bxwc f133903j = bxxn.f165040b;

    static {
        bood bood = new bood();
        f133892k = bood;
        GeneratedMessageLite.m124024a(bood.class, bood);
    }

    private bood() {
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
            return GeneratedMessageLite.m124022a(f133892k, "\u0000\n\u0000\u0000\u0001\f\n\u0000\u0001\u0000\u0001\u0002\u0004Ȉ\u0005Ȉ\u0006\u0004\u0007\f\bȈ\tȈ\n\u0002\u000bȈ\fȚ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new bood();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f133892k;
            }
            bxxk bxxk = f133893l;
            if (bxxk == null) {
                synchronized (bood.class) {
                    bxxk = f133893l;
                    if (bxxk == null) {
                        bxxk = new bxve(f133892k);
                        f133893l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
