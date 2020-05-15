package com.android.volley.toolbox;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class JsonArrayRequest extends JsonRequest {
    /* JADX WARNING: Illegal instructions before constructor call */
    public JsonArrayRequest(int i, String str, JSONArray jSONArray, Response.Listener listener, Response.ErrorListener errorListener) {
        super(i, str, r3, listener, errorListener);
        String str2;
        if (jSONArray != null) {
            str2 = jSONArray.toString();
        } else {
            str2 = null;
        }
    }

    /* access modifiers changed from: protected */
    public Response parseNetworkResponse(NetworkResponse networkResponse) {
        try {
            return Response.success(new JSONArray(new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers, "utf-8"))), HttpHeaderParser.parseCacheHeaders(networkResponse));
        } catch (UnsupportedEncodingException e) {
            return Response.error(new ParseError(e));
        } catch (JSONException e2) {
            return Response.error(new ParseError(e2));
        }
    }

    public JsonArrayRequest(String str, Response.Listener listener, Response.ErrorListener errorListener) {
        super(0, str, null, listener, errorListener);
    }
}
