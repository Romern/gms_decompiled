package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
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

/* renamed from: aswk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aswk extends dcj implements aswm {
    public aswk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
    }

    /* renamed from: a */
    public final void mo49606a() {
        mo8530c(10, mo8529bj());
    }

    /* renamed from: b */
    public final void mo49245b(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(40, bj);
    }

    /* renamed from: c */
    public final void mo49249c(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(2, bj);
    }

    /* renamed from: d */
    public final void mo49250d(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(5, bj);
    }

    /* renamed from: e */
    public final void mo49627e(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(6, bj);
    }

    /* renamed from: f */
    public final void mo49629f(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(9, bj);
    }

    /* renamed from: g */
    public final void mo49630g(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(12, bj);
    }

    /* renamed from: h */
    public final void mo49631h(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(14, bj);
    }

    /* renamed from: i */
    public final void mo49632i(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(22, bj);
    }

    /* renamed from: j */
    public final void mo49633j(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(25, bj);
    }

    /* renamed from: k */
    public final void mo49634k(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(29, bj);
    }

    /* renamed from: l */
    public final void mo49635l(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(37, bj);
    }

    /* renamed from: m */
    public final void mo49636m(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(44, bj);
    }

    /* renamed from: n */
    public final void mo49637n(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(45, bj);
    }

    /* renamed from: a */
    public final void mo49244a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(38, bj);
    }

    /* renamed from: b */
    public final void mo49621b(Status status, String str) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeString(str);
        mo8530c(19, bj);
    }

    /* renamed from: c */
    public final void mo49623c(Status status, String str) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeString(str);
        mo8530c(23, bj);
    }

    /* renamed from: d */
    public final void mo49625d(Status status, String str) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeString(str);
        mo8530c(24, bj);
    }

    /* renamed from: e */
    public final void mo49628e(Status status, String str) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeString(str);
        mo8530c(43, bj);
    }

    /* renamed from: a */
    public final void mo49607a(Status status, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, bundle);
        mo8530c(3, bj);
    }

    /* renamed from: b */
    public final void mo49622b(Status status, boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8166a(bj, z);
        mo8530c(13, bj);
    }

    /* renamed from: c */
    public final void mo49624c(Status status, boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8166a(bj, z);
        mo8530c(21, bj);
    }

    /* renamed from: d */
    public final void mo49626d(Status status, boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8166a(bj, z);
        mo8530c(26, bj);
    }

    /* renamed from: a */
    public final void mo49251a(Status status, GetActiveAccountResponse getActiveAccountResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, getActiveAccountResponse);
        mo8530c(8, bj);
    }

    /* renamed from: a */
    public final void mo49608a(Status status, GetActiveCardsForAccountResponse getActiveCardsForAccountResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, getActiveCardsForAccountResponse);
        mo8530c(15, bj);
    }

    /* renamed from: a */
    public final void mo49609a(Status status, GetActiveTokensForAccountResponse getActiveTokensForAccountResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, getActiveTokensForAccountResponse);
        mo8530c(31, bj);
    }

    /* renamed from: a */
    public final void mo49246a(Status status, GetAllCardsResponse getAllCardsResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, getAllCardsResponse);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo49243a(Status status, GetAvailableOtherPaymentMethodsResponse getAvailableOtherPaymentMethodsResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, getAvailableOtherPaymentMethodsResponse);
        mo8530c(30, bj);
    }

    /* renamed from: a */
    public final void mo49247a(Status status, GetFelicaTosAcceptanceResponse getFelicaTosAcceptanceResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, getFelicaTosAcceptanceResponse);
        mo8530c(39, bj);
    }

    /* renamed from: a */
    public final void mo49248a(Status status, GetLastAttestationResultResponse getLastAttestationResultResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, getLastAttestationResultResponse);
        mo8530c(46, bj);
    }

    /* renamed from: a */
    public final void mo49610a(Status status, GetNotificationSettingsResponse getNotificationSettingsResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, getNotificationSettingsResponse);
        mo8530c(28, bj);
    }

    /* renamed from: a */
    public final void mo49611a(Status status, GetSeChipTransactionsResponse getSeChipTransactionsResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, getSeChipTransactionsResponse);
        mo8530c(35, bj);
    }

    /* renamed from: a */
    public final void mo49612a(Status status, GetSecurityParamsResponse getSecurityParamsResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, getSecurityParamsResponse);
        mo8530c(27, bj);
    }

    /* renamed from: a */
    public final void mo49613a(Status status, RefreshSeCardsResponse refreshSeCardsResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, refreshSeCardsResponse);
        mo8530c(41, bj);
    }

    /* renamed from: a */
    public final void mo49614a(Status status, ReserveResourceResponse reserveResourceResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, reserveResourceResponse);
        mo8530c(36, bj);
    }

    /* renamed from: a */
    public final void mo49615a(Status status, RetrieveInAppPaymentCredentialResponse retrieveInAppPaymentCredentialResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, retrieveInAppPaymentCredentialResponse);
        mo8530c(17, bj);
    }

    /* renamed from: a */
    public final void mo49616a(Status status, GetGlobalActionCardsResponse getGlobalActionCardsResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, getGlobalActionCardsResponse);
        mo8530c(42, bj);
    }

    /* renamed from: a */
    public final void mo49617a(Status status, TokenStatus tokenStatus) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, tokenStatus);
        mo8530c(20, bj);
    }

    /* renamed from: a */
    public final void mo49618a(Status status, QuickAccessWalletConfig quickAccessWalletConfig) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, quickAccessWalletConfig);
        mo8530c(47, bj);
    }

    /* renamed from: a */
    public final void mo49619a(Status status, String str) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeString(str);
        mo8530c(18, bj);
    }

    /* renamed from: a */
    public final void mo49620a(Status status, boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8166a(bj, z);
        mo8530c(11, bj);
    }
}
