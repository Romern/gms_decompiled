package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.analytics.events.OwFullWalletRequestedEvent;
import com.google.android.gms.wallet.common.p079ui.ErrorChimeraActivity;
import com.google.android.gms.wallet.intentoperation.p083ib.ReportErrorChimeraIntentOperation;
import com.google.android.gms.wallet.p081ib.IbChimeraActivity;
import com.google.android.gms.wallet.p081ib.LockScreenForFullWalletChimeraActivity;
import com.google.android.gms.wallet.service.orchestration.BuyFlowIntegratorDataResponse;
import com.google.android.gms.wallet.service.p086ib.IbBuyFlowInput;
import com.google.android.gms.wallet.service.p086ib.IbMerchantParameters;
import com.google.android.gms.wallet.service.p086ib.LoadFullWalletServiceRequest;
import com.google.android.gms.wallet.service.p086ib.LoadFullWalletServiceResponse;
import com.google.android.gms.wallet.service.p086ib.ProcessBuyFlowResultRequest;
import com.google.android.gms.wallet.service.p086ib.ProcessBuyFlowResultResponse;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

/* renamed from: awsd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awsd {

    /* renamed from: a */
    private final Context f95000a;

    /* renamed from: b */
    private final awrh f95001b;

    /* renamed from: c */
    private final awua f95002c;

    /* renamed from: d */
    private final awwt f95003d;

    /* renamed from: e */
    private final awsm f95004e;

    /* renamed from: f */
    private final SecureRandom f95005f;

    /* renamed from: g */
    private final awsz f95006g;

    /* renamed from: h */
    private final awta f95007h;

    /* renamed from: i */
    private final LoadFullWalletServiceRequest f95008i;

    /* renamed from: j */
    private BuyFlowConfig f95009j;

    /* renamed from: k */
    private int f95010k = 8;

    /* renamed from: l */
    private int f95011l = 1;

    public awsd(Context context, awrh awrh, awua awua, awwt awwt, awsm awsm, SecureRandom secureRandom, awsz awsz, awta awta, LoadFullWalletServiceRequest loadFullWalletServiceRequest) {
        this.f95000a = context;
        this.f95001b = awrh;
        this.f95002c = awua;
        this.f95003d = awwt;
        this.f95004e = awsm;
        this.f95005f = secureRandom;
        this.f95006g = awsz;
        this.f95007h = awta;
        this.f95008i = loadFullWalletServiceRequest;
    }

    /* renamed from: a */
    private final LoadFullWalletServiceResponse m80898a(int i, int i2) {
        this.f95010k = i;
        this.f95011l = i2;
        return new LoadFullWalletServiceResponse(Bundle.EMPTY, m80901c(), i);
    }

    /* renamed from: b */
    private final String m80900b() {
        FullWalletRequest fullWalletRequest = this.f95008i.f110346b;
        return fullWalletRequest != null ? fullWalletRequest.f109795a : "";
    }

    /* renamed from: c */
    private final FullWallet m80901c() {
        String str;
        awap a = FullWallet.m93786a();
        FullWalletRequest fullWalletRequest = this.f95008i.f110346b;
        if (fullWalletRequest != null) {
            str = fullWalletRequest.f109796b;
        } else {
            str = null;
        }
        a.mo51791b(str);
        return a.f94139a;
    }

    /* renamed from: a */
    private final void m80899a(Bundle bundle) {
        sdo.m34970a(this.f95009j == null);
        this.f95009j = awrt.m80827a(bundle, m80900b());
    }

    /* renamed from: a */
    public final LoadFullWalletServiceResponse mo52520a() {
        String str;
        long j;
        LoadFullWalletServiceResponse loadFullWalletServiceResponse;
        int i;
        Cart cart;
        long j2;
        String str2;
        int i2;
        awsc awsc;
        asmk asmk;
        boolean z;
        long j3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        FullWalletRequest fullWalletRequest = this.f95008i.f110346b;
        if (fullWalletRequest == null) {
            awrt.m80846a("loadFullWallet", "Request should not be null!");
            loadFullWalletServiceResponse = m80898a(10, 1066);
            j = elapsedRealtime;
            str = "ignoredFieldName";
        } else {
            byak a = this.f95006g.mo52546a(fullWalletRequest.f109795a);
            if (a == null) {
                awrt.m80846a("loadFullWallet", String.format("Unknown active googleTransactionId \"%s\". This may happen when you sent the wrong ID or a more than 24h old id or an id for which a FullWallet was already returned.", this.f95008i.f110346b.f109795a));
                loadFullWalletServiceResponse = m80898a(410, 1031);
                j = elapsedRealtime;
                str = "ignoredFieldName";
            } else {
                Bundle bundle = new Bundle();
                bundle.putAll(this.f95008i.f110345a);
                bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(a.f165273c, "com.google"));
                m80899a(bundle);
                awru awru = new awru();
                awrt.m80844a(this.f95008i.f110346b.f109797c, "cart", awru);
                if (awru.f94946a.isEmpty()) {
                    IbBuyFlowInput a2 = IbBuyFlowInput.m94104a(a.f165274d);
                    if (a2.mo60005m() == 5) {
                        awrt.m80846a("loadFullWallet", String.format("A successful full wallet for googleTransactionId \"%s\" has already been issued. You must call changeMaskedWallet again before issuing a new full wallet with this googleTransactionId or  call loadMaskedWallet to obtain a new googleTransactionId.", this.f95008i.f110346b.f109795a));
                        loadFullWalletServiceResponse = m80898a(410, 1032);
                        j = elapsedRealtime;
                        str = "ignoredFieldName";
                    } else {
                        if (a2.mo59997f()) {
                            Cart cart2 = this.f95008i.f110346b.f109797c;
                            awsc = new awsc();
                            blzu blzu = a.f165276f;
                            if (blzu == null) {
                                blzu = blzu.f128387j;
                            }
                            if (!blzu.f128397i) {
                                String e = a2.mo59994e();
                                if (blzu.f128396h) {
                                    aspb aspb = new aspb();
                                    j = elapsedRealtime;
                                    aspb.f89334a = this.f95005f.nextLong();
                                    blzu blzu2 = a.f165276f;
                                    if (blzu2 == null) {
                                        blzu2 = blzu.f128387j;
                                    }
                                    if (awrt.m80804a(a2, blzu2.f128390b) != 3) {
                                        aspb.f89338e = Collections.singletonList(1);
                                    } else {
                                        if (cart2 != null) {
                                            j3 = awrt.m80806a(cart2.f109776a, "ignoredFieldName", new awru());
                                        } else {
                                            j3 = 0;
                                        }
                                        aspb.f89339f = awrt.m80862c(cart2.f109777b);
                                        aspb.f89335b = j3;
                                        aspb.f89337d = a.f165278h;
                                        aspb.f89336c = a.f165277g;
                                        aspb.f89338e = Collections.singletonList(2);
                                    }
                                    awrh awrh = this.f95001b;
                                    BuyFlowConfig buyFlowConfig = this.f95009j;
                                    awwt awwt = this.f95003d;
                                    str = "ignoredFieldName";
                                    String str3 = blzu.f128390b;
                                    asmk = (asmk) awrh.mo52501a(new awsb(buyFlowConfig, awwt, str3, e, a2.mo59974a(str3), aspb.mo49317a()));
                                } else {
                                    j = elapsedRealtime;
                                    str = "ignoredFieldName";
                                    asmk = null;
                                }
                                BuyFlowConfig buyFlowConfig2 = this.f95009j;
                                rjr a3 = this.f95003d.mo65547a(buyFlowConfig2, buyFlowConfig2.f110418b.f110407b, e, blzu.f128390b);
                                if (!a3.f43154a.mo17710c()) {
                                    Log.w("LoadFullWalletAction", String.format("Failed to retrieve payment credential for Android Pay in full wallet! status = %s", Integer.valueOf(a3.f43154a.f30115i)));
                                    awsc.f94998a = m80898a(8, 1001);
                                    z = true;
                                } else {
                                    z = a3.f43155b;
                                    if (z && asmk != null) {
                                        if (asmk.mo7183bo().mo17710c()) {
                                            awsc.f94999b = asmk.mo49242b();
                                        } else if (asmk.mo7183bo().f30115i == 15001) {
                                            String format = String.format(this.f95000a.getString(C0126R.string.wallet_google_pay_card_unusable), blzu.f128392d);
                                            this.f95010k = 8;
                                            this.f95011l = 1004;
                                            Intent intent = new Intent();
                                            intent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 8);
                                            intent.putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", m80901c());
                                            PendingIntent a4 = spn.m35844a(this.f95000a, ErrorChimeraActivity.m93895a(this.f95009j, intent, format), (int) JGCastService.FLAG_PRIVATE_DISPLAY);
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT", a4);
                                            awsc.f94998a = new LoadFullWalletServiceResponse(bundle2, null, 6);
                                        } else {
                                            Log.w("LoadFullWalletAction", String.format(Locale.US, "Failed to retrieve payment credential for Android Pay in full wallet! status = %s", Integer.valueOf(asmk.mo7183bo().f30115i)));
                                            awsc.f94998a = m80898a(8, 1004);
                                        }
                                    }
                                }
                                if ((!this.f95008i.f110347c && ((Boolean) awie.f94410f.mo58455c()).booleanValue()) || !z) {
                                    LoadFullWalletServiceRequest loadFullWalletServiceRequest = this.f95008i;
                                    if (loadFullWalletServiceRequest.f110347c) {
                                        Log.e("LoadFullWalletAction", "Trying to show the lockscreen again from lockscreen activity!");
                                        awsc.f94998a = m80898a(8, 1005);
                                    } else {
                                        this.f95010k = 6;
                                        awsc.f94998a = new LoadFullWalletServiceResponse(awrt.m80811a(this.f95000a, LockScreenForFullWalletChimeraActivity.m93994a(this.f95009j, new LoadFullWalletServiceRequest(loadFullWalletServiceRequest.f110345a, loadFullWalletServiceRequest.f110346b, true))), null, 6);
                                    }
                                }
                            } else {
                                j = elapsedRealtime;
                                str = "ignoredFieldName";
                                if (blzu.f128396h) {
                                    awsc.f94998a = m80898a(8, 1035);
                                }
                            }
                            LoadFullWalletServiceResponse loadFullWalletServiceResponse2 = awsc.f94998a;
                            if (loadFullWalletServiceResponse2 != null) {
                                loadFullWalletServiceResponse = loadFullWalletServiceResponse2;
                            }
                        } else {
                            j = elapsedRealtime;
                            str = "ignoredFieldName";
                            awsc = null;
                        }
                        a2.mo59985b(5);
                        if (!(awsc == null || awsc.f94999b == null)) {
                            blzu blzu3 = a.f165276f;
                            if (blzu3 == null) {
                                blzu3 = blzu.f128387j;
                            }
                            a2.mo59978a(awvz.m81272a(awsc.f94999b, awrt.m80804a(a2, blzu3.f128390b)));
                        }
                        awrq awrq = new awrq();
                        awrq.f94929a = a.f165278h;
                        awrq.f94930b = this.f95008i.f110346b.f109796b;
                        IbMerchantParameters a5 = awrq.mo52513a();
                        BuyFlowIntegratorDataResponse buyFlowIntegratorDataResponse = (BuyFlowIntegratorDataResponse) this.f95001b.mo52501a(new awrz(this.f95009j, this.f95002c, a2, a5, a.f165275e.mo73780k()));
                        int i3 = buyFlowIntegratorDataResponse.f110379e;
                        if (i3 == 6) {
                            loadFullWalletServiceResponse = m80898a(7, 1);
                        } else if (i3 == 49) {
                            awrq awrq2 = new awrq();
                            awrq2.f94929a = a.f165278h;
                            awrq2.f94930b = this.f95008i.f110346b.f109796b;
                            ProcessBuyFlowResultResponse a6 = new awsq(this.f95000a, this.f95003d, this.f95004e, this.f95006g, this.f95007h, this.f95009j, new ProcessBuyFlowResultRequest(a2, awrq2.mo52513a(), buyFlowIntegratorDataResponse.f110377c, buyFlowIntegratorDataResponse.f110376b, 0)).mo52536a();
                            if (a6.f110362b != -1) {
                                Log.e("LoadFullWalletAction", String.format("Received unexpected activityResultCode = %s", a6.f110363c));
                                int i4 = a6.f110365e;
                                if (i4 == 1) {
                                    i4 = 1003;
                                }
                                loadFullWalletServiceResponse = m80898a(a6.f110363c.getIntExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 8), i4);
                            } else {
                                Bundle extras = a6.f110363c.getExtras();
                                if (!extras.containsKey("com.google.android.gms.wallet.EXTRA_FULL_WALLET")) {
                                    Log.e("LoadFullWalletAction", "Could not derive a full wallet from the buyFlowResult");
                                    loadFullWalletServiceResponse = m80898a(8, 1002);
                                } else {
                                    extras.remove("com.google.android.gms.wallet.EXTRA_FULL_WALLET");
                                    this.f95010k = 0;
                                    loadFullWalletServiceResponse = new LoadFullWalletServiceResponse(extras, (FullWallet) extras.getParcelable("com.google.android.gms.wallet.EXTRA_FULL_WALLET"), 0);
                                }
                            }
                        } else if (i3 != 50) {
                            Log.e("LoadFullWalletAction", String.format("Unexpected responseType from getBuyFlowIntegratorData: %d", Integer.valueOf(i3)));
                            loadFullWalletServiceResponse = m80898a(8, 1006);
                        } else {
                            this.f95010k = 6;
                            Bundle bundle3 = new Bundle();
                            bundle3.putParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT", spn.m35844a(this.f95000a, IbChimeraActivity.m93947a(this.f95009j, buyFlowIntegratorDataResponse.f110375a, buyFlowIntegratorDataResponse.f110377c, a2, a5, null), (int) JGCastService.FLAG_PRIVATE_DISPLAY));
                            loadFullWalletServiceResponse = new LoadFullWalletServiceResponse(bundle3, null, 6);
                        }
                    }
                } else {
                    j = elapsedRealtime;
                    str = "ignoredFieldName";
                    ArrayList arrayList = awru.f94946a;
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        awrt.m80846a("loadFullWallet", (String) arrayList.get(i5));
                    }
                    loadFullWalletServiceResponse = m80898a(10, awru.f94947b);
                }
            }
        }
        int elapsedRealtime2 = (int) (SystemClock.elapsedRealtime() - j);
        if (this.f95010k != 6) {
            if (this.f95009j == null) {
                m80899a(this.f95008i.f110345a);
            }
            String b = m80900b();
            int i6 = this.f95011l;
            if (i6 != 1) {
                BuyFlowConfig buyFlowConfig3 = this.f95009j;
                int i7 = this.f95010k;
                int i8 = i6 - 1;
                if (i6 != 0) {
                    ReportErrorChimeraIntentOperation.m94035a(buyFlowConfig3, b, 5, i7, i8, this.f95000a);
                } else {
                    throw null;
                }
            }
            LoadFullWalletServiceRequest loadFullWalletServiceRequest2 = this.f95008i;
            if (!loadFullWalletServiceRequest2.f110347c) {
                i = 2;
            } else {
                i = 4;
            }
            FullWalletRequest fullWalletRequest2 = loadFullWalletServiceRequest2.f110346b;
            if (fullWalletRequest2 != null) {
                cart = fullWalletRequest2.f109797c;
            } else {
                cart = null;
            }
            if (cart != null) {
                j2 = awrt.m80806a(cart.f109776a, str, new awru());
            } else {
                j2 = 0;
            }
            Account account = this.f95009j.f110418b.f110407b;
            if (account != null) {
                str2 = account.name;
            } else {
                str2 = null;
            }
            int i9 = this.f95010k;
            if (i9 == 0) {
                i2 = 2;
            } else {
                i2 = 5;
            }
            Context context = this.f95000a;
            BuyFlowConfig buyFlowConfig4 = this.f95009j;
            int i10 = this.f95011l;
            int i11 = i10 - 1;
            if (i10 != 0) {
                OwFullWalletRequestedEvent.m93832a(context, buyFlowConfig4, i2, i9, i11, elapsedRealtime2, j2, i - 1, str2, b);
            } else {
                throw null;
            }
        }
        return loadFullWalletServiceResponse;
    }
}
