package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: anpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anpi implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ anpm f77394a;

    public anpi(anpm anpm) {
        this.f77394a = anpm;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.f77394a.getActivity();
        anpm anpm = this.f77394a;
        return new anrk(activity, anpm.f77411j, anpm.f77412k, anpm.f77413l, anpm.f77414m);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        ((anpb) this.f77394a.getListAdapter()).mo42064b((amev) obj);
    }

    public final void onLoaderReset(Loader loader) {
    }
}
