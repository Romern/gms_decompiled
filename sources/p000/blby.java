package p000;

/* renamed from: blby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blby extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final blby f125883e;

    /* renamed from: g */
    private static volatile bxxk f125884g;

    /* renamed from: a */
    public int f125885a;

    /* renamed from: b */
    public int f125886b;

    /* renamed from: c */
    public blbz f125887c;

    /* renamed from: d */
    public int f125888d;

    /* renamed from: f */
    private byte f125889f = 2;

    static {
        blby blby = new blby();
        f125883e = blby;
        GeneratedMessageLite.m124024a(blby.class, blby);
    }

    private blby() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125889f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125889f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f125883e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001င\u0000\u0002ᐉ\u0001\u0005င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new blby();
        } else {
            if (i2 == 4) {
                return new bxvd(f125883e);
            }
            if (i2 == 5) {
                return f125883e;
            }
            bxxk bxxk = f125884g;
            if (bxxk == null) {
                synchronized (blby.class) {
                    bxxk = f125884g;
                    if (bxxk == null) {
                        bxxk = new bxve(f125883e);
                        f125884g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
