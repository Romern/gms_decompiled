package p000;

/* renamed from: btbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btbu extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btbu f148215c;

    /* renamed from: e */
    private static volatile bxxk f148216e;

    /* renamed from: a */
    public int f148217a = 0;

    /* renamed from: b */
    public Object f148218b;

    /* renamed from: d */
    private byte f148219d = 2;

    static {
        btbu btbu = new btbu();
        f148215c = btbu;
        GeneratedMessageLite.m124024a(btbu.class, btbu);
    }

    private btbu() {
        bxxn bxxn = bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f148219d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f148219d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f148215c, "\u0000\u0003\u0001\u0000\u0004\b\u0003\u0000\u0000\u0001\u0004м\u0000\u0005<\u0000\b<\u0000", new Object[]{"b", "a", bler.class, btdf.class, bzkp.class});
        } else if (i2 == 3) {
            return new btbu();
        } else {
            if (i2 == 4) {
                return new bxvd(f148215c);
            }
            if (i2 == 5) {
                return f148215c;
            }
            bxxk bxxk = f148216e;
            if (bxxk == null) {
                synchronized (btbu.class) {
                    bxxk = f148216e;
                    if (bxxk == null) {
                        bxxk = new bxve(f148215c);
                        f148216e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
