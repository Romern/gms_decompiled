package p000;

/* renamed from: boge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boge extends GeneratedMessageLite implements bxxd {

    /* renamed from: m */
    public static final boge f132963m;

    /* renamed from: n */
    private static volatile bxxk f132964n;

    /* renamed from: a */
    public int f132965a;

    /* renamed from: b */
    public int f132966b;

    /* renamed from: c */
    public String f132967c = "";

    /* renamed from: d */
    public int f132968d;

    /* renamed from: e */
    public int f132969e;

    /* renamed from: f */
    public String f132970f = "";

    /* renamed from: g */
    public String f132971g = "";

    /* renamed from: h */
    public int f132972h;

    /* renamed from: i */
    public int f132973i;

    /* renamed from: j */
    public int f132974j;

    /* renamed from: k */
    public int f132975k;

    /* renamed from: l */
    public boolean f132976l;

    static {
        boge boge = new boge();
        f132963m = boge;
        GeneratedMessageLite.m124024a(boge.class, boge);
    }

    private boge() {
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
            return GeneratedMessageLite.m124022a(f132963m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007င\u0006\bင\u0007\tဌ\b\nဌ\t\u000bဇ\n", new Object[]{"a", "b", bogc.f132962a, "c", "d", "e", boga.f132961a, "f", "g", "h", "i", "j", bofz.m111163b(), "k", bofz.m111163b(), "l"});
        } else if (i2 == 3) {
            return new boge();
        } else {
            if (i2 == 4) {
                return new bxvd(f132963m);
            }
            if (i2 == 5) {
                return f132963m;
            }
            bxxk bxxk = f132964n;
            if (bxxk == null) {
                synchronized (boge.class) {
                    bxxk = f132964n;
                    if (bxxk == null) {
                        bxxk = new bxve(f132963m);
                        f132964n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
