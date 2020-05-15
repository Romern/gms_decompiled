package p000;

import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import java.util.UUID;

/* renamed from: aczs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aczs {
    /* renamed from: a */
    public static Intent m50058a(Context context, TokenRequest tokenRequest) {
        Bundle b = tokenRequest.mo7640b();
        Intent data = new Intent().setClassName(context, "com.google.android.gms.signin.activity.ConsentActivity").setPackage("com.google.android.gms").putExtra("suppress_loading_ui", b.getBoolean("suppressProgressScreen", false)).setData(Uri.parse(String.format("intent://%s/%s", "com.google.android.gms.signin.activity.ConsentActivity", UUID.randomUUID())));
        if (b.containsKey("accountManagerResponse")) {
            data.putExtra("account_authenticator_response", (AccountAuthenticatorResponse) b.getParcelable("accountManagerResponse"));
            b.remove("accountManagerResponse");
        }
        tokenRequest.mo7638a(b);
        sef.m35071a(tokenRequest, data, "token_request");
        return data;
    }
}
