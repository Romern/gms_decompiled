package p000;

import android.accounts.Account;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.proximity.multidevice.SettingsChimeraActivity;
import java.util.List;

/* renamed from: jtj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jtj implements bqfp {

    /* renamed from: a */
    final /* synthetic */ Account f23179a;

    /* renamed from: b */
    final /* synthetic */ SettingsChimeraActivity f23180b;

    public jtj(SettingsChimeraActivity settingsChimeraActivity, Account account) {
        this.f23180b = settingsChimeraActivity;
        this.f23179a = account;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        String str;
        List list = (List) obj;
        if (!this.f23180b.isDestroyed()) {
            boolean booleanValue = ((Boolean) list.get(0)).booleanValue();
            String str2 = (String) list.get(1);
            jtn jtn = new jtn();
            Bundle bundle = new Bundle();
            Account account = this.f23179a;
            if (account != null) {
                str = account.name;
            } else {
                str = null;
            }
            bundle.putString("SELECTED_ACCOUNT", str);
            bundle.putBoolean("BETTER_TOGETHER_ENABLED", booleanValue);
            bundle.putString("DEVICE_NAME", str2);
            jtn.setArguments(bundle);
            this.f23180b.getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.fragment_container, jtn).commitAllowingStateLoss();
            Account account2 = this.f23179a;
            if (account2 != null) {
                this.f23180b.runOnUiThread(new jti(this, account2));
            }
            this.f23180b.f11253c = null;
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        SettingsChimeraActivity.f11252b.mo25417e("Could not determine enabled status of Better Together.", th, new Object[0]);
        jsw.m17254a().mo14033a(th);
        this.f23180b.f11253c = null;
    }
}
