package p000;

import com.google.android.gms.backup.settings.p033ui.DriveBackupSettingsFragment;

/* renamed from: mwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mwz implements bqfp {

    /* renamed from: a */
    final /* synthetic */ DriveBackupSettingsFragment f34875a;

    public mwz(DriveBackupSettingsFragment driveBackupSettingsFragment) {
        this.f34875a = driveBackupSettingsFragment;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        stq.m36309a(new mwy(this, (Boolean) obj));
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        DriveBackupSettingsFragment.f29137f.mo25417e("Error in shouldSyncSecondaryKeyCallback", th, new Object[0]);
    }
}
