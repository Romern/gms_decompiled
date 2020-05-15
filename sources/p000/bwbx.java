package p000;

/* renamed from: bwbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwbx extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwbx f158789c;

    /* renamed from: d */
    private static volatile bxxk f158790d;

    /* renamed from: a */
    public int f158791a;

    /* renamed from: b */
    public bxyk f158792b;

    static {
        bwbx bwbx = new bwbx();
        f158789c = bwbx;
        GeneratedMessageLite.m124024a(bwbx.class, bwbx);
    }

    private bwbx() {
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
            return GeneratedMessageLite.m124022a(f158789c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwbx();
        } else {
            if (i2 == 4) {
                return new bxvd(f158789c);
            }
            if (i2 == 5) {
                return f158789c;
            }
            bxxk bxxk = f158790d;
            if (bxxk == null) {
                synchronized (bwbx.class) {
                    bxxk = f158790d;
                    if (bxxk == null) {
                        bxxk = new bxve(f158789c);
                        f158790d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
