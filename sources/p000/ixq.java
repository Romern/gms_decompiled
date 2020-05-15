package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.felicanetworks.mfc.FelicaException;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.account.p016be.FinishBootstrapIntentOperation;
import com.google.android.gms.auth.account.p016be.legacy.GoogleAccountDataChimeraService;
import com.google.android.gms.auth.firstparty.dataservice.AccountNameCheckRequest;
import com.google.android.gms.auth.firstparty.dataservice.AccountNameCheckResponse;
import com.google.android.gms.auth.firstparty.dataservice.AccountRemovalRequest;
import com.google.android.gms.auth.firstparty.dataservice.AccountRemovalResponse;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceRequest;
import com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceResponse;
import com.google.android.gms.auth.firstparty.dataservice.CheckRealNameRequest;
import com.google.android.gms.auth.firstparty.dataservice.CheckRealNameResponse;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenResponse;
import com.google.android.gms.auth.firstparty.dataservice.ConfirmCredentialsRequest;
import com.google.android.gms.auth.firstparty.dataservice.DeviceManagementInfoResponse;
import com.google.android.gms.auth.firstparty.dataservice.GetAndAdvanceOtpCounterResponse;
import com.google.android.gms.auth.firstparty.dataservice.GoogleAccountData;
import com.google.android.gms.auth.firstparty.dataservice.GoogleAccountSetupRequest;
import com.google.android.gms.auth.firstparty.dataservice.GplusInfoRequest;
import com.google.android.gms.auth.firstparty.dataservice.GplusInfoResponse;
import com.google.android.gms.auth.firstparty.dataservice.OtpRequest;
import com.google.android.gms.auth.firstparty.dataservice.OtpResponse;
import com.google.android.gms.auth.firstparty.dataservice.PasswordCheckRequest;
import com.google.android.gms.auth.firstparty.dataservice.PasswordCheckResponse;
import com.google.android.gms.auth.firstparty.dataservice.ReauthSettingsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ReauthSettingsResponse;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.dataservice.UpdateCredentialsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ValidateAccountCredentialsResponse;
import com.google.android.gms.auth.firstparty.dataservice.VerifyPinRequest;
import com.google.android.gms.auth.firstparty.dataservice.VerifyPinResponse;
import com.google.android.gms.auth.firstparty.dataservice.WebSetupConfigRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* renamed from: ixq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ixq extends dck implements ixr {

    /* renamed from: a */
    private final ilw f21928a;

    /* renamed from: b */
    private final gls f21929b;

    public ixq() {
        super("com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService");
    }

    /* renamed from: a */
    private static RemoteException m16295a(Throwable th) {
        GoogleAccountDataChimeraService.f10009a.mo25410a(th);
        return new RemoteException(th.getMessage());
    }

    /* renamed from: b */
    public final DeviceManagementInfoResponse mo13446b(Account account) {
        try {
            this.f21928a.mo13127a(Binder.getCallingUid());
            return this.f21929b.mo12035c(account);
        } catch (Exception e) {
            throw m16295a(e);
        }
    }

    /* renamed from: c */
    public final String mo13448c(String str) {
        try {
            this.f21928a.mo13127a(Binder.getCallingUid());
            return this.f21929b.mo12034b(str);
        } catch (Exception e) {
            throw m16295a(e);
        }
    }

    /* renamed from: d */
    public final void mo13450d() {
        try {
            this.f21928a.mo13127a(Binder.getCallingUid());
            glh a = glh.m13369a(this.f21929b.f18573d.f21306a);
            if (a.mo12012c()) {
                a.mo12007a((imd) null);
            }
        } catch (Exception e) {
            throw m16295a(e);
        }
    }

    /* renamed from: a */
    public final Bundle mo13436a(String str) {
        try {
            this.f21928a.mo13127a(Binder.getCallingUid());
            return this.f21929b.mo12024a(str);
        } catch (Exception e) {
            throw m16295a(e);
        }
    }

    public ixq(ilw ilw, gls gls) {
        super("com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService");
        this.f21928a = ilw;
        this.f21929b = gls;
    }

    /* renamed from: b */
    public final GetAndAdvanceOtpCounterResponse mo13447b(String str) {
        Long l;
        try {
            this.f21928a.mo13127a(Binder.getCallingUid());
            gls gls = this.f21929b;
            grv a = gls.f18579j.mo12135a(str);
            if (a == null) {
                gls.f18570a.mo25418e("Could not get secret for account: %s.", sek.m35081a(str));
                l = null;
            } else {
                Long a2 = gls.f18575f.mo12136a(a);
                if (a2 == null) {
                    gls.f18570a.mo25418e("Could not get counter for account: %s.", sek.m35081a(str));
                }
                l = a2;
            }
            return new GetAndAdvanceOtpCounterResponse(1, l);
        } catch (Exception e) {
            throw m16295a(e);
        }
    }

    /* renamed from: c */
    public final void mo13449c() {
        try {
            this.f21928a.mo13127a(Binder.getCallingUid());
            SharedPreferences.Editor edit = new rtj(glh.m13369a(this.f21929b.f18573d.f21306a).f18463b, "frp_preferences_storage", true, true).edit();
            edit.putBoolean("persistent_device_owner_restored", true);
            edit.commit();
        } catch (Exception e) {
            throw m16295a(e);
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:35:0x00b6=Splitter:B:35:0x00b6, B:22:0x0079=Splitter:B:22:0x0079} */
    /* renamed from: a */
    public final CheckFactoryResetPolicyComplianceResponse mo13437a(CheckFactoryResetPolicyComplianceRequest checkFactoryResetPolicyComplianceRequest) {
        try {
            this.f21928a.mo13127a(Binder.getCallingUid());
            gls gls = this.f21929b;
            glh a = glh.m13369a(gls.f18573d.f21306a);
            if (!a.mo12009a()) {
                return CheckFactoryResetPolicyComplianceResponse.m6564a(1);
            }
            String str = checkFactoryResetPolicyComplianceRequest.f10598b;
            if (!a.mo12009a()) {
                glh.f18461a.mo25416d("Factory reset protection is not supported!", new Object[0]);
            } else if (TextUtils.isEmpty(str)) {
                glh.f18461a.mo25414c("Check failed; accountId is null or empty!", new Object[0]);
            } else {
                glh.f18461a.mo25414c(String.format("Checking account: %s.", str), new Object[0]);
                synchronized (a.f18465d) {
                    imc b = a.f18464c.mo12018b();
                    if (b == null || b.f21344b.size() <= 0) {
                        glh.f18461a.mo25416d("Invalid DataBlockContainer! But letting it pass... [%s]", b != null ? "profiles are empty" : "container is null");
                    } else {
                        for (C1082ime ime : b.f21344b) {
                            if (glh.m13370a(ime, str)) {
                                glh.f18461a.mo25414c("Check passed for %s", str);
                            }
                        }
                        glh.f18461a.mo25416d("Check failed! Account %s wasn't installed on any profile!", str);
                    }
                    gls.f18570a.mo25416d("FRP passed local check!", new Object[0]);
                    bxvd da = bzxd.f171731c.mo74144da();
                    String str2 = checkFactoryResetPolicyComplianceRequest.f10598b;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bzxd bzxd = (bzxd) da.f164949b;
                    str2.getClass();
                    bzxd.f171733a |= 1;
                    bzxd.f171734b = str2;
                    bzxd bzxd2 = (bzxd) da.mo74062i();
                    bxvd da2 = bzxe.f171735d.mo74144da();
                    glq glq = gls.f18583n;
                    String a2 = glq.m13398a(gls.f18573d.f21306a, "factoryRestProtection", (String) null);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bzxe bzxe = (bzxe) da2.f164949b;
                    a2.getClass();
                    int i = bzxe.f171737a | 1;
                    bzxe.f171737a = i;
                    bzxe.f171738b = a2;
                    if ((i & 1) == 0) {
                        "".getClass();
                        bzxe.f171737a = i | 1;
                        bzxe.f171738b = "";
                        gls.f18570a.mo25416d("Droidguard results are null!", new Object[0]);
                    }
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bzxe bzxe2 = (bzxe) da2.f164949b;
                    bzxd2.getClass();
                    bzxe2.f171739c = bzxd2;
                    bzxe2.f171737a |= 2;
                    ByteArrayEntity byteArrayEntity = new ByteArrayEntity(((bzxe) da2.mo74062i()).mo73642k());
                    byteArrayEntity.setContentType("application/octet-stream");
                    try {
                        bzxh bzxh = (bzxh) bxvk.m124016a(bzxh.f171749b, gmv.m13466a(gmv.m13464a((String) gnv.f18736g.mo58455c(), gls.f18573d.mo13123a().f10841e, byteArrayEntity, gls.f18573d.f21306a)), bxus.m123744c());
                        sek sek = gls.f18570a;
                        Object[] objArr = new Object[1];
                        bzxg a3 = bzxg.m126293a(bzxh.f171751a);
                        if (a3 == null) {
                            a3 = bzxg.UNKNOWN;
                        }
                        objArr[0] = a3;
                        sek.mo25414c("FrpValidationRequestCode: %s.", objArr);
                        bzxg a4 = bzxg.m126293a(bzxh.f171751a);
                        if (a4 == null) {
                            a4 = bzxg.UNKNOWN;
                        }
                        return CheckFactoryResetPolicyComplianceResponse.m6564a(a4.f171748g);
                    } catch (Exception e) {
                        gls.f18570a.mo25417e("Error when communicating with server for FRP.", e, new Object[0]);
                        return CheckFactoryResetPolicyComplianceResponse.m6564a(0);
                    }
                }
            }
            gls.f18570a.mo25416d("FRP local check failed! Wrong account used!", new Object[0]);
            return CheckFactoryResetPolicyComplianceResponse.m6564a(100);
        } catch (Exception e2) {
            throw m16295a(e2);
        }
    }

    /* renamed from: d */
    public final boolean mo13451d(String str) {
        Boolean bool;
        try {
            this.f21928a.mo13127a(Binder.getCallingUid());
            gnd gnd = new gnd(str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("token_handle", gnd.f18666a));
            try {
                HttpResponse a = gmv.m13465a(gnv.m13527aI(), new UrlEncodedFormEntity(arrayList), null);
                if (a.getStatusLine() == null || a.getStatusLine().getStatusCode() != 200) {
                    bool = false;
                } else {
                    JSONObject jSONObject = new JSONObject(gmv.m13467b(a));
                    if (!jSONObject.has("expires_in") || jSONObject.getInt("expires_in") < 0) {
                        bool = false;
                    } else {
                        bool = true;
                    }
                }
                return bool.booleanValue();
            } catch (UnsupportedEncodingException e) {
                e = e;
                throw new rqy(izj.INTNERNAL_ERROR, "Data error.", e);
            } catch (JSONException e2) {
                e = e2;
                throw new rqy(izj.INTNERNAL_ERROR, "Data error.", e);
            } catch (IOException e3) {
                throw new rqy(izj.NETWORK_ERROR, "Error accessing token info endpoint.", e3);
            } catch (rqy e4) {
                gls.f18570a.mo25418e("Failed to check token handle", new Object[0]);
                return false;
            }
        } catch (Exception e5) {
            throw m16295a(e5);
        }
    }

    /* renamed from: a */
    public final GoogleAccountData mo13438a(Account account) {
        int callingUid = Binder.getCallingUid();
        if (account == null) {
            return null;
        }
        try {
            this.f21928a.mo13127a(callingUid);
            return this.f21929b.mo12028a(account);
        } catch (Exception e) {
            throw m16295a(e);
        }
    }

    /* renamed from: a */
    public final TokenResponse mo13439a(AccountSignInRequest accountSignInRequest) {
        try {
            this.f21928a.mo13127a(Binder.getCallingUid());
            return this.f21929b.mo12029a(accountSignInRequest);
        } catch (Exception e) {
            throw m16295a(e);
        }
    }

    /* renamed from: a */
    public final TokenResponse mo13440a(ConfirmCredentialsRequest confirmCredentialsRequest) {
        VerifyPinResponse verifyPinResponse;
        bljb a;
        try {
            this.f21928a.mo13127a(Binder.getCallingUid());
            gls gls = this.f21929b;
            AccountCredentials accountCredentials = confirmCredentialsRequest.f10613b;
            CaptchaSolution captchaSolution = confirmCredentialsRequest.f10614c;
            Account a2 = accountCredentials.mo7674a();
            sdo.m34966a(a2, "Account should be available.");
            if (accountCredentials.f10832f != null) {
                ReauthSettingsResponse a3 = gls.f18576g.mo12041a(new ReauthSettingsRequest(a2, false));
                if (a3 == null) {
                    a3 = gls.f18576g.mo12041a(new ReauthSettingsRequest(a2, true));
                }
                if (a3.f10702b == 0 && "ACTIVE".equals(a3.f10704d.f10688b)) {
                    glv glv = gls.f18576g;
                    VerifyPinRequest verifyPinRequest = new VerifyPinRequest(4, null, accountCredentials.f10832f, a2, null, null);
                    bmxy.m108581a(verifyPinRequest);
                    bmxy.m108581a(verifyPinRequest.f10759d);
                    bmxy.m108581a(verifyPinRequest.f10758c);
                    String str = verifyPinRequest.f10760e;
                    if (str == null) {
                        str = glv.f18594a.f21309d;
                    }
                    Account account = verifyPinRequest.f10759d;
                    String a4 = glv.f18595b.mo33908a(account);
                    if (TextUtils.isEmpty(a4)) {
                        Log.w("ReauthClient", "Not able to verifyPin. No LST for the account.");
                        verifyPinResponse = new VerifyPinResponse(5);
                    } else {
                        if (verifyPinRequest.f10761f == null) {
                            new Bundle();
                        }
                        String str2 = verifyPinRequest.f10758c;
                        String b = glv.f18594a.mo13125b(str);
                        HashMap hashMap = new HashMap();
                        hashMap.put("token", a4);
                        hashMap.put("packageName", str);
                        hashMap.put("packageSignature", b);
                        hashMap.put("pin", str2);
                        try {
                            try {
                                JSONObject jSONObject = new JSONObject(glv.mo12042a((String) gnv.f18733d.mo58455c(), str, hashMap));
                                int a5 = glv.m13421a(jSONObject);
                                if (a5 == -1) {
                                    verifyPinResponse = new VerifyPinResponse(1, 0, jSONObject.getString("rapt"));
                                } else {
                                    verifyPinResponse = new VerifyPinResponse(a5);
                                }
                            } catch (JSONException e) {
                                Log.e("ReauthClient", "Error deserializing verify PIN response.", e);
                                verifyPinResponse = new VerifyPinResponse(1);
                            }
                        } catch (IOException e2) {
                            Log.w("ReauthClient", "Network error calling verify PIN.", e2);
                            verifyPinResponse = new VerifyPinResponse(2);
                        }
                        if (verifyPinResponse.f10763b == 0) {
                            int i = Build.VERSION.SDK_INT;
                            adyd adyd = glv.f18595b;
                            a = blkh.m107281a("AccountManager.notifyAccountAuthenticated");
                            adyd.f62893a.notifyAccountAuthenticated(account);
                            if (a != null) {
                                a.close();
                            }
                        }
                    }
                    if (verifyPinResponse.f10763b == 0) {
                        TokenResponse tokenResponse = new TokenResponse();
                        tokenResponse.mo7646a(izj.SUCCESS);
                        return tokenResponse;
                    }
                }
            }
            return gls.mo12031a(new gnl(gls.f18573d.f21306a, accountCredentials, captchaSolution));
        } catch (Exception e3) {
            throw m16295a(e3);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final TokenResponse mo13441a(TokenRequest tokenRequest) {
        try {
            this.f21928a.mo13127a(Binder.getCallingUid());
            sdo.m34966a(tokenRequest, "TokenRequest cannot be null!");
            return this.f21929b.mo12030a(tokenRequest.f10714j, tokenRequest);
        } catch (Exception e) {
            throw m16295a(e);
        }
    }

    /* renamed from: a */
    public final TokenResponse mo13442a(UpdateCredentialsRequest updateCredentialsRequest) {
        try {
            this.f21928a.mo13127a(Binder.getCallingUid());
            gls gls = this.f21929b;
            return gls.mo12031a(new gnl(gls.f18573d.f21306a, updateCredentialsRequest.f10751b, updateCredentialsRequest.f10752c));
        } catch (Exception e) {
            throw m16295a(e);
        }
    }

    /* renamed from: a */
    public final ValidateAccountCredentialsResponse mo13443a(AccountCredentials accountCredentials) {
        try {
            this.f21928a.mo13127a(Binder.getCallingUid());
            gnm gnm = new gnm(this.f21929b.f18573d.f21306a, accountCredentials);
            try {
                String packageName = gnm.f18707b.getPackageName();
                String str = gnm.f18708c.f10829c;
                gkm a = gnm.f18710e.mo11990a(packageName);
                gmy gmy = gnm.f18709d;
                gmy.mo12070a(gnm.f18708c);
                gmy.mo12073c(gnm.f18708c.f10834h);
                gmy.mo12072b(gnm.f18708c.f10833g);
                if (a != null) {
                    gnm.f18709d.mo12058b(a.f18410a, a.f18411b);
                    gnm.f18709d.mo12054a("system_partition", a.f18413d);
                }
                if (str != null) {
                    gnm.f18709d.mo12071a(str);
                }
                gnm.f18709d.mo12055a(gnm.f18706a);
                HttpResponse a2 = gmv.m13464a(gnv.m13522aD(), gnm.f18707b.getPackageName(), new UrlEncodedFormEntity(gnm.f18709d.mo12052a()), gnm.f18707b);
                a2.getStatusLine().getStatusCode();
                gnb gnb = new gnb(gmv.m13467b(a2));
                izj izj = (izj) gnb.mo12063a(gnb.f18656b);
                gnm.f18706a.mo25409a("ValidateAccountCredentials Status: %s.", izj);
                if (izj == izj.SUCCESS) {
                    return new ValidateAccountCredentialsResponse(1, 0, (String) gnb.mo12063a(gnb.f18655a));
                }
                if (izj == izj.BAD_AUTHENTICATION) {
                    return new ValidateAccountCredentialsResponse(3);
                }
                if (izj == izj.NETWORK_ERROR) {
                    return new ValidateAccountCredentialsResponse(2);
                }
                return new ValidateAccountCredentialsResponse(1);
            } catch (gkn e) {
                throw new rqy(izj.BAD_REQUEST, "Error when fetching package info", e);
            } catch (IOException e2) {
                throw new rqy(izj.NETWORK_ERROR, "Error when calling server.", e2);
            } catch (IOException e3) {
                throw new rqy(izj.INTNERNAL_ERROR, "Error when parsing the response.", e3);
            } catch (rqy e4) {
                gls.f18570a.mo25408a("validateAccountCredentials() -> %s.", e4, e4.f43534a);
                return new ValidateAccountCredentialsResponse(1);
            }
        } catch (Exception e5) {
            throw m16295a(e5);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: glh.a(java.util.List, boolean):void
     arg types: [java.util.ArrayList, int]
     candidates:
      glh.a(ime, java.lang.String):boolean
      glh.a(java.util.List, boolean):void */
    /* renamed from: a */
    public final void mo13444a() {
        try {
            this.f21928a.mo13127a(Binder.getCallingUid());
            gls gls = this.f21929b;
            glh a = glh.m13369a(gls.f18573d.f21306a);
            gll.m13391a(false, gls.f18573d.f21306a);
            a.mo12008a((List) new ArrayList(), false);
        } catch (Exception e) {
            throw m16295a(e);
        }
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcl.a(android.os.Parcel, boolean):void
     arg types: [android.os.Parcel, int]
     candidates:
      dcl.a(android.os.Parcel, android.os.Parcelable$Creator):android.os.Parcelable
      dcl.a(android.os.Parcel, android.os.IInterface):void
      dcl.a(android.os.Parcel, android.os.Parcelable):void
      dcl.a(android.os.Parcel, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:267:?, code lost:
        r8.mo7646a(p000.izj.BAD_REQUEST);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0775 A[ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), Splitter:B:247:0x0741] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0794 A[Catch:{ Exception -> 0x07f3 }] */
    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        AccountNameCheckResponse accountNameCheckResponse;
        String str;
        PasswordCheckResponse passwordCheckResponse;
        String str2;
        String str3;
        CheckRealNameResponse checkRealNameResponse;
        izj izj;
        TokenResponse tokenResponse;
        String str4;
        List list;
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i2 = 4;
        char c = 2;
        String str5 = null;
        String[] strArr = null;
        r11 = null;
        String str6 = null;
        boolean z = false;
        z = false;
        z = false;
        switch (i) {
            case 1:
                try {
                    GoogleAccountData a = this.f21929b.mo12028a(new Account(parcel.readString(), "com.google"));
                    parcel2.writeNoException();
                    dcl.m8169b(parcel4, a);
                    return true;
                } catch (Exception e) {
                    throw m16295a(e);
                }
            case 2:
                AccountNameCheckRequest accountNameCheckRequest = (AccountNameCheckRequest) dcl.m8163a(parcel3, AccountNameCheckRequest.CREATOR);
                try {
                    this.f21928a.mo13127a(Binder.getCallingUid());
                    if (accountNameCheckRequest != null) {
                        gls gls = this.f21929b;
                        AppDescription appDescription = accountNameCheckRequest.f10578e;
                        CaptchaSolution captchaSolution = accountNameCheckRequest.f10579f;
                        accountNameCheckResponse = new AccountNameCheckResponse(izj.BAD_REQUEST);
                        if (appDescription != null) {
                            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                            glp glp = gls.f18578i;
                            String str7 = appDescription.f10841e;
                            try {
                                JSONStringer object = new JSONStringer().object();
                                String str8 = accountNameCheckRequest.f10580g.name;
                                object.key(glo.USERNAME.f18561aF).value(str8);
                                String str9 = accountNameCheckRequest.f10576c;
                                if (!TextUtils.isEmpty(str9)) {
                                    object.key(glo.FIRST_NAME.f18561aF).value(str9);
                                }
                                String str10 = accountNameCheckRequest.f10577d;
                                if (!TextUtils.isEmpty(str10)) {
                                    object.key(glo.LAST_NAME.f18561aF).value(str10);
                                }
                                if (captchaSolution != null) {
                                    String str11 = captchaSolution.f10853b;
                                    if (!TextUtils.isEmpty(str11)) {
                                        object.key(glo.CAPTCHA_TOKEN.f18561aF).value(str11);
                                    }
                                    String str12 = captchaSolution.f10854c;
                                    if (!TextUtils.isEmpty(str12)) {
                                        object.key(glo.CAPTCHA_ANSWER.f18561aF).value(str12);
                                    }
                                }
                                object.endObject();
                                String str13 = null;
                                int i3 = 0;
                                while (i3 < 3 && !atomicBoolean.get()) {
                                    try {
                                        str13 = glp.mo12020a(glp.f18564c, object.toString(), str7);
                                        try {
                                            sek sek = glp.f18562a;
                                            Object[] objArr = new Object[3];
                                            objArr[0] = sek.m35081a(str8);
                                            objArr[1] = sek.m35081a(str9);
                                            objArr[c] = sek.m35081a(str10);
                                            sek.mo25414c("Req: [username: %s, firstName: %s, lastName: %s]", objArr);
                                        } catch (IOException e2) {
                                        }
                                    } catch (IOException e3) {
                                        i3++;
                                        c = 2;
                                    }
                                }
                                if (str13 == null) {
                                    accountNameCheckResponse = new AccountNameCheckResponse(izj.NETWORK_ERROR);
                                } else {
                                    List e4 = bngx.m109376e();
                                    JSONObject jSONObject = new JSONObject(str13);
                                    if (jSONObject.has(glo.SUGGESTIONS.f18561aF)) {
                                        JSONArray jSONArray = jSONObject.getJSONArray(glo.SUGGESTIONS.f18561aF);
                                        int length = jSONArray.length();
                                        List arrayList = new ArrayList(length);
                                        for (int i4 = 0; i4 < length; i4++) {
                                            arrayList.add(jSONArray.getString(i4));
                                        }
                                        e4 = arrayList;
                                    }
                                    izj a2 = ilu.m15678a(jSONObject);
                                    if (a2 != izj.USERNAME_UNAVAILABLE || !jSONObject.has(glo.DETAIL.f18561aF)) {
                                        str = null;
                                    } else {
                                        str = (String) jSONObject.get(glo.DETAIL.f18561aF);
                                    }
                                    accountNameCheckResponse = new AccountNameCheckResponse(a2, str, glp.m13396a(jSONObject), e4);
                                }
                            } catch (IllegalArgumentException | JSONException e5) {
                                glp.f18562a.mo25418e(Log.getStackTraceString(e5), new Object[0]);
                                accountNameCheckResponse = new AccountNameCheckResponse(izj.BAD_REQUEST);
                            }
                        }
                    } else {
                        accountNameCheckResponse = new AccountNameCheckResponse(izj.BAD_REQUEST);
                    }
                    parcel2.writeNoException();
                    dcl.m8169b(parcel4, accountNameCheckResponse);
                    return true;
                } catch (Exception e6) {
                    throw m16295a(e6);
                }
            case 3:
                PasswordCheckRequest passwordCheckRequest = (PasswordCheckRequest) dcl.m8163a(parcel3, PasswordCheckRequest.CREATOR);
                try {
                    this.f21928a.mo13127a(Binder.getCallingUid());
                    if (passwordCheckRequest != null) {
                        gls gls2 = this.f21929b;
                        AppDescription appDescription2 = passwordCheckRequest.f10679f;
                        glp glp2 = gls2.f18578i;
                        String str14 = passwordCheckRequest.f10675b;
                        String str15 = passwordCheckRequest.f10676c;
                        String str16 = passwordCheckRequest.f10677d;
                        String str17 = passwordCheckRequest.f10678e;
                        String str18 = appDescription2.f10841e;
                        try {
                            JSONStringer object2 = new JSONStringer().object();
                            object2.key(glo.USERNAME.f18561aF).value(str14);
                            if (str15 != null) {
                                object2.key(glo.PASSWORD.f18561aF).value(str15);
                            }
                            if (str16 != null) {
                                object2.key(glo.FIRST_NAME.f18561aF).value(str16);
                            }
                            if (str17 != null) {
                                object2.key(glo.LAST_NAME.f18561aF).value(str17);
                            }
                            object2.endObject();
                            String a3 = glp2.mo12020a(glp2.f18565d, object2.toString(), str18);
                            glp.f18562a.mo25414c("Result of password rating for {account %s, first: %s, last %s}: %s", sek.m35081a(str14), sek.m35081a(str16), sek.m35081a(str17), sek.m35081a(a3));
                            JSONObject jSONObject2 = new JSONObject(a3);
                            izj a4 = ilu.m15678a(jSONObject2);
                            if (izj.SUCCESS == a4) {
                                String str19 = glo.STRENGTH.f18561aF;
                                if (jSONObject2.has(str19)) {
                                    str3 = jSONObject2.getString(str19);
                                } else {
                                    str3 = null;
                                }
                                String str20 = glo.DETAIL.f18561aF;
                                if (jSONObject2.has(str20)) {
                                    str2 = jSONObject2.getString(str20);
                                    str5 = str3;
                                } else {
                                    str2 = null;
                                    str5 = str3;
                                }
                            } else {
                                str2 = null;
                            }
                            passwordCheckResponse = new PasswordCheckResponse(a4, str5, str2);
                        } catch (JSONException e7) {
                            e = e7;
                            glp.f18562a.mo25418e(Log.getStackTraceString(e), new Object[0]);
                            passwordCheckResponse = new PasswordCheckResponse(izj.BAD_REQUEST);
                        } catch (IllegalArgumentException e8) {
                            e = e8;
                            glp.f18562a.mo25418e(Log.getStackTraceString(e), new Object[0]);
                            passwordCheckResponse = new PasswordCheckResponse(izj.BAD_REQUEST);
                        } catch (IOException e9) {
                            passwordCheckResponse = new PasswordCheckResponse(izj.NETWORK_ERROR);
                        }
                    } else {
                        passwordCheckResponse = new PasswordCheckResponse(izj.BAD_REQUEST);
                    }
                    parcel2.writeNoException();
                    dcl.m8169b(parcel4, passwordCheckResponse);
                    return true;
                } catch (Exception e10) {
                    throw m16295a(e10);
                }
            case 4:
                CheckRealNameRequest checkRealNameRequest = (CheckRealNameRequest) dcl.m8163a(parcel3, CheckRealNameRequest.CREATOR);
                int callingUid = Binder.getCallingUid();
                if (checkRealNameRequest != null) {
                    try {
                        this.f21928a.mo13127a(callingUid);
                        gls gls3 = this.f21929b;
                        AppDescription appDescription3 = checkRealNameRequest.f10603b;
                        String str21 = checkRealNameRequest.f10604c;
                        String str22 = checkRealNameRequest.f10605d;
                        glp glp3 = gls3.f18578i;
                        String str23 = appDescription3.f10841e;
                        try {
                            JSONStringer jSONStringer = new JSONStringer();
                            jSONStringer.object();
                            String a5 = ryv.m34679a(glp3.f18563b);
                            if (a5 != null) {
                                jSONStringer.key(glo.ANDROID_ID.f18561aF).value(a5);
                            }
                            String a6 = ryv.m34681a(glp3.f18563b, "device_country", null);
                            jSONStringer.key(glo.OPERATOR_COUNTRY.f18561aF).value(a6);
                            jSONStringer.key(glo.DEVICE_COUNTRY.f18561aF).value(a6);
                            jSONStringer.key(glo.LANGUAGE.f18561aF).value(Locale.getDefault().getLanguage());
                            jSONStringer.key(glo.FIRST_NAME.f18561aF).value(str21);
                            jSONStringer.key(glo.LAST_NAME.f18561aF).value(str22);
                            jSONStringer.endObject();
                            izj = ilu.m15678a(new JSONObject(glp3.mo12020a((String) gnv.f18734e.mo58455c(), jSONStringer.toString(), str23)));
                            if (izj != izj.GPLUS_INTERSTITIAL) {
                                if (!(izj == izj.GPLUS_INVALID_CHAR || izj == izj.GPLUS_NICKNAME || izj == izj.GPLUS_OTHER)) {
                                    izj = izj.SUCCESS;
                                }
                            }
                        } catch (IOException | JSONException e11) {
                            izj = izj.SUCCESS;
                        }
                        checkRealNameResponse = new CheckRealNameResponse(izj);
                    } catch (Exception e12) {
                        throw m16295a(e12);
                    }
                } else {
                    checkRealNameResponse = new CheckRealNameResponse(izj.BAD_REQUEST);
                }
                parcel2.writeNoException();
                dcl.m8169b(parcel4, checkRealNameResponse);
                return true;
            case 5:
                GoogleAccountSetupRequest googleAccountSetupRequest = (GoogleAccountSetupRequest) dcl.m8163a(parcel3, GoogleAccountSetupRequest.CREATOR);
                try {
                    this.f21928a.mo13127a(Binder.getCallingUid());
                    gls gls4 = this.f21929b;
                    AppDescription appDescription4 = googleAccountSetupRequest.f10648n;
                    AccountCredentials accountCredentials = googleAccountSetupRequest.f10649o;
                    CaptchaSolution captchaSolution2 = googleAccountSetupRequest.f10650p;
                    sdo.m34966a(appDescription4, "AppDescription cannot be null!");
                    sdo.m34966a(accountCredentials, "AccountCredentials cannot be null!");
                    sdo.m34966a(googleAccountSetupRequest, "GoogleAccountSetupRequest cannot be null!");
                    gne gne = new gne(gls4.f18573d.f21306a, appDescription4, accountCredentials, googleAccountSetupRequest, captchaSolution2);
                    try {
                        String str24 = gne.f18670d.f10829c;
                        gmj gmj = gne.f18668b;
                        gmj.f18629b.object();
                        Context context = gmj.f18628a;
                        gmj.f18629b.key("version").value("3");
                        if (!cbzq.m128974b()) {
                            gmj.f18629b.key("locale").value(Locale.getDefault().toString());
                        } else {
                            Locale locale = Locale.getDefault();
                            int i5 = Build.VERSION.SDK_INT;
                            gmj.f18629b.key("locale").value(locale.toLanguageTag());
                        }
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        gmj.f18629b.key("operatorCountry").value(telephonyManager.getNetworkCountryIso());
                        gmj.f18629b.key("simCountry").value(telephonyManager.getSimCountryIso());
                        gmj.f18629b.key("gmsCoreVersion").value(201515033L);
                        gmj.f18629b.key("sdkVersion").value((long) Build.VERSION.SDK_INT);
                        gmj.f18629b.key("androidId").value(ryv.m34679a(context));
                        gmj gmj2 = gne.f18668b;
                        gmj2.f18629b.key("agreeWebHistory").value(!gne.f18671e.f10637c ? "0" : "1");
                        gmj2.f18629b.key("agreePersonalizedContent").value(!gne.f18671e.f10638d ? "0" : "1");
                        gmj2.f18629b.key("droidguard_results").value(glq.m13398a(gne.f18667a, "createAccount", str24));
                        CaptchaSolution captchaSolution3 = gne.f18672f;
                        if (captchaSolution3 != null) {
                            gmj2.f18629b.key("captchaToken").value(captchaSolution3.f10853b);
                            gmj2.f18629b.key("captchaAnswer").value(captchaSolution3.f10854c);
                        }
                        if (str24 != null) {
                            gne.f18668b.f18629b.key("username").value(str24);
                        }
                        String str25 = gne.f18671e.f10642h;
                        if (str25 != null) {
                            gne.f18668b.f18629b.key("secondaryEmail").value(str25);
                        }
                        String str26 = gne.f18671e.f10651q;
                        if (str26 != null) {
                            gne.f18668b.f18629b.key("r_phone_number").value(str26);
                        }
                        String str27 = gne.f18671e.f10652r;
                        if (str27 != null) {
                            gne.f18668b.f18629b.key("r_country").value(str27);
                        }
                        String str28 = gne.f18671e.f10640f;
                        if (str28 != null) {
                            gne.f18668b.f18629b.key("firstName").value(str28);
                        }
                        String str29 = gne.f18671e.f10641g;
                        if (str29 != null) {
                            gne.f18668b.f18629b.key("lastName").value(str29);
                        }
                        String str30 = gne.f18670d.f10832f;
                        if (str24 != null) {
                            gne.f18668b.f18629b.key("password").value(str30);
                        }
                        gne.f18668b.f18629b.endObject();
                        byte[] a7 = gmv.m13466a(gmv.m13464a(String.valueOf(gnv.m13524aF()).concat("/create"), gne.f18669c.f10841e, new StringEntity(gne.f18668b.f18629b.toString(), "UTF-8"), gne.f18667a));
                        if (a7 == null) {
                            str4 = "";
                        } else {
                            str4 = new String(a7, bmwy.f131158c);
                        }
                        tokenResponse = new TokenResponse();
                        try {
                            JSONObject jSONObject3 = new JSONObject(str4);
                            izj a8 = ilu.m15678a(jSONObject3);
                            if (izj.SUCCESS == a8 || izj.ALREADY_HAS_GMAIL == a8) {
                                tokenResponse.mo7646a(izj.SUCCESS);
                                gls.f18570a.mo25409a("createAccount() -> %s.", tokenResponse.mo7647b());
                                if (tokenResponse.mo7647b() == izj.SUCCESS) {
                                    AccountSignInRequest accountSignInRequest = new AccountSignInRequest();
                                    accountSignInRequest.f10592b = appDescription4;
                                    accountSignInRequest.f10596f = accountCredentials;
                                    accountSignInRequest.f10593c = true;
                                    accountSignInRequest.f10594d = googleAccountSetupRequest.f10646l;
                                    accountSignInRequest.f10595e = captchaSolution2;
                                    tokenResponse = gls4.mo12029a(accountSignInRequest);
                                }
                                parcel2.writeNoException();
                                dcl.m8169b(parcel4, tokenResponse);
                                return true;
                            }
                            if (izj.CAPTCHA == a8) {
                                tokenResponse.f10737n = glp.m13396a(jSONObject3);
                            } else if (izj.BAD_REQUEST == a8) {
                                tokenResponse.f10729f = jSONObject3.getString("detail");
                            }
                            tokenResponse.mo7646a(a8);
                            gls.f18570a.mo25409a("createAccount() -> %s.", tokenResponse.mo7647b());
                            if (tokenResponse.mo7647b() == izj.SUCCESS) {
                            }
                            parcel2.writeNoException();
                            dcl.m8169b(parcel4, tokenResponse);
                            return true;
                        } catch (JSONException e13) {
                        } catch (IllegalArgumentException e14) {
                        }
                    } catch (IOException e15) {
                        throw new rqy(izj.NETWORK_ERROR, "Error when calling server.", e15);
                    } catch (JSONException e16) {
                        throw new rqy(izj.BAD_REQUEST, "bad request", e16);
                    } catch (IOException e17) {
                        throw new rqy(izj.INTNERNAL_ERROR, "Error when parsing the response.", e17);
                    } catch (rqy e18) {
                        rqy rqy = e18;
                        gls.f18570a.mo25417e("createAccount() -> %s.", rqy, rqy.f43534a);
                        tokenResponse = new TokenResponse();
                        tokenResponse.mo7646a(rqy.f43534a);
                    }
                } catch (Exception e19) {
                    throw m16295a(e19);
                }
                break;
            case 6:
                GplusInfoRequest gplusInfoRequest = (GplusInfoRequest) dcl.m8163a(parcel3, GplusInfoRequest.CREATOR);
                try {
                    this.f21928a.mo13127a(Binder.getCallingUid());
                    GplusInfoResponse gplusInfoResponse = new GplusInfoResponse("", "", "", "", "", "");
                    parcel2.writeNoException();
                    dcl.m8169b(parcel4, gplusInfoResponse);
                    return true;
                } catch (Exception e20) {
                    throw m16295a(e20);
                }
            case 7:
                GoogleAccountSetupRequest googleAccountSetupRequest2 = (GoogleAccountSetupRequest) dcl.m8163a(parcel3, GoogleAccountSetupRequest.CREATOR);
                try {
                    this.f21928a.mo13127a(Binder.getCallingUid());
                    TokenResponse tokenResponse2 = new TokenResponse();
                    tokenResponse2.mo7646a(izj.GPLUS_PROFILE_ERROR);
                    parcel2.writeNoException();
                    dcl.m8169b(parcel4, tokenResponse2);
                    return true;
                } catch (Exception e21) {
                    throw m16295a(e21);
                }
            case 8:
                TokenResponse a9 = mo13441a((TokenRequest) dcl.m8163a(parcel3, TokenRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel4, a9);
                return true;
            case 9:
                TokenResponse a10 = mo13439a((AccountSignInRequest) dcl.m8163a(parcel3, AccountSignInRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel4, a10);
                return true;
            case 10:
                TokenResponse a11 = mo13440a((ConfirmCredentialsRequest) dcl.m8163a(parcel3, ConfirmCredentialsRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel4, a11);
                return true;
            case 11:
                TokenResponse a12 = mo13442a((UpdateCredentialsRequest) dcl.m8163a(parcel3, UpdateCredentialsRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel4, a12);
                return true;
            case 12:
            case 13:
            case 14:
            case 15:
            case 21:
            case 22:
            case 26:
            case 28:
            case 32:
            case 33:
            default:
                return false;
            case 16:
                Bundle a13 = mo13436a(parcel.readString());
                parcel2.writeNoException();
                dcl.m8169b(parcel4, a13);
                return true;
            case 17:
                mo13445a(parcel.readString(), (Bundle) dcl.m8163a(parcel3, Bundle.CREATOR));
                parcel2.writeNoException();
                dcl.m8166a(parcel4, true);
                return true;
            case 18:
                WebSetupConfigRequest webSetupConfigRequest = (WebSetupConfigRequest) dcl.m8163a(parcel3, WebSetupConfigRequest.CREATOR);
                try {
                    this.f21928a.mo13127a(Binder.getCallingUid());
                    throw new UnsupportedOperationException();
                } catch (Exception e22) {
                    throw m16295a(e22);
                }
            case 19:
                ClearTokenRequest clearTokenRequest = (ClearTokenRequest) dcl.m8163a(parcel3, ClearTokenRequest.CREATOR);
                try {
                    this.f21928a.mo13127a(Binder.getCallingUid());
                    ClearTokenResponse a14 = this.f21929b.mo12027a(clearTokenRequest);
                    parcel2.writeNoException();
                    dcl.m8169b(parcel4, a14);
                    return true;
                } catch (Exception e23) {
                    throw m16295a(e23);
                }
            case 20:
                AccountRemovalRequest accountRemovalRequest = (AccountRemovalRequest) dcl.m8163a(parcel3, AccountRemovalRequest.CREATOR);
                try {
                    this.f21928a.mo13127a(Binder.getCallingUid());
                    AccountRemovalResponse a15 = this.f21929b.mo12026a(accountRemovalRequest);
                    parcel2.writeNoException();
                    dcl.m8169b(parcel4, a15);
                    return true;
                } catch (Exception e24) {
                    throw m16295a(e24);
                }
            case 23:
                AccountChangeEventsRequest accountChangeEventsRequest = (AccountChangeEventsRequest) dcl.m8163a(parcel3, AccountChangeEventsRequest.CREATOR);
                try {
                    this.f21928a.mo13127a(Binder.getCallingUid());
                    AccountChangeEventsResponse a16 = this.f21929b.mo12025a(accountChangeEventsRequest);
                    parcel2.writeNoException();
                    dcl.m8169b(parcel4, a16);
                    return true;
                } catch (Exception e25) {
                    throw m16295a(e25);
                }
            case 24:
                OtpRequest otpRequest = (OtpRequest) dcl.m8163a(parcel3, OtpRequest.CREATOR);
                try {
                    this.f21928a.mo13128b(Binder.getCallingUid());
                    gls gls5 = this.f21929b;
                    String str31 = otpRequest.f10669c.f10841e;
                    if (otpRequest.f10671e && gls5.f18573d.f21309d.equals(str31)) {
                        list = gls5.f18574e.mo12137a(otpRequest.f10668b, false);
                    } else {
                        try {
                            byte[] bytes = str31.getBytes("UTF-8");
                            byte[] bytes2 = "!".getBytes("UTF-8");
                            int length2 = bytes.length;
                            byte[] bArr = otpRequest.f10670d;
                            if (bArr != null) {
                                length2 += bArr.length + bytes2.length;
                            }
                            ByteBuffer allocate = ByteBuffer.allocate(length2);
                            allocate.put(bytes);
                            if (otpRequest.f10670d != null) {
                                allocate.put(bytes2).put(otpRequest.f10670d);
                            }
                            list = gls5.f18574e.mo12138a(otpRequest.f10668b, false, allocate.array());
                        } catch (UnsupportedEncodingException e26) {
                            gls.f18570a.mo25417e("UTF-8 IS UNSUPPORTED ?!?!?!?!?", e26, new Object[0]);
                            list = null;
                        }
                    }
                    if (list != null && !list.isEmpty()) {
                        str6 = (String) list.get(0);
                    }
                    OtpResponse otpResponse = new OtpResponse(1, str6);
                    parcel2.writeNoException();
                    dcl.m8169b(parcel4, otpResponse);
                    return true;
                } catch (Exception e27) {
                    throw m16295a(e27);
                }
            case 25:
                String readString = parcel.readString();
                try {
                    this.f21928a.mo13127a(Binder.getCallingUid());
                    gls gls6 = this.f21929b;
                    sdo.m34969a(readString, (Object) "AccountName must be provided");
                    String b = gls6.mo12033b(new Account(readString, "com.google"));
                    parcel2.writeNoException();
                    parcel4.writeString(b);
                    return true;
                } catch (Exception e28) {
                    throw m16295a(e28);
                }
            case 27:
                CheckFactoryResetPolicyComplianceResponse a17 = mo13437a((CheckFactoryResetPolicyComplianceRequest) dcl.m8163a(parcel3, CheckFactoryResetPolicyComplianceRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel4, a17);
                return true;
            case 29:
                mo13444a();
                parcel2.writeNoException();
                return true;
            case 30:
                GoogleAccountData a18 = mo13438a((Account) dcl.m8163a(parcel3, Account.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel4, a18);
                return true;
            case 31:
                Account account = (Account) dcl.m8163a(parcel3, Account.CREATOR);
                try {
                    this.f21928a.mo13127a(Binder.getCallingUid());
                    String b2 = this.f21929b.mo12033b(account);
                    parcel2.writeNoException();
                    parcel4.writeString(b2);
                    return true;
                } catch (Exception e29) {
                    throw m16295a(e29);
                }
            case 34:
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                try {
                    this.f21928a.mo13128b(Binder.getCallingUid());
                    gls gls7 = this.f21929b;
                    if (gls7.f18580k.mo13130a(Binder.getCallingUid())) {
                        boolean a19 = gls7.f18581l.mo11997a(readString2, readString3);
                        parcel2.writeNoException();
                        dcl.m8166a(parcel4, a19);
                        return true;
                    }
                    throw new SecurityException("The work account whitelist can only be modified by device administrators");
                } catch (Exception e30) {
                    throw m16295a(e30);
                }
            case 35:
                try {
                    this.f21928a.mo13128b(Binder.getCallingUid());
                    gls gls8 = this.f21929b;
                    if (gls8.f18580k.mo13130a(Binder.getCallingUid())) {
                        boolean a20 = gls8.f18581l.mo11995a();
                        parcel2.writeNoException();
                        dcl.m8166a(parcel4, a20);
                        return true;
                    }
                    throw new SecurityException("The work account whitelist can only be modified by device administrators");
                } catch (Exception e31) {
                    throw m16295a(e31);
                }
            case 36:
                ValidateAccountCredentialsResponse a21 = mo13443a((AccountCredentials) dcl.m8163a(parcel3, AccountCredentials.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel4, a21);
                return true;
            case FelicaException.TYPE_NOT_CLOSED:
                GetAndAdvanceOtpCounterResponse b3 = mo13447b(parcel.readString());
                parcel2.writeNoException();
                dcl.m8169b(parcel4, b3);
                return true;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                String c2 = mo13448c(parcel.readString());
                parcel2.writeNoException();
                parcel4.writeString(c2);
                return true;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                boolean d = mo13451d(parcel.readString());
                parcel2.writeNoException();
                dcl.m8166a(parcel4, d);
                return true;
            case FelicaException.TYPE_PUSH_FAILED:
                DeviceManagementInfoResponse b4 = mo13446b((Account) dcl.m8163a(parcel3, Account.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel4, b4);
                return true;
            case 41:
                Account account2 = (Account) dcl.m8163a(parcel3, Account.CREATOR);
                String[] createStringArray = parcel.createStringArray();
                try {
                    this.f21928a.mo13128b(Binder.getCallingUid());
                    gls gls9 = this.f21929b;
                    gls9.mo12032a();
                    gsg gsg = gls9.f18582m;
                    if (gsg.m13819a()) {
                        gsg.f18947a.mo25414c("Setting restriction to account", new Object[0]);
                        if (createStringArray == null) {
                            if (gsg.f18949b.mo33914a(account2, "android:accounts:key_legacy_visible", 0)) {
                                gsg.f18949b.mo33914a(account2, "android:accounts:key_legacy_not_visible", 0);
                                for (Map.Entry entry : gsg.f18949b.mo33920b(account2).entrySet()) {
                                    String str32 = (String) entry.getKey();
                                    Integer num = (Integer) entry.getValue();
                                    if (num.intValue() != 1) {
                                        if (num.intValue() != 3) {
                                        }
                                    }
                                    gsg.f18949b.mo33914a(account2, str32, 0);
                                }
                                for (String str33 : ((gsl) gsl.f18953a.mo13145b()).mo12170a()) {
                                    int b5 = gsg.f18949b.mo33919b(account2, str33);
                                    if (b5 != i2) {
                                        if (b5 != 2) {
                                            i2 = 4;
                                        }
                                    }
                                    sek sek2 = gsg.f18947a;
                                    String valueOf = String.valueOf(account2);
                                    StringBuilder sb = new StringBuilder(String.valueOf(str33).length() + 23 + String.valueOf(valueOf).length());
                                    sb.append("Setting visibility to ");
                                    sb.append(str33);
                                    sb.append(" ");
                                    sb.append(valueOf);
                                    sek2.mo25412b(sb.toString(), new Object[0]);
                                    gsg.f18949b.mo33914a(account2, str33, 2);
                                    i2 = 4;
                                }
                            }
                        } else if (gsg.f18949b.mo33914a(account2, "android:accounts:key_legacy_visible", 3)) {
                            gsg.f18949b.mo33914a(account2, "android:accounts:key_legacy_not_visible", 3);
                            HashMap hashMap = new HashMap();
                            for (String str34 : createStringArray) {
                                hashMap.put(str34, 1);
                            }
                            Map b6 = gsg.f18949b.mo33920b(account2);
                            for (Map.Entry entry2 : hashMap.entrySet()) {
                                String str35 = (String) entry2.getKey();
                                if (!gsg.mo12166b(str35)) {
                                    gsg.f18949b.mo33914a(account2, str35, ((Integer) entry2.getValue()).intValue());
                                    b6.remove(str35);
                                }
                            }
                            for (Map.Entry entry3 : b6.entrySet()) {
                                if (!gsg.mo12166b((String) entry3.getKey()) && ((Integer) entry3.getValue()).intValue() != 0) {
                                    gsg.f18949b.mo33914a(account2, (String) entry3.getKey(), 0);
                                }
                            }
                        }
                        gsg.f18950c.mo12095b(account2, gqd.f18817k, createStringArray);
                        z = true;
                    }
                    parcel2.writeNoException();
                    dcl.m8166a(parcel4, z);
                    return true;
                } catch (Exception e32) {
                    throw m16295a(e32);
                }
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                Account account3 = (Account) dcl.m8163a(parcel3, Account.CREATOR);
                try {
                    this.f21928a.mo13128b(Binder.getCallingUid());
                    gls gls10 = this.f21929b;
                    gls10.mo12032a();
                    gsg gsg2 = gls10.f18582m;
                    if (gsg.m13819a()) {
                        strArr = (String[]) gsg2.f18950c.mo12090a(account3, gqd.f18817k);
                    }
                    parcel2.writeNoException();
                    parcel4.writeStringArray(strArr);
                    return true;
                } catch (Exception e33) {
                    throw m16295a(e33);
                }
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                mo13449c();
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_RESET_FAILED:
                mo13450d();
                parcel2.writeNoException();
                return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b0, code lost:
        if (r11.equals(r5) == false) goto L_0x00b2;
     */
    /* renamed from: a */
    public final boolean mo13445a(String str, Bundle bundle) {
        gnz gnz;
        ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest;
        try {
            this.f21928a.mo13127a(Binder.getCallingUid());
            gls gls = this.f21929b;
            Account account = new Account(str, "com.google");
            Bundle bundle2 = bundle.getBundle("bootstrapBundle");
            bundle.remove("bootstrapBundle");
            if (bundle2 != null) {
                byte[] byteArray = bundle2.getByteArray("partialBootstrapAssertion");
                if (byteArray != null) {
                    exchangeAssertionsForUserCredentialsRequest = (ExchangeAssertionsForUserCredentialsRequest) sef.m35069a(byteArray, ExchangeAssertionsForUserCredentialsRequest.CREATOR);
                } else {
                    exchangeAssertionsForUserCredentialsRequest = null;
                }
                if (exchangeAssertionsForUserCredentialsRequest == null) {
                    gls.f18570a.mo25416d("Assertion expected for partial bootstrap, not found", new Object[0]);
                } else {
                    gls.f18570a.mo25412b("Completing partial restricted profile bootstrapping", new Object[0]);
                    Context context = gls.f18573d.f21306a;
                    Intent startIntent = IntentOperation.getStartIntent(context, FinishBootstrapIntentOperation.class, "com.google.android.gms.auth.account.be.finish_bootstrap");
                    startIntent.putExtra("bootstrapAccount", account);
                    startIntent.putExtra("messenger", new Messenger(new glr(Looper.getMainLooper())));
                    sef.m35071a(exchangeAssertionsForUserCredentialsRequest, startIntent, "bootstrapAssertion");
                    context.startService(startIntent);
                    try {
                        gls.f18571b.tryAcquire(1, TimeUnit.MINUTES);
                    } catch (InterruptedException e) {
                        gls.f18570a.mo25417e("Error waiting for count down", e, new Object[0]);
                    }
                    if (gls.f18572c.containsKey(account)) {
                        gls.f18570a.mo25412b("Successful bootstrap of new profile", new Object[0]);
                        String string = bundle.getString("lst");
                        String str2 = (String) gls.f18572c.get(account);
                        if (string == null) {
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            gnz gnz2 = gqd.f18807a;
                            bundle.remove("password");
                            bundle.putString("password", (String) gls.f18572c.get(account));
                            gls.f18572c.remove(account);
                        }
                        new grk(gls.f18573d.f21306a).mo12133a(4);
                        gnz gnz22 = gqd.f18807a;
                        bundle.remove("password");
                        bundle.putString("password", (String) gls.f18572c.get(account));
                        gls.f18572c.remove(account);
                    }
                }
            }
            gny gny = new gny();
            for (String str3 : bundle.keySet()) {
                if (!cbwy.f178500a.mo6606a().mo75567a()) {
                    gnz[] gnzArr = gqd.f18822p;
                    int length = gnzArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= 14) {
                            gnz = null;
                            break;
                        }
                        gnz = gnzArr[i];
                        if (gnz.mo12087a().equals(str3)) {
                            break;
                        }
                        i++;
                    }
                } else {
                    gnz = (gnz) gqd.f18823q.get(str3);
                }
                if (gnz != null) {
                    gny.mo12083a(gnz, gnz.mo12086a(bundle.getString(str3)));
                }
            }
            gls.f18577h.mo12093a(account, gny);
            return true;
        } catch (Exception e2) {
            throw m16295a(e2);
        }
    }
}
