package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceRequest;
import com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceResponse;
import com.google.android.gms.auth.firstparty.dataservice.ConfirmCredentialsRequest;
import com.google.android.gms.auth.firstparty.dataservice.DeviceManagementInfoResponse;
import com.google.android.gms.auth.firstparty.dataservice.GetAndAdvanceOtpCounterResponse;
import com.google.android.gms.auth.firstparty.dataservice.GoogleAccountData;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.dataservice.UpdateCredentialsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ValidateAccountCredentialsResponse;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;

/* renamed from: ixr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface ixr extends IInterface {
    /* renamed from: a */
    Bundle mo13436a(String str);

    /* renamed from: a */
    CheckFactoryResetPolicyComplianceResponse mo13437a(CheckFactoryResetPolicyComplianceRequest checkFactoryResetPolicyComplianceRequest);

    /* renamed from: a */
    GoogleAccountData mo13438a(Account account);

    /* renamed from: a */
    TokenResponse mo13439a(AccountSignInRequest accountSignInRequest);

    /* renamed from: a */
    TokenResponse mo13440a(ConfirmCredentialsRequest confirmCredentialsRequest);

    /* renamed from: a */
    TokenResponse mo13441a(TokenRequest tokenRequest);

    /* renamed from: a */
    TokenResponse mo13442a(UpdateCredentialsRequest updateCredentialsRequest);

    /* renamed from: a */
    ValidateAccountCredentialsResponse mo13443a(AccountCredentials accountCredentials);

    /* renamed from: a */
    void mo13444a();

    /* renamed from: a */
    boolean mo13445a(String str, Bundle bundle);

    /* renamed from: b */
    DeviceManagementInfoResponse mo13446b(Account account);

    /* renamed from: b */
    GetAndAdvanceOtpCounterResponse mo13447b(String str);

    /* renamed from: c */
    String mo13448c(String str);

    /* renamed from: c */
    void mo13449c();

    /* renamed from: d */
    void mo13450d();

    /* renamed from: d */
    boolean mo13451d(String str);
}
