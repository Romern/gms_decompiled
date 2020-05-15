package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: aoll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aoll implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ aoln f78401a;

    public aoll(aoln aoln) {
        this.f78401a = aoln;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        aoln aoln = this.f78401a;
        anrm anrm = new anrm(aoln.f78403F, aoln.f78404G, aoln.f78405H, aoln.f77368m, aoln.f77369n);
        anrm.mo41661b(this.f78401a.f78406I);
        return anrm;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        amfb amfb = (amfb) obj;
        if (amfb != null) {
            this.f78401a.mo42065c(amfb);
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
