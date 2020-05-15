package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: anpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anpg implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ anpm f77392a;

    public anpg(anpm anpm) {
        this.f77392a = anpm;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.f77392a.getActivity();
        anpm anpm = this.f77392a;
        return new anri(activity, anpm.f77411j, anpm.f77412k, anpm.f77413l, anpm.f77414m, anpm.f77402e);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        amev amev = (amev) obj;
        if (this.f77392a.mo42090b().mo42089a()) {
            this.f77392a.mo42091c().mo42088b(amev.mo24660a());
            anpb anpb = (anpb) this.f77392a.getListAdapter();
            anpb.f77379x = new anou(anpb);
            anpb.mo42068g();
        }
        ((anpb) this.f77392a.getListAdapter()).mo42062a((rtp) amev);
    }

    public final void onLoaderReset(Loader loader) {
    }
}
