package p000;

/* renamed from: bfxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfxt extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bfxt f115618d;

    /* renamed from: e */
    private static volatile bxxk f115619e;

    /* renamed from: a */
    public int f115620a;

    /* renamed from: b */
    public boolean f115621b;

    /* renamed from: c */
    public bfxr f115622c;

    static {
        bfxt bfxt = new bfxt();
        f115618d = bfxt;
        GeneratedMessageLite.m124024a(bfxt.class, bfxt);
    }

    private bfxt() {
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
            return GeneratedMessageLite.m124022a(f115618d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bfxt();
        } else {
            if (i2 == 4) {
                return new bxvd(f115618d);
            }
            if (i2 == 5) {
                return f115618d;
            }
            bxxk bxxk = f115619e;
            if (bxxk == null) {
                synchronized (bfxt.class) {
                    bxxk = f115619e;
                    if (bxxk == null) {
                        bxxk = new bxve(f115618d);
                        f115619e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
