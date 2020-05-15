package p000;

/* renamed from: bucz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bucz extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bucz f153435d;

    /* renamed from: e */
    private static volatile bxxk f153436e;

    /* renamed from: a */
    public int f153437a;

    /* renamed from: b */
    public btvy f153438b;

    /* renamed from: c */
    public btwc f153439c;

    static {
        bucz bucz = new bucz();
        f153435d = bucz;
        GeneratedMessageLite.m124024a(bucz.class, bucz);
    }

    private bucz() {
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
            return GeneratedMessageLite.m124022a(f153435d, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bucz();
        } else {
            if (i2 == 4) {
                return new bxvd(f153435d);
            }
            if (i2 == 5) {
                return f153435d;
            }
            bxxk bxxk = f153436e;
            if (bxxk == null) {
                synchronized (bucz.class) {
                    bxxk = f153436e;
                    if (bxxk == null) {
                        bxxk = new bxve(f153435d);
                        f153436e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
