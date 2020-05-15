package p000;

/* renamed from: cama */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cama extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final cama f175229e;

    /* renamed from: f */
    private static volatile bxxk f175230f;

    /* renamed from: a */
    public int f175231a;

    /* renamed from: b */
    public String f175232b = "";

    /* renamed from: c */
    public long f175233c;

    /* renamed from: d */
    public String f175234d = "";

    static {
        cama cama = new cama();
        f175229e = cama;
        GeneratedMessageLite.m124024a(cama.class, cama);
    }

    private cama() {
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
            return GeneratedMessageLite.m124022a(f175229e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cama();
        } else {
            if (i2 == 4) {
                return new bxvd(f175229e);
            }
            if (i2 == 5) {
                return f175229e;
            }
            bxxk bxxk = f175230f;
            if (bxxk == null) {
                synchronized (cama.class) {
                    bxxk = f175230f;
                    if (bxxk == null) {
                        bxxk = new bxve(f175229e);
                        f175230f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
