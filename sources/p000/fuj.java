package p000;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.appinvite.AppInviteChimeraActivity;

/* renamed from: fuj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fuj implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ AppInviteChimeraActivity f17268a;

    public fuj(AppInviteChimeraActivity appInviteChimeraActivity) {
        this.f17268a = appInviteChimeraActivity;
    }

    public void onClick(View view) {
        AppInviteChimeraActivity appInviteChimeraActivity = this.f17268a;
        if (appInviteChimeraActivity.f9728j != null) {
            FragmentManager supportFragmentManager = appInviteChimeraActivity.getSupportFragmentManager();
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            this.f17268a.f9727i = (fwy) supportFragmentManager.findFragmentByTag("imagePreviewFragment");
            AppInviteChimeraActivity appInviteChimeraActivity2 = this.f17268a;
            if (appInviteChimeraActivity2.f9727i == null) {
                Bitmap bitmap = appInviteChimeraActivity2.f9728j;
                fwy fwy = new fwy();
                Bundle bundle = new Bundle();
                bundle.putParcelable("image", bitmap);
                fwy.setArguments(bundle);
                appInviteChimeraActivity2.f9727i = fwy;
                AppInviteChimeraActivity appInviteChimeraActivity3 = this.f17268a;
                appInviteChimeraActivity3.f9727i.f17490a = appInviteChimeraActivity3.f9729k;
            }
            beginTransaction.add(this.f17268a.f9727i, "imagePreviewFragment");
            beginTransaction.commitAllowingStateLoss();
        }
    }
}
