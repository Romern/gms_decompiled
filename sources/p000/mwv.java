package p000;

import com.google.android.gms.backup.settings.p033ui.DriveBackupSettingsFragment;

/* renamed from: mwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mwv implements bqfp {

    /* renamed from: a */
    final /* synthetic */ DriveBackupSettingsFragment f34863a;

    public mwv(DriveBackupSettingsFragment driveBackupSettingsFragment) {
        this.f34863a = driveBackupSettingsFragment;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        stq.m36309a(new mwu(this, (Boolean) obj));
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        DriveBackupSettingsFragment.f29137f.mo25417e("Error getting isUnlockRequiredForEncryptedBackupCallback", th, new Object[0]);
    }
}
