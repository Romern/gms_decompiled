package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.wallet.firstparty.ExecuteBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.InitializeBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysRequest;
import com.google.android.gms.wallet.service.orchestration.AddInstrumentInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.AddInstrumentSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.BuyFlowIntegratorDataRequest;
import com.google.android.gms.wallet.service.orchestration.BuyFlowIntegratorDataResponse;
import com.google.android.gms.wallet.service.orchestration.BuyflowInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.BuyflowRefreshRequest;
import com.google.android.gms.wallet.service.orchestration.BuyflowResponse;
import com.google.android.gms.wallet.service.orchestration.BuyflowSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.EmbeddedLandingPageInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.EmbeddedLandingPageSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.EmbeddedSettingsInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.EmbeddedSettingsSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.FetchPaySeCardsResponse;
import com.google.android.gms.wallet.service.orchestration.FixInstrumentInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.FixInstrumentSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.GcoreTapAndPayConsumerVerificationServerResponse;
import com.google.android.gms.wallet.service.orchestration.GenericSelectorInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.GenericSelectorSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.GetInstrumentAvailabilityServerRequest;
import com.google.android.gms.wallet.service.orchestration.IdCreditInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.IdCreditRefreshRequest;
import com.google.android.gms.wallet.service.orchestration.IdCreditSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.InstrumentManagerInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.InstrumentManagerRefreshRequest;
import com.google.android.gms.wallet.service.orchestration.InstrumentManagerSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.InvoiceSummaryInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.InvoiceSummarySubmitRequest;
import com.google.android.gms.wallet.service.orchestration.PaymentMethodsInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.PaymentMethodsSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.PurchaseManagerInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.PurchaseManagerSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.SetUpBiometricAuthenticationKeysServiceResponse;
import com.google.android.gms.wallet.service.orchestration.SetupWizardInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.SetupWizardSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.StatementsViewInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.StatementsViewSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.TimelineViewInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.TimelineViewSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.UpstreamInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.UpstreamSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.UserManagementInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.UserManagementSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.WebViewWidgetInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.WriteDocumentServerRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import com.google.android.wallet.common.tapandpay.TapAndPayConsumerVerificationRequest;

