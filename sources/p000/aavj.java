package p000;

import android.content.Context;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.List;

/* renamed from: aavj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aavj extends aarw {

    /* renamed from: j */
    public static final /* synthetic */ int f56655j = 0;

    /* renamed from: k */
    private final List f56656k;

    public aavj(Context context, HelpConfig helpConfig, String str, List list, Response.Listener listener, Response.ErrorListener errorListener) {
        super(context, helpConfig, str, listener, errorListener);
        this.f56656k = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31678a(aash aash) {
        aash.f56440e = this.f56656k;
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        if (networkResponse.statusCode == 200) {
            return Response.success(null, null);
        }
        return Response.error(new VolleyError(networkResponse));
    }
}
