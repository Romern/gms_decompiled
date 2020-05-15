package p000;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aava */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aava extends aarw {
    public aava(Context context, HelpConfig helpConfig, String str, RequestFuture requestFuture) {
        super(context, helpConfig, str, requestFuture, requestFuture);
    }

    /* renamed from: a */
    public static bzra m47057a(Context context, HelpConfig helpConfig, abcr abcr) {
        sdo.m34973b("Must be called from a worker thread.");
        RequestFuture newFuture = RequestFuture.newFuture();
        aava aava = new aava(context, helpConfig, Uri.parse(ceeg.m136397b()).buildUpon().encodedPath(ceeg.f182447a.mo6606a().mo79005ay()).build().toString(), newFuture);
        aava.mo31679a(23, abcr);
        aava.mo31684e();
        try {
            return (bzra) newFuture.get(ceeg.m136412q(), TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("gH_RealtimeSuprtStatRq", "Fetching RealtimeSupportStatus failed.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        try {
            return Response.success((bzra) GeneratedMessageLite.m124016a(bzra.f171097c, networkResponse.data, bxus.m123744c()), null);
        } catch (bxwf e) {
            Log.e("gH_RealtimeSuprtStatRq", "Parsing RealtimeSupportStatus failed!", e);
            return Response.error(new VolleyError(networkResponse));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31678a(aash aash) {
        aash.f56449n = this.f56408f.mo43241p();
    }
}
