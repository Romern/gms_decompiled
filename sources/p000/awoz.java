package p000;

import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysRequest;
import com.google.android.gms.wallet.service.orchestration.AddInstrumentInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.AddInstrumentSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.BuyflowInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.BuyflowRefreshRequest;
import com.google.android.gms.wallet.service.orchestration.BuyflowSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.EmbeddedLandingPageInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.EmbeddedLandingPageSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.EmbeddedSettingsInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.EmbeddedSettingsSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.FixInstrumentInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.FixInstrumentSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.GenericSelectorInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.GenericSelectorSubmitRequest;
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
import com.google.android.gms.wallet.service.orchestration.SetupWizardInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.SetupWizardSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.StatementsViewInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.StatementsViewSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.TimelineViewInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.TimelineViewSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.UserManagementInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.UserManagementSubmitRequest;
import com.google.android.gms.wallet.service.orchestration.WebViewWidgetInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.WriteDocumentServerRequest;
import com.google.android.gms.wallet.service.p086ib.IbBuyFlowInput;
import com.google.android.gms.wallet.service.p086ib.LoadFullWalletServiceRequest;
import com.google.android.gms.wallet.service.p086ib.LoadMaskedWalletServiceRequest;
import com.google.android.gms.wallet.service.p086ib.ProcessBuyFlowResultRequest;
import com.google.android.gms.wallet.service.p087ow.CreateWalletObjectsServiceRequest;
import com.google.android.gms.wallet.service.reauth.ReauthProofTokenRequest;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import com.google.android.wallet.common.tapandpay.TapAndPayConsumerVerificationRequest;
import java.util.LinkedList;

