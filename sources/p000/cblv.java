package p000;

/* renamed from: cblv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cblv extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cblv f177568c;

    /* renamed from: d */
    private static volatile bxxk f177569d;

    /* renamed from: a */
    public cbmo f177570a;

    /* renamed from: b */
    public String f177571b = "";

    static {
        cblv cblv = new cblv();
        f177568c = cblv;
        GeneratedMessageLite.m124024a(cblv.class, cblv);
    }

    private cblv() {
        ByteString bxtx = bxtx.f164797b;
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
            return GeneratedMessageLite.m124022a(f177568c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cblv();
        } else {
            if (i2 == 4) {
                return new bxvd(f177568c);
            }
            if (i2 == 5) {
                return f177568c;
            }
            bxxk bxxk = f177569d;
            if (bxxk == null) {
                synchronized (cblv.class) {
                    bxxk = f177569d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177568c);
                        f177569d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
