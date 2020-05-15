package p000;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: aaxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aaxl extends aarw {

    /* renamed from: j */
    private final String f56765j;

    /* renamed from: k */
    private final Long f56766k;

    /* renamed from: l */
    private final boolean f56767l;

    /* renamed from: m */
    private final String f56768m;

    public aaxl(Context context, HelpConfig helpConfig, String str, Long l, boolean z, String str2, String str3, Response.Listener listener, Response.ErrorListener errorListener) {
        super(context, helpConfig, str, listener, errorListener);
        this.f56766k = l;
        this.f56767l = z;
        this.f56765j = str2;
        this.f56768m = str3;
    }

    /* renamed from: a */
    public static void m47162a(Context context, HelpConfig helpConfig, abcr abcr, long j, Response.Listener listener, Response.ErrorListener errorListener, bqgj bqgj) {
        bqgj.execute(new aaxh(context, helpConfig, abcr, j, listener, errorListener));
    }

    /* renamed from: f */
    public static String m47164f() {
        return Uri.parse(ceeg.m136397b()).buildUpon().encodedPath(ceeg.f182447a.mo6606a().mo79016k()).build().toString();
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        if (networkResponse.statusCode == 200) {
            try {
                return Response.success((bzqe) bxvk.m124016a(bzqe.f170976d, networkResponse.data, bxus.m123744c()), null);
            } catch (bxwf e) {
                Log.e("gH_ChatSupportRequest", "Parsing ChatRequestStatus failed!", e);
            }
        }
        return Response.error(new VolleyError(networkResponse));
    }

    /* renamed from: a */
    public static void m47163a(Context context, HelpConfig helpConfig, abcr abcr, long j, String str, Response.Listener listener, Response.ErrorListener errorListener) {
        aaxi aaxi = new aaxi(context, helpConfig, m47164f(), Long.valueOf(j), str, aazt.m47337b(context), listener, errorListener);
        aaxi.mo31679a(15, abcr);
        aaxi.mo31684e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31678a(aash aash) {
        aash.f56449n = this.f56408f.mo43241p();
        HelpConfig helpConfig = this.f56408f;
        aash.f56450o = helpConfig.f78850y;
        aash.f56451p = this.f56766k;
        aash.f56452q = this.f56767l;
        aash.f56456u = this.f56765j;
        if (!TextUtils.isEmpty(helpConfig.mo43226c())) {
            aash.f56448m = this.f56408f.mo43226c();
        }
        if (!TextUtils.isEmpty(this.f56768m)) {
            aash.f56441f = this.f56768m;
        }
    }
}
