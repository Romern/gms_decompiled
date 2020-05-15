package p000;

/* renamed from: jur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jur extends bxvk implements bxxd {

    /* renamed from: e */
    public static final jur f23251e;

    /* renamed from: f */
    private static volatile bxxk f23252f;

    /* renamed from: a */
    public int f23253a;

    /* renamed from: b */
    public String f23254b = "";

    /* renamed from: c */
    public String f23255c = "";

    /* renamed from: d */
    public bxtx f23256d = bxtx.f164797b;

    static {
        jur jur = new jur();
        f23251e = jur;
        bxvk.m124024a(jur.class, jur);
    }

    private jur() {
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
            return bxvk.m124022a(f23251e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new jur();
        } else {
            if (i2 == 4) {
                return new bxvd(f23251e);
            }
            if (i2 == 5) {
                return f23251e;
            }
            bxxk bxxk = f23252f;
            if (bxxk == null) {
                synchronized (jur.class) {
                    bxxk = f23252f;
                    if (bxxk == null) {
                        bxxk = new bxve(f23251e);
                        f23252f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
