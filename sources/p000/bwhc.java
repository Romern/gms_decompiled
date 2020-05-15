package p000;

/* renamed from: bwhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwhc extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwhc f159486c;

    /* renamed from: e */
    private static volatile bxxk f159487e;

    /* renamed from: a */
    public long f159488a;

    /* renamed from: b */
    public int f159489b;

    /* renamed from: d */
    private int f159490d;

    static {
        bwhc bwhc = new bwhc();
        f159486c = bwhc;
        GeneratedMessageLite.m124024a(bwhc.class, bwhc);
    }

    private bwhc() {
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
            return GeneratedMessageLite.m124022a(f159486c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", bwha.f159485a});
        } else if (i2 == 3) {
            return new bwhc();
        } else {
            if (i2 == 4) {
                return new bxvd(f159486c);
            }
            if (i2 == 5) {
                return f159486c;
            }
            bxxk bxxk = f159487e;
            if (bxxk == null) {
                synchronized (bwhc.class) {
                    bxxk = f159487e;
                    if (bxxk == null) {
                        bxxk = new bxve(f159486c);
                        f159487e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
