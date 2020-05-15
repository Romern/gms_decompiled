package p000;

import android.os.Build;
import android.widget.ProgressBar;
import com.google.android.gms.backup.settings.p033ui.DriveBackupSettingsFragment;

/* renamed from: mxb */
public final /* synthetic */ class mxb implements Runnable {

    /* renamed from: a */
    private final DriveBackupSettingsFragment f34878a;

    /* renamed from: b */
    private final int f34879b;

    /* renamed from: c */
    private final int f34880c;

    public mxb(DriveBackupSettingsFragment driveBackupSettingsFragment, int i, int i2) {
        this.f34878a = driveBackupSettingsFragment;
        this.f34879b = i;
        this.f34880c = i2;
    }

    public final void run() {
        ProgressBar progressBar;
        DriveBackupSettingsFragment driveBackupSettingsFragment = this.f34878a;
        int i = this.f34879b;
        int i2 = this.f34880c;
        if (driveBackupSettingsFragment != null && driveBackupSettingsFragment.isResumed() && (progressBar = driveBackupSettingsFragment.f29166g) != null && driveBackupSettingsFragment.f29167j != null) {
            progressBar.setVisibility(4);
            driveBackupSettingsFragment.f29167j.setVisibility(0);
            driveBackupSettingsFragment.f29167j.setMax(i);
            int i3 = Build.VERSION.SDK_INT;
            driveBackupSettingsFragment.f29167j.setProgress(i2, true);
        }
    }
}
