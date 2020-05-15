package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: aolm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aolm implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ aoln f78402a;

    public aolm(aoln aoln) {
        this.f78402a = aoln;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        aoln aoln = this.f78402a;
        anro anro = new anro(aoln.f78403F, aoln.f78404G, aoln.f78405H, aoln.f77368m, aoln.f77369n);
        anro.mo42155a(this.f78402a.f78406I);
        return anro;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        rtp rtp = (rtp) obj;
        if (rtp != null) {
            this.f78402a.mo42043a(rtp, ((anro) loader).mo42156a());
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
