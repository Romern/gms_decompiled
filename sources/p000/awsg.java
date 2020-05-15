package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.analytics.events.OwMaskedWalletReceivedEvent;
import com.google.android.gms.wallet.analytics.events.OwMaskedWalletRequestedEvent;
import com.google.android.gms.wallet.analytics.events.OwMwChooserShownEvent;
import com.google.android.gms.wallet.analytics.events.OwMwUnsuccessfulEvent;
import com.google.android.gms.wallet.analytics.events.OwUserFoundToHavePreAuthEvent;
import com.google.android.gms.wallet.common.p079ui.ErrorChimeraActivity;
import com.google.android.gms.wallet.intentoperation.p083ib.PrefetchFullWalletIntentOperation;
import com.google.android.gms.wallet.intentoperation.p083ib.ReportErrorChimeraIntentOperation;
import com.google.android.gms.wallet.p081ib.IbChimeraActivity;
import com.google.android.gms.wallet.service.orchestration.BuyFlowIntegratorDataRequest;
import com.google.android.gms.wallet.service.orchestration.BuyFlowIntegratorDataResponse;
import com.google.android.gms.wallet.service.p086ib.IbBuyFlowInput;
import com.google.android.gms.wallet.service.p086ib.LoadMaskedWalletServiceRequest;
import com.google.android.gms.wallet.service.p086ib.LoadMaskedWalletServiceResponse;
import com.google.android.gms.wallet.service.p086ib.ProcessBuyFlowResultRequest;
import com.google.android.gms.wallet.service.p086ib.ProcessBuyFlowResultResponse;
import com.google.android.gms.wallet.service.p086ib.RefreshUserSpecificDataResponse;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: awsg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awsg {

    /* renamed from: a */
    String f95012a;

    /* renamed from: b */
    String f95013b;

    /* renamed from: c */
    private final Context f95014c;

    /* renamed from: d */
    private final awra f95015d;

    /* renamed from: e */
    private final awua f95016e;

    /* renamed from: f */
    private final rfz f95017f;

    /* renamed from: g */
    private final awwt f95018g;

    /* renamed from: h */
    private final awsm f95019h;

    /* renamed from: i */
    private final svq f95020i;

    /* renamed from: j */
    private final awsz f95021j;

    /* renamed from: k */
    private final awta f95022k;

    /* renamed from: l */
    private final LoadMaskedWalletServiceRequest f95023l;

    /* renamed from: m */
    private BuyFlowConfig f95024m;

    /* renamed from: n */
    private boolean f95025n;

    /* renamed from: o */
    private int f95026o = 8;

    /* renamed from: p */
    private int f95027p = 1;

    public awsg(Context context, awra awra, awua awua, rfz rfz, awwt awwt, awsm awsm, svq svq, awsz awsz, awta awta, LoadMaskedWalletServiceRequest loadMaskedWalletServiceRequest) {
        this.f95014c = context;
        this.f95015d = awra;
        this.f95016e = awua;
        this.f95017f = rfz;
        this.f95019h = awsm;
        this.f95020i = svq;
        this.f95021j = awsz;
        this.f95022k = awta;
        this.f95018g = awwt;
        this.f95023l = loadMaskedWalletServiceRequest;
    }

    /* renamed from: a */
    private final LoadMaskedWalletServiceResponse m80903a(int i, int i2) {
        this.f95027p = i2;
        this.f95026o = i;
        return new LoadMaskedWalletServiceResponse(Bundle.EMPTY, m80908c(), i);
    }

    /* renamed from: b */
    private final void m80907b() {
        boolean z;
        String str;
        boolean z2 = true;
        if (this.f95024m == null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        if (this.f95012a != null) {
            z2 = false;
        }
        sdo.m34970a(z2);
        BuyFlowConfig a = awrt.m80827a(this.f95023l.f110351a, this.f95013b);
        this.f95024m = a;
        Account account = a.f110418b.f110407b;
        Context context = this.f95014c;
        if (account != null) {
            str = account.name;
        } else {
            str = null;
        }
        this.f95012a = OwMaskedWalletRequestedEvent.m93834a(context, str, this.f95024m, false);
    }

    /* renamed from: c */
    private final MaskedWallet m80908c() {
        String str;
        awbb a = MaskedWallet.m93790a();
        MaskedWalletRequest maskedWalletRequest = this.f95023l.f110352b;
        if (maskedWalletRequest != null) {
            str = maskedWalletRequest.f109856a;
        } else {
            str = null;
        }
        a.mo51809b(str);
        a.mo51808a(this.f95013b);
        return a.f94143a;
    }

    /* renamed from: a */
    private final LoadMaskedWalletServiceResponse m80904a(IbBuyFlowInput ibBuyFlowInput, int i) {
        return m80905a(null, ibBuyFlowInput, i);
    }

    /* renamed from: a */
    private final LoadMaskedWalletServiceResponse m80905a(BuyFlowIntegratorDataResponse buyFlowIntegratorDataResponse, IbBuyFlowInput ibBuyFlowInput, int i) {
        IbBuyFlowInput ibBuyFlowInput2;
        byte[] bArr;
        byte[] bArr2;
        if (ibBuyFlowInput.mo60002j()) {
            ibBuyFlowInput2 = ibBuyFlowInput;
        } else {
            IbBuyFlowInput b = ibBuyFlowInput.mo59984b();
            b.mo59996f(true);
            ibBuyFlowInput2 = b;
        }
        this.f95026o = 6;
        Context context = this.f95014c;
        BuyFlowConfig buyFlowConfig = this.f95024m;
        if (buyFlowIntegratorDataResponse != null) {
            bArr = buyFlowIntegratorDataResponse.f110375a;
        } else {
            bArr = null;
        }
        if (buyFlowIntegratorDataResponse != null) {
            bArr2 = buyFlowIntegratorDataResponse.f110377c;
        } else {
            bArr2 = null;
        }
        awrq awrq = new awrq();
        awrq.f94929a = i;
        awrq.f94930b = this.f95023l.f110352b.f109856a;
        return LoadMaskedWalletServiceResponse.m94141a(this.f95014c, this.f95024m, this.f95013b, spn.m35844a(context, IbChimeraActivity.m93947a(buyFlowConfig, bArr, bArr2, ibBuyFlowInput2, awrq.mo52513a(), this.f95012a), (int) JGCastService.FLAG_PRIVATE_DISPLAY));
    }

    /* renamed from: a */
    private final LoadMaskedWalletServiceResponse m80906a(String str, int i) {
        this.f95026o = i;
        Intent intent = new Intent();
        intent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", i);
        intent.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", m80908c());
        if (this.f95024m == null) {
            m80907b();
        }
        return LoadMaskedWalletServiceResponse.m94141a(this.f95014c, this.f95024m, this.f95013b, spn.m35844a(this.f95014c, ErrorChimeraActivity.m93895a(this.f95024m, intent, str), (int) JGCastService.FLAG_PRIVATE_DISPLAY));
    }

    /* JADX WARNING: Removed duplicated region for block: B:151:0x04b9  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x04bf A[SYNTHETIC, Splitter:B:152:0x04bf] */
    /* renamed from: a */
    public final LoadMaskedWalletServiceResponse mo52525a() {
        LoadMaskedWalletServiceResponse loadMaskedWalletServiceResponse;
        boolean z;
        ArrayList arrayList;
        int i;
        boolean z2;
        boolean z3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        awru awru = new awru();
        this.f95013b = awrt.m80833a(this.f95023l.f110351a, awru);
        LoadMaskedWalletServiceRequest loadMaskedWalletServiceRequest = this.f95023l;
        if (loadMaskedWalletServiceRequest.f110352b == null) {
            awrt.m80846a("loadMaskedWallet", "Request should not be null!");
            loadMaskedWalletServiceResponse = m80903a(10, 1065);
        } else if (!awxj.m81405c(loadMaskedWalletServiceRequest.f110351a)) {
            loadMaskedWalletServiceResponse = m80906a(this.f95014c.getString(C0126R.string.wallet_google_wallet_deprecation_message), 412);
        } else {
            int i2 = Build.VERSION.SDK_INT;
            if (soz.m35807f(this.f95014c)) {
                loadMaskedWalletServiceResponse = m80903a(409, 1);
            } else {
                Account[] a = adyd.m51363a(this.f95014c).mo33916a("com.google");
                Account a2 = awrt.m80809a(a, this.f95023l.f110351a, this.f95017f, this.f95018g, this.f95022k);
                if (a2 == null) {
                    loadMaskedWalletServiceResponse = m80906a(this.f95014c.getString(C0126R.string.google_pay_no_google_accounts_error), 409);
                } else {
                    this.f95023l.f110351a.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", a2);
                    m80907b();
                    rjr b = this.f95018g.mo65548b(this.f95024m, a2, this.f95013b);
                    if (!b.f43154a.mo17710c()) {
                        Log.w("LoadMaskedWalletAction", String.format(Locale.US, "Failed to check Service Layer enabled! status = %s message = %s", Integer.valueOf(b.f43154a.f30115i), b.f43154a.f30116j));
                        loadMaskedWalletServiceResponse = m80903a(8, 1011);
                    } else {
                        String string = this.f95023l.f110351a.getString("androidPackageName");
                        int length = a.length;
                        boolean z4 = b.f43155b;
                        IbBuyFlowInput a3 = IbBuyFlowInput.m94103a();
                        a3.mo59989c(((Boolean) awie.f94422r.mo58455c()).booleanValue());
                        if (this.f95024m.f110418b.f110406a == 3) {
                            z = true;
                        } else {
                            z = false;
                        }
                        a3.mo59995e(z);
                        MaskedWalletRequest maskedWalletRequest = this.f95023l.f110352b;
                        a3.mo59983a(maskedWalletRequest.f109857b);
                        a3.mo59987b(maskedWalletRequest.f109858c);
                        bxvd da = blwj.f127945d.mo74144da();
                        String str = "loadMaskedWallet";
                        long a4 = awrt.m80806a(maskedWalletRequest.f109860e, "estimatedTotalPrice", awru);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        blwj blwj = (blwj) da.f164949b;
                        blwj.f127947a |= 1;
                        blwj.f127948b = a4;
                        if (!TextUtils.isEmpty(maskedWalletRequest.f109861f)) {
                            String str2 = maskedWalletRequest.f109861f;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            blwj blwj2 = (blwj) da.f164949b;
                            str2.getClass();
                            blwj2.f127947a |= 2;
                            blwj2.f127949c = str2;
                        } else {
                            awru.mo52515a("Field currencyCode is required", 1030);
                        }
                        blze blze = a3.f110340b;
                        blzq blzq = ((blzf) blze.f164949b).f128346i;
                        if (blzq == null) {
                            blzq = blzq.f128364p;
                        }
                        bxvd bxvd = (bxvd) blzq.mo74142c(5);
                        bxvd.mo73625a((bxvk) blzq);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        blzq blzq2 = (blzq) bxvd.f164949b;
                        blwj blwj3 = (blwj) da.mo74062i();
                        blwj3.getClass();
                        blzq2.f128368c = blwj3;
                        blzq2.f128366a |= 2;
                        String a5 = awjn.m80013a(maskedWalletRequest.f109862g);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        blzq blzq3 = (blzq) bxvd.f164949b;
                        a5.getClass();
                        blzq3.f128366a |= 4;
                        blzq3.f128369d = a5;
                        if (blze.f164950c) {
                            blze.mo74035c();
                            blze.f164950c = false;
                        }
                        blzf blzf = (blzf) blze.f164949b;
                        blzq blzq4 = (blzq) bxvd.mo74062i();
                        bxvu bxvu = blzf.f128336h;
                        blzq4.getClass();
                        blzf.f128346i = blzq4;
                        blzf.f128339a |= 32;
                        ArrayList arrayList2 = maskedWalletRequest.f109869n;
                        if (maskedWalletRequest.f109858c && arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            arrayList2.add(new CountrySpecification("US"));
                        }
                        if (arrayList2 == null || arrayList2.isEmpty()) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList();
                            int size = arrayList2.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                CountrySpecification countrySpecification = (CountrySpecification) arrayList2.get(i3);
                                if (countrySpecification != null) {
                                    arrayList.add(countrySpecification.f79116a);
                                }
                            }
                        }
                        bwdx a6 = IbBuyFlowInput.m94101a(arrayList);
                        if (a6 == null) {
                            blze blze2 = a3.f110340b;
                            if (blze2.f164950c) {
                                blze2.mo74035c();
                                blze2.f164950c = false;
                            }
                            blzf blzf2 = (blzf) blze2.f164949b;
                            blzf2.f128344f = null;
                            blzf2.f128339a &= -17;
                        } else {
                            blze blze3 = a3.f110340b;
                            if (blze3.f164950c) {
                                blze3.mo74035c();
                                blze3.f164950c = false;
                            }
                            blzf blzf3 = (blzf) blze3.f164949b;
                            a6.getClass();
                            blzf3.f128344f = a6;
                            blzf3.f128339a |= 16;
                        }
                        bmab a7 = IbBuyFlowInput.m94100a(maskedWalletRequest.f109870o);
                        if (a7 == null) {
                            blze blze4 = a3.f110340b;
                            blzq blzq5 = ((blzf) blze4.f164949b).f128346i;
                            if (blzq5 == null) {
                                blzq5 = blzq.f128364p;
                            }
                            bxvd bxvd2 = (bxvd) blzq5.mo74142c(5);
                            bxvd2.mo73625a((bxvk) blzq5);
                            if (bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            blzq blzq6 = (blzq) bxvd2.f164949b;
                            blzq6.f128370e = null;
                            blzq6.f128366a &= -9;
                            if (blze4.f164950c) {
                                blze4.mo74035c();
                                blze4.f164950c = false;
                            }
                            blzf blzf4 = (blzf) blze4.f164949b;
                            blzq blzq7 = (blzq) bxvd2.mo74062i();
                            blzq7.getClass();
                            blzf4.f128346i = blzq7;
                            blzf4.f128339a |= 32;
                        } else {
                            blze blze5 = a3.f110340b;
                            blzq blzq8 = ((blzf) blze5.f164949b).f128346i;
                            if (blzq8 == null) {
                                blzq8 = blzq.f128364p;
                            }
                            bxvd bxvd3 = (bxvd) blzq8.mo74142c(5);
                            bxvd3.mo73625a((bxvk) blzq8);
                            if (bxvd3.f164950c) {
                                bxvd3.mo74035c();
                                bxvd3.f164950c = false;
                            }
                            blzq blzq9 = (blzq) bxvd3.f164949b;
                            a7.getClass();
                            blzq9.f128370e = a7;
                            blzq9.f128366a |= 8;
                            if (blze5.f164950c) {
                                blze5.mo74035c();
                                blze5.f164950c = false;
                            }
                            blzf blzf5 = (blzf) blze5.f164949b;
                            blzq blzq10 = (blzq) bxvd3.mo74062i();
                            blzq10.getClass();
                            blzf5.f128346i = blzq10;
                            blzf5.f128339a |= 32;
                        }
                        blze blze6 = a3.f110340b;
                        if (blze6.f164950c) {
                            blze6.mo74035c();
                            blze6.f164950c = false;
                        }
                        ((blzf) blze6.f164949b).f128345g = bxvk.m124028dc();
                        blze6.mo66774a(Arrays.asList(IbBuyFlowInput.m94106a(maskedWalletRequest.f109867l, maskedWalletRequest.f109868m, maskedWalletRequest.f109871p, a3.mo60006n())));
                        a3.mo59986b(this.f95013b);
                        if (a3.mo60006n() == 3) {
                            String a8 = this.f95019h.mo52530a(a3.mo59988c("publicKey"));
                            if (!TextUtils.isEmpty(a8)) {
                                awru.mo52515a(a8, 1033);
                            }
                        }
                        bwgu a9 = awrt.m80817a(this.f95015d.mo52470a(string));
                        bxvd bxvd4 = (bxvd) a9.mo74142c(5);
                        bxvd4.mo73625a((bxvk) a9);
                        boolean a10 = awrt.m80853a(this.f95020i);
                        if (bxvd4.f164950c) {
                            bxvd4.mo74035c();
                            bxvd4.f164950c = false;
                        }
                        bwgu bwgu = (bwgu) bxvd4.f164949b;
                        bwgu bwgu2 = bwgu.f159265i;
                        bwgu.f159267a |= 8;
                        bwgu.f159274h = a10;
                        a3.mo59979a((bwgu) bxvd4.mo74062i());
                        a3.mo59976a(length);
                        a3.mo59991d(z4);
                        Cart cart = this.f95023l.f110352b.f109863h;
                        if (cart != null) {
                            awrt.m80844a(cart, "cart", awru);
                        }
                        ArrayList arrayList3 = this.f95023l.f110352b.f109871p;
                        if (arrayList3 != null && !arrayList3.isEmpty()) {
                            int size2 = arrayList3.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size2) {
                                    break;
                                } else if (!awrt.m80860b(((Integer) arrayList3.get(i4)).intValue())) {
                                    i4++;
                                } else if (this.f95023l.f110352b.f109872q == null) {
                                    awru.mo52515a("Country code must be set if any of the allowed networks uses EMV cryptogram! See MaskedWalletRequest.setCountryCode() for more details.", 1036);
                                }
                            }
                        }
                        String str3 = this.f95023l.f110352b.f109872q;
                        if (str3 != null) {
                            i = awrt.m80855b(str3, awru);
                        } else {
                            i = 0;
                        }
                        if (awru.f94946a.isEmpty()) {
                            RefreshUserSpecificDataResponse a11 = new awsv(this.f95018g, this.f95022k, this.f95024m, a3).mo52543a();
                            int i5 = a11.f110367b;
                            if (i5 != 0) {
                                loadMaskedWalletServiceResponse = m80903a(i5, a11.f110368c);
                            } else {
                                IbBuyFlowInput ibBuyFlowInput = a11.f110366a;
                                this.f95025n = ibBuyFlowInput.mo60000h();
                                byal a12 = this.f95022k.mo52547a(this.f95024m.f110418b.f110406a, a2, string);
                                if (!ibBuyFlowInput.mo59997f() || !((Boolean) awie.f94411g.mo58455c()).booleanValue()) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (!z2 && ibBuyFlowInput.mo59997f() && (a12 == null || a12.f165286f)) {
                                    awwt awwt = this.f95018g;
                                    BuyFlowConfig buyFlowConfig = this.f95024m;
                                    rjr a13 = awwt.mo65547a(buyFlowConfig, buyFlowConfig.f110418b.f110407b, this.f95013b, ibBuyFlowInput.mo60001i());
                                    if (!a13.f43154a.mo17710c()) {
                                        Log.w("LoadMaskedWalletAction", String.format(Locale.US, "Failed to check if device was unlocked for payment! status = %s message = %s", Integer.valueOf(a13.f43154a.f30115i), a13.f43154a.f30116j));
                                        ReportErrorChimeraIntentOperation.m94035a(this.f95024m, this.f95013b, 3, 8, 1006, this.f95014c);
                                    } else if (a13.f43155b) {
                                        z2 = false;
                                    }
                                    z2 = true;
                                }
                                ibBuyFlowInput.mo59999g(z2);
                                if (this.f95025n) {
                                    if (((Boolean) awjl.f94544f.mo58455c()).booleanValue()) {
                                        z3 = true;
                                    } else if (!z2) {
                                        z3 = false;
                                    }
                                    ibBuyFlowInput.mo59985b(2);
                                    ibBuyFlowInput.mo59996f(z3);
                                    if (!z3) {
                                        loadMaskedWalletServiceResponse = m80904a(ibBuyFlowInput, i);
                                    } else {
                                        try {
                                            IbBuyFlowInput b2 = ibBuyFlowInput.mo59984b();
                                            b2.mo59996f(true);
                                            awtd a14 = BuyFlowIntegratorDataRequest.m94146a();
                                            a14.mo52554a("com.google.android.gms.wallet.ib.INSTANT_BUY");
                                            a14.mo52555a(ibBuyFlowInput.mo59992d());
                                            awrq awrq = new awrq();
                                            awrq.f94929a = i;
                                            awrq.f94930b = this.f95023l.f110352b.f109856a;
                                            a14.mo52553a(IbChimeraActivity.m93948a(b2, awrq.mo52513a(), this.f95012a));
                                            BuyFlowIntegratorDataResponse a15 = this.f95016e.mo52569a(this.f95024m, a14.mo52552a());
                                            int i6 = a15.f110379e;
                                            if (i6 == 5 || i6 == 6 || i6 == 22) {
                                                loadMaskedWalletServiceResponse = m80904a(ibBuyFlowInput, i);
                                            } else if (i6 == 49) {
                                                awrq awrq2 = new awrq();
                                                awrq2.f94929a = i;
                                                awrq2.f94930b = this.f95023l.f110352b.f109856a;
                                                ProcessBuyFlowResultResponse a16 = new awsq(this.f95014c, this.f95018g, this.f95019h, this.f95021j, this.f95022k, this.f95024m, new ProcessBuyFlowResultRequest(ibBuyFlowInput, awrq2.mo52513a(), a15.f110377c, a15.f110376b, 0)).mo52536a();
                                                if (a16.f110362b != -1) {
                                                    Log.e("LoadMaskedWalletAction", String.format(Locale.US, "Received unexpected activityResultCode = %d", Integer.valueOf(a16.f110362b)));
                                                    int i7 = a16.f110365e;
                                                    if (i7 == 1) {
                                                        i7 = 1009;
                                                    }
                                                    loadMaskedWalletServiceResponse = m80903a(a16.f110363c.getIntExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 8), i7);
                                                } else {
                                                    Bundle extras = a16.f110363c.getExtras();
                                                    if (!extras.containsKey("com.google.android.gms.wallet.EXTRA_MASKED_WALLET")) {
                                                        Log.e("LoadMaskedWalletAction", "Could not derive a masked wallet from the buyFlowResult");
                                                        loadMaskedWalletServiceResponse = m80903a(8, 1008);
                                                    } else {
                                                        extras.remove("com.google.android.gms.wallet.EXTRA_MASKED_WALLET");
                                                        Context context = this.f95014c;
                                                        context.startService(PrefetchFullWalletIntentOperation.m94034a(context, this.f95024m, ibBuyFlowInput.mo59994e(), this.f95023l.f110352b.f109856a));
                                                        this.f95026o = 0;
                                                        loadMaskedWalletServiceResponse = new LoadMaskedWalletServiceResponse(extras, (MaskedWallet) extras.getParcelable("com.google.android.gms.wallet.EXTRA_MASKED_WALLET"), 0);
                                                    }
                                                }
                                            } else if (i6 != 50) {
                                                Log.e("LoadMaskedWalletAction", String.format(Locale.US, "Falling back to showing UI after receiving unexpected code %d from getBuyFlowIntegratorData", Integer.valueOf(a15.f110379e)));
                                                ReportErrorChimeraIntentOperation.m94035a(this.f95024m, this.f95013b, 3, 8, 1011, this.f95014c);
                                                loadMaskedWalletServiceResponse = m80904a(ibBuyFlowInput, i);
                                            } else {
                                                this.f95026o = 6;
                                                loadMaskedWalletServiceResponse = m80905a(a15, ibBuyFlowInput, i);
                                            }
                                        } catch (RemoteException e) {
                                            Log.e("LoadMaskedWalletAction", "Error when retrieving preauth response using getBuyFlowIntegratorData!", e);
                                            loadMaskedWalletServiceResponse = m80903a(8, 1010);
                                        }
                                    }
                                }
                                z3 = true;
                                ibBuyFlowInput.mo59985b(2);
                                ibBuyFlowInput.mo59996f(z3);
                                if (!z3) {
                                }
                            }
                        } else {
                            ArrayList arrayList4 = awru.f94946a;
                            int size3 = arrayList4.size();
                            for (int i8 = 0; i8 < size3; i8++) {
                                awrt.m80846a(str, (String) arrayList4.get(i8));
                            }
                            loadMaskedWalletServiceResponse = m80903a(10, awru.f94947b);
                        }
                    }
                }
            }
        }
        int elapsedRealtime2 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
        sdo.m34959a((Object) this.f95013b);
        if (this.f95024m == null) {
            m80907b();
        }
        int i9 = this.f95027p;
        if (i9 != 1) {
            BuyFlowConfig buyFlowConfig2 = this.f95024m;
            String str4 = this.f95013b;
            int i10 = this.f95026o;
            int i11 = i9 - 1;
            if (i9 != 0) {
                ReportErrorChimeraIntentOperation.m94035a(buyFlowConfig2, str4, 3, i10, i11, this.f95014c);
            } else {
                throw null;
            }
        }
        if (this.f95025n) {
            awqc.m80662a(this.f95014c, new OwUserFoundToHavePreAuthEvent(this.f95012a));
        }
        int i12 = this.f95026o;
        if (i12 == 0) {
            OwMaskedWalletReceivedEvent.m93833a(this.f95014c, 1, this.f95013b, this.f95012a, elapsedRealtime2);
        } else if (i12 != 6) {
            Context context2 = this.f95014c;
            int i13 = this.f95027p;
            int i14 = i13 - 1;
            if (i13 != 0) {
                OwMwUnsuccessfulEvent.m93836a(context2, i12, 5, i14, 1, this.f95012a, this.f95013b);
            } else {
                throw null;
            }
        } else {
            OwMwChooserShownEvent.m93835a(this.f95014c, this.f95012a);
        }
        return loadMaskedWalletServiceResponse;
    }
}
