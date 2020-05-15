package p000;

import android.nfc.NfcAdapter;
import android.os.Bundle;
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
import com.google.android.gms.tapandpay.service.TapAndPayChimeraService;

/* renamed from: atke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atke extends aswi implements aaai {

    /* renamed from: a */
    private final TapAndPayChimeraService f90404a;

    /* renamed from: b */
    private final aaag f90405b;

    /* renamed from: c */
    private final String f90406c;

    /* renamed from: d */
    private final rfz f90407d;

    /* renamed from: e */
    private final Bundle f90408e;

    public atke(TapAndPayChimeraService tapAndPayChimeraService, aaag aaag, String str, Bundle bundle) {
        this.f90404a = tapAndPayChimeraService;
        this.f90405b = aaag;
        this.f90406c = str;
        this.f90407d = rfz.m33557a(tapAndPayChimeraService);
        this.f90408e = bundle;
    }

    /* renamed from: b */
    private final void m76046b() {
        this.f90407d.mo24605a(this.f90406c);
    }

    /* renamed from: a */
    public final Status mo49543a() {
        m76046b();
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this.f90404a);
        if (defaultAdapter == null) {
            return new Status(15010);
        }
        try {
            return !defaultAdapter.enable() ? Status.f30109c : Status.f30107a;
        } catch (SecurityException e) {
            bnsl bnsl = (bnsl) TapAndPayChimeraService.f108661a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atke", "a", 595, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Do not have permission to enable nfc");
            return Status.f30109c;
        }
    }

    /* renamed from: c */
    public final void mo49592c(int i, String str, aswm aswm) {
        this.f90405b.mo16658a(new atih(str, i, this.f90406c, aswm));
    }

    /* renamed from: d */
    public final void mo49594d(aswm aswm) {
        this.f90405b.mo16658a(new atig(this, this.f90406c, aswm));
    }

    /* renamed from: e */
    public final void mo49595e(aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new ativ(this.f90406c, aswm));
    }

    /* renamed from: f */
    public final void mo49596f(aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atjh(this.f90406c, aswm));
    }

    /* renamed from: g */
    public final void mo49597g(aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atij(new AddOtherPaymentOptionRequest(1, null), this.f90406c, aswm));
    }

    /* renamed from: h */
    public final void mo49598h(aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atje(this.f90406c, aswm));
    }

    /* renamed from: i */
    public final void mo49599i(aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atjr(this.f90406c, aswm));
    }

    /* renamed from: j */
    public final void mo49600j(aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atjl(this.f90406c, aswm));
    }

    /* renamed from: k */
    public final void mo49601k(aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atkg(this.f90406c, aswm));
    }

    /* renamed from: l */
    public final void mo49602l(aswm aswm) {
        this.f90405b.mo16658a(new athz(this.f90406c, aswm));
    }

    /* renamed from: m */
    public final void mo49603m(aswm aswm) {
        this.f90405b.mo16658a(new athy(this.f90406c, aswm));
    }

    /* renamed from: n */
    public final void mo49604n(aswm aswm) {
        this.f90405b.mo16658a(new atic(this.f90406c, aswm));
    }

    /* renamed from: o */
    public final void mo49605o(aswm aswm) {
        this.f90405b.mo16658a(new atia(this.f90406c, aswm));
    }

    /* renamed from: b */
    public final void mo49589b(int i, String str, aswm aswm) {
        this.f90405b.mo16658a(new atii(str, i, this.f90406c, aswm));
    }

    /* renamed from: c */
    public final void mo49593c(aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atio(this.f90406c, aswm));
    }

    /* renamed from: b */
    public final void mo49590b(aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atix(this.f90406c, aswm));
    }

    /* renamed from: b */
    public final void mo49591b(String str, aswm aswm) {
        this.f90405b.mo16658a(new athw(str, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49544a(int i, String str, aswm aswm) {
        this.f90405b.mo16658a(new atid(str, i, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49545a(int i, String str, String str2, aswm aswm) {
        this.f90405b.mo16658a(new atie(str, i, str2, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49546a(long j, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atik(j, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49547a(aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atil(this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49548a(RetrieveInAppPaymentCredentialRequest retrieveInAppPaymentCredentialRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atjo(retrieveInAppPaymentCredentialRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49549a(SendTransmissionEventRequest sendTransmissionEventRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atjt(sendTransmissionEventRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49550a(SyncDeviceInfoRequest syncDeviceInfoRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atkd(syncDeviceInfoRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49551a(GetGlobalActionCardsRequest getGlobalActionCardsRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atiy(getGlobalActionCardsRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49552a(SelectGlobalActionCardRequest selectGlobalActionCardRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atjq(selectGlobalActionCardRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49553a(AddOtherPaymentOptionRequest addOtherPaymentOptionRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atij(addOtherPaymentOptionRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49554a(DeleteTokenRequest deleteTokenRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atim(deleteTokenRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49555a(DisableSelectedTokenRequest disableSelectedTokenRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atin(disableSelectedTokenRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49556a(EnablePayOnWearRequest enablePayOnWearRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atip(enablePayOnWearRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49557a(FirstPartyTokenizePanRequest firstPartyTokenizePanRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atiq(firstPartyTokenizePanRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49558a(GetActiveAccountRequest getActiveAccountRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atir(getActiveAccountRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49559a(GetActiveCardsForAccountRequest getActiveCardsForAccountRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atis(getActiveCardsForAccountRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49560a(GetActiveTokensForAccountRequest getActiveTokensForAccountRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atit(getActiveTokensForAccountRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49561a(GetAllCardsRequest getAllCardsRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atiu(getAllCardsRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49562a(GetAvailableOtherPaymentMethodsRequest getAvailableOtherPaymentMethodsRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atiw(getAvailableOtherPaymentMethodsRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49563a(GetLastAttestationResultRequest getLastAttestationResultRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atiz(getLastAttestationResultRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49564a(GetNotificationSettingsRequest getNotificationSettingsRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atja(getNotificationSettingsRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49565a(GetReceivesTransactionNotificationsRequest getReceivesTransactionNotificationsRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atjc(getReceivesTransactionNotificationsRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49566a(GetSeChipTransactionsRequest getSeChipTransactionsRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atjd(getSeChipTransactionsRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49567a(IsDeviceUnlockedForInAppPaymentRequest isDeviceUnlockedForInAppPaymentRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atjf(isDeviceUnlockedForInAppPaymentRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49568a(IsDeviceUnlockedForPaymentRequest isDeviceUnlockedForPaymentRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atjg(isDeviceUnlockedForPaymentRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49569a(PromptDeviceUnlockForPaymentRequest promptDeviceUnlockForPaymentRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atji(promptDeviceUnlockForPaymentRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49570a(RefreshSeCardsRequest refreshSeCardsRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atjj(refreshSeCardsRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49571a(ReleaseResourceRequest releaseResourceRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atjk(releaseResourceRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49572a(ReportInAppTransactionCompletedRequest reportInAppTransactionCompletedRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atjm(reportInAppTransactionCompletedRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49573a(ReserveResourceRequest reserveResourceRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atjn(reserveResourceRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49574a(SendTapEventRequest sendTapEventRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atjs(sendTapEventRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49575a(SetActiveAccountRequest setActiveAccountRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atjv(setActiveAccountRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49576a(SetFelicaTosAcceptanceRequest setFelicaTosAcceptanceRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atjw(setFelicaTosAcceptanceRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49577a(SetNotificationSettingsRequest setNotificationSettingsRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atjx(setNotificationSettingsRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49578a(SetReceivesTransactionNotificationsRequest setReceivesTransactionNotificationsRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atjz(setReceivesTransactionNotificationsRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49579a(SetSelectedTokenRequest setSelectedTokenRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atka(setSelectedTokenRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49580a(ShowNotificationSettingsRequest showNotificationSettingsRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atkb(showNotificationSettingsRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49581a(ShowSecurityPromptRequest showSecurityPromptRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atkc(showSecurityPromptRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49582a(TokenizeAccountRequest tokenizeAccountRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atkf(tokenizeAccountRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49583a(CreatePushTokenizeSessionRequest createPushTokenizeSessionRequest, aswm aswm) {
        this.f90405b.mo16658a(new athx(createPushTokenizeSessionRequest, this.f90406c, this.f90408e, aswm));
    }

    /* renamed from: a */
    public final void mo49584a(PushTokenizeRequest pushTokenizeRequest, aswm aswm) {
        this.f90405b.mo16658a(new atif(pushTokenizeRequest, this.f90406c, this.f90408e, aswm));
    }

    /* renamed from: a */
    public final void mo49585a(GetQuickAccessWalletConfigRequest getQuickAccessWalletConfigRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atjb(getQuickAccessWalletConfigRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49586a(SetQuickAccessWalletCardsRequest setQuickAccessWalletCardsRequest, aswm aswm) {
        m76046b();
        this.f90405b.mo16658a(new atjy(setQuickAccessWalletCardsRequest, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49587a(String str, aswm aswm) {
        this.f90405b.mo16658a(new atib(str, this.f90406c, aswm));
    }

    /* renamed from: a */
    public final void mo49588a(byte[] bArr, aswm aswm) {
        bnsl bnsl = (bnsl) TapAndPayChimeraService.f108661a.mo68390d();
        bnsl.mo68432a("atke", "a", 655, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("OOBE1");
        m76046b();
        this.f90405b.mo16658a(new atjp(bArr, this.f90406c, aswm));
    }
}
