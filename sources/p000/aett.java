package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: aett */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aett implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ aetw f63791a;

    public aett(aetw aetw) {
        this.f63791a = aetw;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.f63791a.getActivity();
        aetw aetw = this.f63791a;
        return new aetl(activity, aetw.f63796b, aetw.f63798d, !aetw.f63799e, aetw.f63797c, aetw.f63800f.f79666h);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        aetm aetm = (aetm) obj;
        aexw.m52662a(this.f63791a.getActivity());
        if (aetm.f63785b) {
            this.f63791a.f63803i = false;
            if (aetm.f63786c) {
                this.f63791a.f63803i = false;
                aetw aetw = this.f63791a;
                aetr aetr = new aetr();
                FragmentTransaction beginTransaction = aetw.getFragmentManager().beginTransaction();
                beginTransaction.add(aetr, "no_name_tag");
                beginTransaction.commitAllowingStateLoss();
                return;
            }
            aexq.m52658a(this.f63791a.getActivity());
            return;
        }
        Activity activity = this.f63791a.getActivity();
        if (activity instanceof aetx) {
            ((aetx) activity).mo34560a(aetm.f63784a);
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
