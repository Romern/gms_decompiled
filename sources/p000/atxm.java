package p000;

import android.content.Intent;
import android.net.Uri;

/* renamed from: atxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atxm {

    /* renamed from: a */
    public String f91082a;

    /* renamed from: b */
    private String f91083b;

    /* renamed from: c */
    private String f91084c;

    /* renamed from: d */
    private String f91085d;

    /* renamed from: c */
    public static final Intent m76502c() {
        return new Intent("android.intent.action.VIEW").setFlags(268435456);
    }

    /* renamed from: a */
    public final Intent mo50304a() {
        return m76502c().setPackage("com.android.vending").setData(new Uri.Builder().scheme("market").authority("details").appendQueryParameter("id", "com.google.android.apps.walletnfcrel").appendQueryParameter("url", mo50306b().toString()).appendQueryParameter("min_version", "930000000").build());
    }

    /* renamed from: a */
    public final void mo50305a(String str, String str2, String str3) {
        this.f91083b = str;
        this.f91084c = str2;
        this.f91085d = str3;
    }

    /* renamed from: b */
    public final Uri mo50306b() {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority("www.android.com").appendPath("payapp");
        String str = this.f91082a;
        if (str != null) {
            appendPath.appendQueryParameter("context", str);
        }
        String str2 = this.f91083b;
        if (!(str2 == null || this.f91084c == null || this.f91085d == null)) {
            appendPath.appendQueryParameter("utm_source", str2).appendQueryParameter("utm_campaign", this.f91084c).appendQueryParameter("utm_medium", this.f91085d);
        }
        return appendPath.build();
    }
}
