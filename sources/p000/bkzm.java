package p000;

/* renamed from: bkzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkzm extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bkzm f125617f;

    /* renamed from: g */
    private static volatile bxxk f125618g;

    /* renamed from: a */
    public int f125619a;

    /* renamed from: b */
    public long f125620b;

    /* renamed from: c */
    public int f125621c;

    /* renamed from: d */
    public int f125622d;

    /* renamed from: e */
    public int f125623e;

    static {
        bkzm bkzm = new bkzm();
        f125617f = bkzm;
        GeneratedMessageLite.m124024a(bkzm.class, bkzm);
    }

    private bkzm() {
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
            return GeneratedMessageLite.m124022a(f125617f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဃ\u0000\u0003ဌ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", new Object[]{"a", "b", "c", bkyg.f125459a, "d", "e"});
        } else if (i2 == 3) {
            return new bkzm();
        } else {
            if (i2 == 4) {
                return new bxvd(f125617f);
            }
            if (i2 == 5) {
                return f125617f;
            }
            bxxk bxxk = f125618g;
            if (bxxk == null) {
                synchronized (bkzm.class) {
                    bxxk = f125618g;
                    if (bxxk == null) {
                        bxxk = new bxve(f125617f);
                        f125618g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
