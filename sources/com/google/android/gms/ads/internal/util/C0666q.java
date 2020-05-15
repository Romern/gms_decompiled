package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;

/* renamed from: com.google.android.gms.ads.internal.util.q */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C0666q extends C0676x {
    /* renamed from: a */
    public final String mo6868a(Context context) {
        String str;
        C0619aq a = C0619aq.m5621a();
        if (TextUtils.isEmpty(a.f8934a)) {
            if (sqr.m35998a()) {
                str = (String) C0616an.m5619a(context, new C0617ao(context));
            } else {
                str = (String) C0616an.m5619a(context, new C0618ap(rfy.m33552i(context), context));
            }
            a.f8934a = str;
        }
        return a.f8934a;
    }

    /* renamed from: b */
    public final void mo6870b(Context context) {
        C0619aq a = C0619aq.m5621a();
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(a.f8934a)) {
            Context i = rfy.m33552i(context);
            if (sqr.m35998a() || i == null) {
                SharedPreferences.Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
                if (i == null) {
                    putString.apply();
                } else {
                    stj.m36296a(context, putString, "admob_user_agent");
                }
            }
            a.f8934a = defaultUserAgent;
        }
    }

    /* renamed from: a */
    public final void mo6869a(Context context, WebSettings webSettings) {
        super.mo6869a(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }
}
