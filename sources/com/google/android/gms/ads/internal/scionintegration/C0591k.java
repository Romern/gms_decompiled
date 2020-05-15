package com.google.android.gms.ads.internal.scionintegration;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.config.C0371o;

/* renamed from: com.google.android.gms.ads.internal.scionintegration.k */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0591k {
    /* renamed from: a */
    public static Uri m5597a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }

    /* renamed from: b */
    public static String m5599b(String str, Context context) {
        if (((Boolean) C0371o.f8188B.mo6604a()).booleanValue() || !C0387d.m5374l().mo6773a(context) || TextUtils.isEmpty(str)) {
            return str;
        }
        C0590j l = C0387d.m5374l();
        String str2 = null;
        if (l.mo6773a(context)) {
            if (C0590j.m5589c(context)) {
                Long l2 = (Long) l.mo6770a("getAdEventId", (Object) null, C0587g.f8880a);
                if (l2 != null) {
                    str2 = Long.toString(l2.longValue());
                }
            } else {
                Object a = l.mo6769a("generateEventId", context);
                if (a != null) {
                    str2 = a.toString();
                }
            }
        }
        if (str2 == null) {
            return str;
        }
        if (((Boolean) C0371o.f8267t.mo6604a()).booleanValue()) {
            String str3 = (String) C0371o.f8268u.mo6604a();
            if (str.contains(str3)) {
                if (C0387d.m5363a().mo6857a(str)) {
                    C0387d.m5374l().mo6771a(context, str2);
                    return m5598a(str, context).replace(str3, str2);
                } else if (C0387d.m5363a().mo6861b(str)) {
                    C0387d.m5374l().mo6775b(context, str2);
                    return m5598a(str, context).replace(str3, str2);
                }
            }
        } else if (!str.contains("fbs_aeid")) {
            if (C0387d.m5363a().mo6857a(str)) {
                C0387d.m5374l().mo6771a(context, str2);
                return m5597a(m5598a(str, context), "fbs_aeid", str2).toString();
            } else if (C0387d.m5363a().mo6861b(str)) {
                C0387d.m5374l().mo6775b(context, str2);
                return m5597a(m5598a(str, context), "fbs_aeid", str2).toString();
            }
        }
        return str;
    }

    /* renamed from: a */
    public static String m5598a(String str, Context context) {
        String str2;
        C0590j l = C0387d.m5374l();
        if (l.mo6773a(context)) {
            synchronized (l.f8882a) {
                str2 = l.f8883b;
                if (str2 == null) {
                    if (!C0590j.m5589c(context)) {
                        l.f8883b = (String) l.mo6769a("getGmpAppId", context);
                    } else {
                        l.f8883b = (String) l.mo6770a("getGmpAppId", l.f8883b, C0583c.f8875a);
                    }
                    str2 = l.f8883b;
                }
            }
        } else {
            str2 = null;
        }
        String b = C0387d.m5374l().mo6774b(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(str2)) {
            str = m5597a(str, "gmp_app_id", str2).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(b)) ? str : m5597a(str, "fbs_aiid", b).toString();
    }
}
