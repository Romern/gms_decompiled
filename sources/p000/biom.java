package p000;

/* renamed from: biom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biom extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final biom f121063d;

    /* renamed from: f */
    private static volatile bxxk f121064f;

    /* renamed from: a */
    public int f121065a;

    /* renamed from: b */
    public int f121066b;

    /* renamed from: c */
    public int f121067c;

    /* renamed from: e */
    private byte f121068e = 2;

    static {
        biom biom = new biom();
        f121063d = biom;
        GeneratedMessageLite.m124024a(biom.class, biom);
    }

    private biom() {
        bxwq bxwq = bxwq.f165002b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121068e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121068e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121063d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔄ\u0000\u0002ဋ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new biom();
        } else {
            if (i2 == 4) {
                return new bxvd(f121063d);
            }
            if (i2 == 5) {
                return f121063d;
            }
            bxxk bxxk = f121064f;
            if (bxxk == null) {
                synchronized (biom.class) {
                    bxxk = f121064f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121063d);
                        f121064f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
