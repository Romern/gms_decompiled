package p000;

import android.net.Uri;
import android.util.Base64;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.RequestFuture;
import com.felicanetworks.cmnctrl.net.DataParser;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bjjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjjd extends Request {

    /* renamed from: d */
    private final RequestFuture f122811d;

    /* renamed from: e */
    private final String f122812e;

    /* renamed from: f */
    private final String f122813f;

    /* renamed from: g */
    private final String f122814g;

    /* renamed from: h */
    private final bwqe f122815h;

    public bjjd(String str, String str2, String str3, String str4, RequestFuture requestFuture, bwqe bwqe) {
        super(1, str, requestFuture);
        this.f122812e = str3;
        this.f122813f = str4;
        this.f122811d = requestFuture;
        this.f122814g = str2;
        this.f122815h = bwqe;
        setRetryPolicy(new DefaultRetryPolicy(25000, 0, 1.0f));
    }

    public final /* bridge */ /* synthetic */ void deliverResponse(Object obj) {
        this.f122811d.onResponse((NetworkResponse) obj);
    }

    public final byte[] getBody() {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("s7e_file", this.f122813f);
        bwqe bwqe = this.f122815h;
        if ((bwqe.f160651a & 2) != 0) {
            builder.appendQueryParameter("s7e_keytype", String.valueOf(bwqe.f160653c));
        }
        builder.appendQueryParameter("mime_type", "IMAGE_JPEG");
        builder.appendQueryParameter("file_name", this.f122812e);
        builder.appendQueryParameter("os_type", "android");
        bwqe bwqe2 = this.f122815h;
        if ((bwqe2.f160651a & 1) != 0) {
            builder.appendQueryParameter("upload_token", Base64.encodeToString(bwqe2.f160652b.mo73780k(), 2));
        }
        String encodedQuery = builder.build().getEncodedQuery();
        return encodedQuery != null ? encodedQuery.getBytes() : new byte[0];
    }

    public final Map getHeaders() {
        HashMap a = bnmt.m109795a(3);
        a.put("Content-Type", DataParser.CONTENT_TYPE_VALUE);
        String valueOf = String.valueOf(this.f122814g);
        a.put("Authorization", valueOf.length() == 0 ? new String("Bearer ") : "Bearer ".concat(valueOf));
        a.put("X-Modality", "ANDROID_NATIVE");
        return a;
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        return Response.success(networkResponse, null);
    }
}
