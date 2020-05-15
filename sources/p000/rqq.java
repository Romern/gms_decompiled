package p000;

import android.content.Context;
import com.android.volley.Request;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpClientStack;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* renamed from: rqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rqq extends HttpClientStack {

    /* renamed from: a */
    private static final HttpEntity f43524a = new ByteArrayEntity(new byte[0]);

    public final HttpResponse performRequest(Request request, Map map) {
        HttpResponse performRequest = super.performRequest(request, map);
        if (performRequest.getEntity() == null && (request instanceof shx)) {
            performRequest.setEntity(f43524a);
            performRequest.setStatusCode((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR);
        }
        return performRequest;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abop.<init>(android.content.Context, java.lang.String, boolean, boolean):void
     arg types: [android.content.Context, java.lang.String, int, boolean]
     candidates:
      abop.<init>(android.content.Context, java.lang.String, boolean, aboq):void
      abop.<init>(android.content.Context, java.lang.String, boolean, boolean):void */
    /* JADX WARNING: Illegal instructions before constructor call */
    public rqq(Context context, boolean z) {
        super(r2);
        abop abop = new abop(context, sic.m35342a(context, "ApiaryHttpClient/1.0"), true, cbxv.m128864b());
        ((rqt) rqt.f43529a.mo13145b()).mo25035a(abop, context);
        if (z) {
            abop.mo32251a(VolleyLog.TAG);
        }
        HttpParams httpParams = abop.f57804b;
        HttpConnectionParams.setConnectionTimeout(httpParams, 30000);
        HttpConnectionParams.setSoTimeout(httpParams, 30000);
        ConnManagerParams.setTimeout(httpParams, 30000);
    }
}
