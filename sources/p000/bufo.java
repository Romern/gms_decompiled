package p000;

/* renamed from: bufo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bufo extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bufo f153725h;

    /* renamed from: i */
    private static volatile bxxk f153726i;

    /* renamed from: a */
    public int f153727a;

    /* renamed from: b */
    public long f153728b;

    /* renamed from: c */
    public int f153729c;

    /* renamed from: d */
    public int f153730d;

    /* renamed from: e */
    public int f153731e;

    /* renamed from: f */
    public int f153732f;

    /* renamed from: g */
    public int f153733g;

    static {
        bufo bufo = new bufo();
        f153725h = bufo;
        GeneratedMessageLite.m124024a(bufo.class, bufo);
    }

    private bufo() {
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
            return GeneratedMessageLite.m124022a(f153725h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bufo();
        } else {
            if (i2 == 4) {
                return new bxvd(f153725h);
            }
            if (i2 == 5) {
                return f153725h;
            }
            bxxk bxxk = f153726i;
            if (bxxk == null) {
                synchronized (bufo.class) {
                    bxxk = f153726i;
                    if (bxxk == null) {
                        bxxk = new bxve(f153725h);
                        f153726i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
