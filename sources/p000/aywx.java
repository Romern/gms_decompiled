package p000;

import android.app.Activity;
import android.view.View;

/* renamed from: aywx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aywx extends aywk {
    public aywx(aywo aywo, ayxj ayxj) {
        super(aywo, ayxj);
    }

    /* renamed from: a */
    public final void mo54503a(Activity activity) {
        View a = ayww.m84999a(activity);
        beel.m91855b();
        aywp c = mo54482c();
        aywp a2 = ayww.m85000a(a);
        if (a2 == null) {
            ayww ayww = new ayww(a, c);
            c.f98637b = ayww;
            ayww.mo54493c();
        } else if (!a2.mo54485b()) {
            a2.mo54484a(c);
        } else if (a2.mo54486c()) {
            ayxj.m85033a((RuntimeException) new IllegalStateException("CVE is already impressed and cannot be replaced."));
        } else {
            ayxj.m85033a((RuntimeException) new IllegalStateException("CVE is already attached and cannot be replaced."));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo54479b() {
        beel.m91855b();
    }
}
