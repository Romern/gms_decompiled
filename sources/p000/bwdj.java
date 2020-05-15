package p000;

/* renamed from: bwdj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwdj extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bwdj f158900b;

    /* renamed from: c */
    private static volatile bxxk f158901c;

    /* renamed from: a */
    public bxvt f158902a = bxvm.f164965b;

    static {
        bwdj bwdj = new bwdj();
        f158900b = bwdj;
        GeneratedMessageLite.m124024a(bwdj.class, bwdj);
    }

    private bwdj() {
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
            return GeneratedMessageLite.m124022a(f158900b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bwdj();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null);
            }
            if (i2 == 5) {
                return f158900b;
            }
            bxxk bxxk = f158901c;
            if (bxxk == null) {
                synchronized (bwdj.class) {
                    bxxk = f158901c;
                    if (bxxk == null) {
                        bxxk = new bxve(f158900b);
                        f158901c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
