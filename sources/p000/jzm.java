package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: jzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jzm implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ kaa f23579a;

    public jzm(kaa kaa) {
        this.f23579a = kaa;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new jyp(this.f23579a.getActivity(), "minute_maid");
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        String str = (String) obj;
        kaa kaa = this.f23579a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("window.setDgResult('");
        sb.append(str);
        sb.append("');");
        kaa.mo14280f(sb.toString());
    }

    public final void onLoaderReset(Loader loader) {
    }
}
