package p000;

/* renamed from: agnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agnc extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final agnc f66024f;

    /* renamed from: g */
    private static volatile bxxk f66025g;

    /* renamed from: a */
    public int f66026a;

    /* renamed from: b */
    public int f66027b;

    /* renamed from: c */
    public String f66028c = "";

    /* renamed from: d */
    public boolean f66029d;

    /* renamed from: e */
    public bxwc f66030e = bxxn.f165040b;

    static {
        agnc agnc = new agnc();
        f66024f = agnc;
        GeneratedMessageLite.m124024a(agnc.class, agnc);
    }

    private agnc() {
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
            return GeneratedMessageLite.m124022a(f66024f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"a", "b", agna.f66023a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new agnc();
        } else {
            if (i2 == 4) {
                return new bxvd(f66024f);
            }
            if (i2 == 5) {
                return f66024f;
            }
            bxxk bxxk = f66025g;
            if (bxxk == null) {
                synchronized (agnc.class) {
                    bxxk = f66025g;
                    if (bxxk == null) {
                        bxxk = new bxve(f66024f);
                        f66025g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
