package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.auth.AuthzenBeginTxData;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.ApplicationInformation;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;

/* renamed from: gnj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gnj {

    /* renamed from: a */
    public final gkr f18689a;

    /* renamed from: b */
    public final gns f18690b;

    /* renamed from: c */
    public final TokenRequest f18691c;

    /* renamed from: d */
    public final rjx f18692d;

    /* renamed from: e */
    private final Context f18693e;

    /* renamed from: f */
    private final gng f18694f;

    /* renamed from: g */
    private final gnh f18695g;

    public gnj(Context context, gkr gkr, gns gns, gmw gmw, gng gng, gnh gnh, TokenRequest tokenRequest, rjx rjx) {
        sdo.m34959a(context);
        this.f18693e = context;
        sdo.m34959a(gkr);
        this.f18689a = gkr;
        sdo.m34959a(gns);
        this.f18690b = gns;
        sdo.m34959a(gng);
        this.f18694f = gng;
        sdo.m34959a(gmw);
        sdo.m34959a(gnh);
        this.f18695g = gnh;
        sdo.m34959a(tokenRequest);
        this.f18691c = tokenRequest;
        this.f18692d = rjx;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: gma.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      gma.a(java.lang.String, java.lang.String):void
      gma.a(java.lang.String, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x029b A[Catch:{ all -> 0x0270, gkn -> 0x0a87, gnn -> 0x0a83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02bd A[Catch:{ all -> 0x0270, gkn -> 0x0a87, gnn -> 0x0a83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02dd A[Catch:{ all -> 0x0270, gkn -> 0x0a87, gnn -> 0x0a83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02fb A[Catch:{ all -> 0x0270, gkn -> 0x0a87, gnn -> 0x0a83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0332 A[Catch:{ all -> 0x0270, gkn -> 0x0a87, gnn -> 0x0a83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x033b A[Catch:{ all -> 0x0270, gkn -> 0x0a87, gnn -> 0x0a83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0368 A[Catch:{ all -> 0x0270, gkn -> 0x0a87, gnn -> 0x0a83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0377 A[Catch:{ all -> 0x0270, gkn -> 0x0a87, gnn -> 0x0a83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0380 A[Catch:{ all -> 0x0270, gkn -> 0x0a87, gnn -> 0x0a83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x039c A[Catch:{ all -> 0x0270, gkn -> 0x0a87, gnn -> 0x0a83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03a3 A[Catch:{ all -> 0x0270, gkn -> 0x0a87, gnn -> 0x0a83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03b1 A[Catch:{ all -> 0x0270, gkn -> 0x0a87, gnn -> 0x0a83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0419 A[Catch:{ all -> 0x0270, gkn -> 0x0a87, gnn -> 0x0a83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0425 A[Catch:{ all -> 0x0270, gkn -> 0x0a87, gnn -> 0x0a83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0426 A[Catch:{ all -> 0x0270, gkn -> 0x0a87, gnn -> 0x0a83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0441 A[Catch:{ all -> 0x0270, gkn -> 0x0a87, gnn -> 0x0a83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x044f A[Catch:{ all -> 0x0270, gkn -> 0x0a87, gnn -> 0x0a83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x045c A[Catch:{ all -> 0x0270, gkn -> 0x0a87, gnn -> 0x0a83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x049d A[Catch:{ all -> 0x0270, gkn -> 0x0a87, gnn -> 0x0a83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x049f A[Catch:{ all -> 0x0270, gkn -> 0x0a87, gnn -> 0x0a83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x04b3 A[Catch:{ all -> 0x0270, gkn -> 0x0a87, gnn -> 0x0a83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x053b A[Catch:{ IOException -> 0x0a5b, all -> 0x0874, all -> 0x087c, gid | IOException -> 0x07e1, gnn -> 0x0a67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x053e A[Catch:{ IOException -> 0x0a5b, all -> 0x0874, all -> 0x087c, gid | IOException -> 0x07e1, gnn -> 0x0a67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0563 A[Catch:{ IOException -> 0x0a5b, all -> 0x0874, all -> 0x087c, gid | IOException -> 0x07e1, gnn -> 0x0a67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0583 A[Catch:{ IOException -> 0x0a5b, all -> 0x0874, all -> 0x087c, gid | IOException -> 0x07e1, gnn -> 0x0a67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x059f A[Catch:{ IOException -> 0x0a5b, all -> 0x0874, all -> 0x087c, gid | IOException -> 0x07e1, gnn -> 0x0a67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x060e A[Catch:{ IOException -> 0x0a5b, all -> 0x0874, all -> 0x087c, gid | IOException -> 0x07e1, gnn -> 0x0a67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x088c A[Catch:{ IOException -> 0x0a5b, all -> 0x0874, all -> 0x087c, gid | IOException -> 0x07e1, gnn -> 0x0a67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x088d A[Catch:{ IOException -> 0x0a5b, all -> 0x0874, all -> 0x087c, gid | IOException -> 0x07e1, gnn -> 0x0a67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x08d9 A[Catch:{ IOException -> 0x0a5b, all -> 0x0874, all -> 0x087c, gid | IOException -> 0x07e1, gnn -> 0x0a67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x08ee A[Catch:{ IOException -> 0x0a5b, all -> 0x0874, all -> 0x087c, gid | IOException -> 0x07e1, gnn -> 0x0a67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x0921 A[Catch:{ IOException -> 0x0a5b, all -> 0x0874, all -> 0x087c, gid | IOException -> 0x07e1, gnn -> 0x0a67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x093c A[Catch:{ IOException -> 0x0a5b, all -> 0x0874, all -> 0x087c, gid | IOException -> 0x07e1, gnn -> 0x0a67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x093d A[Catch:{ IOException -> 0x0a5b, all -> 0x0874, all -> 0x087c, gid | IOException -> 0x07e1, gnn -> 0x0a67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0956 A[Catch:{ IOException -> 0x0a5b, all -> 0x0874, all -> 0x087c, gid | IOException -> 0x07e1, gnn -> 0x0a67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x09b6 A[Catch:{ IOException -> 0x0a5b, all -> 0x0874, all -> 0x087c, gid | IOException -> 0x07e1, gnn -> 0x0a67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x013d A[Catch:{ gkn -> 0x0aa7, gnn -> 0x0a9a }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0140 A[Catch:{ gkn -> 0x0aa7, gnn -> 0x0a9a }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0177 A[Catch:{ gkn -> 0x0aa7, gnn -> 0x0a9a }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0191 A[Catch:{ gkn -> 0x0aa7, gnn -> 0x0a9a }] */
    /* renamed from: a */
    public final TokenResponse mo12076a() {
        gmk gmk;
        TokenRequest tokenRequest;
        ApplicationInformation applicationInformation;
        gmk gmk2;
        boolean z;
        boolean z2;
        TokenRequest tokenRequest2;
        TokenRequest tokenRequest3;
        gic gic;
        ApplicationInformation applicationInformation2;
        String str;
        Bundle bundle;
        ApplicationInformation applicationInformation3;
        gng gng;
        int i;
        ApplicationInformation applicationInformation4;
        String str2;
        boolean z3;
        ApplicationInformation applicationInformation5;
        String str3;
        FACLConfig fACLConfig;
        PACLConfig pACLConfig;
        bxvd bxvd;
        Bundle bundle2;
        bsoa bsoa;
        boolean z4;
        TokenRequest tokenRequest4;
        InputStream a;
        String str4;
        gmu gmu;
        boolean z5;
        TokenResponse tokenResponse;
        TokenData tokenData;
        String str5;
        bljb a2;
        Throwable th;
        AuthzenBeginTxData authzenBeginTxData;
        String str6;
        String str7;
        String str8;
        boolean z6;
        gng gng2;
        String str9;
        boolean z7;
        gng gng3;
        String str10;
        Bundle bundle3;
        gic gic2;
        ApplicationInformation applicationInformation6;
        TokenRequest tokenRequest5;
        vvl vvl;
        Throwable th2;
        Long l;
        try {
            gng gng4 = this.f18694f;
            TokenRequest tokenRequest6 = this.f18691c;
            gmk gmk3 = new gmk(gng4.f18675b);
            Account a3 = tokenRequest6.mo7637a();
            String str11 = tokenRequest6.f10706b;
            Bundle b = tokenRequest6.mo7640b();
            gic a4 = gic.m13182a(b);
            ApplicationInformation b2 = a4.mo11903b();
            if (b2 == null) {
                AppDescription appDescription = tokenRequest6.f10714j;
                gkm a5 = gng4.f18676c.mo11990a(appDescription.f10841e);
                if (gnv.m13546as()) {
                    if (gnv.m13547at() != appDescription.f10838b) {
                        tokenRequest = tokenRequest6;
                        gmk = gmk3;
                    } else if (a3 != null && a3.name.endsWith("cloudtestlabaccounts.com")) {
                        tokenRequest = tokenRequest6;
                        gmk = gmk3;
                        a5 = new gkm(a5.f18410a, gnv.m13548au(), false, a5.f18413d, a5.f18414e);
                    }
                    b2 = new ApplicationInformation(a5.f18410a, a5.f18411b, a5.f18412c, a5.f18413d);
                }
                tokenRequest = tokenRequest6;
                gmk = gmk3;
                b2 = new ApplicationInformation(a5.f18410a, a5.f18411b, a5.f18412c, a5.f18413d);
            } else {
                tokenRequest = tokenRequest6;
                gmk = gmk3;
            }
            if (b.containsKey("clientPackageName")) {
                gkm a6 = gng4.f18676c.mo11990a(b.getString("clientPackageName"));
                applicationInformation = new ApplicationInformation(a6.f18410a, a6.f18411b, a6.f18412c, a6.f18413d);
            } else {
                applicationInformation = b2;
            }
            String str12 = (String) gng4.f18678e.mo12090a(a3, gqd.f18807a);
            if (!TextUtils.isEmpty(str12)) {
                ArrayList arrayList = new ArrayList();
                if (ccao.m129152c()) {
                    arrayList.add("2");
                }
                if (arrayList.isEmpty()) {
                    gmk2 = gmk;
                } else {
                    gmk2 = gmk;
                    gmk2.mo12053a("it_caveat_types", TextUtils.join(",", arrayList));
                }
                gmk2.mo12053a("Email", a3.name);
                gmk2.mo12053a("Token", str12);
                if (gnv.m13544aq()) {
                    Long l2 = (Long) gng4.f18678e.mo12090a(a3, gqd.f18818l);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (l2 == null) {
                        z = true;
                    } else if (currentTimeMillis - gnv.m13545ar() > Long.valueOf(l2.longValue()).longValue()) {
                        z = true;
                    }
                    if (cbyk.m128912b() || (l = (Long) gng4.f18678e.mo12090a(a3, gqd.f18819m)) == null) {
                        z2 = false;
                    } else {
                        z2 = l.longValue() >= System.currentTimeMillis();
                    }
                    tokenRequest2 = tokenRequest;
                    if (!tokenRequest2.f10716l) {
                        applicationInformation3 = applicationInformation;
                    } else {
                        applicationInformation3 = applicationInformation;
                        if (((double) new Random().nextFloat()) >= gnv.m13558d() && !z) {
                            if (!z2) {
                                gng = gng4;
                                str = str11;
                                bundle = b;
                                gic = a4;
                                applicationInformation2 = b2;
                                tokenRequest3 = tokenRequest2;
                                TokenRequest tokenRequest7 = tokenRequest3;
                                i = tokenRequest7.f10719o;
                                if (!(i == 0 || (str8 = tokenRequest7.f10720p) == null)) {
                                    gmk2.mo12053a("delegation_type", String.valueOf(i));
                                    gmk2.mo12053a("delegatee_user_id", str8);
                                }
                                if (gic.mo11905d()) {
                                    if (tokenRequest7.mo7641c() != iyb.GRANTED) {
                                        applicationInformation4 = applicationInformation2;
                                        str2 = str;
                                        if (!gng.f18677d.mo12078a(a3, applicationInformation4.f10844b, str2)) {
                                            z3 = false;
                                        }
                                    } else {
                                        str2 = str;
                                        applicationInformation4 = applicationInformation2;
                                    }
                                    z3 = true;
                                } else {
                                    str2 = str;
                                    applicationInformation4 = applicationInformation2;
                                    z3 = tokenRequest7.mo7641c() == iyb.GRANTED;
                                }
                                gmk2.mo12054a("has_permission", z3);
                                gmk2.mo12053a("service", str2);
                                gmk2.mo12053a("app", applicationInformation4.f10844b);
                                gmk2.mo12053a("client_sig", applicationInformation4.f10845c);
                                gmk2.mo12054a("system_partition", applicationInformation4.f10847e);
                                applicationInformation5 = applicationInformation3;
                                gmk2.mo12064a(applicationInformation5);
                                str3 = tokenRequest7.f10722r;
                                if (str3 != null) {
                                    gmk2.mo12053a("consent_result", str3);
                                }
                                fACLConfig = tokenRequest7.f10709e;
                                if (fACLConfig != null) {
                                    if (fACLConfig.f10863g) {
                                        if (!fACLConfig.f10861e) {
                                            gmk2.mo12059d("is_all_circles_visible");
                                            gmk2.mo12059d("visible_edges");
                                            if (!fACLConfig.f10862f) {
                                                if (!fACLConfig.f10860d) {
                                                    str6 = "0";
                                                } else {
                                                    str6 = "1";
                                                }
                                                gmk2.mo12053a("is_all_contacts_visible", str6);
                                            } else {
                                                gmk2.mo12059d("is_all_contacts_visible");
                                            }
                                        }
                                    }
                                    if (!fACLConfig.f10858b) {
                                        str7 = "0";
                                    } else {
                                        str7 = "1";
                                    }
                                    gmk2.mo12053a("is_all_circles_visible", str7);
                                    gmk2.mo12053a("visible_edges", fACLConfig.f10859c);
                                    if (!fACLConfig.f10862f) {
                                    }
                                }
                                pACLConfig = tokenRequest7.f10710f;
                                if (pACLConfig != null) {
                                    gmk2.mo12053a("request_visible_actions", pACLConfig.f10878b);
                                    String str13 = pACLConfig.f10879c;
                                    if (str13 != null) {
                                        gmk2.mo12053a("p_acl_picker_data", str13);
                                    } else {
                                        gmk2.mo12059d("p_acl_picker_data");
                                    }
                                }
                                if (gic.mo11902a() == null) {
                                    bxvd = bsoa.f146351k.mo74144da();
                                } else {
                                    bxvd = bsoa.f146351k.mo74141a(gic.mo11902a());
                                }
                                if (applicationInformation5.f10846d) {
                                    bundle2 = bundle;
                                    boolean z8 = bundle2.getBoolean("is_consent_auto_approved_by_google_now", false);
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = false;
                                    }
                                    bsoa bsoa2 = (bsoa) bxvd.f164949b;
                                    bsoa2.f146353a |= 1;
                                    bsoa2.f146354b = z8;
                                    if (bundle2.containsKey("reauth_proof_token")) {
                                        String string = bundle2.getString("reauth_proof_token");
                                        if (bxvd.f164950c) {
                                            bxvd.mo74035c();
                                            bxvd.f164950c = false;
                                        }
                                        bsoa bsoa3 = (bsoa) bxvd.f164949b;
                                        string.getClass();
                                        bsoa3.f146353a |= 4;
                                        bsoa3.f146356d = string;
                                    }
                                    String str14 = tokenRequest7.f10721q;
                                    if (str14 != null) {
                                        if (bxvd.f164950c) {
                                            bxvd.mo74035c();
                                            bxvd.f164950c = false;
                                        }
                                        bsoa bsoa4 = (bsoa) bxvd.f164949b;
                                        str14.getClass();
                                        bsoa4.f146353a |= 2;
                                        bsoa4.f146355c = str14;
                                    }
                                } else {
                                    bundle2 = bundle;
                                    bxvd = bsoa.f146351k.mo74144da();
                                }
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                bsoa bsoa5 = (bsoa) bxvd.f164949b;
                                bsoa5.f146359g = 1;
                                bsoa5.f146353a |= 64;
                                bsoa = (bsoa) bxvd.mo74062i();
                                if (bsoa != null) {
                                    gmk2.mo12053a("token_request_options", sqd.m35970c(bsoa.mo73642k()));
                                } else {
                                    gmk2.mo12059d("token_request_options");
                                }
                                if (gnv.m13581z() != 0) {
                                    Long l3 = (Long) gng.f18678e.mo12090a(tokenRequest7.mo7637a(), gqd.f18811e);
                                    long currentTimeMillis2 = System.currentTimeMillis();
                                    if (l3 == null) {
                                        z4 = true;
                                    } else if (currentTimeMillis2 - Long.valueOf(l3.longValue()).longValue() > gnv.m13581z() * 1000) {
                                        z4 = true;
                                    }
                                    gmk2.mo12054a("check_email", z4);
                                    gmk2.mo12054a("get_accountid", gng.f18678e.mo12090a(a3, gqd.f18809c) != null);
                                    for (String str15 : bundle2.keySet()) {
                                        if (!str15.startsWith("_opt_")) {
                                            if (str15.startsWith("oauth2_")) {
                                                if (!applicationInformation5.f10846d) {
                                                    if (!str15.equals("oauth2_foreground")) {
                                                    }
                                                }
                                                String string2 = bundle2.getString(str15);
                                                sdo.m34974b(str15.startsWith("oauth2_"));
                                                gmk2.mo12053a(str15, string2);
                                            }
                                        } else if (applicationInformation4.f10846d) {
                                            String string3 = bundle2.getString(str15);
                                            sdo.m34974b(str15.startsWith("_opt_"));
                                            gmk2.mo12053a(str15, string3);
                                            gmk2.mo12053a(str15.substring(5), string3);
                                        }
                                    }
                                    gmk2.mo12055a(gng.f18674a);
                                    List a7 = gmk2.mo12052a();
                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                    HttpResponse a8 = gmv.m13464a(gnv.m13522aD(), this.f18691c.f10714j.f10841e, new UrlEncodedFormEntity(a7), this.f18693e);
                                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                    gnh gnh = this.f18695g;
                                    tokenRequest4 = this.f18691c;
                                    a = abop.m48011a(a8.getEntity());
                                    if (a != null) {
                                        str4 = "";
                                    } else {
                                        str4 = new String(srz.m36178b(a), bmwy.f131158c);
                                    }
                                    a8.getStatusLine().getStatusCode();
                                    String str16 = tokenRequest4.f10706b;
                                    if (!gic.m13182a(tokenRequest4.mo7640b()).mo11905d()) {
                                        z5 = tokenRequest4.mo7641c() != iyb.GRANTED ? gnh.f18682c.mo12078a(tokenRequest4.mo7637a(), tokenRequest4.f10714j.f10841e, tokenRequest4.f10706b) : true;
                                    } else {
                                        z5 = tokenRequest4.mo7641c() == iyb.GRANTED;
                                    }
                                    gmu = new gmu(str4, str16, z5);
                                    Account a9 = tokenRequest4.mo7637a();
                                    if (gmu.mo12063a(gmu.f18638i) != izj.NEED_PERMISSION) {
                                        tokenResponse = new TokenResponse();
                                        tokenResponse.mo7644a(a9);
                                        tokenResponse.mo7646a(izj.NEED_PERMISSION);
                                        jex jex = (jex) gmu.mo12063a(gmu.f18642m);
                                        if (jex != null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            bxwc bxwc = jex.f22318a;
                                            int size = bxwc.size();
                                            for (int i2 = 0; i2 < size; i2++) {
                                                arrayList2.add(ilt.m15673a((jfd) bxwc.get(i2)));
                                            }
                                            tokenResponse.f10741r = false;
                                            int a10 = jew.m16630a(jex.f22319b);
                                            if (a10 == 0) {
                                                a10 = 1;
                                            }
                                            tokenResponse.f10742s = a10 - 1;
                                            tokenResponse.f10738o.clear();
                                            tokenResponse.f10738o.addAll(arrayList2);
                                            tokenResponse.f10748y = jex.f22320c;
                                        }
                                        if (gmu.mo12063a(gmu.f18643n) != null) {
                                            tokenResponse.f10749z = gmw.m13468a((jfc) gmu.mo12063a(gmu.f18643n));
                                        }
                                    } else if (gmu.mo12063a(gmu.f18638i) == izj.NEED_REMOTE_CONSENT) {
                                        tokenResponse = new TokenResponse();
                                        tokenResponse.mo7644a(a9);
                                        tokenResponse.mo7646a(izj.NEED_REMOTE_CONSENT);
                                        if (gmu.mo12063a(gmu.f18643n) != null) {
                                            tokenResponse.f10749z = gmw.m13468a((jfc) gmu.mo12063a(gmu.f18643n));
                                        }
                                        try {
                                            byte[] bArr = (byte[]) gmu.mo12063a(gmu.f18644o);
                                            authzenBeginTxData = bArr != null ? new AuthzenBeginTxData(Integer.parseInt((String) gmu.mo12063a(gmu.f18635f)), bArr) : null;
                                        } catch (NumberFormatException e) {
                                            authzenBeginTxData = null;
                                        }
                                        if (authzenBeginTxData != null) {
                                            tokenResponse.f10723A = authzenBeginTxData;
                                        }
                                    } else {
                                        if (cbyk.m128912b()) {
                                            if (gmu.mo12063a(gmu.f18636g) != null) {
                                                try {
                                                    gnh.f18684e.mo12095b(a9, gqd.f18819m, Long.valueOf(System.currentTimeMillis() + Long.parseLong((String) gmu.mo12063a(gmu.f18636g))));
                                                } catch (NumberFormatException e2) {
                                                    sek sek = gnh.f18680a;
                                                    String valueOf = String.valueOf((String) gmu.mo12063a(gmu.f18636g));
                                                    sek.mo25414c(valueOf.length() == 0 ? new String("Invalid Rdg param ") : "Invalid Rdg param ".concat(valueOf), new Object[0]);
                                                }
                                            }
                                        }
                                        if (gmu.mo12063a(gmu.f18638i) != izj.SUCCESS) {
                                            izj izj = (izj) gmu.mo12063a(gmu.f18638i);
                                            if (izj.DEVICE_MANAGEMENT_REQUIRED.equals(izj) || izj.DM_INTERNAL_ERROR.equals(izj) || izj.DM_SYNC_DISABLED.equals(izj) || izj.DM_ADMIN_BLOCKED.equals(izj) || izj.DM_ADMIN_PENDING_APPROVAL.equals(izj) || izj.DM_STALE_SYNC_REQUIRED.equals(izj) || izj.DM_DEACTIVATED.equals(izj) || izj.DM_REQUIRED.equals(izj) || izj.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(izj) || izj.DM_SCREENLOCK_REQUIRED.equals(izj)) {
                                                gnh.f18684e.mo12095b(a9, gqd.f18810d, ((izj) gmu.mo12063a(gmu.f18638i)).f22000ac);
                                            } else if (gmu.mo12063a(gmu.f18638i) == izj.BAD_AUTHENTICATION) {
                                                gnh.f18680a.mo25414c("Server returned bad_auth, clearing LST", new Object[0]);
                                                gnh.f18684e.mo12095b(a9, gqd.f18807a, null);
                                            }
                                            tokenResponse = gmw.m13470a(a9, (izj) gmu.mo12063a(gmu.f18638i));
                                        } else {
                                            if (ccao.m129152c()) {
                                                if (gmu.mo12067a()) {
                                                    bsne bsne = (bsne) gmu.mo12063a(gmu.f18640k);
                                                    bsnd bsnd = (bsnd) gmu.mo12063a(gmu.f18641l);
                                                    Long l4 = (Long) gmu.mo12063a(gmu.f18637h);
                                                    if (bsne != null) {
                                                        if (!(bsnd == null || l4 == null)) {
                                                            ieu a11 = gnh.mo12075a(bsne, bsnd, Duration.ofSeconds(l4.longValue()));
                                                            ieq ieq = gnh.f18687h;
                                                            String str17 = a9.name;
                                                            String str18 = tokenRequest4.f10714j.f10841e;
                                                            String str19 = acyr.m50017a(ieq.f20817b.f20844a, new Account(str17, "com.google")).f61090d;
                                                            StringBuilder sb = new StringBuilder(String.valueOf(str18).length() + 1);
                                                            sb.append(str18);
                                                            sb.append(":");
                                                            sb.append("");
                                                            bqfy.m112768a(ieq.f20818c.mo60777a(new ieo(str19, sb.toString(), UUID.randomUUID().toString(), a11), bqfb.INSTANCE), IOException.class);
                                                            tokenData = null;
                                                            str5 = (String) gmu.mo12063a(gmu.f18632c);
                                                            if (str5 == null) {
                                                                if (!str5.equals(gnh.f18684e.mo12090a(a9, gqd.f18807a))) {
                                                                    gnh.f18680a.mo25414c("Switching LST", new Object[0]);
                                                                    gnh.f18684e.mo12095b(a9, gqd.f18807a, str5);
                                                                    String str20 = (String) gmu.mo12063a(gmu.f18631b);
                                                                    if (!TextUtils.isEmpty(str20) && str20.equalsIgnoreCase(a9.name)) {
                                                                        new grk(gnh.f18686g).mo12133a(6);
                                                                    }
                                                                }
                                                            }
                                                            gny a12 = gny.m13584a();
                                                            if (gmu.mo12063a(gmu.f18630a) != null) {
                                                                a12.mo12083a(gqd.f18809c, (String) gmu.mo12063a(gmu.f18630a));
                                                            }
                                                            if (gmu.mo12063a(gmu.f18631b) != null) {
                                                                gnh.f18680a.mo25414c("Renaming account as TokenResponse contains EMAIL", new Object[0]);
                                                                gnh.f18685f.mo11983a(a9, new Account((String) gmu.mo12063a(gmu.f18631b), a9.type));
                                                                a12.mo12083a(gqd.f18811e, Long.valueOf(System.currentTimeMillis()));
                                                            }
                                                            if (gmu.mo12063a(gmu.f18634e) != null) {
                                                                a12.mo12083a(gqd.f18812f, bnpf.m110049a((Iterable) gmu.mo12063a(gmu.f18634e)));
                                                            }
                                                            if (gnh.f18681b.contains(tokenRequest4.f10706b)) {
                                                                a12.mo12083a(gqd.f18810d, null);
                                                            }
                                                            gnh.f18684e.mo12094b(a9, a12);
                                                            if (!((Boolean) gmu.mo12063a(gmu.f18633d)).booleanValue()) {
                                                                gnp gnp = gnh.f18682c;
                                                                String a13 = gnp.mo12077a(tokenRequest4.f10714j.f10841e, tokenRequest4.f10706b);
                                                                gnp.f18712b.mo12095b(a9, gqb.m13700a(a13), null);
                                                                gnp.f18712b.mo12095b(a9, gqb.m13708i(a13), null);
                                                                gnp.f18712b.mo12095b(a9, gqb.m13707h(a13), null);
                                                                gnp.f18712b.mo12095b(a9, gqb.m13701b(a13), null);
                                                                gnp.f18712b.mo12095b(a9, gqb.m13706g(a13), null);
                                                                gnp.f18712b.mo12095b(a9, gqb.m13702c(a13), null);
                                                                gnp.f18712b.mo12095b(a9, gqb.m13703d(a13), null);
                                                                gnp.f18712b.mo12095b(a9, gqb.m13704e(a13), null);
                                                                gnp.f18712b.mo12095b(a9, gqb.m13705f(a13), null);
                                                            } else {
                                                                gnp gnp2 = gnh.f18682c;
                                                                String str21 = tokenRequest4.f10714j.f10841e;
                                                                String str22 = tokenRequest4.f10706b;
                                                                PACLConfig pACLConfig2 = tokenRequest4.f10710f;
                                                                FACLConfig fACLConfig2 = tokenRequest4.f10709e;
                                                                String a14 = gnp2.mo12077a(str21, str22);
                                                                gnp2.f18712b.mo12095b(a9, gqb.m13700a(a14), true);
                                                                if (pACLConfig2 != null) {
                                                                    gnp2.f18712b.mo12095b(a9, gqb.m13708i(a14), pACLConfig2.f10878b);
                                                                    String str23 = pACLConfig2.f10879c;
                                                                    goa goa = gnp2.f18712b;
                                                                    gnz h = gqb.m13707h(a14);
                                                                    if (str23 == null) {
                                                                        str23 = "";
                                                                    }
                                                                    goa.mo12095b(a9, h, str23);
                                                                }
                                                                if (fACLConfig2 != null) {
                                                                    gnp2.f18712b.mo12095b(a9, gqb.m13701b(a14), Boolean.valueOf(fACLConfig2.f10858b));
                                                                    gnp2.f18712b.mo12095b(a9, gqb.m13706g(a14), fACLConfig2.f10859c);
                                                                    gnp2.f18712b.mo12095b(a9, gqb.m13702c(a14), Boolean.valueOf(fACLConfig2.f10860d));
                                                                    gnp2.f18712b.mo12095b(a9, gqb.m13703d(a14), Boolean.valueOf(fACLConfig2.f10863g));
                                                                    gnp2.f18712b.mo12095b(a9, gqb.m13704e(a14), Boolean.valueOf(fACLConfig2.f10861e));
                                                                    gnp2.f18712b.mo12095b(a9, gqb.m13705f(a14), Boolean.valueOf(fACLConfig2.f10862f));
                                                                }
                                                            }
                                                            tokenResponse = gmw.m13469a(a9, tokenData);
                                                        }
                                                    }
                                                    gnh.f18680a.mo25416d("Couldn't parse IT or ITMetadata or Expiry time. Returning error", new Object[0]);
                                                    tokenResponse = gmw.m13470a(a9, izj.SERVER_ERROR);
                                                }
                                            }
                                            tokenData = (TokenData) gmu.mo12063a(gmu.f18639j);
                                            if (tokenData != null) {
                                                if (!gmu.mo12067a()) {
                                                    if (gic.m13182a(tokenRequest4.mo7640b()).mo11905d()) {
                                                        gns gns = gnh.f18683d;
                                                        gns.m13487a(tokenRequest4);
                                                        sdo.m34959a(tokenData);
                                                        Account a15 = tokenRequest4.mo7637a();
                                                        if (gns.mo12081a(tokenRequest4.f10706b)) {
                                                            String a16 = gns.mo12080a(tokenRequest4, tokenData.f9947e, tokenData.f9948f);
                                                            adyd adyd = gns.f18717c;
                                                            String str24 = tokenData.f9944b;
                                                            a2 = blkh.m107281a("AccountManager.setAuthToken");
                                                            adyd.f62893a.setAuthToken(a15, a16, str24);
                                                            if (a2 != null) {
                                                                a2.close();
                                                            }
                                                            if (tokenData.f9945c != null) {
                                                                gns.f18718d.mo12095b(a15, gqj.m13724a(a16), tokenData.f9945c);
                                                            }
                                                            if (tokenData.f9947e) {
                                                                gns.f18718d.mo12095b(a15, gqj.m13725b(a16), TextUtils.join(" ", tokenData.f9948f));
                                                            }
                                                        }
                                                    }
                                                    str5 = (String) gmu.mo12063a(gmu.f18632c);
                                                    if (str5 == null) {
                                                    }
                                                    gny a122 = gny.m13584a();
                                                    if (gmu.mo12063a(gmu.f18630a) != null) {
                                                    }
                                                    if (gmu.mo12063a(gmu.f18631b) != null) {
                                                    }
                                                    if (gmu.mo12063a(gmu.f18634e) != null) {
                                                    }
                                                    if (gnh.f18681b.contains(tokenRequest4.f10706b)) {
                                                    }
                                                    gnh.f18684e.mo12094b(a9, a122);
                                                    if (!((Boolean) gmu.mo12063a(gmu.f18633d)).booleanValue()) {
                                                    }
                                                    tokenResponse = gmw.m13469a(a9, tokenData);
                                                }
                                            }
                                            tokenResponse = gmw.m13470a(a9, izj.SERVER_ERROR);
                                        }
                                    }
                                    tokenResponse.f10747x.putLong("logging.network_latency_millis", elapsedRealtime2);
                                    return tokenResponse;
                                }
                                z4 = false;
                                gmk2.mo12054a("check_email", z4);
                                gmk2.mo12054a("get_accountid", gng.f18678e.mo12090a(a3, gqd.f18809c) != null);
                                while (r1.hasNext()) {
                                }
                                gmk2.mo12055a(gng.f18674a);
                                List a72 = gmk2.mo12052a();
                                long elapsedRealtime3 = SystemClock.elapsedRealtime();
                                HttpResponse a82 = gmv.m13464a(gnv.m13522aD(), this.f18691c.f10714j.f10841e, new UrlEncodedFormEntity(a72), this.f18693e);
                                long elapsedRealtime22 = SystemClock.elapsedRealtime() - elapsedRealtime3;
                                try {
                                    gnh gnh2 = this.f18695g;
                                    tokenRequest4 = this.f18691c;
                                    a = abop.m48011a(a82.getEntity());
                                    if (a != null) {
                                    }
                                    a82.getStatusLine().getStatusCode();
                                    String str162 = tokenRequest4.f10706b;
                                    if (!gic.m13182a(tokenRequest4.mo7640b()).mo11905d()) {
                                    }
                                    gmu = new gmu(str4, str162, z5);
                                    Account a92 = tokenRequest4.mo7637a();
                                    if (gmu.mo12063a(gmu.f18638i) != izj.NEED_PERMISSION) {
                                    }
                                    tokenResponse.f10747x.putLong("logging.network_latency_millis", elapsedRealtime22);
                                    return tokenResponse;
                                } catch (IOException e3) {
                                    throw new rqy(izj.INTNERNAL_ERROR, "Error when parsing the response.", e3);
                                } catch (gid | IOException e4) {
                                    throw new gnn(e4);
                                } catch (gnn e5) {
                                    throw new rqy(izj.INTNERNAL_ERROR, "Error saving the data.", e5);
                                } catch (Throwable th3) {
                                    bqye.m113761a(th, th3);
                                }
                            }
                        }
                    }
                    glq glq = gng4.f18679f;
                    String str25 = a3.name;
                    sdo.m34966a((Object) "getToken", (Object) "flowName cannot be null!");
                    if (gnv.m13504N()) {
                        glq.f18566a.mo25409a("DroidGuard is turned off", new Object[0]);
                        z6 = z;
                        gng2 = gng4;
                        str = str11;
                        bundle = b;
                        gic = a4;
                        applicationInformation2 = b2;
                        tokenRequest3 = tokenRequest2;
                        str9 = null;
                    } else {
                        if (gnv.m13517a() > 0) {
                            try {
                                if (rfi.f42868a.mo24590b(glq.f18568c) == 0) {
                                    synchronized (glq.f18567b) {
                                        vvl = (vvl) glq.f18567b.get("getToken");
                                        if (vvl == null) {
                                            vvi vvi = new vvi(glq.f18568c.getApplicationContext(), "getToken");
                                            bundle = b;
                                            vvi.f50030e = gnv.m13554b();
                                            vvi.f50031f = gnv.m13517a();
                                            str = str11;
                                            applicationInformation2 = b2;
                                            gic = a4;
                                            z6 = z;
                                            gng2 = gng4;
                                            tokenRequest3 = tokenRequest2;
                                            vvl vvl2 = new vvl(new ArrayBlockingQueue(100), vvi.f50028c, vvi.f50026a, vvi.f50029d, vvi.f50030e, vvi.f50031f);
                                            glq.f18567b.put("getToken", vvl2);
                                            vvl = vvl2;
                                        } else {
                                            z6 = z;
                                            gng2 = gng4;
                                            str = str11;
                                            bundle = b;
                                            gic = a4;
                                            applicationInformation2 = b2;
                                            tokenRequest3 = tokenRequest2;
                                        }
                                    }
                                    try {
                                        Map a17 = glq.mo12022a(str25);
                                        synchronized (vvl.f50044i) {
                                            if (!vvl.f50044i.isAlive()) {
                                                vvl.f50044i.start();
                                            }
                                        }
                                        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
                                        if (vvl.f50043h.offer(bmxv.m108566b(new vvj(a17, arrayBlockingQueue)))) {
                                            try {
                                                str9 = (String) arrayBlockingQueue.poll(vvl.f50041f, TimeUnit.MILLISECONDS);
                                                if (str9 == null) {
                                                    str9 = vxv.m41564b("Synchronous getResults timed out.");
                                                }
                                            } catch (InterruptedException e6) {
                                                str9 = vxv.m41564b("Synchronous getResults interrupted.");
                                            }
                                        } else {
                                            str9 = vxv.m41564b("Caching client max queue size reached.");
                                        }
                                    } catch (RuntimeException th4) {
                                        glq.f18566a.mo25417e("DroidGuard runtime exception: ", th4, new Object[0]);
                                        str9 = null;
                                    } finally {
                                        while (true) {
                                        }
                                    }
                                } else {
                                    z7 = z;
                                    gng3 = gng4;
                                    str10 = str11;
                                    bundle3 = b;
                                    gic2 = a4;
                                    applicationInformation6 = b2;
                                    tokenRequest5 = tokenRequest2;
                                }
                            } catch (gkn e7) {
                                e = e7;
                                throw new rqy(izj.BAD_REQUEST, "Error when building the request.", e);
                            } catch (gnn e8) {
                                e = e8;
                                throw new rqy(izj.INTNERNAL_ERROR, "Error when building the request.", e);
                            } catch (Throwable th5) {
                                while (true) {
                                    throw th5;
                                }
                            }
                        } else {
                            z7 = z;
                            gng3 = gng4;
                            str10 = str11;
                            bundle3 = b;
                            gic2 = a4;
                            applicationInformation6 = b2;
                            tokenRequest5 = tokenRequest2;
                        }
                        str9 = glq.mo12021a("getToken", glq.mo12022a(str25));
                    }
                    if (str9 == null) {
                        gmk2.mo12053a("droidguard_results", str9);
                        if (z6) {
                            gmk2.mo12054a("droidguardPeriodicUpdate", true);
                            gng = gng2;
                            gng.f18678e.mo12095b(a3, gqd.f18818l, Long.valueOf(System.currentTimeMillis()));
                        } else {
                            gng = gng2;
                        }
                    } else {
                        gng = gng2;
                    }
                    TokenRequest tokenRequest72 = tokenRequest3;
                    i = tokenRequest72.f10719o;
                    gmk2.mo12053a("delegation_type", String.valueOf(i));
                    gmk2.mo12053a("delegatee_user_id", str8);
                    if (gic.mo11905d()) {
                    }
                    gmk2.mo12054a("has_permission", z3);
                    gmk2.mo12053a("service", str2);
                    gmk2.mo12053a("app", applicationInformation4.f10844b);
                    gmk2.mo12053a("client_sig", applicationInformation4.f10845c);
                    gmk2.mo12054a("system_partition", applicationInformation4.f10847e);
                    applicationInformation5 = applicationInformation3;
                    gmk2.mo12064a(applicationInformation5);
                    str3 = tokenRequest72.f10722r;
                    if (str3 != null) {
                    }
                    fACLConfig = tokenRequest72.f10709e;
                    if (fACLConfig != null) {
                    }
                    pACLConfig = tokenRequest72.f10710f;
                    if (pACLConfig != null) {
                    }
                    if (gic.mo11902a() == null) {
                    }
                    if (applicationInformation5.f10846d) {
                    }
                    if (bxvd.f164950c) {
                    }
                    bsoa bsoa52 = (bsoa) bxvd.f164949b;
                    bsoa52.f146359g = 1;
                    bsoa52.f146353a |= 64;
                    bsoa = (bsoa) bxvd.mo74062i();
                    if (bsoa != null) {
                    }
                    if (gnv.m13581z() != 0) {
                    }
                    z4 = false;
                    gmk2.mo12054a("check_email", z4);
                    gmk2.mo12054a("get_accountid", gng.f18678e.mo12090a(a3, gqd.f18809c) != null);
                    while (r1.hasNext()) {
                    }
                    gmk2.mo12055a(gng.f18674a);
                    List a722 = gmk2.mo12052a();
                    long elapsedRealtime32 = SystemClock.elapsedRealtime();
                    try {
                        HttpResponse a822 = gmv.m13464a(gnv.m13522aD(), this.f18691c.f10714j.f10841e, new UrlEncodedFormEntity(a722), this.f18693e);
                        long elapsedRealtime222 = SystemClock.elapsedRealtime() - elapsedRealtime32;
                        gnh gnh22 = this.f18695g;
                        tokenRequest4 = this.f18691c;
                        a = abop.m48011a(a822.getEntity());
                        if (a != null) {
                        }
                        a822.getStatusLine().getStatusCode();
                        String str1622 = tokenRequest4.f10706b;
                        if (!gic.m13182a(tokenRequest4.mo7640b()).mo11905d()) {
                        }
                        gmu = new gmu(str4, str1622, z5);
                        Account a922 = tokenRequest4.mo7637a();
                        if (gmu.mo12063a(gmu.f18638i) != izj.NEED_PERMISSION) {
                        }
                        tokenResponse.f10747x.putLong("logging.network_latency_millis", elapsedRealtime222);
                        return tokenResponse;
                    } catch (IOException e9) {
                        e = e9;
                        throw new rqy(izj.NETWORK_ERROR, "Error when calling server.", e);
                    }
                }
                z = false;
                if (cbyk.m128912b()) {
                }
                z2 = false;
                tokenRequest2 = tokenRequest;
                if (!tokenRequest2.f10716l) {
                }
                glq glq2 = gng4.f18679f;
                String str252 = a3.name;
                sdo.m34966a((Object) "getToken", (Object) "flowName cannot be null!");
                if (gnv.m13504N()) {
                }
                if (str9 == null) {
                }
                TokenRequest tokenRequest722 = tokenRequest3;
                i = tokenRequest722.f10719o;
                gmk2.mo12053a("delegation_type", String.valueOf(i));
                gmk2.mo12053a("delegatee_user_id", str8);
                if (gic.mo11905d()) {
                }
                gmk2.mo12054a("has_permission", z3);
                gmk2.mo12053a("service", str2);
                gmk2.mo12053a("app", applicationInformation4.f10844b);
                gmk2.mo12053a("client_sig", applicationInformation4.f10845c);
                gmk2.mo12054a("system_partition", applicationInformation4.f10847e);
                applicationInformation5 = applicationInformation3;
                gmk2.mo12064a(applicationInformation5);
                str3 = tokenRequest722.f10722r;
                if (str3 != null) {
                }
                fACLConfig = tokenRequest722.f10709e;
                if (fACLConfig != null) {
                }
                pACLConfig = tokenRequest722.f10710f;
                if (pACLConfig != null) {
                }
                if (gic.mo11902a() == null) {
                }
                if (applicationInformation5.f10846d) {
                }
                if (bxvd.f164950c) {
                }
                bsoa bsoa522 = (bsoa) bxvd.f164949b;
                bsoa522.f146359g = 1;
                bsoa522.f146353a |= 64;
                bsoa = (bsoa) bxvd.mo74062i();
                if (bsoa != null) {
                }
                if (gnv.m13581z() != 0) {
                }
                z4 = false;
                gmk2.mo12054a("check_email", z4);
                gmk2.mo12054a("get_accountid", gng.f18678e.mo12090a(a3, gqd.f18809c) != null);
                while (r1.hasNext()) {
                }
                gmk2.mo12055a(gng.f18674a);
                List a7222 = gmk2.mo12052a();
                long elapsedRealtime322 = SystemClock.elapsedRealtime();
                try {
                    HttpResponse a8222 = gmv.m13464a(gnv.m13522aD(), this.f18691c.f10714j.f10841e, new UrlEncodedFormEntity(a7222), this.f18693e);
                    long elapsedRealtime2222 = SystemClock.elapsedRealtime() - elapsedRealtime322;
                    gnh gnh222 = this.f18695g;
                    tokenRequest4 = this.f18691c;
                    a = abop.m48011a(a8222.getEntity());
                    if (a != null) {
                    }
                    a8222.getStatusLine().getStatusCode();
                    String str16222 = tokenRequest4.f10706b;
                    if (!gic.m13182a(tokenRequest4.mo7640b()).mo11905d()) {
                    }
                    gmu = new gmu(str4, str16222, z5);
                    Account a9222 = tokenRequest4.mo7637a();
                    if (gmu.mo12063a(gmu.f18638i) != izj.NEED_PERMISSION) {
                    }
                    tokenResponse.f10747x.putLong("logging.network_latency_millis", elapsedRealtime2222);
                    return tokenResponse;
                } catch (IOException e10) {
                    e = e10;
                    throw new rqy(izj.NETWORK_ERROR, "Error when calling server.", e);
                }
            } else {
                try {
                    throw new rqy(izj.BAD_AUTHENTICATION, "Long live credential not available.");
                } catch (gkn e11) {
                    e = e11;
                    throw new rqy(izj.BAD_REQUEST, "Error when building the request.", e);
                } catch (gnn e12) {
                    e = e12;
                    throw new rqy(izj.INTNERNAL_ERROR, "Error when building the request.", e);
                }
            }
            throw th;
        } catch (gkn e13) {
            e = e13;
            throw new rqy(izj.BAD_REQUEST, "Error when building the request.", e);
        } catch (gnn e14) {
            e = e14;
            throw new rqy(izj.INTNERNAL_ERROR, "Error when building the request.", e);
        }
    }
}
