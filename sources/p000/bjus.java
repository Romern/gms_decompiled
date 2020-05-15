package p000;

import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.GetActiveAccountResponse;
import com.google.android.gms.tapandpay.firstparty.GetActiveCardsForAccountResponse;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialRequest;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse;
import com.google.android.gms.tapandpay.firstparty.TokenReference;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bjus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjus extends bjux {

    /* renamed from: b */
    private final bjux f123367b;

    public bjus(bjux bjux) {
        super(null);
        this.f123367b = bjux;
    }

    /* renamed from: a */
    private static final JSONObject m104645a(bjur bjur) {
        String valueOf = String.valueOf(m104647e());
        String valueOf2 = String.valueOf(bjur.mo65551a());
        try {
            return new JSONObject(new String(srz.m36174a(new File(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2))), "UTF-8")).getJSONObject("result");
        } catch (IOException | JSONException e) {
            throw new RuntimeException("Error reading replay result", e);
        }
    }

    /* renamed from: e */
    private static final String m104647e() {
        String valueOf = String.valueOf(Environment.getExternalStorageDirectory());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append(valueOf);
        sb.append("/wallet_uitests/ow-tp2-responses/");
        return sb.toString();
    }

    /* renamed from: f */
    private static final boolean m104648f() {
        return new File(m104647e()).exists();
    }

    /* renamed from: b */
    public final Status mo65556b() {
        bjur bjur = new bjur("reportInAppTransactionCompleted", new String[0]);
        if (m104648f()) {
            return bjuw.m104661a(m104645a(bjur));
        }
        Status b = this.f123367b.mo65556b();
        m104646a(bjur, bjuw.m104662a(b));
        return b;
    }

    /* renamed from: c */
    public final Status mo65557c() {
        bjur bjur = new bjur("reportInAppManualUnlock", new String[0]);
        if (m104648f()) {
            return Status.f30107a;
        }
        Status c = this.f123367b.mo65557c();
        m104646a(bjur, bjuw.m104662a(c));
        return c;
    }

    /* renamed from: d */
    public final bjut mo65558d() {
        bjut bjut;
        bjur bjur = new bjur("getActiveAccount", new String[0]);
        JSONObject jSONObject = null;
        AccountInfo accountInfo = null;
        GetActiveAccountResponse getActiveAccountResponse = null;
        JSONObject jSONObject2 = null;
        if (m104648f()) {
            JSONObject a = m104645a(bjur);
            try {
                Status a2 = bjuw.m104661a(a.getJSONObject("status"));
                JSONObject a3 = bjuw.m104663a(a, "response");
                if (a3 != null) {
                    JSONObject a4 = bjuw.m104663a(a3, "accountInfo");
                    if (a4 != null) {
                        accountInfo = new AccountInfo(bjuw.m104668b(a4, "accountId"), bjuw.m104668b(a4, "accountName"));
                    }
                    getActiveAccountResponse = new GetActiveAccountResponse(accountInfo);
                }
                bjut = new bjut(a2, getActiveAccountResponse);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } else {
            bjut = this.f123367b.mo65558d();
            try {
                JSONObject jSONObject3 = new JSONObject();
                bjuw.m104666a(jSONObject3, "status", bjuw.m104662a(bjut.f123368a));
                GetActiveAccountResponse getActiveAccountResponse2 = bjut.f123369b;
                if (getActiveAccountResponse2 != null) {
                    JSONObject jSONObject4 = new JSONObject();
                    AccountInfo accountInfo2 = getActiveAccountResponse2.f108366a;
                    if (accountInfo2 != null) {
                        jSONObject2 = new JSONObject();
                        bjuw.m104665a(jSONObject2, "accountId", accountInfo2.f108325a);
                        bjuw.m104665a(jSONObject2, "accountName", accountInfo2.f108326b);
                    }
                    bjuw.m104666a(jSONObject4, "accountInfo", jSONObject2);
                    jSONObject = jSONObject4;
                }
                bjuw.m104666a(jSONObject3, "response", jSONObject);
                m104646a(bjur, jSONObject3);
            } catch (JSONException e2) {
                throw new RuntimeException(e2);
            }
        }
        return bjut;
    }

    /* renamed from: a */
    private static final void m104646a(bjur bjur, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("apiName", bjur.f123365a);
            jSONObject2.put("parts", new JSONArray((Collection) bjur.f123366b));
            jSONObject2.put("result", jSONObject);
            String jSONObject3 = jSONObject2.toString(2);
            String valueOf = String.valueOf(Environment.getExternalStorageDirectory());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append(valueOf);
            sb.append("/wallet_uitests/ow-tp2-capture/");
            File file = new File(sb.toString());
            if (!file.exists()) {
                file.mkdirs();
            }
            try {
                PrintWriter printWriter = new PrintWriter(new File(file, bjur.mo65551a()), "UTF-8");
                try {
                    printWriter.write(jSONObject3);
                } finally {
                    printWriter.close();
                }
            } catch (FileNotFoundException | UnsupportedEncodingException e) {
                throw new RuntimeException("Error saving recording", e);
            }
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    public final asmi mo65552a(String str) {
        asmi asmi;
        JSONObject jSONObject;
        asmi asmi2;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        GetActiveCardsForAccountResponse getActiveCardsForAccountResponse;
        CardInfo[] cardInfoArr;
        String str2 = str;
        int i = 0;
        bjur bjur = new bjur("getActiveCardsForAccount", str2);
        if (m104648f()) {
            JSONObject a = m104645a(bjur);
            try {
                Status a2 = bjuw.m104661a(a.getJSONObject("status"));
                JSONObject a3 = bjuw.m104663a(a, "response");
                if (a3 != null) {
                    if (a3.has("cardInfos")) {
                        JSONArray jSONArray = a3.getJSONArray("cardInfos");
                        cardInfoArr = new CardInfo[jSONArray.length()];
                        while (i < jSONArray.length()) {
                            cardInfoArr[i] = bjuw.m104667b(jSONArray.getJSONObject(i));
                            i++;
                        }
                    } else {
                        cardInfoArr = null;
                    }
                    getActiveCardsForAccountResponse = new GetActiveCardsForAccountResponse(cardInfoArr);
                } else {
                    getActiveCardsForAccountResponse = null;
                }
                return new bjuu(a2, getActiveCardsForAccountResponse);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } else {
            asmi a4 = this.f123367b.mo65552a(str2);
            try {
                JSONObject jSONObject5 = new JSONObject();
                bjuw.m104666a(jSONObject5, "status", bjuw.m104662a(a4.mo7183bo()));
                GetActiveCardsForAccountResponse b = a4.mo49240b();
                if (b != null) {
                    JSONObject jSONObject6 = new JSONObject();
                    if (b.f108367a != null) {
                        ArrayList arrayList = new ArrayList();
                        CardInfo[] cardInfoArr2 = b.f108367a;
                        int length = cardInfoArr2.length;
                        while (i < length) {
                            CardInfo cardInfo = cardInfoArr2[i];
                            if (cardInfo != null) {
                                jSONObject2 = new JSONObject();
                                bjuw.m104665a(jSONObject2, "billingCardId", cardInfo.f108340a);
                                jSONObject2.put("cardNetwork", cardInfo.f108344e);
                                Uri uri = cardInfo.f108347h;
                                if (uri != null) {
                                    bjuw.m104665a(jSONObject2, "cardImageUrl", uri.toString());
                                }
                                TokenStatus tokenStatus = cardInfo.f108345f;
                                if (tokenStatus != null) {
                                    jSONObject3 = new JSONObject();
                                    asmi2 = a4;
                                    jSONObject3.put("isSelected", tokenStatus.f108460c);
                                    jSONObject3.put("tokenState", tokenStatus.f108459b);
                                    TokenReference tokenReference = tokenStatus.f108458a;
                                    if (tokenReference != null) {
                                        jSONObject4 = new JSONObject();
                                        jSONObject4.put("tokenProvider", tokenReference.f108457b);
                                    } else {
                                        jSONObject4 = null;
                                    }
                                    bjuw.m104666a(jSONObject3, "tokenReference", jSONObject4);
                                } else {
                                    asmi2 = a4;
                                    jSONObject3 = null;
                                }
                                bjuw.m104666a(jSONObject2, "tokenStatus", jSONObject3);
                            } else {
                                asmi2 = a4;
                                jSONObject2 = null;
                            }
                            arrayList.add(jSONObject2);
                            i++;
                            a4 = asmi2;
                        }
                        jSONObject6.put("cardInfos", new JSONArray((Collection) arrayList));
                        asmi = a4;
                    } else {
                        asmi = a4;
                    }
                    jSONObject = jSONObject6;
                } else {
                    asmi = a4;
                    jSONObject = null;
                }
                bjuw.m104666a(jSONObject5, "response", jSONObject);
                m104646a(bjur, jSONObject5);
                return asmi;
            } catch (JSONException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* renamed from: a */
    public final asmk mo65553a(RetrieveInAppPaymentCredentialRequest retrieveInAppPaymentCredentialRequest) {
        bjur bjur = new bjur("retrieveInAppPaymentCredential", retrieveInAppPaymentCredentialRequest.f108420a, retrieveInAppPaymentCredentialRequest.f108421b);
        JSONObject jSONObject = null;
        RetrieveInAppPaymentCredentialResponse retrieveInAppPaymentCredentialResponse = null;
        if (m104648f()) {
            JSONObject a = m104645a(bjur);
            try {
                Status a2 = bjuw.m104661a(a.getJSONObject("status"));
                JSONObject a3 = bjuw.m104663a(a, "response");
                if (a3 != null) {
                    if (a3.has("cardInfos")) {
                        JSONArray jSONArray = a3.getJSONArray("cardInfos");
                        CardInfo[] cardInfoArr = new CardInfo[jSONArray.length()];
                        for (int i = 0; i < jSONArray.length(); i++) {
                            cardInfoArr[i] = bjuw.m104667b(jSONArray.getJSONObject(i));
                        }
                    }
                    retrieveInAppPaymentCredentialResponse = new RetrieveInAppPaymentCredentialResponse(bjuw.m104668b(a3, "tokenPan"), Base64.decode(bjuw.m104668b(a3, "transactionCryptogram"), 2), a3.getInt("expirationMonth"), a3.getInt("expirationYear"), bjuw.m104668b(a3, "eciIndicator"));
                }
                return new bjuv(a2, retrieveInAppPaymentCredentialResponse);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } else {
            asmk a4 = this.f123367b.mo65553a(retrieveInAppPaymentCredentialRequest);
            try {
                JSONObject jSONObject2 = new JSONObject();
                bjuw.m104666a(jSONObject2, "status", bjuw.m104662a(a4.mo7183bo()));
                RetrieveInAppPaymentCredentialResponse b = a4.mo49242b();
                if (b != null) {
                    jSONObject = new JSONObject();
                    bjuw.m104665a(jSONObject, "tokenPan", b.f108425a);
                    bjuw.m104665a(jSONObject, "transactionCryptogram", Base64.encodeToString(b.f108426b, 2));
                    jSONObject.put("expirationMonth", b.f108427c);
                    jSONObject.put("expirationYear", b.f108428d);
                    bjuw.m104665a(jSONObject, "eciIndicator", b.f108429e);
                }
                bjuw.m104666a(jSONObject2, "response", jSONObject);
                m104646a(bjur, jSONObject2);
                return a4;
            } catch (JSONException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* renamed from: a */
    public final rjr mo65554a() {
        bjur bjur = new bjur("isServiceLayerEnabled", new String[0]);
        if (m104648f()) {
            return bjuw.m104669c(m104645a(bjur));
        }
        rjr a = this.f123367b.mo65554a();
        m104646a(bjur, bjuw.m104664a(a));
        return a;
    }

    /* renamed from: a */
    public final rjr mo65555a(String str, String str2) {
        bjur bjur = new bjur("isDeviceUnlockedForPayment", new String[0]);
        if (m104648f()) {
            return bjuw.m104669c(m104645a(bjur));
        }
        rjr a = this.f123367b.mo65555a(str, str2);
        m104646a(bjur, bjuw.m104664a(a));
        return a;
    }
}
