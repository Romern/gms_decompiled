package p000;

import android.view.View;
import com.google.android.gms.plus.apps.ManageDeviceChimeraActivity;

/* renamed from: annp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class annp implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ManageDeviceChimeraActivity f77216a;

    public annp(ManageDeviceChimeraActivity manageDeviceChimeraActivity) {
        this.f77216a = manageDeviceChimeraActivity;
    }

    public void onClick(View view) {
        ManageDeviceChimeraActivity manageDeviceChimeraActivity = this.f77216a;
        manageDeviceChimeraActivity.f82255b.show(manageDeviceChimeraActivity.getSupportFragmentManager(), annd.class.getSimpleName());
    }
}
