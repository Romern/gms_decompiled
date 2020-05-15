package p000;

/* renamed from: bvfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvfw extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvfw f155929d;

    /* renamed from: e */
    private static volatile bxxk f155930e;

    /* renamed from: a */
    public int f155931a;

    /* renamed from: b */
    public bvga f155932b;

    /* renamed from: c */
    public long f155933c;

    static {
        bvfw bvfw = new bvfw();
        f155929d = bvfw;
        GeneratedMessageLite.m124024a(bvfw.class, bvfw);
    }

    private bvfw() {
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
            return GeneratedMessageLite.m124022a(f155929d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvfw();
        } else {
            if (i2 == 4) {
                return new bxvd(f155929d);
            }
            if (i2 == 5) {
                return f155929d;
            }
            bxxk bxxk = f155930e;
            if (bxxk == null) {
                synchronized (bvfw.class) {
                    bxxk = f155930e;
                    if (bxxk == null) {
                        bxxk = new bxve(f155929d);
                        f155930e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
