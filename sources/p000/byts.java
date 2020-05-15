package p000;

/* renamed from: byts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byts extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final byts f167713b;

    /* renamed from: c */
    private static volatile bxxk f167714c;

    /* renamed from: a */
    public bxwc f167715a = bxxn.f165040b;

    static {
        byts byts = new byts();
        f167713b = byts;
        GeneratedMessageLite.m124024a(byts.class, byts);
    }

    private byts() {
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
            return GeneratedMessageLite.m124022a(f167713b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bytw.class});
        } else if (i2 == 3) {
            return new byts();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (char[][]) null);
            }
            if (i2 == 5) {
                return f167713b;
            }
            bxxk bxxk = f167714c;
            if (bxxk == null) {
                synchronized (byts.class) {
                    bxxk = f167714c;
                    if (bxxk == null) {
                        bxxk = new bxve(f167713b);
                        f167714c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo74506c() {
        if (!this.f167715a.mo73666a()) {
            this.f167715a = GeneratedMessageLite.m124021a(this.f167715a);
        }
    }
}
