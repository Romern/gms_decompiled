package p000;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import com.google.android.gms.backup.base.SetBackupAccountChimeraActivity;

/* renamed from: lvf */
public final /* synthetic */ class lvf implements AccountManagerCallback {

    /* renamed from: a */
    private final SetBackupAccountChimeraActivity f33032a;

    public lvf(SetBackupAccountChimeraActivity setBackupAccountChimeraActivity) {
        this.f33032a = setBackupAccountChimeraActivity;
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        this.f33032a.mo17219a(accountManagerFuture);
    }
}
