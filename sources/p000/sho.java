package p000;

import android.content.Context;
import com.android.volley.Request;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpClientStack;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.entity.ByteArrayEntity;

/* renamed from: sho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sho extends HttpClientStack {

    /* renamed from: a */
    private static final HttpEntity f44493a = new ByteArrayEntity(new byte[0]);

    /* renamed from: b */
    private static final String f44494b;

    static {
        int b = stu.m36316b();
        StringBuilder sb = new StringBuilder(19);
        sb.append("GmsCore/");
        sb.append(b);
        f44494b = sb.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public sho(Context context, boolean z) {
        super(r0);
        abop abop = new abop(context, f44494b, true);
        if (z) {
            abop.mo32251a(VolleyLog.TAG);
        }
    }

    public final HttpResponse performRequest(Request request, Map map) {
        HttpResponse performRequest = super.performRequest(request, map);
        if (performRequest.getEntity() == null && (request instanceof shx)) {
            performRequest.setEntity(f44493a);
            performRequest.setStatusCode((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR);
        }
        return performRequest;
    }
}
