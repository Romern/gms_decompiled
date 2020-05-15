package p000;

import android.content.Context;
import android.net.Uri;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: aatm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aatm extends aarw {

    /* renamed from: j */
    private final String f56557j;

    /* renamed from: k */
    private final String f56558k;

    /* renamed from: l */
    private final String f56559l;

    /* renamed from: m */
    private final String f56560m;

    /* renamed from: n */
    private final String f56561n;

    public aatm(Context context, HelpConfig helpConfig, String str, String str2, String str3, String str4, String str5, String str6, Response.Listener listener, Response.ErrorListener errorListener) {
        super(context, helpConfig, str, listener, errorListener);
        this.f56557j = str2;
        this.f56558k = str3;
        this.f56559l = str4;
        this.f56560m = str5;
        this.f56561n = str6;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31678a(aash aash) {
        aash.f56444i = this.f56557j;
        aash.f56445j = this.f56558k;
        aash.f56446k = this.f56559l;
        aash.f56456u = this.f56560m;
        String str = this.f56561n;
        if (str != null) {
            aash.f56441f = str;
        }
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        int i = networkResponse.statusCode;
        if (i == 202 || i == 200) {
            return Response.success(null, null);
        }
        return Response.error(new VolleyError(networkResponse));
    }

    /* renamed from: a */
    public static void m46988a(Context context, HelpConfig helpConfig, abcr abcr, String str, String str2, String str3, String str4, Response.Listener listener, Response.ErrorListener errorListener) {
        aatm aatm = new aatm(context, helpConfig, Uri.parse(ceeg.m136397b()).buildUpon().encodedPath(ceeg.f182447a.mo6606a().mo79028w()).appendQueryParameter("hl", aasw.m46952a()).build().toString(), str, str2, str3, str4, aazt.m47337b(context), listener, errorListener);
        aatm.mo31679a(17, abcr);
        aatm.mo31684e();
    }
}
