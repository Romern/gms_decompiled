package p000;

/* renamed from: btst */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btst extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final btst f150264i;

    /* renamed from: k */
    private static volatile bxxk f150265k;

    /* renamed from: a */
    public int f150266a;

    /* renamed from: b */
    public String f150267b = "";

    /* renamed from: c */
    public btsf f150268c;

    /* renamed from: d */
    public btsb f150269d;

    /* renamed from: e */
    public String f150270e = "";

    /* renamed from: f */
    public int f150271f;

    /* renamed from: g */
    public bxvt f150272g = bxvm.f164965b;

    /* renamed from: h */
    public btsg f150273h;

    /* renamed from: j */
    private byte f150274j = 2;

    static {
        btst btst = new btst();
        f150264i = btst;
        GeneratedMessageLite.m124024a(btst.class, btst);
    }

    private btst() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f150274j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f150274j = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f150264i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0006ဌ\u0005\u0007\u001e\bဉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", btss.f150263a, "g", btrr.m117076b(), "h"});
        } else if (i2 == 3) {
            return new btst();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (byte[][][]) null);
            }
            if (i2 == 5) {
                return f150264i;
            }
            bxxk bxxk = f150265k;
            if (bxxk == null) {
                synchronized (btst.class) {
                    bxxk = f150265k;
                    if (bxxk == null) {
                        bxxk = new bxve(f150264i);
                        f150265k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
