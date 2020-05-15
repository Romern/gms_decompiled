package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.p042v2.create.FamilyCreationChimeraActivity;
import com.google.android.gms.family.p042v2.model.ProfileData;

/* renamed from: wjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wjx implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ FamilyCreationChimeraActivity f50782a;

    public wjx(FamilyCreationChimeraActivity familyCreationChimeraActivity) {
        this.f50782a = familyCreationChimeraActivity;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        FamilyCreationChimeraActivity familyCreationChimeraActivity = this.f50782a;
        return new wmq(familyCreationChimeraActivity, familyCreationChimeraActivity.f31365b);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        why why = (why) obj;
        if (!why.f50696b) {
            this.f50782a.f31382s.mo29110a(3, 16);
            wgm.m41916a(this.f50782a, new wjv(this), new wjw(this)).show();
            return;
        }
        FamilyCreationChimeraActivity familyCreationChimeraActivity = this.f50782a;
        familyCreationChimeraActivity.f31379p = (ProfileData) why.f50695a;
        familyCreationChimeraActivity.mo18437a(5);
        this.f50782a.mo18469z();
    }

    public final void onLoaderReset(Loader loader) {
    }
}
