package p000;

import android.content.Context;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.response.FieldMappingDictionary;
import com.google.android.gms.drive.internal.model.ChangeList;
import com.google.android.gms.drive.internal.model.FileList;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

/* renamed from: vla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vla extends shj {

    /* renamed from: m */
    private static final Request.Priority f49428m = Request.Priority.HIGH;

    /* renamed from: n */
    private static final Request.Priority f49429n = Request.Priority.NORMAL;

    /* renamed from: o */
    private static final Request.Priority f49430o = Request.Priority.LOW;

    public vla(Context context, String str, String str2, boolean z, String str3, int i) {
        super(context, str, str2, false, z, str3, null, i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: shj.a(com.android.volley.Request, boolean, java.lang.String):void
     arg types: [vkz, int, java.lang.String]
     candidates:
      shj.a(android.content.Context, android.net.Uri, java.lang.String):byte[]
      shj.a(com.android.volley.Request, boolean, java.lang.String):void */
    /* renamed from: a */
    private final sio m40812a(ClientContext clientContext, String str, Class cls, Request.Priority priority, vbo vbo) {
        String d = mo25529d(clientContext);
        String c = mo25528c(clientContext);
        RequestFuture newFuture = RequestFuture.newFuture();
        HashMap a = mo25519a(this.f44453i, clientContext);
        int a2 = sgv.m35239a(0, a);
        this.f44447g = 2816;
        this.f44448h = clientContext.f30212b;
        String str2 = d;
        mo25538a((Request) new vkz(a2, mo25518a(this.f44444d, str), cls, newFuture, newFuture, d, c, this.f44441a, a, priority, vbo, this.f44447g, this.f44448h), false, str2);
        try {
            return (sio) newFuture.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new sid();
        } catch (ExecutionException e2) {
            mo25523a(e2, str2);
            String valueOf = String.valueOf(str);
            throw new VolleyError(valueOf.length() == 0 ? new String("Error executing network request for ") : "Error executing network request for ".concat(valueOf), e2);
        }
    }

    /* renamed from: a */
    public final HashMap mo25519a(Context context, ClientContext clientContext) {
        HashMap a = super.mo25519a(context, clientContext);
        a.put("X-Device-ID", Long.toHexString(spn.m35843a(context)));
        a.put("User-Agent", sic.m35342a(context, "Drive Android SDK/1.0"));
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final sha mo25535a(ClientContext clientContext, int i, String str, Object obj, Class cls, FieldMappingDictionary fieldMappingDictionary, String str2, String str3, Response.Listener listener, Response.ErrorListener errorListener, HashMap hashMap) {
        return new vkz(i, str, obj, cls, fieldMappingDictionary, listener, errorListener, str2, str3, this.f44441a, hashMap, f49428m, this.f44447g, this.f44448h);
    }

    /* renamed from: a */
    public final sio mo28608a(ClientContext clientContext, String str, Class cls, boolean z, vbo vbo) {
        Request.Priority priority;
        sdo.m34959a(vbo);
        boolean z2 = true;
        if (!cls.equals(FileList.class) && !cls.equals(ChangeList.class)) {
            z2 = false;
        }
        sdo.m34974b(z2);
        if (!z) {
            priority = f49430o;
        } else {
            priority = f49429n;
        }
        try {
            return m40812a(clientContext, str, cls, priority, vbo);
        } catch (VolleyError e) {
            if (sgv.m35241a(e)) {
                return m40812a(clientContext, str, cls, priority, vbo);
            }
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9812a(Request request, String str) {
        request.setRetryPolicy(new sgu(this.f44453i, str, ((Integer) twy.f46867ay.mo58455c()).intValue(), 5, 2.0f));
    }
}
