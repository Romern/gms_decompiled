package p000;

import android.content.DialogInterface;
import com.google.android.gms.drive.deprecation.UpgradeDialogChimeraActivity;

/* renamed from: uop */
public final /* synthetic */ class uop implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final UpgradeDialogChimeraActivity f48423a;

    /* renamed from: b */
    private final String f48424b;

    public uop(UpgradeDialogChimeraActivity upgradeDialogChimeraActivity, String str) {
        this.f48423a = upgradeDialogChimeraActivity;
        this.f48424b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        UpgradeDialogChimeraActivity upgradeDialogChimeraActivity = this.f48423a;
        upgradeDialogChimeraActivity.startActivity(sbv.m34879b(this.f48424b));
        upgradeDialogChimeraActivity.setResult(0);
        upgradeDialogChimeraActivity.finish();
    }
}
