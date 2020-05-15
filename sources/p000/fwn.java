package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.appinvite.p015ui.context.section.LoaderSectionInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fwn implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ fwo f17441a;

    /* renamed from: b */
    private final Loader f17442b;

    public fwn(fwo fwo, Loader loader) {
        this.f17441a = fwo;
        this.f17442b = loader;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return this.f17442b;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        char c;
        ArrayList arrayList = (ArrayList) obj;
        int id = loader.getId();
        boolean z = false;
        if (arrayList != null) {
            LoaderSectionInfo loaderSectionInfo = (LoaderSectionInfo) this.f17441a.f17483v.get(id);
            List a = this.f17441a.mo11429a(id, arrayList);
            String str = loaderSectionInfo.f9788a;
            if (str.hashCode() == 315730723 && str.equals("suggested")) {
                c = 0;
            } else {
                c = 65535;
            }
            if (c != 0) {
                this.f17441a.f17450H = a.size();
            } else {
                this.f17441a.f17449G = a.size();
            }
            if (loaderSectionInfo.f9792e) {
                ArrayList arrayList2 = new ArrayList(a);
                fwo fwo = this.f17441a;
                fzm.m12793a(arrayList2, fwo.f17474m, fwo.f17475n, fwo.f17476o);
                this.f17441a.f17447E.f17420n.addAll(arrayList2);
            }
        }
        if (!this.f17441a.f17484w.get(id, false)) {
            if ((loader instanceof fyd) && !((fyd) loader).f17596a) {
                z = true;
            }
            this.f17441a.f17484w.put(id, true);
            this.f17441a.mo11440c(z);
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
