package p000;

/* renamed from: bmsj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmsj extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bmsj f130686f;

    /* renamed from: h */
    private static volatile bxxk f130687h;

    /* renamed from: a */
    public int f130688a;

    /* renamed from: b */
    public bmav f130689b;

    /* renamed from: c */
    public bmaq f130690c;

    /* renamed from: d */
    public bmar f130691d;

    /* renamed from: e */
    public bmsl f130692e;

    /* renamed from: g */
    private byte f130693g = 2;

    static {
        bmsj bmsj = new bmsj();
        f130686f = bmsj;
        GeneratedMessageLite.m124024a(bmsj.class, bmsj);
    }

    private bmsj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f130693g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f130693g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f130686f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0003\u0004ဉ\u0002", new Object[]{"a", "b", "c", "e", "d"});
        } else if (i2 == 3) {
            return new bmsj();
        } else {
            if (i2 == 4) {
                return new bxvd(f130686f);
            }
            if (i2 == 5) {
                return f130686f;
            }
            bxxk bxxk = f130687h;
            if (bxxk == null) {
                synchronized (bmsj.class) {
                    bxxk = f130687h;
                    if (bxxk == null) {
                        bxxk = new bxve(f130686f);
                        f130687h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
