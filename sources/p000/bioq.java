package p000;

/* renamed from: bioq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bioq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bioq f121089c;

    /* renamed from: e */
    private static volatile bxxk f121090e;

    /* renamed from: a */
    public int f121091a;

    /* renamed from: b */
    public int f121092b = 1;

    /* renamed from: d */
    private byte f121093d = 2;

    static {
        bioq bioq = new bioq();
        f121089c = bioq;
        bxvk.m124024a(bioq.class, bioq);
    }

    private bioq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121093d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121093d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121089c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"a", "b", bios.m102674b()});
        } else if (i2 == 3) {
            return new bioq();
        } else {
            if (i2 == 4) {
                return new bxvd(f121089c);
            }
            if (i2 == 5) {
                return f121089c;
            }
            bxxk bxxk = f121090e;
            if (bxxk == null) {
                synchronized (bioq.class) {
                    bxxk = f121090e;
                    if (bxxk == null) {
                        bxxk = new bxve(f121089c);
                        f121090e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
