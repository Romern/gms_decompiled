package p000;

/* renamed from: bvnz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvnz extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvnz f156989d;

    /* renamed from: e */
    private static volatile bxxk f156990e;

    /* renamed from: a */
    public int f156991a;

    /* renamed from: b */
    public int f156992b;

    /* renamed from: c */
    public int f156993c;

    static {
        bvnz bvnz = new bvnz();
        f156989d = bvnz;
        GeneratedMessageLite.m124024a(bvnz.class, bvnz);
    }

    private bvnz() {
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
            return GeneratedMessageLite.m124022a(f156989d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002င\u0000\u0003င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvnz();
        } else {
            if (i2 == 4) {
                return new bxvd(f156989d);
            }
            if (i2 == 5) {
                return f156989d;
            }
            bxxk bxxk = f156990e;
            if (bxxk == null) {
                synchronized (bvnz.class) {
                    bxxk = f156990e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156989d);
                        f156990e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