/* renamed from: awty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awty extends dcj implements awua {
    public awty(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.service.orchestration.IOrchestrationService");
    }

    /* renamed from: a */
    public final BuyFlowIntegratorDataResponse mo52569a(BuyFlowConfig buyFlowConfig, BuyFlowIntegratorDataRequest buyFlowIntegratorDataRequest) {
        throw null;
    }

    /* renamed from: a */
    public final BuyflowResponse mo52570a(BuyFlowConfig buyFlowConfig, ExecuteBuyFlowRequest executeBuyFlowRequest) {
        throw null;
    }

    /* renamed from: a */
    public final ServerResponse mo52577a(BuyFlowConfig buyFlowConfig, InitializeBuyFlowRequest initializeBuyFlowRequest) {
        throw null;
    }

    /* renamed from: a */
    public final ServerResponse mo52588a(BuyFlowConfig buyFlowConfig, GetInstrumentAvailabilityServerRequest getInstrumentAvailabilityServerRequest) {
        throw null;
    }

    /* renamed from: a */
    public final ServerResponse mo52607a(BuyFlowConfig buyFlowConfig, UpstreamInitializeRequest upstreamInitializeRequest) {
        throw null;
    }

    /* renamed from: a */
    public final ServerResponse mo52608a(BuyFlowConfig buyFlowConfig, UpstreamSubmitRequest upstreamSubmitRequest) {
        throw null;
    }

    /* renamed from: a */
    public final BuyflowResponse mo52571a(BuyFlowConfig buyFlowConfig, BuyflowInitializeRequest buyflowInitializeRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, buyflowInitializeRequest);
        Parcel a = mo8526a(1, bj);
        BuyflowResponse buyflowResponse = (BuyflowResponse) dcl.m8163a(a, BuyflowResponse.CREATOR);
        a.recycle();
        return buyflowResponse;
    }

    /* renamed from: a */
    public final BuyflowResponse mo52572a(BuyFlowConfig buyFlowConfig, BuyflowRefreshRequest buyflowRefreshRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, buyflowRefreshRequest);
        Parcel a = mo8526a(3, bj);
        BuyflowResponse buyflowResponse = (BuyflowResponse) dcl.m8163a(a, BuyflowResponse.CREATOR);
        a.recycle();
        return buyflowResponse;
    }

    /* renamed from: a */
    public final BuyflowResponse mo52573a(BuyFlowConfig buyFlowConfig, BuyflowSubmitRequest buyflowSubmitRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, buyflowSubmitRequest);
        Parcel a = mo8526a(2, bj);
        BuyflowResponse buyflowResponse = (BuyflowResponse) dcl.m8163a(a, BuyflowResponse.CREATOR);
        a.recycle();
        return buyflowResponse;
    }

    /* renamed from: a */
    public final FetchPaySeCardsResponse mo52574a(BuyFlowConfig buyFlowConfig) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        Parcel a = mo8526a(44, bj);
        FetchPaySeCardsResponse fetchPaySeCardsResponse = (FetchPaySeCardsResponse) dcl.m8163a(a, FetchPaySeCardsResponse.CREATOR);
        a.recycle();
        return fetchPaySeCardsResponse;
    }

    /* renamed from: a */
    public final GcoreTapAndPayConsumerVerificationServerResponse mo52575a(BuyFlowConfig buyFlowConfig, TapAndPayConsumerVerificationRequest tapAndPayConsumerVerificationRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, tapAndPayConsumerVerificationRequest);
        Parcel a = mo8526a(38, bj);
        GcoreTapAndPayConsumerVerificationServerResponse gcoreTapAndPayConsumerVerificationServerResponse = (GcoreTapAndPayConsumerVerificationServerResponse) dcl.m8163a(a, GcoreTapAndPayConsumerVerificationServerResponse.CREATOR);
        a.recycle();
        return gcoreTapAndPayConsumerVerificationServerResponse;
    }

    /* renamed from: a */
    public final SetUpBiometricAuthenticationKeysServiceResponse mo52576a(BuyFlowConfig buyFlowConfig, SetUpBiometricAuthenticationKeysRequest setUpBiometricAuthenticationKeysRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, setUpBiometricAuthenticationKeysRequest);
        Parcel a = mo8526a(43, bj);
        SetUpBiometricAuthenticationKeysServiceResponse setUpBiometricAuthenticationKeysServiceResponse = (SetUpBiometricAuthenticationKeysServiceResponse) dcl.m8163a(a, SetUpBiometricAuthenticationKeysServiceResponse.CREATOR);
        a.recycle();
        return setUpBiometricAuthenticationKeysServiceResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52578a(BuyFlowConfig buyFlowConfig, AddInstrumentInitializeRequest addInstrumentInitializeRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, addInstrumentInitializeRequest);
        Parcel a = mo8526a(20, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52579a(BuyFlowConfig buyFlowConfig, AddInstrumentSubmitRequest addInstrumentSubmitRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, addInstrumentSubmitRequest);
        Parcel a = mo8526a(21, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52580a(BuyFlowConfig buyFlowConfig, EmbeddedLandingPageInitializeRequest embeddedLandingPageInitializeRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, embeddedLandingPageInitializeRequest);
        Parcel a = mo8526a(26, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52581a(BuyFlowConfig buyFlowConfig, EmbeddedLandingPageSubmitRequest embeddedLandingPageSubmitRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, embeddedLandingPageSubmitRequest);
        Parcel a = mo8526a(27, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52582a(BuyFlowConfig buyFlowConfig, EmbeddedSettingsInitializeRequest embeddedSettingsInitializeRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, embeddedSettingsInitializeRequest);
        Parcel a = mo8526a(30, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52583a(BuyFlowConfig buyFlowConfig, EmbeddedSettingsSubmitRequest embeddedSettingsSubmitRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, embeddedSettingsSubmitRequest);
        Parcel a = mo8526a(31, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52584a(BuyFlowConfig buyFlowConfig, FixInstrumentInitializeRequest fixInstrumentInitializeRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, fixInstrumentInitializeRequest);
        Parcel a = mo8526a(22, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52585a(BuyFlowConfig buyFlowConfig, FixInstrumentSubmitRequest fixInstrumentSubmitRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, fixInstrumentSubmitRequest);
        Parcel a = mo8526a(23, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52586a(BuyFlowConfig buyFlowConfig, GenericSelectorInitializeRequest genericSelectorInitializeRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, genericSelectorInitializeRequest);
        Parcel a = mo8526a(17, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52587a(BuyFlowConfig buyFlowConfig, GenericSelectorSubmitRequest genericSelectorSubmitRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, genericSelectorSubmitRequest);
        Parcel a = mo8526a(18, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52589a(BuyFlowConfig buyFlowConfig, IdCreditInitializeRequest idCreditInitializeRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, idCreditInitializeRequest);
        Parcel a = mo8526a(12, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52590a(BuyFlowConfig buyFlowConfig, IdCreditRefreshRequest idCreditRefreshRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, idCreditRefreshRequest);
        Parcel a = mo8526a(14, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52591a(BuyFlowConfig buyFlowConfig, IdCreditSubmitRequest idCreditSubmitRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, idCreditSubmitRequest);
        Parcel a = mo8526a(13, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52592a(BuyFlowConfig buyFlowConfig, InstrumentManagerInitializeRequest instrumentManagerInitializeRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, instrumentManagerInitializeRequest);
        Parcel a = mo8526a(6, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52593a(BuyFlowConfig buyFlowConfig, InstrumentManagerRefreshRequest instrumentManagerRefreshRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, instrumentManagerRefreshRequest);
        Parcel a = mo8526a(8, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52594a(BuyFlowConfig buyFlowConfig, InstrumentManagerSubmitRequest instrumentManagerSubmitRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, instrumentManagerSubmitRequest);
        Parcel a = mo8526a(7, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52595a(BuyFlowConfig buyFlowConfig, InvoiceSummaryInitializeRequest invoiceSummaryInitializeRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, invoiceSummaryInitializeRequest);
        Parcel a = mo8526a(34, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52596a(BuyFlowConfig buyFlowConfig, InvoiceSummarySubmitRequest invoiceSummarySubmitRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, invoiceSummarySubmitRequest);
        Parcel a = mo8526a(35, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52597a(BuyFlowConfig buyFlowConfig, PaymentMethodsInitializeRequest paymentMethodsInitializeRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, paymentMethodsInitializeRequest);
        Parcel a = mo8526a(15, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52598a(BuyFlowConfig buyFlowConfig, PaymentMethodsSubmitRequest paymentMethodsSubmitRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, paymentMethodsSubmitRequest);
        Parcel a = mo8526a(16, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52599a(BuyFlowConfig buyFlowConfig, PurchaseManagerInitializeRequest purchaseManagerInitializeRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, purchaseManagerInitializeRequest);
        Parcel a = mo8526a(10, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52600a(BuyFlowConfig buyFlowConfig, PurchaseManagerSubmitRequest purchaseManagerSubmitRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, purchaseManagerSubmitRequest);
        Parcel a = mo8526a(11, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52601a(BuyFlowConfig buyFlowConfig, SetupWizardInitializeRequest setupWizardInitializeRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, setupWizardInitializeRequest);
        Parcel a = mo8526a(24, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52602a(BuyFlowConfig buyFlowConfig, SetupWizardSubmitRequest setupWizardSubmitRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, setupWizardSubmitRequest);
        Parcel a = mo8526a(25, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52603a(BuyFlowConfig buyFlowConfig, StatementsViewInitializeRequest statementsViewInitializeRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, statementsViewInitializeRequest);
        Parcel a = mo8526a(36, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52604a(BuyFlowConfig buyFlowConfig, StatementsViewSubmitRequest statementsViewSubmitRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, statementsViewSubmitRequest);
        Parcel a = mo8526a(37, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52605a(BuyFlowConfig buyFlowConfig, TimelineViewInitializeRequest timelineViewInitializeRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, timelineViewInitializeRequest);
        Parcel a = mo8526a(28, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52606a(BuyFlowConfig buyFlowConfig, TimelineViewSubmitRequest timelineViewSubmitRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, timelineViewSubmitRequest);
        Parcel a = mo8526a(29, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52609a(BuyFlowConfig buyFlowConfig, UserManagementInitializeRequest userManagementInitializeRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, userManagementInitializeRequest);
        Parcel a = mo8526a(32, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52610a(BuyFlowConfig buyFlowConfig, UserManagementSubmitRequest userManagementSubmitRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, userManagementSubmitRequest);
        Parcel a = mo8526a(33, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52611a(BuyFlowConfig buyFlowConfig, WebViewWidgetInitializeRequest webViewWidgetInitializeRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, webViewWidgetInitializeRequest);
        Parcel a = mo8526a(39, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }

    /* renamed from: a */
    public final ServerResponse mo52612a(BuyFlowConfig buyFlowConfig, WriteDocumentServerRequest writeDocumentServerRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, writeDocumentServerRequest);
        Parcel a = mo8526a(19, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }
}
