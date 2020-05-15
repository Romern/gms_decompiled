package p000;

import android.content.Context;

/* renamed from: asua */
public final /* synthetic */ class asua implements Runnable {

    /* renamed from: a */
    private final asuc f89733a;

    /* renamed from: b */
    private final Context f89734b;

    /* renamed from: c */
    private final int f89735c;

    /* renamed from: d */
    private final long f89736d;

    public asua(asuc asuc, Context context, int i, long j) {
        this.f89733a = asuc;
        this.f89734b = context;
        this.f89735c = i;
        this.f89736d = j;
    }

    public final void run() {
        this.f89733a.mo49499a(this.f89734b, this.f89735c, this.f89736d);
    }
}
