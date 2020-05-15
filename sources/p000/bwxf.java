package p000;

/* renamed from: bwxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwxf extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwxf f161340d;

    /* renamed from: e */
    private static volatile bxxk f161341e;

    /* renamed from: a */
    public int f161342a;

    /* renamed from: b */
    public int f161343b;

    /* renamed from: c */
    public int f161344c = 1;

    static {
        bwxf bwxf = new bwxf();
        f161340d = bwxf;
        bxvk.m124024a(bwxf.class, bwxf);
    }

    private bwxf() {
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
            return bxvk.m124022a(f161340d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwxf();
        } else {
            if (i2 == 4) {
                return new bxvd(f161340d);
            }
            if (i2 == 5) {
                return f161340d;
            }
            bxxk bxxk = f161341e;
            if (bxxk == null) {
                synchronized (bwxf.class) {
                    bxxk = f161341e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161340d);
                        f161341e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
