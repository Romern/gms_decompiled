package p000;

import android.accounts.Account;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.dataservice.ConfirmCredentialsRequest;
import com.google.android.gms.auth.firstparty.dataservice.GoogleAccountData;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.dataservice.UpdateCredentialsRequest;

/* renamed from: iws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface iws {
    /* renamed from: a */
    GoogleAccountData mo13417a(Account account);

    /* renamed from: a */
    TokenResponse mo13418a(AccountSignInRequest accountSignInRequest);

    /* renamed from: a */
    TokenResponse mo13419a(ConfirmCredentialsRequest confirmCredentialsRequest);

    /* renamed from: a */
    TokenResponse mo13420a(UpdateCredentialsRequest updateCredentialsRequest);
}
