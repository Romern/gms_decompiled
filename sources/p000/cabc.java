package p000;

/* renamed from: cabc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cabc extends bxvk implements bxxd {

    /* renamed from: k */
    public static final cabc f172411k;

    /* renamed from: m */
    private static volatile bxxk f172412m;

    /* renamed from: a */
    public int f172413a;

    /* renamed from: b */
    public int f172414b;

    /* renamed from: c */
    public boolean f172415c;

    /* renamed from: d */
    public String f172416d = "";

    /* renamed from: e */
    public caaa f172417e;

    /* renamed from: f */
    public long f172418f;

    /* renamed from: g */
    public int f172419g;

    /* renamed from: h */
    public long f172420h;

    /* renamed from: i */
    public caby f172421i;

    /* renamed from: j */
    public bxwc f172422j = bxxn.f165040b;

    /* renamed from: l */
    private byte f172423l = 2;

    static {
        cabc cabc = new cabc();
        f172411k = cabc;
        bxvk.m124024a(cabc.class, cabc);
    }

    private cabc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f172423l);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f172423l = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f172411k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0002\u0001ဇ\u0001\u0002ᔈ\u0002\u0003ᔉ\u0003\u0004ဂ\u0004\u0005င\u0005\u0006ဂ\u0006\u0007ဌ\u0000\bဉ\u0007\t\u001a", new Object[]{"a", "c", "d", "e", "f", "g", "h", "b", cabe.f172428a, "i", "j"});
        } else if (i2 == 3) {
            return new cabc();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (byte[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f172411k;
            }
            bxxk bxxk = f172412m;
            if (bxxk == null) {
                synchronized (cabc.class) {
                    bxxk = f172412m;
                    if (bxxk == null) {
                        bxxk = new bxve(f172411k);
                        f172412m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
