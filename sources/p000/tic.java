package p000;

import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: tic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class tic implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    private final tid f46061a;

    public tic(tid tid) {
        this.f46061a = tid;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.f46061a.mo26454a((bmxv) obj);
    }

    public final void onLoaderReset(Loader loader) {
    }
}
