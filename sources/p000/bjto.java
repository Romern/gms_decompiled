package p000;

import android.net.Uri;
import android.text.TextUtils;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import org.json.JSONObject;

/* renamed from: bjto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjto implements Response.Listener {

    /* renamed from: a */
    private static final Uri f123291a = Uri.parse("https://payments.google.com/payments/data/address");

    /* renamed from: b */
    private final RequestQueue f123292b;

    /* renamed from: c */
    private final int f123293c;

    /* renamed from: d */
    private final String f123294d;

    /* renamed from: e */
    private final Response.ErrorListener f123295e;

    /* renamed from: f */
    private final bkab f123296f;

    public bjto(RequestQueue requestQueue, int i, String str, bkab bkab, Response.ErrorListener errorListener) {
        this.f123292b = requestQueue;
        this.f123293c = i;
        this.f123294d = str;
        this.f123296f = bkab;
        this.f123295e = errorListener;
    }

    /* renamed from: a */
    public static String m104585a(int i, String str) {
        StringBuilder sb = new StringBuilder("data");
        sb.append("/");
        sb.append(bjtv.m104615a(i));
        if (!TextUtils.isEmpty(str)) {
            sb.append("--");
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static Uri m104586b(int i, String str) {
        return f123291a.buildUpon().appendEncodedPath(m104585a(i, str)).build();
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String e = bjtl.m104584e(jSONObject, this.f123294d);
        if (!TextUtils.isEmpty(e)) {
            mo65527a(e);
        } else {
            this.f123296f.mo65686a(jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo65527a(String str) {
        this.f123292b.add(new bjtn(this.f123293c, str, this, this.f123295e));
    }
}
