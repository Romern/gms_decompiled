package p000;

/* renamed from: blfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blfh extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final blfh f126361c;

    /* renamed from: e */
    private static volatile bxxk f126362e;

    /* renamed from: a */
    public int f126363a;

    /* renamed from: b */
    public cixj f126364b;

    /* renamed from: d */
    private byte f126365d = 2;

    static {
        blfh blfh = new blfh();
        f126361c = blfh;
        GeneratedMessageLite.m124024a(blfh.class, blfh);
    }

    private blfh() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f126365d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f126365d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f126361c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new blfh();
        } else {
            if (i2 == 4) {
                return new bxvd(f126361c);
            }
            if (i2 == 5) {
                return f126361c;
            }
            bxxk bxxk = f126362e;
            if (bxxk == null) {
                synchronized (blfh.class) {
                    bxxk = f126362e;
                    if (bxxk == null) {
                        bxxk = new bxve(f126361c);
                        f126362e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
