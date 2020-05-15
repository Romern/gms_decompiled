package p000;

import android.content.SharedPreferences;
import com.google.android.gms.backup.settings.p033ui.DriveBackupSettingsFragment;

/* renamed from: mwh */
public final /* synthetic */ class mwh implements Runnable {

    /* renamed from: a */
    private final DriveBackupSettingsFragment f34844a;

    /* renamed from: b */
    private final boolean f34845b;

    public mwh(DriveBackupSettingsFragment driveBackupSettingsFragment, boolean z) {
        this.f34844a = driveBackupSettingsFragment;
        this.f34845b = z;
    }

    public final void run() {
        DriveBackupSettingsFragment driveBackupSettingsFragment = this.f34844a;
        boolean z = this.f34845b;
        SharedPreferences.Editor edit = new rtj(driveBackupSettingsFragment.getContext().getApplicationContext(), "BackupDeviceState", true).edit();
        edit.putInt("backupService", z ? 1 : 0);
        edit.apply();
    }
}
