package p000;

/* renamed from: bpkg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpkg extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bpkg f137949d;

    /* renamed from: e */
    private static volatile bxxk f137950e;

    /* renamed from: a */
    public int f137951a;

    /* renamed from: b */
    public bpki f137952b;

    /* renamed from: c */
    public bpkh f137953c;

    static {
        bpkg bpkg = new bpkg();
        f137949d = bpkg;
        GeneratedMessageLite.m124024a(bpkg.class, bpkg);
    }

    private bpkg() {
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
            return GeneratedMessageLite.m124022a(f137949d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bpkg();
        } else {
            if (i2 == 4) {
                return new bxvd(f137949d);
            }
            if (i2 == 5) {
                return f137949d;
            }
            bxxk bxxk = f137950e;
            if (bxxk == null) {
                synchronized (bpkg.class) {
                    bxxk = f137950e;
                    if (bxxk == null) {
                        bxxk = new bxve(f137949d);
                        f137950e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
