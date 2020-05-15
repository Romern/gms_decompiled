package p000;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: abdb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abdb extends aarw {

    /* renamed from: j */
    private final List f57064j;

    public abdb(Context context, HelpConfig helpConfig, Account account, String str, List list, Response.Listener listener, Response.ErrorListener errorListener) {
        super(context, helpConfig, account, str, listener, errorListener);
        this.f57064j = list;
    }

    /* renamed from: a */
    public static Future m47538a(Context context, HelpConfig helpConfig, Account account, List list, Response.Listener listener) {
        abcp abcp = new abcp(listener);
        new abdb(context, helpConfig, account, Uri.parse(ceeg.m136397b()).buildUpon().encodedPath(ceeg.m136419x()).build().toString(), list, abcp, abcp).mo31684e();
        return abcp;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31678a(aash aash) {
        aash.f56457v = this.f57064j;
    }

    public final void onPreNetworkDispatch() {
        shr.m35316b(3841);
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        int i = networkResponse.statusCode;
        if (i == 202 || i == 200) {
            return Response.success(Integer.valueOf(i), null);
        }
        return Response.error(new VolleyError(networkResponse));
    }
}
