package p000;

/* renamed from: bwnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwnn extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwnn f160373c;

    /* renamed from: d */
    public static final bxvj f160374d;

    /* renamed from: e */
    private static volatile bxxk f160375e;

    /* renamed from: a */
    public int f160376a;

    /* renamed from: b */
    public int f160377b;

    static {
        bwnn bwnn = new bwnn();
        f160373c = bwnn;
        GeneratedMessageLite.m124024a(bwnn.class, bwnn);
        bwog bwog = bwog.f160437f;
        bwnn bwnn2 = f160373c;
        f160374d = GeneratedMessageLite.m124006a(bwog, bwnn2, bwnn2, 228971052, bxzf.MESSAGE);
    }

    private bwnn() {
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
            return GeneratedMessageLite.m124022a(f160373c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bwnl.f160372a});
        } else if (i2 == 3) {
            return new bwnn();
        } else {
            if (i2 == 4) {
                return new bxvd(f160373c);
            }
            if (i2 == 5) {
                return f160373c;
            }
            bxxk bxxk = f160375e;
            if (bxxk == null) {
                synchronized (bwnn.class) {
                    bxxk = f160375e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160373c);
                        f160375e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
