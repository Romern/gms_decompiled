package p000;

import android.os.Parcel;
import com.felicanetworks.mfc.FelicaException;
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

/* renamed from: awtz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class awtz extends dck implements awua {
    public awtz() {
        super("com.google.android.gms.wallet.service.orchestration.IOrchestrationService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                BuyflowResponse a = mo52571a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (BuyflowInitializeRequest) dcl.m8163a(parcel, BuyflowInitializeRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a);
                return true;
            case 2:
                BuyflowResponse a2 = mo52573a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (BuyflowSubmitRequest) dcl.m8163a(parcel, BuyflowSubmitRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a2);
                return true;
            case 3:
                BuyflowResponse a3 = mo52572a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (BuyflowRefreshRequest) dcl.m8163a(parcel, BuyflowRefreshRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a3);
                return true;
            case 4:
                BuyFlowIntegratorDataResponse a4 = mo52569a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (BuyFlowIntegratorDataRequest) dcl.m8163a(parcel, BuyFlowIntegratorDataRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a4);
                return true;
            case 5:
                BuyflowResponse a5 = mo52570a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (ExecuteBuyFlowRequest) dcl.m8163a(parcel, ExecuteBuyFlowRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a5);
                return true;
            case 6:
                ServerResponse a6 = mo52592a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (InstrumentManagerInitializeRequest) dcl.m8163a(parcel, InstrumentManagerInitializeRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a6);
                return true;
            case 7:
                ServerResponse a7 = mo52594a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (InstrumentManagerSubmitRequest) dcl.m8163a(parcel, InstrumentManagerSubmitRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a7);
                return true;
            case 8:
                ServerResponse a8 = mo52593a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (InstrumentManagerRefreshRequest) dcl.m8163a(parcel, InstrumentManagerRefreshRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a8);
                return true;
            case 9:
                ServerResponse a9 = mo52577a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (InitializeBuyFlowRequest) dcl.m8163a(parcel, InitializeBuyFlowRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a9);
                return true;
            case 10:
                ServerResponse a10 = mo52599a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (PurchaseManagerInitializeRequest) dcl.m8163a(parcel, PurchaseManagerInitializeRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a10);
                return true;
            case 11:
                ServerResponse a11 = mo52600a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (PurchaseManagerSubmitRequest) dcl.m8163a(parcel, PurchaseManagerSubmitRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a11);
                return true;
            case 12:
                ServerResponse a12 = mo52589a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (IdCreditInitializeRequest) dcl.m8163a(parcel, IdCreditInitializeRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a12);
                return true;
            case 13:
                ServerResponse a13 = mo52591a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (IdCreditSubmitRequest) dcl.m8163a(parcel, IdCreditSubmitRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a13);
                return true;
            case 14:
                ServerResponse a14 = mo52590a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (IdCreditRefreshRequest) dcl.m8163a(parcel, IdCreditRefreshRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a14);
                return true;
            case 15:
                ServerResponse a15 = mo52597a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (PaymentMethodsInitializeRequest) dcl.m8163a(parcel, PaymentMethodsInitializeRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a15);
                return true;
            case 16:
                ServerResponse a16 = mo52598a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (PaymentMethodsSubmitRequest) dcl.m8163a(parcel, PaymentMethodsSubmitRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a16);
                return true;
            case 17:
                ServerResponse a17 = mo52586a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (GenericSelectorInitializeRequest) dcl.m8163a(parcel, GenericSelectorInitializeRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a17);
                return true;
            case 18:
                ServerResponse a18 = mo52587a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (GenericSelectorSubmitRequest) dcl.m8163a(parcel, GenericSelectorSubmitRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a18);
                return true;
            case 19:
                ServerResponse a19 = mo52612a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (WriteDocumentServerRequest) dcl.m8163a(parcel, WriteDocumentServerRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a19);
                return true;
            case 20:
                ServerResponse a20 = mo52578a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (AddInstrumentInitializeRequest) dcl.m8163a(parcel, AddInstrumentInitializeRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a20);
                return true;
            case 21:
                ServerResponse a21 = mo52579a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (AddInstrumentSubmitRequest) dcl.m8163a(parcel, AddInstrumentSubmitRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a21);
                return true;
            case 22:
                ServerResponse a22 = mo52584a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (FixInstrumentInitializeRequest) dcl.m8163a(parcel, FixInstrumentInitializeRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a22);
                return true;
            case 23:
                ServerResponse a23 = mo52585a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (FixInstrumentSubmitRequest) dcl.m8163a(parcel, FixInstrumentSubmitRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a23);
                return true;
            case 24:
                ServerResponse a24 = mo52601a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (SetupWizardInitializeRequest) dcl.m8163a(parcel, SetupWizardInitializeRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a24);
                return true;
            case 25:
                ServerResponse a25 = mo52602a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (SetupWizardSubmitRequest) dcl.m8163a(parcel, SetupWizardSubmitRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a25);
                return true;
            case 26:
                ServerResponse a26 = mo52580a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (EmbeddedLandingPageInitializeRequest) dcl.m8163a(parcel, EmbeddedLandingPageInitializeRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a26);
                return true;
            case 27:
                ServerResponse a27 = mo52581a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (EmbeddedLandingPageSubmitRequest) dcl.m8163a(parcel, EmbeddedLandingPageSubmitRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a27);
                return true;
            case 28:
                ServerResponse a28 = mo52605a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (TimelineViewInitializeRequest) dcl.m8163a(parcel, TimelineViewInitializeRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a28);
                return true;
            case 29:
                ServerResponse a29 = mo52606a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (TimelineViewSubmitRequest) dcl.m8163a(parcel, TimelineViewSubmitRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a29);
                return true;
            case 30:
                ServerResponse a30 = mo52582a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (EmbeddedSettingsInitializeRequest) dcl.m8163a(parcel, EmbeddedSettingsInitializeRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a30);
                return true;
            case 31:
                ServerResponse a31 = mo52583a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (EmbeddedSettingsSubmitRequest) dcl.m8163a(parcel, EmbeddedSettingsSubmitRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a31);
                return true;
            case 32:
                ServerResponse a32 = mo52609a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (UserManagementInitializeRequest) dcl.m8163a(parcel, UserManagementInitializeRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a32);
                return true;
            case 33:
                ServerResponse a33 = mo52610a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (UserManagementSubmitRequest) dcl.m8163a(parcel, UserManagementSubmitRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a33);
                return true;
            case 34:
                ServerResponse a34 = mo52595a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (InvoiceSummaryInitializeRequest) dcl.m8163a(parcel, InvoiceSummaryInitializeRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a34);
                return true;
            case 35:
                ServerResponse a35 = mo52596a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (InvoiceSummarySubmitRequest) dcl.m8163a(parcel, InvoiceSummarySubmitRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a35);
                return true;
            case 36:
                ServerResponse a36 = mo52603a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (StatementsViewInitializeRequest) dcl.m8163a(parcel, StatementsViewInitializeRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a36);
                return true;
            case FelicaException.TYPE_NOT_CLOSED:
                ServerResponse a37 = mo52604a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (StatementsViewSubmitRequest) dcl.m8163a(parcel, StatementsViewSubmitRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a37);
                return true;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                GcoreTapAndPayConsumerVerificationServerResponse a38 = mo52575a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (TapAndPayConsumerVerificationRequest) dcl.m8163a(parcel, TapAndPayConsumerVerificationRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a38);
                return true;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                ServerResponse a39 = mo52611a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (WebViewWidgetInitializeRequest) dcl.m8163a(parcel, WebViewWidgetInitializeRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a39);
                return true;
            case FelicaException.TYPE_PUSH_FAILED:
                ServerResponse a40 = mo52608a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (UpstreamSubmitRequest) dcl.m8163a(parcel, UpstreamSubmitRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a40);
                return true;
            case 41:
                ServerResponse a41 = mo52607a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (UpstreamInitializeRequest) dcl.m8163a(parcel, UpstreamInitializeRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a41);
                return true;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                ServerResponse a42 = mo52588a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (GetInstrumentAvailabilityServerRequest) dcl.m8163a(parcel, GetInstrumentAvailabilityServerRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a42);
                return true;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                SetUpBiometricAuthenticationKeysServiceResponse a43 = mo52576a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (SetUpBiometricAuthenticationKeysRequest) dcl.m8163a(parcel, SetUpBiometricAuthenticationKeysRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a43);
                return true;
            case FelicaException.TYPE_RESET_FAILED:
                FetchPaySeCardsResponse a44 = mo52574a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a44);
                return true;
            default:
                return false;
        }
    }
}
