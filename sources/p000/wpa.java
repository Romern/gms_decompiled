package p000;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.p042v2.manage.FamilyManagementChimeraActivity;
import com.google.android.gms.family.p042v2.model.PageData;

/* renamed from: wpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wpa implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ FamilyManagementChimeraActivity f51070a;

    public wpa(FamilyManagementChimeraActivity familyManagementChimeraActivity) {
        this.f51070a = familyManagementChimeraActivity;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        FamilyManagementChimeraActivity familyManagementChimeraActivity = this.f51070a;
        return new wqd(familyManagementChimeraActivity, familyManagementChimeraActivity.f31413b, familyManagementChimeraActivity.f31417f, familyManagementChimeraActivity.f31414c);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        why why = (why) obj;
        ProgressDialog progressDialog = this.f51070a.f31416e;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f51070a.f31416e = null;
        }
        if (why.f50696b) {
            Object obj2 = why.f50695a;
            if (obj2 != null && (((brbn) obj2).f142292a & 2) == 0) {
                FamilyManagementChimeraActivity familyManagementChimeraActivity = this.f51070a;
                familyManagementChimeraActivity.f31415d.mo29109a(12);
                Toast.makeText(familyManagementChimeraActivity, (int) C0126R.string.fm_delete_family_successful_message, 0).show();
                familyManagementChimeraActivity.mo18525g();
                familyManagementChimeraActivity.setResult(8, familyManagementChimeraActivity.mo18530q());
                familyManagementChimeraActivity.finish();
                this.f51070a.getSupportLoaderManager().destroyLoader(0);
            } else if (obj2 != null) {
                brbn brbn = (brbn) obj2;
                if ((brbn.f142292a & 2) != 0) {
                    FamilyManagementChimeraActivity familyManagementChimeraActivity2 = this.f51070a;
                    bree bree = brbn.f142294c;
                    if (bree == null) {
                        bree = bree.f142590e;
                    }
                    wgm.m41917a(familyManagementChimeraActivity2, new PageData(bree), this.f51070a.f31413b, new woz(this), null, false).show();
                    this.f51070a.getSupportLoaderManager().destroyLoader(0);
                }
            }
        }
        this.f51070a.mo18529p();
        this.f51070a.getSupportLoaderManager().destroyLoader(0);
    }

    public final void onLoaderReset(Loader loader) {
    }
}
