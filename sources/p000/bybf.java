package p000;

/* renamed from: bybf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bybf extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bybf f165486d;

    /* renamed from: f */
    private static volatile bxxk f165487f;

    /* renamed from: a */
    public int f165488a;

    /* renamed from: b */
    public bybd f165489b;

    /* renamed from: c */
    public bybe f165490c;

    /* renamed from: e */
    private byte f165491e = 2;

    static {
        bybf bybf = new bybf();
        f165486d = bybf;
        GeneratedMessageLite.m124024a(bybf.class, bybf);
    }

    private bybf() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f165491e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f165491e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f165486d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bybf();
        } else {
            if (i2 == 4) {
                return new bxvd(f165486d);
            }
            if (i2 == 5) {
                return f165486d;
            }
            bxxk bxxk = f165487f;
            if (bxxk == null) {
                synchronized (bybf.class) {
                    bxxk = f165487f;
                    if (bxxk == null) {
                        bxxk = new bxve(f165486d);
                        f165487f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
