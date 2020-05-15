package p000;

import android.view.View;
import com.google.android.gms.locationsharing.common.model.ShareTarget;
import com.google.android.gms.locationsharing.updateshares.UpdateSharesChimeraActivity;

/* renamed from: aeww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeww implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ UpdateSharesChimeraActivity f63962a;

    public aeww(UpdateSharesChimeraActivity updateSharesChimeraActivity) {
        this.f63962a = updateSharesChimeraActivity;
    }

    public void onClick(View view) {
        UpdateSharesChimeraActivity updateSharesChimeraActivity = this.f63962a;
        ShareTarget shareTarget = updateSharesChimeraActivity.f79751b.f79627a;
        updateSharesChimeraActivity.f79755f.mo34550a(6, updateSharesChimeraActivity.mo43824b());
        updateSharesChimeraActivity.f79763n = new aewn(updateSharesChimeraActivity, shareTarget);
        if (updateSharesChimeraActivity.mo43829d()) {
            updateSharesChimeraActivity.f79763n.run();
            updateSharesChimeraActivity.f79763n = null;
        }
    }
}
