package p000;

import com.android.volley.VolleyError;

/* renamed from: pjp */
public final /* synthetic */ class pjp {

    /* renamed from: a */
    private final pjs f39370a;

    public pjp(pjs pjs) {
        this.f39370a = pjs;
    }

    /* renamed from: a */
    public final void mo23276a(bltv bltv, VolleyError volleyError) {
        pjs pjs = this.f39370a;
        if (bltv == null) {
            pjs.f39373a.mo23677d("Failed to fetch deep links for app (%s) device (%s) due to %s", pjs.f39384l, pjs.f39375c, volleyError);
            return;
        }
        pjs.f39387o = bltv;
        pjs.mo23281c();
    }
}
