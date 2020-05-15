package p000;

import android.content.Context;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: aoco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoco extends aoba {

    /* renamed from: a */
    private final ClientContext f78203a;

    /* renamed from: b */
    private final String f78204b;

    /* renamed from: c */
    private final antk f78205c;

    public aoco(ClientContext clientContext, String str, antk antk) {
        this.f78203a = clientContext;
        this.f78204b = str;
        this.f78205c = antk;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0074, code lost:
        r7 = r6.f78205c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0076, code lost:
        if (r7 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0078, code lost:
        r7.mo42234a(new com.google.android.gms.common.api.Status(4, null, null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0080, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0073 A[ExcHandler: gid (e gid), Splitter:B:1:0x0004] */
    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        NetworkResponse networkResponse;
        ClientContext clientContext;
        String str;
        NetworkResponse networkResponse2;
        try {
            clientContext = this.f78203a;
            str = this.f78204b;
            if (!((Boolean) ansx.f77679ab.mo25081c()).booleanValue()) {
                anru.f77554e.mo42170a(clientContext, anrv.m65079a(), str);
            } else {
                anrv.m65081a(context, clientContext, str);
            }
            antk antk = this.f78205c;
            if (antk != null) {
                antk.mo42234a(Status.f30107a);
            }
        } catch (VolleyError e) {
            if ((e instanceof NetworkError) || ((networkResponse2 = e.networkResponse) != null && networkResponse2.statusCode >= 500)) {
                anrv.m65081a(context, clientContext, str);
            }
            throw e;
        } catch (gid e2) {
        } catch (VolleyError e3) {
            antk antk2 = this.f78205c;
            if (antk2 == null) {
                return;
            }
            if (e3 instanceof AuthFailureError) {
                antk2.mo42234a(new Status(4, null, null));
            } else if (!(e3 instanceof NetworkError) && ((networkResponse = e3.networkResponse) == null || networkResponse.statusCode < 500)) {
                antk2.mo42234a(new Status(8, null, null));
            } else {
                antk2.mo42234a(new Status(-1, null, null));
            }
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antk antk = this.f78205c;
        if (antk != null) {
            antk.mo42234a(new Status(8, null, null));
        }
    }
}
