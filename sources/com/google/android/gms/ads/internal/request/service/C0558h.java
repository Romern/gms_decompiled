package com.google.android.gms.ads.internal.request.service;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.identifier.C0271c;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C0341h;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.flag.C0399l;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.instream.InstreamAdConfigurationParcel;
import com.google.android.gms.ads.internal.omid.C0516a;
import com.google.android.gms.ads.internal.omid.C0517b;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.AutoClickProtectionConfigurationParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.safebrowsing.SafeBrowsingConfigParcel;
import com.google.android.gms.ads.internal.state.service.C0601a;
import com.google.android.gms.ads.internal.util.C0622at;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.internal.util.client.C0635j;
import com.google.android.gms.ads.internal.util.client.C0636k;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.omid.C0871a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.request.service.h */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0558h {
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00de A[Catch:{ JSONException -> 0x02af }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02a6 A[Catch:{ JSONException -> 0x02af }] */
    /* renamed from: a */
    public static AdResponseParcel m5554a(Context context, AdRequestInfoParcel adRequestInfoParcel, String str) {
        int i;
        boolean z;
        long j;
        int i2;
        long j2;
        int i3;
        String str2;
        String str3;
        AdResponseParcel adResponseParcel;
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        long j3;
        String str4;
        boolean z2;
        boolean z3;
        AdRequestInfoParcel adRequestInfoParcel2 = adRequestInfoParcel;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("ad_base_url", null);
            String optString2 = jSONObject.optString("ad_url", null);
            String optString3 = jSONObject.optString("ad_size", null);
            String optString4 = jSONObject.optString("ad_slot_size", optString3);
            if (adRequestInfoParcel2 == null || adRequestInfoParcel2.f8620m == 0) {
                z = false;
            } else {
                z = true;
            }
            String optString5 = jSONObject.optString("ad_json", null);
            if (optString5 == null) {
                optString5 = jSONObject.optString("ad_html", null);
            }
            if (optString5 == null) {
                optString5 = jSONObject.optString("body", null);
            }
            if (optString5 == null) {
                if (jSONObject.has("ads")) {
                    optString5 = jSONObject.toString();
                }
            }
            String optString6 = jSONObject.optString("debug_dialog", null);
            String optString7 = jSONObject.optString("debug_signals", null);
            if (jSONObject.has("interstitial_timeout")) {
                j = (long) (jSONObject.getDouble("interstitial_timeout") * 1000.0d);
            } else {
                j = -1;
            }
            String optString8 = jSONObject.optString("orientation", null);
            if ("portrait".equals(optString8)) {
                C0387d.m5364b();
                i2 = 7;
            } else if ("landscape".equals(optString8)) {
                C0387d.m5364b();
                i2 = 6;
            } else {
                i2 = -1;
            }
            if (TextUtils.isEmpty(optString5)) {
                if (!TextUtils.isEmpty(optString2)) {
                    i3 = -1;
                    adResponseParcel = C0557g.m5545a(adRequestInfoParcel, context, adRequestInfoParcel2.f8618k.f8949a, optString2, null, null, null, null, null);
                    String str5 = adResponseParcel.f8662b;
                    String str6 = adResponseParcel.f8663c;
                    j2 = adResponseParcel.f8674n;
                    str2 = str6;
                    str3 = str5;
                    if (str2 == null) {
                        JSONArray optJSONArray = jSONObject.optJSONArray("click_urls");
                        if (adResponseParcel != null) {
                            list = adResponseParcel.f8664d;
                        } else {
                            list = null;
                        }
                        if (optJSONArray != null) {
                            list = m5555a(optJSONArray, list);
                        }
                        JSONArray optJSONArray2 = jSONObject.optJSONArray("impression_urls");
                        if (adResponseParcel != null) {
                            list2 = adResponseParcel.f8666f;
                        } else {
                            list2 = null;
                        }
                        if (optJSONArray2 != null) {
                            list2 = m5555a(optJSONArray2, list2);
                        }
                        JSONArray optJSONArray3 = jSONObject.optJSONArray("downloaded_impression_urls");
                        if (adResponseParcel != null) {
                            list3 = adResponseParcel.f8654U;
                        } else {
                            list3 = null;
                        }
                        if (optJSONArray3 == null) {
                            list4 = list3;
                        } else {
                            list4 = m5555a(optJSONArray3, list3);
                        }
                        JSONArray optJSONArray4 = jSONObject.optJSONArray("manual_impression_urls");
                        if (adResponseParcel != null) {
                            list5 = adResponseParcel.f8670j;
                        } else {
                            list5 = null;
                        }
                        if (optJSONArray4 != null) {
                            list6 = m5555a(optJSONArray4, list5);
                        } else {
                            list6 = list5;
                        }
                        if (adResponseParcel != null) {
                            int i4 = adResponseParcel.f8672l;
                            if (i4 != i3) {
                                i2 = i4;
                            }
                            long j4 = adResponseParcel.f8667g;
                            j3 = j4 <= 0 ? j : j4;
                        } else {
                            j3 = j;
                        }
                        String optString9 = jSONObject.optString("active_view");
                        boolean optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
                        if (optBoolean) {
                            str4 = jSONObject.optString("ad_passback_url", null);
                        } else {
                            str4 = null;
                        }
                        boolean optBoolean2 = jSONObject.optBoolean("mediation", false);
                        boolean optBoolean3 = jSONObject.optBoolean("custom_render_allowed", false);
                        boolean optBoolean4 = jSONObject.optBoolean("content_url_opted_out", true);
                        boolean optBoolean5 = jSONObject.optBoolean("content_vertical_opted_out", true);
                        boolean optBoolean6 = jSONObject.optBoolean("prefetch", false);
                        String str7 = str3;
                        long optLong = jSONObject.optLong("refresh_interval_milliseconds", -1);
                        long optLong2 = jSONObject.optLong("mediation_config_cache_time_milliseconds", -1);
                        String optString10 = jSONObject.optString("gws_query_id", "");
                        boolean equals = "height".equals(jSONObject.optString("fluid", ""));
                        boolean optBoolean7 = jSONObject.optBoolean("native_express", false);
                        List a = m5555a(jSONObject.optJSONArray("video_start_urls"), (List) null);
                        List a2 = m5555a(jSONObject.optJSONArray("video_complete_urls"), (List) null);
                        RewardItemParcel a3 = RewardItemParcel.m5578a(jSONObject.optJSONArray("rewards"));
                        boolean optBoolean8 = jSONObject.optBoolean("use_displayed_impression", false);
                        AutoClickProtectionConfigurationParcel a4 = AutoClickProtectionConfigurationParcel.m5532a(jSONObject.optJSONObject("auto_protection_configuration"));
                        String optString11 = jSONObject.optString("set_cookie", "");
                        List a5 = m5555a(jSONObject.optJSONArray("remote_ping_urls"), (List) null);
                        SafeBrowsingConfigParcel a6 = SafeBrowsingConfigParcel.m5579a(jSONObject.optJSONObject("safe_browsing"));
                        boolean optBoolean9 = jSONObject.optBoolean("render_in_browser", adRequestInfoParcel2.f8585K);
                        boolean optBoolean10 = jSONObject.optBoolean("custom_close_blocked");
                        boolean optBoolean11 = jSONObject.optBoolean("enable_omid", false);
                        String optString12 = jSONObject.optString("omid_settings", null);
                        boolean optBoolean12 = jSONObject.optBoolean("disable_closable_area", false);
                        Bundle bundle = adRequestInfoParcel2.f8610c.f8130m.getBundle(AdMobAdapter.class.getName());
                        if (bundle != null) {
                            z2 = bundle.getBoolean("is_analytics_logging_enabled", false);
                        } else {
                            z2 = false;
                        }
                        JSONObject optJSONObject = jSONObject.optJSONObject("creative_configuration");
                        if (optJSONObject != null) {
                            z3 = optJSONObject.optBoolean("scroll_aware", false);
                        } else {
                            z3 = false;
                        }
                        return new AdResponseParcel(adRequestInfoParcel, str7, str2, list, list2, j3, optBoolean2, optLong2, list6, optLong, i2, optString3, j2, optString6, optBoolean, str4, optString9, optBoolean3, z, adRequestInfoParcel2.f8623p, optBoolean4, optBoolean6, optString10, equals, optBoolean7, a3, a, a2, optBoolean8, a4, adRequestInfoParcel2.f8581G, optString11, a5, optBoolean9, optString4, a6, optString7, optBoolean5, adRequestInfoParcel2.f8595U, optBoolean10, optBoolean11, list4, optBoolean12, optString12, "", z2, z3);
                    }
                    i = 0;
                    try {
                        return new AdResponseParcel(0);
                    } catch (JSONException e) {
                        e = e;
                        String valueOf = String.valueOf(e.getMessage());
                        C0633h.m5672d(valueOf.length() != 0 ? new String("Could not parse the inline ad response: ") : "Could not parse the inline ad response: ".concat(valueOf));
                        return new AdResponseParcel(i);
                    }
                }
            }
            str2 = optString5;
            j2 = -1;
            adResponseParcel = null;
            i3 = -1;
            str3 = optString;
            if (str2 == null) {
            }
        } catch (JSONException e2) {
            e = e2;
            i = 0;
            String valueOf2 = String.valueOf(e.getMessage());
            C0633h.m5672d(valueOf2.length() != 0 ? new String("Could not parse the inline ad response: ") : "Could not parse the inline ad response: ".concat(valueOf2));
            return new AdResponseParcel(i);
        }
    }

    /* renamed from: a */
    private static List m5555a(JSONArray jSONArray, List list) {
        if (jSONArray == null) {
            return null;
        }
        if (list == null) {
            list = new ArrayList();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            list.add(jSONArray.getString(i));
        }
        return list;
    }

    /* renamed from: a */
    public static JSONObject m5556a(Context context, C0551a aVar) {
        JSONObject jSONObject;
        Bundle bundle;
        String str;
        boolean z;
        int i;
        int i2;
        boolean z2;
        String str2;
        String str3;
        String str4;
        AdSizeParcel[] adSizeParcelArr;
        String str5;
        String str6;
        Context context2 = context;
        C0551a aVar2 = aVar;
        AdRequestInfoParcel adRequestInfoParcel = aVar2.f8714i;
        Location location = aVar2.f8709d;
        C0563m mVar = aVar2.f8715j;
        Bundle bundle2 = aVar2.f8706a;
        JSONObject jSONObject2 = aVar2.f8716k;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("extra_caps", C0371o.f8211Y.mo6604a());
            if (aVar2.f8708c.size() > 0) {
                hashMap.put("eid", TextUtils.join(",", aVar2.f8708c));
            }
            Bundle bundle3 = adRequestInfoParcel.f8609b;
            if (bundle3 != null) {
                hashMap.put("ad_pos", bundle3);
            }
            AdRequestParcel adRequestParcel = adRequestInfoParcel.f8610c;
            synchronized (C0601a.f8909a) {
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
            long j = adRequestParcel.f8119b;
            if (j != -1) {
                hashMap.put("cust_age", simpleDateFormat.format(new Date(j)));
            }
            Bundle bundle4 = adRequestParcel.f8120c;
            if (bundle4 != null) {
                hashMap.put("extras", bundle4);
            }
            int i3 = adRequestParcel.f8121d;
            if (i3 != -1) {
                hashMap.put("cust_gender", Integer.valueOf(i3));
            }
            List list = adRequestParcel.f8122e;
            if (list != null) {
                hashMap.put("kw", list);
            }
            int i4 = adRequestParcel.f8124g;
            if (i4 != -1) {
                hashMap.put("tag_for_child_directed_treatment", Integer.valueOf(i4));
            }
            if (adRequestParcel.f8123f) {
                hashMap.put("test_request", true);
            }
            if (adRequestParcel.f8118a >= 2) {
                if (adRequestParcel.f8125h) {
                    hashMap.put("d_imp_hdr", 1);
                }
                if (!TextUtils.isEmpty(adRequestParcel.f8126i)) {
                    hashMap.put("ppid", adRequestParcel.f8126i);
                }
            }
            if (adRequestParcel.f8118a >= 3 && (str6 = adRequestParcel.f8129l) != null) {
                hashMap.put("url", str6);
            }
            if (adRequestParcel.f8118a >= 5) {
                Bundle bundle5 = adRequestParcel.f8131n;
                if (bundle5 != null) {
                    hashMap.put("custom_targeting", bundle5);
                }
                List list2 = adRequestParcel.f8132o;
                if (list2 != null) {
                    hashMap.put("category_exclusions", list2);
                }
                String str7 = adRequestParcel.f8133p;
                if (str7 != null) {
                    hashMap.put("request_agent", str7);
                }
            }
            if (adRequestParcel.f8118a >= 6 && (str5 = adRequestParcel.f8134q) != null) {
                hashMap.put("request_pkg", str5);
            }
            if (adRequestParcel.f8118a >= 7) {
                hashMap.put("is_designed_for_families", Boolean.valueOf(adRequestParcel.f8135r));
            }
            if (adRequestParcel.f8118a >= 8) {
                int i5 = adRequestParcel.f8137t;
                if (i5 != -1) {
                    hashMap.put("tag_for_under_age_of_consent", Integer.valueOf(i5));
                }
                String str8 = adRequestParcel.f8138u;
                if (str8 != null) {
                    hashMap.put("max_ad_content_rating", str8);
                }
            }
            AdSizeParcel adSizeParcel = adRequestInfoParcel.f8611d;
            AdSizeParcel[] adSizeParcelArr2 = adSizeParcel.f8146g;
            if (adSizeParcelArr2 != null) {
                int length = adSizeParcelArr2.length;
                int i6 = 0;
                boolean z3 = false;
                boolean z4 = false;
                while (true) {
                    if (i6 >= length) {
                        break;
                    }
                    AdSizeParcel adSizeParcel2 = adSizeParcelArr2[i6];
                    if (!adSizeParcel2.f8148i) {
                        if (!z3) {
                            hashMap.put("format", adSizeParcel2.f8140a);
                            z3 = true;
                        }
                    }
                    if (adSizeParcel2.f8148i) {
                        if (!z4) {
                            hashMap.put("fluid", "height");
                            z4 = true;
                        }
                    }
                    if (z3 && z4) {
                        break;
                    }
                    i6++;
                }
            } else {
                hashMap.put("format", adSizeParcel.f8140a);
                if (adRequestInfoParcel.f8611d.f8148i) {
                    hashMap.put("fluid", "height");
                }
            }
            if (adRequestInfoParcel.f8611d.f8144e == -1) {
                hashMap.put("smart_w", "full");
            }
            if (adRequestInfoParcel.f8611d.f8141b == -2) {
                hashMap.put("smart_h", "auto");
            }
            if (adRequestInfoParcel.f8611d.f8146g != null) {
                StringBuilder sb = new StringBuilder();
                AdSizeParcel[] adSizeParcelArr3 = adRequestInfoParcel.f8611d.f8146g;
                int length2 = adSizeParcelArr3.length;
                boolean z5 = false;
                int i7 = 0;
                while (i7 < length2) {
                    AdSizeParcel adSizeParcel3 = adSizeParcelArr3[i7];
                    if (!adSizeParcel3.f8148i) {
                        if (sb.length() != 0) {
                            sb.append("|");
                        }
                        int i8 = adSizeParcel3.f8144e;
                        adSizeParcelArr = adSizeParcelArr3;
                        if (i8 == -1) {
                            i8 = (int) (((float) adSizeParcel3.f8145f) / mVar.f8843t);
                        }
                        sb.append(i8);
                        sb.append("x");
                        int i9 = adSizeParcel3.f8141b;
                        if (i9 == -2) {
                            i9 = (int) (((float) adSizeParcel3.f8142c) / mVar.f8843t);
                        }
                        sb.append(i9);
                    } else {
                        adSizeParcelArr = adSizeParcelArr3;
                        z5 = true;
                    }
                    i7++;
                    adSizeParcelArr3 = adSizeParcelArr;
                }
                if (z5) {
                    if (sb.length() != 0) {
                        sb.insert(0, "|");
                    }
                    sb.insert(0, "320x50");
                }
                hashMap.put("sz", sb);
            }
            int i10 = adRequestInfoParcel.f8620m;
            if (i10 != 0) {
                hashMap.put("native_version", Integer.valueOf(i10));
                hashMap.put("native_templates", adRequestInfoParcel.f8621n);
                if (adRequestInfoParcel.f8632y != null) {
                    if (((Boolean) C0371o.f8223aa.mo6604a()).booleanValue() && adRequestInfoParcel.f8632y.f8372a > 3) {
                        hashMap.put("enable_native_media_orientation", true);
                        int i11 = adRequestInfoParcel.f8632y.f8379h;
                        if (i11 != 1) {
                            str4 = i11 != 2 ? i11 != 3 ? i11 != 4 ? "unknown" : "square" : "portrait" : "landscape";
                        } else {
                            str4 = "any";
                        }
                        if (!"unknown".equals(str4)) {
                            hashMap.put("native_media_orientation", str4);
                        }
                    }
                    int i12 = adRequestInfoParcel.f8632y.f8374c;
                    String str9 = i12 != 0 ? i12 != 1 ? i12 != 2 ? "unknown" : "landscape" : "portrait" : "any";
                    if (!"unknown".equals(str9)) {
                        hashMap.put("native_image_orientation", str9);
                    }
                }
                NativeAdOptionsParcel nativeAdOptionsParcel = adRequestInfoParcel.f8632y;
                hashMap.put("native_multiple_images", Boolean.valueOf(nativeAdOptionsParcel != null ? nativeAdOptionsParcel.f8375d : false));
                if (!adRequestInfoParcel.f8633z.isEmpty()) {
                    hashMap.put("native_custom_templates", adRequestInfoParcel.f8633z);
                }
                if (adRequestInfoParcel.f8601a >= 24) {
                    hashMap.put("max_num_ads", Integer.valueOf(adRequestInfoParcel.f8599Y));
                }
                if (!TextUtils.isEmpty(adRequestInfoParcel.f8597W)) {
                    try {
                        hashMap.put("native_advanced_settings", new JSONArray(adRequestInfoParcel.f8597W));
                    } catch (JSONException e) {
                        C0633h.m5673d("Problem creating json from native advanced settings", e);
                    }
                }
            }
            List list3 = adRequestInfoParcel.f8596V;
            if (list3 != null && list3.size() > 0) {
                for (Integer num : adRequestInfoParcel.f8596V) {
                    if (num.intValue() == 2) {
                        hashMap.put("iba", true);
                    } else if (num.intValue() == 1) {
                        hashMap.put("ina", true);
                    }
                }
            }
            if (adRequestInfoParcel.f8611d.f8149j) {
                hashMap.put("ene", true);
            }
            if (adRequestInfoParcel.f8589O != null) {
                hashMap.put("is_icon_ad", true);
                hashMap.put("icon_ad_expansion_behavior", Integer.valueOf(adRequestInfoParcel.f8589O.f8154a));
            }
            InstreamAdConfigurationParcel instreamAdConfigurationParcel = adRequestInfoParcel.f8606ae;
            if (instreamAdConfigurationParcel != null) {
                int i13 = instreamAdConfigurationParcel.f8404b;
                if (i13 == 1) {
                    str3 = "l";
                } else if (i13 != 2) {
                    StringBuilder sb2 = new StringBuilder(52);
                    sb2.append("Instream ad video aspect ratio ");
                    sb2.append(i13);
                    sb2.append(" is wrong.");
                    C0633h.m5668b(sb2.toString());
                    str3 = "l";
                } else {
                    str3 = "p";
                }
                hashMap.put("ia_var", str3);
                hashMap.put("instr", true);
            }
            hashMap.put("slotname", adRequestInfoParcel.f8612e);
            hashMap.put("pn", adRequestInfoParcel.f8613f.packageName);
            PackageInfo packageInfo = adRequestInfoParcel.f8614g;
            if (packageInfo != null) {
                hashMap.put("vc", Integer.valueOf(packageInfo.versionCode));
            }
            hashMap.put("ms", aVar2.f8712g);
            hashMap.put("seq_num", adRequestInfoParcel.f8616i);
            hashMap.put("session_id", adRequestInfoParcel.f8617j);
            hashMap.put("js", adRequestInfoParcel.f8618k.f8949a);
            Bundle bundle6 = adRequestInfoParcel.f8587M;
            Bundle bundle7 = aVar2.f8707b;
            hashMap.put("am", Integer.valueOf(mVar.f8824a));
            hashMap.put("cog", Integer.valueOf(mVar.f8825b ? 1 : 0));
            hashMap.put("coh", Integer.valueOf(mVar.f8826c ? 1 : 0));
            if (!TextUtils.isEmpty(mVar.f8827d)) {
                hashMap.put("carrier", mVar.f8827d);
            }
            hashMap.put("gl", mVar.f8828e);
            if (mVar.f8829f) {
                hashMap.put("simulator", 1);
            }
            hashMap.put("is_latchsky", Boolean.valueOf(mVar.f8830g));
            if (mVar.f8831h) {
                hashMap.put("is_sidewinder", 1);
            }
            hashMap.put("ma", Integer.valueOf(mVar.f8832i ? 1 : 0));
            hashMap.put("sp", Integer.valueOf(mVar.f8833j ? 1 : 0));
            hashMap.put("hl", mVar.f8834k);
            if (!TextUtils.isEmpty(mVar.f8835l)) {
                hashMap.put("mv", mVar.f8835l);
            }
            hashMap.put("muv", Integer.valueOf(mVar.f8837n));
            int i14 = mVar.f8838o;
            if (i14 != -2) {
                hashMap.put("cnt", Integer.valueOf(i14));
            }
            hashMap.put("gnt", Integer.valueOf(mVar.f8839p));
            hashMap.put("pt", Integer.valueOf(mVar.f8840q));
            hashMap.put("rm", Integer.valueOf(mVar.f8841r));
            hashMap.put("riv", Integer.valueOf(mVar.f8842s));
            Bundle bundle8 = new Bundle();
            bundle8.putString("build_build", mVar.f8821A);
            bundle8.putString("build_device", mVar.f8822B);
            Bundle bundle9 = new Bundle();
            bundle9.putBoolean("is_charging", mVar.f8847x);
            bundle9.putDouble("battery_level", mVar.f8846w);
            bundle8.putBundle("battery", bundle9);
            Bundle bundle10 = new Bundle();
            bundle10.putInt("active_network_state", mVar.f8849z);
            bundle10.putBoolean("active_network_metered", mVar.f8848y);
            bundle8.putBundle("network", bundle10);
            Bundle bundle11 = new Bundle();
            bundle11.putBoolean("is_browser_custom_tabs_capable", mVar.f8823C);
            bundle8.putBundle("browser", bundle11);
            if (bundle6 != null) {
                Bundle bundle12 = new Bundle();
                bundle = bundle2;
                jSONObject = jSONObject2;
                bundle12.putString("runtime_free", Long.toString(bundle6.getLong("runtime_free_memory", -1)));
                bundle12.putString("runtime_max", Long.toString(bundle6.getLong("runtime_max_memory", -1)));
                bundle12.putString("runtime_total", Long.toString(bundle6.getLong("runtime_total_memory", -1)));
                bundle12.putString("web_view_count", Integer.toString(bundle6.getInt("web_view_count", 0)));
                Debug.MemoryInfo memoryInfo = (Debug.MemoryInfo) bundle6.getParcelable("debug_memory_info");
                if (memoryInfo != null) {
                    bundle12.putString("debug_info_dalvik_private_dirty", Integer.toString(memoryInfo.dalvikPrivateDirty));
                    bundle12.putString("debug_info_dalvik_pss", Integer.toString(memoryInfo.dalvikPss));
                    bundle12.putString("debug_info_dalvik_shared_dirty", Integer.toString(memoryInfo.dalvikSharedDirty));
                    bundle12.putString("debug_info_native_private_dirty", Integer.toString(memoryInfo.nativePrivateDirty));
                    bundle12.putString("debug_info_native_pss", Integer.toString(memoryInfo.nativePss));
                    bundle12.putString("debug_info_native_shared_dirty", Integer.toString(memoryInfo.nativeSharedDirty));
                    bundle12.putString("debug_info_other_private_dirty", Integer.toString(memoryInfo.otherPrivateDirty));
                    bundle12.putString("debug_info_other_pss", Integer.toString(memoryInfo.otherPss));
                    bundle12.putString("debug_info_other_shared_dirty", Integer.toString(memoryInfo.otherSharedDirty));
                }
                bundle8.putBundle("android_mem_info", bundle12);
            } else {
                bundle = bundle2;
                jSONObject = jSONObject2;
            }
            Bundle bundle13 = new Bundle();
            bundle13.putBundle("parental_controls", bundle7);
            if (!TextUtils.isEmpty(mVar.f8836m)) {
                bundle13.putString("package_version", mVar.f8836m);
            }
            bundle8.putBundle("play_store", bundle13);
            hashMap.put("device", bundle8);
            Bundle bundle14 = new Bundle();
            bundle14.putString("doritos", aVar2.f8710e);
            bundle14.putString("doritos_v2", aVar2.f8711f);
            if (((Boolean) C0371o.f8192F.mo6604a()).booleanValue()) {
                C0271c cVar = aVar2.f8713h;
                if (cVar != null) {
                    str2 = cVar.f7985a;
                    z2 = cVar.f7986b;
                } else {
                    str2 = null;
                    z2 = false;
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle14.putString("rdid", str2);
                    bundle14.putBoolean("is_lat", z2);
                    bundle14.putString("idtype", "adid");
                } else {
                    bundle14.putString("pdid", C0341h.m5274a().mo6805a(context2));
                    bundle14.putString("pdidtype", "ssaid");
                }
            }
            hashMap.put("pii", bundle14);
            hashMap.put("platform", Build.MANUFACTURER);
            hashMap.put("submodel", Build.MODEL);
            if (location == null) {
                AdRequestParcel adRequestParcel2 = adRequestInfoParcel.f8610c;
                if (adRequestParcel2.f8118a >= 2) {
                    Location location2 = adRequestParcel2.f8128k;
                    if (location2 != null) {
                        m5557a(hashMap, location2);
                    }
                }
            } else {
                m5557a(hashMap, location);
            }
            if (adRequestInfoParcel.f8601a >= 2) {
                hashMap.put("quality_signals", adRequestInfoParcel.f8619l);
            }
            if (adRequestInfoParcel.f8601a >= 4 && adRequestInfoParcel.f8623p) {
                hashMap.put("forceHttps", true);
            }
            if (bundle != null) {
                hashMap.put("content_info", bundle);
            }
            if (adRequestInfoParcel.f8601a < 5) {
                hashMap.put("u_sd", Float.valueOf(mVar.f8843t));
                hashMap.put("sh", Integer.valueOf(mVar.f8845v));
                hashMap.put("sw", Integer.valueOf(mVar.f8844u));
            } else {
                hashMap.put("u_sd", Float.valueOf(adRequestInfoParcel.f8626s));
                hashMap.put("sh", Integer.valueOf(adRequestInfoParcel.f8625r));
                hashMap.put("sw", Integer.valueOf(adRequestInfoParcel.f8624q));
            }
            if (adRequestInfoParcel.f8601a >= 6) {
                if (!TextUtils.isEmpty(adRequestInfoParcel.f8627t)) {
                    try {
                        hashMap.put("view_hierarchy", new JSONObject(adRequestInfoParcel.f8627t));
                    } catch (JSONException e2) {
                        C0633h.m5673d("Problem serializing view hierarchy to JSON", e2);
                    }
                }
                hashMap.put("correlation_id", Long.valueOf(adRequestInfoParcel.f8628u));
            }
            if (adRequestInfoParcel.f8601a >= 7) {
                hashMap.put("request_id", adRequestInfoParcel.f8629v);
            }
            if (adRequestInfoParcel.f8601a >= 12 && !TextUtils.isEmpty(adRequestInfoParcel.f8576B)) {
                hashMap.put("anchor", adRequestInfoParcel.f8576B);
            }
            if (adRequestInfoParcel.f8601a >= 13) {
                hashMap.put("android_app_volume", Float.valueOf(adRequestInfoParcel.f8577C));
            }
            if (adRequestInfoParcel.f8601a >= 18) {
                hashMap.put("android_app_muted", Boolean.valueOf(adRequestInfoParcel.f8583I));
            }
            if (adRequestInfoParcel.f8601a >= 14 && (i2 = adRequestInfoParcel.f8578D) > 0) {
                hashMap.put("target_api", Integer.valueOf(i2));
            }
            if (adRequestInfoParcel.f8601a >= 15) {
                int i15 = adRequestInfoParcel.f8579E;
                if (i15 != -1) {
                    i = i15;
                } else {
                    i = -1;
                }
                hashMap.put("scroll_index", Integer.valueOf(i));
            }
            if (adRequestInfoParcel.f8601a >= 16) {
                hashMap.put("_activity_context", Boolean.valueOf(adRequestInfoParcel.f8580F));
            }
            if (adRequestInfoParcel.f8601a >= 18) {
                if (!TextUtils.isEmpty(adRequestInfoParcel.f8584J)) {
                    try {
                        hashMap.put("app_settings", new JSONObject(adRequestInfoParcel.f8584J));
                    } catch (JSONException e3) {
                        C0633h.m5673d("Problem creating json from app settings", e3);
                    }
                }
                hashMap.put("render_in_browser", Boolean.valueOf(adRequestInfoParcel.f8585K));
            }
            if (adRequestInfoParcel.f8601a >= 18) {
                hashMap.put("android_num_video_cache_tasks", Integer.valueOf(adRequestInfoParcel.f8586L));
            }
            VersionInfoParcel versionInfoParcel = adRequestInfoParcel.f8618k;
            boolean z6 = adRequestInfoParcel.f8600Z;
            boolean z7 = adRequestInfoParcel.f8603ab;
            Bundle bundle15 = new Bundle();
            Bundle bundle16 = new Bundle();
            bundle16.putString("cl", "306758586");
            bundle16.putString("rapid_rc", "dev");
            bundle16.putString("rapid_rollup", "HEAD");
            bundle15.putBundle("build_meta", bundle16);
            bundle15.putString("mf", Boolean.toString(((Boolean) C0399l.f8351a.mo6621a()).booleanValue()));
            bundle15.putBoolean("instant_app", z6);
            bundle15.putBoolean("lite", versionInfoParcel.f8953e);
            bundle15.putBoolean("local_service", false);
            bundle15.putBoolean("is_privileged_process", z7);
            bundle15.putInt("container_version", 201515033);
            hashMap.put("sdk_env", bundle15);
            hashMap.put("cache_state", jSONObject);
            if (adRequestInfoParcel.f8601a >= 19) {
                hashMap.put("gct", adRequestInfoParcel.f8588N);
            }
            if (adRequestInfoParcel.f8601a >= 21 && adRequestInfoParcel.f8590P) {
                hashMap.put("de", "1");
            }
            if (((Boolean) C0371o.f8195I.mo6604a()).booleanValue()) {
                String str10 = adRequestInfoParcel.f8611d.f8140a;
                if (str10.equals("interstitial_mb") || str10.equals("reward_mb")) {
                    z = true;
                } else {
                    z = false;
                }
                Bundle bundle17 = adRequestInfoParcel.f8591Q;
                if (z) {
                    if (bundle17 != null) {
                        Bundle bundle18 = new Bundle();
                        bundle18.putBundle("interstitial_pool", bundle17);
                        hashMap.put("counters", bundle18);
                    }
                }
            }
            String str11 = adRequestInfoParcel.f8592R;
            if (str11 != null) {
                hashMap.put("gmp_app_id", str11);
            }
            String str12 = adRequestInfoParcel.f8593S;
            if (str12 == null) {
                hashMap.put("fbs_aiid", "");
            } else if ("TIME_OUT".equals(str12)) {
                hashMap.put("sai_timeout", C0371o.f8269v.mo6604a());
            } else {
                hashMap.put("fbs_aiid", adRequestInfoParcel.f8593S);
            }
            String str13 = adRequestInfoParcel.f8594T;
            if (str13 != null) {
                hashMap.put("fbs_aeid", str13);
            }
            String str14 = adRequestInfoParcel.f8607af;
            if (str14 != null) {
                hashMap.put("apm_id_origin", str14);
            }
            if (adRequestInfoParcel.f8601a >= 24) {
                hashMap.put("disable_ml", Boolean.valueOf(adRequestInfoParcel.f8602aa));
            }
            String str15 = (String) C0371o.f8252e.mo6604a();
            if (str15 != null) {
                if (!str15.isEmpty() && Build.VERSION.SDK_INT >= ((Integer) C0371o.f8253f.mo6604a()).intValue()) {
                    HashMap hashMap2 = new HashMap();
                    String[] split = str15.split(",");
                    for (String str16 : split) {
                        hashMap2.put(str16, C0622at.m5623a(str16));
                    }
                    hashMap.put("video_decoders", hashMap2);
                }
            }
            if (((Boolean) C0371o.f8239aq.mo6604a()).booleanValue()) {
                C0517b j2 = C0387d.m5372j();
                if (((Boolean) C0371o.f8239aq.mo6604a()).booleanValue()) {
                    try {
                        synchronized (C0517b.f8534a) {
                            try {
                                if (((Boolean) C0371o.f8239aq.mo6604a()).booleanValue() && !C0517b.f8535b) {
                                    C0517b.f8535b = true;
                                    j2.f8536c = (C0871a) C0636k.m5677a(context2, "com.google.android.gms.ads.omid.DynamiteOmid", C0516a.f8533a);
                                }
                            } catch (C0635j e4) {
                                C0633h.m5675e("#007 Could not call remote method.", e4);
                            } catch (Throwable th) {
                                while (true) {
                                }
                                throw th;
                            }
                        }
                        C0871a aVar3 = j2.f8536c;
                        Parcel a = aVar3.mo8526a(6, aVar3.mo8529bj());
                        String readString = a.readString();
                        a.recycle();
                        String valueOf = String.valueOf(readString);
                        str = valueOf.length() == 0 ? new String("a.") : "a.".concat(valueOf);
                    } catch (RemoteException | NullPointerException e5) {
                        C0633h.m5675e("#007 Could not call remote method.", e5);
                        str = null;
                    }
                } else {
                    str = null;
                }
                hashMap.put("omid_v", str);
            }
            ArrayList arrayList = adRequestInfoParcel.f8604ac;
            if (arrayList != null && !arrayList.isEmpty()) {
                hashMap.put("android_permissions", adRequestInfoParcel.f8604ac);
            }
            String str17 = adRequestInfoParcel.f8605ad;
            if (str17 != null) {
                hashMap.put("consent_string", str17);
            }
            if (adRequestInfoParcel.f8605ad != null) {
                hashMap.put("iab_consent_info", adRequestInfoParcel.f8608ag);
            }
            if (C0633h.m5667a(2)) {
                String valueOf2 = String.valueOf(C0387d.m5363a().mo6849a(hashMap).toString(2));
                if (valueOf2.length() == 0) {
                    new String("Ad Request JSON: ");
                } else {
                    "Ad Request JSON: ".concat(valueOf2);
                }
            }
            return C0387d.m5363a().mo6849a(hashMap);
        } catch (JSONException e6) {
            String valueOf3 = String.valueOf(e6.getMessage());
            C0633h.m5672d(valueOf3.length() == 0 ? new String("Problem serializing ad request to JSON: ") : "Problem serializing ad request to JSON: ".concat(valueOf3));
            return null;
        } catch (Throwable th2) {
            while (true) {
            }
            throw th2;
        }
    }

    /* renamed from: a */
    private static void m5557a(HashMap hashMap, Location location) {
        HashMap hashMap2 = new HashMap();
        Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
        Long valueOf2 = Long.valueOf(location.getTime() * 1000);
        Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
        Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
        hashMap2.put("radius", valueOf);
        hashMap2.put("lat", valueOf3);
        hashMap2.put("long", valueOf4);
        hashMap2.put("time", valueOf2);
        hashMap.put("uule", hashMap2);
    }
}
