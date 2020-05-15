package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: abfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abfi extends aary {

    /* renamed from: j */
    private final aasm f57343j;

    private abfi(Context context, HelpConfig helpConfig, String str, aasm aasm, RequestFuture requestFuture) {
        super(context, helpConfig, 0, str, requestFuture, requestFuture);
        this.f57343j = aasm;
        ((aary) this).f56410h.put("If-None-Match", this.f57343j.f56504n);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0169  */
    /* renamed from: a */
    public static aasm m47615a(aasf aasf, aasm aasm) {
        String str;
        String str2;
        String str3;
        sdo.m34973b("Must be called from a worker thread.");
        RequestFuture newFuture = RequestFuture.newFuture();
        String a = aatf.m46976a(aatf.m46976a(aasm.f56498h, "components", "PCT_CONTEXT_SELECTOR"), "extra_params", "api_client.ghandroid");
        if (aasf.mo18626g() != null) {
            HelpConfig g = aasf.mo18626g();
            aasf.mo18630k();
            List a2 = g.mo43217a((Context) aasf);
            if (a2 != null && !a2.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                int size = a2.size();
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i < size) {
                        abes abes = (abes) a2.get(i);
                        try {
                            int i3 = abes.f57289a;
                            if ((i3 & 1) == 0) {
                                str = null;
                                break;
                            }
                            if ((i3 & 2) != 0) {
                                i2 = i2 + abes.f57290b.length() + abes.f57291c.length();
                                if (((long) i2) > ceeg.f182447a.mo6606a().mo79003aw()) {
                                    Log.w("gH_UrlUtil", "PSD LIMIT REACHED! Dropping PSD for request.");
                                    abcx.m47523g(aasf);
                                    str = null;
                                    break;
                                }
                                jSONObject.put(abes.f57290b, abes.f57291c);
                            }
                            i++;
                        } catch (JSONException e) {
                            Log.e("gH_UrlUtil", "Converting PSD to JSONObject failed.", e);
                            str = null;
                        }
                    } else {
                        String jSONObject2 = jSONObject.toString();
                        try {
                            str = URLEncoder.encode(jSONObject2, "UTF-8");
                            break;
                        } catch (UnsupportedEncodingException e2) {
                            String valueOf = String.valueOf(jSONObject2);
                            Log.e("gH_UrlUtil", valueOf.length() == 0 ? new String("Failed when encoding ") : "Failed when encoding ".concat(valueOf), e2);
                            str = null;
                        }
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    String valueOf2 = String.valueOf(a);
                    String valueOf3 = String.valueOf(String.format("&psd=%s", str));
                    a = valueOf3.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf3);
                }
                if (aasf.mo18626g() == null) {
                    HelpConfig g2 = aasf.mo18626g();
                    if (!TextUtils.isEmpty(g2.f78843r)) {
                        String valueOf4 = String.valueOf(a);
                        String valueOf5 = String.valueOf(g2.f78843r);
                        a = valueOf5.length() == 0 ? new String(valueOf4) : valueOf4.concat(valueOf5);
                    }
                    String valueOf6 = String.valueOf(a);
                    if (g2.f78829d != null) {
                        str3 = "1";
                    } else {
                        str3 = "0";
                    }
                    String str4 = g2.f78830e;
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf6).length() + 11 + str3.length() + String.valueOf(str4).length());
                    sb.append(valueOf6);
                    sb.append("&visit_id=");
                    sb.append(str3);
                    sb.append("-");
                    sb.append(str4);
                    String sb2 = sb.toString();
                    if (g2.f78829d == null) {
                        str2 = aatf.m46976a(sb2, "components", "PCT_SIGNED_OUT");
                    } else {
                        str2 = sb2;
                    }
                } else {
                    str2 = a;
                }
                aasf.mo18630k();
                new abfi(((Context) aasf).getApplicationContext(), aasf.mo18626g(), str2, aasm, newFuture).mo31684e();
                return (aasm) newFuture.get(ceeg.f182447a.mo6606a().mo78953U(), TimeUnit.SECONDS);
            }
        }
        str = null;
        if (!TextUtils.isEmpty(str)) {
        }
        if (aasf.mo18626g() == null) {
        }
        aasf.mo18630k();
        new abfi(((Context) aasf).getApplicationContext(), aasf.mo18626g(), str2, aasm, newFuture).mo31684e();
        try {
            return (aasm) newFuture.get(ceeg.f182447a.mo6606a().mo78953U(), TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            Log.e("gH_LeafContentRequest", "Fetching leaf content failed.", e3);
            return null;
        }
    }

    public final Request.Priority getPriority() {
        return Request.Priority.HIGH;
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        aasm aasm;
        aasm aasm2 = this.f57343j;
        if (networkResponse.statusCode == 304) {
            return Response.success(aasm.f56487a, null);
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers)));
            if (jSONObject.has("validation_error")) {
                if (jSONObject.getJSONArray("validation_error").length() > 0) {
                    aasm = null;
                    return Response.success(aasm, null);
                }
            }
            aasm = aasm.m46891a(jSONObject, aasm2);
            return Response.success(aasm, null);
        } catch (UnsupportedEncodingException e) {
            Log.e("gH_RenderingApiUtils", "Parsing leaf content response data failed.", e);
            return Response.error(new ParseError(e));
        } catch (JSONException e2) {
            Log.e("gH_RenderingApiUtils", "Parsing leaf content response data failed.", e2);
            return Response.error(new VolleyError(e2));
        }
    }
}
