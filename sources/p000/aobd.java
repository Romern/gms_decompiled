package p000;

import android.content.Context;
import android.util.Pair;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.RequestFuture;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ClientContext;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: aobd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aobd extends aobb {

    /* renamed from: c */
    private final String f78063c;

    public aobd(ClientContext clientContext, String str, antk antk) {
        super(clientContext, antk);
        this.f78063c = str;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sha.<init>(int, java.lang.String, java.lang.String, java.lang.Class, java.lang.Object, com.android.volley.Response$Listener, com.android.volley.Response$ErrorListener, java.lang.String, java.lang.String, boolean, java.util.HashMap, int, int):void
     arg types: [int, java.lang.String, java.lang.String, java.lang.Class, ?[OBJECT, ARRAY], com.android.volley.toolbox.RequestFuture, com.android.volley.toolbox.RequestFuture, java.lang.String, java.lang.String, boolean, java.util.HashMap, int, int]
     candidates:
      sha.<init>(int, java.lang.String, java.lang.Object, java.lang.Class, java.lang.Object, com.android.volley.Response$Listener, com.android.volley.Response$ErrorListener, java.lang.String, java.lang.String, boolean, java.util.HashMap, int, int):void
      sha.<init>(int, java.lang.String, java.lang.String, java.lang.Class, java.lang.Object, com.android.volley.Response$Listener, com.android.volley.Response$ErrorListener, java.lang.String, java.lang.String, boolean, java.util.HashMap, int, int):void */
    /* renamed from: b */
    public final Pair mo42521b(Context context, anru anru) {
        String str;
        aocu aocu;
        ClientContext clientContext = this.f78060a;
        String str2 = this.f78063c;
        ansh ansh = anru.f77551b;
        String a = anru.mo42169a(context, clientContext);
        ansa a2 = anry.m65083a().mo42172a(clientContext.mo17802b(), str2);
        if (a2 != null) {
            str = a2.mo42175a();
        } else {
            str = null;
        }
        try {
            String a3 = aoan.m65705a(context.getPackageManager(), clientContext.f30215e);
            aodd aodd = ansh.f77587b;
            String a4 = ansh.m65102a(str2);
            JSONArray jSONArray = new JSONArray();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apiVersion", "v1");
                jSONObject.put("jsonrpc", "2.0");
                jSONObject.put("method", "pos.plusones.delete");
                JSONObject jSONObject2 = new JSONObject();
                if (a4 != null) {
                    jSONObject2.put("id", a4);
                }
                if (a3 != null) {
                    jSONObject2.put("container", a3);
                }
                jSONObject2.put("source", "native:android_app");
                if (str != null) {
                    jSONObject2.put("cdx", str);
                }
                jSONObject.put("params", jSONObject2);
                jSONArray.put(jSONObject);
            } catch (Exception e) {
            }
            aoao aoao = aodd.f78216a;
            String d = aoao.mo25529d(clientContext);
            String c = aoao.mo25528c(clientContext);
            RequestFuture newFuture = RequestFuture.newFuture();
            HashMap a5 = aoao.mo25519a(aoao.f44453i, clientContext);
            aoao.f44448h = clientContext.f30212b;
            ((shj) aoao).f44473j.add(new sha(-1, String.valueOf(aoao.f44444d).concat("/rpc"), jSONArray.toString(), aodc.class, (Object) null, (Response.Listener) newFuture, (Response.ErrorListener) newFuture, d, c, aoao.f44441a, a5, aoao.f44447g, aoao.f44448h));
            boolean a6 = anrz.m65093a(((aodb) ((aodc) ((sio) newFuture.get())).f78215a.get(0)).f78213a);
            aocu a7 = anry.m65083a().mo42173a(clientContext.mo17802b(), str2, a6);
            if (a7 == null) {
                aocq aocq = new aocq();
                aocq.mo42525a(str2);
                aocq.mo42526a(a6);
                aocu = aocq.mo42524a();
            } else {
                aocu = a7;
            }
            return Pair.create(ConnectionResult.f30063a, anrz.m65089a(context, clientContext.mo17795a(), true, str2, aocu, context.getResources().getString(C0126R.string.plus_one_self_removed), null, a).f77709a);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            throw new sid();
        } catch (ExecutionException e3) {
            throw new VolleyError("Error executing network request for /rpc", e3);
        } catch (VolleyError e4) {
            anry.m65083a().mo42174b(clientContext.mo17802b(), str2);
            throw e4;
        }
    }
}
