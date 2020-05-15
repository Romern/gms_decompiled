package com.google.android.gms.ads.internal.request.service;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AutoClickProtectionConfigurationParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.safebrowsing.SafeBrowsingConfigParcel;
import com.google.android.gms.ads.internal.util.client.C0633h;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.whispersystems.curve25519.Curve25519;

/* renamed from: com.google.android.gms.ads.internal.request.service.i */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0559i {

    /* renamed from: A */
    public AutoClickProtectionConfigurationParcel f8740A;

    /* renamed from: B */
    public boolean f8741B = false;

    /* renamed from: C */
    public String f8742C;

    /* renamed from: D */
    public List f8743D;

    /* renamed from: E */
    public boolean f8744E;

    /* renamed from: F */
    public String f8745F;

    /* renamed from: G */
    public SafeBrowsingConfigParcel f8746G;

    /* renamed from: H */
    public boolean f8747H;

    /* renamed from: I */
    public boolean f8748I;

    /* renamed from: J */
    public boolean f8749J;

    /* renamed from: K */
    public boolean f8750K;

    /* renamed from: L */
    public String f8751L;

    /* renamed from: M */
    public boolean f8752M;

    /* renamed from: N */
    public final AdRequestInfoParcel f8753N;

    /* renamed from: a */
    public String f8754a;

    /* renamed from: b */
    public final String f8755b;

    /* renamed from: c */
    public String f8756c;

    /* renamed from: d */
    public List f8757d;

    /* renamed from: e */
    public String f8758e;

    /* renamed from: f */
    public String f8759f;

    /* renamed from: g */
    public String f8760g;

    /* renamed from: h */
    public List f8761h;

    /* renamed from: i */
    public List f8762i;

    /* renamed from: j */
    public long f8763j = -1;

    /* renamed from: k */
    public boolean f8764k = false;

    /* renamed from: l */
    public List f8765l;

    /* renamed from: m */
    public long f8766m = -1;

    /* renamed from: n */
    public int f8767n = -1;

    /* renamed from: o */
    public boolean f8768o = false;

    /* renamed from: p */
    public boolean f8769p = false;

    /* renamed from: q */
    public boolean f8770q = false;

    /* renamed from: r */
    public boolean f8771r = true;

    /* renamed from: s */
    public boolean f8772s = true;

    /* renamed from: t */
    public String f8773t = "";

    /* renamed from: u */
    public boolean f8774u = false;

    /* renamed from: v */
    public boolean f8775v = false;

    /* renamed from: w */
    public RewardItemParcel f8776w;

    /* renamed from: x */
    public List f8777x;

    /* renamed from: y */
    public List f8778y;

    /* renamed from: z */
    public boolean f8779z = false;

    public C0559i(AdRequestInfoParcel adRequestInfoParcel, String str) {
        this.f8755b = str;
        this.f8753N = adRequestInfoParcel;
    }

    /* renamed from: a */
    static String m5558a(Map map, String str) {
        List list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    /* renamed from: b */
    static long m5559b(Map map, String str) {
        List list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            return -1;
        }
        String str2 = (String) list.get(0);
        try {
            return (long) (Float.parseFloat(str2) * 1000.0f);
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder(str.length() + 36 + String.valueOf(str2).length());
            sb.append("Could not parse float from ");
            sb.append(str);
            sb.append(" header: ");
            sb.append(str2);
            C0633h.m5672d(sb.toString());
            return -1;
        }
    }

    /* renamed from: c */
    static List m5560c(Map map, String str) {
        String str2;
        List list = (List) map.get(str);
        if (list == null || list.isEmpty() || (str2 = (String) list.get(0)) == null) {
            return null;
        }
        return Arrays.asList(str2.trim().split("\\s+"));
    }

    /* renamed from: d */
    private static final boolean m5561d(Map map, String str) {
        List list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            return false;
        }
        return Boolean.parseBoolean((String) list.get(0));
    }

    /* renamed from: a */
    public final void mo6744a(Map map) {
        this.f8754a = m5558a(map, "X-Afma-Ad-Size");
        this.f8745F = m5558a(map, "X-Afma-Ad-Slot-Size");
        List c = m5560c(map, "X-Afma-Click-Tracking-Urls");
        if (c != null) {
            this.f8757d = c;
        }
        this.f8758e = m5558a(map, "X-Afma-Debug-Signals");
        List list = (List) map.get("X-Afma-Debug-Dialog");
        if (list != null && !list.isEmpty()) {
            this.f8759f = (String) list.get(0);
        }
        List c2 = m5560c(map, "X-Afma-Tracking-Urls");
        if (c2 != null) {
            this.f8761h = c2;
        }
        List c3 = m5560c(map, "X-Afma-Downloaded-Impression-Urls");
        if (c3 != null) {
            this.f8762i = c3;
        }
        long b = m5559b(map, "X-Afma-Interstitial-Timeout");
        if (b != -1) {
            this.f8763j = b;
        }
        this.f8764k |= m5561d(map, "X-Afma-Mediation");
        List c4 = m5560c(map, "X-Afma-Manual-Tracking-Urls");
        if (c4 != null) {
            this.f8765l = c4;
        }
        long b2 = m5559b(map, "X-Afma-Refresh-Rate");
        if (b2 != -1) {
            this.f8766m = b2;
        }
        List list2 = (List) map.get("X-Afma-Orientation");
        if (list2 != null && !list2.isEmpty()) {
            String str = (String) list2.get(0);
            if ("portrait".equalsIgnoreCase(str)) {
                C0387d.m5364b();
                this.f8767n = 7;
            } else if ("landscape".equalsIgnoreCase(str)) {
                C0387d.m5364b();
                this.f8767n = 6;
            }
        }
        this.f8760g = m5558a(map, "X-Afma-ActiveView");
        List list3 = (List) map.get("X-Afma-Use-HTTPS");
        if (list3 != null && !list3.isEmpty()) {
            this.f8770q = Boolean.parseBoolean((String) list3.get(0));
        }
        this.f8768o |= m5561d(map, "X-Afma-Custom-Rendering-Allowed");
        this.f8769p = Curve25519.NATIVE.equals(m5558a(map, "X-Afma-Ad-Format"));
        List list4 = (List) map.get("X-Afma-Content-Url-Opted-Out");
        if (list4 != null && !list4.isEmpty()) {
            this.f8771r = Boolean.parseBoolean((String) list4.get(0));
        }
        List list5 = (List) map.get("X-Afma-Content-Vertical-Opted-Out");
        if (list5 != null && !list5.isEmpty()) {
            this.f8772s = Boolean.parseBoolean((String) list5.get(0));
        }
        List list6 = (List) map.get("X-Afma-Gws-Query-Id");
        if (list6 != null && !list6.isEmpty()) {
            this.f8773t = (String) list6.get(0);
        }
        String a = m5558a(map, "X-Afma-Fluid");
        if (a != null && a.equals("height")) {
            this.f8774u = true;
        }
        this.f8775v = "native_express".equals(m5558a(map, "X-Afma-Ad-Format"));
        String a2 = m5558a(map, "X-Afma-Rewards");
        RewardItemParcel rewardItemParcel = null;
        if (!TextUtils.isEmpty(a2)) {
            try {
                rewardItemParcel = RewardItemParcel.m5578a(new JSONArray(a2));
            } catch (JSONException e) {
            }
        }
        this.f8776w = rewardItemParcel;
        if (this.f8777x == null) {
            this.f8777x = m5560c(map, "X-Afma-Reward-Video-Start-Urls");
        }
        if (this.f8778y == null) {
            this.f8778y = m5560c(map, "X-Afma-Reward-Video-Complete-Urls");
        }
        this.f8779z |= m5561d(map, "X-Afma-Use-Displayed-Impression");
        this.f8741B |= m5561d(map, "X-Afma-Auto-Collect-Location");
        this.f8742C = m5558a(map, "Set-Cookie");
        String a3 = m5558a(map, "X-Afma-Auto-Protection-Configuration");
        if (a3 == null || TextUtils.isEmpty(a3)) {
            Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
            buildUpon.appendQueryParameter("id", "gmob-apps-blocked-navigation");
            if (!TextUtils.isEmpty(this.f8759f)) {
                buildUpon.appendQueryParameter("debugDialog", this.f8759f);
            }
            String valueOf = String.valueOf(buildUpon);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append(valueOf);
            sb.append("&navigationURL={NAVIGATION_URL}");
            this.f8740A = new AutoClickProtectionConfigurationParcel(true, Collections.singletonList(sb.toString()));
        } else {
            try {
                this.f8740A = AutoClickProtectionConfigurationParcel.m5532a(new JSONObject(a3));
            } catch (JSONException e2) {
                C0633h.m5673d("Error parsing configuration JSON", e2);
                this.f8740A = new AutoClickProtectionConfigurationParcel();
            }
        }
        List c5 = m5560c(map, "X-Afma-Remote-Ping-Urls");
        if (c5 != null) {
            this.f8743D = c5;
        }
        String a4 = m5558a(map, "X-Afma-Safe-Browsing");
        if (!TextUtils.isEmpty(a4)) {
            try {
                this.f8746G = SafeBrowsingConfigParcel.m5579a(new JSONObject(a4));
            } catch (JSONException e3) {
                C0633h.m5673d("Error parsing safe browsing header", e3);
            }
        }
        this.f8744E |= m5561d(map, "X-Afma-Render-In-Browser");
        String a5 = m5558a(map, "X-Afma-Pool");
        if (!TextUtils.isEmpty(a5)) {
            try {
                this.f8747H = new JSONObject(a5).getBoolean("never_pool");
            } catch (JSONException e4) {
                C0633h.m5673d("Error parsing interstitial pool header", e4);
            }
        }
        this.f8748I = m5561d(map, "X-Afma-Custom-Close-Blocked");
        this.f8749J = m5561d(map, "X-Afma-Enable-Omid");
        this.f8750K = m5561d(map, "X-Afma-Disable-Closable-Area");
        this.f8751L = m5558a(map, "X-Afma-Omid-Settings");
        String a6 = m5558a(map, "X-Afma-Creative-Configuration");
        if (!TextUtils.isEmpty(a6)) {
            try {
                this.f8752M = new JSONObject(a6).getBoolean("scroll_aware");
            } catch (JSONException e5) {
                C0633h.m5673d("Error parsing creative configuration header", e5);
            }
        }
    }
}
