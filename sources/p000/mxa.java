package p000;

import com.google.android.gms.backup.settings.p033ui.DriveBackupSettingsFragment;

/* renamed from: mxa */
public final /* synthetic */ class mxa implements Runnable {

    /* renamed from: a */
    private final DriveBackupSettingsFragment f34876a;

    /* renamed from: b */
    private final int f34877b;

    public mxa(DriveBackupSettingsFragment driveBackupSettingsFragment, int i) {
        this.f34876a = driveBackupSettingsFragment;
        this.f34877b = i;
    }

    public final void run() {
        DriveBackupSettingsFragment driveBackupSettingsFragment = this.f34876a;
        int i = this.f34877b;
        if (driveBackupSettingsFragment != null && driveBackupSettingsFragment.isResumed()) {
            DriveBackupSettingsFragment.f29137f.mo25409a("BackUpNow has finished.", new Object[0]);
            driveBackupSettingsFragment.f29182y = false;
            driveBackupSettingsFragment.mo17267j();
            driveBackupSettingsFragment.mo17261b(i);
            driveBackupSettingsFragment.mo17258a(driveBackupSettingsFragment.f29181x);
            return;
        }
        DriveBackupSettingsFragment.f29137f.mo25409a("Fragment was null when BackUpNow operation has finished", new Object[0]);
    }
}
