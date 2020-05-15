package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.p042v2.create.FamilyCreationChimeraActivity;

/* renamed from: wje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wje implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ FamilyCreationChimeraActivity f50761a;

    public wje(FamilyCreationChimeraActivity familyCreationChimeraActivity) {
        this.f50761a = familyCreationChimeraActivity;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Context applicationContext = this.f50761a.getApplicationContext();
        FamilyCreationChimeraActivity familyCreationChimeraActivity = this.f50761a;
        return new wmk(applicationContext, familyCreationChimeraActivity.f31365b, familyCreationChimeraActivity.f31383t, familyCreationChimeraActivity.f31366c);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        if (!((why) obj).f50696b) {
            this.f50761a.f31382s.mo29110a(3, 43);
            wgm.m41916a(this.f50761a, new wjc(this), new wjd(this)).show();
            return;
        }
        this.f50761a.mo18453j();
        this.f50761a.f31388y = true;
        this.f50761a.mo18454k();
    }

    public final void onLoaderReset(Loader loader) {
    }
}
