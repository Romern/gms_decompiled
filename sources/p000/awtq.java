package p000;

import android.content.Context;
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

/* renamed from: awtq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awtq extends awtz {

    /* renamed from: a */
    private final Context f95084a;

    /* renamed from: b */
    private final awtz f95085b;

    public awtq(Context context, awtz awtz) {
        this.f95084a = context;
        this.f95085b = awtz;
    }

    /* renamed from: a */
    public final BuyFlowIntegratorDataResponse mo52569a(BuyFlowConfig buyFlowConfig, BuyFlowIntegratorDataRequest buyFlowIntegratorDataRequest) {
        return this.f95085b.mo52569a(buyFlowConfig, buyFlowIntegratorDataRequest);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        try {
            return super.onTransact(i, parcel, parcel2, i2);
        } catch (Throwable th) {
            awye.m81493a(this.f95084a, th);
            return true;
        }
    }

    /* renamed from: a */
    public final BuyflowResponse mo52570a(BuyFlowConfig buyFlowConfig, ExecuteBuyFlowRequest executeBuyFlowRequest) {
        return this.f95085b.mo52570a(buyFlowConfig, executeBuyFlowRequest);
    }

    /* renamed from: a */
    public final BuyflowResponse mo52571a(BuyFlowConfig buyFlowConfig, BuyflowInitializeRequest buyflowInitializeRequest) {
        return this.f95085b.mo52571a(buyFlowConfig, buyflowInitializeRequest);
    }

    /* renamed from: a */
    public final BuyflowResponse mo52572a(BuyFlowConfig buyFlowConfig, BuyflowRefreshRequest buyflowRefreshRequest) {
        return this.f95085b.mo52572a(buyFlowConfig, buyflowRefreshRequest);
    }

    /* renamed from: a */
    public final BuyflowResponse mo52573a(BuyFlowConfig buyFlowConfig, BuyflowSubmitRequest buyflowSubmitRequest) {
        return this.f95085b.mo52573a(buyFlowConfig, buyflowSubmitRequest);
    }

    /* renamed from: a */
    public final FetchPaySeCardsResponse mo52574a(BuyFlowConfig buyFlowConfig) {
        return this.f95085b.mo52574a(buyFlowConfig);
    }

    /* renamed from: a */
    public final GcoreTapAndPayConsumerVerificationServerResponse mo52575a(BuyFlowConfig buyFlowConfig, TapAndPayConsumerVerificationRequest tapAndPayConsumerVerificationRequest) {
        return this.f95085b.mo52575a(buyFlowConfig, tapAndPayConsumerVerificationRequest);
    }

    /* renamed from: a */
    public final SetUpBiometricAuthenticationKeysServiceResponse mo52576a(BuyFlowConfig buyFlowConfig, SetUpBiometricAuthenticationKeysRequest setUpBiometricAuthenticationKeysRequest) {
        return this.f95085b.mo52576a(buyFlowConfig, setUpBiometricAuthenticationKeysRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52577a(BuyFlowConfig buyFlowConfig, InitializeBuyFlowRequest initializeBuyFlowRequest) {
        return this.f95085b.mo52577a(buyFlowConfig, initializeBuyFlowRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52578a(BuyFlowConfig buyFlowConfig, AddInstrumentInitializeRequest addInstrumentInitializeRequest) {
        return this.f95085b.mo52578a(buyFlowConfig, addInstrumentInitializeRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52579a(BuyFlowConfig buyFlowConfig, AddInstrumentSubmitRequest addInstrumentSubmitRequest) {
        return this.f95085b.mo52579a(buyFlowConfig, addInstrumentSubmitRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52580a(BuyFlowConfig buyFlowConfig, EmbeddedLandingPageInitializeRequest embeddedLandingPageInitializeRequest) {
        return this.f95085b.mo52580a(buyFlowConfig, embeddedLandingPageInitializeRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52581a(BuyFlowConfig buyFlowConfig, EmbeddedLandingPageSubmitRequest embeddedLandingPageSubmitRequest) {
        return this.f95085b.mo52581a(buyFlowConfig, embeddedLandingPageSubmitRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52582a(BuyFlowConfig buyFlowConfig, EmbeddedSettingsInitializeRequest embeddedSettingsInitializeRequest) {
        return this.f95085b.mo52582a(buyFlowConfig, embeddedSettingsInitializeRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52583a(BuyFlowConfig buyFlowConfig, EmbeddedSettingsSubmitRequest embeddedSettingsSubmitRequest) {
        return this.f95085b.mo52583a(buyFlowConfig, embeddedSettingsSubmitRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52584a(BuyFlowConfig buyFlowConfig, FixInstrumentInitializeRequest fixInstrumentInitializeRequest) {
        return this.f95085b.mo52584a(buyFlowConfig, fixInstrumentInitializeRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52585a(BuyFlowConfig buyFlowConfig, FixInstrumentSubmitRequest fixInstrumentSubmitRequest) {
        return this.f95085b.mo52585a(buyFlowConfig, fixInstrumentSubmitRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52586a(BuyFlowConfig buyFlowConfig, GenericSelectorInitializeRequest genericSelectorInitializeRequest) {
        return this.f95085b.mo52586a(buyFlowConfig, genericSelectorInitializeRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52587a(BuyFlowConfig buyFlowConfig, GenericSelectorSubmitRequest genericSelectorSubmitRequest) {
        return this.f95085b.mo52587a(buyFlowConfig, genericSelectorSubmitRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52588a(BuyFlowConfig buyFlowConfig, GetInstrumentAvailabilityServerRequest getInstrumentAvailabilityServerRequest) {
        return this.f95085b.mo52588a(buyFlowConfig, getInstrumentAvailabilityServerRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52589a(BuyFlowConfig buyFlowConfig, IdCreditInitializeRequest idCreditInitializeRequest) {
        return this.f95085b.mo52589a(buyFlowConfig, idCreditInitializeRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52590a(BuyFlowConfig buyFlowConfig, IdCreditRefreshRequest idCreditRefreshRequest) {
        return this.f95085b.mo52590a(buyFlowConfig, idCreditRefreshRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52591a(BuyFlowConfig buyFlowConfig, IdCreditSubmitRequest idCreditSubmitRequest) {
        return this.f95085b.mo52591a(buyFlowConfig, idCreditSubmitRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52592a(BuyFlowConfig buyFlowConfig, InstrumentManagerInitializeRequest instrumentManagerInitializeRequest) {
        return this.f95085b.mo52592a(buyFlowConfig, instrumentManagerInitializeRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52593a(BuyFlowConfig buyFlowConfig, InstrumentManagerRefreshRequest instrumentManagerRefreshRequest) {
        return this.f95085b.mo52593a(buyFlowConfig, instrumentManagerRefreshRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52594a(BuyFlowConfig buyFlowConfig, InstrumentManagerSubmitRequest instrumentManagerSubmitRequest) {
        return this.f95085b.mo52594a(buyFlowConfig, instrumentManagerSubmitRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52595a(BuyFlowConfig buyFlowConfig, InvoiceSummaryInitializeRequest invoiceSummaryInitializeRequest) {
        return this.f95085b.mo52595a(buyFlowConfig, invoiceSummaryInitializeRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52596a(BuyFlowConfig buyFlowConfig, InvoiceSummarySubmitRequest invoiceSummarySubmitRequest) {
        return this.f95085b.mo52596a(buyFlowConfig, invoiceSummarySubmitRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52597a(BuyFlowConfig buyFlowConfig, PaymentMethodsInitializeRequest paymentMethodsInitializeRequest) {
        return this.f95085b.mo52597a(buyFlowConfig, paymentMethodsInitializeRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52598a(BuyFlowConfig buyFlowConfig, PaymentMethodsSubmitRequest paymentMethodsSubmitRequest) {
        return this.f95085b.mo52598a(buyFlowConfig, paymentMethodsSubmitRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52599a(BuyFlowConfig buyFlowConfig, PurchaseManagerInitializeRequest purchaseManagerInitializeRequest) {
        return this.f95085b.mo52599a(buyFlowConfig, purchaseManagerInitializeRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52600a(BuyFlowConfig buyFlowConfig, PurchaseManagerSubmitRequest purchaseManagerSubmitRequest) {
        return this.f95085b.mo52600a(buyFlowConfig, purchaseManagerSubmitRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52601a(BuyFlowConfig buyFlowConfig, SetupWizardInitializeRequest setupWizardInitializeRequest) {
        return this.f95085b.mo52601a(buyFlowConfig, setupWizardInitializeRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52602a(BuyFlowConfig buyFlowConfig, SetupWizardSubmitRequest setupWizardSubmitRequest) {
        return this.f95085b.mo52602a(buyFlowConfig, setupWizardSubmitRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52603a(BuyFlowConfig buyFlowConfig, StatementsViewInitializeRequest statementsViewInitializeRequest) {
        return this.f95085b.mo52603a(buyFlowConfig, statementsViewInitializeRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52604a(BuyFlowConfig buyFlowConfig, StatementsViewSubmitRequest statementsViewSubmitRequest) {
        return this.f95085b.mo52604a(buyFlowConfig, statementsViewSubmitRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52605a(BuyFlowConfig buyFlowConfig, TimelineViewInitializeRequest timelineViewInitializeRequest) {
        return this.f95085b.mo52605a(buyFlowConfig, timelineViewInitializeRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52606a(BuyFlowConfig buyFlowConfig, TimelineViewSubmitRequest timelineViewSubmitRequest) {
        return this.f95085b.mo52606a(buyFlowConfig, timelineViewSubmitRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52607a(BuyFlowConfig buyFlowConfig, UpstreamInitializeRequest upstreamInitializeRequest) {
        return this.f95085b.mo52607a(buyFlowConfig, upstreamInitializeRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52608a(BuyFlowConfig buyFlowConfig, UpstreamSubmitRequest upstreamSubmitRequest) {
        return this.f95085b.mo52608a(buyFlowConfig, upstreamSubmitRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52609a(BuyFlowConfig buyFlowConfig, UserManagementInitializeRequest userManagementInitializeRequest) {
        return this.f95085b.mo52609a(buyFlowConfig, userManagementInitializeRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52610a(BuyFlowConfig buyFlowConfig, UserManagementSubmitRequest userManagementSubmitRequest) {
        return this.f95085b.mo52610a(buyFlowConfig, userManagementSubmitRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52611a(BuyFlowConfig buyFlowConfig, WebViewWidgetInitializeRequest webViewWidgetInitializeRequest) {
        return this.f95085b.mo52611a(buyFlowConfig, webViewWidgetInitializeRequest);
    }

    /* renamed from: a */
    public final ServerResponse mo52612a(BuyFlowConfig buyFlowConfig, WriteDocumentServerRequest writeDocumentServerRequest) {
        return this.f95085b.mo52612a(buyFlowConfig, writeDocumentServerRequest);
    }
}
