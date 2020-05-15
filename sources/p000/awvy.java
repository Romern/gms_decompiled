package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.payse.SecureElementStoredValue;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse;
import com.google.android.gms.wallet.firstparty.ExecuteBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.InitializeBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysRequest;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysResponse;
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
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import com.google.android.wallet.common.tapandpay.TapAndPayConsumerVerificationRequest;
import com.google.android.wallet.p097ui.tapandpay.TapAndPayConsumerVerificationResponse;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: awvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awvy extends awtz {

    /* renamed from: a */
    public static final List f95194a = Arrays.asList("EES-Proto-Tokenization", "4.50.5.1;52,4.50.5.2;51");

    /* renamed from: b */
    public static final List f95195b = Arrays.asList("EES-Proto-Tokenization", "3.2.1;1,3.2.2;13");

    /* renamed from: c */
    public final awgj f95196c;

    /* renamed from: d */
    FutureTask f95197d;

    /* renamed from: e */
    private final Context f95198e;

    /* renamed from: f */
    private final awwt f95199f;

    /* renamed from: g */
    private final awpg f95200g;

    /* renamed from: h */
    private final SecureRandom f95201h;

    /* renamed from: i */
    private final awwo f95202i;

    public awvy(Context context, awgj awgj) {
        this(context, awgj, null);
    }

    /* renamed from: a */
    static FutureTask m81219a(Context context, Account account, BuyFlowConfig buyFlowConfig) {
        bqgj b = snp.m35704b(9);
        FutureTask futureTask = new FutureTask(new awfp(context, awfq.m79857a(context, buyFlowConfig), account));
        b.execute(futureTask);
        return futureTask;
    }

    /* renamed from: b */
    public static final String m81220b(BuyFlowConfig buyFlowConfig) {
        return awyd.m81490b(buyFlowConfig.f110418b.f110406a);
    }

    public awvy(Context context, awgj awgj, awwt awwt) {
        SecureRandom a = awvz.m81273a();
        awwo awwo = new awwo(context);
        this.f95197d = null;
        this.f95198e = context;
        this.f95196c = awgj;
        this.f95200g = new awpg(this.f95198e, "NetworkOrchService");
        this.f95199f = awwt;
        this.f95201h = a;
        this.f95202i = awwo;
    }

    /* renamed from: a */
    public final BuyFlowIntegratorDataResponse mo52569a(BuyFlowConfig buyFlowConfig, BuyFlowIntegratorDataRequest buyFlowIntegratorDataRequest) {
        throw new UnsupportedOperationException("getBuyFlowIntegratorData not implemented in NetworkOrchestrationService");
    }

    /* renamed from: a */
    public final BuyflowResponse mo52570a(BuyFlowConfig buyFlowConfig, ExecuteBuyFlowRequest executeBuyFlowRequest) {
        Account account = buyFlowConfig.f110418b.f110407b;
        sdo.checkIfNull(account, "buyFlowConfig must have buyer account set");
        bxvd da = blxw.f128152f.mo74144da();
        bmaj a = awfx.m79877a(this.f95198e, null, buyFlowConfig, buyFlowConfig.f110419c, false, false);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blxw blxw = (blxw) da.f164949b;
        a.getClass();
        blxw.f128155b = a;
        blxw.f128154a |= 1;
        ByteString a2 = ByteString.m123261a(executeBuyFlowRequest.f110155a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blxw blxw2 = (blxw) da.f164949b;
        a2.getClass();
        blxw2.f128154a |= 2;
        blxw2.f128156c = a2;
        byte[] bArr = executeBuyFlowRequest.f110156b;
        if (bArr != null) {
            blzf a3 = awvz.m81268a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blxw blxw3 = (blxw) da.f164949b;
            a3.getClass();
            blxw3.f128157d = a3;
            blxw3.f128154a |= 4;
        }
        BuyflowResponse a4 = mo52571a(buyFlowConfig, new BuyflowInitializeRequest(account, (blxw) da.mo74062i(), byaa.f165217d));
        ServerResponse serverResponse = a4.f110380a;
        if (serverResponse.mo60050c() != 33) {
            return a4;
        }
        blxx blxx = (blxx) serverResponse.mo60052e();
        bwgz a5 = bwgz.m121952a(blxx.f128168h);
        if (a5 == null) {
            a5 = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        }
        if (a5 != bwgz.SUBMIT_FLOW) {
            return a4;
        }
        bxvd da2 = blyq.f128291f.mo74144da();
        byte[] k = a4.f110381b.f165220b.mo73780k();
        bmaj bmaj = ((blxw) da.f164949b).f128155b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a6 = awvz.m81271a(k, bmaj.f128463j, buyFlowConfig, this.f95198e, true);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        blyq blyq = (blyq) da2.f164949b;
        a6.getClass();
        blyq.f128294b = a6;
        blyq.f128293a = 1 | blyq.f128293a;
        blym blym = blxx.f128166f;
        if (blym == null) {
            blym = blym.f128215R;
        }
        if (awev.m79814a(blym) != null) {
            blym blym2 = blxx.f128166f;
            if (blym2 == null) {
                blym2 = blym.f128215R;
            }
            blyn a7 = awev.m79814a(blym2);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            blyq blyq2 = (blyq) da2.f164949b;
            a7.getClass();
            blyq2.f128295c = a7;
            blyq2.f128293a |= 2;
        }
        blxw blxw4 = (blxw) da.f164949b;
        if ((blxw4.f128154a & 2) != 0) {
            ByteString bxtx = blxw4.f128156c;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            blyq blyq3 = (blyq) da2.f164949b;
            bxtx.getClass();
            blyq3.f128293a |= 4;
            blyq3.f128296d = bxtx;
        }
        blxw blxw5 = (blxw) da.f164949b;
        if ((blxw5.f128154a & 4) != 0) {
            blzf blzf = blxw5.f128157d;
            if (blzf == null) {
                blzf = blzf.f128337k;
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            blyq blyq4 = (blyq) da2.f164949b;
            blzf.getClass();
            blyq4.f128297e = blzf;
            blyq4.f128293a |= 8;
        }
        blyq blyq5 = (blyq) da2.mo74062i();
        byaa byaa = a4.f110381b;
        bmar bmar = blxx.f128164d;
        if (bmar == null) {
            bmar = bmar.f128490c;
        }
        return mo52573a(buyFlowConfig, new BuyflowSubmitRequest(account, blyq5, new byte[0], (blzf) null, byaa, bmar.f128492a));
    }

    /* renamed from: a */
    public final BuyflowResponse mo52571a(BuyFlowConfig buyFlowConfig, BuyflowInitializeRequest buyflowInitializeRequest) {
        blxa blxa;
        blxw blxw = (blxw) buyflowInitializeRequest.mo59970a();
        bxvd bxvd = (bxvd) blxw.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) blxw);
        bmaj bmaj = ((blxw) buyflowInitializeRequest.mo59970a()).f128155b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, ((Boolean) awih.f94451l.mo58455c()).booleanValue());
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        blxw blxw2 = (blxw) bxvd.f164949b;
        blxw blxw3 = blxw.f128152f;
        a.getClass();
        blxw2.f128155b = a;
        blxw2.f128154a |= 1;
        blxw blxw4 = (blxw) bxvd.mo74062i();
        buyflowInitializeRequest.f110328b = blxw4;
        bmaj bmaj2 = blxw4.f128155b;
        if (bmaj2 == null) {
            bmaj2 = bmaj.f128452m;
        }
        if (bmaj2.f128455b == 10) {
            blxa = (blxa) bmaj2.f128456c;
        } else {
            blxa = blxa.f127989R;
        }
        int a2 = blww.m107734a(blxa.f128004O);
        if (a2 == 0) {
            a2 = 1;
        }
        if (a2 == 3) {
            awfq.m79857a(this.f95198e, buyFlowConfig).mo65625a();
            this.f95197d = m81219a(this.f95198e, buyflowInitializeRequest.f110327a, buyFlowConfig);
        }
        ServerResponse a3 = this.f95200g.mo52446a(new awvr(this, buyFlowConfig, buyflowInitializeRequest.f110327a, blxw4));
        BuyflowResponse buyflowResponse = new BuyflowResponse(a3, buyflowInitializeRequest.mo60024c());
        if (a3.mo60050c() != 33) {
            return buyflowResponse;
        }
        blxx blxx = (blxx) a3.mo60052e();
        bxvd bxvd2 = (bxvd) blxx.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) blxx);
        byaa c = buyflowInitializeRequest.mo60024c();
        bxvd bxvd3 = (bxvd) c.mo74142c(5);
        bxvd3.mo73625a((GeneratedMessageLite) c);
        bmaq bmaq = ((blxx) bxvd2.f164949b).f128163c;
        if (bmaq == null) {
            bmaq = bmaq.f128479l;
        }
        ByteString bxtx = bmaq.f128483c;
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        byaa byaa = (byaa) bxvd3.f164949b;
        byaa byaa2 = byaa.f165217d;
        bxtx.getClass();
        byaa.f165219a |= 1;
        byaa.f165220b = bxtx;
        byaa byaa3 = (byaa) bxvd3.mo74062i();
        if (a2 == 3) {
            blxx blxx2 = (blxx) bxvd2.f164949b;
            if ((blxx2.f128161a & 16) != 0) {
                blym blym = blxx2.f128166f;
                if (blym == null) {
                    blym = blym.f128215R;
                }
                bmgn bmgn = blym.f128252r;
                if (bmgn == null) {
                    bmgn = bmgn.f129273o;
                }
                if (awfo.m79853a(bmgn) == 1) {
                    SecureElementStoredValue[] a4 = mo52653a(buyflowInitializeRequest.f110327a, buyFlowConfig);
                    blym blym2 = ((blxx) bxvd2.f164949b).f128166f;
                    if (blym2 == null) {
                        blym2 = blym.f128215R;
                    }
                    bxvd bxvd4 = (bxvd) blym2.mo74142c(5);
                    bxvd4.mo73625a((GeneratedMessageLite) blym2);
                    blyj blyj = (blyj) bxvd4;
                    blym blym3 = ((blxx) bxvd2.f164949b).f128166f;
                    if (blym3 == null) {
                        blym3 = blym.f128215R;
                    }
                    bmgn bmgn2 = blym3.f128252r;
                    if (bmgn2 == null) {
                        bmgn2 = bmgn.f129273o;
                    }
                    bmgn a5 = awfo.m79854a(bmgn2, a4);
                    if (blyj.f164950c) {
                        blyj.mo74035c();
                        blyj.f164950c = false;
                    }
                    blym blym4 = (blym) blyj.f164949b;
                    a5.getClass();
                    blym4.f128252r = a5;
                    blym4.f128235a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                    blym blym5 = (blym) blyj.mo74062i();
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    blxx blxx3 = (blxx) bxvd2.f164949b;
                    blxx blxx4 = blxx.f128159j;
                    blym5.getClass();
                    blxx3.f128166f = blym5;
                    blxx3.f128161a |= 16;
                    a3 = new ServerResponse(33, bxvd2.mo74062i());
                }
            }
        }
        return new BuyflowResponse(a3, byaa3);
    }

    /* renamed from: a */
    public final BuyflowResponse mo52572a(BuyFlowConfig buyFlowConfig, BuyflowRefreshRequest buyflowRefreshRequest) {
        boolean z;
        blxa blxa;
        if (buyflowRefreshRequest.f110329c != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "No SecureDataHeader provided when performing submitBuyflow.");
        blyo blyo = (blyo) buyflowRefreshRequest.mo59970a();
        bxvd bxvd = (bxvd) blyo.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) blyo);
        bmaj bmaj = ((blyo) buyflowRefreshRequest.mo59970a()).f128280b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, ((Boolean) awih.f94451l.mo58455c()).booleanValue());
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        blyo blyo2 = (blyo) bxvd.f164949b;
        blyo blyo3 = blyo.f128277e;
        a.getClass();
        blyo2.f128280b = a;
        blyo2.f128279a |= 1;
        blyo blyo4 = (blyo) bxvd.mo74062i();
        buyflowRefreshRequest.f110328b = blyo4;
        bmaj bmaj2 = blyo4.f128280b;
        if (bmaj2 == null) {
            bmaj2 = bmaj.f128452m;
        }
        if (bmaj2.f128455b == 10) {
            blxa = (blxa) bmaj2.f128456c;
        } else {
            blxa = blxa.f127989R;
        }
        int a2 = blww.m107734a(blxa.f128004O);
        if (a2 == 0) {
            a2 = 1;
        }
        if (a2 == 3) {
            awfq.m79857a(this.f95198e, buyFlowConfig).mo65625a();
            this.f95197d = m81219a(this.f95198e, buyflowRefreshRequest.f110327a, buyFlowConfig);
        }
        ServerResponse a3 = this.f95200g.mo52446a(new awve(this, buyFlowConfig, buyflowRefreshRequest.f110327a, blyo4, buyflowRefreshRequest));
        BuyflowResponse buyflowResponse = new BuyflowResponse(a3, buyflowRefreshRequest.mo60024c());
        if (a3.mo60050c() != 35) {
            return buyflowResponse;
        }
        blyp blyp = (blyp) a3.mo60052e();
        bxvd bxvd2 = (bxvd) blyp.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) blyp);
        byaa c = buyflowRefreshRequest.mo60024c();
        bxvd bxvd3 = (bxvd) c.mo74142c(5);
        bxvd3.mo73625a((GeneratedMessageLite) c);
        bmaq bmaq = ((blyp) bxvd2.f164949b).f128287c;
        if (bmaq == null) {
            bmaq = bmaq.f128479l;
        }
        ByteString bxtx = bmaq.f128483c;
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        byaa byaa = (byaa) bxvd3.f164949b;
        byaa byaa2 = byaa.f165217d;
        bxtx.getClass();
        byaa.f165219a |= 1;
        byaa.f165220b = bxtx;
        byaa byaa3 = (byaa) bxvd3.mo74062i();
        if (a2 == 3) {
            blyp blyp2 = (blyp) bxvd2.f164949b;
            if ((blyp2.f128285a & 8) != 0) {
                blym blym = blyp2.f128289e;
                if (blym == null) {
                    blym = blym.f128215R;
                }
                bmgn bmgn = blym.f128252r;
                if (bmgn == null) {
                    bmgn = bmgn.f129273o;
                }
                if (awfo.m79853a(bmgn) == 1) {
                    SecureElementStoredValue[] a4 = mo52653a(buyflowRefreshRequest.f110327a, buyFlowConfig);
                    blym blym2 = ((blyp) bxvd2.f164949b).f128289e;
                    if (blym2 == null) {
                        blym2 = blym.f128215R;
                    }
                    bxvd bxvd4 = (bxvd) blym2.mo74142c(5);
                    bxvd4.mo73625a((GeneratedMessageLite) blym2);
                    blyj blyj = (blyj) bxvd4;
                    blym blym3 = ((blyp) bxvd2.f164949b).f128289e;
                    if (blym3 == null) {
                        blym3 = blym.f128215R;
                    }
                    bmgn bmgn2 = blym3.f128252r;
                    if (bmgn2 == null) {
                        bmgn2 = bmgn.f129273o;
                    }
                    bmgn a5 = awfo.m79854a(bmgn2, a4);
                    if (blyj.f164950c) {
                        blyj.mo74035c();
                        blyj.f164950c = false;
                    }
                    blym blym4 = (blym) blyj.f164949b;
                    a5.getClass();
                    blym4.f128252r = a5;
                    blym4.f128235a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    blyp blyp3 = (blyp) bxvd2.f164949b;
                    blym blym5 = (blym) blyj.mo74062i();
                    blyp blyp4 = blyp.f128283f;
                    blym5.getClass();
                    blyp3.f128289e = blym5;
                    blyp3.f128285a |= 8;
                    a3 = new ServerResponse(35, bxvd2.mo74062i());
                }
            }
        }
        return new BuyflowResponse(a3, byaa3);
    }

    /* renamed from: a */
    public final BuyflowResponse mo52573a(BuyFlowConfig buyFlowConfig, BuyflowSubmitRequest buyflowSubmitRequest) {
        boolean z;
        blxa blxa;
        blzf blzf;
        if (buyflowSubmitRequest.f110329c != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "No SecureDataHeader provided when performing submitBuyflow.");
        blyq blyq = (blyq) buyflowSubmitRequest.mo59970a();
        bxvd bxvd = (bxvd) blyq.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) blyq);
        bmaj bmaj = ((blyq) buyflowSubmitRequest.mo59970a()).f128294b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, true);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        blyq blyq2 = (blyq) bxvd.f164949b;
        blyq blyq3 = blyq.f128291f;
        a.getClass();
        blyq2.f128294b = a;
        blyq2.f128293a |= 1;
        if (buyflowSubmitRequest.mo60024c().f165221c || !((blzf = buyflowSubmitRequest.f110384e) == null || (blzf.f128339a & 64) == 0)) {
            byte[] bArr = buyflowSubmitRequest.f110383d;
            if (bArr != null) {
                ByteString a2 = ByteString.m123261a(bArr);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                blyq blyq4 = (blyq) bxvd.f164949b;
                a2.getClass();
                blyq4.f128293a |= 4;
                blyq4.f128296d = a2;
            }
            blzf blzf2 = buyflowSubmitRequest.f110384e;
            if (blzf2 != null) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                blyq blyq5 = (blyq) bxvd.f164949b;
                blzf2.getClass();
                blyq5.f128297e = blzf2;
                blyq5.f128293a |= 8;
            }
        }
        buyflowSubmitRequest.f110328b = (blyq) bxvd.mo74062i();
        bmaj bmaj2 = ((blyq) bxvd.f164949b).f128294b;
        if (bmaj2 == null) {
            bmaj2 = bmaj.f128452m;
        }
        if (bmaj2.f128455b == 10) {
            blxa = (blxa) bmaj2.f128456c;
        } else {
            blxa = blxa.f127989R;
        }
        int a3 = blww.m107734a(blxa.f128004O);
        if (a3 == 0) {
            a3 = 1;
        }
        if (a3 == 3) {
            awfq.m79857a(this.f95198e, buyFlowConfig).mo65625a();
            this.f95197d = m81219a(this.f95198e, buyflowSubmitRequest.f110327a, buyFlowConfig);
        }
        ServerResponse a4 = this.f95200g.mo52446a(new awut(this, buyFlowConfig, buyflowSubmitRequest.f110327a, bxvd, buyflowSubmitRequest));
        BuyflowResponse buyflowResponse = new BuyflowResponse(a4, buyflowSubmitRequest.mo60024c());
        if (a4.mo60050c() != 34) {
            return buyflowResponse;
        }
        blyr blyr = (blyr) a4.mo60052e();
        byaa c = buyflowSubmitRequest.mo60024c();
        bxvd bxvd2 = (bxvd) c.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) c);
        bmaq bmaq = blyr.f128302c;
        if (bmaq == null) {
            bmaq = bmaq.f128479l;
        }
        ByteString bxtx = bmaq.f128483c;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        byaa byaa = (byaa) bxvd2.f164949b;
        byaa byaa2 = byaa.f165217d;
        bxtx.getClass();
        int i = byaa.f165219a | 1;
        byaa.f165219a = i;
        byaa.f165220b = bxtx;
        byaa.f165219a = i | 2;
        byaa.f165221c = false;
        byaa byaa3 = (byaa) bxvd2.mo74062i();
        if (a3 == 3 && (blyr.f128300a & 32) != 0) {
            blym blym = blyr.f128305f;
            if (blym == null) {
                blym = blym.f128215R;
            }
            bmgn bmgn = blym.f128252r;
            if (bmgn == null) {
                bmgn = bmgn.f129273o;
            }
            if (awfo.m79853a(bmgn) == 1) {
                SecureElementStoredValue[] a5 = mo52653a(buyflowSubmitRequest.f110327a, buyFlowConfig);
                bxvd bxvd3 = (bxvd) blyr.mo74142c(5);
                bxvd3.mo73625a((GeneratedMessageLite) blyr);
                blym blym2 = blyr.f128305f;
                if (blym2 == null) {
                    blym2 = blym.f128215R;
                }
                bxvd bxvd4 = (bxvd) blym2.mo74142c(5);
                bxvd4.mo73625a((GeneratedMessageLite) blym2);
                blyj blyj = (blyj) bxvd4;
                blym blym3 = blyr.f128305f;
                if (blym3 == null) {
                    blym3 = blym.f128215R;
                }
                bmgn bmgn2 = blym3.f128252r;
                if (bmgn2 == null) {
                    bmgn2 = bmgn.f129273o;
                }
                bmgn a6 = awfo.m79854a(bmgn2, a5);
                if (blyj.f164950c) {
                    blyj.mo74035c();
                    blyj.f164950c = false;
                }
                blym blym4 = (blym) blyj.f164949b;
                a6.getClass();
                blym4.f128252r = a6;
                blym4.f128235a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                blyr blyr2 = (blyr) bxvd3.f164949b;
                blym blym5 = (blym) blyj.mo74062i();
                blyr blyr3 = blyr.f128298p;
                blym5.getClass();
                blyr2.f128305f = blym5;
                blyr2.f128300a |= 32;
                a4 = new ServerResponse(34, (blyr) bxvd3.mo74062i());
            }
        }
        return new BuyflowResponse(a4, byaa3);
    }

    /* renamed from: a */
    public final FetchPaySeCardsResponse mo52574a(BuyFlowConfig buyFlowConfig) {
        Account account = buyFlowConfig.f110418b.f110407b;
        sdo.checkIfNull(account, "buyFlowConfig must have buyer account set");
        return new FetchPaySeCardsResponse(mo52653a(account, buyFlowConfig));
    }

    /* renamed from: a */
    public final GcoreTapAndPayConsumerVerificationServerResponse mo52575a(BuyFlowConfig buyFlowConfig, TapAndPayConsumerVerificationRequest tapAndPayConsumerVerificationRequest) {
        TapAndPayConsumerVerificationResponse tapAndPayConsumerVerificationResponse;
        asmk asmk;
        awwt awwt = this.f95199f;
        Account account = buyFlowConfig.f110418b.f110407b;
        SecureRandom secureRandom = this.f95201h;
        bmxy.m108582a(awwt, "mLoggingTapAndPayApi can't be null when calling performTapAndPayConsumerVerification!");
        if (tapAndPayConsumerVerificationRequest.f151827c) {
            Status a = awwt.mo65546a(buyFlowConfig, account, null);
            if (!a.mo17710c()) {
                Log.w("TapAndPayUtils", String.format(Locale.US, "Failed to report InApp manual unlock status = %s message = %s", Integer.valueOf(a.f30115i), a.f30116j));
                tapAndPayConsumerVerificationResponse = new TapAndPayConsumerVerificationResponse(null, 3);
                return new GcoreTapAndPayConsumerVerificationServerResponse(tapAndPayConsumerVerificationResponse.f152323a, tapAndPayConsumerVerificationResponse.f152324b);
            }
        }
        if (tapAndPayConsumerVerificationRequest.f151826b) {
            aspb aspb = new aspb();
            aspb.f89334a = secureRandom.nextLong();
            aspb.f89338e = bngx.m109356a((Object) 1);
            aspb.f89335b = tapAndPayConsumerVerificationRequest.f151830f;
            aspb.f89339f = tapAndPayConsumerVerificationRequest.f151829e;
            aspb.f89337d = tapAndPayConsumerVerificationRequest.f151831g;
            aspb.f89336c = tapAndPayConsumerVerificationRequest.f151832h;
            asom asom = new asom();
            asom.f89311a = account.name;
            asom.f89312b = tapAndPayConsumerVerificationRequest.f151825a;
            asom.f89313c = aspb.mo49317a();
            asom.f89315e = tapAndPayConsumerVerificationRequest.f151834j;
            byte[] bArr = tapAndPayConsumerVerificationRequest.f151833i;
            if (bArr.length > 0) {
                asom.f89314d = bArr;
            }
            asmk = awwt.mo65545a(buyFlowConfig, asom.mo49293a(), tapAndPayConsumerVerificationRequest.f151828d, (String) null);
        } else {
            asmk = null;
        }
        rjr a2 = awwt.mo65547a(buyFlowConfig, account, (String) null, tapAndPayConsumerVerificationRequest.f151825a);
        if (!a2.f43154a.mo17710c()) {
            Log.w("TapAndPayUtils", String.format(Locale.US, "Failed to check if device was unlocked for payment! status = %s message = %s", Integer.valueOf(a2.f43154a.f30115i), a2.f43154a.f30116j));
            tapAndPayConsumerVerificationResponse = new TapAndPayConsumerVerificationResponse(null, 3);
        } else if (!a2.f43155b) {
            tapAndPayConsumerVerificationResponse = new TapAndPayConsumerVerificationResponse(null, 1);
        } else if (asmk == null) {
            tapAndPayConsumerVerificationResponse = new TapAndPayConsumerVerificationResponse(null, 0);
        } else if (asmk.mo7183bo().mo17710c()) {
            RetrieveInAppPaymentCredentialResponse b = asmk.mo49242b();
            bxvd da = bwey.f159035i.mo74144da();
            String a3 = bjuz.m104679a(b.f108425a);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwey bwey = (bwey) da.f164949b;
            a3.getClass();
            bwey.f159037a |= 1;
            bwey.f159038b = a3;
            byte[] bArr2 = b.f108426b;
            if (bArr2 != null) {
                String encodeToString = Base64.encodeToString(bArr2, 2);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwey bwey2 = (bwey) da.f164949b;
                encodeToString.getClass();
                int i = bwey2.f159037a | 2;
                bwey2.f159037a = i;
                bwey2.f159039c = encodeToString;
                bwey2.f159044h = 1;
                bwey2.f159037a = i | 64;
            }
            int i2 = b.f108427c;
            bwey bwey3 = (bwey) da.f164949b;
            int i3 = bwey3.f159037a | 4;
            bwey3.f159037a = i3;
            bwey3.f159040d = i2;
            int i4 = b.f108428d;
            bwey3.f159037a = i3 | 8;
            bwey3.f159041e = i4;
            if (!TextUtils.isEmpty(b.f108429e)) {
                String a4 = bjuz.m104679a(b.f108429e);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwey bwey4 = (bwey) da.f164949b;
                a4.getClass();
                bwey4.f159037a |= 16;
                bwey4.f159042f = a4;
            }
            if (!TextUtils.isEmpty(b.f108430f)) {
                String a5 = bjuz.m104679a(b.f108430f);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwey bwey5 = (bwey) da.f164949b;
                a5.getClass();
                bwey5.f159037a |= 32;
                bwey5.f159043g = a5;
            }
            TapAndPayConsumerVerificationResponse tapAndPayConsumerVerificationResponse2 = new TapAndPayConsumerVerificationResponse((bwey) da.mo74062i(), 0);
            awwt.mo65550d(buyFlowConfig, account, null);
            tapAndPayConsumerVerificationResponse = tapAndPayConsumerVerificationResponse2;
        } else if (asmk.mo7183bo().f30115i == 15001) {
            tapAndPayConsumerVerificationResponse = new TapAndPayConsumerVerificationResponse(null, 2);
        } else {
            tapAndPayConsumerVerificationResponse = new TapAndPayConsumerVerificationResponse(null, 3);
        }
        return new GcoreTapAndPayConsumerVerificationServerResponse(tapAndPayConsumerVerificationResponse.f152323a, tapAndPayConsumerVerificationResponse.f152324b);
    }

    /* renamed from: a */
    public final SetUpBiometricAuthenticationKeysServiceResponse mo52576a(BuyFlowConfig buyFlowConfig, SetUpBiometricAuthenticationKeysRequest setUpBiometricAuthenticationKeysRequest) {
        int i;
        byae byae;
        boolean z;
        awfr a = awfr.m79859a(this.f95198e, buyFlowConfig);
        ApplicationParameters applicationParameters = buyFlowConfig.f110418b;
        int i2 = applicationParameters.f110406a;
        Account account = applicationParameters.f110407b;
        byah a2 = this.f95202i.mo52680a(i2, account);
        byte[] bArr = setUpBiometricAuthenticationKeysRequest.f110166a;
        if (bArr != null) {
            i = bmce.m107889a(((bmct) bjvp.m104733a(bArr, (bxxk) bmct.f128745b.mo74142c(7))).f128747a);
            if (i == 0) {
                i = 1;
            }
        } else {
            i = 2;
        }
        bmcv a3 = awgh.m79897a(a2, i);
        if (a3 != null && a.mo52105a(i)) {
            return new SetUpBiometricAuthenticationKeysServiceResponse(new SetUpBiometricAuthenticationKeysResponse(a3.serializeToBytes()), Status.f30107a);
        }
        bmcv c = a.mo52108c(i);
        if (a2 == null) {
            byae = (byae) byah.f165256g.mo74144da();
        } else {
            bxvd bxvd = (bxvd) a2.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) a2);
            byae = (byae) bxvd;
        }
        int a4 = bmce.m107889a(c.f128756e);
        if (a4 == 0) {
            z = false;
        } else {
            z = a4 != 1;
        }
        bmxy.m108589a(z, "Must set authenticator!");
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (bmcv bmcv : Collections.unmodifiableList(((byah) byae.f164949b).f165263f)) {
            int a5 = bmce.m107889a(bmcv.f128756e);
            if (a5 == 0) {
                a5 = 1;
            }
            int a6 = bmce.m107889a(c.f128756e);
            if (a6 == 0) {
                a6 = 1;
            }
            if (a5 == a6) {
                arrayList.add(c);
                boolean z3 = !z2;
                int a7 = bmce.m107889a(c.f128756e);
                if (a7 == 0) {
                    a7 = 1;
                }
                bmxy.m108602b(z3, "Repeated entries for authenticator = %s", a7 - 1);
                z2 = true;
            } else {
                arrayList.add(bmcv);
            }
        }
        if (!z2) {
            arrayList.add(c);
        }
        if (byae.f164950c) {
            byae.mo74035c();
            byae.f164950c = false;
        }
        ((byah) byae.f164949b).f165263f = GeneratedMessageLite.m124030de();
        byae.mo74339a(arrayList);
        this.f95202i.mo52681a(i2, account, (byah) byae.mo74062i());
        return new SetUpBiometricAuthenticationKeysServiceResponse(new SetUpBiometricAuthenticationKeysResponse(c.serializeToBytes()), Status.f30107a);
    }

    /* renamed from: a */
    public final ServerResponse mo52577a(BuyFlowConfig buyFlowConfig, InitializeBuyFlowRequest initializeBuyFlowRequest) {
        bxvd da = blxy.f128171d.mo74144da();
        for (byte[] bArr : initializeBuyFlowRequest.f110165b) {
            ByteString a = ByteString.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blxy blxy = (blxy) da.f164949b;
            a.getClass();
            if (!blxy.f128175c.mo73666a()) {
                blxy.f128175c = GeneratedMessageLite.m124021a(blxy.f128175c);
            }
            blxy.f128175c.add(a);
        }
        bmaj a2 = awfx.m79877a(this.f95198e, null, buyFlowConfig, buyFlowConfig.f110419c, false, ((Boolean) awih.f94451l.mo58455c()).booleanValue());
        if (((Boolean) awih.f94450k.mo58455c()).booleanValue()) {
            a2 = awvz.m81269a(a2);
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blxy blxy2 = (blxy) da.f164949b;
        a2.getClass();
        blxy2.f128174b = a2;
        blxy2.f128173a |= 1;
        return this.f95200g.mo52446a(new awvt(this, buyFlowConfig, buyFlowConfig.f110418b.f110407b, da));
    }

    /* renamed from: a */
    public final ServerResponse mo52578a(BuyFlowConfig buyFlowConfig, AddInstrumentInitializeRequest addInstrumentInitializeRequest) {
        blxm blxm = (blxm) addInstrumentInitializeRequest.mo59970a();
        bxvd bxvd = (bxvd) blxm.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) blxm);
        bmaj bmaj = ((blxm) addInstrumentInitializeRequest.mo59970a()).f128086d;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, ((Boolean) awid.f94397a.mo58455c()).booleanValue());
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        blxm blxm2 = (blxm) bxvd.f164949b;
        blxm blxm3 = blxm.f128081e;
        a.getClass();
        blxm2.f128086d = a;
        blxm2.f128083a |= 1;
        blxm blxm4 = (blxm) bxvd.mo74062i();
        addInstrumentInitializeRequest.f110328b = blxm4;
        return this.f95200g.mo52446a(new awur(this, buyFlowConfig, addInstrumentInitializeRequest.f110327a, blxm4));
    }

    /* renamed from: a */
    public final ServerResponse mo52579a(BuyFlowConfig buyFlowConfig, AddInstrumentSubmitRequest addInstrumentSubmitRequest) {
        boolean z;
        if (addInstrumentSubmitRequest.f110329c != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "No SecureDataHeader provided for submitAddInstrument.");
        blxq blxq = (blxq) addInstrumentSubmitRequest.mo59970a();
        bxvd bxvd = (bxvd) blxq.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) blxq);
        bmaj bmaj = ((blxq) addInstrumentSubmitRequest.mo59970a()).f128119b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, true);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        blxq blxq2 = (blxq) bxvd.f164949b;
        blxq blxq3 = blxq.f128116d;
        a.getClass();
        blxq2.f128119b = a;
        blxq2.f128118a |= 1;
        blxq blxq4 = (blxq) bxvd.mo74062i();
        addInstrumentSubmitRequest.f110328b = blxq4;
        return this.f95200g.mo52446a(new awus(this, buyFlowConfig, addInstrumentSubmitRequest.f110327a, blxq4, addInstrumentSubmitRequest));
    }

    /* renamed from: a */
    public final ServerResponse mo52580a(BuyFlowConfig buyFlowConfig, EmbeddedLandingPageInitializeRequest embeddedLandingPageInitializeRequest) {
        bmaj bmaj = ((bwiy) embeddedLandingPageInitializeRequest.mo59970a()).f159703b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, ((Boolean) awik.f94473a.mo58455c()).booleanValue());
        bwiy bwiy = (bwiy) embeddedLandingPageInitializeRequest.mo59970a();
        bxvd bxvd = (bxvd) bwiy.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bwiy);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwiy bwiy2 = (bwiy) bxvd.f164949b;
        bwiy bwiy3 = bwiy.f159700d;
        a.getClass();
        bwiy2.f159703b = a;
        bwiy2.f159702a |= 1;
        bwiy bwiy4 = (bwiy) bxvd.mo74062i();
        embeddedLandingPageInitializeRequest.f110328b = bwiy4;
        return this.f95200g.mo52446a(new awuw(this, buyFlowConfig, embeddedLandingPageInitializeRequest.f110327a, bwiy4));
    }

    /* renamed from: a */
    public final ServerResponse mo52581a(BuyFlowConfig buyFlowConfig, EmbeddedLandingPageSubmitRequest embeddedLandingPageSubmitRequest) {
        boolean z;
        if (embeddedLandingPageSubmitRequest.f110329c != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "No SecureDataHeader provided when performing submitEmbeddedLandingPage.");
        bmaj bmaj = ((bwjc) embeddedLandingPageSubmitRequest.mo59970a()).f159737b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, true);
        bwjc bwjc = (bwjc) embeddedLandingPageSubmitRequest.mo59970a();
        bxvd bxvd = (bxvd) bwjc.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bwjc);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwjc bwjc2 = (bwjc) bxvd.f164949b;
        bwjc bwjc3 = bwjc.f159734d;
        a.getClass();
        bwjc2.f159737b = a;
        bwjc2.f159736a |= 1;
        bwjc bwjc4 = (bwjc) bxvd.mo74062i();
        embeddedLandingPageSubmitRequest.f110328b = bwjc4;
        return this.f95200g.mo52446a(new awux(this, buyFlowConfig, embeddedLandingPageSubmitRequest.f110327a, bwjc4, embeddedLandingPageSubmitRequest));
    }

    /* renamed from: a */
    public final ServerResponse mo52582a(BuyFlowConfig buyFlowConfig, EmbeddedSettingsInitializeRequest embeddedSettingsInitializeRequest) {
        bwje bwje = (bwje) embeddedSettingsInitializeRequest.mo59970a();
        bmaj bmaj = bwje.f159751b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, ((Boolean) awil.f94474a.mo58455c()).booleanValue());
        bxvd bxvd = (bxvd) bwje.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bwje);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwje bwje2 = (bwje) bxvd.f164949b;
        bwje bwje3 = bwje.f159748d;
        a.getClass();
        bwje2.f159751b = a;
        bwje2.f159750a |= 1;
        bwje bwje4 = (bwje) bxvd.mo74062i();
        embeddedSettingsInitializeRequest.f110328b = bwje4;
        return this.f95200g.mo52446a(new awva(this, buyFlowConfig, embeddedSettingsInitializeRequest.f110327a, bwje4));
    }

    /* renamed from: a */
    public final ServerResponse mo52583a(BuyFlowConfig buyFlowConfig, EmbeddedSettingsSubmitRequest embeddedSettingsSubmitRequest) {
        boolean z;
        if (embeddedSettingsSubmitRequest.f110329c != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "No SecureDataHeader provided when performing submitEmbeddedSettings.");
        bmaj bmaj = ((bwji) embeddedSettingsSubmitRequest.mo59970a()).f159785b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, true);
        bwji bwji = (bwji) embeddedSettingsSubmitRequest.mo59970a();
        bxvd bxvd = (bxvd) bwji.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bwji);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwji bwji2 = (bwji) bxvd.f164949b;
        bwji bwji3 = bwji.f159782d;
        a.getClass();
        bwji2.f159785b = a;
        bwji2.f159784a |= 1;
        bwji bwji4 = (bwji) bxvd.mo74062i();
        embeddedSettingsSubmitRequest.f110328b = bwji4;
        return this.f95200g.mo52446a(new awvb(this, buyFlowConfig, embeddedSettingsSubmitRequest.f110327a, bwji4, embeddedSettingsSubmitRequest));
    }

    /* renamed from: a */
    public final ServerResponse mo52584a(BuyFlowConfig buyFlowConfig, FixInstrumentInitializeRequest fixInstrumentInitializeRequest) {
        bwjk bwjk = (bwjk) fixInstrumentInitializeRequest.mo59970a();
        bxvd bxvd = (bxvd) bwjk.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bwjk);
        bmaj bmaj = ((bwjk) fixInstrumentInitializeRequest.mo59970a()).f159799b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, ((Boolean) awin.f94479a.mo58455c()).booleanValue());
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwjk bwjk2 = (bwjk) bxvd.f164949b;
        bwjk bwjk3 = bwjk.f159796e;
        a.getClass();
        bwjk2.f159799b = a;
        bwjk2.f159798a |= 1;
        bwjk bwjk4 = (bwjk) bxvd.mo74062i();
        fixInstrumentInitializeRequest.f110328b = bwjk4;
        return this.f95200g.mo52446a(new awuu(this, buyFlowConfig, fixInstrumentInitializeRequest.f110327a, bwjk4));
    }

    /* renamed from: a */
    public final ServerResponse mo52585a(BuyFlowConfig buyFlowConfig, FixInstrumentSubmitRequest fixInstrumentSubmitRequest) {
        boolean z;
        if (fixInstrumentSubmitRequest.f110329c != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "No SecureDataHeader provided for submitFixInstrument.");
        bwjo bwjo = (bwjo) fixInstrumentSubmitRequest.mo59970a();
        bxvd bxvd = (bxvd) bwjo.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bwjo);
        bmaj bmaj = ((bwjo) fixInstrumentSubmitRequest.mo59970a()).f159841b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, true);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwjo bwjo2 = (bwjo) bxvd.f164949b;
        bwjo bwjo3 = bwjo.f159838d;
        a.getClass();
        bwjo2.f159841b = a;
        bwjo2.f159840a |= 1;
        bwjo bwjo4 = (bwjo) bxvd.mo74062i();
        fixInstrumentSubmitRequest.f110328b = bwjo4;
        return this.f95200g.mo52446a(new awuv(this, buyFlowConfig, fixInstrumentSubmitRequest.f110327a, bwjo4, fixInstrumentSubmitRequest));
    }

    /* renamed from: a */
    public final ServerResponse mo52586a(BuyFlowConfig buyFlowConfig, GenericSelectorInitializeRequest genericSelectorInitializeRequest) {
        bmrb bmrb = (bmrb) genericSelectorInitializeRequest.mo59970a();
        bxvd bxvd = (bxvd) bmrb.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bmrb);
        bmaj bmaj = ((bmrb) genericSelectorInitializeRequest.mo59970a()).f130464d;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, ((Boolean) awio.f94480a.mo58455c()).booleanValue());
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bmrb bmrb2 = (bmrb) bxvd.f164949b;
        bmrb bmrb3 = bmrb.f130459e;
        a.getClass();
        bmrb2.f130464d = a;
        bmrb2.f130461a |= 1;
        bmrb bmrb4 = (bmrb) bxvd.mo74062i();
        genericSelectorInitializeRequest.f110328b = bmrb4;
        return this.f95200g.mo52446a(new awuo(this, buyFlowConfig, genericSelectorInitializeRequest.f110327a, bmrb4, genericSelectorInitializeRequest));
    }

    /* renamed from: a */
    public final ServerResponse mo52587a(BuyFlowConfig buyFlowConfig, GenericSelectorSubmitRequest genericSelectorSubmitRequest) {
        bmrh bmrh = (bmrh) genericSelectorSubmitRequest.mo59970a();
        bxvd bxvd = (bxvd) bmrh.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bmrh);
        bmaj bmaj = ((bmrh) genericSelectorSubmitRequest.mo59970a()).f130493b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, true);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bmrh bmrh2 = (bmrh) bxvd.f164949b;
        bmrh bmrh3 = bmrh.f130490d;
        a.getClass();
        bmrh2.f130493b = a;
        bmrh2.f130492a |= 1;
        bmrh bmrh4 = (bmrh) bxvd.mo74062i();
        genericSelectorSubmitRequest.f110328b = bmrh4;
        return this.f95200g.mo52446a(new awup(this, buyFlowConfig, genericSelectorSubmitRequest.f110327a, bmrh4));
    }

    /* renamed from: a */
    public final ServerResponse mo52588a(BuyFlowConfig buyFlowConfig, GetInstrumentAvailabilityServerRequest getInstrumentAvailabilityServerRequest) {
        bwke bwke = (bwke) getInstrumentAvailabilityServerRequest.mo59970a();
        bxvd bxvd = (bxvd) bwke.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bwke);
        bmaj bmaj = ((bwke) getInstrumentAvailabilityServerRequest.mo59970a()).f159961b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, ((Boolean) awie.f94401D.mo58455c()).booleanValue());
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwke bwke2 = (bwke) bxvd.f164949b;
        bwke bwke3 = bwke.f159958f;
        a.getClass();
        bwke2.f159961b = a;
        bwke2.f159960a |= 1;
        if (((Boolean) awie.f94403F.mo58455c()).booleanValue()) {
            bmaj bmaj2 = ((bwke) bxvd.f164949b).f159961b;
            if (bmaj2 == null) {
                bmaj2 = bmaj.f128452m;
            }
            bmaj a2 = awvz.m81269a(bmaj2);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bwke bwke4 = (bwke) bxvd.f164949b;
            a2.getClass();
            bwke4.f159961b = a2;
            bwke4.f159960a |= 1;
        }
        getInstrumentAvailabilityServerRequest.f110328b = (bwke) bxvd.mo74062i();
        return this.f95200g.mo52446a(new awvn(this, buyFlowConfig, getInstrumentAvailabilityServerRequest.f110327a, bxvd));
    }

    /* renamed from: a */
    public final ServerResponse mo52589a(BuyFlowConfig buyFlowConfig, IdCreditInitializeRequest idCreditInitializeRequest) {
        bmrj bmrj = (bmrj) idCreditInitializeRequest.mo59970a();
        bxvd bxvd = (bxvd) bmrj.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bmrj);
        bmaj bmaj = ((bmrj) idCreditInitializeRequest.mo59970a()).f130507b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, ((Boolean) awiq.f94487a.mo58455c()).booleanValue());
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bmrj bmrj2 = (bmrj) bxvd.f164949b;
        bmrj bmrj3 = bmrj.f130504d;
        a.getClass();
        bmrj2.f130507b = a;
        bmrj2.f130506a |= 1;
        bmrj bmrj4 = (bmrj) bxvd.mo74062i();
        idCreditInitializeRequest.f110328b = bmrj4;
        return this.f95200g.mo52446a(new awuj(this, buyFlowConfig, idCreditInitializeRequest.f110327a, bmrj4));
    }

    /* renamed from: a */
    public final ServerResponse mo52590a(BuyFlowConfig buyFlowConfig, IdCreditRefreshRequest idCreditRefreshRequest) {
        boolean z;
        if (idCreditRefreshRequest.f110329c != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "No SecureDataHeader provided when performing refreshId.");
        bmro bmro = (bmro) idCreditRefreshRequest.mo59970a();
        bxvd bxvd = (bxvd) bmro.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bmro);
        bmaj bmaj = ((bmro) idCreditRefreshRequest.mo59970a()).f130556b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, ((Boolean) awiq.f94487a.mo58455c()).booleanValue());
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bmro bmro2 = (bmro) bxvd.f164949b;
        bmro bmro3 = bmro.f130553c;
        a.getClass();
        bmro2.f130556b = a;
        bmro2.f130555a |= 1;
        bmro bmro4 = (bmro) bxvd.mo74062i();
        idCreditRefreshRequest.f110328b = bmro4;
        return this.f95200g.mo52446a(new awul(this, buyFlowConfig, idCreditRefreshRequest.f110327a, bmro4, idCreditRefreshRequest));
    }

    /* renamed from: a */
    public final ServerResponse mo52591a(BuyFlowConfig buyFlowConfig, IdCreditSubmitRequest idCreditSubmitRequest) {
        boolean z;
        if (idCreditSubmitRequest.f110329c != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "No SecureDataHeader provided when performing submitId.");
        bmrq bmrq = (bmrq) idCreditSubmitRequest.mo59970a();
        bxvd bxvd = (bxvd) bmrq.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bmrq);
        bmaj bmaj = ((bmrq) idCreditSubmitRequest.mo59970a()).f130563b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, true);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bmrq bmrq2 = (bmrq) bxvd.f164949b;
        bmrq bmrq3 = bmrq.f130560d;
        a.getClass();
        bmrq2.f130563b = a;
        bmrq2.f130562a |= 1;
        bmrq bmrq4 = (bmrq) bxvd.mo74062i();
        idCreditSubmitRequest.f110328b = bmrq4;
        return this.f95200g.mo52446a(new awuk(this, buyFlowConfig, idCreditSubmitRequest.f110327a, bmrq4, idCreditSubmitRequest));
    }

    /* renamed from: a */
    public final ServerResponse mo52592a(BuyFlowConfig buyFlowConfig, InstrumentManagerInitializeRequest instrumentManagerInitializeRequest) {
        bmru bmru = (bmru) instrumentManagerInitializeRequest.mo59970a();
        bxvd bxvd = (bxvd) bmru.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bmru);
        bmaj bmaj = ((bmru) instrumentManagerInitializeRequest.mo59970a()).f130584b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, ((Boolean) awis.f94492c.mo58455c()).booleanValue());
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bmru bmru2 = (bmru) bxvd.f164949b;
        bmru bmru3 = bmru.f130581d;
        a.getClass();
        bmru2.f130584b = a;
        bmru2.f130583a |= 1;
        bmru bmru4 = (bmru) bxvd.mo74062i();
        instrumentManagerInitializeRequest.f110328b = bmru4;
        return this.f95200g.mo52446a(new awvj(this, buyFlowConfig, instrumentManagerInitializeRequest.f110327a, bmru4));
    }

    /* renamed from: a */
    public final ServerResponse mo52593a(BuyFlowConfig buyFlowConfig, InstrumentManagerRefreshRequest instrumentManagerRefreshRequest) {
        boolean z;
        if (instrumentManagerRefreshRequest.f110329c != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "No SecureDataHeader provided when performing refreshIm.");
        bmaj bmaj = ((bmrz) instrumentManagerRefreshRequest.mo59970a()).f130629b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, ((Boolean) awis.f94492c.mo58455c()).booleanValue());
        bmrz bmrz = (bmrz) instrumentManagerRefreshRequest.mo59970a();
        bxvd bxvd = (bxvd) bmrz.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bmrz);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bmrz bmrz2 = (bmrz) bxvd.f164949b;
        bmrz bmrz3 = bmrz.f130626e;
        a.getClass();
        bmrz2.f130629b = a;
        bmrz2.f130628a |= 1;
        bmrz bmrz4 = (bmrz) bxvd.mo74062i();
        instrumentManagerRefreshRequest.f110328b = bmrz4;
        return this.f95200g.mo52446a(new awvs(this, buyFlowConfig, instrumentManagerRefreshRequest.f110327a, bmrz4, instrumentManagerRefreshRequest));
    }

    /* renamed from: a */
    public final ServerResponse mo52594a(BuyFlowConfig buyFlowConfig, InstrumentManagerSubmitRequest instrumentManagerSubmitRequest) {
        boolean z;
        if (instrumentManagerSubmitRequest.f110329c != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "No SecureDataHeader provided when performing submitIm.");
        bmsb bmsb = (bmsb) instrumentManagerSubmitRequest.mo59970a();
        bxvd bxvd = (bxvd) bmsb.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bmsb);
        bmaj bmaj = ((bmsb) instrumentManagerSubmitRequest.mo59970a()).f130643b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, true);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bmsb bmsb2 = (bmsb) bxvd.f164949b;
        bmsb bmsb3 = bmsb.f130640e;
        a.getClass();
        bmsb2.f130643b = a;
        bmsb2.f130642a |= 1;
        bmsb bmsb4 = (bmsb) bxvd.mo74062i();
        instrumentManagerSubmitRequest.f110328b = bmsb4;
        return this.f95200g.mo52446a(new awvp(this, buyFlowConfig, instrumentManagerSubmitRequest.f110327a, bmsb4, instrumentManagerSubmitRequest));
    }

    /* renamed from: a */
    public final ServerResponse mo52595a(BuyFlowConfig buyFlowConfig, InvoiceSummaryInitializeRequest invoiceSummaryInitializeRequest) {
        bwjq bwjq = (bwjq) invoiceSummaryInitializeRequest.mo59970a();
        bxvd bxvd = (bxvd) bwjq.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bwjq);
        bmaj bmaj = ((bwjq) invoiceSummaryInitializeRequest.mo59970a()).f159855b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, ((Boolean) awit.f94493a.mo58455c()).booleanValue());
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwjq bwjq2 = (bwjq) bxvd.f164949b;
        bwjq bwjq3 = bwjq.f159852d;
        a.getClass();
        bwjq2.f159855b = a;
        bwjq2.f159854a |= 1;
        bwjq bwjq4 = (bwjq) bxvd.mo74062i();
        invoiceSummaryInitializeRequest.f110328b = bwjq4;
        return this.f95200g.mo52446a(new awvf(this, buyFlowConfig, invoiceSummaryInitializeRequest.f110327a, bwjq4));
    }

    /* renamed from: a */
    public final ServerResponse mo52596a(BuyFlowConfig buyFlowConfig, InvoiceSummarySubmitRequest invoiceSummarySubmitRequest) {
        boolean z;
        if (invoiceSummarySubmitRequest.f110329c != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "No SecureDataHeader provided when performing submitInvoiceSummary.");
        bwjt bwjt = (bwjt) invoiceSummarySubmitRequest.mo59970a();
        bxvd bxvd = (bxvd) bwjt.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bwjt);
        bmaj bmaj = ((bwjt) invoiceSummarySubmitRequest.mo59970a()).f159869b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, true);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwjt bwjt2 = (bwjt) bxvd.f164949b;
        bwjt bwjt3 = bwjt.f159866c;
        a.getClass();
        bwjt2.f159869b = a;
        bwjt2.f159868a |= 1;
        bwjt bwjt4 = (bwjt) bxvd.mo74062i();
        invoiceSummarySubmitRequest.f110328b = bwjt4;
        return this.f95200g.mo52446a(new awvg(this, buyFlowConfig, invoiceSummarySubmitRequest.f110327a, bwjt4, invoiceSummarySubmitRequest));
    }

    /* renamed from: a */
    public final ServerResponse mo52597a(BuyFlowConfig buyFlowConfig, PaymentMethodsInitializeRequest paymentMethodsInitializeRequest) {
        bmsi bmsi = (bmsi) paymentMethodsInitializeRequest.mo59970a();
        bxvd bxvd = (bxvd) bmsi.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bmsi);
        bmaj bmaj = ((bmsi) paymentMethodsInitializeRequest.mo59970a()).f130685d;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, ((Boolean) awiv.f94497a.mo58455c()).booleanValue());
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bmsi bmsi2 = (bmsi) bxvd.f164949b;
        bmsi bmsi3 = bmsi.f130680e;
        a.getClass();
        bmsi2.f130685d = a;
        bmsi2.f130682a |= 1;
        bmsi bmsi4 = (bmsi) bxvd.mo74062i();
        paymentMethodsInitializeRequest.f110328b = bmsi4;
        return this.f95200g.mo52446a(new awum(this, buyFlowConfig, paymentMethodsInitializeRequest.f110327a, bmsi4));
    }

    /* renamed from: a */
    public final ServerResponse mo52598a(BuyFlowConfig buyFlowConfig, PaymentMethodsSubmitRequest paymentMethodsSubmitRequest) {
        boolean z;
        if (paymentMethodsSubmitRequest.f110329c != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "No SecureDataHeader provided when performing submitPaymentMethods.");
        bmsn bmsn = (bmsn) paymentMethodsSubmitRequest.mo59970a();
        bxvd bxvd = (bxvd) bmsn.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bmsn);
        bmaj bmaj = ((bmsn) paymentMethodsSubmitRequest.mo59970a()).f130717b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, true);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bmsn bmsn2 = (bmsn) bxvd.f164949b;
        bmsn bmsn3 = bmsn.f130714d;
        a.getClass();
        bmsn2.f130717b = a;
        bmsn2.f130716a |= 1;
        bmsn bmsn4 = (bmsn) bxvd.mo74062i();
        paymentMethodsSubmitRequest.f110328b = bmsn4;
        return this.f95200g.mo52446a(new awun(this, buyFlowConfig, paymentMethodsSubmitRequest.f110327a, bmsn4, paymentMethodsSubmitRequest));
    }

    /* renamed from: a */
    public final ServerResponse mo52599a(BuyFlowConfig buyFlowConfig, PurchaseManagerInitializeRequest purchaseManagerInitializeRequest) {
        bwjw bwjw = (bwjw) purchaseManagerInitializeRequest.mo59970a();
        bxvd bxvd = (bxvd) bwjw.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bwjw);
        bmaj bmaj = ((bwjw) purchaseManagerInitializeRequest.mo59970a()).f159885b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, ((Boolean) awix.f94502a.mo58455c()).booleanValue());
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwjw bwjw2 = (bwjw) bxvd.f164949b;
        bwjw bwjw3 = bwjw.f159882e;
        a.getClass();
        bwjw2.f159885b = a;
        bwjw2.f159884a |= 1;
        return this.f95200g.mo52446a(new awvu(this, buyFlowConfig, purchaseManagerInitializeRequest.f110327a, (bwjw) bxvd.mo74062i()));
    }

    /* renamed from: a */
    public final ServerResponse mo52600a(BuyFlowConfig buyFlowConfig, PurchaseManagerSubmitRequest purchaseManagerSubmitRequest) {
        boolean z;
        if (purchaseManagerSubmitRequest.f110329c != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "No SecureDataHeader provided when performing submitPm.");
        bwka bwka = (bwka) purchaseManagerSubmitRequest.mo59970a();
        bxvd bxvd = (bxvd) bwka.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bwka);
        bmaj bmaj = ((bwka) purchaseManagerSubmitRequest.mo59970a()).f159932b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, true);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwka bwka2 = (bwka) bxvd.f164949b;
        bwka bwka3 = bwka.f159929d;
        a.getClass();
        bwka2.f159932b = a;
        bwka2.f159931a |= 1;
        bwka bwka4 = (bwka) bxvd.mo74062i();
        purchaseManagerSubmitRequest.f110328b = bwka4;
        return this.f95200g.mo52446a(new awvv(this, buyFlowConfig, purchaseManagerSubmitRequest.f110327a, bwka4, purchaseManagerSubmitRequest));
    }

    /* renamed from: a */
    public final ServerResponse mo52601a(BuyFlowConfig buyFlowConfig, SetupWizardInitializeRequest setupWizardInitializeRequest) {
        bwgk bwgk = (bwgk) setupWizardInitializeRequest.mo59970a();
        bxvd bxvd = (bxvd) bwgk.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bwgk);
        bmaj bmaj = ((bwgk) setupWizardInitializeRequest.mo59970a()).f159215b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, false);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwgk bwgk2 = (bwgk) bxvd.f164949b;
        bwgk bwgk3 = bwgk.f159212d;
        a.getClass();
        bwgk2.f159215b = a;
        bwgk2.f159214a |= 1;
        bwgk bwgk4 = (bwgk) bxvd.mo74062i();
        setupWizardInitializeRequest.f110328b = bwgk4;
        return this.f95200g.mo52446a(new awvw(this, buyFlowConfig, setupWizardInitializeRequest.f110327a, bwgk4));
    }

    /* renamed from: a */
    public final ServerResponse mo52602a(BuyFlowConfig buyFlowConfig, SetupWizardSubmitRequest setupWizardSubmitRequest) {
        boolean z;
        if (setupWizardSubmitRequest.f110329c != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "No SecureDataHeader provided when performing submitId.");
        bmaj bmaj = ((bwgq) setupWizardSubmitRequest.mo59970a()).f159247b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, true);
        bwgq bwgq = (bwgq) setupWizardSubmitRequest.mo59970a();
        bxvd bxvd = (bxvd) bwgq.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bwgq);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwgq bwgq2 = (bwgq) bxvd.f164949b;
        bwgq bwgq3 = bwgq.f159244d;
        a.getClass();
        bwgq2.f159247b = a;
        bwgq2.f159246a |= 1;
        bwgq bwgq4 = (bwgq) bxvd.mo74062i();
        setupWizardSubmitRequest.f110328b = bwgq4;
        return this.f95200g.mo52446a(new awvx(this, buyFlowConfig, setupWizardSubmitRequest.f110327a, bwgq4, setupWizardSubmitRequest));
    }

    /* renamed from: a */
    public final ServerResponse mo52603a(BuyFlowConfig buyFlowConfig, StatementsViewInitializeRequest statementsViewInitializeRequest) {
        bwkl bwkl = (bwkl) statementsViewInitializeRequest.mo59970a();
        bxvd bxvd = (bxvd) bwkl.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bwkl);
        bmaj bmaj = ((bwkl) statementsViewInitializeRequest.mo59970a()).f159986b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, false);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwkl bwkl2 = (bwkl) bxvd.f164949b;
        bwkl bwkl3 = bwkl.f159983c;
        a.getClass();
        bwkl2.f159986b = a;
        bwkl2.f159985a |= 1;
        bwkl bwkl4 = (bwkl) bxvd.mo74062i();
        statementsViewInitializeRequest.f110328b = bwkl4;
        return this.f95200g.mo52446a(new awvh(this, buyFlowConfig, statementsViewInitializeRequest.f110327a, bwkl4));
    }

    /* renamed from: a */
    public final ServerResponse mo52604a(BuyFlowConfig buyFlowConfig, StatementsViewSubmitRequest statementsViewSubmitRequest) {
        boolean z;
        if (statementsViewSubmitRequest.f110329c != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "No SecureDataHeader provided when performing submitStatementsView.");
        bmaj bmaj = ((bwkn) statementsViewSubmitRequest.mo59970a()).f159992b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, true);
        bwkn bwkn = (bwkn) statementsViewSubmitRequest.mo59970a();
        bxvd bxvd = (bxvd) bwkn.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bwkn);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwkn bwkn2 = (bwkn) bxvd.f164949b;
        bwkn bwkn3 = bwkn.f159989c;
        a.getClass();
        bwkn2.f159992b = a;
        bwkn2.f159991a |= 1;
        bwkn bwkn4 = (bwkn) bxvd.mo74062i();
        statementsViewSubmitRequest.f110328b = bwkn4;
        return this.f95200g.mo52446a(new awvi(this, buyFlowConfig, statementsViewSubmitRequest.f110327a, bwkn4, statementsViewSubmitRequest));
    }

    /* renamed from: a */
    public final ServerResponse mo52605a(BuyFlowConfig buyFlowConfig, TimelineViewInitializeRequest timelineViewInitializeRequest) {
        bmaj bmaj = ((bwkp) timelineViewInitializeRequest.mo59970a()).f159998b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, ((Boolean) awjg.f94534a.mo58455c()).booleanValue());
        bwkp bwkp = (bwkp) timelineViewInitializeRequest.mo59970a();
        bxvd bxvd = (bxvd) bwkp.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bwkp);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwkp bwkp2 = (bwkp) bxvd.f164949b;
        bwkp bwkp3 = bwkp.f159995d;
        a.getClass();
        bwkp2.f159998b = a;
        bwkp2.f159997a |= 1;
        bwkp bwkp4 = (bwkp) bxvd.mo74062i();
        timelineViewInitializeRequest.f110328b = bwkp4;
        return this.f95200g.mo52446a(new awuy(this, buyFlowConfig, timelineViewInitializeRequest.f110327a, bwkp4));
    }

    /* renamed from: a */
    public final ServerResponse mo52606a(BuyFlowConfig buyFlowConfig, TimelineViewSubmitRequest timelineViewSubmitRequest) {
        boolean z;
        if (timelineViewSubmitRequest.f110329c != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "No SecureDataHeader provided when performing submitTimelineView.");
        bwkt bwkt = (bwkt) timelineViewSubmitRequest.mo59970a();
        bxvd bxvd = (bxvd) bwkt.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bwkt);
        bmaj bmaj = ((bwkt) timelineViewSubmitRequest.mo59970a()).f160038b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, true);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwkt bwkt2 = (bwkt) bxvd.f164949b;
        bwkt bwkt3 = bwkt.f160035d;
        a.getClass();
        bwkt2.f160038b = a;
        bwkt2.f160037a |= 1;
        bwkt bwkt4 = (bwkt) bxvd.mo74062i();
        timelineViewSubmitRequest.f110328b = bwkt4;
        return this.f95200g.mo52446a(new awuz(this, buyFlowConfig, timelineViewSubmitRequest.f110327a, bwkt4, timelineViewSubmitRequest));
    }

    /* renamed from: a */
    public final ServerResponse mo52607a(BuyFlowConfig buyFlowConfig, UpstreamInitializeRequest upstreamInitializeRequest) {
        bwkw bwkw = (bwkw) upstreamInitializeRequest.mo59970a();
        bxvd bxvd = (bxvd) bwkw.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bwkw);
        bmaj bmaj = ((bwkw) upstreamInitializeRequest.mo59970a()).f160060b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, ((Boolean) awjh.f94535a.mo58455c()).booleanValue());
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwkw bwkw2 = (bwkw) bxvd.f164949b;
        bwkw bwkw3 = bwkw.f160057d;
        a.getClass();
        bwkw2.f160060b = a;
        bwkw2.f160059a |= 1;
        bwkw bwkw4 = (bwkw) bxvd.mo74062i();
        upstreamInitializeRequest.f110328b = bwkw4;
        return this.f95200g.mo52446a(new awvl(this, buyFlowConfig, upstreamInitializeRequest.f110327a, bwkw4));
    }

    /* renamed from: a */
    public final ServerResponse mo52608a(BuyFlowConfig buyFlowConfig, UpstreamSubmitRequest upstreamSubmitRequest) {
        bmaj bmaj = ((bwkz) upstreamSubmitRequest.mo59970a()).f160074b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, true);
        bwkz bwkz = (bwkz) upstreamSubmitRequest.mo59970a();
        bxvd bxvd = (bxvd) bwkz.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bwkz);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwkz bwkz2 = (bwkz) bxvd.f164949b;
        bwkz bwkz3 = bwkz.f160071d;
        a.getClass();
        bwkz2.f160074b = a;
        bwkz2.f160073a |= 1;
        bwkz bwkz4 = (bwkz) bxvd.mo74062i();
        upstreamSubmitRequest.f110328b = bwkz4;
        return this.f95200g.mo52446a(new awvk(this, buyFlowConfig, upstreamSubmitRequest.f110327a, bwkz4));
    }

    /* renamed from: a */
    public final ServerResponse mo52609a(BuyFlowConfig buyFlowConfig, UserManagementInitializeRequest userManagementInitializeRequest) {
        bwld bwld = (bwld) userManagementInitializeRequest.mo59970a();
        bxvd bxvd = (bxvd) bwld.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bwld);
        bmaj bmaj = ((bwld) userManagementInitializeRequest.mo59970a()).f160095b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, ((Boolean) awji.f94536a.mo58455c()).booleanValue());
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwld bwld2 = (bwld) bxvd.f164949b;
        bwld bwld3 = bwld.f160092d;
        a.getClass();
        bwld2.f160095b = a;
        bwld2.f160094a |= 1;
        bwld bwld4 = (bwld) bxvd.mo74062i();
        userManagementInitializeRequest.f110328b = bwld4;
        return this.f95200g.mo52446a(new awvc(this, buyFlowConfig, userManagementInitializeRequest.f110327a, bwld4));
    }

    /* renamed from: a */
    public final ServerResponse mo52610a(BuyFlowConfig buyFlowConfig, UserManagementSubmitRequest userManagementSubmitRequest) {
        boolean z;
        if (userManagementSubmitRequest.f110329c != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "No SecureDataHeader provided when performing submitUserManagement.");
        bwlh bwlh = (bwlh) userManagementSubmitRequest.mo59970a();
        bxvd bxvd = (bxvd) bwlh.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bwlh);
        bmaj bmaj = ((bwlh) userManagementSubmitRequest.mo59970a()).f160126b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, true);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwlh bwlh2 = (bwlh) bxvd.f164949b;
        bwlh bwlh3 = bwlh.f160123d;
        a.getClass();
        bwlh2.f160126b = a;
        bwlh2.f160125a |= 1;
        bwlh bwlh4 = (bwlh) bxvd.mo74062i();
        userManagementSubmitRequest.f110328b = bwlh4;
        return this.f95200g.mo52446a(new awvd(this, buyFlowConfig, userManagementSubmitRequest.f110327a, bwlh4, userManagementSubmitRequest));
    }

    /* renamed from: a */
    public final ServerResponse mo52611a(BuyFlowConfig buyFlowConfig, WebViewWidgetInitializeRequest webViewWidgetInitializeRequest) {
        bwlj bwlj = (bwlj) webViewWidgetInitializeRequest.mo59970a();
        bxvd bxvd = (bxvd) bwlj.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bwlj);
        bmaj bmaj = ((bwlj) webViewWidgetInitializeRequest.mo59970a()).f160140b;
        if (bmaj == null) {
            bmaj = bmaj.f128452m;
        }
        bmaj a = awvz.m81270a(bmaj, buyFlowConfig, this.f95198e, ((Boolean) awjj.f94537a.mo58455c()).booleanValue());
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwlj bwlj2 = (bwlj) bxvd.f164949b;
        bwlj bwlj3 = bwlj.f160137d;
        a.getClass();
        bwlj2.f160140b = a;
        bwlj2.f160139a |= 1;
        bwlj bwlj4 = (bwlj) bxvd.mo74062i();
        webViewWidgetInitializeRequest.f110328b = bwlj4;
        return this.f95200g.mo52446a(new awvm(this, buyFlowConfig, webViewWidgetInitializeRequest.f110327a, bwlj4));
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0109 A[SYNTHETIC, Splitter:B:39:0x0109] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0116 A[SYNTHETIC, Splitter:B:47:0x0116] */
    /* renamed from: a */
    public final ServerResponse mo52612a(BuyFlowConfig buyFlowConfig, WriteDocumentServerRequest writeDocumentServerRequest) {
        Throwable th;
        bmqu bmqu = (bmqu) writeDocumentServerRequest.mo59970a();
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str = null;
        parcelFileDescriptor = null;
        try {
            ParcelFileDescriptor openFileDescriptor = this.f95198e.getContentResolver().openFileDescriptor(writeDocumentServerRequest.f110388d, "r");
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(openFileDescriptor.getFileDescriptor()));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                for (int read = bufferedInputStream.read(bArr); read != -1; read = bufferedInputStream.read(bArr)) {
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (openFileDescriptor != null) {
                    try {
                        openFileDescriptor.close();
                    } catch (IOException e) {
                        Log.e("NetworkOrchService", "Error closing file descriptor");
                    }
                }
                bmey a = bmey.m107962a(bmqu.f130433b);
                if (a == null) {
                    a = bmey.UNKNOWN;
                }
                int ordinal = a.ordinal();
                if (ordinal == 1) {
                    str = "IMAGE_PNG";
                } else if (ordinal != 2) {
                    int i = a.f129049d;
                    StringBuilder sb = new StringBuilder(49);
                    sb.append("MIME type unspecified or unsupported: ");
                    sb.append(i);
                    Log.e("NetworkOrchService", sb.toString());
                } else {
                    str = "IMAGE_JPEG";
                }
                if (str == null) {
                    return ServerResponse.f110427e;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Pair("s7e_file", Base64.encodeToString(byteArray, 10)));
                arrayList.add(new Pair("s7e_keytype", Integer.toString(bmqu.f130435d)));
                arrayList.add(new Pair("mime_type", str));
                arrayList.add(new Pair("file_name", bmqu.f130434c));
                arrayList.add(new Pair("os_type", "android"));
                arrayList.add(new Pair("upload_token", Base64.encodeToString(bmqu.f130436e.getKey(), 2)));
                return this.f95200g.mo52446a(new awuq(this, buyFlowConfig, writeDocumentServerRequest.f110327a, writeDocumentServerRequest.f110389e, arrayList));
            } catch (IOException e2) {
                parcelFileDescriptor = openFileDescriptor;
                try {
                    Log.e("NetworkOrchService", "Error reading file");
                    ServerResponse serverResponse = ServerResponse.f110427e;
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException e3) {
                            Log.e("NetworkOrchService", "Error closing file descriptor");
                        }
                    }
                    return serverResponse;
                } catch (Throwable th2) {
                    th = th2;
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException e4) {
                            Log.e("NetworkOrchService", "Error closing file descriptor");
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                parcelFileDescriptor = openFileDescriptor;
                if (parcelFileDescriptor != null) {
                }
                throw th;
            }
        } catch (IOException e5) {
            Log.e("NetworkOrchService", "Error reading file");
            ServerResponse serverResponse2 = ServerResponse.f110427e;
            if (parcelFileDescriptor != null) {
            }
            return serverResponse2;
        } catch (Throwable th4) {
            th = th4;
            if (parcelFileDescriptor != null) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final ServerResponse mo52651a(String str, bjev bjev, Object obj, int i) {
        return (ServerResponse) awfs.m79870a(new awvo(this, obj, str, bjev, i));
    }

    /* renamed from: a */
    public final ServerResponse mo52652a(String str, bjev bjev, Object obj, List list, int i) {
        return (ServerResponse) awfs.m79870a(new awvq(this, obj, str, bjev, list, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SecureElementStoredValue[] mo52653a(Account account, BuyFlowConfig buyFlowConfig) {
        SecureElementStoredValue[] secureElementStoredValueArr;
        if (this.f95197d == null) {
            this.f95197d = m81219a(this.f95198e, account, buyFlowConfig);
        }
        try {
            secureElementStoredValueArr = (SecureElementStoredValue[]) this.f95197d.get(chgo.m148689c(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            secureElementStoredValueArr = new SecureElementStoredValue[0];
        }
        this.f95197d = null;
        return secureElementStoredValueArr == null ? new SecureElementStoredValue[0] : secureElementStoredValueArr;
    }
}
