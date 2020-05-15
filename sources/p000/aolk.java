package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: aolk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aolk implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ aoln f78400a;

    public aolk(aoln aoln) {
        this.f78400a = aoln;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new anrj(this.f78400a.f78403F);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        amfa amfa = (amfa) obj;
        if (amfa != null) {
            this.f78400a.mo42042a(amfa);
        } else {
            this.f78400a.mo42041a();
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
