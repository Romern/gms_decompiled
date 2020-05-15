package p000;

import android.accounts.Account;
import com.google.android.gms.auth.proximity.multidevice.SettingsChimeraActivity;
import com.google.android.gms.auth.proximity.multidevice.SettingsChimeraContentProvider;
import java.util.concurrent.Callable;

/* renamed from: jtf */
public final /* synthetic */ class jtf implements Callable {

    /* renamed from: a */
    private final SettingsChimeraActivity f23173a;

    /* renamed from: b */
    private final Account f23174b;

    public jtf(SettingsChimeraActivity settingsChimeraActivity, Account account) {
        this.f23173a = settingsChimeraActivity;
        this.f23174b = account;
    }

    public final Object call() {
        SettingsChimeraActivity settingsChimeraActivity = this.f23173a;
        Account account = this.f23174b;
        if (account != null) {
            return SettingsChimeraContentProvider.m6884a(settingsChimeraActivity, account.name);
        }
        return null;
    }
}
