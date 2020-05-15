package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: anol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anol implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ anon f77295a;

    public anol(anon anon) {
        this.f77295a = anon;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.f77295a.getActivity();
        anon anon = this.f77295a;
        anrm anrm = new anrm(activity, anon.f77411j, anon.f77412k, anon.f77413l, anon.f77414m);
        anrm.mo41661b(this.f77295a.f77299c);
        return anrm;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        ((anog) this.f77295a.getListAdapter()).mo42065c((amfb) obj);
    }

    public final void onLoaderReset(Loader loader) {
    }
}
