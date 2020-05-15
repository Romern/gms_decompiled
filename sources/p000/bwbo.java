package p000;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.ResponseDelivery;
import com.android.volley.VolleyError;
import com.felicanetworks.cmnctrl.net.DataParser;

/* renamed from: bwbo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bwbo implements ResponseDelivery {

    /* renamed from: a */
    private static final String f158752a = bwbo.class.getSimpleName();

    /* renamed from: a */
    private static String m121724a(Request request) {
        String str;
        String str2;
        String str3;
        try {
            byte[] body = request.getBody();
            if (body != null) {
                int length = body.length;
                StringBuilder sb = new StringBuilder(19);
                sb.append("[");
                sb.append(length);
                sb.append(" bytes]");
                str = sb.toString();
            } else {
                str = "<empty>";
            }
        } catch (AuthFailureError e) {
            str = "[Error retrieving body]";
        }
        try {
            str2 = String.valueOf(request.getHeaders());
        } catch (AuthFailureError e2) {
            str2 = "[Error retriving headers]";
        }
        bwau a = bwau.m121665a(request);
        a.mo73415a("URL", request.getUrl());
        a.mo73415a("Headers", str2);
        int method = request.getMethod();
        if (method == 0) {
            str3 = "GET";
        } else if (method != 1) {
            StringBuilder sb2 = new StringBuilder(13);
            sb2.append("(");
            sb2.append(method);
            sb2.append(")");
            str3 = sb2.toString();
        } else {
            str3 = DataParser.CONNECT_TYPE_POST;
        }
        a.mo73415a("Method", str3);
        a.mo73415a("Body", str);
        a.mo73415a("BodyContentType", request.getBodyContentType());
        return a.toString();
    }

    public void postError(Request request, VolleyError volleyError) {
        if (bwam.m121655a(f158752a, 3)) {
            String a = m121724a(request);
            String a2 = m121726a(volleyError);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 17 + String.valueOf(a2).length());
            sb.append("REQUEST: ");
            sb.append(a);
            sb.append("\nERROR: ");
            sb.append(a2);
            sb.toString();
        }
    }

    public void postResponse(Request request, Response response) {
        if (bwam.m121655a(f158752a, 3)) {
            String a = m121724a(request);
            String a2 = m121725a(response);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 20 + String.valueOf(a2).length());
            sb.append("REQUEST: ");
            sb.append(a);
            sb.append("\nRESPONSE: ");
            sb.append(a2);
            sb.toString();
        }
    }

    public void postResponse(Request request, Response response, Runnable runnable) {
        if (bwam.m121655a(f158752a, 3)) {
            String a = m121724a(request);
            String a2 = m121725a(response);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 20 + String.valueOf(a2).length());
            sb.append("REQUEST: ");
            sb.append(a);
            sb.append("\nRESPONSE: ");
            sb.append(a2);
            sb.toString();
        }
    }

    /* renamed from: a */
    private static String m121725a(Response response) {
        if (response.isSuccess()) {
            return "Response{OK}";
        }
        String a = m121726a(response.error);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 16);
        sb.append("Response{Error=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    private static String m121726a(VolleyError volleyError) {
        String str;
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse != null) {
            byte[] bArr = networkResponse.data;
            bwau a = bwau.m121665a(volleyError);
            a.mo73415a("ResponseCode", String.valueOf(networkResponse.statusCode));
            a.mo73415a("Headers", String.valueOf(networkResponse.headers));
            if (bArr != null) {
                int length = bArr.length;
                StringBuilder sb = new StringBuilder(19);
                sb.append("[");
                sb.append(length);
                sb.append(" bytes]");
                str = sb.toString();
            } else {
                str = "<empty>";
            }
            a.mo73415a("Data", str);
            return a.toString();
        }
        String message = volleyError.getMessage();
        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 15);
        sb2.append("VolleyError(\"");
        sb2.append(message);
        sb2.append("\")");
        return sb2.toString();
    }
}
