package p000;

import android.accounts.Account;
import com.google.android.gms.backup.settings.p033ui.DriveBackupSettingsFragment;

/* renamed from: mwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mwo implements mvs {

    /* renamed from: a */
    final /* synthetic */ DriveBackupSettingsFragment f34855a;

    public mwo(DriveBackupSettingsFragment driveBackupSettingsFragment) {
        this.f34855a = driveBackupSettingsFragment;
    }

    /* renamed from: a */
    public final void mo20273a(Account account) {
        DriveBackupSettingsFragment driveBackupSettingsFragment = this.f34855a;
        mya mya = ((mvu) driveBackupSettingsFragment).f34824i;
        mya.mo20307a(new mxy(driveBackupSettingsFragment.f29179v, account, mya));
    }
}
