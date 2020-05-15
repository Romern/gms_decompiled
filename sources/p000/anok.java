package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: anok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anok implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ anon f77294a;

    public anok(anon anon) {
        this.f77294a = anon;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.f77294a.getActivity();
        anon anon = this.f77294a;
        anrk anrk = new anrk(activity, anon.f77411j, anon.f77412k, anon.f77413l, anon.f77414m);
        anrk.mo41661b(this.f77294a.f77299c);
        return anrk;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        ((anog) this.f77294a.getListAdapter()).mo42064b((amev) obj);
    }

    public final void onLoaderReset(Loader loader) {
    }
}
