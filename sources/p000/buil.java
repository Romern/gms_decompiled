package p000;

/* renamed from: buil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buil extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final buil f153949d;

    /* renamed from: e */
    private static volatile bxxk f153950e;

    /* renamed from: a */
    public int f153951a;

    /* renamed from: b */
    public long f153952b;

    /* renamed from: c */
    public bxwc f153953c = bxxn.f165040b;

    static {
        buil buil = new buil();
        f153949d = buil;
        GeneratedMessageLite.m124024a(buil.class, buil);
    }

    private buil() {
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
            return GeneratedMessageLite.m124022a(f153949d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001a", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new buil();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (short[][]) null);
            }
            if (i2 == 5) {
                return f153949d;
            }
            bxxk bxxk = f153950e;
            if (bxxk == null) {
                synchronized (buil.class) {
                    bxxk = f153950e;
                    if (bxxk == null) {
                        bxxk = new bxve(f153949d);
                        f153950e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
