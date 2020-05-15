package p000;

/* renamed from: bxgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxgh extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxgh f163248e;

    /* renamed from: f */
    private static volatile bxxk f163249f;

    /* renamed from: a */
    public int f163250a;

    /* renamed from: b */
    public String f163251b = "";

    /* renamed from: c */
    public bxgf f163252c;

    /* renamed from: d */
    public long f163253d;

    static {
        bxgh bxgh = new bxgh();
        f163248e = bxgh;
        GeneratedMessageLite.m124024a(bxgh.class, bxgh);
    }

    private bxgh() {
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
            return GeneratedMessageLite.m124022a(f163248e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bxgh();
        } else {
            if (i2 == 4) {
                return new bxvd(f163248e);
            }
            if (i2 == 5) {
                return f163248e;
            }
            bxxk bxxk = f163249f;
            if (bxxk == null) {
                synchronized (bxgh.class) {
                    bxxk = f163249f;
                    if (bxxk == null) {
                        bxxk = new bxve(f163248e);
                        f163249f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
