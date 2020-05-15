package p000;

/* renamed from: ieu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ieu extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final ieu f20822g;

    /* renamed from: h */
    private static volatile bxxk f20823h;

    /* renamed from: a */
    public bsnd f20824a;

    /* renamed from: b */
    public bsne f20825b;

    /* renamed from: c */
    public long f20826c;

    /* renamed from: d */
    public long f20827d;

    /* renamed from: e */
    public int f20828e;

    /* renamed from: f */
    public long f20829f;

    static {
        ieu ieu = new ieu();
        f20822g = ieu;
        GeneratedMessageLite.m124024a(ieu.class, ieu);
    }

    private ieu() {
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
            return GeneratedMessageLite.m124022a(f20822g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u0002\u0004\u0002\u0005\u0004\u0006\u0002", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new ieu();
        } else {
            if (i2 == 4) {
                return new bxvd(f20822g);
            }
            if (i2 == 5) {
                return f20822g;
            }
            bxxk bxxk = f20823h;
            if (bxxk == null) {
                synchronized (ieu.class) {
                    bxxk = f20823h;
                    if (bxxk == null) {
                        bxxk = new bxve(f20822g);
                        f20823h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
