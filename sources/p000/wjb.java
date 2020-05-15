package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.p042v2.create.FamilyCreationChimeraActivity;
import com.google.android.gms.family.p042v2.model.CanCreateFamilyData;

/* renamed from: wjb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wjb implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ FamilyCreationChimeraActivity f50758a;

    public wjb(FamilyCreationChimeraActivity familyCreationChimeraActivity) {
        this.f50758a = familyCreationChimeraActivity;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        FamilyCreationChimeraActivity familyCreationChimeraActivity = this.f50758a;
        return new wmj(familyCreationChimeraActivity, familyCreationChimeraActivity.f31365b, familyCreationChimeraActivity.f31383t, familyCreationChimeraActivity.f31366c);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        why why = (why) obj;
        if (!why.f50696b) {
            this.f50758a.f31382s.mo29110a(3, 19);
            wgm.m41916a(this.f50758a, new wiz(this), new wja(this)).show();
            return;
        }
        this.f50758a.f31380q = new CanCreateFamilyData((braw) why.f50695a);
        this.f50758a.mo18437a(4);
        this.f50758a.mo18469z();
    }

    public final void onLoaderReset(Loader loader) {
    }
}
