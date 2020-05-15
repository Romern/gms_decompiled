package p000;

import android.content.DialogInterface;

/* renamed from: gxd */
final /* synthetic */ class gxd implements DialogInterface.OnShowListener {

    /* renamed from: a */
    private final gxi f19157a;

    /* renamed from: b */
    private final bhfq f19158b;

    public gxd(gxi gxi, bhfq bhfq) {
        this.f19157a = gxi;
        this.f19158b = bhfq;
    }

    public final void onShow(DialogInterface dialogInterface) {
        gxi gxi = this.f19157a;
        gxi.f19165c = this.f19158b.mo63666a();
        gxi.f19166d.mo12439a(gxi.f19165c);
    }
}
