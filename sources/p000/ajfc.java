package p000;

import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.NoConnectionError;
import com.android.volley.Response;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.util.Map;

/* renamed from: ajfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajfc implements Response.Listener, Response.ErrorListener {

    /* renamed from: a */
    final /* synthetic */ ajfd f70496a;

    public ajfc(ajfd ajfd) {
        this.f70496a = ajfd;
    }

    /* renamed from: a */
    private final void m58623a(bxxc bxxc, int i, Map map) {
        buqh buqh = this.f70496a.f70503g;
        StringBuilder sb = new StringBuilder(37);
        sb.append("ServerTaskImpl.onResponse:");
        sb.append(i);
        buqh.mo72987c(new ajfa(this, sb.toString(), bxxc));
        ajfd ajfd = this.f70496a;
        ajfe ajfe = ajfd.f70507k;
        ajfd.mo38552a(bxxc);
        ajfe.mo38570a(bxxc, i, map);
        ajfd ajfd2 = this.f70496a;
        Object a = ajfd2.mo38553a(ajfd2.f70509m, bxxc);
        bzcm a2 = this.f70496a.mo38552a(bxxc);
        int i2 = 1;
        if (!(a2 == null || (a2.f169371a & 2) == 0)) {
            byzq byzq = a2.f169372b;
            if (byzq == null) {
                byzq = byzq.f169146b;
            }
            int a3 = bzbq.m125623a(byzq.f169148a);
            if (a3 != 0) {
                i2 = a3;
            }
        }
        int i3 = i2 - 2;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            ajfd ajfd3 = this.f70496a;
            ajfd3.f70503g.mo72987c(new ajew(ajfd3, a));
        } else if (i3 != 204) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68388c();
            bnsl.mo68432a("ajfc", "a", 657, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("%s unknown status code from server. Response Header: %s", "ServerTask: ", a2);
            this.f70496a.mo38569b(13);
        } else {
            this.f70496a.f70503g.mo72987c(new ajfb(this, "ServerTaskImpl.registerDevice"));
            this.f70496a.mo38569b(13);
        }
    }

    public final void onErrorResponse(VolleyError volleyError) {
        String str;
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse != null && networkResponse.statusCode == 401 && this.f70496a.f70508l > 0) {
            this.f70496a.f70507k.mo38570a((bxxc) null, networkResponse.statusCode, networkResponse.headers);
            srn srn = ahfq.f67120a;
            int i = this.f70496a.f70508l;
            ajfd ajfd = this.f70496a;
            ajfd.f70508l--;
            this.f70496a.f70503g.mo72987c(new ajex(this, "ServerTaskImpl.unauthorizedRetry"));
        } else if (networkResponse == null) {
            this.f70496a.f70507k.mo38570a((bxxc) null, 400, (Map) null);
            this.f70496a.f70503g.mo72987c(new ajey(this, "ServerTaskImpl.logErrorResponse"));
            if ((volleyError instanceof TimeoutError) || (volleyError instanceof NoConnectionError) || (volleyError instanceof NetworkError)) {
                this.f70496a.mo38569b(7);
            } else {
                this.f70496a.mo38569b(13);
            }
        } else {
            int i2 = networkResponse.statusCode;
            this.f70496a.f70507k.mo38570a((bxxc) null, i2, networkResponse.headers);
            if (i2 == 300) {
                byte[] bArr = networkResponse.data;
                Map map = networkResponse.headers;
                try {
                    ajfd ajfd2 = this.f70496a;
                    ajfd2.f70510n = ajfd2.f70510n.mo73645aM().mo73633b(bArr).mo74062i();
                    m58623a(this.f70496a.f70510n, 300, map);
                } catch (bxwf e) {
                    srn srn2 = ahfq.f67120a;
                    ajfd ajfd3 = this.f70496a;
                    new VolleyError(e);
                    ajfd3.mo38569b(ajfd.m58624a(400));
                }
            } else if (i2 != 204) {
                this.f70496a.f70503g.mo72987c(new ajez(this, "ServerTaskImpl.logErrorResponse", i2));
                if (((bnsl) ahfq.f67120a.mo68388c()).mo68447l()) {
                    bnsl bnsl = (bnsl) ahfq.f67120a.mo68388c();
                    bnsl.mo68432a("ajfc", "onErrorResponse", 624, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    NetworkResponse networkResponse2 = volleyError.networkResponse;
                    Object[] objArr = new Object[3];
                    objArr[0] = volleyError.getClass().getSimpleName();
                    if (networkResponse2 != null) {
                        int i3 = networkResponse2.statusCode;
                        StringBuilder sb = new StringBuilder(13);
                        sb.append("(");
                        sb.append(i3);
                        sb.append(")");
                        str = sb.toString();
                    } else {
                        str = "";
                    }
                    objArr[1] = str;
                    objArr[2] = volleyError.getMessage();
                    bnsl.mo68424a("%s Bad status response: %s", "ServerTask: ", String.format("%s: %s%s", objArr));
                }
                this.f70496a.mo38569b(ajfd.m58624a(i2));
            } else {
                m58623a(this.f70496a.f70510n, 204, networkResponse.headers);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        m58623a((bxxc) obj, BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, ajfe.f70512a);
    }
}
