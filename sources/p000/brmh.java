package p000;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.api.aidlrequests.ApplyActionCodeAidlRequest;
import com.google.firebase.auth.api.aidlrequests.ChangeEmailAidlRequest;
import com.google.firebase.auth.api.aidlrequests.ChangePasswordAidlRequest;
import com.google.firebase.auth.api.aidlrequests.CheckActionCodeAidlRequest;
import com.google.firebase.auth.api.aidlrequests.ConfirmPasswordResetAidlRequest;
import com.google.firebase.auth.api.aidlrequests.CreateUserWithEmailAndPasswordAidlRequest;
import com.google.firebase.auth.api.aidlrequests.DeleteAidlRequest;
import com.google.firebase.auth.api.aidlrequests.FinalizeMfaEnrollmentAidlRequest;
import com.google.firebase.auth.api.aidlrequests.FinalizeMfaSignInAidlRequest;
import com.google.firebase.auth.api.aidlrequests.GetAccessTokenAidlRequest;
import com.google.firebase.auth.api.aidlrequests.GetProvidersForEmailAidlRequest;
import com.google.firebase.auth.api.aidlrequests.LinkEmailAuthCredentialAidlRequest;
import com.google.firebase.auth.api.aidlrequests.LinkFederatedCredentialAidlRequest;
import com.google.firebase.auth.api.aidlrequests.LinkPhoneAuthCredentialAidlRequest;
import com.google.firebase.auth.api.aidlrequests.ReloadAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SendEmailVerificationWithSettingsAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SendGetOobConfirmationCodeEmailAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SendVerificationCodeAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SetFirebaseUiVersionAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SignInAnonymouslyAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SignInWithCredentialAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SignInWithCustomTokenAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SignInWithEmailAndPasswordAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SignInWithEmailLinkAidlRequest;
import com.google.firebase.auth.api.aidlrequests.SignInWithPhoneNumberAidlRequest;
import com.google.firebase.auth.api.aidlrequests.StartMfaPhoneNumberEnrollmentAidlRequest;
import com.google.firebase.auth.api.aidlrequests.StartMfaPhoneNumberSignInAidlRequest;
import com.google.firebase.auth.api.aidlrequests.UnenrollMfaAidlRequest;
import com.google.firebase.auth.api.aidlrequests.UnlinkEmailCredentialAidlRequest;
import com.google.firebase.auth.api.aidlrequests.UnlinkFederatedCredentialAidlRequest;
import com.google.firebase.auth.api.aidlrequests.UpdateProfileAidlRequest;
import com.google.firebase.auth.api.aidlrequests.VerifyBeforeUpdateEmailAidlRequest;
import com.google.firebase.auth.api.model.SendVerificationCodeRequest;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

