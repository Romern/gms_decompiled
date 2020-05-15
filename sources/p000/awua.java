package p000;

import android.os.IInterface;
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

/* renamed from: awua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface awua extends IInterface {
    /* renamed from: a */
    BuyFlowIntegratorDataResponse mo52569a(BuyFlowConfig buyFlowConfig, BuyFlowIntegratorDataRequest buyFlowIntegratorDataRequest);

    /* renamed from: a */
    BuyflowResponse mo52570a(BuyFlowConfig buyFlowConfig, ExecuteBuyFlowRequest executeBuyFlowRequest);

    /* renamed from: a */
    BuyflowResponse mo52571a(BuyFlowConfig buyFlowConfig, BuyflowInitializeRequest buyflowInitializeRequest);

    /* renamed from: a */
    BuyflowResponse mo52572a(BuyFlowConfig buyFlowConfig, BuyflowRefreshRequest buyflowRefreshRequest);

    /* renamed from: a */
    BuyflowResponse mo52573a(BuyFlowConfig buyFlowConfig, BuyflowSubmitRequest buyflowSubmitRequest);

    /* renamed from: a */
    FetchPaySeCardsResponse mo52574a(BuyFlowConfig buyFlowConfig);

    /* renamed from: a */
    GcoreTapAndPayConsumerVerificationServerResponse mo52575a(BuyFlowConfig buyFlowConfig, TapAndPayConsumerVerificationRequest tapAndPayConsumerVerificationRequest);

    /* renamed from: a */
    SetUpBiometricAuthenticationKeysServiceResponse mo52576a(BuyFlowConfig buyFlowConfig, SetUpBiometricAuthenticationKeysRequest setUpBiometricAuthenticationKeysRequest);

    /* renamed from: a */
    ServerResponse mo52577a(BuyFlowConfig buyFlowConfig, InitializeBuyFlowRequest initializeBuyFlowRequest);

    /* renamed from: a */
    ServerResponse mo52578a(BuyFlowConfig buyFlowConfig, AddInstrumentInitializeRequest addInstrumentInitializeRequest);

    /* renamed from: a */
    ServerResponse mo52579a(BuyFlowConfig buyFlowConfig, AddInstrumentSubmitRequest addInstrumentSubmitRequest);

    /* renamed from: a */
    ServerResponse mo52580a(BuyFlowConfig buyFlowConfig, EmbeddedLandingPageInitializeRequest embeddedLandingPageInitializeRequest);

    /* renamed from: a */
    ServerResponse mo52581a(BuyFlowConfig buyFlowConfig, EmbeddedLandingPageSubmitRequest embeddedLandingPageSubmitRequest);

    /* renamed from: a */
    ServerResponse mo52582a(BuyFlowConfig buyFlowConfig, EmbeddedSettingsInitializeRequest embeddedSettingsInitializeRequest);

    /* renamed from: a */
    ServerResponse mo52583a(BuyFlowConfig buyFlowConfig, EmbeddedSettingsSubmitRequest embeddedSettingsSubmitRequest);

    /* renamed from: a */
    ServerResponse mo52584a(BuyFlowConfig buyFlowConfig, FixInstrumentInitializeRequest fixInstrumentInitializeRequest);

    /* renamed from: a */
    ServerResponse mo52585a(BuyFlowConfig buyFlowConfig, FixInstrumentSubmitRequest fixInstrumentSubmitRequest);

    /* renamed from: a */
    ServerResponse mo52586a(BuyFlowConfig buyFlowConfig, GenericSelectorInitializeRequest genericSelectorInitializeRequest);

    /* renamed from: a */
    ServerResponse mo52587a(BuyFlowConfig buyFlowConfig, GenericSelectorSubmitRequest genericSelectorSubmitRequest);

    /* renamed from: a */
    ServerResponse mo52588a(BuyFlowConfig buyFlowConfig, GetInstrumentAvailabilityServerRequest getInstrumentAvailabilityServerRequest);

    /* renamed from: a */
    ServerResponse mo52589a(BuyFlowConfig buyFlowConfig, IdCreditInitializeRequest idCreditInitializeRequest);

    /* renamed from: a */
    ServerResponse mo52590a(BuyFlowConfig buyFlowConfig, IdCreditRefreshRequest idCreditRefreshRequest);

    /* renamed from: a */
    ServerResponse mo52591a(BuyFlowConfig buyFlowConfig, IdCreditSubmitRequest idCreditSubmitRequest);

    /* renamed from: a */
    ServerResponse mo52592a(BuyFlowConfig buyFlowConfig, InstrumentManagerInitializeRequest instrumentManagerInitializeRequest);

    /* renamed from: a */
    ServerResponse mo52593a(BuyFlowConfig buyFlowConfig, InstrumentManagerRefreshRequest instrumentManagerRefreshRequest);

    /* renamed from: a */
    ServerResponse mo52594a(BuyFlowConfig buyFlowConfig, InstrumentManagerSubmitRequest instrumentManagerSubmitRequest);

    /* renamed from: a */
    ServerResponse mo52595a(BuyFlowConfig buyFlowConfig, InvoiceSummaryInitializeRequest invoiceSummaryInitializeRequest);

    /* renamed from: a */
    ServerResponse mo52596a(BuyFlowConfig buyFlowConfig, InvoiceSummarySubmitRequest invoiceSummarySubmitRequest);

    /* renamed from: a */
    ServerResponse mo52597a(BuyFlowConfig buyFlowConfig, PaymentMethodsInitializeRequest paymentMethodsInitializeRequest);

    /* renamed from: a */
    ServerResponse mo52598a(BuyFlowConfig buyFlowConfig, PaymentMethodsSubmitRequest paymentMethodsSubmitRequest);

    /* renamed from: a */
    ServerResponse mo52599a(BuyFlowConfig buyFlowConfig, PurchaseManagerInitializeRequest purchaseManagerInitializeRequest);

    /* renamed from: a */
    ServerResponse mo52600a(BuyFlowConfig buyFlowConfig, PurchaseManagerSubmitRequest purchaseManagerSubmitRequest);

    /* renamed from: a */
    ServerResponse mo52601a(BuyFlowConfig buyFlowConfig, SetupWizardInitializeRequest setupWizardInitializeRequest);

    /* renamed from: a */
    ServerResponse mo52602a(BuyFlowConfig buyFlowConfig, SetupWizardSubmitRequest setupWizardSubmitRequest);

    /* renamed from: a */
    ServerResponse mo52603a(BuyFlowConfig buyFlowConfig, StatementsViewInitializeRequest statementsViewInitializeRequest);

    /* renamed from: a */
    ServerResponse mo52604a(BuyFlowConfig buyFlowConfig, StatementsViewSubmitRequest statementsViewSubmitRequest);

    /* renamed from: a */
    ServerResponse mo52605a(BuyFlowConfig buyFlowConfig, TimelineViewInitializeRequest timelineViewInitializeRequest);

    /* renamed from: a */
    ServerResponse mo52606a(BuyFlowConfig buyFlowConfig, TimelineViewSubmitRequest timelineViewSubmitRequest);

    /* renamed from: a */
    ServerResponse mo52607a(BuyFlowConfig buyFlowConfig, UpstreamInitializeRequest upstreamInitializeRequest);

    /* renamed from: a */
    ServerResponse mo52608a(BuyFlowConfig buyFlowConfig, UpstreamSubmitRequest upstreamSubmitRequest);

    /* renamed from: a */
    ServerResponse mo52609a(BuyFlowConfig buyFlowConfig, UserManagementInitializeRequest userManagementInitializeRequest);

    /* renamed from: a */
    ServerResponse mo52610a(BuyFlowConfig buyFlowConfig, UserManagementSubmitRequest userManagementSubmitRequest);

    /* renamed from: a */
    ServerResponse mo52611a(BuyFlowConfig buyFlowConfig, WebViewWidgetInitializeRequest webViewWidgetInitializeRequest);

    /* renamed from: a */
    ServerResponse mo52612a(BuyFlowConfig buyFlowConfig, WriteDocumentServerRequest writeDocumentServerRequest);
}
