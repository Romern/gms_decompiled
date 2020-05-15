package p000;

import android.accounts.Account;
import android.os.AsyncTask;
import com.google.android.gms.auth.uiflows.settings.AccountSettingsChimeraActivity;
import java.io.IOException;

/* renamed from: kal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kal extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ Account f23658a;

    /* renamed from: b */
    final /* synthetic */ AccountSettingsChimeraActivity f23659b;

    public kal(AccountSettingsChimeraActivity accountSettingsChimeraActivity, Account account) {
        this.f23659b = accountSettingsChimeraActivity;
        this.f23658a = account;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        AccountSettingsChimeraActivity accountSettingsChimeraActivity = this.f23659b;
        sek sek = AccountSettingsChimeraActivity.f11573b;
        try {
            giu.m13225a(accountSettingsChimeraActivity).mo11918a(this.f23658a, accountSettingsChimeraActivity.f11576e);
            return true;
        } catch (git e) {
            sek sek2 = AccountSettingsChimeraActivity.f11573b;
            String valueOf = String.valueOf(e.f18313a);
            sek2.mo25414c(valueOf.length() == 0 ? new String("Found recovery URL: ") : "Found recovery URL: ".concat(valueOf), new Object[0]);
            return false;
        } catch (IOException e2) {
            AccountSettingsChimeraActivity.f11573b.mo25410a((Throwable) e2);
            return false;
        } catch (gid e3) {
            AccountSettingsChimeraActivity.f11573b.mo25410a((Throwable) e3);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            AccountSettingsChimeraActivity accountSettingsChimeraActivity = this.f23659b;
            sek sek = AccountSettingsChimeraActivity.f11573b;
            accountSettingsChimeraActivity.f11577f.mo14197a(accountSettingsChimeraActivity.f11576e);
        }
    }
}
