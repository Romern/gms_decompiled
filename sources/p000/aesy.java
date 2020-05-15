package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: aesy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aesy implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ LoaderManager.LoaderCallbacks f63754a;

    /* renamed from: b */
    final /* synthetic */ aesz f63755b;

    public aesy(aesz aesz, LoaderManager.LoaderCallbacks loaderCallbacks) {
        this.f63755b = aesz;
        this.f63754a = loaderCallbacks;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return this.f63754a.onCreateLoader(i, bundle);
    }

    public final void onLoadFinished(Loader loader, Object obj) {
        this.f63755b.f63757b.remove(Integer.valueOf(loader.getId()));
        aesz aesz = this.f63755b;
        aesz.f63758c.destroyLoader(loader.getId());
        this.f63754a.onLoadFinished(loader, obj);
    }

    public final void onLoaderReset(Loader loader) {
        this.f63755b.f63757b.remove(Integer.valueOf(loader.getId()));
        this.f63754a.onLoaderReset(loader);
    }
}
