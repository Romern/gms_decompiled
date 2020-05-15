package p000;

/* renamed from: bvul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvul extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bvul f157708e;

    /* renamed from: f */
    private static volatile bxxk f157709f;

    /* renamed from: a */
    public int f157710a;

    /* renamed from: b */
    public String f157711b = "";

    /* renamed from: c */
    public bzrv f157712c;

    /* renamed from: d */
    public float f157713d;

    static {
        bvul bvul = new bvul();
        f157708e = bvul;
        GeneratedMessageLite.m124024a(bvul.class, bvul);
    }

    private bvul() {
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
            return GeneratedMessageLite.m124022a(f157708e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ခ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bvul();
        } else {
            if (i2 == 4) {
                return new bxvd(f157708e);
            }
            if (i2 == 5) {
                return f157708e;
            }
            bxxk bxxk = f157709f;
            if (bxxk == null) {
                synchronized (bvul.class) {
                    bxxk = f157709f;
                    if (bxxk == null) {
                        bxxk = new bxve(f157708e);
                        f157709f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
