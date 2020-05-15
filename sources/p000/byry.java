package p000;

/* renamed from: byry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byry extends bxvk implements bxxd {

    /* renamed from: e */
    public static final byry f167524e;

    /* renamed from: f */
    private static volatile bxxk f167525f;

    /* renamed from: a */
    public int f167526a;

    /* renamed from: b */
    public String f167527b = "";

    /* renamed from: c */
    public int f167528c;

    /* renamed from: d */
    public int f167529d;

    static {
        byry byry = new byry();
        f167524e = byry;
        bxvk.m124024a(byry.class, byry);
    }

    private byry() {
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
            return bxvk.m124022a(f167524e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", byrt.f167516a, "d"});
        } else if (i2 == 3) {
            return new byry();
        } else {
            if (i2 == 4) {
                return new bxvd(f167524e);
            }
            if (i2 == 5) {
                return f167524e;
            }
            bxxk bxxk = f167525f;
            if (bxxk == null) {
                synchronized (byry.class) {
                    bxxk = f167525f;
                    if (bxxk == null) {
                        bxxk = new bxve(f167524e);
                        f167525f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
