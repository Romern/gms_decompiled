package p000;

import com.google.android.gms.backup.settings.p033ui.DriveBackupSettingsFragment;
import java.lang.ref.WeakReference;

/* renamed from: mxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mxc implements aubq {

    /* renamed from: a */
    private final WeakReference f34881a;

    public mxc(DriveBackupSettingsFragment driveBackupSettingsFragment) {
        this.f34881a = new WeakReference(driveBackupSettingsFragment);
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        DriveBackupSettingsFragment driveBackupSettingsFragment = (DriveBackupSettingsFragment) this.f34881a.get();
        if (driveBackupSettingsFragment != null && driveBackupSettingsFragment.isResumed()) {
            driveBackupSettingsFragment.f29182y = ((Boolean) aucb.mo50386d()).booleanValue();
            DriveBackupSettingsFragment.f29137f.mo25409a("BackUpNow is in progress: %s", Boolean.valueOf(driveBackupSettingsFragment.f29182y));
            driveBackupSettingsFragment.mo17267j();
        }
    }
}
