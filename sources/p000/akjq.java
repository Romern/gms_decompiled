package p000;

import android.content.Context;
import android.util.Base64;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.gms.common.server.NetworkCallbacks;

/* renamed from: akjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akjq extends akjs implements NetworkCallbacks {
    public akjq(Context context, String str, Response.Listener listener, Response.ErrorListener errorListener, cafb cafb) {
        super(str, listener, errorListener, cafb, cfpd.f185332a.mo6606a().mo82451p(), cfpd.f185332a.mo6606a().mo82452q(), cfpd.f185332a.mo6606a().mo82456u());
        if (!cfpe.m142372b()) {
            mo39510a((akjr) new akjp(context));
            akjr a = akju.m59900a(context);
            if (a != null) {
                mo39510a(a);
            }
        }
        setRetryPolicy(new DefaultRetryPolicy((int) cfpe.m142373c(), (int) cfpe.f185334a.mo6606a().mo82413e(), (float) cfpe.f185334a.mo6606a().mo82411c()));
    }

    /* renamed from: a */
    private final void m59889a(bxxc bxxc) {
        if (this.f72109d) {
            for (String str : bmyx.m108640a(10).mo66918a((CharSequence) bxxc.toString())) {
                eoa.m10826b("GoogleAuthProtoRequest", str, new Object[0]);
            }
            return;
        }
        eoa.m10826b("GoogleAuthProtoRequest", Base64.encodeToString(bxxc.mo73642k(), 0), new Object[0]);
    }

    public final byte[] getBody() {
        return ((bxsz) this.f72110e).mo73642k();
    }

    public final void onPostNetworkDispatch() {
        shr.m35312a();
    }

    public final void onPreNetworkDispatch() {
        shr.m35316b(14592);
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        try {
            return Response.success((cafc) ((bxvd) cafc.f172885b.mo74144da().mo73633b(networkResponse.data)).mo74062i(), null);
        } catch (Exception e) {
            return Response.error(new VolleyError(e.getMessage(), e));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, bxxc], assign insn: null */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo39509b(Object r1) {
        m59889a((bxxc) r1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo39508a(Object obj) {
        m59889a((bxxc) ((cafc) obj));
    }
}
