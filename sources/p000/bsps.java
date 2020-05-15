package p000;

/* renamed from: bsps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsps extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final bsps f146574k;

    /* renamed from: l */
    private static volatile bxxk f146575l;

    /* renamed from: a */
    public int f146576a;

    /* renamed from: b */
    public int f146577b;

    /* renamed from: c */
    public int f146578c;

    /* renamed from: d */
    public int f146579d;

    /* renamed from: e */
    public int f146580e;

    /* renamed from: f */
    public int f146581f;

    /* renamed from: g */
    public int f146582g;

    /* renamed from: h */
    public int f146583h = -1;

    /* renamed from: i */
    public int f146584i = -1;

    /* renamed from: j */
    public int f146585j;

    static {
        bsps bsps = new bsps();
        f146574k = bsps;
        GeneratedMessageLite.m124024a(bsps.class, bsps);
    }

    private bsps() {
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
            return GeneratedMessageLite.m124022a(f146574k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဌ\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", bspr.f146573a});
        } else if (i2 == 3) {
            return new bsps();
        } else {
            if (i2 == 4) {
                return new bxvd(f146574k);
            }
            if (i2 == 5) {
                return f146574k;
            }
            bxxk bxxk = f146575l;
            if (bxxk == null) {
                synchronized (bsps.class) {
                    bxxk = f146575l;
                    if (bxxk == null) {
                        bxxk = new bxve(f146574k);
                        f146575l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
