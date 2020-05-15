package p000;

/* renamed from: bldj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bldj extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bldj f126088e;

    /* renamed from: f */
    private static volatile bxxk f126089f;

    /* renamed from: a */
    public int f126090a;

    /* renamed from: b */
    public bleu f126091b;

    /* renamed from: c */
    public String f126092c = "";

    /* renamed from: d */
    public String f126093d = "";

    static {
        bldj bldj = new bldj();
        f126088e = bldj;
        GeneratedMessageLite.m124024a(bldj.class, bldj);
    }

    private bldj() {
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
            return GeneratedMessageLite.m124022a(f126088e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bldj();
        } else {
            if (i2 == 4) {
                return new bxvd(f126088e);
            }
            if (i2 == 5) {
                return f126088e;
            }
            bxxk bxxk = f126089f;
            if (bxxk == null) {
                synchronized (bldj.class) {
                    bxxk = f126089f;
                    if (bxxk == null) {
                        bxxk = new bxve(f126088e);
                        f126089f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
