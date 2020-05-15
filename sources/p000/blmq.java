package p000;

/* renamed from: blmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blmq extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final blmq f126884c;

    /* renamed from: g */
    private static volatile bxxk f126885g;

    /* renamed from: a */
    public int f126886a;

    /* renamed from: b */
    public String f126887b = "";

    /* renamed from: d */
    private int f126888d;

    /* renamed from: e */
    private blmr f126889e;

    /* renamed from: f */
    private byte f126890f = 2;

    static {
        blmq blmq = new blmq();
        f126884c = blmq;
        GeneratedMessageLite.m124024a(blmq.class, blmq);
    }

    private blmq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f126890f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f126890f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f126884c, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ဈ\u0001\u0004ᐉ\u0003", new Object[]{"d", "a", "b", "e"});
        } else if (i2 == 3) {
            return new blmq();
        } else {
            if (i2 == 4) {
                return new bxvd(f126884c);
            }
            if (i2 == 5) {
                return f126884c;
            }
            bxxk bxxk = f126885g;
            if (bxxk == null) {
                synchronized (blmq.class) {
                    bxxk = f126885g;
                    if (bxxk == null) {
                        bxxk = new bxve(f126884c);
                        f126885g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
