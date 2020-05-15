package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: anoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anoj implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ anon f77293a;

    public anoj(anon anon) {
        this.f77293a = anon;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new anrj(this.f77293a.getActivity());
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        amfa amfa = (amfa) obj;
        if (amfa != null) {
            ((anog) this.f77293a.getListAdapter()).mo42042a(amfa);
        } else {
            ((anog) this.f77293a.getListAdapter()).mo42041a();
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
