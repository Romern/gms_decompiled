package p000;

import android.content.DialogInterface;

/* renamed from: wky */
final /* synthetic */ class wky implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final wlp f50819a;

    public wky(wlp wlp) {
        this.f50819a = wlp;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        wlp wlp = this.f50819a;
        wlp.f50835a.mo18476h();
        wlp.getLoaderManager().restartLoader(0, null, new wlj(wlp));
        wlp.getLoaderManager().restartLoader(1, null, new wlk(wlp));
        if (wlp.f50835a.mo18484p() != null) {
            wlp.f50840f = wlp.f50835a.mo18484p();
        } else {
            wlp.getLoaderManager().restartLoader(2, null, new wlo(wlp));
        }
    }
}
