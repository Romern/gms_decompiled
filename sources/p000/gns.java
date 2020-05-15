package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: gns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gns {

    /* renamed from: a */
    public static final Logger f18715a = ght.m13171a("TokenCache");

    /* renamed from: b */
    public static final imo f18716b = new gnr();

    /* renamed from: c */
    public final adyd f18717c;

    /* renamed from: d */
    public final goa f18718d;

    /* renamed from: e */
    private final gko f18719e;

    public gns() {
        srb srb = srb.f45012a;
        gko gko = (gko) gko.f18416b.mo13145b();
        adyd a = adyd.m51363a(rpr.m34216b());
        goa goa = (goa) goa.f18759a.mo13145b();
        sdo.m34959a(srb);
        sdo.m34959a(gko);
        this.f18719e = gko;
        sdo.m34959a(a);
        this.f18717c = a;
        sdo.m34959a(goa);
        this.f18718d = goa;
    }

    /* renamed from: a */
    public static void m13487a(TokenRequest tokenRequest) {
        sdo.m34959a(tokenRequest);
        sdo.m34959a(tokenRequest.mo7637a());
        sdo.m34977c(tokenRequest.f10706b);
        sdo.m34977c(tokenRequest.f10714j.f10841e);
    }

    /* renamed from: a */
    public final giq mo12079a(Account account, String str) {
        adyd adyd = this.f18717c;
        bljb a = blkh.m107281a("AccountManager.peekAuthToken");
        try {
            String peekAuthToken = adyd.f62893a.peekAuthToken(account, str);
            if (a != null) {
                a.close();
            }
            if (peekAuthToken == null) {
                return null;
            }
            giq giq = new giq();
            giq.f18307a = peekAuthToken;
            gnz gnz = gqd.f18807a;
            gnz a2 = gqj.m13724a(str);
            Long l = (Long) this.f18718d.mo12090a(account, a2);
            if (l == null) {
                giq.f18308b = null;
                return giq;
            } else if (l.longValue() < System.currentTimeMillis() / 1000) {
                this.f18718d.mo12095b(account, a2, null);
                this.f18717c.mo33921b(account.type, peekAuthToken);
                return null;
            } else {
                giq.f18308b = l;
                return giq;
            }
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final String mo12080a(TokenRequest tokenRequest, boolean z, List list) {
        String str;
        String str2 = tokenRequest.f10714j.f10841e;
        if (!z) {
            str = tokenRequest.f10706b;
            if (ccbm.f178722a.mo6606a().mo75747a() && list != null && !list.isEmpty() && str.startsWith("oauth2:server:client_id:") && str.contains(":api_scope:")) {
                int indexOf = str.indexOf(":api_scope:") + 11;
                List asList = Arrays.asList(str.substring(indexOf).split(" "));
                str = str.substring(0, indexOf) + TextUtils.join(" ", bnfi.m109235a(list).mo67502a(new gnq(asList)).mo67503a(bnnt.f131877a));
            }
        } else {
            str = "^^snowballing^^";
        }
        try {
            String str3 = this.f18719e.mo11990a(str2).f18411b;
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(':');
            sb.append(str3);
            sb.append(':');
            sb.append(str);
            TreeMap treeMap = new TreeMap();
            int i = tokenRequest.f10719o;
            if (!(i == 0 || tokenRequest.f10720p == null)) {
                treeMap.put("delegation_type", String.valueOf(i));
                treeMap.put("delegatee_user_id", tokenRequest.f10720p);
            }
            Bundle b = tokenRequest.mo7640b();
            if (b.containsKey("oauth2_include_email")) {
                treeMap.put("include_email", b.getString("oauth2_include_email"));
            }
            if (b.containsKey("oauth2_include_profile")) {
                treeMap.put("include_profile", b.getString("oauth2_include_profile"));
            }
            bsoa a = gic.m13182a(b).mo11902a();
            String str4 = null;
            if (a != null) {
                bsny bsny = a.f146360h;
                if (bsny == null) {
                    bsny = bsny.f146346c;
                }
                if ((bsny.f146348a & 1) != 0) {
                    bsny bsny2 = a.f146360h;
                    if (bsny2 == null) {
                        bsny2 = bsny.f146346c;
                    }
                    str4 = bsny2.f146349b;
                }
            }
            if (!TextUtils.isEmpty(str4)) {
                treeMap.put("token_request_options", str4);
            }
            if (treeMap.size() > 0) {
                ArrayList arrayList = new ArrayList(treeMap.size());
                for (Map.Entry entry : treeMap.entrySet()) {
                    arrayList.add(new BasicNameValuePair((String) entry.getKey(), (String) entry.getValue()));
                }
                sb.append('?');
                sb.append(URLEncodedUtils.format(arrayList, "UTF-8"));
            }
            return sb.toString();
        } catch (gkn e) {
            throw new gnn("Unable to get package signature.", e);
        }
    }

    /* renamed from: a */
    public final boolean mo12081a(String str) {
        return !str.startsWith("weblogin:");
    }
}
