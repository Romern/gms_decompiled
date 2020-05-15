package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.api.aidlresponses.OnFailedMfaSignInAidlResponse;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.GetTokenResponse;
import com.google.firebase.auth.api.model.ResetPasswordResponse;

/* renamed from: brpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class brpj {

    /* renamed from: b */
    public final sek f143128b;

    /* renamed from: c */
    public final brpp f143129c;

    public brpj(brpp brpp, sek sek) {
        sdo.m34959a(brpp);
        this.f143129c = brpp;
        sdo.m34959a(sek);
        this.f143128b = sek;
    }

    /* renamed from: a */
    public void mo69680a(Status status) {
        try {
            this.f143129c.mo69773a(status);
        } catch (RemoteException e) {
            this.f143128b.mo25417e("RemoteException when sending failure result.", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo69759a(PhoneAuthCredential phoneAuthCredential) {
        try {
            brpp brpp = this.f143129c;
            Parcel bj = brpp.mo8529bj();
            dcl.m8165a(bj, phoneAuthCredential);
            brpp.mo8530c(10, bj);
        } catch (RemoteException e) {
            this.f143128b.mo25417e("RemoteException when sending verification completed response.", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo69760a(OnFailedMfaSignInAidlResponse onFailedMfaSignInAidlResponse) {
        try {
            brpp brpp = this.f143129c;
            Parcel bj = brpp.mo8529bj();
            dcl.m8165a(bj, onFailedMfaSignInAidlResponse);
            brpp.mo8530c(15, bj);
        } catch (RemoteException e) {
            this.f143128b.mo25417e("RemoteException when sending failure result for mfa", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo69761a(GetTokenResponse getTokenResponse, GetAccountInfoUser getAccountInfoUser) {
        try {
            brpp brpp = this.f143129c;
            Parcel bj = brpp.mo8529bj();
            dcl.m8165a(bj, getTokenResponse);
            dcl.m8165a(bj, getAccountInfoUser);
            brpp.mo8530c(2, bj);
        } catch (RemoteException e) {
            this.f143128b.mo25417e("RemoteException when sending get token and account info user response", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo69762a(ResetPasswordResponse resetPasswordResponse) {
        try {
            brpp brpp = this.f143129c;
            Parcel bj = brpp.mo8529bj();
            dcl.m8165a(bj, resetPasswordResponse);
            brpp.mo8530c(4, bj);
        } catch (RemoteException e) {
            this.f143128b.mo25417e("RemoteException when sending password reset response.", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo69681a(String str) {
        try {
            brpp brpp = this.f143129c;
            Parcel bj = brpp.mo8529bj();
            bj.writeString(str);
            brpp.mo8530c(9, bj);
        } catch (RemoteException e) {
            this.f143128b.mo25417e("RemoteException when sending send verification code response.", e, new Object[0]);
        }
    }
}
