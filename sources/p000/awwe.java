package p000;

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

/* renamed from: awwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awwe extends awtz {

    /* renamed from: a */
    private final awtz f95204a;

    public awwe(awtz awtz) {
        this.f95204a = awtz;
    }

    /* renamed from: a */
    public final BuyFlowIntegratorDataResponse mo52569a(BuyFlowConfig buyFlowConfig, BuyFlowIntegratorDataRequest buyFlowIntegratorDataRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52569a(buyFlowConfig, buyFlowIntegratorDataRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final BuyflowResponse mo52570a(BuyFlowConfig buyFlowConfig, ExecuteBuyFlowRequest executeBuyFlowRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52570a(buyFlowConfig, executeBuyFlowRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final BuyflowResponse mo52571a(BuyFlowConfig buyFlowConfig, BuyflowInitializeRequest buyflowInitializeRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52571a(buyFlowConfig, buyflowInitializeRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final BuyflowResponse mo52572a(BuyFlowConfig buyFlowConfig, BuyflowRefreshRequest buyflowRefreshRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52572a(buyFlowConfig, buyflowRefreshRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final BuyflowResponse mo52573a(BuyFlowConfig buyFlowConfig, BuyflowSubmitRequest buyflowSubmitRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52573a(buyFlowConfig, buyflowSubmitRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final FetchPaySeCardsResponse mo52574a(BuyFlowConfig buyFlowConfig) {
        if (awye.m81494a()) {
            return this.f95204a.mo52574a(buyFlowConfig);
        }
        return null;
    }

    /* renamed from: a */
    public final GcoreTapAndPayConsumerVerificationServerResponse mo52575a(BuyFlowConfig buyFlowConfig, TapAndPayConsumerVerificationRequest tapAndPayConsumerVerificationRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52575a(buyFlowConfig, tapAndPayConsumerVerificationRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final SetUpBiometricAuthenticationKeysServiceResponse mo52576a(BuyFlowConfig buyFlowConfig, SetUpBiometricAuthenticationKeysRequest setUpBiometricAuthenticationKeysRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52576a(buyFlowConfig, setUpBiometricAuthenticationKeysRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52577a(BuyFlowConfig buyFlowConfig, InitializeBuyFlowRequest initializeBuyFlowRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52577a(buyFlowConfig, initializeBuyFlowRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52578a(BuyFlowConfig buyFlowConfig, AddInstrumentInitializeRequest addInstrumentInitializeRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52578a(buyFlowConfig, addInstrumentInitializeRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52579a(BuyFlowConfig buyFlowConfig, AddInstrumentSubmitRequest addInstrumentSubmitRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52579a(buyFlowConfig, addInstrumentSubmitRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52580a(BuyFlowConfig buyFlowConfig, EmbeddedLandingPageInitializeRequest embeddedLandingPageInitializeRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52580a(buyFlowConfig, embeddedLandingPageInitializeRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52581a(BuyFlowConfig buyFlowConfig, EmbeddedLandingPageSubmitRequest embeddedLandingPageSubmitRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52581a(buyFlowConfig, embeddedLandingPageSubmitRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52582a(BuyFlowConfig buyFlowConfig, EmbeddedSettingsInitializeRequest embeddedSettingsInitializeRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52582a(buyFlowConfig, embeddedSettingsInitializeRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52583a(BuyFlowConfig buyFlowConfig, EmbeddedSettingsSubmitRequest embeddedSettingsSubmitRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52583a(buyFlowConfig, embeddedSettingsSubmitRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52584a(BuyFlowConfig buyFlowConfig, FixInstrumentInitializeRequest fixInstrumentInitializeRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52584a(buyFlowConfig, fixInstrumentInitializeRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52585a(BuyFlowConfig buyFlowConfig, FixInstrumentSubmitRequest fixInstrumentSubmitRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52585a(buyFlowConfig, fixInstrumentSubmitRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52586a(BuyFlowConfig buyFlowConfig, GenericSelectorInitializeRequest genericSelectorInitializeRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52586a(buyFlowConfig, genericSelectorInitializeRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52587a(BuyFlowConfig buyFlowConfig, GenericSelectorSubmitRequest genericSelectorSubmitRequest) {
        return this.f95204a.mo52587a(buyFlowConfig, genericSelectorSubmitRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52588a(BuyFlowConfig buyFlowConfig, GetInstrumentAvailabilityServerRequest getInstrumentAvailabilityServerRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52588a(buyFlowConfig, getInstrumentAvailabilityServerRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52589a(BuyFlowConfig buyFlowConfig, IdCreditInitializeRequest idCreditInitializeRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52589a(buyFlowConfig, idCreditInitializeRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52590a(BuyFlowConfig buyFlowConfig, IdCreditRefreshRequest idCreditRefreshRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52590a(buyFlowConfig, idCreditRefreshRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52591a(BuyFlowConfig buyFlowConfig, IdCreditSubmitRequest idCreditSubmitRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52591a(buyFlowConfig, idCreditSubmitRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52592a(BuyFlowConfig buyFlowConfig, InstrumentManagerInitializeRequest instrumentManagerInitializeRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52592a(buyFlowConfig, instrumentManagerInitializeRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52593a(BuyFlowConfig buyFlowConfig, InstrumentManagerRefreshRequest instrumentManagerRefreshRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52593a(buyFlowConfig, instrumentManagerRefreshRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52594a(BuyFlowConfig buyFlowConfig, InstrumentManagerSubmitRequest instrumentManagerSubmitRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52594a(buyFlowConfig, instrumentManagerSubmitRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52595a(BuyFlowConfig buyFlowConfig, InvoiceSummaryInitializeRequest invoiceSummaryInitializeRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52595a(buyFlowConfig, invoiceSummaryInitializeRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52596a(BuyFlowConfig buyFlowConfig, InvoiceSummarySubmitRequest invoiceSummarySubmitRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52596a(buyFlowConfig, invoiceSummarySubmitRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52597a(BuyFlowConfig buyFlowConfig, PaymentMethodsInitializeRequest paymentMethodsInitializeRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52597a(buyFlowConfig, paymentMethodsInitializeRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52598a(BuyFlowConfig buyFlowConfig, PaymentMethodsSubmitRequest paymentMethodsSubmitRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52598a(buyFlowConfig, paymentMethodsSubmitRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52599a(BuyFlowConfig buyFlowConfig, PurchaseManagerInitializeRequest purchaseManagerInitializeRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52599a(buyFlowConfig, purchaseManagerInitializeRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52600a(BuyFlowConfig buyFlowConfig, PurchaseManagerSubmitRequest purchaseManagerSubmitRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52600a(buyFlowConfig, purchaseManagerSubmitRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52601a(BuyFlowConfig buyFlowConfig, SetupWizardInitializeRequest setupWizardInitializeRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52601a(buyFlowConfig, setupWizardInitializeRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52602a(BuyFlowConfig buyFlowConfig, SetupWizardSubmitRequest setupWizardSubmitRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52602a(buyFlowConfig, setupWizardSubmitRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52603a(BuyFlowConfig buyFlowConfig, StatementsViewInitializeRequest statementsViewInitializeRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52603a(buyFlowConfig, statementsViewInitializeRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52604a(BuyFlowConfig buyFlowConfig, StatementsViewSubmitRequest statementsViewSubmitRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52604a(buyFlowConfig, statementsViewSubmitRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52605a(BuyFlowConfig buyFlowConfig, TimelineViewInitializeRequest timelineViewInitializeRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52605a(buyFlowConfig, timelineViewInitializeRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52606a(BuyFlowConfig buyFlowConfig, TimelineViewSubmitRequest timelineViewSubmitRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52606a(buyFlowConfig, timelineViewSubmitRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52607a(BuyFlowConfig buyFlowConfig, UpstreamInitializeRequest upstreamInitializeRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52607a(buyFlowConfig, upstreamInitializeRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52608a(BuyFlowConfig buyFlowConfig, UpstreamSubmitRequest upstreamSubmitRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52608a(buyFlowConfig, upstreamSubmitRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52609a(BuyFlowConfig buyFlowConfig, UserManagementInitializeRequest userManagementInitializeRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52609a(buyFlowConfig, userManagementInitializeRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52610a(BuyFlowConfig buyFlowConfig, UserManagementSubmitRequest userManagementSubmitRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52610a(buyFlowConfig, userManagementSubmitRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52611a(BuyFlowConfig buyFlowConfig, WebViewWidgetInitializeRequest webViewWidgetInitializeRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52611a(buyFlowConfig, webViewWidgetInitializeRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ServerResponse mo52612a(BuyFlowConfig buyFlowConfig, WriteDocumentServerRequest writeDocumentServerRequest) {
        if (awye.m81494a()) {
            return this.f95204a.mo52612a(buyFlowConfig, writeDocumentServerRequest);
        }
        return null;
    }
}
