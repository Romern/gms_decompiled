package p000;

/* renamed from: bwfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwfw extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwfw f159149d;

    /* renamed from: e */
    private static volatile bxxk f159150e;

    /* renamed from: a */
    public int f159151a;

    /* renamed from: b */
    public String f159152b = "";

    /* renamed from: c */
    public long f159153c;

    static {
        bwfw bwfw = new bwfw();
        f159149d = bwfw;
        GeneratedMessageLite.m124024a(bwfw.class, bwfw);
    }

    private bwfw() {
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
            return GeneratedMessageLite.m124022a(f159149d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwfw();
        } else {
            if (i2 == 4) {
                return new bxvd(f159149d);
            }
            if (i2 == 5) {
                return f159149d;
            }
            bxxk bxxk = f159150e;
            if (bxxk == null) {
                synchronized (bwfw.class) {
                    bxxk = f159150e;
                    if (bxxk == null) {
                        bxxk = new bxve(f159149d);
                        f159150e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
