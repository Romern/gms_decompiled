package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.p042v2.create.FamilyCreationChimeraActivity;
import com.google.android.gms.family.p042v2.model.UpgradeParams;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;

/* renamed from: wju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wju implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ FamilyCreationChimeraActivity f50778a;

    /* renamed from: b */
    private final boolean f50779b;

    public wju(FamilyCreationChimeraActivity familyCreationChimeraActivity, boolean z) {
        this.f50778a = familyCreationChimeraActivity;
        this.f50779b = z;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        FamilyCreationChimeraActivity familyCreationChimeraActivity = this.f50778a;
        String str = familyCreationChimeraActivity.f31365b;
        wgh wgh = familyCreationChimeraActivity.f31383t;
        awbt awbt = new awbt();
        awbt.mo51835a(1);
        awkh a = awbv.m79579a(familyCreationChimeraActivity, awbt.mo51834a());
        FamilyCreationChimeraActivity familyCreationChimeraActivity2 = this.f50778a;
        int a2 = wgp.m41930a(familyCreationChimeraActivity2.getIntent());
        WalletCustomTheme walletCustomTheme = new WalletCustomTheme();
        walletCustomTheme.f110168a = qkj.m32287a(familyCreationChimeraActivity2, a2);
        FamilyCreationChimeraActivity familyCreationChimeraActivity3 = this.f50778a;
        return new wmp(familyCreationChimeraActivity, str, wgh, a, walletCustomTheme, familyCreationChimeraActivity3.f31366c, familyCreationChimeraActivity3.f31368e, familyCreationChimeraActivity3.f31384u);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        why why = (why) obj;
        if (why.f50696b) {
            this.f50778a.f31377n = new UpgradeParams((brdg) why.f50695a);
            if (!this.f50779b) {
                this.f50778a.mo18461r();
            } else if (!cdsk.m134836b()) {
                Context applicationContext = this.f50778a.getApplicationContext();
                awbt awbt = new awbt();
                awbt.mo51835a(1);
                this.f50778a.mo18438a(awbv.m79579a(applicationContext, awbt.mo51834a()));
            } else {
                this.f50778a.mo18462s();
            }
        } else {
            this.f50778a.f31382s.mo29110a(3, 20);
            wgm.m41916a(this.f50778a, new wjs(this, this.f50779b), new wjt(this)).show();
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
