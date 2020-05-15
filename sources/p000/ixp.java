package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
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

/* renamed from: ixp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ixp extends dcj implements ixr {
    public ixp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService");
    }

    /* renamed from: a */
    public final Bundle mo13436a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        Parcel a = mo8526a(16, bj);
        Bundle bundle = (Bundle) dcl.m8163a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: b */
    public final DeviceManagementInfoResponse mo13446b(Account account) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, account);
        Parcel a = mo8526a(40, bj);
        DeviceManagementInfoResponse deviceManagementInfoResponse = (DeviceManagementInfoResponse) dcl.m8163a(a, DeviceManagementInfoResponse.CREATOR);
        a.recycle();
        return deviceManagementInfoResponse;
    }

    /* renamed from: c */
    public final String mo13448c(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        Parcel a = mo8526a(38, bj);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: d */
    public final void mo13450d() {
        mo8528b(44, mo8529bj());
    }

    /* renamed from: a */
    public final CheckFactoryResetPolicyComplianceResponse mo13437a(CheckFactoryResetPolicyComplianceRequest checkFactoryResetPolicyComplianceRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, checkFactoryResetPolicyComplianceRequest);
        Parcel a = mo8526a(27, bj);
        CheckFactoryResetPolicyComplianceResponse checkFactoryResetPolicyComplianceResponse = (CheckFactoryResetPolicyComplianceResponse) dcl.m8163a(a, CheckFactoryResetPolicyComplianceResponse.CREATOR);
        a.recycle();
        return checkFactoryResetPolicyComplianceResponse;
    }

    /* renamed from: b */
    public final GetAndAdvanceOtpCounterResponse mo13447b(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        Parcel a = mo8526a(37, bj);
        GetAndAdvanceOtpCounterResponse getAndAdvanceOtpCounterResponse = (GetAndAdvanceOtpCounterResponse) dcl.m8163a(a, GetAndAdvanceOtpCounterResponse.CREATOR);
        a.recycle();
        return getAndAdvanceOtpCounterResponse;
    }

    /* renamed from: c */
    public final void mo13449c() {
        mo8528b(43, mo8529bj());
    }

    /* renamed from: d */
    public final boolean mo13451d(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        Parcel a = mo8526a(39, bj);
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final GoogleAccountData mo13438a(Account account) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, account);
        Parcel a = mo8526a(30, bj);
        GoogleAccountData googleAccountData = (GoogleAccountData) dcl.m8163a(a, GoogleAccountData.CREATOR);
        a.recycle();
        return googleAccountData;
    }

    /* renamed from: a */
    public final TokenResponse mo13439a(AccountSignInRequest accountSignInRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, accountSignInRequest);
        Parcel a = mo8526a(9, bj);
        TokenResponse tokenResponse = (TokenResponse) dcl.m8163a(a, TokenResponse.CREATOR);
        a.recycle();
        return tokenResponse;
    }

    /* renamed from: a */
    public final TokenResponse mo13440a(ConfirmCredentialsRequest confirmCredentialsRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, confirmCredentialsRequest);
        Parcel a = mo8526a(10, bj);
        TokenResponse tokenResponse = (TokenResponse) dcl.m8163a(a, TokenResponse.CREATOR);
        a.recycle();
        return tokenResponse;
    }

    /* renamed from: a */
    public final TokenResponse mo13441a(TokenRequest tokenRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, tokenRequest);
        Parcel a = mo8526a(8, bj);
        TokenResponse tokenResponse = (TokenResponse) dcl.m8163a(a, TokenResponse.CREATOR);
        a.recycle();
        return tokenResponse;
    }

    /* renamed from: a */
    public final TokenResponse mo13442a(UpdateCredentialsRequest updateCredentialsRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, updateCredentialsRequest);
        Parcel a = mo8526a(11, bj);
        TokenResponse tokenResponse = (TokenResponse) dcl.m8163a(a, TokenResponse.CREATOR);
        a.recycle();
        return tokenResponse;
    }

    /* renamed from: a */
    public final ValidateAccountCredentialsResponse mo13443a(AccountCredentials accountCredentials) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, accountCredentials);
        Parcel a = mo8526a(36, bj);
        ValidateAccountCredentialsResponse validateAccountCredentialsResponse = (ValidateAccountCredentialsResponse) dcl.m8163a(a, ValidateAccountCredentialsResponse.CREATOR);
        a.recycle();
        return validateAccountCredentialsResponse;
    }

    /* renamed from: a */
    public final void mo13444a() {
        mo8528b(29, mo8529bj());
    }

    /* renamed from: a */
    public final boolean mo13445a(String str, Bundle bundle) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        dcl.m8165a(bj, bundle);
        Parcel a = mo8526a(17, bj);
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }
}
