package p000;

/* renamed from: blfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blfi extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final blfi f126366d;

    /* renamed from: f */
    private static volatile bxxk f126367f;

    /* renamed from: a */
    public int f126368a;

    /* renamed from: b */
    public blfh f126369b;

    /* renamed from: c */
    public blfm f126370c;

    /* renamed from: e */
    private byte f126371e = 2;

    static {
        blfi blfi = new blfi();
        f126366d = blfi;
        GeneratedMessageLite.m124024a(blfi.class, blfi);
    }

    private blfi() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f126371e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f126371e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f126366d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new blfi();
        } else {
            if (i2 == 4) {
                return new bxvd(f126366d);
            }
            if (i2 == 5) {
                return f126366d;
            }
            bxxk bxxk = f126367f;
            if (bxxk == null) {
                synchronized (blfi.class) {
                    bxxk = f126367f;
                    if (bxxk == null) {
                        bxxk = new bxve(f126366d);
                        f126367f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
