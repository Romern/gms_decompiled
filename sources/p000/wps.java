package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: wps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wps implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ wpu f51113a;

    public wps(wpu wpu) {
        this.f51113a = wpu;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new wqh(this.f51113a.getActivity(), this.f51113a.f51114a);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        bslt bslt = (bslt) obj;
        if (bslt != null) {
            if ((bslt.f144952a & 2) != 0) {
                bslq bslq = bslt.f144954c;
                if (bslq == null) {
                    bslq = bslq.f144938b;
                }
                int a = bslk.m115939a(bslq.f144940a);
                if (a != 0 && a == 2) {
                    this.f51113a.mo29275a(true);
                    return;
                }
            }
            if ((bslt.f144952a & 1) != 0) {
                bslr bslr = bslt.f144953b;
                if (bslr == null) {
                    bslr = bslr.f144942b;
                }
                int a2 = bslk.m115939a(bslr.f144944a);
                if (a2 != 0 && a2 == 2) {
                    this.f51113a.mo29275a(false);
                    return;
                }
            }
            this.f51113a.mo29275a(true);
            return;
        }
        this.f51113a.mo29275a(true);
    }

    public final void onLoaderReset(Loader loader) {
    }
}
