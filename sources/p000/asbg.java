package p000;

import android.content.Context;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.dataservice.UpdateCredentialsRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.smartdevice.setup.p066ui.views.AccountChallengeWebView;
import java.util.UUID;

/* renamed from: asbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asbg implements sdp {

    /* renamed from: a */
    final /* synthetic */ Context f88649a;

    /* renamed from: b */
    final /* synthetic */ String f88650b;

    /* renamed from: c */
    final /* synthetic */ String f88651c;

    public asbg(Context context, String str, String str2) {
        this.f88649a = context;
        this.f88650b = str;
        this.f88651c = str2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo17022a(Object obj) {
        TokenResponse tokenResponse;
        Integer num = (Integer) obj;
        Context context = this.f88649a;
        String str = this.f88650b;
        String str2 = this.f88651c;
        sdo.m34959a(context);
        sdo.m34959a((Object) str);
        sdo.m34977c(str2);
        if (!arpt.m73276a(context, "com.google").contains(str)) {
            sdo.m34959a(context);
            sdo.m34959a((Object) str);
            sdo.m34977c(str2);
            ixl ixl = new ixl(context);
            Context applicationContext = context.getApplicationContext();
            String uuid = UUID.randomUUID().toString();
            AccountSignInRequest accountSignInRequest = new AccountSignInRequest();
            AccountCredentials accountCredentials = new AccountCredentials("com.google");
            accountCredentials.f10829c = str;
            accountCredentials.f10831e = str2;
            accountSignInRequest.f10596f = accountCredentials;
            accountSignInRequest.f10592b = new AppDescription(applicationContext.getPackageName(), applicationContext.getApplicationInfo().uid, uuid, uuid);
            tokenResponse = ixl.mo13418a(accountSignInRequest);
        } else {
            sdo.m34959a(context);
            sdo.m34959a((Object) str);
            sdo.m34977c(str2);
            ixl ixl2 = new ixl(context);
            UpdateCredentialsRequest updateCredentialsRequest = new UpdateCredentialsRequest();
            AccountCredentials accountCredentials2 = new AccountCredentials("com.google");
            accountCredentials2.f10829c = str;
            accountCredentials2.f10831e = str2;
            updateCredentialsRequest.f10751b = accountCredentials2;
            tokenResponse = ixl2.mo13420a(updateCredentialsRequest);
        }
        if (tokenResponse == null) {
            AccountChallengeWebView.f108239a.mo25418e("TokenResponse was null", new Object[0]);
            return true;
        }
        izj b = tokenResponse.mo7647b();
        if (b == izj.SUCCESS) {
            AccountChallengeWebView.f108239a.mo25409a("Successfully updated account", new Object[0]);
            return false;
        }
        AccountChallengeWebView.f108239a.mo25418e("Failed adding account %s", b.f22000ac);
        if (izj.m16368b(b)) {
            return true;
        }
        AccountChallengeWebView.f108239a.mo25418e("Unrecoverable error", new Object[0]);
        return false;
    }
}
