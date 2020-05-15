package p000;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BaseHttpStack;
import com.android.volley.toolbox.BasicNetwork;
import java.util.Map;

/* renamed from: tvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tvj extends BasicNetwork {

    /* renamed from: a */
    private final int f46714a;

    public tvj(BaseHttpStack baseHttpStack, int i) {
        super(baseHttpStack);
        this.f46714a = i;
    }

    public final NetworkResponse performRequest(Request request) {
        int i;
        shr.m35313a(4102, this.f46714a);
        bdnd bdnd = new bdnd(request.getUrl());
        bdnd.mo58201a();
        try {
            NetworkResponse performRequest = super.performRequest(request);
            if (performRequest != null) {
                Map map = performRequest.headers;
                if (map != null) {
                    bdnd.mo58204a((String) map.get("Content-Type"));
                }
                byte[] bArr = performRequest.data;
                int i2 = 0;
                if (bArr != null) {
                    i = bArr.length;
                } else {
                    i = 0;
                }
                if (request.getBody() != null) {
                    i2 = request.getBody().length;
                }
                bdnd.mo58203a(i, i2);
                bdnd.mo58202a(performRequest.statusCode);
            }
            shr.m35312a();
            bdgs.m90764a().mo58026a(bdnd);
            return performRequest;
        } catch (VolleyError e) {
            NetworkResponse networkResponse = e.networkResponse;
            if (networkResponse != null) {
                bdnd.mo58202a(networkResponse.statusCode);
            }
            throw e;
        } catch (Throwable th) {
            shr.m35312a();
            bdgs.m90764a().mo58026a(bdnd);
            throw th;
        }
    }
}
