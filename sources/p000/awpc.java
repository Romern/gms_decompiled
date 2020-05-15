package p000;

import android.os.Message;
import android.util.Log;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.google.android.gms.wallet.service.orchestration.BuyflowResponse;
import com.google.android.gms.wallet.service.orchestration.FetchPaySeCardsResponse;
import com.google.android.gms.wallet.service.orchestration.GcoreTapAndPayConsumerVerificationServerResponse;
import com.google.android.gms.wallet.service.orchestration.SetUpBiometricAuthenticationKeysServiceResponse;
import com.google.android.gms.wallet.service.p086ib.LoadFullWalletServiceResponse;
import com.google.android.gms.wallet.service.p086ib.LoadMaskedWalletServiceResponse;
import com.google.android.gms.wallet.service.p086ib.ProcessBuyFlowResultResponse;
import com.google.android.gms.wallet.service.p086ib.RefreshUserSpecificDataResponse;
import com.google.android.gms.wallet.service.reauth.ReauthProofTokenResponse;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class awpc extends adzt {

    /* renamed from: b */
    public int f94795b = 0;

    /* renamed from: c */
    public boolean f94796c = true;

    /* renamed from: a */
    private final void m80582a(ServerResponse serverResponse) {
        int c = serverResponse.mo60050c();
        if (c == 5) {
            mo51898c();
        } else if (c == 6) {
            mo51894a();
        } else if (c == 17) {
            mo52348a((bltt) serverResponse.mo60052e());
        } else if (c == 30) {
            btrp btrp = (btrp) serverResponse.mo60052e();
            mo52349d();
        } else if (c == 39) {
            mo51897b();
        } else if (c == 77) {
            mo52391a((bmri) serverResponse.mo60052e());
        } else if (c == 36) {
            mo52291a((bmsc) serverResponse.mo60052e());
        } else if (c != 37) {
            switch (c) {
                case 41:
                    mo52373a((bwkb) serverResponse.mo60052e());
                    return;
                case FelicaException.TYPE_ALREADY_ACTIVATED:
                    mo52436a((bwgn) serverResponse.mo60052e());
                    return;
                case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                    mo52437a((bwgr) serverResponse.mo60052e());
                    return;
                case FelicaException.TYPE_RESET_FAILED:
                    mo52274a((bmrk) serverResponse.mo60052e());
                    return;
                case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                    mo52275a((bmrr) serverResponse.mo60052e());
                    return;
                case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                    bmrp bmrp = (bmrp) serverResponse.mo60052e();
                    return;
                case 47:
                    mo52358a((bmsj) serverResponse.mo60052e());
                    return;
                case 48:
                    mo52359a((bmso) serverResponse.mo60052e());
                    return;
                default:
                    switch (c) {
                        case 51:
                            mo52372a((bwjx) serverResponse.mo60052e());
                            return;
                        case 52:
                            mo52390a((bmrc) serverResponse.mo60052e());
                            return;
                        case 53:
                            mo52273a((bmqv) serverResponse.mo60052e());
                            return;
                        case 54:
                            mo51895a((blxn) serverResponse.mo60052e());
                            return;
                        case 55:
                            mo51896a((blxr) serverResponse.mo60052e());
                            return;
                        case FelicaException.TYPE_ACTIVATE_FAILED:
                            mo52253a((bwjl) serverResponse.mo60052e());
                            return;
                        case 57:
                            mo52254a((bwjp) serverResponse.mo60052e());
                            return;
                        default:
                            switch (c) {
                                case FelicaException.TYPE_MFC_NOT_FOUND:
                                    mo52175a((bwiz) serverResponse.mo60052e());
                                    return;
                                case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                                    mo52176a((bwjd) serverResponse.mo60052e());
                                    return;
                                case 62:
                                    mo52438a((bwkq) serverResponse.mo60052e());
                                    return;
                                case 63:
                                    mo52439a((bwku) serverResponse.mo60052e());
                                    return;
                                case 64:
                                    mo52183a((bwjf) serverResponse.mo60052e());
                                    return;
                                case KeyInformation.AES128_DES56:
                                    mo52184a((bwjj) serverResponse.mo60052e());
                                    return;
                                case 66:
                                    mo52440a((bwle) serverResponse.mo60052e());
                                    return;
                                case KeyInformation.AES128_DES112:
                                    mo52441a((bwli) serverResponse.mo60052e());
                                    return;
                                case 68:
                                    mo52289a((bmrv) serverResponse.mo60052e());
                                    return;
                                case 69:
                                    mo52343a((bwjr) serverResponse.mo60052e());
                                    return;
                                case 70:
                                    mo52344a((bwju) serverResponse.mo60052e());
                                    return;
                                case 71:
                                    bwkm bwkm = (bwkm) serverResponse.mo60052e();
                                    return;
                                case 72:
                                    bwko bwko = (bwko) serverResponse.mo60052e();
                                    return;
                                case 73:
                                    mo52442a((bwlk) serverResponse.mo60052e());
                                    return;
                                case 74:
                                    bwky bwky = (bwky) serverResponse.mo60052e();
                                    return;
                                case 75:
                                    bwla bwla = (bwla) serverResponse.mo60052e();
                                    return;
                                default:
                                    int c2 = serverResponse.mo60050c();
                                    StringBuilder sb = new StringBuilder(39);
                                    sb.append("Unknown ServerResponse type=");
                                    sb.append(c2);
                                    Log.e("PaymentServiceResponseH", sb.toString());
                                    mo51897b();
                                    return;
                            }
                    }
            }
        } else {
            mo52290a((bmsa) serverResponse.mo60052e());
        }
    }

    /* renamed from: a */
    public void mo51894a() {
    }

    /* renamed from: a */
    public void mo52348a(bltt bltt) {
    }

    /* renamed from: a */
    public void mo51895a(blxn blxn) {
    }

    /* renamed from: a */
    public void mo51896a(blxr blxr) {
    }

    /* renamed from: a */
    public void mo52020a(blxx blxx, byaa byaa, int i) {
    }

    /* renamed from: a */
    public void mo52021a(blyp blyp, byaa byaa) {
    }

    /* renamed from: a */
    public void mo52022a(blyr blyr, byaa byaa) {
    }

    /* renamed from: a */
    public void mo52273a(bmqv bmqv) {
    }

    /* renamed from: a */
    public void mo52390a(bmrc bmrc) {
    }

    /* renamed from: a */
    public void mo52391a(bmri bmri) {
    }

    /* renamed from: a */
    public void mo52274a(bmrk bmrk) {
    }

    /* renamed from: a */
    public void mo52275a(bmrr bmrr) {
    }

    /* renamed from: a */
    public void mo52289a(bmrv bmrv) {
    }

    /* renamed from: a */
    public void mo52290a(bmsa bmsa) {
    }

    /* renamed from: a */
    public void mo52291a(bmsc bmsc) {
    }

    /* renamed from: a */
    public void mo52358a(bmsj bmsj) {
    }

    /* renamed from: a */
    public void mo52359a(bmso bmso) {
    }

    /* renamed from: a */
    public void mo52436a(bwgn bwgn) {
    }

    /* renamed from: a */
    public void mo52437a(bwgr bwgr) {
    }

    /* renamed from: a */
    public void mo52175a(bwiz bwiz) {
    }

    /* renamed from: a */
    public void mo52176a(bwjd bwjd) {
    }

    /* renamed from: a */
    public void mo52183a(bwjf bwjf) {
    }

    /* renamed from: a */
    public void mo52184a(bwjj bwjj) {
    }

    /* renamed from: a */
    public void mo52253a(bwjl bwjl) {
    }

    /* renamed from: a */
    public void mo52254a(bwjp bwjp) {
    }

    /* renamed from: a */
    public void mo52343a(bwjr bwjr) {
    }

    /* renamed from: a */
    public void mo52344a(bwju bwju) {
    }

    /* renamed from: a */
    public void mo52372a(bwjx bwjx) {
    }

    /* renamed from: a */
    public void mo52373a(bwkb bwkb) {
    }

    /* renamed from: a */
    public void mo52438a(bwkq bwkq) {
    }

    /* renamed from: a */
    public void mo52439a(bwku bwku) {
    }

    /* renamed from: a */
    public void mo52440a(bwle bwle) {
    }

    /* renamed from: a */
    public void mo52441a(bwli bwli) {
    }

    /* renamed from: a */
    public void mo52442a(bwlk bwlk) {
    }

    /* renamed from: a */
    public void mo52268a(LoadFullWalletServiceResponse loadFullWalletServiceResponse) {
    }

    /* renamed from: a */
    public void mo52269a(LoadMaskedWalletServiceResponse loadMaskedWalletServiceResponse) {
    }

    /* renamed from: a */
    public void mo52266a(ProcessBuyFlowResultResponse processBuyFlowResultResponse) {
    }

    /* renamed from: a */
    public void mo52267a(RefreshUserSpecificDataResponse refreshUserSpecificDataResponse) {
    }

    /* renamed from: a */
    public void mo52023a(FetchPaySeCardsResponse fetchPaySeCardsResponse) {
    }

    /* renamed from: a */
    public void mo52443a(GcoreTapAndPayConsumerVerificationServerResponse gcoreTapAndPayConsumerVerificationServerResponse) {
    }

    /* renamed from: a */
    public void mo52024a(SetUpBiometricAuthenticationKeysServiceResponse setUpBiometricAuthenticationKeysServiceResponse) {
    }

    /* renamed from: a */
    public void mo52025a(ReauthProofTokenResponse reauthProofTokenResponse) {
    }

    /* renamed from: b */
    public void mo51897b() {
    }

    /* renamed from: c */
    public void mo51898c() {
    }

    /* renamed from: d */
    public void mo52349d() {
    }

    public final void handleMessage(Message message) {
        if (this.f94796c && message.arg1 > this.f94795b) {
            this.f94795b = message.arg1;
            if (message.obj instanceof ServerResponse) {
                m80582a((ServerResponse) message.obj);
            } else if (message.obj instanceof BuyflowResponse) {
                BuyflowResponse buyflowResponse = (BuyflowResponse) message.obj;
                ServerResponse serverResponse = buyflowResponse.f110380a;
                switch (serverResponse.mo60050c()) {
                    case 33:
                        mo52020a((blxx) serverResponse.mo60052e(), buyflowResponse.f110381b, buyflowResponse.f110382c);
                        return;
                    case 34:
                        mo52022a((blyr) serverResponse.mo60052e(), buyflowResponse.f110381b);
                        return;
                    case 35:
                        mo52021a((blyp) serverResponse.mo60052e(), buyflowResponse.f110381b);
                        return;
                    default:
                        m80582a(buyflowResponse.f110380a);
                        return;
                }
            } else if (message.obj instanceof LoadFullWalletServiceResponse) {
                mo52268a((LoadFullWalletServiceResponse) message.obj);
            } else if (message.obj instanceof LoadMaskedWalletServiceResponse) {
                mo52269a((LoadMaskedWalletServiceResponse) message.obj);
            } else if (message.obj instanceof ProcessBuyFlowResultResponse) {
                mo52266a((ProcessBuyFlowResultResponse) message.obj);
            } else if (message.obj instanceof RefreshUserSpecificDataResponse) {
                mo52267a((RefreshUserSpecificDataResponse) message.obj);
            } else if (message.obj instanceof GcoreTapAndPayConsumerVerificationServerResponse) {
                mo52443a((GcoreTapAndPayConsumerVerificationServerResponse) message.obj);
            } else if (message.obj instanceof ReauthProofTokenResponse) {
                mo52025a((ReauthProofTokenResponse) message.obj);
            } else if (message.obj instanceof SetUpBiometricAuthenticationKeysServiceResponse) {
                mo52024a((SetUpBiometricAuthenticationKeysServiceResponse) message.obj);
            } else if (message.obj instanceof FetchPaySeCardsResponse) {
                mo52023a((FetchPaySeCardsResponse) message.obj);
            } else {
                String valueOf = String.valueOf(message.obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                sb.append("Unknown PaymentServiceResponse: ");
                sb.append(valueOf);
                Log.e("PaymentServiceResponseH", sb.toString());
                mo51897b();
            }
        }
    }
}
