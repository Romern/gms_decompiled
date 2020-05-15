package p000;

import android.accounts.Account;
import android.os.RemoteException;
import com.google.android.gms.auth.proximity.multidevice.SettingsChimeraActivity;
import java.util.concurrent.Callable;

/* renamed from: jtg */
public final /* synthetic */ class jtg implements Callable {

    /* renamed from: a */
    private final SettingsChimeraActivity f23175a;

    public jtg(SettingsChimeraActivity settingsChimeraActivity) {
        this.f23175a = settingsChimeraActivity;
    }

    public final Object call() {
        SettingsChimeraActivity settingsChimeraActivity = this.f23175a;
        Account[] accountArr = new Account[0];
        try {
            accountArr = gie.m13199d(settingsChimeraActivity, "com.google");
        } catch (RemoteException | rfv | rfw e) {
            SettingsChimeraActivity.f11252b.mo25417e("Can't get Google accounts.", e, new Object[0]);
            jsw.m17254a().mo14033a(e);
        }
        int length = accountArr.length;
        Account account = null;
        if (length > 0) {
            for (Account account2 : accountArr) {
                if (account == null && settingsChimeraActivity.f11255e.mo13851a(account2, bsni.BETTER_TOGETHER_HOST)) {
                    account = account2;
                }
            }
        }
        return account;
    }
}
