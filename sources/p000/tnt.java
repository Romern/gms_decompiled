package p000;

/* renamed from: tnt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tnt extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final tnt f46353g;

    /* renamed from: h */
    private static volatile bxxk f46354h;

    /* renamed from: a */
    public int f46355a;

    /* renamed from: b */
    public long f46356b;

    /* renamed from: c */
    public long f46357c;

    /* renamed from: d */
    public bxwc f46358d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f46359e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f46360f = bxxn.f165040b;

    static {
        tnt tnt = new tnt();
        f46353g = tnt;
        GeneratedMessageLite.m124024a(tnt.class, tnt);
    }

    private tnt() {
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
            return GeneratedMessageLite.m124022a(f46353g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\u001b\u0004\u001b\u0005\u001b", new Object[]{"a", "b", "c", "d", tns.class, "e", tnr.class, "f", tnm.class});
        } else if (i2 == 3) {
            return new tnt();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (float[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f46353g;
            }
            bxxk bxxk = f46354h;
            if (bxxk == null) {
                synchronized (tnt.class) {
                    bxxk = f46354h;
                    if (bxxk == null) {
                        bxxk = new bxve(f46353g);
                        f46354h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
