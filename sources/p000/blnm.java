package p000;

/* renamed from: blnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blnm extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final blnm f126998e;

    /* renamed from: f */
    private static volatile bxxk f126999f;

    /* renamed from: a */
    public int f127000a;

    /* renamed from: b */
    public String f127001b = "";

    /* renamed from: c */
    public bxwc f127002c = bxxn.f165040b;

    /* renamed from: d */
    public String f127003d = "";

    static {
        blnm blnm = new blnm();
        f126998e = blnm;
        GeneratedMessageLite.m124024a(blnm.class, blnm);
    }

    private blnm() {
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
            return GeneratedMessageLite.m124022a(f126998e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a", new Object[]{"a", "b", "d", "c"});
        } else if (i2 == 3) {
            return new blnm();
        } else {
            if (i2 == 4) {
                return new bxvd(f126998e);
            }
            if (i2 == 5) {
                return f126998e;
            }
            bxxk bxxk = f126999f;
            if (bxxk == null) {
                synchronized (blnm.class) {
                    bxxk = f126999f;
                    if (bxxk == null) {
                        bxxk = new bxve(f126998e);
                        f126999f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
