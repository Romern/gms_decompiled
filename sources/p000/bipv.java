package p000;

/* renamed from: bipv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bipv extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bipv f121220d;

    /* renamed from: f */
    private static volatile bxxk f121221f;

    /* renamed from: a */
    public int f121222a;

    /* renamed from: b */
    public int f121223b;

    /* renamed from: c */
    public int f121224c;

    /* renamed from: e */
    private byte f121225e = 2;

    static {
        bipv bipv = new bipv();
        f121220d = bipv;
        GeneratedMessageLite.m124024a(bipv.class, bipv);
    }

    private bipv() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121225e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121225e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121220d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bipv();
        } else {
            if (i2 == 4) {
                return new bxvd(f121220d);
            }
            if (i2 == 5) {
                return f121220d;
            }
            bxxk bxxk = f121221f;
            if (bxxk == null) {
                synchronized (bipv.class) {
                    bxxk = f121221f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121220d);
                        f121221f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
