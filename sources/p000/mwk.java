package p000;

import android.accounts.Account;
import com.google.android.gms.backup.settings.p033ui.DriveBackupSettingsFragment;

/* renamed from: mwk */
public final /* synthetic */ class mwk implements mvs {

    /* renamed from: a */
    private final DriveBackupSettingsFragment f34848a;

    /* renamed from: b */
    private final mvs f34849b;

    public mwk(DriveBackupSettingsFragment driveBackupSettingsFragment, mvs mvs) {
        this.f34848a = driveBackupSettingsFragment;
        this.f34849b = mvs;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.backup.settings.ui.DriveBackupSettingsFragment.a(boolean, boolean):bngx
     arg types: [int, int]
     candidates:
      mvu.a(androidx.preference.Preference, java.lang.String):void
      com.google.android.gms.backup.settings.ui.DriveBackupSettingsFragment.a(boolean, boolean):bngx */
    /* renamed from: a */
    public final void mo20273a(Account account) {
        DriveBackupSettingsFragment driveBackupSettingsFragment = this.f34848a;
        mvs mvs = this.f34849b;
        driveBackupSettingsFragment.f29181x = account;
        mvu.m25676a(driveBackupSettingsFragment.f29171n, account != null ? driveBackupSettingsFragment.mo20277b(account.name) : null);
        driveBackupSettingsFragment.mo17258a(account);
        driveBackupSettingsFragment.f29171n.f1604t = driveBackupSettingsFragment.mo17268k();
        if (account != null) {
            if (ccli.f179330a.mo6606a().mo76267A()) {
                ((mvu) driveBackupSettingsFragment).f34824i.mo20307a(new mww(driveBackupSettingsFragment));
            }
            driveBackupSettingsFragment.mo17259a(driveBackupSettingsFragment.mo17257a(true, true));
            lsi a = lsh.m24339a(driveBackupSettingsFragment.getActivity());
            roz b = rpa.m34196b();
            b.f43472a = lup.f33006a;
            ((rjx) a).mo24732b(b.mo24977a()).mo50374a(driveBackupSettingsFragment.getActivity(), new mxc(driveBackupSettingsFragment));
        }
        if (mvs != null) {
            mvs.mo20273a(account);
        }
    }
}
