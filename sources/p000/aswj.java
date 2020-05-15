package p000;

import android.os.IInterface;
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

/* renamed from: aswj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface aswj extends IInterface {
    /* renamed from: a */
    Status mo49543a();

    /* renamed from: a */
    void mo49544a(int i, String str, aswm aswm);

    /* renamed from: a */
    void mo49545a(int i, String str, String str2, aswm aswm);

    /* renamed from: a */
    void mo49546a(long j, aswm aswm);

    /* renamed from: a */
    void mo49547a(aswm aswm);

    /* renamed from: a */
    void mo49548a(RetrieveInAppPaymentCredentialRequest retrieveInAppPaymentCredentialRequest, aswm aswm);

    /* renamed from: a */
    void mo49549a(SendTransmissionEventRequest sendTransmissionEventRequest, aswm aswm);

    /* renamed from: a */
    void mo49550a(SyncDeviceInfoRequest syncDeviceInfoRequest, aswm aswm);

    /* renamed from: a */
    void mo49551a(GetGlobalActionCardsRequest getGlobalActionCardsRequest, aswm aswm);

    /* renamed from: a */
    void mo49552a(SelectGlobalActionCardRequest selectGlobalActionCardRequest, aswm aswm);

    /* renamed from: a */
    void mo49553a(AddOtherPaymentOptionRequest addOtherPaymentOptionRequest, aswm aswm);

    /* renamed from: a */
    void mo49554a(DeleteTokenRequest deleteTokenRequest, aswm aswm);

    /* renamed from: a */
    void mo49555a(DisableSelectedTokenRequest disableSelectedTokenRequest, aswm aswm);

    /* renamed from: a */
    void mo49556a(EnablePayOnWearRequest enablePayOnWearRequest, aswm aswm);

    /* renamed from: a */
    void mo49557a(FirstPartyTokenizePanRequest firstPartyTokenizePanRequest, aswm aswm);

    /* renamed from: a */
    void mo49558a(GetActiveAccountRequest getActiveAccountRequest, aswm aswm);

    /* renamed from: a */
    void mo49559a(GetActiveCardsForAccountRequest getActiveCardsForAccountRequest, aswm aswm);

    /* renamed from: a */
    void mo49560a(GetActiveTokensForAccountRequest getActiveTokensForAccountRequest, aswm aswm);

    /* renamed from: a */
    void mo49561a(GetAllCardsRequest getAllCardsRequest, aswm aswm);

    /* renamed from: a */
    void mo49562a(GetAvailableOtherPaymentMethodsRequest getAvailableOtherPaymentMethodsRequest, aswm aswm);

    /* renamed from: a */
    void mo49563a(GetLastAttestationResultRequest getLastAttestationResultRequest, aswm aswm);

    /* renamed from: a */
    void mo49564a(GetNotificationSettingsRequest getNotificationSettingsRequest, aswm aswm);

    /* renamed from: a */
    void mo49565a(GetReceivesTransactionNotificationsRequest getReceivesTransactionNotificationsRequest, aswm aswm);

    /* renamed from: a */
    void mo49566a(GetSeChipTransactionsRequest getSeChipTransactionsRequest, aswm aswm);

    /* renamed from: a */
    void mo49567a(IsDeviceUnlockedForInAppPaymentRequest isDeviceUnlockedForInAppPaymentRequest, aswm aswm);

    /* renamed from: a */
    void mo49568a(IsDeviceUnlockedForPaymentRequest isDeviceUnlockedForPaymentRequest, aswm aswm);

    /* renamed from: a */
    void mo49569a(PromptDeviceUnlockForPaymentRequest promptDeviceUnlockForPaymentRequest, aswm aswm);

    /* renamed from: a */
    void mo49570a(RefreshSeCardsRequest refreshSeCardsRequest, aswm aswm);

    /* renamed from: a */
    void mo49571a(ReleaseResourceRequest releaseResourceRequest, aswm aswm);

    /* renamed from: a */
    void mo49572a(ReportInAppTransactionCompletedRequest reportInAppTransactionCompletedRequest, aswm aswm);

    /* renamed from: a */
    void mo49573a(ReserveResourceRequest reserveResourceRequest, aswm aswm);

    /* renamed from: a */
    void mo49574a(SendTapEventRequest sendTapEventRequest, aswm aswm);

    /* renamed from: a */
    void mo49575a(SetActiveAccountRequest setActiveAccountRequest, aswm aswm);

    /* renamed from: a */
    void mo49576a(SetFelicaTosAcceptanceRequest setFelicaTosAcceptanceRequest, aswm aswm);

    /* renamed from: a */
    void mo49577a(SetNotificationSettingsRequest setNotificationSettingsRequest, aswm aswm);

    /* renamed from: a */
    void mo49578a(SetReceivesTransactionNotificationsRequest setReceivesTransactionNotificationsRequest, aswm aswm);

    /* renamed from: a */
    void mo49579a(SetSelectedTokenRequest setSelectedTokenRequest, aswm aswm);

    /* renamed from: a */
    void mo49580a(ShowNotificationSettingsRequest showNotificationSettingsRequest, aswm aswm);

    /* renamed from: a */
    void mo49581a(ShowSecurityPromptRequest showSecurityPromptRequest, aswm aswm);

    /* renamed from: a */
    void mo49582a(TokenizeAccountRequest tokenizeAccountRequest, aswm aswm);

    /* renamed from: a */
    void mo49583a(CreatePushTokenizeSessionRequest createPushTokenizeSessionRequest, aswm aswm);

    /* renamed from: a */
    void mo49584a(PushTokenizeRequest pushTokenizeRequest, aswm aswm);

    /* renamed from: a */
    void mo49585a(GetQuickAccessWalletConfigRequest getQuickAccessWalletConfigRequest, aswm aswm);

    /* renamed from: a */
    void mo49586a(SetQuickAccessWalletCardsRequest setQuickAccessWalletCardsRequest, aswm aswm);

    /* renamed from: a */
    void mo49587a(String str, aswm aswm);

    /* renamed from: a */
    void mo49588a(byte[] bArr, aswm aswm);

    /* renamed from: b */
    void mo49589b(int i, String str, aswm aswm);

    /* renamed from: b */
    void mo49590b(aswm aswm);

    /* renamed from: b */
    void mo49591b(String str, aswm aswm);

    /* renamed from: c */
    void mo49592c(int i, String str, aswm aswm);

    /* renamed from: c */
    void mo49593c(aswm aswm);

    /* renamed from: d */
    void mo49594d(aswm aswm);

    /* renamed from: e */
    void mo49595e(aswm aswm);

    /* renamed from: f */
    void mo49596f(aswm aswm);

    /* renamed from: g */
    void mo49597g(aswm aswm);

    /* renamed from: h */
    void mo49598h(aswm aswm);

    /* renamed from: i */
    void mo49599i(aswm aswm);

    /* renamed from: j */
    void mo49600j(aswm aswm);

    /* renamed from: k */
    void mo49601k(aswm aswm);

    /* renamed from: l */
    void mo49602l(aswm aswm);

    /* renamed from: m */
    void mo49603m(aswm aswm);

    /* renamed from: n */
    void mo49604n(aswm aswm);

    /* renamed from: o */
    void mo49605o(aswm aswm);
}
