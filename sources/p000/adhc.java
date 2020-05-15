package p000;

/* renamed from: adhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adhc extends bxvk implements bxxd {

    /* renamed from: h */
    public static final adhc f61655h;

    /* renamed from: i */
    private static volatile bxxk f61656i;

    /* renamed from: a */
    public int f61657a;

    /* renamed from: b */
    public int f61658b;

    /* renamed from: c */
    public String f61659c = "";

    /* renamed from: d */
    public int f61660d;

    /* renamed from: e */
    public int f61661e;

    /* renamed from: f */
    public bxwc f61662f = bxxn.f165040b;

    /* renamed from: g */
    public String f61663g = "";

    static {
        adhc adhc = new adhc();
        f61655h = adhc;
        bxvk.m124024a(adhc.class, adhc);
    }

    private adhc() {
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
            return bxvk.m124022a(f61655h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u0004\u0002\u0004\u0003Ȉ\u0004\u0004\u0005\u0004\u0006\u001b\u0007Ȉ", new Object[]{"a", "b", "c", "d", "e", "f", adhf.class, "g"});
        } else if (i2 == 3) {
            return new adhc();
        } else {
            if (i2 == 4) {
                return new bxvd(f61655h);
            }
            if (i2 == 5) {
                return f61655h;
            }
            bxxk bxxk = f61656i;
            if (bxxk == null) {
                synchronized (adhc.class) {
                    bxxk = f61656i;
                    if (bxxk == null) {
                        bxxk = new bxve(f61655h);
                        f61656i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
