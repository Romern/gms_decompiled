package p000;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.RequestFuture;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bjjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjjg extends Request {

    /* renamed from: d */
    private final byte[] f122820d;

    /* renamed from: e */
    private final RequestFuture f122821e;

    /* renamed from: f */
    private final HashMap f122822f;

    public bjjg(String str, byte[] bArr, RequestFuture requestFuture, String str2, List list) {
        super(1, str, requestFuture);
        this.f122820d = bArr;
        this.f122821e = requestFuture;
        HashMap a = bnmt.m109795a((list != null ? list.size() / 2 : 0) + 3);
        this.f122822f = a;
        a.put("Content-Type", "application/x-protobuf");
        HashMap hashMap = this.f122822f;
        String valueOf = String.valueOf(str2);
        hashMap.put("Authorization", valueOf.length() == 0 ? new String("Bearer ") : "Bearer ".concat(valueOf));
        this.f122822f.put("X-Modality", "ANDROID_NATIVE");
        if (list != null && !list.isEmpty()) {
            this.f122822f.put("EES-S7E-Mode", "proto");
            bjje.m103644a(this.f122822f, list);
        }
        setRetryPolicy(new DefaultRetryPolicy(25000, 0, 1.0f));
    }

    public final /* bridge */ /* synthetic */ void deliverResponse(Object obj) {
        this.f122821e.onResponse((NetworkResponse) obj);
    }

    public final byte[] getBody() {
        return this.f122820d;
    }

    public final Map getHeaders() {
        return this.f122822f;
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        return Response.success(networkResponse, null);
    }
}
