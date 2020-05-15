package p000;

/* renamed from: byxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byxg extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final byxg f168727g;

    /* renamed from: h */
    private static volatile bxxk f168728h;

    /* renamed from: a */
    public int f168729a;

    /* renamed from: b */
    public bywt f168730b;

    /* renamed from: c */
    public bywt f168731c;

    /* renamed from: d */
    public String f168732d = "";

    /* renamed from: e */
    public String f168733e = "";

    /* renamed from: f */
    public bywu f168734f;

    static {
        byxg byxg = new byxg();
        f168727g = byxg;
        GeneratedMessageLite.m124024a(byxg.class, byxg);
    }

    private byxg() {
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
            return GeneratedMessageLite.m124022a(f168727g, "\u0001\u0005\u0000\u0001\u0004\n\u0005\u0000\u0000\u0000\u0004ဉ\u0000\u0005ဉ\u0001\u0007ဈ\u0003\tဈ\u0004\nဉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new byxg();
        } else {
            if (i2 == 4) {
                return new bxvd(f168727g);
            }
            if (i2 == 5) {
                return f168727g;
            }
            bxxk bxxk = f168728h;
            if (bxxk == null) {
                synchronized (byxg.class) {
                    bxxk = f168728h;
                    if (bxxk == null) {
                        bxxk = new bxve(f168727g);
                        f168728h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
