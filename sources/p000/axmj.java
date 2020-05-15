package p000;

import android.accounts.Account;
import android.content.Context;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.NoConnectionError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.android.gms.common.server.NetworkCallbacks;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: axmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axmj extends Request implements NetworkCallbacks {

    /* renamed from: d */
    public final Context f96186d;

    /* renamed from: e */
    public String f96187e;

    /* renamed from: f */
    private final byte[] f96188f;

    /* renamed from: g */
    private final Account f96189g;

    /* renamed from: h */
    private final String f96190h;

    /* renamed from: i */
    private final bxxc f96191i;

    /* renamed from: j */
    private final Response.Listener f96192j;

    /* renamed from: k */
    private final Map f96193k = new HashMap();

    public axmj(Context context, String str, byte[] bArr, Account account, String str2, bxxc bxxc, Response.Listener listener, Response.ErrorListener errorListener) {
        super(1, str, errorListener);
        this.f96186d = context;
        this.f96188f = bArr;
        this.f96189g = account;
        this.f96190h = str2;
        this.f96191i = bxxc;
        this.f96192j = listener;
        setRetryPolicy(new axmi(this));
    }

    /* renamed from: a */
    private static String m82723a(NetworkResponse networkResponse) {
        if (networkResponse.headers.containsKey("Content-type")) {
            return (String) networkResponse.headers.get("Content-type");
        }
        throw new ParseException("Unable to extract content type!", -1);
    }

    public final /* bridge */ /* synthetic */ void deliverResponse(Object obj) {
        this.f96192j.onResponse((bxxc) obj);
    }

    public final byte[] getBody() {
        return this.f96188f;
    }

    public final String getBodyContentType() {
        return "application/octet-stream";
    }

    public final Map getHeaders() {
        try {
            String b = gie.m13194b(this.f96186d, this.f96189g, this.f96190h);
            this.f96187e = b;
            String valueOf = String.valueOf(b);
            mo53245a("Authorization", valueOf.length() == 0 ? new String("Bearer ") : "Bearer ".concat(valueOf));
            return this.f96193k;
        } catch (gid | IOException e) {
            throw new AuthFailureError("Auth error", e);
        }
    }

    public final void onPostNetworkDispatch() {
        shr.m35312a();
    }

    public final void onPreNetworkDispatch() {
        shr.m35316b(13568);
    }

    /* access modifiers changed from: protected */
    public final VolleyError parseNetworkError(VolleyError volleyError) {
        if (!(volleyError == null || volleyError.networkResponse == null)) {
            axma a = axma.m82708a(this.f96186d, this.f96189g.name);
            String url = getUrl();
            int i = volleyError.networkResponse.statusCode;
            long networkTimeMs = volleyError.getNetworkTimeMs();
            bxvd da = bwah.f158643i.mo74144da();
            String str = a.f96172a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwah bwah = (bwah) da.f164949b;
            str.getClass();
            int i2 = bwah.f158645a | 2;
            bwah.f158645a = i2;
            bwah.f158647c = str;
            bwah.f158648d = 2;
            bwah.f158645a = i2 | 4;
            bxvd da2 = bwaf.f158630e.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bwaf bwaf = (bwaf) da2.f164949b;
            url.getClass();
            bwaf.f158632a |= 1;
            bwaf.f158633b = url;
            String valueOf = String.valueOf(i);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bwaf bwaf2 = (bwaf) da2.f164949b;
            valueOf.getClass();
            int i3 = bwaf2.f158632a | 2;
            bwaf2.f158632a = i3;
            bwaf2.f158634c = valueOf;
            bwaf2.f158632a = i3 | 4;
            bwaf2.f158635d = networkTimeMs;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwah bwah2 = (bwah) da.f164949b;
            bwaf bwaf3 = (bwaf) da2.mo74062i();
            bwaf3.getClass();
            bwah2.f158651g = bwaf3;
            bwah2.f158645a |= 32;
            a.mo53239a((bwah) da.mo74062i(), (String) null, 1);
        }
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse != null && networkResponse.statusCode == 403) {
            VolleyError volleyError2 = parseNetworkResponse(networkResponse).error;
            if (volleyError2 != null) {
                return volleyError2;
            }
        } else if (networkResponse == null && ((volleyError instanceof NoConnectionError) || (volleyError instanceof TimeoutError) || (volleyError instanceof NetworkError) || ((volleyError instanceof AuthFailureError) && volleyError.getCause().getMessage().equals("NetworkError")))) {
            return new VolleyError("No network connection", new axml());
        }
        return volleyError;
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        try {
            if (networkResponse.statusCode == 200) {
                if (m82723a(networkResponse).equalsIgnoreCase("application/octet-stream")) {
                    return Response.success(axmn.m82725a(new ByteArrayInputStream(networkResponse.data), this.f96191i).f96195b, HttpHeaderParser.parseCacheHeaders(networkResponse));
                }
            }
            if (networkResponse.statusCode == 401) {
                return Response.error(new VolleyError("Auth error. 401 response"));
            }
            if (!m82723a(networkResponse).equalsIgnoreCase("application/octet-stream")) {
                return Response.error(new VolleyError("Bad content type - Likely a stack trace or a captive portal is blocking our access."));
            }
            axmm a = axmn.m82725a(new ByteArrayInputStream(networkResponse.data), this.f96191i);
            if (a.f96194a.f171538a.size() > 0) {
                if ((((bzvn) a.f96194a.f171538a.get(0)).f171534a & 1) != 0) {
                    int a2 = bzvl.m126247a(((bzvn) a.f96194a.f171538a.get(0)).f171535b);
                    if (a2 != 0) {
                        if (a2 == 5) {
                            return Response.error(new VolleyError("KYC Challenge", new axmk()));
                        }
                    }
                    return Response.error(new VolleyError("Received a responseMetadataRejection.WalletP2P doesn't know how to handle those yet."));
                }
            }
            return Response.error(new VolleyError("Bad Status Code received - Good content type - No rejections. Something is really broken"));
        } catch (IOException e) {
            return Response.error(new VolleyError("Unable to build response payload", e));
        } catch (ParseException e2) {
            return Response.error(new VolleyError("Unable to parse content type", e2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo53245a(String str, String str2) {
        this.f96193k.put(str, str2);
    }
}
