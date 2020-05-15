package p000;

/* renamed from: bmmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmmj extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bmmj f130020b;

    /* renamed from: d */
    private static volatile bxxk f130021d;

    /* renamed from: a */
    public bwiu f130022a;

    /* renamed from: c */
    private int f130023c;

    static {
        bmmj bmmj = new bmmj();
        f130020b = bmmj;
        GeneratedMessageLite.m124024a(bmmj.class, bmmj);
    }

    private bmmj() {
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
            return GeneratedMessageLite.m124022a(f130020b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bmmj();
        } else {
            if (i2 == 4) {
                return new bxvd(f130020b);
            }
            if (i2 == 5) {
                return f130020b;
            }
            bxxk bxxk = f130021d;
            if (bxxk == null) {
                synchronized (bmmj.class) {
                    bxxk = f130021d;
                    if (bxxk == null) {
                        bxxk = new bxve(f130020b);
                        f130021d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
