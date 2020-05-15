package p000;

import android.accounts.Account;
import com.google.android.gms.auth.proximity.multidevice.SettingsChimeraActivity;
import java.util.concurrent.Callable;

/* renamed from: jte */
public final /* synthetic */ class jte implements Callable {

    /* renamed from: a */
    private final SettingsChimeraActivity f23171a;

    /* renamed from: b */
    private final Account f23172b;

    public jte(SettingsChimeraActivity settingsChimeraActivity, Account account) {
        this.f23171a = settingsChimeraActivity;
        this.f23172b = account;
    }

    public final Object call() {
        SettingsChimeraActivity settingsChimeraActivity = this.f23171a;
        Account account = this.f23172b;
        boolean z = false;
        if (account != null && settingsChimeraActivity.f11255e.mo13851a(account, bsni.BETTER_TOGETHER_HOST)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
