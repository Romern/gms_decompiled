package p000;

/* renamed from: bvtm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvtm extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bvtm f157582b;

    /* renamed from: c */
    private static volatile bxxk f157583c;

    /* renamed from: a */
    public bxwc f157584a = bxxn.f165040b;

    static {
        bvtm bvtm = new bvtm();
        f157582b = bvtm;
        GeneratedMessageLite.m124024a(bvtm.class, bvtm);
    }

    private bvtm() {
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
            return GeneratedMessageLite.m124022a(f157582b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", bvul.class});
        } else if (i2 == 3) {
            return new bvtm();
        } else {
            if (i2 == 4) {
                return new bxvd(f157582b);
            }
            if (i2 == 5) {
                return f157582b;
            }
            bxxk bxxk = f157583c;
            if (bxxk == null) {
                synchronized (bvtm.class) {
                    bxxk = f157583c;
                    if (bxxk == null) {
                        bxxk = new bxve(f157582b);
                        f157583c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
