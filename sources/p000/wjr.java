package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.p042v2.create.FamilyCreationChimeraActivity;
import com.google.android.gms.family.p042v2.model.SetupParams;

/* renamed from: wjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wjr implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ FamilyCreationChimeraActivity f50774a;

    public wjr(FamilyCreationChimeraActivity familyCreationChimeraActivity) {
        this.f50774a = familyCreationChimeraActivity;
    }

    /* renamed from: a */
    private final void m41977a() {
        wgm.m41916a(this.f50774a, new wjp(this), new wjq(this)).show();
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        String str;
        int i2;
        Context applicationContext = this.f50774a.getApplicationContext();
        FamilyCreationChimeraActivity familyCreationChimeraActivity = this.f50774a;
        String str2 = familyCreationChimeraActivity.f31365b;
        wgh wgh = familyCreationChimeraActivity.f31383t;
        wgj wgj = familyCreationChimeraActivity.f31366c;
        boolean z = familyCreationChimeraActivity.f31373j;
        if (z) {
            str = familyCreationChimeraActivity.f31368e;
        } else {
            str = null;
        }
        if (z) {
            i2 = familyCreationChimeraActivity.f31384u;
        } else {
            i2 = 0;
        }
        return new wmo(applicationContext, str2, wgh, wgj, str, i2);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        why why = (why) obj;
        if (why.f50696b) {
            this.f50774a.f31378o = new SetupParams((brde) why.f50695a);
            FamilyCreationChimeraActivity familyCreationChimeraActivity = this.f50774a;
            if (familyCreationChimeraActivity.f31381r != null) {
                familyCreationChimeraActivity.mo18445b(true);
                this.f50774a.getSupportFragmentManager().executePendingTransactions();
                this.f50774a.f31381r = null;
            } else if (!familyCreationChimeraActivity.mo18460q()) {
                m41977a();
            }
        } else {
            this.f50774a.f31382s.mo29110a(3, 21);
            m41977a();
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
