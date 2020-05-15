package p000;

/* renamed from: bwby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwby extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwby f158793d;

    /* renamed from: e */
    private static volatile bxxk f158794e;

    /* renamed from: a */
    public btag f158795a;

    /* renamed from: b */
    public bxyk f158796b;

    /* renamed from: c */
    public bwbt f158797c;

    static {
        bwby bwby = new bwby();
        f158793d = bwby;
        GeneratedMessageLite.m124024a(bwby.class, bwby);
    }

    private bwby() {
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
            return GeneratedMessageLite.m124022a(f158793d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwby();
        } else {
            if (i2 == 4) {
                return new bxvd(f158793d);
            }
            if (i2 == 5) {
                return f158793d;
            }
            bxxk bxxk = f158794e;
            if (bxxk == null) {
                synchronized (bwby.class) {
                    bxxk = f158794e;
                    if (bxxk == null) {
                        bxxk = new bxve(f158793d);
                        f158794e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
