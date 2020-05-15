package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed;

/* renamed from: anpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anpk implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ anpm f77396a;

    public anpk(anpm anpm) {
        this.f77396a = anpm;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        String str;
        if (bundle != null) {
            str = bundle.getString("page_token");
        } else {
            str = null;
        }
        Activity activity = this.f77396a.getActivity();
        anpm anpm = this.f77396a;
        return new anrp(activity, anpm.f77413l, anpm.f77414m, anpm.f77411j, 0, ((Integer) ansx.f77663M.mo25081c()).intValue(), str);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        PeopleFeed peopleFeed = (PeopleFeed) obj;
        if (peopleFeed != null) {
            if (((anrp) loader).f77514a == null) {
                anpb anpb = (anpb) this.f77396a.getListAdapter();
                anpb.f77371p.clear();
                anpb.f77343C = 0;
                anpb.mo42061a(peopleFeed);
            } else {
                ((anpb) this.f77396a.getListAdapter()).mo42061a(peopleFeed);
            }
            if (peopleFeed.f83008e != null) {
                Bundle bundle = new Bundle();
                bundle.putString("page_token", peopleFeed.f83008e);
                this.f77396a.getLoaderManager().restartLoader(3, bundle, new anpk(this.f77396a));
            }
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
