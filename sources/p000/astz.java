package p000;

import android.content.Context;

/* renamed from: astz */
public final /* synthetic */ class astz implements Runnable {

    /* renamed from: a */
    private final asuc f89728a;

    /* renamed from: b */
    private final Context f89729b;

    /* renamed from: c */
    private final byte[] f89730c;

    /* renamed from: d */
    private final long f89731d;

    /* renamed from: e */
    private final asud f89732e;

    public astz(asuc asuc, Context context, byte[] bArr, long j, asud asud) {
        this.f89728a = asuc;
        this.f89729b = context;
        this.f89730c = bArr;
        this.f89731d = j;
        this.f89732e = asud;
    }

    public final void run() {
        this.f89728a.mo49502a(this.f89729b, this.f89730c, this.f89731d, this.f89732e);
    }
}
