package p000;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aasm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aasm {

    /* renamed from: A */
    private static int f56486A;

    /* renamed from: a */
    public static final aasm f56487a;

    /* renamed from: z */
    private static final Set f56488z = new HashSet();

    /* renamed from: B */
    private final String f56489B;

    /* renamed from: C */
    private String f56490C;

    /* renamed from: D */
    private final bzpz f56491D;

    /* renamed from: b */
    public String f56492b;

    /* renamed from: c */
    public String f56493c;

    /* renamed from: d */
    public String f56494d;

    /* renamed from: e */
    public final int f56495e;

    /* renamed from: f */
    public String f56496f;

    /* renamed from: g */
    public final String f56497g;

    /* renamed from: h */
    public final String f56498h;

    /* renamed from: i */
    public final String f56499i;

    /* renamed from: j */
    public final bzpb f56500j;

    /* renamed from: k */
    public final String f56501k;

    /* renamed from: l */
    public final boolean f56502l;

    /* renamed from: m */
    public boolean f56503m;

    /* renamed from: n */
    public String f56504n;

    /* renamed from: o */
    public long f56505o;

    /* renamed from: p */
    public final boolean f56506p;

    /* renamed from: q */
    public final String f56507q;

    /* renamed from: r */
    public final String f56508r;

    /* renamed from: s */
    public boolean f56509s;

    /* renamed from: t */
    public boolean f56510t;

    /* renamed from: u */
    public final List f56511u;

    /* renamed from: v */
    public final boolean f56512v;

    /* renamed from: w */
    public final String f56513w;

    /* renamed from: x */
    public final int f56514x;

    /* renamed from: y */
    public final int f56515y;

    static {
        aasl aasl = new aasl();
        aasl.f56465b = 5;
        f56487a = aasl.mo31714a();
    }

    public aasm(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, bzpb bzpb, String str9, String str10, long j, boolean z, boolean z2, String str11, String str12, String str13, int i2, bzpz bzpz, int i3, boolean z3) {
        bzpz bzpz2 = bzpz;
        this.f56492b = str;
        this.f56493c = str2;
        this.f56494d = str3;
        this.f56495e = i;
        this.f56496f = str4;
        this.f56489B = str5;
        this.f56497g = str6;
        this.f56498h = str7;
        this.f56499i = str8;
        this.f56500j = bzpb;
        this.f56501k = str9;
        this.f56504n = str10;
        this.f56505o = j;
        this.f56502l = z;
        this.f56506p = z2;
        this.f56507q = str11;
        this.f56508r = str12;
        this.f56513w = str13;
        this.f56515y = i2;
        if (bzpz2 == null) {
            this.f56491D = bzpz.UNKNOWN_PROMOTION_PLACEMENT;
        } else {
            this.f56491D = bzpz2;
        }
        this.f56514x = i3;
        this.f56512v = z3;
        this.f56509s = false;
        this.f56510t = false;
        this.f56511u = new ArrayList();
        this.f56490C = "";
    }

    /* renamed from: a */
    public static aasm m46877a(bzoy bzoy, String str, String str2, String str3) {
        if (bzoy != null) {
            int a = bzox.m125999a(bzoy.f170883b);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i != 2) {
                if (i != 4) {
                    if (i != 5 || (bzoy.f170882a & 16) == 0) {
                        return null;
                    }
                    bzpb bzpb = bzoy.f170886e;
                    if (bzpb == null) {
                        bzpb = bzpb.f170891d;
                    }
                    int a2 = bzpa.m126002a(bzpb.f170894b);
                    if (a2 == 0 || a2 != 2) {
                        return null;
                    }
                    bzpb bzpb2 = bzoy.f170886e;
                    if (bzpb2 == null) {
                        bzpb2 = bzpb.f170891d;
                    }
                    return m46881a(str, str2, bzpb2, str3);
                } else if ((bzoy.f170882a & 8) == 0) {
                    return null;
                } else {
                    bzpc bzpc = bzoy.f170885d;
                    if (bzpc == null) {
                        bzpc = bzpc.f170896b;
                    }
                    return m46899b(str, str2, bzpc.f170898a, str3);
                }
            } else if ((bzoy.f170882a & 2) != 0) {
                bzpe bzpe = bzoy.f170884c;
                if (bzpe == null) {
                    bzpe = bzpe.f170904b;
                }
                return m46885a(str, str2, bzpe.f170906a, str3);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f7  */
    /* renamed from: b */
    public static aasm m46897b(String str, String str2) {
        char c;
        JSONObject jSONObject = new JSONObject(str);
        if (!jSONObject.has("label")) {
            return null;
        }
        String string = jSONObject.has("description") ? jSONObject.getString("description") : "";
        String string2 = jSONObject.getString("label");
        if (!jSONObject.has("type")) {
            return null;
        }
        String string3 = jSONObject.getString("type");
        int hashCode = string3.hashCode();
        if (hashCode != -1620425664) {
            if (hashCode != -311339055) {
                if (hashCode == 639565452 && string3.equals("ANDROID_INTENT")) {
                    c = 0;
                    if (c == 0) {
                        if (c != 1) {
                            if (c != 2 || !jSONObject.has("urlNavigationDefinition")) {
                                return null;
                            }
                            JSONObject jSONObject2 = jSONObject.getJSONObject("urlNavigationDefinition");
                            if (!jSONObject2.has("url")) {
                                return null;
                            }
                            return m46899b(string2, string, jSONObject2.getString("url"), str2);
                        } else if (!jSONObject.has("androidSettingDefinition")) {
                            return null;
                        } else {
                            JSONObject jSONObject3 = jSONObject.getJSONObject("androidSettingDefinition");
                            if (!jSONObject3.has("type") || !jSONObject3.has("key") || !jSONObject3.getString("type").equals("SWITCH")) {
                                return null;
                            }
                            bxvd da = bzpb.f170891d.mo74144da();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bzpb bzpb = (bzpb) da.f164949b;
                            bzpb.f170894b = 1;
                            bzpb.f170893a |= 1;
                            String string4 = jSONObject3.getString("key");
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bzpb bzpb2 = (bzpb) da.f164949b;
                            string4.getClass();
                            bzpb2.f170893a |= 2;
                            bzpb2.f170895c = string4;
                            return m46881a(string2, string, (bzpb) da.mo74062i(), str2);
                        }
                    } else if (!jSONObject.has("intentDefinition")) {
                        return null;
                    } else {
                        JSONObject jSONObject4 = jSONObject.getJSONObject("intentDefinition");
                        if (!jSONObject4.has("intentUri")) {
                            return null;
                        }
                        return m46885a(string2, string, jSONObject4.getString("intentUri"), str2);
                    }
                }
            } else if (string3.equals("URL_NAVIGATION_ACTION")) {
                c = 2;
                if (c == 0) {
                }
            }
        } else if (string3.equals("ANDROID_SETTING")) {
            c = 1;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }

    /* renamed from: c */
    public static aasm m46902c(String str, String str2, String str3, String str4, String str5, String str6, long j) {
        aasl aasl = new aasl();
        aasl.f56464a = str;
        aasl.f56465b = 16;
        aasl.f56466c = str2;
        aasl.f56467d = str3;
        aasl.f56468e = str4;
        aasl.f56469f = str5;
        aasl.f56478o = false;
        aasl.f56473j = str6;
        aasl.f56474k = j;
        return aasl.mo31714a();
    }

    /* renamed from: y */
    public static String m46904y() {
        return new StringBuilder("genie-eng:offline").toString();
    }

    /* renamed from: d */
    public final String mo31719d() {
        String valueOf = String.valueOf(this.f56492b);
        return valueOf.length() == 0 ? new String("content_id:") : "content_id:".concat(valueOf);
    }

    /* renamed from: e */
    public final boolean mo31720e() {
        return this.f56495e == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0091, code lost:
        if (android.text.TextUtils.equals(r1.f170895c, r3.f170895c) != false) goto L_0x0095;
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aasm) {
            aasm aasm = (aasm) obj;
            if (TextUtils.equals(this.f56492b, aasm.f56492b) && ((!aaxx.m47206e() || (TextUtils.equals(this.f56493c, aasm.f56493c) && TextUtils.equals(this.f56494d, aasm.f56494d))) && this.f56495e == aasm.f56495e && TextUtils.equals(this.f56496f, aasm.f56496f) && TextUtils.equals(this.f56489B, aasm.f56489B) && TextUtils.equals(this.f56497g, aasm.f56497g) && TextUtils.equals(this.f56498h, aasm.f56498h) && TextUtils.equals(this.f56499i, aasm.f56499i))) {
                bzpb bzpb = this.f56500j;
                bzpb bzpb2 = aasm.f56500j;
                if (!(bzpb == null && bzpb2 == null)) {
                    if (!(bzpb == null || bzpb2 == null)) {
                        int a = bzpa.m126002a(bzpb.f170894b);
                        if (a == 0) {
                            a = 1;
                        }
                        int a2 = bzpa.m126002a(bzpb2.f170894b);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        if (a == a2) {
                        }
                    }
                }
                return TextUtils.equals(this.f56501k, aasm.f56501k) && TextUtils.equals(this.f56504n, aasm.f56504n) && this.f56505o == aasm.f56505o && this.f56502l == aasm.f56502l && this.f56503m == aasm.f56503m && this.f56509s == aasm.f56509s && this.f56510t == aasm.f56510t && this.f56511u.equals(aasm.f56511u) && TextUtils.equals(this.f56490C, aasm.f56490C) && this.f56512v == aasm.f56512v && TextUtils.equals(this.f56507q, aasm.f56507q) && TextUtils.equals(this.f56508r, aasm.f56508r) && this.f56491D == aasm.f56491D && this.f56514x == aasm.f56514x;
            }
        }
    }

    /* renamed from: f */
    public final boolean mo31722f() {
        return this.f56495e == 15;
    }

    /* renamed from: g */
    public final boolean mo31723g() {
        return this.f56495e == 3;
    }

    /* renamed from: h */
    public final boolean mo31724h() {
        return this.f56495e == 4;
    }

    public final int hashCode() {
        if (!aaxx.m47206e()) {
            return Arrays.hashCode(new Object[]{this.f56492b, Integer.valueOf(this.f56495e), this.f56496f, this.f56489B, this.f56497g, this.f56498h, this.f56499i, this.f56501k, this.f56504n, Long.valueOf(this.f56505o), Boolean.valueOf(this.f56509s), Boolean.valueOf(this.f56510t), Boolean.valueOf(this.f56503m), this.f56511u, this.f56490C, Boolean.valueOf(this.f56512v), this.f56507q, this.f56508r, this.f56491D, Integer.valueOf(this.f56514x)});
        }
        return Arrays.hashCode(new Object[]{this.f56492b, this.f56493c, this.f56494d, Integer.valueOf(this.f56495e), this.f56496f, this.f56489B, this.f56497g, this.f56498h, this.f56499i, this.f56501k, this.f56504n, Long.valueOf(this.f56505o), Boolean.valueOf(this.f56509s), Boolean.valueOf(this.f56510t), Boolean.valueOf(this.f56503m), this.f56511u, this.f56490C, Boolean.valueOf(this.f56512v), this.f56507q, this.f56508r, this.f56491D, Integer.valueOf(this.f56514x)});
    }

    /* renamed from: i */
    public final boolean mo31726i() {
        return this.f56495e == 5;
    }

    /* renamed from: j */
    public final boolean mo31727j() {
        return this.f56495e == 7;
    }

    /* renamed from: k */
    public final boolean mo31728k() {
        return this.f56495e == 11;
    }

    /* renamed from: l */
    public final boolean mo31729l() {
        return this.f56495e == 9;
    }

    /* renamed from: m */
    public final boolean mo31730m() {
        return this.f56495e == 8;
    }

    /* renamed from: n */
    public final boolean mo31731n() {
        return this.f56495e == 12;
    }

    /* renamed from: o */
    public final boolean mo31732o() {
        return this.f56495e == 22;
    }

    /* renamed from: p */
    public final boolean mo31733p() {
        return this.f56495e == 10;
    }

    /* renamed from: q */
    public final boolean mo31734q() {
        return this.f56495e == 16;
    }

    /* renamed from: r */
    public final String mo31735r() {
        return !this.f56489B.equals(this.f56496f) ? this.f56489B : "";
    }

    /* renamed from: s */
    public final boolean mo31736s() {
        return !TextUtils.isEmpty(this.f56489B);
    }

    /* renamed from: t */
    public final boolean mo31737t() {
        return !TextUtils.isEmpty(this.f56497g);
    }

    public final String toString() {
        try {
            JSONObject put = new JSONObject().put("id", this.f56492b);
            if (aaxx.m47206e()) {
                put.put("prediction_id", this.f56493c).put("reporting_id", this.f56494d);
            }
            put.put("type", this.f56495e).put("title", this.f56496f).put("snippet", this.f56489B).put("url", this.f56497g).put("apiUrl", this.f56498h).put("intentUri", this.f56499i).put("etag", this.f56504n).put("visited_time", this.f56505o).put("is_feeling_lucky", this.f56502l).put("is_in_dark_mode", this.f56503m).put("has_latest_leaf_content_in_database", this.f56509s).put("child_ids", this.f56511u).put("parent_id", this.f56490C);
            bzpb bzpb = this.f56500j;
            if (bzpb != null) {
                put = put.put("androidSettingDefinition", bzpb.toString());
            }
            if (this.f56506p) {
                put = put.put("promotion_details", new JSONObject().put("image_base64", this.f56507q).put("link_text", this.f56508r).put("placement", this.f56491D).put("promotion_version", this.f56514x).toString());
            }
            if (mo31732o()) {
                put = put.put("URL_NAVIGATION_ACTION", this.f56501k);
            }
            return put.toString();
        } catch (JSONException e) {
            throw new IllegalStateException("Converting to JSONObject failed.");
        }
    }

    /* renamed from: u */
    public final boolean mo31739u() {
        int a;
        bzpb bzpb = this.f56500j;
        if (bzpb == null || (a = bzpa.m126002a(bzpb.f170894b)) == 0 || a == 1 || TextUtils.isEmpty(this.f56500j.f170895c)) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public final bzpb mo31740v() {
        if (mo31739u()) {
            return this.f56500j;
        }
        return null;
    }

    /* renamed from: w */
    public final boolean mo31741w() {
        return TextUtils.isEmpty(this.f56490C);
    }

    /* renamed from: x */
    public final bzpz mo31742x() {
        sdo.m34959a(this.f56491D);
        return this.f56491D;
    }

    /* renamed from: c */
    static String m46903c(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo31718c() {
        if (mo31720e()) {
            this.f56509s = false;
            this.f56510t = false;
            this.f56504n = "";
        }
    }

    /* renamed from: a */
    public static aasm m46878a(OfflineSuggestion offlineSuggestion) {
        aasl aasl = new aasl();
        aasl.f56464a = offlineSuggestion.f78790a;
        aasl.f56465b = 4;
        aasl.f56466c = offlineSuggestion.f78791b;
        aasl.f56467d = offlineSuggestion.f78792c;
        aasl.f56468e = offlineSuggestion.f78793d;
        return aasl.mo31714a();
    }

    /* renamed from: a */
    public static aasm m46879a(String str) {
        return m46880a("notification_message", str);
    }

    /* renamed from: a */
    public static aasm m46880a(String str, String str2) {
        aasl aasl = new aasl();
        aasl.f56464a = str;
        aasl.f56465b = 3;
        aasl.f56466c = str2;
        return aasl.mo31714a();
    }

    /* renamed from: a */
    public static aasm m46881a(String str, String str2, bzpb bzpb, String str3) {
        aasl aasl = new aasl();
        aasl.f56464a = bzpb.f170895c;
        aasl.f56465b = 12;
        aasl.f56466c = str;
        aasl.f56467d = str2;
        aasl.f56471h = bzpb;
        aasl.f56468e = str3;
        return aasl.mo31714a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aasm.a(java.lang.String, java.lang.String, com.google.android.gms.googlehelp.common.HelpConfig, boolean, int):aasm
     arg types: [java.lang.String, java.lang.String, com.google.android.gms.googlehelp.common.HelpConfig, int, int]
     candidates:
      aasm.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):aasm
      aasm.a(java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.googlehelp.common.HelpConfig, aars):java.lang.String
      aasm.a(java.lang.String, java.lang.String, java.util.List, com.google.android.gms.googlehelp.common.HelpConfig, boolean):java.util.Map
      aasm.a(java.lang.String, java.lang.String, com.google.android.gms.googlehelp.common.HelpConfig, boolean, int):aasm */
    /* renamed from: a */
    public static aasm m46882a(String str, String str2, HelpConfig helpConfig) {
        return m46883a(str, str2, helpConfig, false, 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0096  */
    /* renamed from: a */
    public static aasm m46883a(String str, String str2, HelpConfig helpConfig, boolean z, int i) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i2;
        aars aars;
        String str9;
        String str10;
        boolean z2;
        String str11;
        String str12;
        boolean z3;
        int i3;
        String str13 = str;
        HelpConfig helpConfig2 = helpConfig;
        int i4 = i;
        try {
            Uri parse = Uri.parse(str);
            String host = parse.getHost();
            if (host == null || !m46896a().contains(host) || !parse.isHierarchical()) {
                return null;
            }
            String queryParameter = parse.getQueryParameter("hl");
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = str2;
            }
            String str14 = "";
            boolean z4 = false;
            if (cefz.m136754b()) {
                aasl aasl = new aasl();
                if (!cegr.m136797c()) {
                    z3 = z;
                } else {
                    z3 = i4 == 2;
                }
                List<String> pathSegments = parse.getPathSegments();
                int size = pathSegments.size();
                if (size >= 3) {
                    if (!TextUtils.equals(pathSegments.get(size - 2), "contact")) {
                        i3 = -1;
                    } else if (z3) {
                        i3 = 10;
                    } else if (TextUtils.equals(pathSegments.get(size - 1), ceeg.m136418w())) {
                        i3 = 21;
                    }
                    aasl.f56465b = i3;
                    aasl.f56468e = str13;
                    aasl.f56478o = false;
                    if (aaya.m47229b(cehp.m136859b())) {
                        List<String> pathSegments2 = parse.getPathSegments();
                        if (pathSegments2.size() > 0) {
                            str14 = pathSegments2.get(0);
                        }
                        aasl.f56479p = str14;
                    }
                    return aasl.mo31714a();
                }
                i3 = -1;
                aasl.f56465b = i3;
                aasl.f56468e = str13;
                aasl.f56478o = false;
                if (aaya.m47229b(cehp.m136859b())) {
                }
                return aasl.mo31714a();
            }
            List<String> pathSegments3 = parse.getPathSegments();
            int size2 = pathSegments3.size();
            String fragment = parse.getFragment();
            if (fragment != null) {
                String[] split = fragment.split("&");
                int length = split.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    String str15 = split[i5];
                    if (str15.startsWith("topic=")) {
                        str3 = str15.substring(6);
                        break;
                    }
                    i5++;
                }
            }
            str3 = null;
            if (size2 > 0) {
                str4 = pathSegments3.get(size2 - 1);
            } else {
                str4 = str14;
            }
            if (size2 < 2) {
                str5 = str14;
            } else {
                str5 = pathSegments3.get(size2 - 2);
            }
            if (size2 > 0 && str3 != null) {
                str7 = TextUtils.join("/", pathSegments3.subList(0, size2));
                str6 = str14;
                i2 = 0;
                z4 = true;
                str14 = str3;
                str8 = str6;
            } else if (size2 == 2 && ceeg.m136409n()) {
                String join = TextUtils.join("/", pathSegments3.subList(0, 1));
                if (TextUtils.equals("threads", str4)) {
                    str8 = "thread_filter";
                    String queryParameter2 = parse.getQueryParameter(str8);
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        str12 = Uri.encode(queryParameter2);
                    } else {
                        str8 = str14;
                        str12 = str8;
                    }
                    str6 = str12;
                    str7 = join;
                    i2 = 19;
                } else if (!TextUtils.equals("community", str4)) {
                    return null;
                } else {
                    str7 = join;
                    str8 = str14;
                    str6 = str8;
                    i2 = 20;
                }
            } else if (size2 < 3) {
                return null;
            } else {
                String str16 = str3;
                if (!str4.equals("answer.py") || (!str5.equals("bin") && !str5.equals("answer"))) {
                    str9 = str14;
                    if (str4.equals("topic.py") && (str5.equals("bin") || str5.equals("topic"))) {
                        str10 = parse.getQueryParameter("topic");
                        str14 = str9;
                        i2 = 0;
                    } else if (str5.equals("answer")) {
                        String queryParameter3 = parse.getQueryParameter("co");
                        if (queryParameter3 != null) {
                            str14 = "co";
                            str9 = queryParameter3;
                        } else {
                            str14 = str9;
                        }
                        str10 = str4;
                        i2 = 1;
                    } else {
                        bzqp bzqp = helpConfig2.f78835j;
                        if (bzqp == null || (bzqp.f171049a & 1) == 0) {
                            str11 = null;
                        } else {
                            bzqo bzqo = bzqp.f171050b;
                            if (bzqo == null) {
                                bzqo = bzqo.f171040e;
                            }
                            if (!bzqo.f171045d.isEmpty()) {
                                bzqo bzqo2 = helpConfig2.f78835j.f171050b;
                                if (bzqo2 == null) {
                                    bzqo2 = bzqo.f171040e;
                                }
                                str11 = bzqo2.f171045d;
                            } else {
                                str11 = null;
                            }
                        }
                        if (str4.equals(str11)) {
                            str10 = str4;
                            str14 = str9;
                            i2 = 10;
                        } else if (str5.equals("topic")) {
                            str10 = str4;
                            str14 = str9;
                            i2 = 0;
                        } else if (str5.equals("forum")) {
                            str10 = str4;
                            str14 = str9;
                            i2 = 11;
                        } else if (z && str5.equals("contact")) {
                            str10 = str4;
                            str14 = str9;
                            i2 = 10;
                        } else if (cegr.m136797c() && i4 == 4) {
                            str10 = str4;
                            str14 = str9;
                            i2 = 21;
                        } else if (z) {
                            str10 = str16;
                            str14 = str9;
                            i2 = -1;
                        } else if (!str5.equals("contact")) {
                            str10 = str16;
                            str14 = str9;
                            i2 = -1;
                        } else if (str4.equals(ceeg.m136418w())) {
                            str10 = str4;
                            str14 = str9;
                            i2 = 21;
                        } else {
                            str10 = str16;
                            str14 = str9;
                            i2 = -1;
                        }
                    }
                } else {
                    str10 = parse.getQueryParameter("answer");
                    str9 = str14;
                    i2 = 1;
                }
                if (!ceeg.m136409n()) {
                    str4 = str10;
                    z2 = true;
                } else if (TextUtils.equals("thread", str5)) {
                    i2 = TextUtils.equals("new", str4) ? 17 : 16;
                    z2 = false;
                } else if (TextUtils.equals("profile", str5)) {
                    i2 = 18;
                    z2 = false;
                } else if (TextUtils.equals("community", str5)) {
                    i2 = 20;
                    z2 = false;
                } else {
                    str4 = str10;
                    z2 = true;
                }
                str7 = TextUtils.join("/", pathSegments3.subList(0, size2 - 2));
                z4 = z2;
                str8 = str14;
                str6 = str9;
                str14 = str4;
            }
            if (TextUtils.isEmpty(str14)) {
                if (!ceeg.m136409n()) {
                    return null;
                }
                if (!(i2 == 19 || i2 == 20)) {
                    return null;
                }
            }
            if (i2 == 0) {
                aars = aars.f56383g;
            } else if (i2 != 1) {
                if (i2 != 10) {
                    if (i2 == 11) {
                        aars = aars.f56385i;
                    } else if (i2 != 21) {
                        try {
                            if (ceeg.m136409n()) {
                                switch (i2) {
                                    case 16:
                                        aars = aars.f56386j;
                                        break;
                                    case 17:
                                        aars = aars.f56387k;
                                        break;
                                    case 18:
                                        aars = aars.f56388l;
                                        break;
                                    case 19:
                                        aars = aars.f56389m;
                                        break;
                                    case 20:
                                        aars = aars.f56390n;
                                        break;
                                    default:
                                        aars = null;
                                        break;
                                }
                            } else {
                                aars = null;
                            }
                        } catch (IllegalStateException e) {
                            return null;
                        }
                    }
                }
                aars = aars.f56384h;
            } else {
                aars = aars.f56382f;
            }
            if (aars != null) {
                String a = helpConfig2.mo43216a(aars);
                if (!TextUtils.isEmpty(a)) {
                    String format = String.format(a, str7, str14, queryParameter);
                    if (!TextUtils.isEmpty(str8) && !TextUtils.isEmpty(str6)) {
                        format = aatf.m46976a(format, "extra_params", m46903c(str8, str6));
                    }
                    String a2 = m46892a(format, helpConfig2);
                    aasl aasl2 = new aasl();
                    aasl2.f56464a = str14;
                    aasl2.f56465b = i2;
                    aasl2.f56468e = str13;
                    aasl2.f56469f = a2;
                    aasl2.f56478o = z4;
                    if (aaya.m47229b(cehp.m136859b())) {
                        aasl2.f56479p = str7;
                    }
                    return aasl2.mo31714a();
                }
                throw new IllegalStateException();
            }
            throw new IllegalStateException();
        } catch (NullPointerException e2) {
            return null;
        }
    }

    /* renamed from: b */
    public static aasm m46898b(String str, String str2, String str3) {
        aasl aasl = new aasl();
        aasl.f56464a = str3;
        aasl.f56465b = 9;
        aasl.f56466c = str;
        aasl.f56467d = str2;
        aasl.f56468e = str3;
        return aasl.mo31714a();
    }

    /* renamed from: b */
    public static aasm m46899b(String str, String str2, String str3, String str4) {
        aasl aasl = new aasl();
        aasl.f56464a = str3;
        aasl.f56465b = 22;
        aasl.f56466c = str;
        aasl.f56467d = str2;
        aasl.f56472i = str3;
        aasl.f56468e = str4;
        return aasl.mo31714a();
    }

    /* renamed from: b */
    public static aasm m46900b(String str, String str2, String str3, String str4, String str5) {
        aasl aasl = new aasl();
        aasl.f56465b = 15;
        aasl.f56464a = str;
        aasl.f56466c = str2;
        aasl.f56468e = str3;
        aasl.f56467d = str4;
        aasl.f56473j = str5;
        return aasl.mo31714a();
    }

    /* renamed from: b */
    public static aasm m46901b(String str, String str2, String str3, String str4, String str5, String str6, long j) {
        aasl aasl = new aasl();
        aasl.f56464a = str;
        aasl.f56465b = 11;
        aasl.f56466c = str2;
        aasl.f56467d = str3;
        aasl.f56468e = str4;
        aasl.f56469f = str5;
        aasl.f56473j = str6;
        aasl.f56474k = j;
        return aasl.mo31714a();
    }

    /* renamed from: b */
    public final String mo31717b() {
        try {
            URI uri = new URI(this.f56497g);
            String path = uri.getPath();
            if (path.contains("/") && !path.endsWith("/")) {
                path = path.substring(0, path.lastIndexOf(47) + 1);
            }
            String scheme = uri.getScheme();
            if (TextUtils.isEmpty(scheme) || "http".equals(scheme)) {
                scheme = "https";
            }
            return new URI(scheme, uri.getHost(), path, null).toString();
        } catch (URISyntaxException e) {
            return "https";
        }
    }

    /* renamed from: a */
    public static aasm m46884a(String str, String str2, String str3) {
        aasl aasl = new aasl();
        aasl.f56464a = str3;
        aasl.f56465b = 7;
        aasl.f56466c = str;
        aasl.f56467d = str2;
        aasl.f56468e = str3;
        return aasl.mo31714a();
    }

    /* renamed from: a */
    public static aasm m46885a(String str, String str2, String str3, String str4) {
        aasl aasl = new aasl();
        aasl.f56464a = str3;
        aasl.f56465b = 8;
        aasl.f56466c = str;
        aasl.f56467d = str2;
        aasl.f56470g = str3;
        aasl.f56468e = str4;
        return aasl.mo31714a();
    }

    /* renamed from: a */
    public static aasm m46886a(String str, String str2, String str3, String str4, String str5) {
        aasl aasl = new aasl();
        aasl.f56465b = 14;
        aasl.f56464a = str;
        aasl.f56466c = str2;
        aasl.f56468e = str3;
        aasl.f56467d = str4;
        aasl.f56473j = str5;
        return aasl.mo31714a();
    }

    /* renamed from: a */
    public static aasm m46887a(String str, String str2, String str3, String str4, String str5, bzpz bzpz, int i) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5)) {
            return null;
        }
        if ((bzpz != bzpz.PROMOTION_PLACEMENT_TOP && bzpz != bzpz.PROMOTION_PLACEMENT_BOTTOM) || i < 2) {
            return null;
        }
        aasl aasl = new aasl();
        aasl.f56464a = "promotion_help_response_id_stub";
        aasl.f56465b = 13;
        aasl.f56466c = str;
        aasl.f56467d = str2;
        aasl.f56468e = str3;
        aasl.mo31715b();
        aasl.f56476m = str4;
        aasl.f56477n = str5;
        sdo.m34959a(bzpz);
        aasl.f56480q = bzpz;
        aasl.f56481r = i;
        return aasl.mo31714a();
    }

    /* renamed from: a */
    public static aasm m46888a(String str, String str2, String str3, String str4, String str5, String str6, long j) {
        aasl aasl = new aasl();
        aasl.f56464a = str;
        aasl.f56465b = 1;
        aasl.f56466c = str2;
        aasl.f56467d = str3;
        aasl.f56468e = str4;
        aasl.f56469f = str5;
        aasl.f56473j = str6;
        aasl.f56474k = j;
        return aasl.mo31714a();
    }

    /* renamed from: a */
    public static aasm m46889a(String str, String str2, String str3, String str4, String str5, boolean z) {
        aasl aasl = new aasl();
        aasl.f56464a = str;
        aasl.f56465b = 2;
        aasl.f56466c = str2;
        aasl.f56467d = str4;
        aasl.f56468e = str3;
        aasl.f56473j = str5;
        aasl.f56478o = z;
        return aasl.mo31714a();
    }

    /* renamed from: a */
    public static aasm m46890a(String str, boolean z) {
        aasl aasl = new aasl();
        aasl.f56464a = str;
        aasl.f56465b = 0;
        aasl.f56475l = z;
        return aasl.mo31714a();
    }

    /* renamed from: a */
    public static aasm m46891a(JSONObject jSONObject, aasm aasm) {
        int i;
        String str;
        boolean z;
        String str2;
        String str3;
        if (!jSONObject.has("html")) {
            return null;
        }
        String string = jSONObject.has("etag") ? jSONObject.getString("etag") : jSONObject.has("fingerprint") ? jSONObject.getString("fingerprint") : "";
        String valueOf = String.valueOf(aasm.f56492b);
        String str4 = valueOf.length() == 0 ? new String("content_id:") : "content_id:".concat(valueOf);
        boolean z2 = aasm.f56512v;
        if (jSONObject.has("page_metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("page_metadata");
            if (jSONObject2.has("content_id")) {
                String string2 = jSONObject2.getString("content_id");
                if (!TextUtils.isEmpty(string2)) {
                    String valueOf2 = String.valueOf(string2);
                    str4 = valueOf2.length() == 0 ? new String("content_id:") : "content_id:".concat(valueOf2);
                    z2 = true;
                }
            }
            if (!aaya.m47229b(cehp.m136861d())) {
                i = 101;
                str = str4;
                z = z2;
            } else {
                if (jSONObject2.has("page_type")) {
                    int i2 = jSONObject2.getInt("page_type");
                    int[] iArr = {1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 101};
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 35) {
                            i = 101;
                            break;
                        }
                        i = iArr[i3];
                        int i4 = i - 1;
                        if (i != 0) {
                            if (i4 == i2) {
                                break;
                            }
                            i3++;
                        } else {
                            throw null;
                        }
                    }
                } else {
                    i = 101;
                }
                str = str4;
                z = z2;
            }
        } else {
            i = 101;
            str = str4;
            z = z2;
        }
        if (aaya.m47229b(cehp.m136861d()) && i != 101) {
            if (jSONObject.has("title")) {
                str3 = jSONObject.getString("title");
            } else {
                str3 = aasm.f56496f;
            }
            String str5 = aasm.f56497g;
            String string3 = jSONObject.getString("html");
            aasl aasl = new aasl();
            aasl.f56464a = str;
            aasl.f56465b = 2;
            aasl.f56466c = str3;
            aasl.f56467d = string3;
            aasl.f56468e = str5;
            aasl.f56473j = string;
            aasl.f56482s = i;
            aasl.f56478o = z;
            return aasl.mo31714a();
        }
        if (jSONObject.has("title")) {
            str2 = jSONObject.getString("title");
        } else {
            str2 = aasm.f56496f;
        }
        return m46889a(str, str2, aasm.f56497g, jSONObject.getString("html"), string, z);
    }

    /* renamed from: a */
    private static String m46892a(String str, HelpConfig helpConfig) {
        if (TextUtils.isEmpty(helpConfig.f78828c)) {
            return str;
        }
        try {
            return aatf.m46976a(str, "extra_params", m46903c("psc", URLEncoder.encode(helpConfig.f78828c, "UTF-8")));
        } catch (UnsupportedEncodingException e) {
            String str2 = helpConfig.f78828c;
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 26 + String.valueOf(message).length());
            sb.append("Error encoding to UTF-8: ");
            sb.append(str2);
            sb.append("\n");
            sb.append(message);
            Log.e("HelpResponse", sb.toString());
            return str;
        }
    }

    /* renamed from: a */
    private static String m46893a(String str, String str2, String str3, HelpConfig helpConfig, aars aars) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        if (str2.charAt(0) == '/') {
            str2 = str2.substring(1);
        }
        String a = helpConfig.mo43216a(aars);
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str;
        if (TextUtils.isEmpty(str3)) {
            str3 = aasw.m46952a();
        }
        objArr[2] = str3;
        return aatf.m46975a(m46892a(String.format(a, objArr), helpConfig));
    }

    /* renamed from: a */
    public static Map m46894a(String str, bzrk bzrk, HelpConfig helpConfig) {
        int a = bzpg.m126008a(bzrk.f171157c);
        boolean z = true;
        if (a == 0) {
            a = 1;
        }
        if (a != 4) {
            z = false;
        }
        return m46895a(str, bzrk.f171158d, bzrk.f171156b, helpConfig, z);
    }

    /* renamed from: a */
    public static Map m46895a(String str, String str2, List list, HelpConfig helpConfig, boolean z) {
        String str3;
        bzpz bzpz;
        HelpConfig helpConfig2 = helpConfig;
        C1223np npVar = new C1223np();
        aasm a = m46890a(str, z);
        npVar.put(str, a);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bzrj bzrj = (bzrj) list.get(i);
            aasm aasm = null;
            if (!bzrj.f171146c.isEmpty() && !bzrj.f171147d.isEmpty()) {
                int a2 = bzpu.m126024a(bzrj.f171149f);
                if (a2 == 0) {
                    a2 = 1;
                }
                int i2 = a2 - 1;
                if (i2 != 2) {
                    if (i2 == 5) {
                        aasm = m46884a(bzrj.f171146c, bzrj.f171148e, bzrj.f171147d);
                    } else if (i2 == 11) {
                        bzrh bzrh = bzrj.f171152i;
                        if (bzrh == null) {
                            bzrh = bzrh.f171129d;
                        }
                        String str4 = bzrh.f171131a;
                        bzrh bzrh2 = bzrj.f171152i;
                        if (bzrh2 == null) {
                            bzrh2 = bzrh.f171129d;
                        }
                        String str5 = bzrh2.f171132b;
                        bzrh bzrh3 = bzrj.f171152i;
                        if (bzrh3 == null) {
                            bzrh3 = bzrh.f171129d;
                        }
                        String a3 = m46893a(str4, str5, bzrh3.f171133c, helpConfig2, aars.f56385i);
                        if (!TextUtils.isEmpty(a3)) {
                            bzrh bzrh4 = bzrj.f171152i;
                            if (bzrh4 == null) {
                                bzrh4 = bzrh.f171129d;
                            }
                            String str6 = bzrh4.f171131a;
                            String str7 = bzrj.f171146c;
                            String str8 = bzrj.f171148e;
                            String str9 = bzrj.f171147d;
                            aasl aasl = new aasl();
                            aasl.f56464a = str6;
                            aasl.f56465b = 11;
                            aasl.f56466c = str7;
                            aasl.f56467d = str8;
                            aasl.f56468e = str9;
                            aasl.f56469f = a3;
                            aasm = aasl.mo31714a();
                        }
                    } else if (i2 == 8) {
                        bzoy bzoy = bzrj.f171150g;
                        if (bzoy == null) {
                            bzoy = bzoy.f170880i;
                        }
                        aasm = m46877a(bzoy, bzrj.f171146c, bzrj.f171148e, bzrj.f171147d);
                    } else if (i2 == 9) {
                        aasm = m46898b(bzrj.f171146c, bzrj.f171148e, bzrj.f171147d);
                    } else if (i2 != 13) {
                        if (i2 == 14 && (bzrj.f171144a & 512) != 0) {
                            bzri bzri = bzrj.f171151h;
                            if (bzri == null) {
                                bzri = bzri.f171135e;
                            }
                            if (bzri.f171139c < 2) {
                                String str10 = bzrj.f171146c;
                                String str11 = bzrj.f171148e;
                                String str12 = bzrj.f171147d;
                                bzri bzri2 = bzrj.f171151h;
                                if (bzri2 == null) {
                                    bzri2 = bzri.f171135e;
                                }
                                String str13 = bzri2.f171138b;
                                bzri bzri3 = bzrj.f171151h;
                                if (bzri3 == null) {
                                    bzri3 = bzri.f171135e;
                                }
                                String str14 = bzri3.f171137a;
                                if (!TextUtils.isEmpty(str10) && !TextUtils.isEmpty(str11) && !TextUtils.isEmpty(str12) && !TextUtils.isEmpty(str13) && !TextUtils.isEmpty(str14)) {
                                    aasl aasl2 = new aasl();
                                    aasl2.f56464a = "promotion_help_response_id_stub";
                                    aasl2.f56465b = 13;
                                    aasl2.f56466c = str10;
                                    aasl2.f56467d = str11;
                                    aasl2.f56468e = str12;
                                    aasl2.mo31715b();
                                    aasl2.f56476m = str13;
                                    aasl2.f56477n = str14;
                                    aasm = aasl2.mo31714a();
                                }
                            } else {
                                String str15 = bzrj.f171146c;
                                String str16 = bzrj.f171148e;
                                String str17 = bzrj.f171147d;
                                bzri bzri4 = bzrj.f171151h;
                                if (bzri4 == null) {
                                    bzri4 = bzri.f171135e;
                                }
                                String str18 = bzri4.f171138b;
                                bzri bzri5 = bzrj.f171151h;
                                if (bzri5 == null) {
                                    bzri5 = bzri.f171135e;
                                }
                                String str19 = bzri5.f171137a;
                                bzri bzri6 = bzrj.f171151h;
                                if (bzri6 == null) {
                                    bzri6 = bzri.f171135e;
                                }
                                bzpz a4 = bzpz.m126030a(bzri6.f171140d);
                                if (a4 != null) {
                                    bzpz = a4;
                                } else {
                                    bzpz = bzpz.UNKNOWN_PROMOTION_PLACEMENT;
                                }
                                bzri bzri7 = bzrj.f171151h;
                                if (bzri7 == null) {
                                    bzri7 = bzri.f171135e;
                                }
                                aasm = m46887a(str15, str16, str17, str18, str19, bzpz, bzri7.f171139c);
                            }
                        }
                    } else if (ceeg.m136409n()) {
                        bzrh bzrh5 = bzrj.f171152i;
                        if (bzrh5 == null) {
                            bzrh5 = bzrh.f171129d;
                        }
                        String str20 = bzrh5.f171131a;
                        bzrh bzrh6 = bzrj.f171152i;
                        if (bzrh6 == null) {
                            bzrh6 = bzrh.f171129d;
                        }
                        String str21 = bzrh6.f171132b;
                        bzrh bzrh7 = bzrj.f171152i;
                        if (bzrh7 == null) {
                            bzrh7 = bzrh.f171129d;
                        }
                        String a5 = m46893a(str20, str21, bzrh7.f171133c, helpConfig2, aars.f56386j);
                        if (!TextUtils.isEmpty(a5)) {
                            bzrh bzrh8 = bzrj.f171152i;
                            if (bzrh8 == null) {
                                bzrh8 = bzrh.f171129d;
                            }
                            String str22 = bzrh8.f171131a;
                            String str23 = bzrj.f171146c;
                            String str24 = bzrj.f171148e;
                            String str25 = bzrj.f171147d;
                            aasl aasl3 = new aasl();
                            aasl3.f56464a = str22;
                            aasl3.f56465b = 16;
                            aasl3.f56466c = str23;
                            aasl3.f56467d = str24;
                            aasl3.f56468e = str25;
                            aasl3.f56469f = a5;
                            aasl3.f56478o = false;
                            aasm = aasl3.mo31714a();
                        }
                    }
                } else if ((bzrj.f171144a & 1024) != 0) {
                    bzrh bzrh9 = bzrj.f171152i;
                    if (bzrh9 == null) {
                        bzrh9 = bzrh.f171129d;
                    }
                    String str26 = bzrh9.f171131a;
                    bzrh bzrh10 = bzrj.f171152i;
                    if (bzrh10 == null) {
                        bzrh10 = bzrh.f171129d;
                    }
                    String str27 = bzrh10.f171132b;
                    bzrh bzrh11 = bzrj.f171152i;
                    if (bzrh11 == null) {
                        bzrh11 = bzrh.f171129d;
                    }
                    String str28 = bzrh11.f171133c;
                    if (TextUtils.isEmpty(str26) || TextUtils.isEmpty(str27)) {
                        str3 = null;
                    } else {
                        if (str27.charAt(0) == '/') {
                            str27 = str27.substring(1);
                        }
                        String a6 = helpConfig2.mo43216a(aars.f56382f);
                        Object[] objArr = new Object[3];
                        objArr[0] = str27;
                        objArr[1] = str26;
                        if (TextUtils.isEmpty(str28)) {
                            str28 = aasw.m46952a();
                        }
                        objArr[2] = str28;
                        str3 = aatf.m46975a(m46892a(String.format(a6, objArr), helpConfig2));
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        bzrh bzrh12 = bzrj.f171152i;
                        if (bzrh12 == null) {
                            bzrh12 = bzrh.f171129d;
                        }
                        String str29 = bzrh12.f171131a;
                        String str30 = bzrj.f171146c;
                        String str31 = bzrj.f171148e;
                        String str32 = bzrj.f171147d;
                        aasl aasl4 = new aasl();
                        aasl4.f56464a = str29;
                        aasl4.f56465b = 1;
                        aasl4.f56466c = str30;
                        aasl4.f56467d = str31;
                        aasl4.f56468e = str32;
                        aasl4.f56469f = str3;
                        aasm = aasl4.mo31714a();
                    }
                }
            }
            if (aasm != null) {
                if (aaxx.m47206e()) {
                    aasm.f56493c = str2;
                    aasm.f56494d = bzrj.f171145b;
                }
                a.mo31716a(aasm);
                npVar.put(aasm.f56492b, aasm);
            }
        }
        return npVar;
    }

    /* renamed from: a */
    public static Set m46896a() {
        String a = ceeg.f182447a.mo6606a().mo78959a();
        if (a.hashCode() != f56486A) {
            synchronized ("HelpResponse") {
                f56486A = a.hashCode();
                f56488z.clear();
                Collections.addAll(f56488z, aayh.m47256a(a));
            }
        }
        return f56488z;
    }

    /* renamed from: a */
    public final void mo31716a(aasm aasm) {
        this.f56511u.add(aasm.f56492b);
        aasm.f56490C = this.f56492b;
    }
}
