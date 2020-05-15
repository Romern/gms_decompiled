package p000;

import android.content.Context;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;

/* renamed from: gmv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gmv {
    /* renamed from: a */
    public static HttpResponse m13464a(String str, String str2, HttpEntity httpEntity, Context context) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        rqv.m34278a(context, linkedHashMap, str2);
        Header contentType = httpEntity.getContentType();
        if (contentType != null) {
            linkedHashMap.put(contentType.getName(), contentType.getValue());
        }
        return m13465a(str, httpEntity, linkedHashMap);
    }

    /* renamed from: b */
    public static String m13467b(HttpResponse httpResponse) {
        byte[] a = m13466a(httpResponse);
        return a != null ? new String(a, bmwy.f131158c) : "";
    }

    /* renamed from: a */
    public static HttpResponse m13465a(String str, HttpEntity httpEntity, Map map) {
        jhq jhq = (jhq) jhq.f22499a.mo13145b();
        HttpPost httpPost = new HttpPost(str);
        httpPost.setEntity(httpEntity);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                httpPost.addHeader((String) entry.getKey(), (String) entry.getValue());
            }
        }
        abop.m48014a((HttpRequest) httpPost);
        return jhq.mo13753a(httpPost);
    }

    /* renamed from: a */
    public static byte[] m13466a(HttpResponse httpResponse) {
        InputStream a = abop.m48011a(httpResponse.getEntity());
        if (a != null) {
            return srz.m36178b(a);
        }
        return null;
    }
}
