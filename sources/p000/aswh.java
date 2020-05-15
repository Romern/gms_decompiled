package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialRequest;
import com.google.android.gms.tapandpay.firstparty.SendTransmissionEventRequest;
import com.google.android.gms.tapandpay.firstparty.SyncDeviceInfoRequest;
import com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsRequest;
import com.google.android.gms.tapandpay.globalactions.SelectGlobalActionCardRequest;
import com.google.android.gms.tapandpay.internal.firstparty.AddOtherPaymentOptionRequest;
import com.google.android.gms.tapandpay.internal.firstparty.DeleteTokenRequest;
import com.google.android.gms.tapandpay.internal.firstparty.DisableSelectedTokenRequest;
import com.google.android.gms.tapandpay.internal.firstparty.EnablePayOnWearRequest;
import com.google.android.gms.tapandpay.internal.firstparty.FirstPartyTokenizePanRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetActiveAccountRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetActiveCardsForAccountRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetActiveTokensForAccountRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetAllCardsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetAvailableOtherPaymentMethodsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetLastAttestationResultRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetNotificationSettingsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetReceivesTransactionNotificationsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetSeChipTransactionsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.IsDeviceUnlockedForInAppPaymentRequest;
import com.google.android.gms.tapandpay.internal.firstparty.IsDeviceUnlockedForPaymentRequest;
import com.google.android.gms.tapandpay.internal.firstparty.PromptDeviceUnlockForPaymentRequest;
import com.google.android.gms.tapandpay.internal.firstparty.RefreshSeCardsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.ReleaseResourceRequest;
import com.google.android.gms.tapandpay.internal.firstparty.ReportInAppTransactionCompletedRequest;
import com.google.android.gms.tapandpay.internal.firstparty.ReserveResourceRequest;
import com.google.android.gms.tapandpay.internal.firstparty.SendTapEventRequest;
import com.google.android.gms.tapandpay.internal.firstparty.SetActiveAccountRequest;
import com.google.android.gms.tapandpay.internal.firstparty.SetFelicaTosAcceptanceRequest;
import com.google.android.gms.tapandpay.internal.firstparty.SetNotificationSettingsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.SetReceivesTransactionNotificationsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.SetSelectedTokenRequest;
import com.google.android.gms.tapandpay.internal.firstparty.ShowNotificationSettingsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.ShowSecurityPromptRequest;
import com.google.android.gms.tapandpay.internal.firstparty.TokenizeAccountRequest;
import com.google.android.gms.tapandpay.issuer.CreatePushTokenizeSessionRequest;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.quickaccesswallet.GetQuickAccessWalletConfigRequest;
import com.google.android.gms.tapandpay.quickaccesswallet.SetQuickAccessWalletCardsRequest;

