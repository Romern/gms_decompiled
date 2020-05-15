package p000;

import android.content.Context;
import android.net.Uri;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.RequestFuture;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.metrics.MetricsIntentOperation;
import java.util.concurrent.TimeUnit;

/* renamed from: abfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abfl extends aarw {

    /* renamed from: j */
    private final abep[] f57346j;

    /* renamed from: a */
    public static bzqw m47617a(Context context, abep[] abepArr, Response.ErrorListener errorListener, abcr abcr) {
        sdo.m34973b("Must be called from a worker thread.");
        RequestFuture newFuture = RequestFuture.newFuture();
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(45);
        sb.append("prefetch_offline_content-");
        sb.append(currentTimeMillis);
        String sb2 = sb.toString();
        HelpConfig helpConfig = new HelpConfig();
        helpConfig.f78827b = "com.google.android.gms";
        helpConfig.f78829d = null;
        helpConfig.f78830e = sb2;
        abfl abfl = new abfl(context, abepArr, helpConfig, newFuture, new abfk(newFuture, errorListener));
        abfl.mo31679a(185, abcr);
        super.mo31684e();
        try {
            return (bzqw) newFuture.get(ceeg.f182447a.mo6606a().mo78990aj(), TimeUnit.SECONDS);
        } finally {
            abfl.cancel();
            MetricsIntentOperation.m66597a(context, sb2, "com.google.android.gms", MfiClientException.TYPE_NO_ACCOUNT_INFO, 22, false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31678a(aash aash) {
        aash.f56443h = this.f57346j;
    }

    public final Request.Priority getPriority() {
        return Request.Priority.LOW;
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        byte[] bArr;
        if (networkResponse != null) {
            try {
                bArr = networkResponse.data;
            } catch (bxwf e) {
                return Response.error(new ParseError(networkResponse));
            }
        } else {
            bArr = null;
        }
        return Response.success((bzqw) GeneratedMessageLite.m124016a(bzqw.f171080b, bArr, bxus.m123744c()), null);
    }

    public abfl(Context context, abep[] abepArr, HelpConfig helpConfig, Response.Listener listener, Response.ErrorListener errorListener) {
        super(context, helpConfig, Uri.parse(ceeg.m136397b()).buildUpon().encodedPath(ceeg.f182447a.mo6606a().mo78992al()).build().toString(), listener, errorListener);
        this.f57346j = abepArr;
    }
}
