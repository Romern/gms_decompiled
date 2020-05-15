package p000;

import android.accounts.Account;
import android.content.Context;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: enx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class enx extends Request {

    /* renamed from: d */
    protected final String f15361d;

    /* renamed from: e */
    protected String f15362e;

    /* renamed from: f */
    protected final String f15363f;

    /* renamed from: g */
    protected final Context f15364g;

    /* renamed from: h */
    private final Response.Listener f15365h;

    /* renamed from: i */
    private final Object f15366i;

    /* renamed from: j */
    private final bxxk f15367j;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10343b() {
        try {
            gie.m13196b(this.f15364g, this.f15362e);
            int i = eoa.f15378a;
        } catch (gid | IOException e) {
            eoa.m10827b("GoogleAuthProtoRequest", e, "Failed to clear the auth token.", new Object[0]);
        }
    }

    public final void deliverError(VolleyError volleyError) {
        Map map;
        if ((volleyError instanceof AuthFailureError) && this.f15362e != null) {
            new Thread(new enw(this)).start();
        }
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (!(networkResponse == null || (map = networkResponse.headers) == null || !"application/octet-stream".equals(map.get("Content-Type")))) {
            Response parseNetworkResponse = parseNetworkResponse(networkResponse);
            if (parseNetworkResponse.isSuccess()) {
                bxxc bxxc = (bxxc) parseNetworkResponse.result;
                volleyError = new enz(volleyError);
            }
        }
        super.deliverError(volleyError);
    }

    public final void deliverResponse(Object obj) {
        Response.Listener listener = this.f15365h;
        if (listener != null) {
            listener.onResponse(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, bxxc], assign insn: 0x0000: IGET  (r0v0 ? I:java.lang.Object) = (r1v0 'this' enx A[THIS]) enx.i java.lang.Object */
    public final byte[] getBody() {
        return this.f15366i.mo73642k();
    }

    public final String getBodyContentType() {
        return "application/x-protobuf";
    }

    public final Map getHeaders() {
        if (this.f15363f == null) {
            return super.getHeaders();
        }
        try {
            String valueOf = String.valueOf(this.f15361d);
            this.f15362e = gie.m13189a(this.f15364g, this.f15363f, valueOf.length() == 0 ? new String("oauth2:") : "oauth2:".concat(valueOf));
            HashMap hashMap = new HashMap();
            String valueOf2 = String.valueOf(this.f15362e);
            hashMap.put("Authorization", valueOf2.length() == 0 ? new String("Bearer ") : "Bearer ".concat(valueOf2));
            return hashMap;
        } catch (UserRecoverableAuthException e) {
            throw new AuthFailureError(e.mo7366a());
        } catch (gid | IOException e2) {
            throw new AuthFailureError(e2.getMessage(), e2);
        }
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        try {
            return Response.success((bxxc) this.f15367j.mo73657a(networkResponse.data), null);
        } catch (Exception e) {
            return Response.error(new VolleyError(e.getMessage(), e));
        }
    }

    protected enx(Context context, String str, Response.Listener listener, Response.ErrorListener errorListener, bxxk bxxk, bxxc bxxc, String str2, Account account) {
        super(1, str, errorListener);
        this.f15364g = context.getApplicationContext();
        this.f15361d = str2;
        setRetryPolicy(new eny(this));
        setShouldCache(false);
        setShouldRetryServerErrors(true);
        this.f15365h = listener;
        this.f15366i = bxxc;
        if (account != null) {
            String str3 = account.name;
            this.f15363f = str3;
            new Object[1][0] = str3;
            int i = eoa.f15378a;
        } else {
            int i2 = eoa.f15378a;
            this.f15363f = null;
        }
        this.f15367j = bxxk;
    }
}
