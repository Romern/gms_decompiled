package p000;

/* renamed from: boop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boop extends bxvk implements bxxd {

    /* renamed from: n */
    public static final boop f133965n;

    /* renamed from: o */
    private static volatile bxxk f133966o;

    /* renamed from: a */
    public String f133967a = "";

    /* renamed from: b */
    public long f133968b;

    /* renamed from: c */
    public String f133969c = "";

    /* renamed from: d */
    public long f133970d;

    /* renamed from: e */
    public long f133971e;

    /* renamed from: f */
    public long f133972f;

    /* renamed from: g */
    public long f133973g;

    /* renamed from: h */
    public long f133974h;

    /* renamed from: i */
    public bxwc f133975i = bxxn.f165040b;

    /* renamed from: j */
    public int f133976j;

    /* renamed from: k */
    public int f133977k;

    /* renamed from: l */
    public int f133978l;

    /* renamed from: m */
    public int f133979m;

    static {
        boop boop = new boop();
        f133965n = boop;
        bxvk.m124024a(boop.class, boop);
    }

    private boop() {
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
            return bxvk.m124022a(f133965n, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0001\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ\u0004\u0002\u0005\u0002\u0006\u0002\u0007\u0002\b\u0002\t\u001b\n\f\u000b\f\f\f\r\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", boor.class, "j", "k", "l", "m"});
        } else if (i2 == 3) {
            return new boop();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (byte[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f133965n;
            }
            bxxk bxxk = f133966o;
            if (bxxk == null) {
                synchronized (boop.class) {
                    bxxk = f133966o;
                    if (bxxk == null) {
                        bxxk = new bxve(f133965n);
                        f133966o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
