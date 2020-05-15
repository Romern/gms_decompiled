package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: anoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anoh implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ anon f77291a;

    public anoh(anon anon) {
        this.f77291a = anon;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.f77291a.getActivity();
        anon anon = this.f77291a;
        anri anri = new anri(activity, anon.f77411j, anon.f77412k, anon.f77413l, anon.f77414m, false);
        anri.mo41661b(this.f77291a.f77299c);
        return anri;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        ((anog) this.f77291a.getListAdapter()).mo42062a((rtp) ((amev) obj));
    }

    public final void onLoaderReset(Loader loader) {
    }
}
