package p000;

/* renamed from: bity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bity extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bity f121743f;

    /* renamed from: h */
    private static volatile bxxk f121744h;

    /* renamed from: a */
    public int f121745a;

    /* renamed from: b */
    public int f121746b;

    /* renamed from: c */
    public int f121747c;

    /* renamed from: d */
    public int f121748d;

    /* renamed from: e */
    public biua f121749e;

    /* renamed from: g */
    private byte f121750g = 2;

    static {
        bity bity = new bity();
        f121743f = bity;
        GeneratedMessageLite.m124024a(bity.class, bity);
    }

    private bity() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121750g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121750g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121743f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᔌ\u0000\u0002ᔄ\u0001\u0003င\u0002\u0004ᐉ\u0003", new Object[]{"a", "b", biub.f121765a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new bity();
        } else {
            if (i2 == 4) {
                return new bxvd(f121743f);
            }
            if (i2 == 5) {
                return f121743f;
            }
            bxxk bxxk = f121744h;
            if (bxxk == null) {
                synchronized (bity.class) {
                    bxxk = f121744h;
                    if (bxxk == null) {
                        bxxk = new bxve(f121743f);
                        f121744h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
