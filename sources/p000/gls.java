package p000;

import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SyncAdapterType;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.dataservice.AccountRemovalRequest;
import com.google.android.gms.auth.firstparty.dataservice.AccountRemovalResponse;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenResponse;
import com.google.android.gms.auth.firstparty.dataservice.DeviceManagementInfoResponse;
import com.google.android.gms.auth.firstparty.dataservice.GoogleAccountData;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.Feature;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: gls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gls {

    /* renamed from: a */
    public static final Logger f18570a = ght.m13171a("GoogleAccountDataServiceImpl");

    /* renamed from: b */
    public static final Semaphore f18571b = new Semaphore(0);

    /* renamed from: c */
    public static final Map f18572c = new C1223np(1);

    /* renamed from: d */
    public final ilq f18573d;

    /* renamed from: e */
    public final grt f18574e;

    /* renamed from: f */
    public final grn f18575f;

    /* renamed from: g */
    public final glv f18576g;

    /* renamed from: h */
    public final goa f18577h = ((goa) goa.f18759a.mo13145b());

    /* renamed from: i */
    public final glp f18578i = new glp(this.f18573d.context);

    /* renamed from: j */
    public final grm f18579j;

    /* renamed from: k */
    public final ily f18580k;

    /* renamed from: l */
    public final gkr f18581l;

    /* renamed from: m */
    public final gsg f18582m;

    /* renamed from: n */
    public final glq f18583n;

    /* renamed from: o */
    private final jhs f18584o;

    public gls(ilq ilq) {
        sdo.m34959a(ilq);
        this.f18573d = ilq;
        Context context = ilq.context;
        this.f18574e = gro.m13782a(context);
        this.f18575f = new grx(context);
        this.f18576g = new glv(ilq);
        this.f18579j = new grm(context);
        this.f18580k = (ily) ily.f21320d.mo13145b();
        this.f18581l = (gkr) gkr.f18427a.mo13145b();
        this.f18584o = jhr.m16734a();
        this.f18582m = (gsg) gsg.f18948d.mo13145b();
        this.f18583n = new glq(context);
    }

    /* renamed from: a */
    public final Bundle mo12024a(String str) {
        Account account = new Account(str, "com.google");
        if (!soz.m35791a(this.f18573d.context, account)) {
            return null;
        }
        goa goa = this.f18577h;
        gny a = gny.m13584a();
        gnz[] gnzArr = gqd.f18822p;
        int length = gnzArr.length;
        for (int i = 0; i < 14; i++) {
            gnz gnz = gnzArr[i];
            Object a2 = goa.mo12090a(account, gnz);
            if (a2 != null) {
                a.mo12083a(gnz, a2);
            }
        }
        return a.mo12084b();
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
    /* renamed from: b */
    public final String mo12033b(Account account) {
        sdo.m34969a(account.name, (Object) "AccountName must be provided");
        String str = (String) this.f18577h.mo12090a(account, gqd.f18809c);
        f18570a.mo25412b("getGoogleAccountId(%s): %s.", Logger.m35081a(account), Logger.m35081a(str));
        return str == null ? "" : str;
    }

    /* renamed from: c */
    public final DeviceManagementInfoResponse mo12035c(Account account) {
        bzxl a = gmi.m13447a(this.f18573d.context, account);
        Locale locale = Locale.getDefault();
        int i = Build.VERSION.SDK_INT;
        String languageTag = locale.toLanguageTag();
        bxvd da = cama.f175229e.mo74144da();
        long a2 = spn.getAndroidId(this.f18573d.context);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cama cama = (cama) da.f164949b;
        int i2 = cama.f175231a | 2;
        cama.f175231a = i2;
        cama.f175233c = a2;
        languageTag.getClass();
        cama.f175231a = i2 | 1;
        cama.f175232b = languageTag;
        try {
            String b = qdf.m31915b(this.f18573d.context);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cama cama2 = (cama) da.f164949b;
            b.getClass();
            cama2.f175231a |= 8;
            cama2.f175234d = b;
        } catch (IOException | rfv | rfw e) {
            f18570a.mo25415d("Exception while trying to get checkin device data version info.", e, new Object[0]);
        }
        cama cama3 = (cama) da.mo74062i();
        bxvd da2 = bzxm.f171773d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bzxm bzxm = (bzxm) da2.f164949b;
        a.getClass();
        bzxm.f171777c = a;
        int i3 = bzxm.f171775a | 2;
        bzxm.f171775a = i3;
        cama3.getClass();
        bzxm.f171776b = cama3;
        bzxm.f171775a = i3 | 1;
        bzxn bzxn = (bzxn) this.f18584o.mo13754a("post", gnv.m13561f(), (bzxm) da2.mo74062i(), bzxn.f171778c).get();
        if (bzxn != null) {
            camb camb = bzxn.f171781b;
            if (camb == null) {
                camb = camb.f175235c;
            }
            if (camb.f175237a.size() > 0) {
                camb camb2 = bzxn.f171781b;
                if (camb2 == null) {
                    camb2 = camb.f175235c;
                }
                String str = ((camd) camb2.f175237a.get(0)).f175248b;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        svr.m36484b(this.f18573d.context).mo26176b(str, 0);
                        return new DeviceManagementInfoResponse(str, true);
                    } catch (PackageManager.NameNotFoundException e2) {
                        return new DeviceManagementInfoResponse(str, false);
                    }
                }
            }
        }
        return new DeviceManagementInfoResponse(null, false);
    }

    /* renamed from: b */
    public final String mo12034b(String str) {
        gnf gnf = new gnf(str);
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("access_token", gnf.f18673a));
            HttpResponse a = gmv.m13465a(gnv.m13527aI(), new UrlEncodedFormEntity(arrayList), null);
            if (a.getStatusLine() == null || a.getStatusLine().getStatusCode() != 200) {
                return null;
            }
            return new JSONObject(gmv.m13467b(a)).getString("token_handle");
        } catch (UnsupportedEncodingException e) {
            e = e;
            throw new rqy(izj.INTNERNAL_ERROR, "Data error.", e);
        } catch (JSONException e2) {
            e = e2;
            throw new rqy(izj.INTNERNAL_ERROR, "Data error.", e);
        } catch (IOException e3) {
            throw new rqy(izj.NETWORK_ERROR, "Error accessing token info endpoint.", e3);
        } catch (rqy e4) {
            f18570a.mo25417e("Failed to get token handle", e4, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public final AccountChangeEventsResponse mo12025a(AccountChangeEventsRequest accountChangeEventsRequest) {
        glu a = glu.m13415a(this.f18573d.context);
        String a2 = a.mo12037a();
        try {
            return new AccountChangeEventsResponse(a.mo12038a(accountChangeEventsRequest.f9912c, accountChangeEventsRequest.f9911b));
        } finally {
            a.mo12039a(a2);
        }
    }

    /* renamed from: a */
    public final AccountRemovalResponse mo12026a(AccountRemovalRequest accountRemovalRequest) {
        sdo.checkIfNull(accountRemovalRequest, "accountRemovalRequest cannot be null!");
        Account account = accountRemovalRequest.f10588c;
        if (!soz.m35791a(this.f18573d.context, account)) {
            return new AccountRemovalResponse(izj.BAD_USERNAME);
        }
        adyd a = adyd.m51363a(this.f18573d.context);
        try {
            int i = Build.VERSION.SDK_INT;
            a.mo33925d(account);
            return new AccountRemovalResponse(izj.SUCCESS);
        } catch (OperationCanceledException e) {
            return new AccountRemovalResponse(izj.USER_CANCEL);
        } catch (AuthenticatorException e2) {
            return new AccountRemovalResponse(izj.UNKNOWN_ERROR);
        } catch (IOException e3) {
            return new AccountRemovalResponse(izj.UNKNOWN_ERROR);
        }
    }

    /* renamed from: a */
    public final ClearTokenResponse mo12027a(ClearTokenRequest clearTokenRequest) {
        adyd a = adyd.m51363a(this.f18573d.context);
        sdo.checkIfNull(clearTokenRequest, "clearTokenRequest cannot be null!");
        a.mo33921b("com.google", clearTokenRequest.f10609b);
        a.mo33921b("cn.google", clearTokenRequest.f10609b);
        return new ClearTokenResponse(izj.SUCCESS);
    }

    /* renamed from: a */
    public final GoogleAccountData mo12028a(Account account) {
        if (!soz.m35791a(this.f18573d.context, account)) {
            return null;
        }
        Set set = (Set) this.f18577h.mo12090a(account, gqd.f18812f);
        return new GoogleAccountData(account, ((Boolean) this.f18577h.mo12090a(account, gqd.f18815i)).booleanValue(), set != null ? new ArrayList(set) : new ArrayList(), (String) this.f18577h.mo12090a(account, gqd.f18813g), (String) this.f18577h.mo12090a(account, gqd.f18814h));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0217, code lost:
        if (android.text.TextUtils.isEmpty(r7) == false) goto L_0x0219;
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x022a A[Catch:{ IOException -> 0x02ee, all -> 0x02df, gkn -> 0x0024, rqy -> 0x02f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x025f A[Catch:{ IOException -> 0x02ee, all -> 0x02df, gkn -> 0x0024, rqy -> 0x02f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0260 A[Catch:{ IOException -> 0x02ee, all -> 0x02df, gkn -> 0x0024, rqy -> 0x02f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02ba A[Catch:{ IOException -> 0x02ee, all -> 0x02df, gkn -> 0x0024, rqy -> 0x02f9 }] */
    /* renamed from: a */
    public final TokenResponse mo12029a(AccountSignInRequest accountSignInRequest) {
        gkm gkm;
        String str;
        TokenResponse tokenResponse;
        glu a;
        String a2;
        gnc gnc = new gnc(this.f18573d.context, accountSignInRequest);
        try {
            AccountSignInRequest accountSignInRequest2 = gnc.f18664f;
            String str2 = accountSignInRequest2.f10596f.f10829c;
            AppDescription appDescription = accountSignInRequest2.f10592b;
            if (appDescription != null) {
                gkm = gnc.f18665g.mo11990a(appDescription.f10841e);
            } else {
                gkm = null;
            }
            glw glw = gnc.f18663e;
            glw.mo12054a("created", gnc.f18664f.f10593c);
            glw.mo12043a(gnc.f18664f.f10596f);
            glw.mo12044a(gnc.f18664f.f10595e);
            glw.mo12053a("droidguard_results", glq.m13398a(gnc.f18660b, "addAccount", str2));
            glw.mo12047c(gnc.f18664f.f10596f.f10834h);
            glw.mo12046b(gnc.f18664f.f10596f.f10833g);
            if (cbzn.f178592a.mo6606a().mo75635b()) {
                gnc.f18663e.mo12053a("build_fingerprint", Build.FINGERPRINT);
            }
            if (cbzn.f178592a.mo6606a().mo75634a()) {
                gnc.f18663e.mo12053a("build_brand", Build.BRAND);
                gnc.f18663e.mo12053a("build_product", Build.PRODUCT);
                gnc.f18663e.mo12053a("build_device", Build.DEVICE);
            }
            if (gkm != null) {
                gnc.f18663e.mo12058b(gkm.f18410a, gkm.f18411b);
            }
            if (str2 != null) {
                gnc.f18663e.mo12045a(str2);
            }
            gnc.f18663e.mo12055a(gnc.f18659a);
            HttpResponse a3 = gmv.m13464a(gnv.m13522aD(), gnc.f18660b.getPackageName(), new UrlEncodedFormEntity(gnc.f18663e.mo12052a()), gnc.f18660b);
            byte[] a4 = gnc.m13479a(a3);
            a3.getStatusLine().getStatusCode();
            if (a4 == null) {
                str = "";
            } else {
                str = new String(a4, bmwy.f131158c);
            }
            glz glz = new glz(str);
            if (glz.mo12063a(glz.f18612p) != izj.SUCCESS) {
                tokenResponse = new TokenResponse();
                tokenResponse.mo7646a((izj) glz.mo12063a(glz.f18612p));
                String str3 = (String) glz.mo12063a(glz.f18598b);
                String str4 = (String) glz.mo12063a(glz.f18599c);
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                    tokenResponse.f10737n = gnc.m13478a(gnc.f18660b, str3, str4);
                }
                String str5 = (String) glz.mo12063a(glz.f18602f);
                String str6 = (String) glz.mo12063a(glz.f18609m);
                if (!TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str5)) {
                    tokenResponse.f10728e = str6;
                    tokenResponse.f10729f = str5;
                }
            } else {
                String str7 = (String) glz.mo12063a(glz.f18601e);
                if (!TextUtils.isEmpty(str7)) {
                    Account account = new Account(str7, gnc.f18664f.f10596f.f10835i);
                    List list = (List) glz.mo12063a(glz.f18611o);
                    String str8 = (String) glz.mo12063a(glz.f18603g);
                    String str9 = (String) glz.mo12063a(glz.f18604h);
                    boolean z = gnc.f18664f.f10596f.f10828b;
                    gny a5 = gny.m13584a();
                    a5.mo12083a(gqd.f18807a, (String) glz.mo12063a(glz.f18605i));
                    a5.mo12083a(gqd.f18813g, (String) glz.mo12063a(glz.f18603g));
                    a5.mo12083a(gqd.f18814h, (String) glz.mo12063a(glz.f18604h));
                    a5.mo12083a(gqd.f18809c, (String) glz.mo12063a(glz.f18597a));
                    a5.mo12083a(gqd.f18815i, Boolean.valueOf(z));
                    if (list != null) {
                        a5.mo12083a(gqd.f18812f, new HashSet(list));
                    }
                    gnc.f18662d.mo12093a(account, a5);
                    a = glu.m13415a(gnc.f18660b);
                    a2 = a.mo12037a();
                    a.mo12040a(account.name, 1, null);
                    a.mo12039a(a2);
                    String str10 = (String) gnc.f18662d.mo12090a(account, gqd.f18807a);
                    if (glz.mo12063a(glz.f18605i) != null) {
                        if (!((String) glz.mo12063a(glz.f18605i)).equals(str10)) {
                        }
                        if (gnv.m13573r()) {
                            SyncAdapterType[] syncAdapterTypes = ContentResolver.getSyncAdapterTypes();
                            for (SyncAdapterType syncAdapterType : syncAdapterTypes) {
                                if (account.type.equals(syncAdapterType.accountType) && ContentResolver.getIsSyncable(account, syncAdapterType.authority) == 0) {
                                    ContentResolver.setIsSyncable(account, syncAdapterType.authority, -1);
                                    ContentResolver.requestSync(account, syncAdapterType.authority, new Bundle());
                                }
                            }
                        }
                        if (!gnc.f18664f.f10594d) {
                            gnc.f18661c.mo19592a(account);
                        }
                        TokenResponse tokenResponse2 = new TokenResponse();
                        tokenResponse2.mo7646a(izj.SUCCESS);
                        tokenResponse2.f10745v = (String) glz.mo12063a(glz.f18600d);
                        tokenResponse2.mo7644a(account);
                        tokenResponse2.f10731h = str8;
                        tokenResponse2.f10732i = str9;
                        tokenResponse2.f10736m = z;
                        tokenResponse2.f10730g = (String) glz.mo12063a(glz.f18606j);
                        tokenResponse2.f10739p = (String) glz.mo12063a(glz.f18608l);
                        tokenResponse2.f10740q = (String) glz.mo12063a(glz.f18607k);
                        tokenResponse2.f10733j = ((Boolean) glz.mo12063a(glz.f18610n)).booleanValue();
                        tokenResponse2.f10728e = (String) glz.mo12063a(glz.f18609m);
                        if (list != null) {
                            if (list.contains("googleme")) {
                                tokenResponse2.f10734k = true;
                            } else if (list.contains("esmobile")) {
                                tokenResponse2.f10735l = true;
                            }
                        }
                        tokenResponse = tokenResponse2;
                    }
                    new grk(gnc.f18660b).mo12133a(5);
                    if (gnv.m13573r()) {
                    }
                    if (!gnc.f18664f.f10594d) {
                    }
                    TokenResponse tokenResponse22 = new TokenResponse();
                    tokenResponse22.mo7646a(izj.SUCCESS);
                    tokenResponse22.f10745v = (String) glz.mo12063a(glz.f18600d);
                    tokenResponse22.mo7644a(account);
                    tokenResponse22.f10731h = str8;
                    tokenResponse22.f10732i = str9;
                    tokenResponse22.f10736m = z;
                    tokenResponse22.f10730g = (String) glz.mo12063a(glz.f18606j);
                    tokenResponse22.f10739p = (String) glz.mo12063a(glz.f18608l);
                    tokenResponse22.f10740q = (String) glz.mo12063a(glz.f18607k);
                    tokenResponse22.f10733j = ((Boolean) glz.mo12063a(glz.f18610n)).booleanValue();
                    tokenResponse22.f10728e = (String) glz.mo12063a(glz.f18609m);
                    if (list != null) {
                    }
                    tokenResponse = tokenResponse22;
                } else {
                    throw new rqy(izj.SERVER_ERROR, "Empty email.");
                }
            }
            f18570a.mo25409a("signIn() -> %s.", tokenResponse.mo7647b());
            return tokenResponse;
        } catch (IOException e) {
            throw new rqy(izj.NETWORK_ERROR, "Error when calling server.", e);
        } catch (gkn e2) {
            throw new rqy(izj.BAD_REQUEST, "Error when fetching package info", e2);
        } catch (rqy e3) {
            f18570a.mo25408a("signIn() -> %s.", e3, e3.f43534a);
            TokenResponse tokenResponse3 = new TokenResponse();
            tokenResponse3.mo7646a(e3.f43534a);
            return tokenResponse3;
        } catch (Throwable th) {
            a.mo12039a(a2);
            throw th;
        }
    }

    /* renamed from: a */
    public final TokenResponse mo12030a(AppDescription appDescription, TokenRequest tokenRequest) {
        long j;
        rjx rjx;
        TokenResponse tokenResponse;
        TokenData tokenData;
        giq giq;
        TokenRequest tokenRequest2 = tokenRequest;
        sdo.checkIfNull(appDescription, "Calling AppDescription cannot be null!");
        sdo.checkIfNull(tokenRequest2, "TokenRequest cannot be null!");
        long j2 = tokenRequest.mo7640b().getLong("gads_service_connection_start_time_millis", -1);
        if (j2 != -1) {
            j = SystemClock.elapsedRealtime() - j2;
        } else {
            j = -1;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Context context = this.f18573d.context;
        gkr gkr = (gkr) gkr.f18427a.mo13145b();
        gns gns = (gns) gns.f18716b.mo13145b();
        gmw gmw = new gmw();
        gng gng = new gng(context);
        gnh gnh = new gnh(context);
        ies ies = (ies) ies.f20819a.mo13145b();
        long j3 = j;
        if (cbxi.f178510a.mo6606a().mo75577e()) {
            rjx = gje.m13260a(context);
        } else {
            rjx = null;
        }
        gnj gnj = r8;
        gnj gnj2 = new gnj(context, gkr, gns, gmw, gng, gnh, tokenRequest, rjx);
        try {
            if ("com.google.work".equals(gnj.f18691c.mo7637a().type)) {
                TokenRequest tokenRequest3 = gnj.f18691c;
                rjx rjx2 = gnj.f18692d;
                if (rjx2 != null) {
                    String str = tokenRequest3.f10714j.f10841e;
                    roz b = rpa.m34196b();
                    b.f43473b = new Feature[]{ghy.f18280f};
                    b.f43472a = new gjf(str);
                    if (!((Boolean) aucu.m76782a(rjx2.mo24701a(b.mo24977a()))).booleanValue()) {
                        throw new rqy(izj.SERVICE_DISABLED, "Service not whitelisted");
                    }
                }
                if (!gnj.f18689a.mo11996a(tokenRequest3.f10714j.f10841e)) {
                    throw new rqy(izj.SERVICE_DISABLED, "Service not whitelisted.");
                }
            }
            boolean d = gic.m13182a(gnj.f18691c.mo7640b()).mo11905d();
            TokenRequest tokenRequest4 = gnj.f18691c;
            if (!tokenRequest4.f10717m) {
                tokenResponse = null;
            } else if (d) {
                gns gns2 = gnj.f18690b;
                gns.m13487a(tokenRequest4);
                String str2 = tokenRequest4.f10706b;
                if (gns2.mo12081a(str2)) {
                    if (str2.startsWith("oauth2:")) {
                        Account a = tokenRequest4.mo7637a();
                        String str3 = tokenRequest4.f10706b;
                        String a2 = gns2.mo12080a(tokenRequest4, true, null);
                        HashSet hashSet = new HashSet(Arrays.asList(str3.substring(7).split(" ")));
                        goa goa = gns2.f18718d;
                        gnz gnz = gqd.f18807a;
                        String str4 = (String) goa.mo12090a(a, gqj.m13725b(a2));
                        if (str4 != null) {
                            hashSet.remove("");
                            HashSet hashSet2 = new HashSet(Arrays.asList(str4.split(" ")));
                            if (!hashSet2.containsAll(hashSet) || (giq = gns2.mo12079a(a, a2)) == null) {
                                giq = null;
                            } else {
                                giq.f18309c = true;
                                giq.f18310d = true;
                                giq.f18311e = new ArrayList(hashSet2);
                            }
                        } else {
                            gns.f18715a.logVerbose("Missing snowballing token: no granted scopes set.", new Object[0]);
                            giq = null;
                        }
                        if (giq != null) {
                            tokenData = giq.mo11915a();
                            tokenResponse = null;
                        }
                    }
                    tokenResponse = null;
                    giq a3 = gns2.mo12079a(tokenRequest4.mo7637a(), gns2.mo12080a(tokenRequest4, false, null));
                    if (a3 != null) {
                        a3.f18309c = true;
                        a3.f18310d = false;
                        tokenData = a3.mo11915a();
                    } else {
                        tokenData = null;
                    }
                } else {
                    tokenResponse = null;
                    tokenData = null;
                }
                if (tokenData != null) {
                    tokenResponse = gmw.m13469a(gnj.f18691c.mo7637a(), tokenData);
                }
            } else {
                tokenResponse = null;
            }
            if (tokenResponse == null) {
                if (!ccao.m129152c()) {
                    tokenResponse = gnj.mo12076a();
                } else {
                    gnj.mo12076a();
                    if (ieu.f20822g != null) {
                        Duration.ofMinutes(60);
                        throw new rqy(izj.INTNERNAL_ERROR, "Attenuation failed");
                    }
                    throw new rqy(izj.INTNERNAL_ERROR, "IT not found. Shouldn't happen");
                }
            }
        } catch (gkn e) {
            throw new rqy(izj.BAD_REQUEST, "Invalid package name.", e);
        } catch (gnn e2) {
            throw new rqy(izj.INTNERNAL_ERROR, "Error when reading from cache.", e2);
        } catch (ExecutionException e3) {
            throw new rqy(izj.SERVICE_DISABLED, "Internal error", e3);
        } catch (InterruptedException e4) {
            Thread.currentThread().interrupt();
            throw new rqy(izj.SERVICE_DISABLED, "Internal error", e4);
        } catch (rqy e5) {
            f18570a.mo25417e("getToken() -> %s. Account: %s, App: %s, Service: %s", e5, e5.f43534a, Logger.m35081a(tokenRequest.mo7637a()), tokenRequest2.f10714j.f10841e, tokenRequest2.f10706b);
            tokenResponse = gmw.m13470a(tokenRequest.mo7637a(), e5.f43534a);
        }
        f18570a.logVerbose("getToken() -> %s. Account: %s, App: %s, Service: %s", tokenResponse.mo7647b(), Logger.m35081a(tokenRequest.mo7637a()), tokenRequest2.f10714j.f10841e, tokenRequest2.f10706b);
        tokenResponse.f10747x.putLong("logging.internal_service_latency_millis", SystemClock.elapsedRealtime() - elapsedRealtime);
        if (j3 >= 0) {
            tokenResponse.f10747x.putLong("logging.gads_connection_latency_millis", j3);
        }
        return tokenResponse;
    }

    /* renamed from: a */
    public final TokenResponse mo12031a(gnl gnl) {
        TokenResponse tokenResponse;
        try {
            gkm a = gnl.f18705g.mo11990a(gnl.f18700b.getPackageName());
            gnl.f18704f.mo12068a(gnl.f18701c);
            if (a != null) {
                gnl.f18704f.mo12058b(a.f18410a, a.f18411b);
                gnl.f18704f.mo12054a("system_partition", a.f18413d);
            }
            CaptchaSolution captchaSolution = gnl.f18702d;
            if (captchaSolution != null) {
                gnl.f18704f.mo12069a(captchaSolution);
            }
            gnl.f18704f.mo12055a(gnl.f18699a);
            UrlEncodedFormEntity urlEncodedFormEntity = new UrlEncodedFormEntity(gnl.f18704f.mo12052a());
            String aD = gnv.m13522aD();
            String packageName = gnl.f18700b.getPackageName();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            rqv.m34278a(gnl.f18700b, linkedHashMap, packageName);
            linkedHashMap.put(urlEncodedFormEntity.getContentType().getName(), urlEncodedFormEntity.getContentType().getValue());
            HttpResponse a2 = gmv.m13464a(aD, packageName, urlEncodedFormEntity, gnl.f18700b);
            a2.getStatusLine().getStatusCode();
            glz glz = new glz(gmv.m13467b(a2));
            if (((izj) glz.mo12063a(glz.f18612p)) != izj.SUCCESS) {
                tokenResponse = new TokenResponse();
                tokenResponse.mo7646a((izj) glz.mo12063a(glz.f18612p));
                String str = (String) glz.mo12063a(glz.f18598b);
                String str2 = (String) glz.mo12063a(glz.f18599c);
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    tokenResponse.f10737n = gnc.m13478a(gnl.f18700b, str, str2);
                }
                String str3 = (String) glz.mo12063a(glz.f18602f);
                String str4 = (String) glz.mo12063a(glz.f18609m);
                if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
                    tokenResponse.f10728e = str4;
                    tokenResponse.f10729f = str3;
                }
            } else {
                Account a3 = gnl.f18701c.mo7674a();
                gnl.f18703e.mo12095b(a3, gqd.f18807a, (String) glz.mo12063a(glz.f18605i));
                tokenResponse = new TokenResponse();
                tokenResponse.mo7646a(izj.SUCCESS);
                tokenResponse.mo7644a(a3);
            }
            f18570a.mo25409a("updateCreds() -> %s.", tokenResponse.mo7647b());
            return tokenResponse;
        } catch (gkn e) {
            throw new rqy(izj.BAD_REQUEST, "Error when fetching package info", e);
        } catch (IOException e2) {
            throw new rqy(izj.NETWORK_ERROR, "Error when calling server.", e2);
        } catch (IOException e3) {
            throw new rqy(izj.INTNERNAL_ERROR, "Error when parsing the response.", e3);
        } catch (rqy e4) {
            f18570a.mo25408a("updateCreds() -> %s.", e4, e4.f43534a);
            TokenResponse tokenResponse2 = new TokenResponse();
            tokenResponse2.mo7646a(e4.f43534a);
            return tokenResponse2;
        }
    }

    /* renamed from: a */
    public final void mo12032a() {
        int callingUid = Binder.getCallingUid();
        if (!this.f18580k.mo13133b(callingUid)) {
            f18570a.mo25418e(String.format("UID %s is not device or profile owner!", Integer.valueOf(callingUid)), new Object[0]);
        }
    }
}
