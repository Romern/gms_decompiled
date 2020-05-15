package p000;

/* renamed from: byzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byzk extends bxvg implements bxvh {

    /* renamed from: f */
    public static final byzk f169111f;

    /* renamed from: h */
    private static volatile bxxk f169112h;

    /* renamed from: a */
    public int f169113a;

    /* renamed from: b */
    public String f169114b = "";

    /* renamed from: c */
    public byyp f169115c;

    /* renamed from: d */
    public byze f169116d;

    /* renamed from: e */
    public byzw f169117e;

    /* renamed from: g */
    private byte f169118g = 2;

    static {
        byzk byzk = new byzk();
        f169111f = byzk;
        GeneratedMessageLite.m124024a(byzk.class, byzk);
    }

    private byzk() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169118g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169118g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f169111f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new byzk();
        } else {
            if (i2 == 4) {
                return new bxvf(f169111f);
            }
            if (i2 == 5) {
                return f169111f;
            }
            bxxk bxxk = f169112h;
            if (bxxk == null) {
                synchronized (byzk.class) {
                    bxxk = f169112h;
                    if (bxxk == null) {
                        bxxk = new bxve(f169111f);
                        f169112h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
