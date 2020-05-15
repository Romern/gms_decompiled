package p000;

/* renamed from: abtp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abtp extends bxvk implements bxxd {

    /* renamed from: d */
    public static final abtp f58286d;

    /* renamed from: e */
    private static volatile bxxk f58287e;

    /* renamed from: a */
    public int f58288a;

    /* renamed from: b */
    public abud f58289b;

    /* renamed from: c */
    public bxwc f58290c = bxxn.f165040b;

    static {
        abtp abtp = new abtp();
        f58286d = abtp;
        bxvk.m124024a(abtp.class, abtp);
    }

    private abtp() {
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
            return bxvk.m124022a(f58286d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001a", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new abtp();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f58286d;
            }
            bxxk bxxk = f58287e;
            if (bxxk == null) {
                synchronized (abtp.class) {
                    bxxk = f58287e;
                    if (bxxk == null) {
                        bxxk = new bxve(f58286d);
                        f58287e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
