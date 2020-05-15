package p000;

import android.content.DialogInterface;
import com.google.android.gms.drive.deprecation.UpgradeDialogChimeraActivity;

/* renamed from: uoq */
public final /* synthetic */ class uoq implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final UpgradeDialogChimeraActivity f48425a;

    public uoq(UpgradeDialogChimeraActivity upgradeDialogChimeraActivity) {
        this.f48425a = upgradeDialogChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        UpgradeDialogChimeraActivity upgradeDialogChimeraActivity = this.f48425a;
        upgradeDialogChimeraActivity.setResult(0);
        upgradeDialogChimeraActivity.finish();
    }
}
