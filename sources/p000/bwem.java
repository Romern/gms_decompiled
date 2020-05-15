package p000;

/* renamed from: bwem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwem extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwem f159003c;

    /* renamed from: d */
    private static volatile bxxk f159004d;

    /* renamed from: a */
    public int f159005a;

    /* renamed from: b */
    public bweh f159006b;

    static {
        bwem bwem = new bwem();
        f159003c = bwem;
        GeneratedMessageLite.m124024a(bwem.class, bwem);
    }

    private bwem() {
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
            return GeneratedMessageLite.m124022a(f159003c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwem();
        } else {
            if (i2 == 4) {
                return new bxvd(f159003c);
            }
            if (i2 == 5) {
                return f159003c;
            }
            bxxk bxxk = f159004d;
            if (bxxk == null) {
                synchronized (bwem.class) {
                    bxxk = f159004d;
                    if (bxxk == null) {
                        bxxk = new bxve(f159003c);
                        f159004d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
