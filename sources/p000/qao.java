package p000;

import com.android.volley.VolleyError;

/* renamed from: qao */
final /* synthetic */ class qao implements Runnable {

    /* renamed from: a */
    private final VolleyError f40814a;

    /* renamed from: b */
    private final pjp f40815b;

    public qao(pjp pjp, VolleyError volleyError) {
        this.f40815b = pjp;
        this.f40814a = volleyError;
    }

    public final void run() {
        this.f40815b.mo23276a(null, this.f40814a);
    }
}
