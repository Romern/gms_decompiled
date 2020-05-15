package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.cast.JGCastService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.CardRequirements;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import com.google.android.gms.wallet.ShippingAddressRequirements;
import com.google.android.gms.wallet.TransactionInfo;
import com.google.android.gms.wallet.analytics.events.LoadPaymentDataCallEvent;
import com.google.android.gms.wallet.intentoperation.p083ib.ReportErrorChimeraIntentOperation;
import com.google.android.gms.wallet.service.p086ib.IbBuyFlowInput;
import com.google.android.gms.wallet.service.p086ib.IbMerchantParameters;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: awsj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awsj extends awrb {

    /* renamed from: j */
    private final svq f95028j;

    /* renamed from: k */
    private final PaymentDataRequest f95029k;

    public awsj(Context context, awra awra, awua awua, rfz rfz, awwt awwt, awsm awsm, svq svq, awsz awsz, awta awta, Bundle bundle, PaymentDataRequest paymentDataRequest) {
        super(context, awra, rfz, awua, awwt, awsm, awsz, awta, bundle);
        this.f95028j = svq;
        this.f95029k = paymentDataRequest;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Account mo52471a(Account[] accountArr) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List mo52479b() {
        return this.f95029k.f109889f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo52481c() {
        return "loadPaymentData";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Intent mo52483d(awru awru) {
        throw new UnsupportedOperationException("Operation not supported!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo52484d() {
        return this.f95029k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo52485e() {
        return this.f95029k.f109893j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo52486f() {
        return (String) awie.f94402E.mo58455c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo52487g() {
        PaymentDataRequest paymentDataRequest = this.f95029k;
        return paymentDataRequest.f109893j == null ? paymentDataRequest.f109890g != null : ((Boolean) awih.f94443d.mo58455c()).booleanValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo52488h() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo52489i() {
        int i;
        if (this.f94893f == null) {
            this.f94893f = awrt.m80827a(this.f94892e, this.f94895h);
        }
        int i2 = this.f94896i;
        if (i2 != 1) {
            BuyFlowConfig buyFlowConfig = this.f94893f;
            String str = this.f94895h;
            int i3 = this.f94894g;
            int i4 = i2 - 1;
            if (i2 != 0) {
                ReportErrorChimeraIntentOperation.m94035a(buyFlowConfig, str, 7, i3, i4, this.f94888a);
            } else {
                throw null;
            }
        }
        if (this.f94894g != 6) {
            Context context = this.f94888a;
            BuyFlowConfig buyFlowConfig2 = this.f94893f;
            bxvd da = bpig.f137738g.mo74144da();
            if (this.f94894g != 0) {
                i = 5;
            } else {
                i = 2;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpig bpig = (bpig) da.f164949b;
            bpig.f137741b = i - 1;
            int i5 = 1 | bpig.f137740a;
            bpig.f137740a = i5;
            int i6 = this.f94894g;
            int i7 = i5 | 2;
            bpig.f137740a = i7;
            bpig.f137742c = i6;
            int i8 = this.f94896i;
            int i9 = i8 - 1;
            if (i8 != 0) {
                int i10 = i7 | 4;
                bpig.f137740a = i10;
                bpig.f137743d = i9;
                String str2 = this.f94895h;
                if (str2 != null) {
                    str2.getClass();
                    bpig.f137740a = i10 | 8;
                    bpig.f137744e = str2;
                }
                PaymentDataRequest paymentDataRequest = this.f95029k;
                if (paymentDataRequest != null) {
                    bwev a = awrt.m80815a(paymentDataRequest.f109890g);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpig bpig2 = (bpig) da.f164949b;
                    a.getClass();
                    bpig2.f137745f = a;
                    bpig2.f137740a |= 16;
                }
                LoadPaymentDataCallEvent.m93811a(context, buyFlowConfig2, (bpig) da.mo74062i());
                return;
            }
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo52490j() {
        if (((Boolean) awjl.f94544f.mo58455c()).booleanValue()) {
            return true;
        }
        PaymentDataRequest paymentDataRequest = this.f95029k;
        return paymentDataRequest.f109892i || paymentDataRequest.f109890g == null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo52491k() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final awsk mo52492l() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo52494n() {
        return 7;
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
    /* renamed from: a */
    public final awsk mo52473a(IbBuyFlowInput ibBuyFlowInput) {
        if (awrt.m80854a(this.f95028j, this.f94889b)) {
            Context context = this.f94888a;
            BuyFlowConfig buyFlowConfig = this.f94893f;
            String e = mo52485e();
            bxvd da = bwes.f159024c.mo74144da();
            bwgu bwgu = ((bwgv) ibBuyFlowInput.f110341c.f164949b).f159278b;
            if (bwgu == null) {
                bwgu = bwgu.f159265i;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwes bwes = (bwes) da.f164949b;
            bwgu.getClass();
            bwes.f159027b = bwgu;
            bwes.f159026a |= 1;
            byte[] k = ((bwes) da.mo74062i()).serializeToBytes();
            sdo.checkIfNull(buyFlowConfig, "buyFlowConfig is required");
            sdo.m34969a(e, (Object) "paymentDataRequestJson is required");
            sdo.checkIfNull(k, "additionalClientParameterToken is required");
            sdo.m34969a(buyFlowConfig.f110419c, (Object) "A calling package is required");
            Bundle bundle = new Bundle();
            bundle.putString("paymentDataRequestJson", e);
            bundle.putByteArray("additionalClientParameterToken", k);
            bundle.putString("callingPackageName", buyFlowConfig.f110419c);
            ApplicationParameters applicationParameters = buyFlowConfig.f110418b;
            if (applicationParameters != null) {
                bundle.putInt("environmentFlag", applicationParameters.f110406a);
            }
            Intent intent = new Intent();
            intent.setPackage("com.google.android.gms");
            intent.setClassName("com.google.android.gms", "com.google.android.gms.wallet.ib.PaisaCompatActivity");
            intent.putExtra("transformedExtras", awsp.m80970a(bundle));
            return new awsk(Bundle.EMPTY, null, new Status(6, "BuyFlow UI needs to be shown.", spn.m35844a(context, intent, (int) JGCastService.FLAG_PRIVATE_DISPLAY)));
        }
        Log.e("LoadPaymentDataAction", "Paisa is not installed, buyflow cannot proceed");
        return mo52472a(412, 1076);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final JSONObject mo52480b(awru awru) {
        return awrt.m80841a("requestJson", this.f95029k.f109893j, 1084, awru);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo52482c(awru awru) {
        return awrt.m80848a(this.f95029k, awru);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final IbMerchantParameters mo52474a() {
        awrq awrq = new awrq();
        awrq.f94931c = this.f95029k.f109884a;
        return awrq.mo52513a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo52475a(Intent intent) {
        return (PaymentData) sef.m35067a(intent, "com.google.android.gms.wallet.PaymentData", PaymentData.CREATOR);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo52476a(awru awru) {
        return awrt.m80833a(this.f94892e, awru);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52477a(bxvd bxvd) {
        boolean a = awrt.m80853a(this.f95028j);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwgu bwgu = (bwgu) bxvd.f164949b;
        bwgu bwgu2 = bwgu.f159265i;
        bwgu.f159267a |= 8;
        bwgu.f159274h = a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{org.json.JSONObject.put(java.lang.String, boolean):org.json.JSONObject throws org.json.JSONException}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{org.json.JSONObject.put(java.lang.String, double):org.json.JSONObject throws org.json.JSONException}
      ClspMth{org.json.JSONObject.put(java.lang.String, long):org.json.JSONObject throws org.json.JSONException}
      ClspMth{org.json.JSONObject.put(java.lang.String, int):org.json.JSONObject throws org.json.JSONException}
      ClspMth{org.json.JSONObject.put(java.lang.String, java.lang.Object):org.json.JSONObject throws org.json.JSONException}
      ClspMth{org.json.JSONObject.put(java.lang.String, boolean):org.json.JSONObject throws org.json.JSONException} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52478a(IbBuyFlowInput ibBuyFlowInput, awru awru, Account account) {
        ShippingAddressRequirements shippingAddressRequirements;
        boolean z;
        JSONObject jSONObject;
        IbBuyFlowInput ibBuyFlowInput2 = ibBuyFlowInput;
        awru awru2 = awru;
        ibBuyFlowInput2.mo59989c(true);
        PaymentDataRequest paymentDataRequest = this.f95029k;
        String str = paymentDataRequest.f109893j;
        if (str != null) {
            ibBuyFlowInput2.f110340b = ibBuyFlowInput2.mo59975a(awrt.m80841a("PaymentDataRequest", str, 1071, awru2), paymentDataRequest.f109893j, awru2);
        } else {
            if (chhy.f188634a.mo6606a().mo85246a()) {
                if (paymentDataRequest.f109893j == null) {
                    z = true;
                } else {
                    z = false;
                }
                sdo.m34971a(z, (Object) "PaymentRequest is already in JSON.");
                JSONObject jSONObject2 = new JSONObject();
                try {
                    JSONObject put = jSONObject2.put("apiVersion", 1).put("emailRequired", paymentDataRequest.f109884a).put("phoneNumberRequired", paymentDataRequest.f109885b);
                    CardRequirements cardRequirements = paymentDataRequest.f109886c;
                    JSONObject put2 = new JSONObject().put("allowPrepaidCards", cardRequirements.f109773b).put("billingAddressRequired", cardRequirements.f109774c);
                    if (cardRequirements.f109774c) {
                        put2.put("billingAddressFormat", awrt.m80865c(cardRequirements.f109775d, awru2));
                    }
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = cardRequirements.f109772a.iterator();
                    while (it.hasNext()) {
                        String c = awrt.m80864c(((Integer) it.next()).intValue());
                        if (c != null) {
                            jSONArray.put(c);
                        }
                    }
                    put2.put("allowedCardNetworks", jSONArray);
                    JSONObject put3 = put.put("cardRequirements", put2).put("shippingAddressRequired", paymentDataRequest.f109887d);
                    ArrayList<Integer> arrayList = paymentDataRequest.f109889f;
                    JSONArray jSONArray2 = new JSONArray();
                    for (Integer num : arrayList) {
                        jSONArray2.put(awrt.m80858b(num.intValue(), awru2));
                    }
                    JSONObject put4 = put3.put("allowedPaymentMethods", jSONArray2);
                    PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = paymentDataRequest.f109890g;
                    JSONObject put5 = new JSONObject().put("tokenizationType", awrt.m80831a(paymentMethodTokenizationParameters.f109897a, awru2));
                    Bundle a = paymentMethodTokenizationParameters.mo59770a();
                    ArrayList arrayList2 = new ArrayList(a.keySet());
                    Collections.sort(arrayList2);
                    JSONObject jSONObject3 = new JSONObject();
                    for (int i = 0; i < arrayList2.size(); i++) {
                        String str2 = (String) arrayList2.get(i);
                        jSONObject3.put(awjn.m80013a(str2), awjn.m80013a(a.getString(str2)));
                    }
                    put5.put("parameters", jSONObject3);
                    JSONObject put6 = put4.put("paymentMethodTokenizationParameters", put5);
                    TransactionInfo transactionInfo = paymentDataRequest.f109891h;
                    String d = awrt.m80869d(transactionInfo.f109904a, awru2);
                    JSONObject put7 = new JSONObject().put("totalPriceStatus", d).put("currencyCode", transactionInfo.f109906c);
                    if (!"NOT_CURRENTLY_KNOWN".equals(d)) {
                        awrt.m80806a(transactionInfo.f109905b, "transactionInfo.totalPrice", awru2);
                        put7.put("totalPrice", transactionInfo.f109905b);
                    }
                    put6.put("transactionInfo", put7).put("uiRequired", paymentDataRequest.f109892i).put("i", new JSONObject().put("convertedFromNative", true));
                    if (paymentDataRequest.f109887d) {
                        ShippingAddressRequirements shippingAddressRequirements2 = paymentDataRequest.f109888e;
                        if (shippingAddressRequirements2 != null) {
                            if (shippingAddressRequirements2.f109903a != null) {
                                JSONArray jSONArray3 = new JSONArray();
                                Iterator it2 = shippingAddressRequirements2.f109903a.iterator();
                                while (it2.hasNext()) {
                                    jSONArray3.put((String) it2.next());
                                }
                                jSONObject = new JSONObject().put("allowedCountryCodes", jSONArray3);
                            } else {
                                jSONObject = new JSONObject();
                            }
                            jSONObject2.put("shippingAddressRequirements", jSONObject);
                        }
                    }
                    ibBuyFlowInput2.f110340b = ibBuyFlowInput2.mo59975a(jSONObject2, jSONObject2.toString(), awru2);
                    ibBuyFlowInput2.mo59982a(paymentDataRequest);
                } catch (JSONException e) {
                    throw new RuntimeException("Failed to translate cardRequirements to JSON", e);
                } catch (JSONException e2) {
                    throw new RuntimeException("Failed to translate paymentTokenizationParameters to JSON", e2);
                } catch (JSONException e3) {
                    throw new RuntimeException("Failed to translate transactionInfo to JSON", e3);
                } catch (JSONException e4) {
                    throw new RuntimeException("Failed to translate shippingAddressRequirements to JSON", e4);
                } catch (JSONException e5) {
                    throw new RuntimeException("Failed to translate request to JSON", e5);
                }
            } else {
                ibBuyFlowInput2.mo59982a(paymentDataRequest);
                ibBuyFlowInput2.mo59983a(paymentDataRequest.f109885b);
                blzq blzq = ((blzf) ibBuyFlowInput2.f110340b.f164949b).f128346i;
                if (blzq == null) {
                    blzq = blzq.f128364p;
                }
                bxvd bxvd = (bxvd) blzq.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) blzq);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                blzq blzq2 = (blzq) bxvd.f164949b;
                blzq2.f128378n = 1;
                int i2 = blzq2.f128366a | 1024;
                blzq2.f128366a = i2;
                CardRequirements cardRequirements2 = paymentDataRequest.f109886c;
                if (cardRequirements2.f109774c) {
                    int i3 = cardRequirements2.f109775d;
                    if (i3 == 0) {
                        blzq2.f128378n = 2;
                    } else if (i3 != 1) {
                        awru2.mo52515a(String.format(Locale.US, "Billing address was requested but found invalid BillingAddressFormat: %d", Integer.valueOf(paymentDataRequest.f109886c.f109775d)), 1058);
                    } else {
                        blzq2.f128378n = 3;
                    }
                    blzq2.f128366a = i2 | 1024;
                }
                blze blze = ibBuyFlowInput2.f110340b;
                if (blze.f164950c) {
                    blze.mo74035c();
                    blze.f164950c = false;
                }
                bxvu bxvu = blzf.f128336h;
                ((blzf) blze.f164949b).f128345g = GeneratedMessageLite.m124028dc();
                CardRequirements cardRequirements3 = paymentDataRequest.f109886c;
                blze.mo66774a(Arrays.asList(IbBuyFlowInput.m94106a(cardRequirements3.f109773b, true, cardRequirements3.f109772a, ibBuyFlowInput.mo60006n())));
                blze blze2 = ibBuyFlowInput2.f110340b;
                ArrayList arrayList3 = paymentDataRequest.f109889f;
                ArrayList arrayList4 = new ArrayList();
                if (arrayList3 == null || arrayList3.isEmpty()) {
                    awru2.mo52515a("At least one PaymentMethod must be specified.", 1059);
                } else {
                    if (arrayList3.contains(1)) {
                        arrayList4.add(blzp.PAYMENT_METHOD_CARD);
                    }
                    if (arrayList3.contains(2)) {
                        arrayList4.add(blzp.PAYMENT_METHOD_TOKENIZED_CARD);
                    }
                    if (arrayList4.size() != arrayList3.size()) {
                        awru2.mo52515a(String.format(Locale.US, "Duplicate or invalid PaymentMethods supplied: %s", arrayList3), 1057);
                    }
                }
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                blzq blzq3 = (blzq) bxvd.f164949b;
                if (!blzq3.f128377l.mo73666a()) {
                    blzq3.f128377l = GeneratedMessageLite.m124019a(blzq3.f128377l);
                }
                int size = arrayList4.size();
                for (int i4 = 0; i4 < size; i4++) {
                    blzq3.f128377l.mo74153d(((blzp) arrayList4.get(i4)).f128362d);
                }
                if (blze2.f164950c) {
                    blze2.mo74035c();
                    blze2.f164950c = false;
                }
                blzf blzf = (blzf) blze2.f164949b;
                blzq blzq4 = (blzq) bxvd.mo74062i();
                blzq4.getClass();
                blzf.f128346i = blzq4;
                blzf.f128339a |= 32;
                ibBuyFlowInput2.mo59987b(paymentDataRequest.f109887d);
                bwdx a2 = IbBuyFlowInput.m94101a((!paymentDataRequest.f109887d || (shippingAddressRequirements = paymentDataRequest.f109888e) == null) ? null : shippingAddressRequirements.f109903a);
                if (a2 == null) {
                    blze blze3 = ibBuyFlowInput2.f110340b;
                    if (blze3.f164950c) {
                        blze3.mo74035c();
                        blze3.f164950c = false;
                    }
                    blzf blzf2 = (blzf) blze3.f164949b;
                    blzf2.f128344f = null;
                    blzf2.f128339a &= -17;
                } else {
                    blze blze4 = ibBuyFlowInput2.f110340b;
                    if (blze4.f164950c) {
                        blze4.mo74035c();
                        blze4.f164950c = false;
                    }
                    blzf blzf3 = (blzf) blze4.f164949b;
                    a2.getClass();
                    blzf3.f128344f = a2;
                    blzf3.f128339a |= 16;
                }
                if (paymentDataRequest.f109891h != null) {
                    bxvd da = blwj.f127945d.mo74144da();
                    TransactionInfo transactionInfo2 = paymentDataRequest.f109891h;
                    if (transactionInfo2.f109904a != 1) {
                        long a3 = awrt.m80806a(transactionInfo2.f109905b, "transactionInfo.totalPrice", awru2);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        blwj blwj = (blwj) da.f164949b;
                        blwj.f127947a = 1 | blwj.f127947a;
                        blwj.f127948b = a3;
                    }
                    String str3 = paymentDataRequest.f109891h.f109906c;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    blwj blwj2 = (blwj) da.f164949b;
                    str3.getClass();
                    blwj2.f127947a |= 2;
                    blwj2.f127949c = str3;
                    blze blze5 = ibBuyFlowInput2.f110340b;
                    blzq blzq5 = ((blzf) blze5.f164949b).f128346i;
                    if (blzq5 == null) {
                        blzq5 = blzq.f128364p;
                    }
                    bxvd bxvd2 = (bxvd) blzq5.mo74142c(5);
                    bxvd2.mo73625a((GeneratedMessageLite) blzq5);
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    blzq blzq6 = (blzq) bxvd2.f164949b;
                    blwj blwj3 = (blwj) da.mo74062i();
                    blwj3.getClass();
                    blzq6.f128368c = blwj3;
                    blzq6.f128366a |= 2;
                    if (blze5.f164950c) {
                        blze5.mo74035c();
                        blze5.f164950c = false;
                    }
                    blzf blzf4 = (blzf) blze5.f164949b;
                    blzq blzq7 = (blzq) bxvd2.mo74062i();
                    blzq7.getClass();
                    blzf4.f128346i = blzq7;
                    blzf4.f128339a |= 32;
                }
            }
        }
        ibBuyFlowInput2.mo59977a(paymentDataRequest.f109894k);
    }
}
