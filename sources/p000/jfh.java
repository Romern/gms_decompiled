package p000;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.dataservice.ConfirmCredentialsRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.dataservice.UpdateCredentialsRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;

/* renamed from: jfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class jfh extends AsyncTask {

    /* renamed from: a */
    private static final String f22366a;

    /* renamed from: b */
    private final TokenRequest f22367b;

    /* renamed from: c */
    private final String f22368c;

    /* renamed from: d */
    private final String f22369d;

    /* renamed from: e */
    private final ixl f22370e;

    /* renamed from: f */
    private final boolean f22371f;

    /* renamed from: g */
    private final boolean f22372g;

    /* renamed from: h */
    private final boolean f22373h;

    static {
        String simpleName = jfh.class.getSimpleName();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2);
        sb.append("[");
        sb.append(simpleName);
        sb.append("]");
        f22366a = sb.toString();
    }

    public jfh(Context context, TokenRequest tokenRequest, String str, String str2, boolean z, boolean z2, boolean z3) {
        sdo.checkIfNull(tokenRequest, String.valueOf(f22366a).concat(" <init> tokenRequest cannot be null"));
        this.f22367b = tokenRequest;
        this.f22369d = str;
        this.f22368c = str2;
        this.f22370e = new ixl(context);
        this.f22371f = z;
        this.f22372g = z2;
        this.f22373h = z3;
    }

    /* renamed from: a */
    public static TokenResponse m16644a(Intent intent) {
        return (TokenResponse) intent.getParcelableExtra("token_response");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bundle doInBackground(Object... objArr) {
        TokenResponse tokenResponse;
        sdo.m34959a(this.f22367b.f10714j);
        Bundle bundle = new Bundle();
        if (this.f22368c == null && this.f22369d == null) {
            tokenResponse = null;
        } else {
            AccountCredentials accountCredentials = this.f22367b.mo7637a() == null ? new AccountCredentials(this.f22367b.f10718n) : new AccountCredentials(this.f22367b.mo7637a());
            accountCredentials.f10831e = this.f22368c;
            accountCredentials.f10828b = this.f22372g;
            accountCredentials.f10832f = this.f22369d;
            if (this.f22367b.f10711g) {
                AccountSignInRequest accountSignInRequest = new AccountSignInRequest();
                TokenRequest tokenRequest = this.f22367b;
                accountSignInRequest.f10592b = tokenRequest.f10714j;
                accountSignInRequest.f10596f = accountCredentials;
                accountSignInRequest.f10595e = tokenRequest.f10715k;
                accountSignInRequest.f10594d = this.f22371f;
                tokenResponse = this.f22370e.mo13418a(accountSignInRequest);
            } else if (this.f22373h) {
                ixl ixl = this.f22370e;
                ConfirmCredentialsRequest confirmCredentialsRequest = new ConfirmCredentialsRequest();
                confirmCredentialsRequest.f10613b = accountCredentials;
                confirmCredentialsRequest.f10614c = this.f22367b.f10715k;
                tokenResponse = ixl.mo13419a(confirmCredentialsRequest);
            } else {
                ixl ixl2 = this.f22370e;
                UpdateCredentialsRequest updateCredentialsRequest = new UpdateCredentialsRequest();
                updateCredentialsRequest.f10751b = accountCredentials;
                updateCredentialsRequest.f10752c = this.f22367b.f10715k;
                tokenResponse = ixl2.mo13420a(updateCredentialsRequest);
            }
            this.f22367b.f10715k = null;
            if (tokenResponse.mo7643a() != null) {
                this.f22367b.f10707c = tokenResponse.mo7643a();
            }
        }
        if ((tokenResponse == null || ilu.f21314a.f21316c == tokenResponse.mo7647b()) && !this.f22373h) {
            TokenRequest tokenRequest2 = this.f22367b;
            if (tokenRequest2.f10706b == null) {
                tokenRequest2.f10706b = "ac2dm";
            }
            tokenResponse = this.f22370e.mo13425a(tokenRequest2);
            this.f22367b.f10715k = null;
        }
        bundle.putParcelable("token_response", tokenResponse);
        return bundle;
    }
}
