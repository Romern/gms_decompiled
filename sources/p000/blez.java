package p000;

/* renamed from: blez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blez extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final blez f126310a;

    /* renamed from: f */
    private static volatile bxxk f126311f;

    /* renamed from: b */
    private int f126312b;

    /* renamed from: c */
    private bsal f126313c;

    /* renamed from: d */
    private bsao f126314d;

    /* renamed from: e */
    private byte f126315e = 2;

    static {
        blez blez = new blez();
        f126310a = blez;
        GeneratedMessageLite.m124024a(blez.class, blez);
    }

    private blez() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f126315e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f126315e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f126310a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ᐉ\u0002", new Object[]{"b", "c", "d"});
        } else if (i2 == 3) {
            return new blez();
        } else {
            if (i2 == 4) {
                return new bxvd(f126310a);
            }
            if (i2 == 5) {
                return f126310a;
            }
            bxxk bxxk = f126311f;
            if (bxxk == null) {
                synchronized (blez.class) {
                    bxxk = f126311f;
                    if (bxxk == null) {
                        bxxk = new bxve(f126310a);
                        f126311f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
