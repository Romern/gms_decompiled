package p000;

import android.os.Bundle;
import com.google.android.chimera.LoaderManager;

/* renamed from: dep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dep implements C1085ip {

    /* renamed from: a */
    final LoaderManager.LoaderCallbacks f12980a;

    public dep(LoaderManager.LoaderCallbacks loaderCallbacks) {
        this.f12980a = loaderCallbacks;
    }

    /* renamed from: a */
    public final C1140ko mo8606a(int i, Bundle bundle) {
        return this.f12980a.onCreateLoader(i, bundle).getContainerLoader();
    }

    /* renamed from: a */
    public final void mo8607a(C1140ko koVar) {
        this.f12980a.onLoaderReset(((deo) koVar).getModuleLoader());
    }

    /* renamed from: a */
    public final void mo8608a(C1140ko koVar, Object obj) {
        this.f12980a.onLoadFinished(((deo) koVar).getModuleLoader(), obj);
    }
}
