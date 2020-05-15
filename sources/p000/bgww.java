package p000;

import android.content.Context;
import com.android.volley.Request;
import com.android.volley.Response;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.response.FieldMappingDictionary;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* renamed from: bgww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgww extends bgwr {

    /* renamed from: n */
    private final Context f117870n;

    public bgww(Context context) {
        super(context, chcs.f188354a.mo6606a().mo85104g(), chcs.f188354a.mo6606a().mo85102e(), chcs.f188354a.mo6606a().mo85103f());
        this.f117870n = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final sha mo25535a(ClientContext clientContext, int i, String str, Object obj, Class cls, FieldMappingDictionary fieldMappingDictionary, String str2, String str3, Response.Listener listener, Response.ErrorListener errorListener, HashMap hashMap) {
        if (obj != null && chcs.f188354a.mo6606a().mo85094bc()) {
            try {
                byte[] bytes = obj.toString().getBytes("utf-8");
                byte[] a = bgzo.m100469a(bytes);
                if (bytes.length > a.length) {
                    hashMap.put("Content-Encoding", "gzip");
                    return new bgwv(i, str, cls, fieldMappingDictionary, listener, errorListener, str2, str3, this.f44441a, hashMap, this.f44447g, this.f44448h, a);
                }
            } catch (UnsupportedEncodingException e) {
                bgur.m100009a("GCoreUlr", 46, "Failed to compress JSON", e);
            } catch (IOException e2) {
                bgur.m100009a("GCoreUlr", 47, "Failed to compress JSON", e2);
            }
        }
        return super.mo25535a(clientContext, i, str, obj, cls, fieldMappingDictionary, str2, str3, listener, errorListener, hashMap);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9812a(Request request, String str) {
        if (request.getUrl().contains("/reports")) {
            request.setRetryPolicy(new sgu(this.f117870n, str, (int) chcs.f188354a.mo6606a().mo85093bb(), (int) chcs.f188354a.mo6606a().mo85092ba(), (float) chcs.f188354a.mo6606a().mo85063aY()));
            return;
        }
        super.mo9812a(request, str);
    }
}
