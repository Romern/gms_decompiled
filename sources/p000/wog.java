package p000;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.p042v2.manage.DeleteMemberChimeraActivity;

/* renamed from: wog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wog implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ DeleteMemberChimeraActivity f51030a;

    public wog(DeleteMemberChimeraActivity deleteMemberChimeraActivity) {
        this.f51030a = deleteMemberChimeraActivity;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        DeleteMemberChimeraActivity deleteMemberChimeraActivity = this.f51030a;
        return new wqf(deleteMemberChimeraActivity, deleteMemberChimeraActivity.f31404c, deleteMemberChimeraActivity.f31410i, deleteMemberChimeraActivity.f31403b, deleteMemberChimeraActivity.f31405d);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Boolean bool = (Boolean) obj;
        DeleteMemberChimeraActivity deleteMemberChimeraActivity = this.f51030a;
        deleteMemberChimeraActivity.f31408g = false;
        ProgressDialog progressDialog = deleteMemberChimeraActivity.f31409h;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f51030a.f31409h = null;
        }
        String valueOf = String.valueOf(bool);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
        sb.append("Delete member loader result received, value = ");
        sb.append(valueOf);
        wgn.m41923c("DeleteMemberActivity", sb.toString(), new Object[0]);
        if (bool.booleanValue()) {
            DeleteMemberChimeraActivity deleteMemberChimeraActivity2 = this.f51030a;
            if (!deleteMemberChimeraActivity2.f31407f) {
                deleteMemberChimeraActivity2.f31411j.mo29109a(9);
                Toast.makeText(deleteMemberChimeraActivity2, deleteMemberChimeraActivity2.getResources().getString(C0126R.string.fm_member_delete_successful_message, deleteMemberChimeraActivity2.f31406e), 0).show();
                Intent intent = new Intent();
                deleteMemberChimeraActivity2.mo18494b(intent);
                deleteMemberChimeraActivity2.setResult(6, intent);
                deleteMemberChimeraActivity2.finish();
            } else {
                deleteMemberChimeraActivity2.f31411j.mo29109a(18);
                Toast.makeText(deleteMemberChimeraActivity2, (int) C0126R.string.fm_leave_family_successful_message, 0).show();
                Intent intent2 = new Intent();
                deleteMemberChimeraActivity2.mo18494b(intent2);
                deleteMemberChimeraActivity2.setResult(9, intent2);
                deleteMemberChimeraActivity2.finish();
            }
        } else {
            DeleteMemberChimeraActivity deleteMemberChimeraActivity3 = this.f51030a;
            if (!deleteMemberChimeraActivity3.f31407f) {
                Toast.makeText(deleteMemberChimeraActivity3, deleteMemberChimeraActivity3.getResources().getString(C0126R.string.fm_member_delete_error_message, deleteMemberChimeraActivity3.f31406e), 0).show();
            } else {
                Toast.makeText(deleteMemberChimeraActivity3, (int) C0126R.string.fm_leave_family_error_message, 0).show();
            }
        }
        this.f51030a.getSupportLoaderManager().destroyLoader(0);
    }

    public final void onLoaderReset(Loader loader) {
    }
}
