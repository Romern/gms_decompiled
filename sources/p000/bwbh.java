package p000;

import android.util.Log;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.RequestFuture;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bwbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bwbh extends Request {

    /* renamed from: d */
    private final bwbi f158727d;

    /* renamed from: e */
    private final byte[] f158728e;

    /* renamed from: f */
    private final bwbj f158729f;

    /* renamed from: g */
    private final RequestFuture f158730g;

    /* renamed from: h */
    private final boolean f158731h = true;

    public bwbh(bwbi bwbi, byte[] bArr, bwbj bwbj, String str, RequestFuture requestFuture) {
        super(1, str, requestFuture);
        this.f158727d = bwbi;
        this.f158728e = bArr;
        this.f158729f = bwbj;
        this.f158730g = requestFuture;
    }

    public final /* bridge */ /* synthetic */ void deliverResponse(Object obj) {
        this.f158730g.onResponse((byte[]) obj);
    }

    public final byte[] getBody() {
        return this.f158728e;
    }

    public final String getBodyContentType() {
        return "application/binary";
    }

    public final Map getHeaders() {
        bwbi bwbi = this.f158727d;
        byte[] bArr = this.f158728e;
        boolean z = this.f158731h;
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Length", String.valueOf(bArr.length));
        if (!z) {
            String m = bwbi.f158733b.mo73442m();
            String n = bwbi.f158733b.mo73443n();
            if (n != null) {
                hashMap.put("X-Google-Maps-Mobile-API", bwaq.m121662a(new String[]{m, n, bwbi.f158737f, "6.18.0", bwbi.f158736e}, ","));
            } else {
                throw new IllegalStateException("app version not set");
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        String str = (String) networkResponse.headers.get("Content-Type");
        try {
            bwbi bwbi = this.f158727d;
            int i = networkResponse.statusCode;
            if (i != 200) {
                if (bwam.m121655a(bwbi.f158732a, 5)) {
                    String str2 = bwbi.f158732a;
                    StringBuilder sb = new StringBuilder(35);
                    sb.append("Bad HTTP response code: ");
                    sb.append(i);
                    Log.w(str2, sb.toString());
                }
                if (i == 500) {
                    for (bwbd bwbd : bwbi.f158734c) {
                        bwbd.mo73419e();
                    }
                    String a = bwbi.m121720a(bwbi.f158734c);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 41);
                    sb2.append("Serverside failure (HTTP");
                    sb2.append(500);
                    sb2.append(") for ");
                    sb2.append(a);
                    throw new bwbk(sb2.toString());
                } else if (i != 501) {
                    String a2 = bwbi.m121720a(bwbi.f158734c);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(a2).length() + 40);
                    sb3.append("Bad HTTP response code: ");
                    sb3.append(i);
                    sb3.append(" for ");
                    sb3.append(a2);
                    throw new IOException(sb3.toString());
                } else {
                    bwbi.f158733b.mo73447r();
                    throw new IOException("Server side HTTP not implemented");
                }
            } else if (!"application/binary".equals(str)) {
                if (bwam.m121655a(bwbi.f158732a, 6)) {
                    String str3 = bwbi.f158732a;
                    String valueOf = String.valueOf(str);
                    Log.e(str3, valueOf.length() == 0 ? new String("Bad HTTP content type: ") : "Bad HTTP content type: ".concat(valueOf));
                }
                String a3 = bwbi.m121720a(bwbi.f158734c);
                StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 28 + String.valueOf(a3).length());
                sb4.append("Bad HTTP content type: ");
                sb4.append(str);
                sb4.append(" for ");
                sb4.append(a3);
                throw new IOException(sb4.toString());
            } else {
                this.f158729f.mo73449a();
                return Response.success(networkResponse.data, null);
            }
        } catch (bwbk | IOException e) {
            return Response.error(new VolleyError(e));
        }
    }
}
