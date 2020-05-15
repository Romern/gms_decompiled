package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.dataservice.UpdateCredentialsRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.uiflows.common.UpdateCredentialsChimeraActivity;
import java.util.UUID;

/* renamed from: jxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jxk extends jxi {

    /* renamed from: a */
    private final Account f23448a;

    /* renamed from: b */
    private final String f23449b;

    /* renamed from: c */
    private final boolean f23450c;

    /* renamed from: d */
    private final ixl f23451d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jxk(Context context, Account account, String str, boolean z) {
        super(context);
        ixl ixl = new ixl(context);
        sdo.m34959a(account);
        this.f23448a = account;
        sdo.m34959a((Object) str);
        this.f23449b = str;
        this.f23450c = z;
        sdo.m34959a(ixl);
        this.f23451d = ixl;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        TokenData tokenData;
        AccountCredentials accountCredentials = new AccountCredentials(this.f23448a);
        accountCredentials.f10831e = this.f23449b;
        UpdateCredentialsRequest updateCredentialsRequest = new UpdateCredentialsRequest();
        updateCredentialsRequest.f10751b = accountCredentials;
        TokenResponse a = this.f23451d.mo13420a(updateCredentialsRequest);
        String str = null;
        if (this.f23450c) {
            ilq ilq = new ilq(getContext());
            String uuid = UUID.randomUUID().toString();
            ixl ixl = this.f23451d;
            TokenRequest tokenRequest = new TokenRequest(this.f23448a, gnv.m13529ab());
            tokenRequest.f10714j = new AppDescription(ilq.packageName, ilq.appUid, uuid, uuid);
            TokenResponse a2 = ixl.mo13425a(tokenRequest);
            if (!(a2 == null || a2.mo7647b() != izj.SUCCESS || (tokenData = a2.f10746w) == null)) {
                str = this.f23451d.mo13427a(tokenData.f9944b);
            }
        }
        Bundle bundle = new Bundle();
        String str2 = UpdateCredentialsChimeraActivity.f11466b.f21366a;
        boolean z = false;
        if (a != null && a.mo7647b() == izj.SUCCESS) {
            z = true;
        }
        bundle.putBoolean(str2, z);
        bundle.putString(UpdateCredentialsChimeraActivity.f11465a.f21366a, str);
        return bundle;
    }
}
