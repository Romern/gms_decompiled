package p000;

/* renamed from: btyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btyq extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final btyq f152966g;

    /* renamed from: h */
    private static volatile bxxk f152967h;

    /* renamed from: a */
    public int f152968a;

    /* renamed from: b */
    public long f152969b;

    /* renamed from: c */
    public float f152970c;

    /* renamed from: d */
    public float f152971d;

    /* renamed from: e */
    public float f152972e;

    /* renamed from: f */
    public long f152973f;

    static {
        btyq btyq = new btyq();
        f152966g = btyq;
        GeneratedMessageLite.m124024a(btyq.class, btyq);
    }

    private btyq() {
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
            return GeneratedMessageLite.m124022a(f152966g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဃ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ဃ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new btyq();
        } else {
            if (i2 == 4) {
                return new bxvd(f152966g);
            }
            if (i2 == 5) {
                return f152966g;
            }
            bxxk bxxk = f152967h;
            if (bxxk == null) {
                synchronized (btyq.class) {
                    bxxk = f152967h;
                    if (bxxk == null) {
                        bxxk = new bxve(f152966g);
                        f152967h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
