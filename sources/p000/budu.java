package p000;

/* renamed from: budu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class budu extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final budu f153518d;

    /* renamed from: f */
    private static volatile bxxk f153519f;

    /* renamed from: a */
    public long f153520a;

    /* renamed from: b */
    public int f153521b;

    /* renamed from: c */
    public float f153522c;

    /* renamed from: e */
    private int f153523e;

    static {
        budu budu = new budu();
        f153518d = budu;
        GeneratedMessageLite.m124024a(budu.class, budu);
    }

    private budu() {
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
            return GeneratedMessageLite.m124022a(f153518d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဋ\u0001\u0003ခ\u0002", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new budu();
        } else {
            if (i2 == 4) {
                return new bxvd(f153518d);
            }
            if (i2 == 5) {
                return f153518d;
            }
            bxxk bxxk = f153519f;
            if (bxxk == null) {
                synchronized (budu.class) {
                    bxxk = f153519f;
                    if (bxxk == null) {
                        bxxk = new bxve(f153518d);
                        f153519f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
