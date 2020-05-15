package p000;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: akjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class akjs extends Request {

    /* renamed from: d */
    protected final boolean f72109d;

    /* renamed from: e */
    protected final Object f72110e;

    /* renamed from: f */
    private final boolean f72111f;

    /* renamed from: g */
    private final Response.Listener f72112g;

    /* renamed from: h */
    private final List f72113h = new ArrayList();

    protected akjs(String str, Response.Listener listener, Response.ErrorListener errorListener, Object obj, boolean z, boolean z2, boolean z3) {
        super(1, str, errorListener);
        setShouldCache(false);
        this.f72112g = listener;
        this.f72110e = obj;
        this.f72109d = z3;
        if (z) {
            eoa.m10826b("GoogleAuthProtoRequest", "Sending to %s:", getUrl());
            mo39509b(obj);
        }
        this.f72111f = z2;
    }

    /* renamed from: a */
    public final void mo39510a(akjr akjr) {
        this.f72113h.add(akjr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo39508a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo39509b(Object obj);

    public final void deliverError(VolleyError volleyError) {
        Map map;
        List list = this.f72113h;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((akjr) list.get(i)).mo39506a();
        }
        NetworkResponse networkResponse = volleyError.networkResponse;
        Object obj = null;
        if (!(networkResponse == null || (map = networkResponse.headers) == null || !"application/octet-stream".equals(map.get("Content-Type")))) {
            Response parseNetworkResponse = parseNetworkResponse(networkResponse);
            if (parseNetworkResponse.isSuccess()) {
                obj = parseNetworkResponse.result;
            }
        }
        if (this.f72111f) {
            String valueOf = String.valueOf(getUrl());
            eoa.m10826b("GoogleAuthProtoRequest", valueOf.length() == 0 ? new String("Error from ") : "Error from ".concat(valueOf), new Object[0]);
            if (networkResponse != null) {
                int i2 = networkResponse.statusCode;
                StringBuilder sb = new StringBuilder(26);
                sb.append("response code: ");
                sb.append(i2);
                eoa.m10826b("GoogleAuthProtoRequest", sb.toString(), new Object[0]);
                if (obj != null) {
                    eoa.m10826b("GoogleAuthProtoRequest", "Error response proto: ", new Object[0]);
                    mo39508a(obj);
                }
            } else {
                eoa.m10826b("GoogleAuthProtoRequest", "no network response present in error", new Object[0]);
            }
        }
        super.deliverError(volleyError);
    }

    public final void deliverResponse(Object obj) {
        if (this.f72111f) {
            eoa.m10826b("GoogleAuthProtoRequest", "Response from %s:", getUrl());
            mo39508a(obj);
        }
        Response.Listener listener = this.f72112g;
        if (listener != null) {
            listener.onResponse(obj);
        }
    }

    public final String getBodyContentType() {
        return "application/x-protobuf";
    }

    public final Map getHeaders() {
        HashMap hashMap = new HashMap(super.getHeaders());
        List list = this.f72113h;
        int size = list.size();
        int i = 0;
        while (i < size) {
            akjr akjr = (akjr) list.get(i);
            try {
                akjr.mo39507a(hashMap);
                i++;
            } catch (VolleyError e) {
                akjr.mo39506a();
                String valueOf = String.valueOf(akjr);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Error in decorator ");
                sb.append(valueOf);
                throw new AuthFailureError(sb.toString(), e);
            }
        }
        return hashMap;
    }
}
