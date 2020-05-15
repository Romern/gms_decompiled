package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.p042v2.create.FamilyCreationChimeraActivity;

/* renamed from: wjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wjk implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ FamilyCreationChimeraActivity f50767a;

    public wjk(FamilyCreationChimeraActivity familyCreationChimeraActivity) {
        this.f50767a = familyCreationChimeraActivity;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        FamilyCreationChimeraActivity familyCreationChimeraActivity = this.f50767a;
        return new wnn(familyCreationChimeraActivity, familyCreationChimeraActivity.f31365b, familyCreationChimeraActivity.f31383t, familyCreationChimeraActivity.f31366c);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        why why = (why) obj;
        if (why.f50696b) {
            FamilyCreationChimeraActivity familyCreationChimeraActivity = this.f50767a;
            brdc brdc = (brdc) why.f50695a;
            familyCreationChimeraActivity.f31371h = brdc.f142479c;
            brcm a = brcm.m113875a(brdc.f142480d);
            if (a == null) {
                a = brcm.UNKNOWN_FAMILY_ROLE;
            }
            familyCreationChimeraActivity.f31370g = a;
            this.f50767a.mo18437a(7);
            this.f50767a.mo18469z();
            return;
        }
        this.f50767a.f31382s.mo29110a(3, 26);
        wgm.m41916a(this.f50767a, new wji(this), new wjj(this)).show();
    }

    public final void onLoaderReset(Loader loader) {
    }
}
