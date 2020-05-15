package p000;

/* renamed from: bzyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzyn extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bzyn f171898j;

    /* renamed from: k */
    private static volatile bxxk f171899k;

    /* renamed from: a */
    public String f171900a = "";

    /* renamed from: b */
    public String f171901b = "";

    /* renamed from: c */
    public bzyl f171902c;

    /* renamed from: d */
    public String f171903d = "";

    /* renamed from: e */
    public long f171904e;

    /* renamed from: f */
    public long f171905f;

    /* renamed from: g */
    public boolean f171906g;

    /* renamed from: h */
    public String f171907h = "";

    /* renamed from: i */
    public bxwc f171908i = bxxn.f165040b;

    static {
        bzyn bzyn = new bzyn();
        f171898j = bzyn;
        GeneratedMessageLite.m124024a(bzyn.class, bzyn);
    }

    private bzyn() {
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
            return GeneratedMessageLite.m124022a(f171898j, "\u0000\t\u0000\u0000\u0001\n\t\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\t\u0005Ȉ\u0006\u0002\u0007\u0002\b\u0007\tȈ\n\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", bzyo.class});
        } else if (i2 == 3) {
            return new bzyn();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (byte[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f171898j;
            }
            bxxk bxxk = f171899k;
            if (bxxk == null) {
                synchronized (bzyn.class) {
                    bxxk = f171899k;
                    if (bxxk == null) {
                        bxxk = new bxve(f171898j);
                        f171899k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
