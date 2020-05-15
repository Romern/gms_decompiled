package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: anpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anpd implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ anpm f77391a;

    public anpd(anpm anpm) {
        this.f77391a = anpm;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.f77391a.getActivity();
        anpm anpm = this.f77391a;
        return new anrh(activity, anpm.f77411j, anpm.f77412k, anpm.f77413l, anpm.f77414m);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        ((anpb) this.f77391a.getListAdapter()).mo42065c((amew) obj);
    }

    public final void onLoaderReset(Loader loader) {
    }
}
