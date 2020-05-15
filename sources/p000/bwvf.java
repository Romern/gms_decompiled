package p000;

/* renamed from: bwvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwvf extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwvf f161113d;

    /* renamed from: e */
    private static volatile bxxk f161114e;

    /* renamed from: a */
    public int f161115a;

    /* renamed from: b */
    public blxc f161116b;

    /* renamed from: c */
    public blxc f161117c;

    static {
        bwvf bwvf = new bwvf();
        f161113d = bwvf;
        GeneratedMessageLite.m124024a(bwvf.class, bwvf);
    }

    private bwvf() {
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
            return GeneratedMessageLite.m124022a(f161113d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwvf();
        } else {
            if (i2 == 4) {
                return new bxvd(f161113d);
            }
            if (i2 == 5) {
                return f161113d;
            }
            bxxk bxxk = f161114e;
            if (bxxk == null) {
                synchronized (bwvf.class) {
                    bxxk = f161114e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161113d);
                        f161114e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
