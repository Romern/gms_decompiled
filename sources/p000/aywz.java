package p000;

import android.view.View;

/* renamed from: aywz */
final /* synthetic */ class aywz implements bmxj {

    /* renamed from: a */
    private final View f98671a;

    public aywz(View view) {
        this.f98671a = view;
    }

    public final Object apply(Object obj) {
        View view = this.f98671a;
        aywp aywp = (aywp) obj;
        aywp a = ayww.m85000a(view);
        if (a != null) {
            if (!a.mo54485b()) {
                a.mo54484a(aywp);
            } else if (a.mo54486c()) {
                ayxj.m85033a((RuntimeException) new IllegalStateException("CVE is already impressed and cannot be replaced."));
            } else {
                ayxj.m85033a((RuntimeException) new IllegalStateException("CVE is already attached and cannot be replaced."));
            }
            return a;
        }
        ayww ayww = new ayww(view, aywp);
        aywp.f98637b = ayww;
        ayww.mo54493c();
        return aywp;
    }
}
