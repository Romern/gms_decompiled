package p000;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.GetActiveAccountResponse;
import com.google.android.gms.tapandpay.firstparty.GetActiveCardsForAccountResponse;
import com.google.android.gms.tapandpay.firstparty.GetActiveTokensForAccountResponse;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;
import com.google.android.gms.tapandpay.firstparty.GetAvailableOtherPaymentMethodsResponse;
import com.google.android.gms.tapandpay.firstparty.GetFelicaTosAcceptanceResponse;
import com.google.android.gms.tapandpay.firstparty.GetLastAttestationResultResponse;
import com.google.android.gms.tapandpay.firstparty.GetNotificationSettingsResponse;
import com.google.android.gms.tapandpay.firstparty.GetSeChipTransactionsResponse;
import com.google.android.gms.tapandpay.firstparty.GetSecurityParamsResponse;
import com.google.android.gms.tapandpay.firstparty.RefreshSeCardsResponse;
import com.google.android.gms.tapandpay.firstparty.ReserveResourceResponse;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse;
import com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse;
import com.google.android.gms.tapandpay.issuer.TokenStatus;
import com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig;

/* renamed from: aswm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface aswm extends IInterface {
    /* renamed from: a */
    void mo49606a();

    /* renamed from: a */
    void mo49244a(Status status);

    /* renamed from: a */
    void mo49607a(Status status, Bundle bundle);

    /* renamed from: a */
    void mo49251a(Status status, GetActiveAccountResponse getActiveAccountResponse);

    /* renamed from: a */
    void mo49608a(Status status, GetActiveCardsForAccountResponse getActiveCardsForAccountResponse);

    /* renamed from: a */
    void mo49609a(Status status, GetActiveTokensForAccountResponse getActiveTokensForAccountResponse);

    /* renamed from: a */
    void mo49246a(Status status, GetAllCardsResponse getAllCardsResponse);

    /* renamed from: a */
    void mo49243a(Status status, GetAvailableOtherPaymentMethodsResponse getAvailableOtherPaymentMethodsResponse);

    /* renamed from: a */
    void mo49247a(Status status, GetFelicaTosAcceptanceResponse getFelicaTosAcceptanceResponse);

    /* renamed from: a */
    void mo49248a(Status status, GetLastAttestationResultResponse getLastAttestationResultResponse);

    /* renamed from: a */
    void mo49610a(Status status, GetNotificationSettingsResponse getNotificationSettingsResponse);

    /* renamed from: a */
    void mo49611a(Status status, GetSeChipTransactionsResponse getSeChipTransactionsResponse);

    /* renamed from: a */
    void mo49612a(Status status, GetSecurityParamsResponse getSecurityParamsResponse);

    /* renamed from: a */
    void mo49613a(Status status, RefreshSeCardsResponse refreshSeCardsResponse);

    /* renamed from: a */
    void mo49614a(Status status, ReserveResourceResponse reserveResourceResponse);

    /* renamed from: a */
    void mo49615a(Status status, RetrieveInAppPaymentCredentialResponse retrieveInAppPaymentCredentialResponse);

    /* renamed from: a */
    void mo49616a(Status status, GetGlobalActionCardsResponse getGlobalActionCardsResponse);

    /* renamed from: a */
    void mo49617a(Status status, TokenStatus tokenStatus);

    /* renamed from: a */
    void mo49618a(Status status, QuickAccessWalletConfig quickAccessWalletConfig);

    /* renamed from: a */
    void mo49619a(Status status, String str);

    /* renamed from: a */
    void mo49620a(Status status, boolean z);

    /* renamed from: b */
    void mo49245b(Status status);

    /* renamed from: b */
    void mo49621b(Status status, String str);

    /* renamed from: b */
    void mo49622b(Status status, boolean z);

    /* renamed from: c */
    void mo49249c(Status status);

    /* renamed from: c */
    void mo49623c(Status status, String str);

    /* renamed from: c */
    void mo49624c(Status status, boolean z);

    /* renamed from: d */
    void mo49250d(Status status);

    /* renamed from: d */
    void mo49625d(Status status, String str);

    /* renamed from: d */
    void mo49626d(Status status, boolean z);

    /* renamed from: e */
    void mo49627e(Status status);

    /* renamed from: e */
    void mo49628e(Status status, String str);

    /* renamed from: f */
    void mo49629f(Status status);

    /* renamed from: g */
    void mo49630g(Status status);

    /* renamed from: h */
    void mo49631h(Status status);

    /* renamed from: i */
    void mo49632i(Status status);

    /* renamed from: j */
    void mo49633j(Status status);

    /* renamed from: k */
    void mo49634k(Status status);

    /* renamed from: l */
    void mo49635l(Status status);

    /* renamed from: m */
    void mo49636m(Status status);

    /* renamed from: n */
    void mo49637n(Status status);
}
