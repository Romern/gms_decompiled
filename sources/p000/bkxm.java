package p000;

/* renamed from: bkxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkxm extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bkxm f125391c;

    /* renamed from: d */
    private static volatile bxxk f125392d;

    /* renamed from: a */
    public int f125393a;

    /* renamed from: b */
    public long f125394b;

    static {
        bkxm bkxm = new bkxm();
        f125391c = bkxm;
        GeneratedMessageLite.m124024a(bkxm.class, bkxm);
    }

    private bkxm() {
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
            return GeneratedMessageLite.m124022a(f125391c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bkxm();
        } else {
            if (i2 == 4) {
                return new bxvd(f125391c);
            }
            if (i2 == 5) {
                return f125391c;
            }
            bxxk bxxk = f125392d;
            if (bxxk == null) {
                synchronized (bkxm.class) {
                    bxxk = f125392d;
                    if (bxxk == null) {
                        bxxk = new bxve(f125391c);
                        f125392d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
