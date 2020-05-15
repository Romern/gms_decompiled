package p000;

import android.content.Context;
import android.util.Log;
import android.webkit.WebResourceResponse;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.io.ByteArrayInputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: abfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abfj extends aary {
    public abfj(Context context, HelpConfig helpConfig, String str, RequestFuture requestFuture) {
        super(context, helpConfig, 0, str, requestFuture, requestFuture);
    }

    /* renamed from: a */
    public static WebResourceResponse m47616a(Context context, HelpConfig helpConfig, String str, abcr abcr) {
        sdo.m34973b("Must be called from a worker thread.");
        RequestFuture newFuture = RequestFuture.newFuture();
        abfj abfj = new abfj(context, helpConfig, str, newFuture);
        abfj.mo31679a(184, abcr);
        abfj.mo31684e();
        try {
            return (WebResourceResponse) newFuture.get(ceeg.f182447a.mo6606a().mo78988ah(), TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("gH_OAuthSCReq", "Fetching authenticated content failed.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        if (networkResponse.statusCode < 400) {
            return Response.success(new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(networkResponse.data)), null);
        }
        return Response.error(new VolleyError(networkResponse));
    }
}
