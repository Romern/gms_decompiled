package p000;

import android.accounts.Account;
import com.google.android.gms.backup.settings.p033ui.BackupAndResetFragment;

/* renamed from: mvl */
public final /* synthetic */ class mvl implements mvs {

    /* renamed from: a */
    private final BackupAndResetFragment f34809a;

    public mvl(BackupAndResetFragment backupAndResetFragment) {
        this.f34809a = backupAndResetFragment;
    }

    /* renamed from: a */
    public final void mo20273a(Account account) {
        BackupAndResetFragment backupAndResetFragment = this.f34809a;
        mvu.m25676a(backupAndResetFragment.f29105c, account != null ? backupAndResetFragment.mo20277b(account.name) : null);
    }
}
