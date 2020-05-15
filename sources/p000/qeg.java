package p000;

import android.content.Context;

/* renamed from: qeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qeg implements qeo {

    /* renamed from: a */
    final /* synthetic */ int f41072a;

    /* renamed from: b */
    private long f41073b = Long.MIN_VALUE;

    public qeg(int i) {
        this.f41072a = i;
    }

    /* renamed from: a */
    public final void mo23984a(Object obj) {
        this.f41073b = Math.max(this.f41073b, qeq.m32020a(qeq.m32021a(obj, this.f41072a)));
    }

    /* renamed from: a */
    public final void mo23985a(StringBuilder sb, Context context) {
        sb.append(this.f41073b);
    }
}
