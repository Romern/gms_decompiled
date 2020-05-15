package p000;

/* renamed from: auhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auhc extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final auhc f91805d;

    /* renamed from: e */
    private static volatile bxxk f91806e;

    /* renamed from: a */
    public int f91807a;

    /* renamed from: b */
    public boolean f91808b = true;

    /* renamed from: c */
    public bxwc f91809c = bxxn.f165040b;

    static {
        auhc auhc = new auhc();
        f91805d = auhc;
        GeneratedMessageLite.m124024a(auhc.class, auhc);
    }

    private auhc() {
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
            return GeneratedMessageLite.m124022a(f91805d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001a", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new auhc();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f91805d;
            }
            bxxk bxxk = f91806e;
            if (bxxk == null) {
                synchronized (auhc.class) {
                    bxxk = f91806e;
                    if (bxxk == null) {
                        bxxk = new bxve(f91805d);
                        f91806e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo50522a() {
        if (!this.f91809c.mo73666a()) {
            this.f91809c = GeneratedMessageLite.m124021a(this.f91809c);
        }
    }
}
