package p000;

/* renamed from: bpxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpxf extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bpxf f139693d;

    /* renamed from: e */
    private static volatile bxxk f139694e;

    /* renamed from: a */
    public int f139695a;

    /* renamed from: b */
    public int f139696b;

    /* renamed from: c */
    public int f139697c;

    static {
        bpxf bpxf = new bpxf();
        f139693d = bpxf;
        GeneratedMessageLite.m124024a(bpxf.class, bpxf);
    }

    private bpxf() {
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
            return GeneratedMessageLite.m124022a(f139693d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", bpzm.m112435b(), "c"});
        } else if (i2 == 3) {
            return new bpxf();
        } else {
            if (i2 == 4) {
                return new bxvd(f139693d);
            }
            if (i2 == 5) {
                return f139693d;
            }
            bxxk bxxk = f139694e;
            if (bxxk == null) {
                synchronized (bpxf.class) {
                    bxxk = f139694e;
                    if (bxxk == null) {
                        bxxk = new bxve(f139693d);
                        f139694e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
