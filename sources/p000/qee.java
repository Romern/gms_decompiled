package p000;

import android.content.Context;

/* renamed from: qee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qee implements qeo {

    /* renamed from: a */
    final /* synthetic */ int f41070a;

    /* renamed from: b */
    private long f41071b = Long.MAX_VALUE;

    public qee(int i) {
        this.f41070a = i;
    }

    /* renamed from: a */
    public final void mo23984a(Object obj) {
        this.f41071b = Math.min(this.f41071b, qeq.m32020a(qeq.m32021a(obj, this.f41070a)));
    }

    /* renamed from: a */
    public final void mo23985a(StringBuilder sb, Context context) {
        sb.append(this.f41071b);
    }
}
