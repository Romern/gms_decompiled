package p000;

import android.webkit.WebResourceResponse;
import org.json.JSONArray;

/* renamed from: azrm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azrm {

    /* renamed from: a */
    public static final WebResourceResponse f99947a = new WebResourceResponse("text/html", "utf-8", null);

    /* renamed from: b */
    public static final JSONArray f99948b;

    /* renamed from: c */
    public static final bnhe f99949c = bnhe.m109411a("access-control-allow-origin", "*", "cache-control", "no-cache, no-store, max-age=0, must-revalidate", "expires", "Mon, 01 Jan 1990 00:00:00 GMT", "pragma", "no-cache");

    /* renamed from: d */
    public static final bnhe f99950d = bnhe.m109410a("access-control-allow-origin", "*", "cache-control", "public, max-age=31536000", "expires", "Tue, 12 Jan 2021 23:38:32 GMT");

    static {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(bctq.f104880a.f104888h);
        jSONArray.put(bctq.f104881b.f104888h);
        f99948b = jSONArray;
    }
}
