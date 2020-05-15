package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: anpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anpj implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ anpm f77395a;

    public anpj(anpm anpm) {
        this.f77395a = anpm;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.f77395a.getActivity();
        anpm anpm = this.f77395a;
        return new anrm(activity, anpm.f77411j, anpm.f77412k, anpm.f77413l, anpm.f77414m);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        ((anpb) this.f77395a.getListAdapter()).mo42065c((amfb) obj);
    }

    public final void onLoaderReset(Loader loader) {
    }
}
