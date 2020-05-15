package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.p042v2.create.FamilyCreationChimeraActivity;
import com.google.android.gms.family.p042v2.model.PageData;

/* renamed from: wkc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wkc implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ FamilyCreationChimeraActivity f50788a;

    public wkc(FamilyCreationChimeraActivity familyCreationChimeraActivity) {
        this.f50788a = familyCreationChimeraActivity;
    }

    /* renamed from: a */
    private final void m41978a() {
        wgm.m41916a(this.f50788a, new wjy(this), new wjz(this)).show();
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Context applicationContext = this.f50788a.getApplicationContext();
        FamilyCreationChimeraActivity familyCreationChimeraActivity = this.f50788a;
        return new wmr(applicationContext, familyCreationChimeraActivity.f31365b, familyCreationChimeraActivity.f31383t, familyCreationChimeraActivity.f31366c, familyCreationChimeraActivity.f31381r);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        why why = (why) obj;
        if (why.f50696b) {
            breg breg = (breg) why.f50695a;
            if (breg.f142609d) {
                if ((breg.f142606a & 16) != 0) {
                    if (this.f50788a.mo18458o()) {
                        this.f50788a.mo18453j();
                    }
                    FamilyCreationChimeraActivity familyCreationChimeraActivity = this.f50788a;
                    bree bree = ((breg) why.f50695a).f142611f;
                    if (bree == null) {
                        bree = bree.f142590e;
                    }
                    wgm.m41917a(familyCreationChimeraActivity, new PageData(bree), this.f50788a.f31365b, new wka(this, why), null, false).show();
                    return;
                }
                this.f50788a.f31382s.mo29110a(3, 27);
                m41978a();
            } else if (breg.f142608c) {
                this.f50788a.getSupportLoaderManager().restartLoader(4, null, new wjb(this.f50788a));
                this.f50788a.mo18444b(4);
            } else if ((breg.f142606a & 16) != 0) {
                if (this.f50788a.mo18458o()) {
                    this.f50788a.mo18453j();
                }
                FamilyCreationChimeraActivity familyCreationChimeraActivity2 = this.f50788a;
                bree bree2 = ((breg) why.f50695a).f142611f;
                if (bree2 == null) {
                    bree2 = bree.f142590e;
                }
                wgm.m41917a(familyCreationChimeraActivity2, new PageData(bree2), this.f50788a.f31365b, new wkb(this), null, false).show();
            } else {
                this.f50788a.f31382s.mo29110a(3, 27);
                m41978a();
            }
        } else {
            this.f50788a.f31382s.mo29110a(3, 18);
            m41978a();
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
