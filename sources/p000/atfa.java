package p000;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.android.gms.common.server.NetworkCallbacks;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: atfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atfa extends Request implements NetworkCallbacks {

    /* renamed from: d */
    public static final srn f90217d = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: e */
    public final Context f90218e;

    /* renamed from: f */
    public final Account f90219f;

    /* renamed from: g */
    public String f90220g;

    /* renamed from: h */
    private final byte[] f90221h;

    /* renamed from: i */
    private final String f90222i;

    /* renamed from: j */
    private final bxxc f90223j;

    /* renamed from: k */
    private final Response.Listener f90224k;

    /* renamed from: l */
    private final Map f90225l = new HashMap();

    public atfa(Context context, String str, byte[] bArr, Account account, String str2, bxxc bxxc, Response.Listener listener, Response.ErrorListener errorListener) {
        super(1, str, errorListener);
        this.f90218e = context;
        this.f90221h = bArr;
        this.f90219f = account;
        this.f90222i = str2;
        this.f90223j = bxxc;
        this.f90224k = listener;
        setRetryPolicy(new atez(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo49918a(String str, String str2) {
        this.f90225l.put(str, str2);
    }

    /* renamed from: b */
    public final void mo49919b() {
        if (!TextUtils.isEmpty(this.f90220g)) {
            try {
                gie.m13196b(this.f90218e, this.f90220g);
            } catch (Exception e) {
                bnsl bnsl = (bnsl) f90217d.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("atfa", "b", 182, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Unexpected exception while clearing token");
            }
        }
    }

    public final /* bridge */ /* synthetic */ void deliverResponse(Object obj) {
        this.f90224k.onResponse((bxxc) obj);
    }

    public final byte[] getBody() {
        return this.f90221h;
    }

    public final String getBodyContentType() {
        return "application/x-protobuf";
    }

    public final Map getHeaders() {
        Account account = this.f90219f;
        if (account == null) {
            return this.f90225l;
        }
        try {
            String b = gie.m13194b(this.f90218e, account, this.f90222i);
            this.f90220g = b;
            String valueOf = String.valueOf(b);
            mo49918a("Authorization", valueOf.length() == 0 ? new String("Bearer ") : "Bearer ".concat(valueOf));
            return this.f90225l;
        } catch (gid | IOException e) {
            bnsl bnsl = (bnsl) f90217d.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atfa", "getHeaders", 128, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unexpected error while getting auth token");
            throw new AuthFailureError("Auth error", e);
        }
    }

    public final void onPostNetworkDispatch() {
        shr.m35312a();
    }

    public final void onPreNetworkDispatch() {
        shr.m35316b(9984);
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        int i = networkResponse.statusCode;
        if (i != 200) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Non-200 response status: ");
            sb.append(i);
            return Response.error(new VolleyError(sb.toString()));
        }
        try {
            btpx btpx = (btpx) GeneratedMessageLite.m124016a(btpx.f149902c, networkResponse.data, bxus.m123744c());
            btpw btpw = btpx.f149904a;
            if (btpw == null) {
                btpw = btpw.f149899b;
            }
            if (btpw.f149901a != null) {
                btpw btpw2 = btpx.f149904a;
                if (btpw2 == null) {
                    btpw2 = btpw.f149899b;
                }
                btnf btnf = btpw2.f149901a;
                if (btnf == null) {
                    btnf = btnf.f149600f;
                }
                if (btnf.f149602a != 0) {
                    return Response.error(new VolleyError(new atfh(btnf)));
                }
                return Response.error(new VolleyError("TapAndPayApiError.canonicalCode should not be 0"));
            } else if (btpx.f149905b == null) {
                return Response.error(new VolleyError(String.valueOf(getUrl()).concat(": Missing Any body")));
            } else {
                bxxk cZ = this.f90223j.mo74143cZ();
                bxte bxte = btpx.f149905b;
                if (bxte == null) {
                    bxte = bxte.f164763c;
                }
                return Response.success((bxxc) cZ.mo73661b(bxte.f164766b, bxus.m123744c()), HttpHeaderParser.parseCacheHeaders(networkResponse));
            }
        } catch (IOException e) {
            return Response.error(new VolleyError("Unable to build response payload", e));
        }
    }
}
