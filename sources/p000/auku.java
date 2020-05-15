package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import java.util.ArrayList;

/* renamed from: auku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auku implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ aukv f91992a;

    public auku(aukv aukv) {
        this.f91992a = aukv;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new aumg(this.f91992a.getActivity(), 4, bundle);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        aume aume = (aume) obj;
        aukv.f91993c.mo50711a("onLoadFinished()", new Object[0]);
        Bundle bundle = aume.f92072b;
        if (aume.f92071a.f30115i == 0) {
            aukv aukv = this.f91992a;
            aukv.f91995e.clear();
            aukv.f91994d.clear();
            ArrayList<String> stringArrayList = bundle.getStringArrayList("key_trustlet_names");
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                aukv.f91994d.add(str);
                aukv.f91995e.put(str, bundle.getBundle(str));
            }
            aukv.mo17248d();
            aukv.mo50627f();
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
