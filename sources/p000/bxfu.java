package p000;

/* renamed from: bxfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxfu extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxfu f163194c;

    /* renamed from: d */
    private static volatile bxxk f163195d;

    /* renamed from: a */
    public int f163196a;

    /* renamed from: b */
    public int f163197b;

    static {
        bxfu bxfu = new bxfu();
        f163194c = bxfu;
        GeneratedMessageLite.m124024a(bxfu.class, bxfu);
    }

    private bxfu() {
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
            return GeneratedMessageLite.m124022a(f163194c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bxfw.m122672b()});
        } else if (i2 == 3) {
            return new bxfu();
        } else {
            if (i2 == 4) {
                return new bxvd(f163194c);
            }
            if (i2 == 5) {
                return f163194c;
            }
            bxxk bxxk = f163195d;
            if (bxxk == null) {
                synchronized (bxfu.class) {
                    bxxk = f163195d;
                    if (bxxk == null) {
                        bxxk = new bxve(f163194c);
                        f163195d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
