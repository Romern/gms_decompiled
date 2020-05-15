package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.Log;
import android.widget.RemoteViews;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.tapandpay.firstparty.GetActiveCardsForAccountResponse;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.GiftCardWalletObject;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.IsReadyToPayResponse;
import com.google.android.gms.wallet.LoyaltyWalletObject;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.OfferWalletObject;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.WebPaymentData;
import com.google.android.gms.wallet.WebPaymentDataRequest;
import com.google.android.gms.wallet.analytics.events.IsReadyToPayCallEvent;
import com.google.android.gms.wallet.analytics.events.OwInitializedEvent;
import com.google.android.gms.wallet.analytics.events.OwMwChooserShownEvent;
import com.google.android.gms.wallet.analytics.events.OwMwUnsuccessfulEvent;
import com.google.android.gms.wallet.analytics.events.OwWalletFragmentButtonClickedEvent;
import com.google.android.gms.wallet.firstparty.ExecuteBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenRequest;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenResponse;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.InitializeBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysRequest;
import com.google.android.gms.wallet.firstparty.WarmUpUiProcessRequest;
import com.google.android.gms.wallet.firstparty.WarmUpUiProcessResponse;
import com.google.android.gms.wallet.firstparty.saveinstrument.Card;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsRequest;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsResponse;
import com.google.android.gms.wallet.firstparty.saveinstrument.SaveInstrumentRequest;
import com.google.android.gms.wallet.intentoperation.orchestration.BuyFlowInitializationIntentOperation;
import com.google.android.gms.wallet.intentoperation.p083ib.ReportErrorChimeraIntentOperation;
import com.google.android.gms.wallet.p081ib.IbChimeraActivity;
import com.google.android.gms.wallet.p081ib.LaunchPendingIntentChimeraActivity;
import com.google.android.gms.wallet.p088ui.redirect.PopupRedirectChimeraActivity;
import com.google.android.gms.wallet.service.orchestration.BuyflowInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.SetUpBiometricAuthenticationKeysServiceResponse;
import com.google.android.gms.wallet.service.orchestration.UpstreamInitializeRequest;
import com.google.android.gms.wallet.service.orchestration.UpstreamSubmitRequest;
import com.google.android.gms.wallet.service.p086ib.IbBuyFlowInput;
import com.google.android.gms.wallet.service.p086ib.LoadFullWalletServiceRequest;
import com.google.android.gms.wallet.service.p086ib.LoadFullWalletServiceResponse;
import com.google.android.gms.wallet.service.p086ib.LoadMaskedWalletServiceRequest;
import com.google.android.gms.wallet.service.p086ib.LoadMaskedWalletServiceResponse;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.LoyaltyPointsBalance;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: awxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awxf extends awne {

    /* renamed from: a */
    final Context f95226a;

    /* renamed from: b */
    final awwt f95227b;

    /* renamed from: c */
    final rfz f95228c;

    /* renamed from: d */
    private final awtz f95229d;

    /* renamed from: e */
    private final awrs f95230e;

    /* renamed from: f */
    private final sjn f95231f;

    public awxf(sjh sjh, awtz awtz, rjx rjx, awrs awrs, sjn sjn) {
        Context baseContext = sjh.getBaseContext();
        this.f95226a = baseContext;
        this.f95229d = awtz;
        this.f95228c = rfz.m33557a(baseContext);
        this.f95227b = new awwt(this.f95226a, rjx);
        this.f95230e = awrs;
        this.f95231f = sjn;
    }

    /* renamed from: a */
    private static void m81354a(String str, StringBuilder sb) {
        Log.e("WalletClient", str);
        if (sb.length() > 0) {
            sb.append(10);
        }
        sb.append(str);
    }

    /* renamed from: a */
    public final void mo52314a(NotifyTransactionStatusRequest notifyTransactionStatusRequest, Bundle bundle) {
    }

    /* renamed from: b */
    public final void mo52326b(Bundle bundle) {
        String str;
        mo52697c(bundle);
        BuyFlowConfig a = awxj.m81398a(bundle);
        Account account = a.f110418b.f110407b;
        if (account == null) {
            str = "noAccount";
        } else {
            str = account.name;
        }
        awqc.m80662a(this.f95226a, new OwWalletFragmentButtonClickedEvent(a, str, bundle.getInt("com.google.android.gms.wallet.fragment.BUTTON")));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo52697c(Bundle bundle) {
        sdo.checkIfNull(bundle, "parameters is required");
        String string = bundle.getString("androidPackageName");
        sdo.m34975b(!TextUtils.isEmpty(string), "packageName is required");
        spn.m35872c(this.f95226a, string);
        return string;
    }

    /* renamed from: a */
    public final void mo52308a(Bundle bundle) {
        String str;
        mo52697c(bundle);
        BuyFlowConfig a = awxj.m81398a(bundle);
        Account account = a.f110418b.f110407b;
        if (account == null) {
            str = "noAccount";
        } else {
            str = account.name;
        }
        awqc.m80662a(this.f95226a, new OwInitializedEvent(a, str));
    }

    /* renamed from: b */
    public final void mo52327b(Bundle bundle, awnl awnl) {
        awnl.mo52340b(0, true, Bundle.EMPTY);
    }

    /* renamed from: a */
    public final void mo52309a(Bundle bundle, awnl awnl) {
        boolean z;
        byal a;
        awrs awrs = this.f95230e;
        awrs.mo52514a(bundle);
        awrj awrj = new awrj(awrs.f94932a, awrs.f94935d, awrs.f94936e, awrs.f94940i, bundle);
        Account[] a2 = adyd.m51363a(awrj.f94922a).mo33916a("com.google");
        BuyFlowConfig a3 = awrt.m80827a(awrj.f94926e, (String) null);
        Account a4 = awrt.m80810a(a2, a3, awrj.f94923b, awrj.f94924c, awrj.f94925d);
        if (a4 == null || (a = awrj.f94925d.mo52547a(a3.f110418b.f110406a, a4, a3.f110419c)) == null) {
            z = false;
        } else {
            z = a.f165285e;
        }
        awnl.mo52332a(0, z, Bundle.EMPTY);
    }

    /* renamed from: a */
    public final void mo52310a(CreateWalletObjectsRequest createWalletObjectsRequest, Bundle bundle, awnl awnl) {
        boolean z;
        String str;
        CreateWalletObjectsRequest createWalletObjectsRequest2 = createWalletObjectsRequest;
        Bundle bundle2 = bundle;
        awnl awnl2 = awnl;
        sdo.checkIfNull(awnl2, "callbacks is required");
        String c = mo52697c(bundle2);
        StringBuilder sb = new StringBuilder("CreateWalletObjects ");
        if (createWalletObjectsRequest2 == null) {
            m81354a("CreateWalletObjectsRequest was null.", sb);
        } else {
            CommonWalletObject a = awxj.m81400a(createWalletObjectsRequest);
            if (a == null) {
                m81354a("WalletObject is null.", sb);
                z = false;
            } else {
                if (TextUtils.isEmpty(a.f110601d)) {
                    m81354a("issuerName is not defined for WalletObject.", sb);
                    z = false;
                } else {
                    z = true;
                }
                if (TextUtils.isEmpty(a.f110600c)) {
                    m81354a("name is not defined for WalletObject.", sb);
                    z = false;
                }
            }
            GiftCardWalletObject giftCardWalletObject = createWalletObjectsRequest2.f109782c;
            if (giftCardWalletObject != null ? !(!z || TextUtils.isEmpty(giftCardWalletObject.f109799b)) : z) {
                Context context = this.f95226a;
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", true);
                Bundle bundle4 = new Bundle();
                CommonWalletObject a2 = awxj.m81400a(createWalletObjectsRequest);
                GiftCardWalletObject giftCardWalletObject2 = createWalletObjectsRequest2.f109782c;
                if (giftCardWalletObject2 == null) {
                    str = a2.f110600c;
                } else {
                    str = String.format("%s: %s", context.getString(C0126R.string.wallet_gift_card_balance), bjvk.m104704a().mo65563a().mo65566a(new BigDecimal(giftCardWalletObject2.f109802e).movePointLeft(6), giftCardWalletObject2.f109803f));
                }
                BuyFlowConfig a3 = awxj.m81398a(bundle3);
                bxvd da = btro.f150127e.mo74144da();
                LoyaltyWalletObject loyaltyWalletObject = createWalletObjectsRequest2.f109780a;
                if (loyaltyWalletObject != null) {
                    bxvd da2 = bmve.f131025f.mo74144da();
                    bmvt a4 = awxk.m81408a(loyaltyWalletObject.mo59760a());
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bmve bmve = (bmve) da2.f164949b;
                    a4.getClass();
                    bmve.f131028b = a4;
                    bmve.f131027a |= 1;
                    if (!TextUtils.isEmpty(loyaltyWalletObject.f109827e)) {
                        String str2 = loyaltyWalletObject.f109827e;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bmve bmve2 = (bmve) da2.f164949b;
                        str2.getClass();
                        bmve2.f131027a |= 4;
                        bmve2.f131029c = str2;
                    }
                    if (!TextUtils.isEmpty(loyaltyWalletObject.f109824b)) {
                        String str3 = loyaltyWalletObject.f109824b;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bmve bmve3 = (bmve) da2.f164949b;
                        str3.getClass();
                        bmve3.f131027a |= 8;
                        bmve3.f131030d = str3;
                    }
                    LoyaltyPoints loyaltyPoints = loyaltyWalletObject.f109844v;
                    if (loyaltyPoints != null) {
                        bxvd da3 = bmvf.f131032d.mo74144da();
                        if (!TextUtils.isEmpty(loyaltyPoints.f110622a)) {
                            String str4 = loyaltyPoints.f110622a;
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bmvf bmvf = (bmvf) da3.f164949b;
                            str4.getClass();
                            bmvf.f131034a |= 1;
                            bmvf.f131035b = str4;
                        }
                        LoyaltyPointsBalance loyaltyPointsBalance = loyaltyPoints.f110623b;
                        if (!(loyaltyPointsBalance == null || loyaltyPointsBalance.f110630f == -1)) {
                            bxvd da4 = bmvg.f131037f.mo74144da();
                            int i = loyaltyPointsBalance.f110630f;
                            if (i == 0) {
                                int i2 = loyaltyPointsBalance.f110625a;
                                if (da4.f164950c) {
                                    da4.mo74035c();
                                    da4.f164950c = false;
                                }
                                bmvg bmvg = (bmvg) da4.f164949b;
                                bmvg.f131039a = 2 | bmvg.f131039a;
                                bmvg.f131041c = i2;
                            } else if (i == 1) {
                                String str5 = loyaltyPointsBalance.f110626b;
                                if (da4.f164950c) {
                                    da4.mo74035c();
                                    da4.f164950c = false;
                                }
                                bmvg bmvg2 = (bmvg) da4.f164949b;
                                str5.getClass();
                                bmvg2.f131039a |= 1;
                                bmvg2.f131040b = str5;
                            } else if (i == 2) {
                                double d = loyaltyPointsBalance.f110627c;
                                if (da4.f164950c) {
                                    da4.mo74035c();
                                    da4.f164950c = false;
                                }
                                bmvg bmvg3 = (bmvg) da4.f164949b;
                                bmvg3.f131039a |= 4;
                                bmvg3.f131042d = d;
                            } else if (i == 3) {
                                bmvh a5 = awxk.m81406a(loyaltyPointsBalance.f110628d, loyaltyPointsBalance.f110629e);
                                if (da4.f164950c) {
                                    da4.mo74035c();
                                    da4.f164950c = false;
                                }
                                bmvg bmvg4 = (bmvg) da4.f164949b;
                                a5.getClass();
                                bmvg4.f131043e = a5;
                                bmvg4.f131039a |= 8;
                            }
                            bmvg bmvg5 = (bmvg) da4.mo74062i();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bmvf bmvf2 = (bmvf) da3.f164949b;
                            bmvg5.getClass();
                            bmvf2.f131036c = bmvg5;
                            bmvf2.f131034a |= 4;
                        }
                        bmvf bmvf3 = (bmvf) da3.mo74062i();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bmve bmve4 = (bmve) da2.f164949b;
                        bmvf3.getClass();
                        bmve4.f131031e = bmvf3;
                        bmve4.f131027a |= 16;
                    }
                    bmve bmve5 = (bmve) da2.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    btro btro = (btro) da.f164949b;
                    bmve5.getClass();
                    if (!btro.f150130b.mo73666a()) {
                        btro.f150130b = GeneratedMessageLite.m124021a(btro.f150130b);
                    }
                    btro.f150130b.add(bmve5);
                } else {
                    OfferWalletObject offerWalletObject = createWalletObjectsRequest2.f109781b;
                    if (offerWalletObject != null) {
                        bxvd da5 = bmvi.f131049c.mo74144da();
                        bmvt a6 = awxk.m81408a(offerWalletObject.f109875c);
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        bmvi bmvi = (bmvi) da5.f164949b;
                        a6.getClass();
                        bmvi.f131052b = a6;
                        bmvi.f131051a |= 1;
                        bmvi bmvi2 = (bmvi) da5.mo74062i();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        btro btro2 = (btro) da.f164949b;
                        bmvi2.getClass();
                        if (!btro2.f150131c.mo73666a()) {
                            btro2.f150131c = GeneratedMessageLite.m124021a(btro2.f150131c);
                        }
                        btro2.f150131c.add(bmvi2);
                    } else {
                        GiftCardWalletObject giftCardWalletObject3 = createWalletObjectsRequest2.f109782c;
                        if (giftCardWalletObject3 != null) {
                            bxvd da6 = bmvu.f131104h.mo74144da();
                            bmvt a7 = awxk.m81408a(giftCardWalletObject3.f109798a);
                            if (da6.f164950c) {
                                da6.mo74035c();
                                da6.f164950c = false;
                            }
                            bmvu bmvu = (bmvu) da6.f164949b;
                            a7.getClass();
                            bmvu.f131107b = a7;
                            bmvu.f131106a |= 1;
                            if (!TextUtils.isEmpty(giftCardWalletObject3.f109799b)) {
                                String str6 = giftCardWalletObject3.f109799b;
                                if (da6.f164950c) {
                                    da6.mo74035c();
                                    da6.f164950c = false;
                                }
                                bmvu bmvu2 = (bmvu) da6.f164949b;
                                str6.getClass();
                                bmvu2.f131106a |= 4;
                                bmvu2.f131108c = str6;
                            }
                            if (!TextUtils.isEmpty(giftCardWalletObject3.f109800c)) {
                                String str7 = giftCardWalletObject3.f109800c;
                                if (da6.f164950c) {
                                    da6.mo74035c();
                                    da6.f164950c = false;
                                }
                                bmvu bmvu3 = (bmvu) da6.f164949b;
                                str7.getClass();
                                bmvu3.f131106a |= 8;
                                bmvu3.f131109d = str7;
                            }
                            bmvh a8 = awxk.m81406a(giftCardWalletObject3.f109803f, giftCardWalletObject3.f109802e);
                            if (da6.f164950c) {
                                da6.mo74035c();
                                da6.f164950c = false;
                            }
                            bmvu bmvu4 = (bmvu) da6.f164949b;
                            a8.getClass();
                            bmvu4.f131110e = a8;
                            bmvu4.f131106a |= 16;
                            if (giftCardWalletObject3.f109804g != 0) {
                                bxvd da7 = bmva.f131007c.mo74144da();
                                long j = giftCardWalletObject3.f109804g;
                                if (da7.f164950c) {
                                    da7.mo74035c();
                                    da7.f164950c = false;
                                }
                                bmva bmva = (bmva) da7.f164949b;
                                bmva.f131009a |= 1;
                                bmva.f131010b = j;
                                if (da6.f164950c) {
                                    da6.mo74035c();
                                    da6.f164950c = false;
                                }
                                bmvu bmvu5 = (bmvu) da6.f164949b;
                                bmva bmva2 = (bmva) da7.mo74062i();
                                bmva2.getClass();
                                bmvu5.f131111f = bmva2;
                                bmvu5.f131106a |= 32;
                            }
                            if (!TextUtils.isEmpty(giftCardWalletObject3.f109805h)) {
                                String str8 = giftCardWalletObject3.f109805h;
                                if (da6.f164950c) {
                                    da6.mo74035c();
                                    da6.f164950c = false;
                                }
                                bmvu bmvu6 = (bmvu) da6.f164949b;
                                str8.getClass();
                                bmvu6.f131106a |= 64;
                                bmvu6.f131112g = str8;
                            }
                            bmvu bmvu7 = (bmvu) da6.mo74062i();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            btro btro3 = (btro) da.f164949b;
                            bmvu7.getClass();
                            if (!btro3.f150132d.mo73666a()) {
                                btro3.f150132d = GeneratedMessageLite.m124021a(btro3.f150132d);
                            }
                            btro3.f150132d.add(bmvu7);
                        }
                    }
                }
                String str9 = a2.f110601d;
                String str10 = a2.f110599b;
                int i3 = createWalletObjectsRequest2.f109783d;
                Intent intent = new Intent("com.google.android.gms.wallet.onlinewallet.ACTION_CREATE_WALLET_OBJECTS");
                intent.setClassName("com.google.android.gms", "com.google.android.gms.wallet.ow.ChooseAccountShimActivity");
                bjvp.m104735a(intent, "com.google.android.gms.wallet.CREATE_WALLET_OBJECTS_REQUEST", (btro) da.mo74062i());
                intent.putExtra("com.google.android.gms.wallet.WOBS_ISSUER_NAME", str9);
                intent.putExtra("com.google.android.gms.wallet.EXTRA_WOBS_ISSUER_CLASS_ID", str10);
                intent.putExtra("com.google.android.gms.wallet.WOBS_OBJECT_DESCRIPTION", str);
                intent.putExtra("com.google.android.gms.wallet.buyFlowConfig", a3);
                intent.putExtra("com.google.android.gms.wallet.EXTRA_CREATE_MODE", i3);
                bundle4.putParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT", spn.m35844a(context, intent, (int) JGCastService.FLAG_PRIVATE_DISPLAY));
                awnl2.mo52329a(6, bundle4);
                return;
            }
        }
        awxj.m81401a(this.f95226a, 404, sb.toString(), c, bundle2);
        awnl2.mo52329a(404, Bundle.EMPTY);
    }

    /* renamed from: a */
    public final void mo52311a(FullWalletRequest fullWalletRequest, Bundle bundle, awnl awnl) {
        awrs awrs = this.f95230e;
        awrs.mo52514a(bundle);
        LoadFullWalletServiceResponse a = awrr.m80796a(awrs, new LoadFullWalletServiceRequest(bundle, fullWalletRequest, false)).mo52520a();
        awnl.mo52330a(a.f110350c, a.f110349b, a.f110348a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03ba, code lost:
        if (r2.f94978v != 1) goto L_0x03bc;
     */
    /* renamed from: a */
    public final void mo52312a(IsReadyToPayRequest isReadyToPayRequest, Bundle bundle, awnl awnl) {
        boolean z;
        Status status;
        int i;
        String str;
        int i2;
        boolean z2;
        int i3;
        Status status2;
        Bundle bundle2;
        IsReadyToPayResponse isReadyToPayResponse;
        boolean z3;
        boolean z4;
        boolean z5;
        byte[][] bArr;
        int i4;
        int i5;
        List list;
        List list2;
        boolean z6;
        bdyx bdyx;
        awrs awrs = this.f95230e;
        sdo.checkIfNull(awnl, "callbacks is required");
        awrs.mo52514a(bundle);
        Context context = awrs.f94932a;
        awra awra = awrs.f94933b;
        ExecutorService executorService = awrt.f94941a;
        rfz rfz = awrs.f94935d;
        awua awua = awrs.f94937f;
        awwt awwt = awrs.f94936e;
        awwo awwo = awrs.f94939h;
        awta awta = awrs.f94940i;
        svq b = svr.m36484b(awrs.f94932a);
        awso awso = new awso(awrs.f94932a);
        awrx awrx = r15;
        awrx awrx2 = new awrx(context, awra, executorService, rfz, awua, awwt, awwo, awta, b, awso, bundle, isReadyToPayRequest);
        awrx.f94982z = SystemClock.elapsedRealtime();
        awrx.f94968l = adyd.m51363a(awrx.f94957a).mo33916a("com.google");
        Account a = awrt.m80809a(awrx.f94968l, awrx.f94966j, awrx.f94960d, awrx.f94962f, awrx.f94964h);
        awrx.f94966j.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", a);
        awrx.f94969m = awrt.m80827a(awrx.f94966j, (String) null);
        awrx.f94974r = awrx.f94966j.getBoolean("com.google.android.gms.wallet.EXPECT_IS_READY_TO_PAY_RESPONSE_OBJECT");
        awru awru = new awru();
        IsReadyToPayRequest isReadyToPayRequest2 = awrx.f94967k;
        if (isReadyToPayRequest2 == null) {
            awru.mo52515a("Request should not be null!", 1067);
        } else {
            if (!(isReadyToPayRequest2.f109810b == null && isReadyToPayRequest2.f109811c == null)) {
                awrx.f94960d.mo24605a(awrx.f94969m.f110419c);
            }
            awrx.f94970n = null;
            if (awrx.mo52518a() == null) {
                IsReadyToPayRequest isReadyToPayRequest3 = awrx.f94967k;
                awrx.f94970n = isReadyToPayRequest3.f109809a;
                awrx.f94971o = isReadyToPayRequest3.f109812d;
                awrx.f94975s = isReadyToPayRequest3.f109813e;
            } else {
                JSONObject a2 = awrt.m80840a(awrx.mo52518a(), awru);
                if (a2 != null) {
                    awrx.f94981y = awrt.m80856b(a2, awru);
                    awrx.f94978v = awrt.m80863c(a2, awru);
                    awrx.f94979w = awrt.m80872e(a2, awru);
                    awrx.f94970n = awrt.m80873f(a2, awru);
                    awrx.f94971o = awrt.m80874g(a2, awru);
                    awrx.f94972p = awrt.m80875h(a2, awru);
                    if (awrx.m80880a(awrx.f94967k)) {
                        awrx.f94975s = awrt.m80851a(a2, awrx.f94978v, awru);
                    }
                    boolean a3 = awrt.m80850a(awrx.f94967k.f109811c != null ? (String) awiw.f94500c.mo58455c() : (String) awie.f94402E.mo58455c(), awrx.f94978v, awrx.f94979w);
                    awrx.f94977u = a3;
                    if (!a3 || !awrt.m80852a(a2, awru)) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    awrx.f94976t = z6;
                    if (awrx.f94967k.f109811c != null) {
                        int a4 = awrt.m80805a(a2);
                        awrx.f94980x = a4;
                        if (a4 == 2) {
                            bdyx = awiw.f94498a;
                        } else if (a4 == 3) {
                            bdyx = awiw.f94499b;
                        }
                        if (!sqc.m35963b(((String) bdyx.mo58455c()).split(","), awrx.f94967k.f109810b)) {
                            awru.mo52515a(String.format(Locale.US, "This merchant origin is not whitelisted!", new Object[0]), 1051);
                        }
                    }
                    if (awrx.f94967k.f109809a != null) {
                        awru.mo52515a(String.format(Locale.US, "When using WebWalletParameters, do not set allowedCardNetworks in the request. Set it in the WebWalletParameters instead.", new Object[0]), 1048);
                    }
                }
            }
            if ((awrx.mo52518a() == null || awrx.f94978v <= 1) && ((list2 = awrx.f94970n) == null || list2.isEmpty())) {
                awrx.f94970n = awmi.f94611a;
            }
            if ((awrx.mo52518a() == null || awrx.f94978v <= 1) && ((list = awrx.f94971o) == null || list.isEmpty())) {
                awrx.f94971o = Arrays.asList(2);
            }
        }
        if (!awxj.m81405c(awrx.f94966j)) {
            awru.mo52515a(String.format(Locale.US, "isReadyToPay can only be used with Android Pay!", new Object[0]), 1047);
        }
        bwgu a5 = awrt.m80817a(awrx.f94958b.mo52470a(awrx.f94966j.getString("androidPackageName")));
        bxvd bxvd = (bxvd) a5.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a5);
        awrt.m80843a((bwgu) bxvd.mo74062i(), awru);
        Bundle bundle3 = Bundle.EMPTY;
        int i6 = 10;
        if (!awru.f94946a.isEmpty()) {
            ArrayList arrayList = awru.f94946a;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                awrt.m80846a("isReadyToPay", (String) arrayList.get(i7));
                i7++;
                i6 = 10;
            }
            status = new Status(i6);
            i = awru.f94947b;
            z = false;
        } else {
            if (((Boolean) awip.f94484d.mo58455c()).booleanValue() || ((Boolean) awie.f94430z.mo58455c()).booleanValue() || awrx.f94975s) {
                HashMap hashMap = new HashMap();
                Account[] accountArr = awrx.f94968l;
                for (Account account : accountArr) {
                    FutureTask futureTask = new FutureTask(new awrv(account, awrx.f94969m, awrx.f94961e, awrx.f94963g));
                    awrx.f94959c.execute(futureTask);
                    hashMap.put(account, futureTask);
                }
                awrx.f94973q = hashMap;
            }
            awrw awrw = new awrw();
            awrw.f94953b = awrx.f94962f.mo65548b(awrx.f94969m, null, null);
            if (!awrw.f94953b.f43154a.mo17710c()) {
                Log.w("IsReadyToPayAction", String.format("Failed to check Service Layer enabled! status = %s message = %s", Integer.valueOf(awrw.f94953b.f43154a.f30115i), awrw.f94953b.f43154a.f30116j));
            } else if (awrw.f94953b.f43155b) {
                Account[] accountArr2 = awrx.f94968l;
                for (Account account2 : accountArr2) {
                    asmi c = awrx.f94962f.mo65549c(awrx.f94969m, account2, null);
                    if (c.mo7183bo().mo17710c()) {
                        awrw.f94952a.put(account2, c.mo49240b());
                    } else {
                        Log.w("IsReadyToPayAction", String.format("Failed to fetch cards for Android Pay! status = %s message = %s", Integer.valueOf(c.mo7183bo().f30115i), c.mo7183bo().f30116j));
                    }
                }
            }
            Status status3 = Status.f30107a;
            if (!awrx.f94975s) {
                i2 = awrx.mo52517a(awrw);
            } else {
                i2 = awrx.mo52519b(awrw);
            }
            if (i2 == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!((Boolean) awip.f94481a.mo58455c()).booleanValue()) {
                bundle2 = bundle3;
                status2 = status3;
                i3 = i2;
            } else if (!z2) {
                bundle2 = bundle3;
                status2 = status3;
                i3 = i2;
            } else if (awrx.f94968l.length == 0) {
                bundle2 = bundle3;
                status2 = status3;
                i3 = i2;
            } else if (awev.m79823a(awrx.f94957a)) {
                Account account3 = awrx.f94969m.f110418b.f110407b;
                IbBuyFlowInput a6 = IbBuyFlowInput.m94103a();
                if (awrx.f94969m.f110418b.f110406a == 3) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                a6.mo59995e(z5);
                boolean a7 = awrt.m80853a(awrx.f94965i);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bwgu bwgu = (bwgu) bxvd.f164949b;
                bwgu bwgu2 = bwgu.f159265i;
                bwgu.f159267a |= 8;
                bwgu.f159274h = a7;
                a6.mo59979a((bwgu) bxvd.mo74062i());
                a6.mo59981a((GetActiveCardsForAccountResponse) awrw.f94952a.get(account3));
                awta awta2 = awrx.f94964h;
                BuyFlowConfig buyFlowConfig = awrx.f94969m;
                ApplicationParameters applicationParameters = buyFlowConfig.f110418b;
                byal a8 = awta2.mo52547a(applicationParameters.f110406a, applicationParameters.f110407b, buyFlowConfig.f110419c);
                if (a8 != null) {
                    a6.mo59980a(a8);
                }
                Context context2 = awrx.f94957a;
                BuyFlowConfig buyFlowConfig2 = awrx.f94969m;
                int i8 = awrx.f94980x;
                if (i8 == 2) {
                    bundle2 = bundle3;
                    status2 = status3;
                    i3 = i2;
                } else if (i8 != 3) {
                    if (!chhy.m148751b()) {
                        i5 = 1;
                    } else {
                        i5 = 1;
                    }
                    if (awrx.f94967k.f109811c != null) {
                        int i9 = awrx.f94978v;
                        if (i9 == i5) {
                            bundle2 = bundle3;
                            status2 = status3;
                            i3 = i2;
                        } else if (i9 >= 2 && !chhp.m148738b()) {
                            bundle2 = bundle3;
                            status2 = status3;
                            i3 = i2;
                        }
                    }
                    if (!((Boolean) awie.f94422r.mo58455c()).booleanValue()) {
                        int i10 = 2;
                        a6.mo59985b(2);
                        bwgs k = a6.mo60003k();
                        bArr = new byte[4][];
                        boolean[] zArr = {true, false};
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < i10) {
                            Bundle bundle4 = bundle3;
                            boolean z7 = zArr[i11];
                            Status status4 = status3;
                            boolean[] zArr2 = new boolean[i10];
                            // fill-array-data instruction
                            zArr2[0] = 1;
                            zArr2[1] = 0;
                            boolean[] zArr3 = zArr;
                            int i13 = 0;
                            while (i13 < i10) {
                                boolean z8 = zArr2[i13];
                                boolean[] zArr4 = zArr2;
                                bxvd bxvd2 = (bxvd) k.mo74142c(5);
                                bxvd2.mo73625a((GeneratedMessageLite) k);
                                int i14 = i2;
                                bwgv bwgv = k.f159259b;
                                if (bwgv == null) {
                                    bwgv = bwgv.f159275p;
                                }
                                bxvd bxvd3 = (bxvd) bwgv.mo74142c(5);
                                bxvd3.mo73625a((GeneratedMessageLite) bwgv);
                                if (bxvd3.f164950c) {
                                    bxvd3.mo74035c();
                                    bxvd3.f164950c = false;
                                }
                                bwgv bwgv2 = (bwgv) bxvd3.f164949b;
                                bwgs bwgs = k;
                                int i15 = bwgv2.f159277a | 64;
                                bwgv2.f159277a = i15;
                                bwgv2.f159284h = z8;
                                bwgv2.f159277a = i15 | 32;
                                bwgv2.f159283g = z7;
                                if (bxvd2.f164950c) {
                                    bxvd2.mo74035c();
                                    bxvd2.f164950c = false;
                                }
                                bwgs bwgs2 = (bwgs) bxvd2.f164949b;
                                bwgv bwgv3 = (bwgv) bxvd3.mo74062i();
                                bwgs bwgs3 = bwgs.f159256c;
                                bwgv3.getClass();
                                bwgs2.f159259b = bwgv3;
                                bwgs2.f159258a |= 1;
                                bArr[i12] = ((bwgs) bxvd2.mo74062i()).serializeToBytes();
                                i12++;
                                i13++;
                                zArr2 = zArr4;
                                i2 = i14;
                                k = bwgs;
                                i10 = 2;
                            }
                            i11++;
                            bundle3 = bundle4;
                            status3 = status4;
                            zArr = zArr3;
                            i10 = 2;
                        }
                        bundle2 = bundle3;
                        status2 = status3;
                        i3 = i2;
                    } else {
                        bundle2 = bundle3;
                        status2 = status3;
                        i3 = i2;
                        if (awrx.f94967k.f109811c != null && ((i4 = awrx.f94978v) >= 2 || (i4 == 1 && chhy.m148751b()))) {
                            String str2 = awrx.f94967k.f109810b;
                            bxvd bxvd4 = a6.f110341c;
                            if (bxvd4.f164950c) {
                                bxvd4.mo74035c();
                                bxvd4.f164950c = false;
                            }
                            bwgv bwgv4 = (bwgv) bxvd4.f164949b;
                            bwgv bwgv5 = bwgv.f159275p;
                            str2.getClass();
                            bwgv4.f159277a |= 2;
                            bwgv4.f159279c = str2;
                        }
                        a6.mo59989c(true);
                        bArr = new byte[][]{a6.mo60003k().mo73642k()};
                    }
                    InitializeBuyFlowRequest initializeBuyFlowRequest = new InitializeBuyFlowRequest(bArr);
                    Intent startIntent = IntentOperation.getStartIntent(context2, BuyFlowInitializationIntentOperation.class, "com.google.android.gms.wallet.buyflow.ACTION_INITIALIZE_BUYFLOW");
                    sef.m35071a(buyFlowConfig2, startIntent, "BuyFlowInitializationIntentOperation.buyflowConfig");
                    sef.m35071a(initializeBuyFlowRequest, startIntent, "BuyFlowInitializationIntentOperation.initializeBuyFlowRequest");
                    awrx.f94957a.startService(startIntent);
                } else {
                    bundle2 = bundle3;
                    status2 = status3;
                    i3 = i2;
                }
                a6.mo59985b(6);
                IsReadyToPayRequest isReadyToPayRequest4 = awrx.f94967k;
                String str3 = isReadyToPayRequest4.f109810b;
                if (str3 != null) {
                    bxvd bxvd5 = a6.f110341c;
                    if (bxvd5.f164950c) {
                        bxvd5.mo74035c();
                        bxvd5.f164950c = false;
                    }
                    bwgv bwgv6 = (bwgv) bxvd5.f164949b;
                    bwgv bwgv7 = bwgv.f159275p;
                    str3.getClass();
                    bwgv6.f159277a |= 2;
                    bwgv6.f159279c = str3;
                }
                String str4 = isReadyToPayRequest4.f109811c;
                if (str4 != null) {
                    bxvd bxvd6 = a6.f110341c;
                    if (bxvd6.f164950c) {
                        bxvd6.mo74035c();
                        bxvd6.f164950c = false;
                    }
                    bwgv bwgv8 = (bwgv) bxvd6.f164949b;
                    bwgv bwgv9 = bwgv.f159275p;
                    str4.getClass();
                    bwgv8.f159277a |= 4;
                    bwgv8.f159280d = str4;
                }
                bArr = new byte[][]{a6.mo60003k().mo73642k()};
                InitializeBuyFlowRequest initializeBuyFlowRequest2 = new InitializeBuyFlowRequest(bArr);
                Intent startIntent2 = IntentOperation.getStartIntent(context2, BuyFlowInitializationIntentOperation.class, "com.google.android.gms.wallet.buyflow.ACTION_INITIALIZE_BUYFLOW");
                sef.m35071a(buyFlowConfig2, startIntent2, "BuyFlowInitializationIntentOperation.buyflowConfig");
                sef.m35071a(initializeBuyFlowRequest2, startIntent2, "BuyFlowInitializationIntentOperation.initializeBuyFlowRequest");
                awrx.f94957a.startService(startIntent2);
            } else {
                bundle2 = bundle3;
                status2 = status3;
                i3 = i2;
            }
            if (awrx.f94974r) {
                bundle3 = new Bundle();
                if (awrx.f94967k.f109814f == null) {
                    isReadyToPayResponse = IsReadyToPayResponse.m93788a().f94142a;
                    isReadyToPayResponse.f109815a = z2;
                } else {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        if (awrx.mo52517a(awrw) == 2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        jSONObject.put("result", z3);
                        if (awrx.f94975s) {
                            if (!z3 || awrx.mo52519b(awrw) != 2) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            jSONObject.put("paymentMethodPresent", z4);
                        }
                        awax a9 = IsReadyToPayResponse.m93788a();
                        String jSONObject2 = jSONObject.toString();
                        IsReadyToPayResponse isReadyToPayResponse2 = a9.f94142a;
                        isReadyToPayResponse2.f109816b = jSONObject2;
                        isReadyToPayResponse = isReadyToPayResponse2;
                    } catch (JSONException e) {
                        throw new RuntimeException("Failed to generate response json!");
                    }
                }
                bundle3.putByteArray("com.google.android.gms.wallet.IsReadyToPayResponse", sef.m35074a(isReadyToPayResponse));
                status = status2;
                i6 = i3;
                i = 1;
                z = false;
            } else {
                z = z2;
                bundle3 = bundle2;
                status = status2;
                i6 = i3;
                i = 1;
            }
        }
        bxvd da = bpif.f137729h.mo74144da();
        long elapsedRealtime = SystemClock.elapsedRealtime() - awrx.f94982z;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpif bpif = (bpif) da.f164949b;
        int i16 = bpif.f137731a | 4;
        bpif.f137731a = i16;
        bpif.f137734d = elapsedRealtime;
        int i17 = i6 - 1;
        if (i6 != 0) {
            bpif.f137733c = i17;
            int i18 = 2;
            int i19 = i16 | 2;
            bpif.f137731a = i19;
            int length = awrx.f94968l.length;
            bpif.f137731a = i19 | 16;
            bpif.f137736f = length;
            if (!status.mo17710c()) {
                i18 = 5;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpif bpif2 = (bpif) da.f164949b;
            bpif2.f137732b = i18 - 1;
            int i20 = bpif2.f137731a | 1;
            bpif2.f137731a = i20;
            int i21 = i - 1;
            if (i != 0) {
                int i22 = i20 | 8;
                bpif2.f137731a = i22;
                bpif2.f137735e = i21;
                boolean z9 = awrx.f94975s;
                bpif2.f137731a = i22 | 32;
                bpif2.f137737g = z9;
                bpif bpif3 = (bpif) da.mo74062i();
                Context context3 = awrx.f94957a;
                BuyFlowConfig buyFlowConfig3 = awrx.f94969m;
                if (a != null) {
                    str = a.name;
                } else {
                    str = null;
                }
                awqc.m80662a(context3, new IsReadyToPayCallEvent(buyFlowConfig3, bpif3, str));
                awry awry = new awry(bundle3, z, status);
                awnl.mo52339a(awry.f94985c, awry.f94984b, awry.f94983a);
                return;
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo52313a(MaskedWalletRequest maskedWalletRequest, Bundle bundle, awnl awnl) {
        awrs awrs = this.f95230e;
        awrs.mo52514a(bundle);
        LoadMaskedWalletServiceResponse a = awrr.m80797a(awrs, new LoadMaskedWalletServiceRequest(bundle, maskedWalletRequest)).mo52525a();
        awnl.mo52331a(a.f110355c, a.f110354b, a.f110353a);
    }

    /* renamed from: a */
    public final void mo52315a(PaymentDataRequest paymentDataRequest, Bundle bundle, awnl awnl) {
        awrs awrs = this.f95230e;
        sdo.checkIfNull(awnl, "callbacks is required");
        awrs.mo52514a(bundle);
        awsk m = new awsj(awrs.f94932a, awrs.f94933b, awrs.f94937f, awrs.f94935d, awrs.f94936e, new awsm(), svr.m36484b(awrs.f94932a), awrs.f94938g, awrs.f94940i, bundle, paymentDataRequest).mo52493m();
        awnl.mo52333a(m.f95032c, (PaymentData) m.f95031b, m.f95030a);
    }

    /* renamed from: a */
    public final void mo52316a(WebPaymentDataRequest webPaymentDataRequest, Bundle bundle, awnl awnl) {
        awrs awrs = this.f95230e;
        sdo.checkIfNull(awnl, "callbacks is required");
        awrs.mo52514a(bundle);
        awsk m = new awsl(awrs.f94932a, awrs.f94933b, awrs.f94935d, awrs.f94936e, new awsm(), awrs.f94940i, bundle, webPaymentDataRequest).mo52493m();
        awnl.mo52334a(m.f95032c, (WebPaymentData) m.f95031b, m.f95030a);
    }

    /* renamed from: a */
    public final void mo52317a(ExecuteBuyFlowRequest executeBuyFlowRequest, Bundle bundle, awnl awnl) {
        byte[] bArr;
        ByteString bxtx;
        ByteString bxtx2;
        ExecuteBuyFlowRequest executeBuyFlowRequest2 = executeBuyFlowRequest;
        Bundle bundle2 = bundle;
        awnl awnl2 = awnl;
        sdo.checkIfNull(awnl2, "callbacks is required");
        Account account = (Account) bundle2.getParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT");
        if (!awfx.m79881a(account)) {
            Log.e("NetworkOwService", "Google account required.");
            awnl2.mo52195a(new Status(2, "Google account required."), Bundle.EMPTY);
            return;
        }
        int i = bundle2.getInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT");
        String c = mo52697c(bundle2);
        this.f95228c.mo24605a(c);
        awyb a = BuyFlowConfig.m94175a();
        a.mo52751b(c);
        a.mo52752c("flow_checkout");
        awxz a2 = ApplicationParameters.m94173a();
        a2.mo52739a(account);
        a2.mo52744b(i);
        a2.mo52741a(executeBuyFlowRequest2.f110157c);
        a.mo52749a(a2.f95270a);
        BuyFlowConfig a3 = a.mo52748a();
        ServerResponse serverResponse = this.f95229d.mo52570a(a3, executeBuyFlowRequest2).f110380a;
        Bundle bundle3 = Bundle.EMPTY;
        Status status = Status.f30109c;
        int c2 = serverResponse.mo60050c();
        if (c2 == 33) {
            blxx blxx = (blxx) serverResponse.mo60052e();
            bwgz a4 = bwgz.m121952a(blxx.f128168h);
            if (a4 == null) {
                a4 = bwgz.UNKNOWN_FLOW_INSTRUCTION;
            }
            if (a4 != bwgz.COMPLETE_FLOW_IMMEDIATELY) {
                awkx awkx = new awkx(this.f95226a);
                awkx.mo52227b(serverResponse.mo60049b());
                awkx.mo52228c(executeBuyFlowRequest2.f110156b);
                Intent a5 = awkx.mo52186a();
                a5.putExtra("com.google.android.gms.wallet.buyFlowConfig", a3);
                status = new Status(6, "BuyFlow UI must be shown.", spn.m35844a(this.f95226a, a5, (int) JGCastService.FLAG_PRIVATE_DISPLAY));
            } else {
                Status status2 = Status.f30107a;
                if ((blxx.f128161a & 8) != 0) {
                    bundle3 = new Bundle();
                    bmag bmag = blxx.f128165e;
                    if (bmag == null) {
                        bmag = bmag.f128442c;
                    }
                    if (bmag.f128444a == 2) {
                        bxtx2 = (ByteString) bmag.f128445b;
                    } else {
                        bxtx2 = bxtx.f164797b;
                    }
                    bundle3.putByteArray("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN", bxtx2.getKey());
                    status = status2;
                } else {
                    status = status2;
                }
            }
        } else if (c2 != 34) {
            Log.e("NetworkOwService", String.format(Locale.US, "Unexpected response type: %d", Integer.valueOf(c2)));
        } else {
            blyr blyr = (blyr) serverResponse.mo60052e();
            bwgz a6 = bwgz.m121952a(blyr.f128310k);
            if (a6 == null) {
                a6 = bwgz.UNKNOWN_FLOW_INSTRUCTION;
            }
            if (a6 != bwgz.COMPLETE_FLOW_IMMEDIATELY) {
                awkx awkx2 = new awkx(this.f95226a);
                awkx2.mo52226a(executeBuyFlowRequest2.f110155a);
                awkx2.mo52228c(executeBuyFlowRequest2.f110156b);
                Intent a7 = awkx2.mo52186a();
                a7.putExtra("com.google.android.gms.wallet.buyFlowConfig", a3);
                status = new Status(6, "BuyFlow UI must be shown.", spn.m35844a(this.f95226a, a7, (int) JGCastService.FLAG_PRIVATE_DISPLAY));
                if ((blyr.f128300a & 1) != 0) {
                    bmav bmav = blyr.f128301b;
                    if (bmav == null) {
                        bmav = bmav.f128500h;
                    }
                    if (!bmav.f128507f.isEmpty()) {
                        Locale locale = Locale.US;
                        Object[] objArr = new Object[1];
                        bmav bmav2 = blyr.f128301b;
                        if (bmav2 == null) {
                            bmav2 = bmav.f128500h;
                        }
                        objArr[0] = bmav2.f128507f;
                        Log.w("NetworkOwService", String.format(locale, "Submit UiError w/ internalDetails=%s", objArr));
                    }
                }
            } else {
                status = Status.f30107a;
                bundle3 = new Bundle();
                bundle3.putString("com.google.android.gms.wallet.firstparty.EXTRA_ORDER_ID", blyr.f128312m);
                bundle3.putString("com.google.android.gms.wallet.firstparty.EXTRA_DISPLAY_MESSAGE", blyr.f128311l);
                if ((blyr.f128300a & 4096) != 0) {
                    bmag bmag2 = blyr.f128313n;
                    if (bmag2 == null) {
                        bmag2 = bmag.f128442c;
                    }
                    if (bmag2.f128444a == 2) {
                        bxtx = (ByteString) bmag2.f128445b;
                    } else {
                        bxtx = bxtx.f164797b;
                    }
                    bArr = bxtx.getKey();
                } else {
                    bArr = new byte[0];
                }
                bundle3.putByteArray("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN", bArr);
            }
        }
        awnl2.mo52195a(status, bundle3);
    }

    /* renamed from: a */
    public final void mo52318a(GetBuyFlowInitializationTokenRequest getBuyFlowInitializationTokenRequest, Bundle bundle, awnl awnl) {
        blzf blzf;
        int i;
        sdo.checkIfNull(awnl, "callbacks is required");
        Account account = (Account) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT");
        sdo.checkIfNull(account, "account is required");
        int i2 = bundle.getInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT");
        awyb a = BuyFlowConfig.m94175a();
        a.mo52751b(mo52697c(bundle));
        a.mo52752c("flow_checkout");
        awxz a2 = ApplicationParameters.m94173a();
        a2.mo52739a(account);
        a2.mo52744b(i2);
        a.mo52749a(a2.f95270a);
        BuyFlowConfig a3 = a.mo52748a();
        byte[] bArr = getBuyFlowInitializationTokenRequest.f110159b;
        byte[] bArr2 = getBuyFlowInitializationTokenRequest.f110158a;
        Account account2 = (Account) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT");
        sdo.checkIfNull(account2, "account is required");
        this.f95228c.mo24605a(mo52697c(bundle));
        if (bArr != null) {
            blzf = (blzf) bjvp.m104733a(bArr, (bxxk) blzf.f128337k.mo74142c(7));
            bwdt bwdt = blzf.f128340b;
            if (bwdt == null) {
                bwdt = bwdt.f158931d;
            }
            if (bwdt != null && !bwdt.f158933a.isEmpty()) {
                String str = bwdt.f158933a;
                int i3 = bwdt.f158935c;
                if (i3 > 0 && (i = bwdt.f158934b) > 0) {
                    str = bkfr.m105556a(str, i, i3, ((Boolean) awir.f94488a.mo58455c()).booleanValue());
                }
                new adzt(Looper.getMainLooper()).post(new awxe(str));
            }
        } else {
            blzf = null;
        }
        bxvd da = blxw.f128152f.mo74144da();
        bmaj a4 = awfx.m79877a(this.f95226a, null, a3, mo52697c(bundle), true, false);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blxw blxw = (blxw) da.f164949b;
        a4.getClass();
        blxw.f128155b = a4;
        blxw.f128154a |= 1;
        ByteString a5 = ByteString.m123261a(bArr2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blxw blxw2 = (blxw) da.f164949b;
        a5.getClass();
        int i4 = blxw2.f128154a | 2;
        blxw2.f128154a = i4;
        blxw2.f128156c = a5;
        if (blzf != null) {
            blzf.getClass();
            blxw2.f128157d = blzf;
            blxw2.f128154a = i4 | 4;
        }
        ServerResponse serverResponse = this.f95229d.mo52571a(a3, new BuyflowInitializeRequest(account2, (blxw) da.mo74062i(), (byaa) null)).f110380a;
        if (serverResponse.mo60050c() == 33) {
            try {
                awnl.mo52335a(Status.f30107a, new GetBuyFlowInitializationTokenResponse(serverResponse.mo60049b()), Bundle.EMPTY);
            } catch (RemoteException e) {
                Log.e("NetworkOwService", "getBuyFlowInitializationToken callback: RemoteException");
            }
        } else {
            Log.e("NetworkOwService", "getBuyFlowInitializationToken got bad response type");
            awnl.mo52335a(Status.f30109c, new GetBuyFlowInitializationTokenResponse(new byte[0]), Bundle.EMPTY);
        }
    }

    /* renamed from: a */
    public final void mo52319a(GetClientTokenRequest getClientTokenRequest, Bundle bundle, awnl awnl) {
        sdo.checkIfNull(awnl, "callbacks is required");
        this.f95231f.mo25649a(new awwx(this.f95226a, getClientTokenRequest, bundle, awnl, this.f95227b, mo52697c(bundle), this.f95228c));
    }

    /* renamed from: a */
    public final void mo52320a(InitializeBuyFlowRequest initializeBuyFlowRequest, Bundle bundle, awnl awnl) {
        sdo.checkIfNull(awnl, "callbacks is required");
        if (awfx.m79881a((Account) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT"))) {
            try {
                for (byte[] bArr : initializeBuyFlowRequest.f110165b) {
                    bjvp.m104733a(bArr, (bxxk) bweg.f158977a.mo74142c(7));
                }
                this.f95228c.mo24605a(mo52697c(bundle));
                awnl.mo52341c(Status.f30107a, Bundle.EMPTY);
            } catch (Exception e) {
                Log.e("NetworkOwService", "Badly formed purchase context in initializeBuyflow");
                awnl.mo52341c(Status.f30109c, Bundle.EMPTY);
            }
        } else {
            Log.e("NetworkOwService", "Google account required.");
            awnl.mo52341c(new Status(2, "Google account required."), Bundle.EMPTY);
        }
    }

    /* renamed from: a */
    public final void mo52321a(SetUpBiometricAuthenticationKeysRequest setUpBiometricAuthenticationKeysRequest, Bundle bundle, awnl awnl) {
        sdo.checkIfNull(awnl, "callbacks is required");
        int i = bundle.getInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT");
        String c = mo52697c(bundle);
        this.f95228c.mo24605a(c);
        Account account = (Account) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT");
        sdo.checkIfNull(account, "account is required");
        awyb a = BuyFlowConfig.m94175a();
        a.mo52751b(c);
        awxz a2 = ApplicationParameters.m94173a();
        a2.mo52739a(account);
        a2.mo52744b(i);
        a.mo52749a(a2.f95270a);
        SetUpBiometricAuthenticationKeysServiceResponse a3 = this.f95229d.mo52576a(a.mo52748a(), setUpBiometricAuthenticationKeysRequest);
        awnl.mo52337a(a3.f110387b, a3.f110386a, Bundle.EMPTY);
    }

    /* renamed from: a */
    public final void mo52322a(WarmUpUiProcessRequest warmUpUiProcessRequest, Bundle bundle, awnl awnl) {
        sdo.checkIfNull(awnl, "callbacks is required");
        int i = bundle.getInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT");
        this.f95228c.mo24605a(mo52697c(bundle));
        Account account = (Account) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT");
        sdo.checkIfNull(account, "account is required");
        Intent putExtra = new Intent().setClassName("com.google.android.gms", "com.google.android.gms.chimera.UiIntentOperationService").setAction("com.google.android.gms.wallet.firstparty.ACTION_WARM_UP_UI_PROCESS").putExtra("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i).putExtra("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", account.name);
        int i2 = Build.VERSION.SDK_INT;
        awnl.mo52338a(Status.f30107a, new WarmUpUiProcessResponse(PendingIntent.getService(this.f95226a, 0, putExtra, 1140850688)), Bundle.EMPTY);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int], assign insn: PHI: (r9v1 ?) = (r9v3 ?), (r9v4 ?), (r9v11 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]), (r9v12 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]), (r9v13 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]), (r9v14 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) binds: [B:53:0x0219, B:52:0x01f3, B:43:0x01c1, B:45:0x01ca, B:47:0x01d1, B:48:0x01d3] */
    /* JADX WARN: Type inference failed for: r9v3, assign insn: 0x0219: CONST  (r9v3 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r9v4, assign insn: 0x00f5: CONST  (r9v4 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r9v11, assign insn: 0x00f5: CONST  (r9v11 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r9v12, assign insn: 0x00f5: CONST  (r9v12 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r9v13, assign insn: 0x00f5: CONST  (r9v13 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r9v14, assign insn: 0x00f5: CONST  (r9v14 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* renamed from: a */
    public final void mo52323a(GetSaveInstrumentDetailsRequest getSaveInstrumentDetailsRequest, Bundle bundle, awnl awnl) {
        bwky bwky;
        axda axda;
        ? r9;
        GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse;
        RemoteViews remoteViews;
        GetSaveInstrumentDetailsRequest getSaveInstrumentDetailsRequest2 = getSaveInstrumentDetailsRequest;
        Bundle bundle2 = bundle;
        awnl awnl2 = awnl;
        sdo.checkIfNull(awnl2, "callbacks is required");
        Account account = (Account) bundle2.getParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT");
        if (!awfx.m79881a(account)) {
            Log.e("NetworkOwService", "Google account required.");
            awnl2.mo52197a(new Status(2, "Google account required."), (GetSaveInstrumentDetailsResponse) null, Bundle.EMPTY);
            return;
        }
        int i = bundle2.getInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT");
        String c = mo52697c(bundle2);
        this.f95228c.mo24605a(c);
        awyb a = BuyFlowConfig.m94175a();
        a.mo52751b(c);
        awxz a2 = ApplicationParameters.m94173a();
        a2.mo52739a(account);
        a2.mo52744b(i);
        a.mo52749a(a2.f95270a);
        BuyFlowConfig a3 = a.mo52748a();
        if (chel.f188534a.mo6606a().mo85182d()) {
            axda = new axda(this.f95226a);
            String a4 = axda.mo53032a(c, i, account);
            String string = axda.f95820a.getString(a4, null);
            if (string != null) {
                byad byad = (byad) bjvp.m104732a(string, (bxxk) byad.f165238d.mo74142c(7));
                if (byad.f165241b + chel.f188534a.mo6606a().mo85179a() <= System.currentTimeMillis()) {
                    axda.f95820a.edit().remove(a4).apply();
                    bwky = null;
                } else {
                    bwky = byad.f165242c;
                    if (bwky == null) {
                        bwky = bwky.f160063f;
                    }
                }
            } else {
                bwky = null;
            }
        } else {
            axda = null;
            bwky = null;
        }
        if (bwky == null) {
            awtz awtz = this.f95229d;
            bxvd da = bwdq.f158915c.mo74144da();
            awtz awtz2 = awtz;
            long j = getSaveInstrumentDetailsRequest2.f110183b;
            if (j > 0) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwdq bwdq = (bwdq) da.f164949b;
                bwdq.f158917a = 4;
                bwdq.f158918b = Long.valueOf(j);
            }
            bxvd da2 = bwkw.f160057d.mo74144da();
            awtz awtz3 = awtz2;
            r9 = 0;
            r9 = 0;
            r9 = 0;
            r9 = 0;
            r9 = 0;
            bmaj a5 = awfx.m79877a(this.f95226a, null, null, c, false, false);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bwkw bwkw = (bwkw) da2.f164949b;
            a5.getClass();
            bwkw.f160060b = a5;
            bwkw.f160059a |= 1;
            bxvd da3 = bwlb.f160081d.mo74144da();
            bxvd da4 = bwei.f158986c.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bwei bwei = (bwei) da4.f164949b;
            bwdq bwdq2 = (bwdq) da.mo74062i();
            bwdq2.getClass();
            bwei.f158989b = bwdq2;
            bwei.f158988a = 1;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bwei.m121879a((bwei) da4.f164949b);
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bwlb bwlb = (bwlb) da3.f164949b;
            bwei bwei2 = (bwei) da4.mo74062i();
            bwei2.getClass();
            bwlb.f160084b = bwei2;
            bwlb.f160083a |= 1;
            String str = getSaveInstrumentDetailsRequest2.f110182a;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bwlb bwlb2 = (bwlb) da3.f164949b;
            str.getClass();
            bwlb2.f160083a |= 2;
            bwlb2.f160085c = str;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bwkw bwkw2 = (bwkw) da2.f164949b;
            bwlb bwlb3 = (bwlb) da3.mo74062i();
            bwlb3.getClass();
            bwkw2.f160061c = bwlb3;
            bwkw2.f160059a |= 4;
            ServerResponse a6 = awtz3.mo52607a(a3, new UpstreamInitializeRequest(account, (bwkw) da2.mo74062i()));
            if (a6.mo60050c() == 74 && (bwky = (bwky) a6.mo60052e()) != null && (bwky.f160066a & 1) == 0 && axda != null) {
                SharedPreferences.Editor edit = axda.f95820a.edit();
                String a7 = axda.mo53032a(c, i, account);
                bxvd da5 = byad.f165238d.mo74144da();
                long currentTimeMillis = System.currentTimeMillis();
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                byad byad2 = (byad) da5.f164949b;
                int i2 = byad2.f165240a | 1;
                byad2.f165240a = i2;
                byad2.f165241b = currentTimeMillis;
                bwky.getClass();
                byad2.f165242c = bwky;
                byad2.f165240a = i2 | 2;
                edit.putString(a7, bjvp.m104734a(da5.mo74062i())).apply();
            }
        } else {
            r9 = 0;
        }
        bwky bwky2 = bwky;
        Status status = Status.f30109c;
        if (bwky2 == null) {
            getSaveInstrumentDetailsResponse = null;
        } else if ((bwky2.f160066a & 1) == 0) {
            awlo a8 = GetSaveInstrumentDetailsResponse.m93939a();
            if (bwky2.f160069d.size() > 0) {
                int size = bwky2.f160069d.size();
                String[] strArr = new String[size];
                int[] iArr = new int[size];
                int i3 = 0;
                for (String str2 : Collections.unmodifiableMap(new bxwb(bwky2.f160069d, bwky.f160064g)).keySet()) {
                    strArr[i3] = str2;
                    iArr[i3] = ((blwg) Collections.unmodifiableMap(new bxwb(bwky2.f160069d, bwky.f160064g)).get(str2)).f127943r;
                    i3++;
                }
                GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse2 = a8.f94597a;
                getSaveInstrumentDetailsResponse2.f110184a = strArr;
                getSaveInstrumentDetailsResponse2.f110185b = iArr;
            }
            bmjf bmjf = bwky2.f160070e;
            if (bmjf == null) {
                bmjf = bmjf.f129685i;
            }
            bmnr bmnr = bmjf.f129689c;
            if (bmnr == null) {
                bmnr = bmnr.f130153o;
            }
            if ((bmnr.f130155a & 4) != 0) {
                bmjf bmjf2 = bwky2.f160070e;
                if (bmjf2 == null) {
                    bmjf2 = bmjf.f129685i;
                }
                RemoteViews remoteViews2 = new RemoteViews(this.f95226a.getPackageName(), 17367043);
                int i4 = Build.VERSION.SDK_INT;
                remoteViews2.setViewPadding(16908308, 0, 0, 0, 0);
                if (!chem.f188536a.mo6606a().mo85178a()) {
                    remoteViews2.setTextColor(16908308, -16777216);
                }
                bmnr bmnr2 = bmjf2.f129689c;
                if (bmnr2 == null) {
                    bmnr2 = bmnr.f130153o;
                }
                Spanned fromHtml = Html.fromHtml(bmnr2.f130159e);
                remoteViews2.setTextViewText(16908308, fromHtml);
                URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(r9, fromHtml.length(), URLSpan.class);
                if (uRLSpanArr.length > 0) {
                    bxvd da6 = bmki.f129802w.mo74144da();
                    bmdn bmdn = bmdn.f128831k;
                    if (da6.f164950c) {
                        da6.mo74035c();
                        da6.f164950c = r9;
                    }
                    bmki bmki = (bmki) da6.f164949b;
                    bmdn.getClass();
                    bmki.f129805b = bmdn;
                    bmki.f129804a |= 1;
                    bmkf bmkf = bmkf.FULLSCREEN;
                    if (da6.f164950c) {
                        da6.mo74035c();
                        da6.f164950c = r9;
                    }
                    bmki bmki2 = (bmki) da6.f164949b;
                    bmki2.f129812i = bmkf.f129800d;
                    bmki2.f129804a |= 128;
                    String url = uRLSpanArr[r9].getURL();
                    if (da6.f164950c) {
                        da6.mo74035c();
                        da6.f164950c = r9;
                    }
                    bmki bmki3 = (bmki) da6.f164949b;
                    url.getClass();
                    bmki3.f129804a |= 2;
                    bmki3.f129806c = url;
                    Context context = this.f95226a;
                    remoteViews = remoteViews2;
                    remoteViews.setOnClickPendingIntent(16908308, spn.m35844a(this.f95226a, PopupRedirectChimeraActivity.m94289a(context, (bmki) da6.mo74062i(), null, context.getString(C0126R.string.wallet_activity_default_title), 0, null, a3, account), 134217728));
                } else {
                    remoteViews = remoteViews2;
                }
                a8.f94597a.f110186c = remoteViews;
            }
            bmaq bmaq = bwky2.f160068c;
            if (bmaq == null) {
                bmaq = bmaq.f128479l;
            }
            if ((bmaq.f128481a & 2) != 0) {
                bmaq bmaq2 = bwky2.f160068c;
                if (bmaq2 == null) {
                    bmaq2 = bmaq.f128479l;
                }
                a8.f94597a.f110187d = bmaq2.f128483c.getKey();
            }
            Status status2 = Status.f30107a;
            getSaveInstrumentDetailsResponse = a8.mo52247a();
            status = status2;
        } else {
            bmav bmav = bwky2.f160067b;
            if (bmav == null) {
                bmav = bmav.f128500h;
            }
            if (!bmav.f128507f.isEmpty()) {
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                bmav bmav2 = bwky2.f160067b;
                if (bmav2 == null) {
                    bmav2 = bmav.f128500h;
                }
                objArr[r9] = bmav2.f128507f;
                Log.w("NetworkOwService", String.format(locale, "Submit UiError w/ internalDetails=%s", objArr));
            }
            getSaveInstrumentDetailsResponse = null;
        }
        awnl2.mo52197a(status, getSaveInstrumentDetailsResponse, Bundle.EMPTY);
    }

    /* JADX WARN: Type inference failed for: r9v1, assign insn: 0x0052: CONST  (r9v1 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r9v17, types: [boolean], assign insn: PHI: (r9v17 ?) = (r9v1 ?), (r9v22 ?) binds: [B:9:0x0075, B:79:0x0211] */
    /* JADX WARN: Type inference failed for: r9v22, assign insn: 0x0219: CONST  (r9v22 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* renamed from: a */
    public final void mo52324a(SaveInstrumentRequest saveInstrumentRequest, Bundle bundle, awnl awnl) {
        Intent intent;
        Intent intent2;
        bxvd bxvd;
        SaveInstrumentRequest saveInstrumentRequest2 = saveInstrumentRequest;
        Bundle bundle2 = bundle;
        awnl awnl2 = awnl;
        sdo.checkIfNull(awnl2, "callbacks is required");
        Account account = (Account) bundle2.getParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT");
        if (!awfx.m79881a(account)) {
            Log.e("NetworkOwService", "Google account required.");
            awnl2.mo52196b(new Status(2, "Google account required."), Bundle.EMPTY);
            return;
        }
        int i = bundle2.getInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT");
        String c = mo52697c(bundle2);
        this.f95228c.mo24605a(c);
        bxvd da = bwkz.f160071d.mo74144da();
        bmaj a = awfx.m79877a(this.f95226a, saveInstrumentRequest2.f110190c, null, c, false, false);
        ? r9 = 0;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwkz bwkz = (bwkz) da.f164949b;
        a.getClass();
        bwkz.f160074b = a;
        bwkz.f160073a |= 1;
        bxvd da2 = bwlc.f160086e.mo74144da();
        ArrayList arrayList = saveInstrumentRequest2.f110189b;
        if (arrayList != null) {
            int i2 = 0;
            while (i2 < arrayList.size()) {
                UserAddress userAddress = (UserAddress) arrayList.get(i2);
                if (userAddress != null) {
                    btwo btwo = (btwo) btwp.f152728s.mo74144da();
                    String str = userAddress.f79117a;
                    if (str != null) {
                        if (btwo.f164950c) {
                            btwo.mo74035c();
                            btwo.f164950c = r9;
                        }
                        btwp btwp = (btwp) btwo.f164949b;
                        str.getClass();
                        btwp.f152730a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                        btwp.f152747r = str;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    String[] strArr = new String[5];
                    strArr[r9] = userAddress.f79118b;
                    strArr[1] = userAddress.f79119c;
                    strArr[2] = userAddress.f79120d;
                    strArr[3] = userAddress.f79121e;
                    strArr[4] = userAddress.f79122f;
                    for (int i3 = 0; i3 < 5; i3++) {
                        String str2 = strArr[i3];
                        if (!TextUtils.isEmpty(str2)) {
                            arrayList2.add(str2);
                        }
                    }
                    btwo.mo72446a(arrayList2);
                    String str3 = userAddress.f79125i;
                    if (str3 != null) {
                        if (btwo.f164950c) {
                            btwo.mo74035c();
                            btwo.f164950c = false;
                        }
                        btwp btwp2 = (btwp) btwo.f164949b;
                        str3.getClass();
                        btwp2.f152730a |= 1;
                        btwp2.f152731b = str3;
                    }
                    String str4 = userAddress.f79124h;
                    if (str4 != null) {
                        if (btwo.f164950c) {
                            btwo.mo74035c();
                            btwo.f164950c = false;
                        }
                        btwp btwp3 = (btwp) btwo.f164949b;
                        str4.getClass();
                        btwp3.f152730a |= 64;
                        btwp3.f152736g = str4;
                    }
                    String str5 = userAddress.f79123g;
                    if (str5 != null) {
                        if (btwo.f164950c) {
                            btwo.mo74035c();
                            btwo.f164950c = false;
                        }
                        btwp btwp4 = (btwp) btwo.f164949b;
                        str5.getClass();
                        btwp4.f152730a |= 16;
                        btwp4.f152734e = str5;
                    }
                    String str6 = userAddress.f79126j;
                    if (str6 != null) {
                        if (btwo.f164950c) {
                            btwo.mo74035c();
                            btwo.f164950c = false;
                        }
                        btwp btwp5 = (btwp) btwo.f164949b;
                        str6.getClass();
                        btwp5.f152730a |= 2048;
                        btwp5.f152740k = str6;
                    }
                    String str7 = userAddress.f79127k;
                    if (str7 != null) {
                        if (btwo.f164950c) {
                            btwo.mo74035c();
                            btwo.f164950c = false;
                        }
                        btwp btwp6 = (btwp) btwo.f164949b;
                        str7.getClass();
                        btwp6.f152730a |= 8192;
                        btwp6.f152741l = str7;
                    }
                    String str8 = userAddress.f79130n;
                    if (str8 != null) {
                        if (btwo.f164950c) {
                            btwo.mo74035c();
                            btwo.f164950c = false;
                        }
                        btwp btwp7 = (btwp) btwo.f164949b;
                        str8.getClass();
                        btwp7.f152730a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                        btwp7.f152746q = str8;
                    }
                    bxvd = bwdr.f158919d.mo74144da();
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bwdr bwdr = (bwdr) bxvd.f164949b;
                    btwp btwp8 = (btwp) btwo.mo74062i();
                    btwp8.getClass();
                    bwdr.f158922b = btwp8;
                    bwdr.f158921a |= 2;
                    String str9 = userAddress.f79128l;
                    if (str9 != null) {
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bwdr bwdr2 = (bwdr) bxvd.f164949b;
                        str9.getClass();
                        bwdr2.f158921a |= 4;
                        bwdr2.f158923c = str9;
                    }
                } else {
                    bxvd = null;
                }
                bwdr bwdr3 = (bwdr) bxvd.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bwlc bwlc = (bwlc) da2.f164949b;
                bwdr3.getClass();
                if (!bwlc.f160091d.mo73666a()) {
                    bwlc.f160091d = GeneratedMessageLite.m124021a(bwlc.f160091d);
                }
                bwlc.f160091d.add(bwdr3);
                i2++;
                r9 = 0;
            }
        }
        Card card = saveInstrumentRequest2.f110188a;
        if (card != null) {
            bxvd da3 = bwkv.f160050f.mo74144da();
            if (!TextUtils.isEmpty(card.mo59922a())) {
                String a2 = card.mo59922a();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bwkv bwkv = (bwkv) da3.f164949b;
                a2.getClass();
                bwkv.f160052a |= 1;
                bwkv.f160053b = a2;
            }
            if (!TextUtils.isEmpty(card.mo59923b())) {
                String b = card.mo59923b();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bwkv bwkv2 = (bwkv) da3.f164949b;
                b.getClass();
                bwkv2.f160052a |= 2;
                bwkv2.f160054c = b;
            }
            int i4 = card.f110180c;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bwkv bwkv3 = (bwkv) da3.f164949b;
            int i5 = bwkv3.f160052a | 4;
            bwkv3.f160052a = i5;
            bwkv3.f160055d = i4;
            int i6 = card.f110181d;
            bwkv3.f160052a = i5 | 8;
            bwkv3.f160056e = i6;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bwlc bwlc2 = (bwlc) da2.f164949b;
            bwkv bwkv4 = (bwkv) da3.mo74062i();
            bwkv4.getClass();
            bwlc2.f160090c = bwkv4;
            bwlc2.f160088a |= 2;
        }
        bxvd da4 = bwei.f158986c.mo74144da();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bwei.m121879a((bwei) da4.f164949b);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bwlc bwlc3 = (bwlc) da2.f164949b;
        bwei bwei = (bwei) da4.mo74062i();
        bwei.getClass();
        bwlc3.f160089b = bwei;
        bwlc3.f160088a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwkz bwkz2 = (bwkz) da.f164949b;
        bwlc bwlc4 = (bwlc) da2.mo74062i();
        bwlc4.getClass();
        bwkz2.f160075c = bwlc4;
        bwkz2.f160073a |= 4;
        UpstreamSubmitRequest upstreamSubmitRequest = new UpstreamSubmitRequest(account, (bwkz) da.mo74062i());
        awyb a3 = BuyFlowConfig.m94175a();
        a3.mo52751b(c);
        awxz a4 = ApplicationParameters.m94173a();
        a4.mo52739a(account);
        a4.mo52744b(i);
        a3.mo52749a(a4.f95270a);
        BuyFlowConfig a5 = a3.mo52748a();
        long uptimeMillis = SystemClock.uptimeMillis();
        ServerResponse a6 = this.f95229d.mo52608a(a5, upstreamSubmitRequest);
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        Status status = Status.f30109c;
        if (a6.mo60050c() == 75) {
            bwla bwla = (bwla) a6.mo60052e();
            if ((bwla.f160078a & 1) == 0) {
                status = Status.f30107a;
            } else {
                bwid bwid = bwla.f160079b;
                if (bwid == null) {
                    bwid = bwid.f159618e;
                }
                if ((bwid.f159620a & 2) != 0) {
                    bwid bwid2 = bwla.f160079b;
                    if (bwid2 == null) {
                        bwid2 = bwid.f159618e;
                    }
                    if ((bwid2.f159620a & 1) != 0) {
                        status = Status.f30107a;
                        bwid bwid3 = bwla.f160079b;
                        if (bwid3 == null) {
                            bwid3 = bwid.f159618e;
                        }
                        if (uptimeMillis2 >= bwid3.f159623d) {
                            Context context = this.f95226a;
                            bwid bwid4 = bwla.f160079b;
                            if (bwid4 == null) {
                                bwid4 = bwid.f159618e;
                            }
                            bwiu bwiu = bwid4.f159621b;
                            if (bwiu == null) {
                                bwiu = bwiu.f159689b;
                            }
                            bwiv bwiv = bwiu.f159691a;
                            if (bwiv == null) {
                                bwiv = bwiv.f159693e;
                            }
                            bwid bwid5 = bwla.f160079b;
                            if (bwid5 == null) {
                                bwid5 = bwid.f159618e;
                            }
                            bmnr bmnr = bwid5.f159622c;
                            if (bmnr == null) {
                                bmnr = bmnr.f130153o;
                            }
                            int i7 = Build.VERSION.SDK_INT;
                            if (chel.m148598b()) {
                                intent2 = axcq.m82331a(context, account, i, bwiv, a5);
                            } else {
                                intent2 = axcq.m82330a(context, account, i, bwiv);
                            }
                            new adzt(Looper.getMainLooper()).post(new axcq(context, intent2, ((bmno) bmnr.f130157c.get(0)).f130142c, bmnr.f130159e, bmnr.f130160f, a5));
                        } else {
                            int i8 = Build.VERSION.SDK_INT;
                            if (!chel.f188534a.mo6606a().mo85181c()) {
                                Context context2 = this.f95226a;
                                bwid bwid6 = bwla.f160079b;
                                if (bwid6 == null) {
                                    bwid6 = bwid.f159618e;
                                }
                                bwiu bwiu2 = bwid6.f159621b;
                                if (bwiu2 == null) {
                                    bwiu2 = bwiu.f159689b;
                                }
                                bwiv bwiv2 = bwiu2.f159691a;
                                if (bwiv2 == null) {
                                    bwiv2 = bwiv.f159693e;
                                }
                                intent = LaunchPendingIntentChimeraActivity.m93989a(this.f95226a, a5, null, spn.m35844a(context2, axcq.m82330a(context2, account, i, bwiv2), (int) JGCastService.FLAG_PRIVATE_DISPLAY));
                            } else {
                                Context context3 = this.f95226a;
                                bwid bwid7 = bwla.f160079b;
                                if (bwid7 == null) {
                                    bwid7 = bwid.f159618e;
                                }
                                bwiu bwiu3 = bwid7.f159621b;
                                if (bwiu3 == null) {
                                    bwiu3 = bwiu.f159689b;
                                }
                                bwiv bwiv3 = bwiu3.f159691a;
                                if (bwiv3 == null) {
                                    bwiv3 = bwiv.f159693e;
                                }
                                intent = awmz.m80254a(context3, axcq.m82331a(context3, account, i, bwiv3, a5), "com.google.android.gms.wallet.firstparty.ACTION_ADD_INSTRUMENT_FROM_NOTIFICATION", a5);
                            }
                            intent.addFlags(268435456);
                            this.f95226a.startActivity(intent);
                        }
                    }
                }
            }
        }
        awnl2.mo52196b(status, Bundle.EMPTY);
    }

    /* renamed from: a */
    public final void mo52325a(String str, String str2, Bundle bundle, awnl awnl) {
        LoadMaskedWalletServiceResponse loadMaskedWalletServiceResponse;
        awrs awrs = this.f95230e;
        awrs.mo52514a(bundle);
        awri awri = new awri(awrs.f94932a, bundle, str, str2, awrs.f94938g);
        String str3 = awri.f94917d;
        if (str3 != null) {
            byak a = awri.f94915b.mo52546a(str3);
            if (a == null) {
                awrt.m80846a("changeMaskedWallet", String.format(Locale.US, "Unknown active googleTransactionId \"%s\". This may happen when you sent thewrong ID or an ID that is more than 24h old.", awri.f94917d));
                loadMaskedWalletServiceResponse = awri.mo52503a(1021);
            } else {
                awri.f94916c.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(a.f165273c, "com.google"));
                IbBuyFlowInput a2 = IbBuyFlowInput.m94104a(a.f165274d);
                a2.mo59986b(awri.f94917d);
                a2.mo59985b(4);
                awri.mo52504a();
                BuyFlowConfig buyFlowConfig = awri.f94919f;
                byte[] k = a.f165275e.getKey();
                awrq awrq = new awrq();
                awrq.f94929a = a.f165278h;
                awrq.f94930b = awri.f94918e;
                loadMaskedWalletServiceResponse = LoadMaskedWalletServiceResponse.m94141a(awri.f94914a, buyFlowConfig, awri.f94917d, spn.m35844a(awri.f94914a, IbChimeraActivity.m93947a(buyFlowConfig, null, k, a2, awrq.mo52513a(), awri.f94920g), (int) JGCastService.FLAG_PRIVATE_DISPLAY));
            }
        } else {
            awrt.m80846a("changeMaskedWallet", "Unexpected null googleTransactionId!");
            loadMaskedWalletServiceResponse = awri.mo52503a(1050);
        }
        int i = loadMaskedWalletServiceResponse.f110355c;
        if (awri.f94919f == null) {
            awri.mo52504a();
        }
        int i2 = awri.f94921h;
        if (i2 != 1) {
            BuyFlowConfig buyFlowConfig2 = awri.f94919f;
            String str4 = awri.f94917d;
            int i3 = i2 - 1;
            if (i2 != 0) {
                ReportErrorChimeraIntentOperation.m94035a(buyFlowConfig2, str4, 4, i, i3, awri.f94914a);
            } else {
                throw null;
            }
        }
        if (i != 6) {
            Context context = awri.f94914a;
            int i4 = awri.f94921h;
            int i5 = i4 - 1;
            if (i4 != 0) {
                OwMwUnsuccessfulEvent.m93836a(context, i, 5, i5, 1, awri.f94920g, awri.f94917d);
            } else {
                throw null;
            }
        } else {
            OwMwChooserShownEvent.m93835a(awri.f94914a, awri.f94920g);
        }
        awnl.mo52331a(loadMaskedWalletServiceResponse.f110355c, loadMaskedWalletServiceResponse.f110354b, loadMaskedWalletServiceResponse.f110353a);
    }
}
