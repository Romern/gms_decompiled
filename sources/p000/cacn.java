package p000;

/* renamed from: cacn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cacn extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cacn f172581d;

    /* renamed from: f */
    private static volatile bxxk f172582f;

    /* renamed from: a */
    public int f172583a;

    /* renamed from: b */
    public String f172584b = "";

    /* renamed from: c */
    public String f172585c = "";

    /* renamed from: e */
    private byte f172586e = 2;

    static {
        cacn cacn = new cacn();
        f172581d = cacn;
        GeneratedMessageLite.m124024a(cacn.class, cacn);
    }

    private cacn() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f172586e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f172586e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f172581d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cacn();
        } else {
            if (i2 == 4) {
                return new bxvd(f172581d);
            }
            if (i2 == 5) {
                return f172581d;
            }
            bxxk bxxk = f172582f;
            if (bxxk == null) {
                synchronized (cacn.class) {
                    bxxk = f172582f;
                    if (bxxk == null) {
                        bxxk = new bxve(f172581d);
                        f172582f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