/* renamed from: brmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brmh extends brpq implements sjr {

    /* renamed from: a */
    private final String f142961a;

    /* renamed from: b */
    private final String f142962b;

    /* renamed from: c */
    private final brps f142963c;

    /* renamed from: d */
    private final sjn f142964d;

    /* renamed from: e */
    private final Logger f142965e = new Logger("FirebaseAuth", new String[0]);

    public brmh(String str, String str2, brps brps, sjn sjn) {
        sdo.m34977c(str);
        this.f142961a = str;
        sdo.m34977c(str2);
        this.f142962b = str2;
        sdo.m34959a(brps);
        this.f142963c = brps;
        sdo.m34959a(sjn);
        this.f142964d = sjn;
    }

    /* renamed from: b */
    private final void m114165b(brpp brpp) {
        try {
            brpp.mo69773a(new Status(17080));
        } catch (RemoteException e) {
            this.f142965e.mo25417e("RemoteException when sending failure result.", e, new Object[0]);
        }
    }

    @Deprecated
    /* renamed from: c */
    public final void mo69734c(String str, brpp brpp) {
        if (cdxt.m135236b()) {
            mo69700a(new GetProvidersForEmailAidlRequest(str, null), brpp);
            return;
        }
        sdo.m34977c(str);
        this.f142964d.mo25649a(new brmu(this.f142961a, this.f142962b, this.f142963c, str, null, brpp));
    }

    /* renamed from: d */
    public final void mo69737d(String str, brpp brpp) {
        mo69725a(str, (ActionCodeSettings) null, brpp);
    }

    @Deprecated
    /* renamed from: e */
    public final void mo69739e(String str, brpp brpp) {
        if (cdxt.m135236b()) {
            mo69693a(new CheckActionCodeAidlRequest(str, null), brpp);
            return;
        }
        sdo.m34977c(str);
        this.f142964d.mo25649a(new brmn(this.f142961a, this.f142962b, this.f142963c, str, null, brpp));
    }

    @Deprecated
    /* renamed from: f */
    public final void mo69741f(String str, brpp brpp) {
        if (cdxt.m135236b()) {
            mo69690a(new ApplyActionCodeAidlRequest(str, null), brpp);
            return;
        }
        sdo.m34977c(str);
        this.f142964d.mo25649a(new brmk(this.f142961a, this.f142962b, this.f142963c, str, null, brpp));
    }

    @Deprecated
    /* renamed from: g */
    public final void mo69743g(String str, brpp brpp) {
        if (cdxt.m135236b()) {
            mo69718a(new UnlinkEmailCredentialAidlRequest(str), brpp);
            return;
        }
        sdo.m34977c(str);
        this.f142964d.mo25649a(new brnj(this.f142961a, this.f142962b, this.f142963c, str, brpp));
    }

    @Deprecated
    /* renamed from: h */
    public final void mo69744h(String str, brpp brpp) {
        if (cdxt.m135236b()) {
            mo69704a(new ReloadAidlRequest(str), brpp);
            return;
        }
        sdo.m34977c(str);
        this.f142964d.mo25649a(new brmy(this.f142961a, this.f142962b, this.f142963c, str, brpp));
    }

    @Deprecated
    /* renamed from: i */
    public final void mo69745i(String str, brpp brpp) {
        if (cdxt.m135236b()) {
            mo69696a(new DeleteAidlRequest(str), brpp);
            return;
        }
        sdo.m34977c(str);
        this.f142964d.mo25649a(new brmq(this.f142961a, this.f142962b, this.f142963c, str, brpp));
    }

    /* renamed from: j */
    public final void mo69746j(String str, brpp brpp) {
        mo69732b(str, (ActionCodeSettings) null, brpp);
    }

    @Deprecated
    /* renamed from: k */
    public final void mo69747k(String str, brpp brpp) {
        if (cdxt.m135236b()) {
            mo69708a(new SetFirebaseUiVersionAidlRequest(str), brpp);
        } else {
            this.f142964d.mo25649a(new brnb(this.f142961a, this.f142962b, this.f142963c, str, brpp));
        }
    }

    /* renamed from: a */
    private static final String m114163a(String str) {
        String str2 = null;
        try {
            str2 = beao.m91670a().mo58486a(beao.m91670a().mo58483a(str, (String) null), 1);
        } catch (bean e) {
        }
        return !TextUtils.isEmpty(str2) ? str2 : str;
    }

    @Deprecated
    /* renamed from: d */
    public final void mo69738d(String str, String str2, brpp brpp) {
        if (cdxt.m135236b()) {
            mo69712a(new SignInWithEmailAndPasswordAidlRequest(str, str2, null), brpp);
            return;
        }
        sdo.m34977c(str);
        sdo.m34977c(str2);
        this.f142964d.mo25649a(new brnf(this.f142961a, this.f142962b, this.f142963c, str, str2, null, brpp));
    }

    @Deprecated
    /* renamed from: b */
    public final void mo69731b(String str, brpp brpp) {
        SignInWithCustomTokenAidlRequest signInWithCustomTokenAidlRequest = new SignInWithCustomTokenAidlRequest(str, null);
        if (cdxt.m135236b()) {
            mo69711a(signInWithCustomTokenAidlRequest, brpp);
            return;
        }
        sdo.m34977c(str);
        this.f142964d.mo25649a(new brne(this.f142961a, this.f142962b, this.f142963c, signInWithCustomTokenAidlRequest, brpp));
    }

    @Deprecated
    /* renamed from: c */
    public final void mo69735c(String str, ActionCodeSettings actionCodeSettings, brpp brpp) {
        if (cdxt.m135236b()) {
            mo69706a(new SendGetOobConfirmationCodeEmailAidlRequest(str, actionCodeSettings, null), brpp);
            return;
        }
        sdo.m34977c(str);
        sdo.m34959a(actionCodeSettings);
        this.f142964d.mo25649a(new brna(this.f142961a, this.f142962b, this.f142963c, str, actionCodeSettings, null, brpp));
    }

    @Deprecated
    /* renamed from: e */
    public final void mo69740e(String str, String str2, brpp brpp) {
        if (cdxt.m135236b()) {
            mo69694a(new ConfirmPasswordResetAidlRequest(str, str2, null), brpp);
            return;
        }
        sdo.m34977c(str);
        sdo.m34977c(str2);
        this.f142964d.mo25649a(new brmo(this.f142961a, this.f142962b, this.f142963c, str, str2, null, brpp));
    }

    @Deprecated
    /* renamed from: f */
    public final void mo69742f(String str, String str2, brpp brpp) {
        if (cdxt.m135236b()) {
            mo69719a(new UnlinkFederatedCredentialAidlRequest(str, str2), brpp);
            return;
        }
        sdo.m34977c(str);
        sdo.m34977c(str2);
        this.f142964d.mo25649a(new brnk(this.f142961a, this.f142962b, this.f142963c, str, str2, brpp));
    }

    /* renamed from: a */
    private static final void m114164a(long j) {
        if (j < 0 || j > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo69687a(brpp brpp) {
        if (cdxt.m135236b()) {
            mo69709a(new SignInAnonymouslyAidlRequest(null), brpp);
        } else {
            this.f142964d.mo25649a(new brnc(this.f142961a, this.f142962b, this.f142963c, null, brpp));
        }
    }

    @Deprecated
    /* renamed from: c */
    public final void mo69736c(String str, String str2, brpp brpp) {
        if (cdxt.m135236b()) {
            mo69695a(new CreateUserWithEmailAndPasswordAidlRequest(str, str2, null), brpp);
            return;
        }
        sdo.m34977c(str);
        sdo.m34977c(str2);
        this.f142964d.mo25649a(new brmp(this.f142961a, this.f142962b, this.f142963c, str, str2, null, brpp));
    }

    @Deprecated
    /* renamed from: b */
    public final void mo69732b(String str, ActionCodeSettings actionCodeSettings, brpp brpp) {
        if (cdxt.m135236b()) {
            mo69705a(new SendEmailVerificationWithSettingsAidlRequest(str, actionCodeSettings), brpp);
            return;
        }
        sdo.m34977c(str);
        this.f142964d.mo25649a(new brmz(this.f142961a, this.f142962b, this.f142963c, str, actionCodeSettings, brpp));
    }

    @Deprecated
    /* renamed from: a */
    public final void mo69688a(EmailAuthCredential emailAuthCredential, brpp brpp) {
        if (cdxt.m135236b()) {
            mo69713a(new SignInWithEmailLinkAidlRequest(emailAuthCredential), brpp);
            return;
        }
        sdo.m34959a(emailAuthCredential);
        this.f142964d.mo25649a(new brng(this.f142961a, this.f142962b, this.f142963c, emailAuthCredential, brpp));
    }

    @Deprecated
    /* renamed from: b */
    public final void mo69733b(String str, String str2, brpp brpp) {
        if (cdxt.m135236b()) {
            mo69692a(new ChangePasswordAidlRequest(str, str2), brpp);
            return;
        }
        sdo.m34977c(str);
        sdo.m34977c(str2);
        this.f142964d.mo25649a(new brmm(this.f142961a, this.f142962b, this.f142963c, str, str2, brpp));
    }

    @Deprecated
    /* renamed from: a */
    public final void mo69689a(PhoneAuthCredential phoneAuthCredential, brpp brpp) {
        if (cdxt.m135236b()) {
            mo69714a(new SignInWithPhoneNumberAidlRequest(phoneAuthCredential, null), brpp);
            return;
        }
        sdo.m34959a(phoneAuthCredential);
        this.f142964d.mo25649a(new brnh(this.f142961a, this.f142962b, this.f142963c, phoneAuthCredential, null, brpp));
    }

    /* renamed from: a */
    public final void mo69690a(ApplyActionCodeAidlRequest applyActionCodeAidlRequest, brpp brpp) {
        sdo.m34959a(applyActionCodeAidlRequest);
        sdo.m34977c(applyActionCodeAidlRequest.f152417a);
        this.f142964d.mo25649a(new brmk(this.f142961a, this.f142962b, this.f142963c, applyActionCodeAidlRequest.f152417a, applyActionCodeAidlRequest.f152418b, brpp));
    }

    /* renamed from: a */
    public final void mo69691a(ChangeEmailAidlRequest changeEmailAidlRequest, brpp brpp) {
        sdo.m34959a(changeEmailAidlRequest);
        sdo.m34977c(changeEmailAidlRequest.f152419a);
        sdo.m34977c(changeEmailAidlRequest.f152420b);
        this.f142964d.mo25649a(new brml(this.f142961a, this.f142962b, this.f142963c, changeEmailAidlRequest.f152419a, changeEmailAidlRequest.f152420b, brpp));
    }

    /* renamed from: a */
    public final void mo69692a(ChangePasswordAidlRequest changePasswordAidlRequest, brpp brpp) {
        sdo.m34959a(changePasswordAidlRequest);
        sdo.m34977c(changePasswordAidlRequest.f152421a);
        sdo.m34977c(changePasswordAidlRequest.f152422b);
        this.f142964d.mo25649a(new brmm(this.f142961a, this.f142962b, this.f142963c, changePasswordAidlRequest.f152421a, changePasswordAidlRequest.f152422b, brpp));
    }

    /* renamed from: a */
    public final void mo69693a(CheckActionCodeAidlRequest checkActionCodeAidlRequest, brpp brpp) {
        sdo.m34959a(checkActionCodeAidlRequest);
        sdo.m34977c(checkActionCodeAidlRequest.f152423a);
        this.f142964d.mo25649a(new brmn(this.f142961a, this.f142962b, this.f142963c, checkActionCodeAidlRequest.f152423a, checkActionCodeAidlRequest.f152424b, brpp));
    }

    /* renamed from: a */
    public final void mo69694a(ConfirmPasswordResetAidlRequest confirmPasswordResetAidlRequest, brpp brpp) {
        sdo.m34959a(confirmPasswordResetAidlRequest);
        sdo.m34977c(confirmPasswordResetAidlRequest.f152425a);
        sdo.m34977c(confirmPasswordResetAidlRequest.f152426b);
        this.f142964d.mo25649a(new brmo(this.f142961a, this.f142962b, this.f142963c, confirmPasswordResetAidlRequest.f152425a, confirmPasswordResetAidlRequest.f152426b, confirmPasswordResetAidlRequest.f152427c, brpp));
    }

    /* renamed from: a */
    public final void mo69695a(CreateUserWithEmailAndPasswordAidlRequest createUserWithEmailAndPasswordAidlRequest, brpp brpp) {
        sdo.m34959a(createUserWithEmailAndPasswordAidlRequest);
        sdo.m34977c(createUserWithEmailAndPasswordAidlRequest.f152428a);
        sdo.m34977c(createUserWithEmailAndPasswordAidlRequest.f152429b);
        this.f142964d.mo25649a(new brmp(this.f142961a, this.f142962b, this.f142963c, createUserWithEmailAndPasswordAidlRequest.f152428a, createUserWithEmailAndPasswordAidlRequest.f152429b, createUserWithEmailAndPasswordAidlRequest.f152430c, brpp));
    }

    /* renamed from: a */
    public final void mo69696a(DeleteAidlRequest deleteAidlRequest, brpp brpp) {
        sdo.m34959a(deleteAidlRequest);
        sdo.m34977c(deleteAidlRequest.f152431a);
        this.f142964d.mo25649a(new brmq(this.f142961a, this.f142962b, this.f142963c, deleteAidlRequest.f152431a, brpp));
    }

    /* renamed from: a */
    public final void mo69697a(FinalizeMfaEnrollmentAidlRequest finalizeMfaEnrollmentAidlRequest, brpp brpp) {
        if (!cdyc.m135274b()) {
            m114165b(brpp);
            return;
        }
        sdo.m34959a(finalizeMfaEnrollmentAidlRequest);
        this.f142964d.mo25649a(new brmr(this.f142961a, this.f142962b, this.f142963c, finalizeMfaEnrollmentAidlRequest, brpp));
    }

    /* renamed from: a */
    public final void mo69698a(FinalizeMfaSignInAidlRequest finalizeMfaSignInAidlRequest, brpp brpp) {
        if (!cdyc.m135274b()) {
            m114165b(brpp);
            return;
        }
        sdo.m34959a(finalizeMfaSignInAidlRequest);
        this.f142964d.mo25649a(new brms(this.f142961a, this.f142962b, this.f142963c, finalizeMfaSignInAidlRequest, brpp));
    }

    /* renamed from: a */
    public final void mo69699a(GetAccessTokenAidlRequest getAccessTokenAidlRequest, brpp brpp) {
        sdo.m34959a(getAccessTokenAidlRequest);
        sdo.m34977c(getAccessTokenAidlRequest.f152437a);
        this.f142964d.mo25649a(new brmt(this.f142961a, this.f142962b, this.f142963c, getAccessTokenAidlRequest.f152437a, brpp));
    }

    /* renamed from: a */
    public final void mo69700a(GetProvidersForEmailAidlRequest getProvidersForEmailAidlRequest, brpp brpp) {
        sdo.m34959a(getProvidersForEmailAidlRequest);
        sdo.m34977c(getProvidersForEmailAidlRequest.f152438a);
        this.f142964d.mo25649a(new brmu(this.f142961a, this.f142962b, this.f142963c, getProvidersForEmailAidlRequest.f152438a, getProvidersForEmailAidlRequest.f152439b, brpp));
    }

    /* renamed from: a */
    public final void mo69701a(LinkEmailAuthCredentialAidlRequest linkEmailAuthCredentialAidlRequest, brpp brpp) {
        sdo.m34959a(linkEmailAuthCredentialAidlRequest);
        sdo.m34977c(linkEmailAuthCredentialAidlRequest.f152440a);
        sdo.m34977c(linkEmailAuthCredentialAidlRequest.f152441b);
        sdo.m34977c(linkEmailAuthCredentialAidlRequest.f152442c);
        this.f142964d.mo25649a(new brmv(this.f142961a, this.f142962b, this.f142963c, linkEmailAuthCredentialAidlRequest.f152440a, linkEmailAuthCredentialAidlRequest.f152441b, linkEmailAuthCredentialAidlRequest.f152442c, brpp));
    }

    /* renamed from: a */
    public final void mo69702a(LinkFederatedCredentialAidlRequest linkFederatedCredentialAidlRequest, brpp brpp) {
        sdo.m34959a(linkFederatedCredentialAidlRequest);
        sdo.m34977c(linkFederatedCredentialAidlRequest.f152443a);
        sdo.m34959a(linkFederatedCredentialAidlRequest.f152444b);
        this.f142964d.mo25649a(new brmw(this.f142961a, this.f142962b, this.f142963c, linkFederatedCredentialAidlRequest.f152443a, linkFederatedCredentialAidlRequest.f152444b, brpp));
    }

    /* renamed from: a */
    public final void mo69703a(LinkPhoneAuthCredentialAidlRequest linkPhoneAuthCredentialAidlRequest, brpp brpp) {
        sdo.m34959a(linkPhoneAuthCredentialAidlRequest);
        sdo.m34977c(linkPhoneAuthCredentialAidlRequest.f152445a);
        sdo.m34959a(linkPhoneAuthCredentialAidlRequest.f152446b);
        this.f142964d.mo25649a(new brmx(this.f142961a, this.f142962b, this.f142963c, linkPhoneAuthCredentialAidlRequest.f152445a, linkPhoneAuthCredentialAidlRequest.f152446b, brpp));
    }

    /* renamed from: a */
    public final void mo69704a(ReloadAidlRequest reloadAidlRequest, brpp brpp) {
        sdo.m34959a(reloadAidlRequest);
        sdo.m34977c(reloadAidlRequest.f152447a);
        this.f142964d.mo25649a(new brmy(this.f142961a, this.f142962b, this.f142963c, reloadAidlRequest.f152447a, brpp));
    }

    /* renamed from: a */
    public final void mo69705a(SendEmailVerificationWithSettingsAidlRequest sendEmailVerificationWithSettingsAidlRequest, brpp brpp) {
        sdo.m34959a(sendEmailVerificationWithSettingsAidlRequest);
        sdo.m34977c(sendEmailVerificationWithSettingsAidlRequest.f152448a);
        this.f142964d.mo25649a(new brmz(this.f142961a, this.f142962b, this.f142963c, sendEmailVerificationWithSettingsAidlRequest.f152448a, sendEmailVerificationWithSettingsAidlRequest.f152449b, brpp));
    }

    /* renamed from: a */
    public final void mo69706a(SendGetOobConfirmationCodeEmailAidlRequest sendGetOobConfirmationCodeEmailAidlRequest, brpp brpp) {
        sdo.m34977c(sendGetOobConfirmationCodeEmailAidlRequest.f152450a);
        sdo.m34959a(sendGetOobConfirmationCodeEmailAidlRequest.f152451b);
        this.f142964d.mo25649a(new brna(this.f142961a, this.f142962b, this.f142963c, sendGetOobConfirmationCodeEmailAidlRequest.f152450a, sendGetOobConfirmationCodeEmailAidlRequest.f152451b, sendGetOobConfirmationCodeEmailAidlRequest.f152452c, brpp));
    }

    /* renamed from: a */
    public final void mo69707a(SendVerificationCodeAidlRequest sendVerificationCodeAidlRequest, brpp brpp) {
        sdo.m34959a(sendVerificationCodeAidlRequest);
        SendVerificationCodeRequest sendVerificationCodeRequest = sendVerificationCodeAidlRequest.f152453a;
        sdo.m34959a(sendVerificationCodeRequest);
        m114164a(sendVerificationCodeRequest.f152549b);
        this.f142964d.mo25649a(new brnp(this.f142961a, this.f142962b, this.f142963c, new SendVerificationCodeRequest(m114163a(sendVerificationCodeRequest.f152548a), sendVerificationCodeRequest.f152549b, sendVerificationCodeRequest.f152550c, sendVerificationCodeRequest.f152551d, sendVerificationCodeRequest.f152552e), brpp));
    }

    /* renamed from: a */
    public final void mo69708a(SetFirebaseUiVersionAidlRequest setFirebaseUiVersionAidlRequest, brpp brpp) {
        sdo.m34959a(setFirebaseUiVersionAidlRequest);
        this.f142964d.mo25649a(new brnb(this.f142961a, this.f142962b, this.f142963c, setFirebaseUiVersionAidlRequest.f152454a, brpp));
    }

    /* renamed from: a */
    public final void mo69709a(SignInAnonymouslyAidlRequest signInAnonymouslyAidlRequest, brpp brpp) {
        sdo.m34959a(signInAnonymouslyAidlRequest);
        this.f142964d.mo25649a(new brnc(this.f142961a, this.f142962b, this.f142963c, signInAnonymouslyAidlRequest.f152455a, brpp));
    }

    /* renamed from: a */
    public final void mo69710a(SignInWithCredentialAidlRequest signInWithCredentialAidlRequest, brpp brpp) {
        sdo.m34959a(signInWithCredentialAidlRequest);
        sdo.m34959a(signInWithCredentialAidlRequest.f152456a);
        this.f142964d.mo25649a(new brnd(this.f142961a, this.f142962b, this.f142963c, signInWithCredentialAidlRequest.f152456a, brpp));
    }

    /* renamed from: a */
    public final void mo69711a(SignInWithCustomTokenAidlRequest signInWithCustomTokenAidlRequest, brpp brpp) {
        sdo.m34959a(signInWithCustomTokenAidlRequest);
        sdo.m34977c(signInWithCustomTokenAidlRequest.f152457a);
        this.f142964d.mo25649a(new brne(this.f142961a, this.f142962b, this.f142963c, signInWithCustomTokenAidlRequest, brpp));
    }

    /* renamed from: a */
    public final void mo69712a(SignInWithEmailAndPasswordAidlRequest signInWithEmailAndPasswordAidlRequest, brpp brpp) {
        sdo.m34959a(signInWithEmailAndPasswordAidlRequest);
        sdo.m34977c(signInWithEmailAndPasswordAidlRequest.f152459a);
        sdo.m34977c(signInWithEmailAndPasswordAidlRequest.f152460b);
        this.f142964d.mo25649a(new brnf(this.f142961a, this.f142962b, this.f142963c, signInWithEmailAndPasswordAidlRequest.f152459a, signInWithEmailAndPasswordAidlRequest.f152460b, signInWithEmailAndPasswordAidlRequest.f152461c, brpp));
    }

    /* renamed from: a */
    public final void mo69713a(SignInWithEmailLinkAidlRequest signInWithEmailLinkAidlRequest, brpp brpp) {
        sdo.m34959a(signInWithEmailLinkAidlRequest);
        sdo.m34959a(signInWithEmailLinkAidlRequest.f152462a);
        this.f142964d.mo25649a(new brng(this.f142961a, this.f142962b, this.f142963c, signInWithEmailLinkAidlRequest.f152462a, brpp));
    }

    /* renamed from: a */
    public final void mo69714a(SignInWithPhoneNumberAidlRequest signInWithPhoneNumberAidlRequest, brpp brpp) {
        sdo.m34959a(signInWithPhoneNumberAidlRequest);
        sdo.m34959a(signInWithPhoneNumberAidlRequest.f152463a);
        this.f142964d.mo25649a(new brnh(this.f142961a, this.f142962b, this.f142963c, signInWithPhoneNumberAidlRequest.f152463a, signInWithPhoneNumberAidlRequest.f152464b, brpp));
    }

    /* renamed from: a */
    public final void mo69715a(StartMfaPhoneNumberEnrollmentAidlRequest startMfaPhoneNumberEnrollmentAidlRequest, brpp brpp) {
        if (!cdyc.m135274b()) {
            m114165b(brpp);
            return;
        }
        sdo.m34959a(startMfaPhoneNumberEnrollmentAidlRequest);
        m114164a(startMfaPhoneNumberEnrollmentAidlRequest.f152468d);
        this.f142964d.mo25649a(new brnn(this.f142961a, this.f142962b, this.f142963c, new StartMfaPhoneNumberEnrollmentAidlRequest(startMfaPhoneNumberEnrollmentAidlRequest.f152465a, m114163a(startMfaPhoneNumberEnrollmentAidlRequest.f152466b), startMfaPhoneNumberEnrollmentAidlRequest.f152467c, startMfaPhoneNumberEnrollmentAidlRequest.f152468d, startMfaPhoneNumberEnrollmentAidlRequest.f152469e, startMfaPhoneNumberEnrollmentAidlRequest.f152470f), brpp));
    }

    /* renamed from: a */
    public final void mo69716a(StartMfaPhoneNumberSignInAidlRequest startMfaPhoneNumberSignInAidlRequest, brpp brpp) {
        if (!cdyc.m135274b()) {
            m114165b(brpp);
            return;
        }
        sdo.m34959a(startMfaPhoneNumberSignInAidlRequest);
        m114164a(startMfaPhoneNumberSignInAidlRequest.f152474d);
        String a = m114163a(startMfaPhoneNumberSignInAidlRequest.f152471a.f152411d);
        PhoneMultiFactorInfo phoneMultiFactorInfo = startMfaPhoneNumberSignInAidlRequest.f152471a;
        startMfaPhoneNumberSignInAidlRequest.f152471a = new PhoneMultiFactorInfo(phoneMultiFactorInfo.f152408a, phoneMultiFactorInfo.f152409b, phoneMultiFactorInfo.f152410c, a);
        this.f142964d.mo25649a(new brno(this.f142961a, this.f142962b, this.f142963c, startMfaPhoneNumberSignInAidlRequest, brpp));
    }

    /* renamed from: a */
    public final void mo69717a(UnenrollMfaAidlRequest unenrollMfaAidlRequest, brpp brpp) {
        if (!cdyc.m135274b()) {
            m114165b(brpp);
            return;
        }
        sdo.m34959a(unenrollMfaAidlRequest);
        this.f142964d.mo25649a(new brni(this.f142961a, this.f142962b, this.f142963c, unenrollMfaAidlRequest.f152477a, unenrollMfaAidlRequest.f152478b, brpp));
    }

    /* renamed from: a */
    public final void mo69718a(UnlinkEmailCredentialAidlRequest unlinkEmailCredentialAidlRequest, brpp brpp) {
        sdo.m34959a(unlinkEmailCredentialAidlRequest);
        sdo.m34977c(unlinkEmailCredentialAidlRequest.f152479a);
        this.f142964d.mo25649a(new brnj(this.f142961a, this.f142962b, this.f142963c, unlinkEmailCredentialAidlRequest.f152479a, brpp));
    }

    /* renamed from: a */
    public final void mo69719a(UnlinkFederatedCredentialAidlRequest unlinkFederatedCredentialAidlRequest, brpp brpp) {
        sdo.m34959a(unlinkFederatedCredentialAidlRequest);
        sdo.m34977c(unlinkFederatedCredentialAidlRequest.f152480a);
        sdo.m34977c(unlinkFederatedCredentialAidlRequest.f152481b);
        this.f142964d.mo25649a(new brnk(this.f142961a, this.f142962b, this.f142963c, unlinkFederatedCredentialAidlRequest.f152480a, unlinkFederatedCredentialAidlRequest.f152481b, brpp));
    }

    /* renamed from: a */
    public final void mo69720a(UpdateProfileAidlRequest updateProfileAidlRequest, brpp brpp) {
        sdo.m34959a(updateProfileAidlRequest);
        sdo.m34977c(updateProfileAidlRequest.f152483b);
        sdo.m34959a(updateProfileAidlRequest.f152482a);
        this.f142964d.mo25649a(new brnl(this.f142961a, this.f142962b, this.f142963c, updateProfileAidlRequest.f152483b, updateProfileAidlRequest.f152482a, brpp));
    }

    /* renamed from: a */
    public final void mo69721a(VerifyBeforeUpdateEmailAidlRequest verifyBeforeUpdateEmailAidlRequest, brpp brpp) {
        if (!cdyi.f181912a.mo6606a().mo78450a()) {
            m114165b(brpp);
            return;
        }
        sdo.m34959a(verifyBeforeUpdateEmailAidlRequest);
        this.f142964d.mo25649a(new brnm(this.f142961a, this.f142962b, this.f142963c, verifyBeforeUpdateEmailAidlRequest, brpp));
    }

    @Deprecated
    /* renamed from: a */
    public final void mo69722a(SendVerificationCodeRequest sendVerificationCodeRequest, brpp brpp) {
        if (cdxt.m135236b()) {
            mo69707a(new SendVerificationCodeAidlRequest(sendVerificationCodeRequest), brpp);
            return;
        }
        sdo.m34959a(sendVerificationCodeRequest);
        m114164a(sendVerificationCodeRequest.f152549b);
        this.f142964d.mo25649a(new brnp(this.f142961a, this.f142962b, this.f142963c, new SendVerificationCodeRequest(m114163a(sendVerificationCodeRequest.f152548a), sendVerificationCodeRequest.f152549b, sendVerificationCodeRequest.f152550c, sendVerificationCodeRequest.f152551d, sendVerificationCodeRequest.f152552e), brpp));
    }

    @Deprecated
    /* renamed from: a */
    public final void mo69723a(VerifyAssertionRequest verifyAssertionRequest, brpp brpp) {
        if (cdxt.m135236b()) {
            mo69710a(new SignInWithCredentialAidlRequest(verifyAssertionRequest), brpp);
            return;
        }
        sdo.m34959a(verifyAssertionRequest);
        this.f142964d.mo25649a(new brnd(this.f142961a, this.f142962b, this.f142963c, verifyAssertionRequest, brpp));
    }

    @Deprecated
    /* renamed from: a */
    public final void mo69724a(String str, brpp brpp) {
        if (cdxt.m135236b()) {
            mo69699a(new GetAccessTokenAidlRequest(str), brpp);
            return;
        }
        sdo.m34977c(str);
        this.f142964d.mo25649a(new brmt(this.f142961a, this.f142962b, this.f142963c, str, brpp));
    }

    @Deprecated
    /* renamed from: a */
    public final void mo69725a(String str, ActionCodeSettings actionCodeSettings, brpp brpp) {
        if (actionCodeSettings == null) {
            actionCodeSettings = new ActionCodeSettings();
        }
        actionCodeSettings.f152387i = bsmm.PASSWORD_RESET.f145053j;
        mo69735c(str, actionCodeSettings, brpp);
    }

    @Deprecated
    /* renamed from: a */
    public final void mo69726a(String str, PhoneAuthCredential phoneAuthCredential, brpp brpp) {
        if (cdxt.m135236b()) {
            mo69703a(new LinkPhoneAuthCredentialAidlRequest(str, phoneAuthCredential), brpp);
            return;
        }
        sdo.m34977c(str);
        sdo.m34959a(phoneAuthCredential);
        this.f142964d.mo25649a(new brmx(this.f142961a, this.f142962b, this.f142963c, str, phoneAuthCredential, brpp));
    }

    @Deprecated
    /* renamed from: a */
    public final void mo69727a(String str, UserProfileChangeRequest userProfileChangeRequest, brpp brpp) {
        if (cdxt.m135236b()) {
            mo69720a(new UpdateProfileAidlRequest(userProfileChangeRequest, str), brpp);
            return;
        }
        sdo.m34977c(str);
        sdo.m34959a(userProfileChangeRequest);
        this.f142964d.mo25649a(new brnl(this.f142961a, this.f142962b, this.f142963c, str, userProfileChangeRequest, brpp));
    }

    @Deprecated
    /* renamed from: a */
    public final void mo69728a(String str, VerifyAssertionRequest verifyAssertionRequest, brpp brpp) {
        if (cdxt.m135236b()) {
            mo69702a(new LinkFederatedCredentialAidlRequest(str, verifyAssertionRequest), brpp);
            return;
        }
        sdo.m34977c(str);
        sdo.m34959a(verifyAssertionRequest);
        this.f142964d.mo25649a(new brmw(this.f142961a, this.f142962b, this.f142963c, str, verifyAssertionRequest, brpp));
    }

    @Deprecated
    /* renamed from: a */
    public final void mo69729a(String str, String str2, brpp brpp) {
        if (cdxt.m135236b()) {
            mo69691a(new ChangeEmailAidlRequest(str, str2), brpp);
            return;
        }
        sdo.m34977c(str);
        sdo.m34977c(str2);
        this.f142964d.mo25649a(new brml(this.f142961a, this.f142962b, this.f142963c, str, str2, brpp));
    }

    @Deprecated
    /* renamed from: a */
    public final void mo69730a(String str, String str2, String str3, brpp brpp) {
        if (cdxt.m135236b()) {
            mo69701a(new LinkEmailAuthCredentialAidlRequest(str, str2, str3), brpp);
            return;
        }
        sdo.m34977c(str);
        sdo.m34977c(str2);
        sdo.m34977c(str3);
        this.f142964d.mo25649a(new brmv(this.f142961a, this.f142962b, this.f142963c, str, str2, str3, brpp));
    }
}
