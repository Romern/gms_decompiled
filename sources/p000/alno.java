package p000;

import android.os.Bundle;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import java.util.HashMap;
import java.util.Map;

/* renamed from: alno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alno implements Response.Listener {

    /* renamed from: a */
    final /* synthetic */ alsi f73856a;

    /* renamed from: b */
    final /* synthetic */ Bundle f73857b;

    public alno(alsi alsi, Bundle bundle) {
        this.f73856a = alsi;
        this.f73857b = bundle;
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        HashMap hashMap;
        NetworkResponse networkResponse = (NetworkResponse) obj;
        Map map = networkResponse.headers;
        if (map != null) {
            hashMap = new HashMap(map);
        } else {
            hashMap = null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("get.server_blob.format", this.f73856a.f74198b);
        bundle.putInt("get.server_blob.code", networkResponse.statusCode);
        bundle.putByteArray("get.server_blob.body", networkResponse.data);
        bundle.putSerializable("get.server_blob.headers", hashMap);
        this.f73857b.putBundle("get.server_blob", bundle);
    }
}
