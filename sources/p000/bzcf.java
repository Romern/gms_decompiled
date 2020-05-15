package p000;

/* renamed from: bzcf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzcf extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzcf f169312c;

    /* renamed from: e */
    private static volatile bxxk f169313e;

    /* renamed from: a */
    public bxwc f169314a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f169315b = bxxn.f165040b;

    /* renamed from: d */
    private byte f169316d = 2;

    static {
        bzcf bzcf = new bzcf();
        f169312c = bzcf;
        GeneratedMessageLite.m124024a(bzcf.class, bzcf);
    }

    private bzcf() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169316d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169316d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f169312c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001Л\u0002\u001a", new Object[]{"a", byzs.class, "b"});
        } else if (i2 == 3) {
            return new bzcf();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (char[][][]) null);
            }
            if (i2 == 5) {
                return f169312c;
            }
            bxxk bxxk = f169313e;
            if (bxxk == null) {
                synchronized (bzcf.class) {
                    bxxk = f169313e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169312c);
                        f169313e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo74523c() {
        if (!this.f169314a.mo73666a()) {
            this.f169314a = GeneratedMessageLite.m124021a(this.f169314a);
        }
    }
}
