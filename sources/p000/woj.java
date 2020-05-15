package p000;

import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.model.InvitationDataModel;

/* renamed from: woj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class woj implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ InvitationDataModel f51033a;

    /* renamed from: b */
    final /* synthetic */ wot f51034b;

    public woj(wot wot, InvitationDataModel invitationDataModel) {
        this.f51034b = wot;
        this.f51033a = invitationDataModel;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.f51034b.getActivity();
        wot wot = this.f51034b;
        return new wqe(activity, wot.f51049d, wot.f51048c.mo18479k(), this.f51034b.f51048c.mo18478j(), this.f51033a.f31343a);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.f51034b.mo29251d();
        if (((Boolean) obj).booleanValue()) {
            bhnh.m101201a(this.f51034b.getView(), (int) C0126R.string.fm_uninvite_success_message, 0).mo64020c();
            this.f51034b.f51048c.mo18525g();
            this.f51034b.mo29247a();
        } else {
            this.f51034b.mo29254g();
            this.f51034b.f51046a.setVisibility(0);
            bhnh.m101201a(this.f51034b.getView(), (int) C0126R.string.fm_uninvite_failure_message, 0).mo64020c();
        }
        this.f51034b.getActivity().getSupportLoaderManager().destroyLoader(3);
    }

    public final void onLoaderReset(Loader loader) {
    }
}
