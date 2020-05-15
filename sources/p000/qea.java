package p000;

import android.content.Context;

/* renamed from: qea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qea implements qeo {

    /* renamed from: a */
    final /* synthetic */ int f41065a;

    /* renamed from: b */
    private long f41066b = 0;

    public qea(int i) {
        this.f41065a = i;
    }

    /* renamed from: a */
    public final void mo23984a(Object obj) {
        this.f41066b += qeq.m32020a(qeq.m32021a(obj, this.f41065a));
    }

    /* renamed from: a */
    public final void mo23985a(StringBuilder sb, Context context) {
        sb.append(this.f41066b);
    }
}