/* renamed from: aswh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aswh extends dcj implements aswj {
    public aswh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tapandpay.internal.ITapAndPayService");
    }

    /* renamed from: a */
    public final Status mo49543a() {
        throw null;
    }

    /* renamed from: a */
    public final void mo49544a(int i, String str, aswm aswm) {
        throw null;
    }

    /* renamed from: a */
    public final void mo49545a(int i, String str, String str2, aswm aswm) {
        throw null;
    }

    /* renamed from: a */
    public final void mo49546a(long j, aswm aswm) {
        throw null;
    }

    /* renamed from: a */
    public final void mo49547a(aswm aswm) {
        throw null;
    }

    /* renamed from: a */
    public final void mo49549a(SendTransmissionEventRequest sendTransmissionEventRequest, aswm aswm) {
        throw null;
    }

    /* renamed from: a */
    public final void mo49550a(SyncDeviceInfoRequest syncDeviceInfoRequest, aswm aswm) {
        throw null;
    }

    /* renamed from: a */
    public final void mo49551a(GetGlobalActionCardsRequest getGlobalActionCardsRequest, aswm aswm) {
        throw null;
    }

    /* renamed from: a */
    public final void mo49552a(SelectGlobalActionCardRequest selectGlobalActionCardRequest, aswm aswm) {
        throw null;
    }

    /* renamed from: a */
    public final void mo49560a(GetActiveTokensForAccountRequest getActiveTokensForAccountRequest, aswm aswm) {
        throw null;
    }

    /* renamed from: a */
    public final void mo49565a(GetReceivesTransactionNotificationsRequest getReceivesTransactionNotificationsRequest, aswm aswm) {
        throw null;
    }

    /* renamed from: a */
    public final void mo49566a(GetSeChipTransactionsRequest getSeChipTransactionsRequest, aswm aswm) {
        throw null;
    }

    /* renamed from: a */
    public final void mo49568a(IsDeviceUnlockedForPaymentRequest isDeviceUnlockedForPaymentRequest, aswm aswm) {
        throw null;
    }

    /* renamed from: a */
    public final void mo49570a(RefreshSeCardsRequest refreshSeCardsRequest, aswm aswm) {
        throw null;
    }

    /* renamed from: a */
    public final void mo49571a(ReleaseResourceRequest releaseResourceRequest, aswm aswm) {
        throw null;
    }

    /* renamed from: a */
    public final void mo49573a(ReserveResourceRequest reserveResourceRequest, aswm aswm) {
        throw null;
    }

    /* renamed from: a */
    public final void mo49574a(SendTapEventRequest sendTapEventRequest, aswm aswm) {
        throw null;
    }

    /* renamed from: a */
    public final void mo49578a(SetReceivesTransactionNotificationsRequest setReceivesTransactionNotificationsRequest, aswm aswm) {
        throw null;
    }

    /* renamed from: a */
    public final void mo49580a(ShowNotificationSettingsRequest showNotificationSettingsRequest, aswm aswm) {
        throw null;
    }

    /* renamed from: a */
    public final void mo49583a(CreatePushTokenizeSessionRequest createPushTokenizeSessionRequest, aswm aswm) {
        throw null;
    }

    /* renamed from: a */
    public final void mo49584a(PushTokenizeRequest pushTokenizeRequest, aswm aswm) {
        throw null;
    }

    /* renamed from: a */
    public final void mo49585a(GetQuickAccessWalletConfigRequest getQuickAccessWalletConfigRequest, aswm aswm) {
        throw null;
    }

    /* renamed from: a */
    public final void mo49586a(SetQuickAccessWalletCardsRequest setQuickAccessWalletCardsRequest, aswm aswm) {
        throw null;
    }

    /* renamed from: a */
    public final void mo49587a(String str, aswm aswm) {
        throw null;
    }

    /* renamed from: b */
    public final void mo49589b(int i, String str, aswm aswm) {
        throw null;
    }

    /* renamed from: b */
    public final void mo49591b(String str, aswm aswm) {
        throw null;
    }

    /* renamed from: c */
    public final void mo49592c(int i, String str, aswm aswm) {
        throw null;
    }

    /* renamed from: d */
    public final void mo49594d(aswm aswm) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, aswm);
        mo8528b(10, bj);
    }

    /* renamed from: e */
    public final void mo49595e(aswm aswm) {
        throw null;
    }

    /* renamed from: f */
    public final void mo49596f(aswm aswm) {
        throw null;
    }

    /* renamed from: g */
    public final void mo49597g(aswm aswm) {
        throw null;
    }

    /* renamed from: h */
    public final void mo49598h(aswm aswm) {
        throw null;
    }

    /* renamed from: i */
    public final void mo49599i(aswm aswm) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, aswm);
        mo8528b(41, bj);
    }

    /* renamed from: j */
    public final void mo49600j(aswm aswm) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, aswm);
        mo8528b(42, bj);
    }

    /* renamed from: k */
    public final void mo49601k(aswm aswm) {
        throw null;
    }

    /* renamed from: l */
    public final void mo49602l(aswm aswm) {
        throw null;
    }

    /* renamed from: m */
    public final void mo49603m(aswm aswm) {
        throw null;
    }

    /* renamed from: n */
    public final void mo49604n(aswm aswm) {
        throw null;
    }

    /* renamed from: o */
    public final void mo49605o(aswm aswm) {
        throw null;
    }

    /* renamed from: b */
    public final void mo49590b(aswm aswm) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, aswm);
        mo8528b(55, bj);
    }

    /* renamed from: c */
    public final void mo49593c(aswm aswm) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, aswm);
        mo8528b(70, bj);
    }

    /* renamed from: a */
    public final void mo49548a(RetrieveInAppPaymentCredentialRequest retrieveInAppPaymentCredentialRequest, aswm aswm) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, retrieveInAppPaymentCredentialRequest);
        dcl.m8164a(bj, aswm);
        mo8528b(16, bj);
    }

    /* renamed from: a */
    public final void mo49553a(AddOtherPaymentOptionRequest addOtherPaymentOptionRequest, aswm aswm) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, addOtherPaymentOptionRequest);
        dcl.m8164a(bj, aswm);
        mo8528b(39, bj);
    }

    /* renamed from: a */
    public final void mo49554a(DeleteTokenRequest deleteTokenRequest, aswm aswm) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, deleteTokenRequest);
        dcl.m8164a(bj, aswm);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo49555a(DisableSelectedTokenRequest disableSelectedTokenRequest, aswm aswm) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, disableSelectedTokenRequest);
        dcl.m8164a(bj, aswm);
        mo8528b(53, bj);
    }

    /* renamed from: a */
    public final void mo49556a(EnablePayOnWearRequest enablePayOnWearRequest, aswm aswm) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, enablePayOnWearRequest);
        dcl.m8164a(bj, aswm);
        mo8528b(32, bj);
    }

    /* renamed from: a */
    public final void mo49557a(FirstPartyTokenizePanRequest firstPartyTokenizePanRequest, aswm aswm) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, firstPartyTokenizePanRequest);
        dcl.m8164a(bj, aswm);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo49558a(GetActiveAccountRequest getActiveAccountRequest, aswm aswm) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getActiveAccountRequest);
        dcl.m8164a(bj, aswm);
        mo8528b(9, bj);
    }

    /* renamed from: a */
    public final void mo49559a(GetActiveCardsForAccountRequest getActiveCardsForAccountRequest, aswm aswm) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getActiveCardsForAccountRequest);
        dcl.m8164a(bj, aswm);
        mo8528b(18, bj);
    }

    /* renamed from: a */
    public final void mo49561a(GetAllCardsRequest getAllCardsRequest, aswm aswm) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getAllCardsRequest);
        dcl.m8164a(bj, aswm);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo49562a(GetAvailableOtherPaymentMethodsRequest getAvailableOtherPaymentMethodsRequest, aswm aswm) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getAvailableOtherPaymentMethodsRequest);
        dcl.m8164a(bj, aswm);
        mo8528b(40, bj);
    }

    /* renamed from: a */
    public final void mo49563a(GetLastAttestationResultRequest getLastAttestationResultRequest, aswm aswm) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getLastAttestationResultRequest);
        dcl.m8164a(bj, aswm);
        mo8528b(69, bj);
    }

    /* renamed from: a */
    public final void mo49564a(GetNotificationSettingsRequest getNotificationSettingsRequest, aswm aswm) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getNotificationSettingsRequest);
        dcl.m8164a(bj, aswm);
        mo8528b(37, bj);
    }

    /* renamed from: a */
    public final void mo49567a(IsDeviceUnlockedForInAppPaymentRequest isDeviceUnlockedForInAppPaymentRequest, aswm aswm) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, isDeviceUnlockedForInAppPaymentRequest);
        dcl.m8164a(bj, aswm);
        mo8528b(26, bj);
    }

    /* renamed from: a */
    public final void mo49569a(PromptDeviceUnlockForPaymentRequest promptDeviceUnlockForPaymentRequest, aswm aswm) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, promptDeviceUnlockForPaymentRequest);
        dcl.m8164a(bj, aswm);
        mo8528b(12, bj);
    }

    /* renamed from: a */
    public final void mo49572a(ReportInAppTransactionCompletedRequest reportInAppTransactionCompletedRequest, aswm aswm) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, reportInAppTransactionCompletedRequest);
        dcl.m8164a(bj, aswm);
        mo8528b(27, bj);
    }

    /* renamed from: a */
    public final void mo49575a(SetActiveAccountRequest setActiveAccountRequest, aswm aswm) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, setActiveAccountRequest);
        dcl.m8164a(bj, aswm);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo49576a(SetFelicaTosAcceptanceRequest setFelicaTosAcceptanceRequest, aswm aswm) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, setFelicaTosAcceptanceRequest);
        dcl.m8164a(bj, aswm);
        mo8528b(54, bj);
    }

    /* renamed from: a */
    public final void mo49577a(SetNotificationSettingsRequest setNotificationSettingsRequest, aswm aswm) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, setNotificationSettingsRequest);
        dcl.m8164a(bj, aswm);
        mo8528b(38, bj);
    }

    /* renamed from: a */
    public final void mo49579a(SetSelectedTokenRequest setSelectedTokenRequest, aswm aswm) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, setSelectedTokenRequest);
        dcl.m8164a(bj, aswm);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo49581a(ShowSecurityPromptRequest showSecurityPromptRequest, aswm aswm) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, showSecurityPromptRequest);
        dcl.m8164a(bj, aswm);
        mo8528b(8, bj);
    }

    /* renamed from: a */
    public final void mo49582a(TokenizeAccountRequest tokenizeAccountRequest, aswm aswm) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, tokenizeAccountRequest);
        dcl.m8164a(bj, aswm);
        mo8528b(58, bj);
    }

    /* renamed from: a */
    public final void mo49588a(byte[] bArr, aswm aswm) {
        Parcel bj = mo8529bj();
        bj.writeByteArray(bArr);
        dcl.m8164a(bj, aswm);
        mo8528b(56, bj);
    }
}
