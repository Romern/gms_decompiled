package p000;

/* renamed from: bvnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvnc extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvnc f156847d;

    /* renamed from: f */
    private static volatile bxxk f156848f;

    /* renamed from: a */
    public int f156849a;

    /* renamed from: b */
    public bvnf f156850b;

    /* renamed from: c */
    public int f156851c;

    /* renamed from: e */
    private byte f156852e = 2;

    static {
        bvnc bvnc = new bvnc();
        f156847d = bvnc;
        GeneratedMessageLite.m124024a(bvnc.class, bvnc);
    }

    private bvnc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f156852e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f156852e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f156847d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvnc();
        } else {
            if (i2 == 4) {
                return new bxvd(f156847d);
            }
            if (i2 == 5) {
                return f156847d;
            }
            bxxk bxxk = f156848f;
            if (bxxk == null) {
                synchronized (bvnc.class) {
                    bxxk = f156848f;
                    if (bxxk == null) {
                        bxxk = new bxve(f156847d);
                        f156848f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
