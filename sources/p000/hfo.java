package p000;

import android.content.DialogInterface;

/* renamed from: hfo */
final /* synthetic */ class hfo implements DialogInterface.OnShowListener {

    /* renamed from: a */
    private final hfp f19669a;

    /* renamed from: b */
    private final bhfq f19670b;

    public hfo(hfp hfp, bhfq bhfq) {
        this.f19669a = hfp;
        this.f19670b = bhfq;
    }

    public final void onShow(DialogInterface dialogInterface) {
        hfp hfp = this.f19669a;
        hfp.f19672b = this.f19670b.mo63666a();
        hfp.f19673c.mo12439a(hfp.f19672b);
    }
}
