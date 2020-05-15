package p000;

/* renamed from: bvtp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvtp extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bvtp f157596e;

    /* renamed from: f */
    private static volatile bxxk f157597f;

    /* renamed from: a */
    public int f157598a;

    /* renamed from: b */
    public bxwc f157599b = bxxn.f165040b;

    /* renamed from: c */
    public String f157600c = "";

    /* renamed from: d */
    public bxwc f157601d = bxxn.f165040b;

    static {
        bvtp bvtp = new bvtp();
        f157596e = bvtp;
        GeneratedMessageLite.m124024a(bvtp.class, bvtp);
    }

    private bvtp() {
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
            return GeneratedMessageLite.m124022a(f157596e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0002\u0000\u0002\u001b\u0003ဈ\u0000\u0004\u001b", new Object[]{"a", "b", bvul.class, "c", "d", bvto.class});
        } else if (i2 == 3) {
            return new bvtp();
        } else {
            if (i2 == 4) {
                return new bxvd(f157596e);
            }
            if (i2 == 5) {
                return f157596e;
            }
            bxxk bxxk = f157597f;
            if (bxxk == null) {
                synchronized (bvtp.class) {
                    bxxk = f157597f;
                    if (bxxk == null) {
                        bxxk = new bxve(f157596e);
                        f157597f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
