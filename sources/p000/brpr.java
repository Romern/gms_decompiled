package p000;

import android.os.IInterface;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
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

/* renamed from: brpr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface brpr extends IInterface {
    @Deprecated
    /* renamed from: a */
    void mo69687a(brpp brpp);

    @Deprecated
    /* renamed from: a */
    void mo69688a(EmailAuthCredential emailAuthCredential, brpp brpp);

    @Deprecated
    /* renamed from: a */
    void mo69689a(PhoneAuthCredential phoneAuthCredential, brpp brpp);

    /* renamed from: a */
    void mo69690a(ApplyActionCodeAidlRequest applyActionCodeAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69691a(ChangeEmailAidlRequest changeEmailAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69692a(ChangePasswordAidlRequest changePasswordAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69693a(CheckActionCodeAidlRequest checkActionCodeAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69694a(ConfirmPasswordResetAidlRequest confirmPasswordResetAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69695a(CreateUserWithEmailAndPasswordAidlRequest createUserWithEmailAndPasswordAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69696a(DeleteAidlRequest deleteAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69697a(FinalizeMfaEnrollmentAidlRequest finalizeMfaEnrollmentAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69698a(FinalizeMfaSignInAidlRequest finalizeMfaSignInAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69699a(GetAccessTokenAidlRequest getAccessTokenAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69700a(GetProvidersForEmailAidlRequest getProvidersForEmailAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69701a(LinkEmailAuthCredentialAidlRequest linkEmailAuthCredentialAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69702a(LinkFederatedCredentialAidlRequest linkFederatedCredentialAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69703a(LinkPhoneAuthCredentialAidlRequest linkPhoneAuthCredentialAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69704a(ReloadAidlRequest reloadAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69705a(SendEmailVerificationWithSettingsAidlRequest sendEmailVerificationWithSettingsAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69706a(SendGetOobConfirmationCodeEmailAidlRequest sendGetOobConfirmationCodeEmailAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69707a(SendVerificationCodeAidlRequest sendVerificationCodeAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69708a(SetFirebaseUiVersionAidlRequest setFirebaseUiVersionAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69709a(SignInAnonymouslyAidlRequest signInAnonymouslyAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69710a(SignInWithCredentialAidlRequest signInWithCredentialAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69711a(SignInWithCustomTokenAidlRequest signInWithCustomTokenAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69712a(SignInWithEmailAndPasswordAidlRequest signInWithEmailAndPasswordAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69713a(SignInWithEmailLinkAidlRequest signInWithEmailLinkAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69714a(SignInWithPhoneNumberAidlRequest signInWithPhoneNumberAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69715a(StartMfaPhoneNumberEnrollmentAidlRequest startMfaPhoneNumberEnrollmentAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69716a(StartMfaPhoneNumberSignInAidlRequest startMfaPhoneNumberSignInAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69717a(UnenrollMfaAidlRequest unenrollMfaAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69718a(UnlinkEmailCredentialAidlRequest unlinkEmailCredentialAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69719a(UnlinkFederatedCredentialAidlRequest unlinkFederatedCredentialAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69720a(UpdateProfileAidlRequest updateProfileAidlRequest, brpp brpp);

    /* renamed from: a */
    void mo69721a(VerifyBeforeUpdateEmailAidlRequest verifyBeforeUpdateEmailAidlRequest, brpp brpp);

    @Deprecated
    /* renamed from: a */
    void mo69722a(SendVerificationCodeRequest sendVerificationCodeRequest, brpp brpp);

    @Deprecated
    /* renamed from: a */
    void mo69723a(VerifyAssertionRequest verifyAssertionRequest, brpp brpp);

    @Deprecated
    /* renamed from: a */
    void mo69724a(String str, brpp brpp);

    @Deprecated
    /* renamed from: a */
    void mo69725a(String str, ActionCodeSettings actionCodeSettings, brpp brpp);

    @Deprecated
    /* renamed from: a */
    void mo69726a(String str, PhoneAuthCredential phoneAuthCredential, brpp brpp);

    @Deprecated
    /* renamed from: a */
    void mo69727a(String str, UserProfileChangeRequest userProfileChangeRequest, brpp brpp);

    @Deprecated
    /* renamed from: a */
    void mo69728a(String str, VerifyAssertionRequest verifyAssertionRequest, brpp brpp);

    @Deprecated
    /* renamed from: a */
    void mo69729a(String str, String str2, brpp brpp);

    @Deprecated
    /* renamed from: a */
    void mo69730a(String str, String str2, String str3, brpp brpp);

    @Deprecated
    /* renamed from: b */
    void mo69731b(String str, brpp brpp);

    @Deprecated
    /* renamed from: b */
    void mo69732b(String str, ActionCodeSettings actionCodeSettings, brpp brpp);

    @Deprecated
    /* renamed from: b */
    void mo69733b(String str, String str2, brpp brpp);

    @Deprecated
    /* renamed from: c */
    void mo69734c(String str, brpp brpp);

    @Deprecated
    /* renamed from: c */
    void mo69735c(String str, ActionCodeSettings actionCodeSettings, brpp brpp);

    @Deprecated
    /* renamed from: c */
    void mo69736c(String str, String str2, brpp brpp);

    /* renamed from: d */
    void mo69737d(String str, brpp brpp);

    @Deprecated
    /* renamed from: d */
    void mo69738d(String str, String str2, brpp brpp);

    @Deprecated
    /* renamed from: e */
    void mo69739e(String str, brpp brpp);

    @Deprecated
    /* renamed from: e */
    void mo69740e(String str, String str2, brpp brpp);

    @Deprecated
    /* renamed from: f */
    void mo69741f(String str, brpp brpp);

    @Deprecated
    /* renamed from: f */
    void mo69742f(String str, String str2, brpp brpp);

    @Deprecated
    /* renamed from: g */
    void mo69743g(String str, brpp brpp);

    @Deprecated
    /* renamed from: h */
    void mo69744h(String str, brpp brpp);

    @Deprecated
    /* renamed from: i */
    void mo69745i(String str, brpp brpp);

    /* renamed from: j */
    void mo69746j(String str, brpp brpp);

    @Deprecated
    /* renamed from: k */
    void mo69747k(String str, brpp brpp);
}
