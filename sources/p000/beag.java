package p000;

/* renamed from: beag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beag extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final beag f106732e;

    /* renamed from: f */
    private static volatile bxxk f106733f;

    /* renamed from: a */
    public int f106734a;

    /* renamed from: b */
    public int f106735b = 0;

    /* renamed from: c */
    public Object f106736c;

    /* renamed from: d */
    public String f106737d = "";

    static {
        beag beag = new beag();
        f106732e = beag;
        GeneratedMessageLite.m124024a(beag.class, beag);
    }

    private beag() {
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
            return GeneratedMessageLite.m124022a(f106732e, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဵ\u0000\u0003်\u0000\u0004ဳ\u0000\u0005ျ\u0000\u0006ွ\u0000", new Object[]{"c", "b", "a", "d"});
        } else if (i2 == 3) {
            return new beag();
        } else {
            if (i2 == 4) {
                return new bxvd(f106732e);
            }
            if (i2 == 5) {
                return f106732e;
            }
            bxxk bxxk = f106733f;
            if (bxxk == null) {
                synchronized (beag.class) {
                    bxxk = f106733f;
                    if (bxxk == null) {
                        bxxk = new bxve(f106732e);
                        f106733f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
