package p000;

/* renamed from: bvms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvms extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bvms f156782e;

    /* renamed from: f */
    private static volatile bxxk f156783f;

    /* renamed from: a */
    public int f156784a;

    /* renamed from: b */
    public String f156785b = "";

    /* renamed from: c */
    public bzrv f156786c;

    /* renamed from: d */
    public float f156787d;

    static {
        bvms bvms = new bvms();
        f156782e = bvms;
        GeneratedMessageLite.m124024a(bvms.class, bvms);
    }

    private bvms() {
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
            return GeneratedMessageLite.m124022a(f156782e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ခ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bvms();
        } else {
            if (i2 == 4) {
                return new bxvd(f156782e);
            }
            if (i2 == 5) {
                return f156782e;
            }
            bxxk bxxk = f156783f;
            if (bxxk == null) {
                synchronized (bvms.class) {
                    bxxk = f156783f;
                    if (bxxk == null) {
                        bxxk = new bxve(f156782e);
                        f156783f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
