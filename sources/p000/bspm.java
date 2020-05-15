package p000;

/* renamed from: bspm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bspm extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bspm f146525d;

    /* renamed from: e */
    private static volatile bxxk f146526e;

    /* renamed from: a */
    public int f146527a;

    /* renamed from: b */
    public bspk f146528b;

    /* renamed from: c */
    public bspo f146529c;

    static {
        bspm bspm = new bspm();
        f146525d = bspm;
        GeneratedMessageLite.m124024a(bspm.class, bspm);
    }

    private bspm() {
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
            return GeneratedMessageLite.m124022a(f146525d, "\u0001\u0002\u0000\u0001\u0004\u0007\u0002\u0000\u0000\u0000\u0004ဉ\u0003\u0007ဉ\u0006", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bspm();
        } else {
            if (i2 == 4) {
                return new bxvd(f146525d);
            }
            if (i2 == 5) {
                return f146525d;
            }
            bxxk bxxk = f146526e;
            if (bxxk == null) {
                synchronized (bspm.class) {
                    bxxk = f146526e;
                    if (bxxk == null) {
                        bxxk = new bxve(f146525d);
                        f146526e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
