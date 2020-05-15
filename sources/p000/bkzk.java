package p000;

/* renamed from: bkzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkzk extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bkzk f125605f;

    /* renamed from: g */
    private static volatile bxxk f125606g;

    /* renamed from: a */
    public int f125607a;

    /* renamed from: b */
    public int f125608b;

    /* renamed from: c */
    public int f125609c;

    /* renamed from: d */
    public int f125610d;

    /* renamed from: e */
    public long f125611e;

    static {
        bkzk bkzk = new bkzk();
        f125605f = bkzk;
        GeneratedMessageLite.m124024a(bkzk.class, bkzk);
    }

    private bkzk() {
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
            return GeneratedMessageLite.m124022a(f125605f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဃ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bkzk();
        } else {
            if (i2 == 4) {
                return new bxvd(f125605f);
            }
            if (i2 == 5) {
                return f125605f;
            }
            bxxk bxxk = f125606g;
            if (bxxk == null) {
                synchronized (bkzk.class) {
                    bxxk = f125606g;
                    if (bxxk == null) {
                        bxxk = new bxve(f125605f);
                        f125606g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