/* renamed from: awoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awoz extends adzt {

    /* renamed from: a */
    final /* synthetic */ awpa f94791a;

    /* renamed from: b */
    private final LinkedList f94792b = new LinkedList();

    /* renamed from: c */
    private int f94793c = 0;

    public awoz(awpa awpa) {
        this.f94791a = awpa;
    }

    /* renamed from: a */
    private final boolean m80551a() {
        return this.f94793c == this.f94791a.f94794a.f94782s;
    }

    public final void handleMessage(Message message) {
        awyg awyg;
        if (message.what == 32767) {
            this.f94793c = ((Integer) message.obj).intValue() | this.f94793c;
            if (m80551a()) {
                while (this.f94792b.peek() != null) {
                    Message message2 = (Message) this.f94792b.removeLast();
                    int i = message2.what;
                    StringBuilder sb = new StringBuilder(48);
                    sb.append("Draining deferred message queue what=");
                    sb.append(i);
                    sb.toString();
                    mo33957d(message2);
                }
            }
        } else if (message.what == 32768) {
            this.f94793c = (((Integer) message.obj).intValue() ^ -1) & this.f94793c;
            if (!m80551a()) {
                awou awou = this.f94791a.f94794a;
                awou.f94774k = null;
                awou.f94776m = null;
            }
        } else if (m80551a()) {
            int i2 = 0;
            while (i2 <= 1) {
                awou awou2 = this.f94791a.f94794a;
                int i3 = message.what;
                Object obj = message.obj;
                StringBuilder sb2 = new StringBuilder(42);
                sb2.append("handleRequest paymentServiceId=");
                sb2.append(i3);
                sb2.toString();
                switch (i3) {
                    case 18:
                        awyg = awou2.f94774k.mo52695a(awou2.f94764a, (CreateWalletObjectsServiceRequest) obj);
                        break;
                    case 19:
                    case 20:
                    case 26:
                    case 62:
                    default:
                        try {
                            StringBuilder sb3 = new StringBuilder(51);
                            sb3.append("Unknown message type ");
                            sb3.append(i3);
                            sb3.append(" passed to handler.");
                            Log.e("NetworkPaymentServiceCo", sb3.toString());
                            awyg = null;
                            break;
                        } catch (RemoteException e) {
                            Log.e("NetworkPaymentServiceCo", "Failed to contact PaymentChimeraService:", e);
                            awyg = null;
                            break;
                        }
                    case 21:
                        awyg = awou2.f94776m.mo52571a(awou2.f94764a, (BuyflowInitializeRequest) obj);
                        break;
                    case 22:
                        awyg = awou2.f94776m.mo52573a(awou2.f94764a, (BuyflowSubmitRequest) obj);
                        break;
                    case 23:
                        awyg = awou2.f94776m.mo52572a(awou2.f94764a, (BuyflowRefreshRequest) obj);
                        break;
                    case 24:
                        awyg = awou2.f94776m.mo52594a(awou2.f94764a, (InstrumentManagerSubmitRequest) obj);
                        break;
                    case 25:
                        awyg = awou2.f94776m.mo52593a(awou2.f94764a, (InstrumentManagerRefreshRequest) obj);
                        break;
                    case 27:
                        awyg = awou2.f94776m.mo52600a(awou2.f94764a, (PurchaseManagerSubmitRequest) obj);
                        break;
                    case 28:
                        awyg = awou2.f94776m.mo52601a(awou2.f94764a, (SetupWizardInitializeRequest) obj);
                        break;
                    case 29:
                        awyg = awou2.f94776m.mo52602a(awou2.f94764a, (SetupWizardSubmitRequest) obj);
                        break;
                    case 30:
                        awyg = awou2.f94776m.mo52589a(awou2.f94764a, (IdCreditInitializeRequest) obj);
                        break;
                    case 31:
                        awyg = awou2.f94776m.mo52591a(awou2.f94764a, (IdCreditSubmitRequest) obj);
                        break;
                    case 32:
                        awyg = awou2.f94776m.mo52590a(awou2.f94764a, (IdCreditRefreshRequest) obj);
                        break;
                    case 33:
                        awyg = awou2.f94776m.mo52597a(awou2.f94764a, (PaymentMethodsInitializeRequest) obj);
                        break;
                    case 34:
                        awyg = awou2.f94776m.mo52598a(awou2.f94764a, (PaymentMethodsSubmitRequest) obj);
                        break;
                    case 35:
                        awyg = awou2.f94778o.mo52507a(awou2.f94764a, (ProcessBuyFlowResultRequest) obj);
                        break;
                    case 36:
                        awyg = awou2.f94778o.mo52505a(awou2.f94764a, (LoadFullWalletServiceRequest) obj);
                        break;
                    case FelicaException.TYPE_NOT_CLOSED:
                        awyg = awou2.f94776m.mo52599a(awou2.f94764a, (PurchaseManagerInitializeRequest) obj);
                        break;
                    case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                        awyg = awou2.f94778o.mo52508a(awou2.f94764a, (IbBuyFlowInput) obj);
                        break;
                    case FelicaException.TYPE_USED_BY_OTHER_APP:
                        awyg = awou2.f94776m.mo52586a(awou2.f94764a, (GenericSelectorInitializeRequest) obj);
                        break;
                    case FelicaException.TYPE_PUSH_FAILED:
                        awyg = awou2.f94776m.mo52612a(awou2.f94764a, (WriteDocumentServerRequest) obj);
                        break;
                    case 41:
                        awyg = awou2.f94776m.mo52578a(awou2.f94764a, (AddInstrumentInitializeRequest) obj);
                        break;
                    case FelicaException.TYPE_ALREADY_ACTIVATED:
                        awyg = awou2.f94776m.mo52579a(awou2.f94764a, (AddInstrumentSubmitRequest) obj);
                        break;
                    case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                        awyg = awou2.f94776m.mo52584a(awou2.f94764a, (FixInstrumentInitializeRequest) obj);
                        break;
                    case FelicaException.TYPE_RESET_FAILED:
                        awyg = awou2.f94776m.mo52585a(awou2.f94764a, (FixInstrumentSubmitRequest) obj);
                        break;
                    case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                        awyg = awou2.f94776m.mo52580a(awou2.f94764a, (EmbeddedLandingPageInitializeRequest) obj);
                        break;
                    case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                        awyg = awou2.f94776m.mo52581a(awou2.f94764a, (EmbeddedLandingPageSubmitRequest) obj);
                        break;
                    case 47:
                        awyg = awou2.f94778o.mo52506a((LoadMaskedWalletServiceRequest) obj);
                        break;
                    case 48:
                        awyg = awou2.f94776m.mo52605a(awou2.f94764a, (TimelineViewInitializeRequest) obj);
                        break;
                    case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                        awyg = awou2.f94776m.mo52606a(awou2.f94764a, (TimelineViewSubmitRequest) obj);
                        break;
                    case 50:
                        awyg = awou2.f94776m.mo52582a(awou2.f94764a, (EmbeddedSettingsInitializeRequest) obj);
                        break;
                    case 51:
                        awyg = awou2.f94776m.mo52583a(awou2.f94764a, (EmbeddedSettingsSubmitRequest) obj);
                        break;
                    case 52:
                        awyg = awou2.f94780q.mo52698a((ReauthProofTokenRequest) obj);
                        break;
                    case 53:
                        awyg = awou2.f94776m.mo52609a(awou2.f94764a, (UserManagementInitializeRequest) obj);
                        break;
                    case 54:
                        awyg = awou2.f94776m.mo52610a(awou2.f94764a, (UserManagementSubmitRequest) obj);
                        break;
                    case 55:
                        awyg = awou2.f94776m.mo52592a(awou2.f94764a, (InstrumentManagerInitializeRequest) obj);
                        break;
                    case FelicaException.TYPE_ACTIVATE_FAILED:
                        awyg = awou2.f94776m.mo52595a(awou2.f94764a, (InvoiceSummaryInitializeRequest) obj);
                        break;
                    case 57:
                        awyg = awou2.f94776m.mo52596a(awou2.f94764a, (InvoiceSummarySubmitRequest) obj);
                        break;
                    case FelicaException.TYPE_OFFLINE_CANCELED:
                        awyg = awou2.f94776m.mo52603a(awou2.f94764a, (StatementsViewInitializeRequest) obj);
                        break;
                    case FelicaException.TYPE_NOW_EXECUTING_FALP:
                        awyg = awou2.f94776m.mo52604a(awou2.f94764a, (StatementsViewSubmitRequest) obj);
                        break;
                    case FelicaException.TYPE_MFC_NOT_FOUND:
                        awyg = awou2.f94776m.mo52575a(awou2.f94764a, (TapAndPayConsumerVerificationRequest) obj);
                        break;
                    case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                        awyg = awou2.f94776m.mo52611a(awou2.f94764a, (WebViewWidgetInitializeRequest) obj);
                        break;
                    case 63:
                        awyg = awou2.f94776m.mo52587a(awou2.f94764a, (GenericSelectorSubmitRequest) obj);
                        break;
                    case 64:
                        awyg = awou2.f94776m.mo52576a(awou2.f94764a, (SetUpBiometricAuthenticationKeysRequest) obj);
                        break;
                    case KeyInformation.AES128_DES56:
                        awyg = awou2.f94776m.mo52574a(awou2.f94764a);
                        break;
                }
                if (awyg == null) {
                    Log.e("BasePaymentServiceConnection", "Null response");
                    awyg = ServerResponse.f110426d;
                }
                if (awyg.mo52756a()) {
                    awec a = awec.m79679a();
                    String a2 = awec.m79680a(awou2.f94765b, awyd.m81489a(awou2.f94764a.f110418b));
                    synchronized (a.f94196b) {
                        while (a.f94196b.contains(a2)) {
                            try {
                                a.f94196b.wait();
                            } catch (InterruptedException e2) {
                                Log.e("AndroidAccountManager", "Failed waiting for signal: ", e2);
                            }
                        }
                    }
                    i2++;
                } else {
                    Message obtain = Message.obtain(null, 0, awou2.f94773j.getAndIncrement(), 0, awyg);
                    if (!awou2.mo52429d()) {
                        for (awpc awpc : awou2.f94766c) {
                            awpc.sendMessage(Message.obtain(obtain));
                        }
                        if (obtain.arg1 > awou2.mo52427b() && awou2.f94768e.size() < 10) {
                            awou2.f94768e.add(obtain);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        } else {
            int i4 = message.what;
            StringBuilder sb4 = new StringBuilder(55);
            sb4.append("handleMessage not connected, deferring what=");
            sb4.append(i4);
            sb4.toString();
            this.f94792b.add(Message.obtain(message));
        }
    }
}
