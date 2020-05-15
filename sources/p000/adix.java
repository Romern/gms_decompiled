package p000;

/* renamed from: adix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adix extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final adix f61850c;

    /* renamed from: d */
    private static volatile bxxk f61851d;

    /* renamed from: a */
    public bxww f61852a = bxww.f165013b;

    /* renamed from: b */
    public long f61853b;

    static {
        adix adix = new adix();
        f61850c = adix;
        GeneratedMessageLite.m124024a(adix.class, adix);
    }

    private adix() {
    }

    /* renamed from: a */
    public final bxww mo33556a() {
        bxww bxww = this.f61852a;
        if (!bxww.f165014a) {
            this.f61852a = bxww.mo74203a();
        }
        return this.f61852a;
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
            return GeneratedMessageLite.m124022a(f61850c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u00012\u0002\u0002", new Object[]{"a", adiw.f61849a, "b"});
        } else if (i2 == 3) {
            return new adix();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (short[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f61850c;
            }
            bxxk bxxk = f61851d;
            if (bxxk == null) {
                synchronized (adix.class) {
                    bxxk = f61851d;
                    if (bxxk == null) {
                        bxxk = new bxve(f61850c);
                        f61851d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
