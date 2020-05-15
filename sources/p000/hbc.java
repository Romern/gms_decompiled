package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: hbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hbc {

    /* renamed from: a */
    public final Context f19398a;

    public hbc(Context context) {
        this.f19398a = context;
    }

    /* renamed from: a */
    public static String m14161a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return new Intent("android.intent.action.VIEW", Uri.parse(str)).toUri(1);
        }
        return null;
    }

    /* renamed from: a */
    public final bqgg mo12373a(bqgj bqgj, String str) {
        shl shl = new shl(this.f19398a, "clientauthconfig.googleapis.com", 443, -1, 4105);
        shl.mo25556a("X-Goog-Api-Key", "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
        shl.mo25556a("X-Android-Package", this.f19398a.getPackageName());
        Context context = this.f19398a;
        String h = spn.m35895h(context, context.getPackageName());
        if (h != null) {
            shl.mo25556a("X-Android-Cert", h);
        }
        return bqgj.mo25819b(new hbb(this, new jef(shl), str));
    }
}
