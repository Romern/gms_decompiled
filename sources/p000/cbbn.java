package p000;

/* renamed from: cbbn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbbn extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbbn f176594c;

    /* renamed from: d */
    private static volatile bxxk f176595d;

    /* renamed from: a */
    public bxwc f176596a = bxxn.f165040b;

    /* renamed from: b */
    public cbbu f176597b;

    static {
        cbbn cbbn = new cbbn();
        f176594c = cbbn;
        GeneratedMessageLite.m124024a(cbbn.class, cbbn);
    }

    private cbbn() {
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
            return GeneratedMessageLite.m124022a(f176594c, "\u0000\u0002\u0000\u0000de\u0002\u0000\u0001\u0000d\u001be\t", new Object[]{"a", cbbt.class, "b"});
        } else if (i2 == 3) {
            return new cbbn();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (float[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f176594c;
            }
            bxxk bxxk = f176595d;
            if (bxxk == null) {
                synchronized (cbbn.class) {
                    bxxk = f176595d;
                    if (bxxk == null) {
                        bxxk = new bxve(f176594c);
                        f176595d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo75224c() {
        if (!this.f176596a.mo73666a()) {
            this.f176596a = GeneratedMessageLite.m124021a(this.f176596a);
        }
    }
}
