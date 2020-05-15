package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import com.google.android.gms.wallet.WebPaymentData;
import com.google.android.gms.wallet.WebPaymentDataRequest;
import com.google.android.gms.wallet.analytics.events.LoadWebPaymentDataCallEvent;
import com.google.android.gms.wallet.intentoperation.p083ib.ReportErrorChimeraIntentOperation;
import com.google.android.gms.wallet.p081ib.IbPaymentRequestCompatChimeraActivity;
import com.google.android.gms.wallet.service.p086ib.IbBuyFlowInput;
import com.google.android.gms.wallet.service.p086ib.IbMerchantParameters;
import com.google.android.gms.wallet.service.p086ib.LoadMaskedWalletServiceRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: awsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awsl extends awrb {

    /* renamed from: j */
    private final WebPaymentDataRequest f95033j;

    /* renamed from: k */
    private final JSONObject f95034k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
        if (p000.awrt.m80829a(r2, "totalPriceStatus", java.lang.String.class, 1074, new p000.awru()) == null) goto L_0x004f;
     */
    public awsl(Context context, awra awra, rfz rfz, awwt awwt, awsm awsm, awta awta, Bundle bundle, WebPaymentDataRequest webPaymentDataRequest) {
        super(context, awra, rfz, null, awwt, awsm, null, awta, bundle);
        WebPaymentDataRequest webPaymentDataRequest2;
        JSONObject a;
        WebPaymentDataRequest webPaymentDataRequest3 = webPaymentDataRequest;
        if (!chhy.f188634a.mo6606a().mo85250e() || (a = awrt.m80839a(webPaymentDataRequest3.f109911c)) == null) {
            webPaymentDataRequest2 = webPaymentDataRequest3;
        } else {
            JSONObject jSONObject = (JSONObject) awrt.m80829a(a, "transactionInfo", JSONObject.class, 1074, new awru());
            try {
                if (webPaymentDataRequest3.f109909a != null) {
                    if (jSONObject != null) {
                    }
                    Cart cart = webPaymentDataRequest3.f109909a;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    a.put("transactionInfo", jSONObject.put("totalPriceStatus", "ESTIMATED").put("totalPrice", cart.f109776a).put("currencyCode", cart.f109777b));
                }
                awbz awbz = new awbz(new WebPaymentDataRequest());
                Cart cart2 = webPaymentDataRequest3.f109909a;
                WebPaymentDataRequest webPaymentDataRequest4 = awbz.f94159a;
                webPaymentDataRequest4.f109909a = cart2;
                webPaymentDataRequest4.f109910b = webPaymentDataRequest3.f109910b;
                String jSONObject2 = a.toString();
                webPaymentDataRequest2 = awbz.f94159a;
                webPaymentDataRequest2.f109911c = jSONObject2;
            } catch (JSONException e) {
                throw new RuntimeException("Fail to construct transactionInfo from Cart", e);
            }
        }
        this.f95033j = webPaymentDataRequest2;
        this.f95034k = awrt.m80839a(webPaymentDataRequest3.f109911c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Account mo52471a(Account[] accountArr) {
        if (this.f95034k == null || !((Boolean) awie.f94404G.mo58455c()).booleanValue()) {
            return null;
        }
        return awrt.m80808a(this.f94888a, accountArr, this.f95034k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final awsk mo52473a(IbBuyFlowInput ibBuyFlowInput) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52477a(bxvd bxvd) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List mo52479b() {
        if (this.f95033j != null) {
            return awrt.m80874g(this.f95034k, new awru());
        }
        return bngx.m109376e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo52481c() {
        return "loadWebPaymentData";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo52482c(awru awru) {
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Intent mo52483d(awru awru) {
        JSONObject a;
        WebPaymentDataRequest webPaymentDataRequest = this.f95033j;
        awrt.m80845a(webPaymentDataRequest, awru);
        MaskedWalletRequest maskedWalletRequest = null;
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = null;
        maskedWalletRequest = null;
        maskedWalletRequest = null;
        if (awru.f94946a.isEmpty() && (a = awrt.m80840a(webPaymentDataRequest.f109911c, awru)) != null) {
            JSONObject optJSONObject = a.optJSONObject("paymentMethodTokenizationParameters");
            if (optJSONObject == null) {
                awru.mo52515a(String.format(Locale.US, "paymentMethodTokenizationParameters must be set to a JSON object!", new Object[0]), 1043);
            } else {
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("parameters");
                if (optJSONObject2 == null) {
                    awru.mo52515a(String.format(Locale.US, "paymentMethodTokenizationParameters.parameters must be set to a JSON object!", new Object[0]), 1045);
                } else {
                    try {
                        optJSONObject2.put("chromeExt$merchantOrigin", webPaymentDataRequest.f109910b).put("chromeExt$walletParameters", webPaymentDataRequest.f109911c);
                    } catch (JSONException e) {
                        throw new RuntimeException("Failed to add chrome ext parameters into JSONObject!");
                    }
                }
            }
            if (awru.f94946a.isEmpty()) {
                awbd awbd = new awbd(new MaskedWalletRequest());
                awbd.f94144a.f109862g = a.optString("merchantName");
                List b = awrt.m80859b(a.optJSONArray("allowedCardNetworks"));
                if (b != null) {
                    MaskedWalletRequest maskedWalletRequest2 = awbd.f94144a;
                    if (maskedWalletRequest2.f109871p == null) {
                        maskedWalletRequest2.f109871p = new ArrayList();
                    }
                    awbd.f94144a.f109871p.addAll(b);
                }
                JSONObject optJSONObject3 = a.optJSONObject("paymentMethodTokenizationParameters");
                if (optJSONObject3 != null) {
                    awbm awbm = new awbm(new PaymentMethodTokenizationParameters());
                    String optString = optJSONObject3.optString("tokenizationType");
                    if ("GATEWAY_TOKEN".equals(optString)) {
                        awbm.mo51825a(1);
                    } else if ("NETWORK_TOKEN".equals(optString)) {
                        awbm.mo51825a(2);
                    }
                    JSONObject optJSONObject4 = optJSONObject3.optJSONObject("parameters");
                    if (optJSONObject4 != null) {
                        Iterator<String> keys = optJSONObject4.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            String optString2 = optJSONObject4.optString(next);
                            sdo.m34969a(next, (Object) "Tokenization parameter name must not be empty");
                            sdo.m34969a(optString2, (Object) "Tokenization parameter value must not be empty");
                            awbm.f94147a.f109898b.putString(next, optString2);
                        }
                    }
                    paymentMethodTokenizationParameters = awbm.f94147a;
                }
                MaskedWalletRequest maskedWalletRequest3 = awbd.f94144a;
                maskedWalletRequest3.f109870o = paymentMethodTokenizationParameters;
                maskedWalletRequest3.f109863h = webPaymentDataRequest.f109909a;
                Cart cart = webPaymentDataRequest.f109909a;
                maskedWalletRequest3.f109861f = cart.f109777b;
                maskedWalletRequest3.f109860e = cart.f109776a;
                maskedWalletRequest = maskedWalletRequest3;
            }
        }
        return IbPaymentRequestCompatChimeraActivity.m93981a(this.f94893f, this.f95033j, new LoadMaskedWalletServiceRequest(this.f94892e, maskedWalletRequest));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo52484d() {
        return this.f95033j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo52485e() {
        return this.f95033j.f109911c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo52486f() {
        return (String) awiw.f94500c.mo58455c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo52487g() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo52488h() {
        int i;
        JSONObject jSONObject = this.f95034k;
        if (jSONObject != null) {
            i = awrt.m80805a(jSONObject);
        } else {
            i = 1;
        }
        int c = awrt.m80863c(this.f95034k, new awru());
        if (i == 2 || i == 3 || c > 0 || !((Boolean) awiw.f94501d.mo58455c()).booleanValue()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo52489i() {
        int i;
        if (this.f94894g != 6) {
            Account account = this.f94893f.f110418b.f110407b;
            Context context = this.f94888a;
            BuyFlowConfig buyFlowConfig = this.f94893f;
            bxvd da = bpih.f137746i.mo74144da();
            if (this.f94894g != 0) {
                i = 5;
            } else {
                i = 2;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpih bpih = (bpih) da.f164949b;
            bpih.f137749b = i - 1;
            int i2 = bpih.f137748a | 1;
            bpih.f137748a = i2;
            int i3 = this.f94894g;
            int i4 = i2 | 2;
            bpih.f137748a = i4;
            bpih.f137750c = i3;
            int i5 = this.f94896i;
            int i6 = i5 - 1;
            String str = null;
            if (i5 != 0) {
                int i7 = i4 | 4;
                bpih.f137748a = i7;
                bpih.f137751d = i6;
                String str2 = this.f94895h;
                if (str2 != null) {
                    str2.getClass();
                    i7 |= 8;
                    bpih.f137748a = i7;
                    bpih.f137752e = str2;
                }
                bpih.f137753f = 1;
                bpih.f137748a = i7 | 16;
                bwev b = awrt.m80857b(this.f95033j.f109911c);
                if (b != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpih bpih2 = (bpih) da.f164949b;
                    b.getClass();
                    bpih2.f137755h = b;
                    bpih2.f137748a |= 64;
                }
                String a = awjn.m80013a(this.f95033j.f109910b);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpih bpih3 = (bpih) da.f164949b;
                a.getClass();
                bpih3.f137748a |= 32;
                bpih3.f137754g = a;
                bpih bpih4 = (bpih) da.mo74062i();
                if (account != null) {
                    str = account.name;
                }
                LoadWebPaymentDataCallEvent.m93812a(context, buyFlowConfig, bpih4, str);
                return;
            }
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo52490j() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo52491k() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final awsk mo52492l() {
        this.f94889b.mo24605a(this.f94893f.f110419c);
        if (awxj.m81405c(this.f94892e)) {
            return null;
        }
        awrt.m80846a("loadWebPaymentData", "Should use Android Pay brand!");
        return mo52472a(10, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo52494n() {
        return 6;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final IbMerchantParameters mo52474a() {
        return new awrq().mo52513a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final JSONObject mo52480b(awru awru) {
        return awrt.m80840a(this.f95033j.f109911c, awru);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo52475a(Intent intent) {
        return (WebPaymentData) sef.m35067a(intent, "com.google.android.gms.wallet.WebPaymentData", WebPaymentData.CREATOR);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo52476a(awru awru) {
        return awrt.m80834a(this.f94892e, this.f95034k, awru);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52478a(IbBuyFlowInput ibBuyFlowInput, awru awru, Account account) {
        boolean z;
        ibBuyFlowInput.mo59996f(true);
        byal a = this.f94891d.mo52547a(this.f94893f.f110418b.f110406a, account, this.f94892e.getString("androidPackageName"));
        if (!ibBuyFlowInput.mo59997f() || !((Boolean) awie.f94411g.mo58455c()).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        if (!z && ibBuyFlowInput.mo59997f() && (a == null || a.f165286f)) {
            awwt awwt = this.f94890c;
            BuyFlowConfig buyFlowConfig = this.f94893f;
            rjr a2 = awwt.mo65547a(buyFlowConfig, buyFlowConfig.f110418b.f110407b, this.f94895h, ibBuyFlowInput.mo60001i());
            if (!a2.f43154a.mo17710c()) {
                Log.w("LoadWebPaymntDataAction", String.format(Locale.US, "Failed to check if device was unlocked for payment! status = %s message = %s", Integer.valueOf(a2.f43154a.f30115i), a2.f43154a.f30116j));
                ReportErrorChimeraIntentOperation.m94035a(this.f94893f, this.f94895h, 6, 8, 1052, this.f94888a);
            } else if (a2.f43155b) {
                z = false;
            }
            z = true;
        }
        ibBuyFlowInput.mo59999g(z);
        int c = awrt.m80863c(mo52480b(awru), awru);
        if ((chhy.m148751b() && c == 1) || (chhp.m148738b() && c == 2)) {
            ibBuyFlowInput.mo59989c(true);
        }
        WebPaymentDataRequest webPaymentDataRequest = this.f95033j;
        awrt.m80845a(webPaymentDataRequest, awru);
        if (awru.f94946a.isEmpty()) {
            bxvd bxvd = ibBuyFlowInput.f110341c;
            String str = webPaymentDataRequest.f109910b;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bwgv bwgv = (bwgv) bxvd.f164949b;
            bwgv bwgv2 = bwgv.f159275p;
            str.getClass();
            bwgv.f159277a |= 2;
            bwgv.f159279c = str;
            bxvd da = blwj.f127945d.mo74144da();
            long a3 = awrt.m80806a(webPaymentDataRequest.f109909a.f109776a, "totalPrice", awru);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blwj blwj = (blwj) da.f164949b;
            int i = blwj.f127947a | 1;
            blwj.f127947a = i;
            blwj.f127948b = a3;
            String str2 = webPaymentDataRequest.f109909a.f109777b;
            str2.getClass();
            blwj.f127947a = i | 2;
            blwj.f127949c = str2;
            blwj blwj2 = (blwj) da.mo74062i();
            blze blze = ibBuyFlowInput.f110340b;
            blzq blzq = ((blzf) blze.f164949b).f128346i;
            if (blzq == null) {
                blzq = blzq.f128364p;
            }
            bxvd bxvd2 = (bxvd) blzq.mo74142c(5);
            bxvd2.mo73625a((bxvk) blzq);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            blzq blzq2 = (blzq) bxvd2.f164949b;
            blwj2.getClass();
            blzq2.f128368c = blwj2;
            blzq2.f128366a |= 2;
            if (blze.f164950c) {
                blze.mo74035c();
                blze.f164950c = false;
            }
            blzf blzf = (blzf) blze.f164949b;
            blzq blzq3 = (blzq) bxvd2.mo74062i();
            bxvu bxvu = blzf.f128336h;
            blzq3.getClass();
            blzf.f128346i = blzq3;
            blzf.f128339a |= 32;
            JSONObject a4 = awrt.m80840a(webPaymentDataRequest.f109911c, awru);
            if (chgl.m148678b()) {
                blze blze2 = ibBuyFlowInput.f110340b;
                bwef b = IbBuyFlowInput.m94107b(a4, awru);
                if (blze2.f164950c) {
                    blze2.mo74035c();
                    blze2.f164950c = false;
                }
                blzf blzf2 = (blzf) blze2.f164949b;
                b.getClass();
                blzf2.f128347j = b;
                blzf2.f128339a |= 64;
            }
            if ((!chhy.m148751b() || awrt.m80863c(a4, awru) != 1) && (!chhp.m148738b() || awrt.m80863c(a4, awru) != 2)) {
                bxvd bxvd3 = ibBuyFlowInput.f110341c;
                String str3 = webPaymentDataRequest.f109911c;
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                bwgv bwgv3 = (bwgv) bxvd3.f164949b;
                str3.getClass();
                bwgv3.f159277a |= 4;
                bwgv3.f159280d = str3;
            } else {
                bwdx a5 = IbBuyFlowInput.m94102a(a4, awru);
                if (a5 == null) {
                    blze blze3 = ibBuyFlowInput.f110340b;
                    if (blze3.f164950c) {
                        blze3.mo74035c();
                        blze3.f164950c = false;
                    }
                    blzf blzf3 = (blzf) blze3.f164949b;
                    blzf3.f128344f = null;
                    blzf3.f128339a &= -17;
                } else {
                    blze blze4 = ibBuyFlowInput.f110340b;
                    if (blze4.f164950c) {
                        blze4.mo74035c();
                        blze4.f164950c = false;
                    }
                    blzf blzf4 = (blzf) blze4.f164949b;
                    a5.getClass();
                    blzf4.f128344f = a5;
                    blzf4.f128339a |= 16;
                }
                blze blze5 = ibBuyFlowInput.f110340b;
                blzq blzq4 = ((blzf) blze5.f164949b).f128346i;
                if (blzq4 == null) {
                    blzq4 = blzq.f128364p;
                }
                bxvd bxvd4 = (bxvd) blzq4.mo74142c(5);
                bxvd4.mo73625a((bxvk) blzq4);
                String str4 = webPaymentDataRequest.f109911c;
                if (bxvd4.f164950c) {
                    bxvd4.mo74035c();
                    bxvd4.f164950c = false;
                }
                blzq blzq5 = (blzq) bxvd4.f164949b;
                str4.getClass();
                blzq5.f128366a |= 2048;
                blzq5.f128379o = str4;
                if (blze5.f164950c) {
                    blze5.mo74035c();
                    blze5.f164950c = false;
                }
                blzf blzf5 = (blzf) blze5.f164949b;
                blzq blzq6 = (blzq) bxvd4.mo74062i();
                blzq6.getClass();
                blzf5.f128346i = blzq6;
                blzf5.f128339a |= 32;
            }
            ibBuyFlowInput.mo59977a(webPaymentDataRequest.f109912d);
        }
    }
}
