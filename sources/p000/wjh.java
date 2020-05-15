package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.p042v2.create.FamilyCreationChimeraActivity;

/* renamed from: wjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wjh implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ FamilyCreationChimeraActivity f50764a;

    public wjh(FamilyCreationChimeraActivity familyCreationChimeraActivity) {
        this.f50764a = familyCreationChimeraActivity;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Context applicationContext = this.f50764a.getApplicationContext();
        FamilyCreationChimeraActivity familyCreationChimeraActivity = this.f50764a;
        return new wml(applicationContext, familyCreationChimeraActivity.f31365b, familyCreationChimeraActivity.f31383t, familyCreationChimeraActivity.f31366c, familyCreationChimeraActivity.f31378o, familyCreationChimeraActivity.f31367d);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        if (!((why) obj).f50696b) {
            this.f50764a.f31382s.mo29110a(3, 29);
            wgm.m41916a(this.f50764a, new wjf(this), new wjg(this)).show();
            return;
        }
        FamilyCreationChimeraActivity familyCreationChimeraActivity = this.f50764a;
        familyCreationChimeraActivity.f31372i = true;
        familyCreationChimeraActivity.f31388y = true;
        this.f50764a.f31382s.mo29116b(5);
        this.f50764a.mo18455l();
    }

    public final void onLoaderReset(Loader loader) {
    }
}
