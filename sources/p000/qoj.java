package p000;

/* renamed from: qoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qoj extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final qoj f41860d;

    /* renamed from: e */
    private static volatile bxxk f41861e;

    /* renamed from: a */
    public int f41862a;

    /* renamed from: b */
    public int f41863b;

    /* renamed from: c */
    public bxwc f41864c = bxxn.f165040b;

    static {
        qoj qoj = new qoj();
        f41860d = qoj;
        GeneratedMessageLite.m124024a(qoj.class, qoj);
    }

    private qoj() {
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
            return GeneratedMessageLite.m124022a(f41860d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001b", new Object[]{"a", "b", "c", qoi.class});
        } else if (i2 == 3) {
            return new qoj();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (char[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f41860d;
            }
            bxxk bxxk = f41861e;
            if (bxxk == null) {
                synchronized (qoj.class) {
                    bxxk = f41861e;
                    if (bxxk == null) {
                        bxxk = new bxve(f41860d);
                        f41861e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo24170a() {
        if (!this.f41864c.mo73666a()) {
            this.f41864c = GeneratedMessageLite.m124021a(this.f41864c);
        }
    }
}
