package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: anom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anom implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ anon f77296a;

    public anom(anon anon) {
        this.f77296a = anon;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.f77296a.getActivity();
        anon anon = this.f77296a;
        anro anro = new anro(activity, anon.f77411j, anon.f77412k, anon.f77413l, anon.f77414m);
        anro.mo42155a(this.f77296a.f77299c);
        return anro;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        rtp rtp = (rtp) obj;
        if (rtp != null) {
            ((anog) this.f77296a.getListAdapter()).mo42043a(rtp, ((anro) loader).mo42156a());
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
