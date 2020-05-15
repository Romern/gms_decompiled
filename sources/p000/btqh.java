package p000;

/* renamed from: btqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btqh extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final btqh f149951d;

    /* renamed from: e */
    private static volatile bxxk f149952e;

    /* renamed from: a */
    public btiy f149953a;

    /* renamed from: b */
    public int f149954b;

    /* renamed from: c */
    public bxwc f149955c = bxxn.f165040b;

    static {
        btqh btqh = new btqh();
        f149951d = btqh;
        GeneratedMessageLite.m124024a(btqh.class, btqh);
    }

    private btqh() {
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
            return GeneratedMessageLite.m124022a(f149951d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0002\f\u0003\u001b", new Object[]{"a", "b", "c", btqj.class});
        } else if (i2 == 3) {
            return new btqh();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (byte[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f149951d;
            }
            bxxk bxxk = f149952e;
            if (bxxk == null) {
                synchronized (btqh.class) {
                    bxxk = f149952e;
                    if (bxxk == null) {
                        bxxk = new bxve(f149951d);
                        f149952e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
