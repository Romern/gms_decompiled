package p000;

/* renamed from: bwjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwjc extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwjc f159734d;

    /* renamed from: e */
    private static volatile bxxk f159735e;

    /* renamed from: a */
    public int f159736a;

    /* renamed from: b */
    public bmaj f159737b;

    /* renamed from: c */
    public bwjb f159738c;

    static {
        bwjc bwjc = new bwjc();
        f159734d = bwjc;
        GeneratedMessageLite.m124024a(bwjc.class, bwjc);
    }

    private bwjc() {
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
            return GeneratedMessageLite.m124022a(f159734d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwjc();
        } else {
            if (i2 == 4) {
                return new bxvd(f159734d);
            }
            if (i2 == 5) {
                return f159734d;
            }
            bxxk bxxk = f159735e;
            if (bxxk == null) {
                synchronized (bwjc.class) {
                    bxxk = f159735e;
                    if (bxxk == null) {
                        bxxk = new bxve(f159734d);
                        f159735e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
