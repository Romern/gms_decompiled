package p000;

import android.view.View;
import com.google.android.gms.backup.settings.p033ui.BackupNowPreference;

/* renamed from: mvm */
public final /* synthetic */ class mvm implements View.OnClickListener {

    /* renamed from: a */
    private final BackupNowPreference f34810a;

    public mvm(BackupNowPreference backupNowPreference) {
        this.f34810a = backupNowPreference;
    }

    public void onClick(View view) {
        BackupNowPreference backupNowPreference = this.f34810a;
        aoa aoa = backupNowPreference.f1600p;
        if (aoa != null) {
            aoa.mo2219a(backupNowPreference);
        }
    }
}
