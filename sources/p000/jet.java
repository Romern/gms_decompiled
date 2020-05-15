package p000;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.login.LoginChimeraActivity;

/* renamed from: jet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jet extends jfh {

    /* renamed from: a */
    final /* synthetic */ LoginChimeraActivity f22303a;

    /* renamed from: b */
    private final int f22304b = 1002;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jet(LoginChimeraActivity loginChimeraActivity, TokenRequest tokenRequest, String str, String str2, boolean z, boolean z2) {
        super(loginChimeraActivity, tokenRequest, str, str2, false, z, z2);
        this.f22303a = loginChimeraActivity;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onCancelled(Object obj) {
        Bundle bundle = (Bundle) obj;
        this.f22303a.f11021p = null;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bundle bundle = (Bundle) obj;
        super.onPostExecute(bundle);
        TokenResponse tokenResponse = (TokenResponse) bundle.getParcelable("token_response");
        tokenResponse.mo7647b();
        Intent intent = new Intent();
        intent.putExtra("token_response", tokenResponse);
        this.f22303a.onActivityResult(this.f22304b, -1, intent);
        this.f22303a.f11021p = null;
    }
}
