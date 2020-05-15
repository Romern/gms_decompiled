package p000;

/* renamed from: bxnd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxnd extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxnd f164015e;

    /* renamed from: g */
    private static volatile bxxk f164016g;

    /* renamed from: a */
    public bxnc f164017a;

    /* renamed from: b */
    public bxnf f164018b;

    /* renamed from: c */
    public int f164019c;

    /* renamed from: d */
    public bxwc f164020d = bxxn.f165040b;

    /* renamed from: f */
    private int f164021f;

    static {
        bxnd bxnd = new bxnd();
        f164015e = bxnd;
        GeneratedMessageLite.m124024a(bxnd.class, bxnd);
    }

    private bxnd() {
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
            return GeneratedMessageLite.m124022a(f164015e, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004င\u0003\u0006\u001b", new Object[]{"f", "a", "b", "c", "d", bxnd.class});
        } else if (i2 == 3) {
            return new bxnd();
        } else {
            if (i2 == 4) {
                return new bxvd(f164015e);
            }
            if (i2 == 5) {
                return f164015e;
            }
            bxxk bxxk = f164016g;
            if (bxxk == null) {
                synchronized (bxnd.class) {
                    bxxk = f164016g;
                    if (bxxk == null) {
                        bxxk = new bxve(f164015e);
                        f164016g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
