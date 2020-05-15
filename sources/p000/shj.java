package p000;

import android.content.Context;
import android.net.Uri;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.RequestFuture;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.response.FieldMappingDictionary;
import java.util.HashMap;
import java.util.Stack;
import java.util.concurrent.ExecutionException;

/* renamed from: shj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class shj extends sgv {

    /* renamed from: j */
    public final RequestQueue f44473j;

    /* renamed from: k */
    protected final ThreadLocal f44474k;

    /* renamed from: l */
    public final shn f44475l;

    public shj(Context context, String str, String str2, boolean z, boolean z2, String str3, String str4, int i) {
        this(context, str, str2, z, z2, str3, str4, i, null);
    }

    /* renamed from: a */
    public static shj m35270a(Context context) {
        return new shj(context, null, null, false, true, null, null, MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: shj.a(com.android.volley.Request, boolean, java.lang.String):void
     arg types: [shx, int, java.lang.String]
     candidates:
      shj.a(android.content.Context, android.net.Uri, java.lang.String):byte[]
      shj.a(com.android.volley.Request, boolean, java.lang.String):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: shj.a(java.lang.String, com.android.volley.Response$Listener):com.android.volley.Response$Listener
     arg types: [java.lang.String, com.android.volley.toolbox.RequestFuture]
     candidates:
      shj.a(java.lang.String, com.android.volley.Response$ErrorListener):com.android.volley.Response$ErrorListener
      shj.a(android.content.Context, java.lang.String):byte[]
      sgv.a(int, java.util.Map):int
      sgv.a(java.lang.String, java.lang.String):java.lang.String
      sgv.a(android.content.Context, com.google.android.gms.common.internal.ClientContext):java.util.HashMap
      sgv.a(com.android.volley.Request, java.lang.String):void
      sgv.a(java.util.concurrent.ExecutionException, java.lang.String):void
      shj.a(java.lang.String, com.android.volley.Response$Listener):com.android.volley.Response$Listener */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: shj.a(java.lang.String, com.android.volley.Response$ErrorListener):com.android.volley.Response$ErrorListener
     arg types: [java.lang.String, com.android.volley.toolbox.RequestFuture]
     candidates:
      shj.a(java.lang.String, com.android.volley.Response$Listener):com.android.volley.Response$Listener
      shj.a(android.content.Context, java.lang.String):byte[]
      sgv.a(int, java.util.Map):int
      sgv.a(java.lang.String, java.lang.String):java.lang.String
      sgv.a(android.content.Context, com.google.android.gms.common.internal.ClientContext):java.util.HashMap
      sgv.a(com.android.volley.Request, java.lang.String):void
      sgv.a(java.util.concurrent.ExecutionException, java.lang.String):void
      shj.a(java.lang.String, com.android.volley.Response$ErrorListener):com.android.volley.Response$ErrorListener */
    /* renamed from: b */
    private final void m35271b(ClientContext clientContext, int i, String str, Object obj) {
        String d = mo25529d(clientContext);
        RequestFuture newFuture = RequestFuture.newFuture();
        HashMap a = mo25519a(this.f44453i, clientContext);
        int a2 = sgv.m35239a(i, a);
        String a3 = mo25518a(this.f44444d, str);
        mo25538a((Request) new shx(a2, a3, obj, mo25534a(a3, (Response.Listener) newFuture), mo25533a(a3, (Response.ErrorListener) newFuture), d, a, mo25510a(), mo25524b()), false, d);
        try {
            newFuture.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new sid();
        } catch (ExecutionException e2) {
            ExecutionException executionException = e2;
            mo25523a(executionException, d);
            String valueOf = String.valueOf(str);
            throw new VolleyError(valueOf.length() == 0 ? new String("Error executing network request for ") : "Error executing network request for ".concat(valueOf), executionException);
        }
    }

    /* renamed from: d */
    public final void mo25545d() {
        ((Stack) this.f44474k.get()).add(new shi());
    }

    /* renamed from: f */
    public final boolean mo25547f() {
        return ((Stack) this.f44474k.get()).size() > 0;
    }

    public shj(Context context, String str, String str2, boolean z, boolean z2, String str3, String str4, int i, String str5) {
        super(context, str, str2, z, z2, str3, str4, i, str5);
        this.f44474k = new shf();
        this.f44473j = sgv.m35242c();
        this.f44475l = shn.f44491a;
    }

    /* renamed from: a */
    public final Response.ErrorListener mo25533a(String str, Response.ErrorListener errorListener) {
        return new shh(this, str, errorListener);
    }

    /* renamed from: e */
    public final void mo25546e() {
        sgy sgy;
        rzz.m34730a(mo25547f(), "Not currently in an Apiary batch.");
        shi shi = (shi) ((Stack) this.f44474k.get()).pop();
        if (shi.f44472a.size() != 0) {
            sgy = new sgy(this.f44445e, shi.f44472a);
            this.f44473j.add(sgy);
        } else {
            sgy = null;
        }
        if (sgy != null) {
            sgy.f44458d.await();
        }
    }

    /* renamed from: a */
    public final Response.Listener mo25534a(String str, Response.Listener listener) {
        return new shg(this, str, listener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public sha mo25535a(ClientContext clientContext, int i, String str, Object obj, Class cls, FieldMappingDictionary fieldMappingDictionary, String str2, String str3, Response.Listener listener, Response.ErrorListener errorListener, HashMap hashMap) {
        return new sha(i, str, obj, cls, fieldMappingDictionary, mo25534a(str, listener), mo25533a(str, errorListener), str2, str3, this.f44441a, hashMap, mo25510a(), mo25524b());
    }

    /* renamed from: a */
    public final sio mo25536a(ClientContext clientContext, int i, String str, Object obj, Class cls) {
        return mo25537a(clientContext, i, str, obj, cls, (FieldMappingDictionary) null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: shj.a(com.android.volley.Request, boolean, java.lang.String):void
     arg types: [sha, int, java.lang.String]
     candidates:
      shj.a(android.content.Context, android.net.Uri, java.lang.String):byte[]
      shj.a(com.android.volley.Request, boolean, java.lang.String):void */
    /* renamed from: b */
    public final sio mo25544b(ClientContext clientContext, int i, String str, Object obj, Class cls, FieldMappingDictionary fieldMappingDictionary) {
        String d = mo25529d(clientContext);
        String c = mo25528c(clientContext);
        RequestFuture newFuture = RequestFuture.newFuture();
        HashMap a = mo25519a(this.f44453i, clientContext);
        int a2 = sgv.m35239a(i, a);
        this.f44448h = clientContext.f30212b;
        mo25538a((Request) mo25535a(clientContext, a2, mo25518a(this.f44444d, str), obj, cls, fieldMappingDictionary, d, c, newFuture, newFuture, a), false, d);
        try {
            return (sio) newFuture.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new sid();
        } catch (ExecutionException e2) {
            mo25523a(e2, d);
            String valueOf = String.valueOf(str);
            throw new VolleyError(valueOf.length() == 0 ? new String("Error executing network request for ") : "Error executing network request for ".concat(valueOf), e2);
        }
    }

    /* renamed from: a */
    public final sio mo25537a(ClientContext clientContext, int i, String str, Object obj, Class cls, FieldMappingDictionary fieldMappingDictionary) {
        try {
            return mo25544b(clientContext, i, str, obj, cls, fieldMappingDictionary);
        } catch (VolleyError e) {
            if (sgv.m35241a(e)) {
                return mo25544b(clientContext, i, str, obj, cls, fieldMappingDictionary);
            }
            throw e;
        }
    }

    /* renamed from: a */
    public void mo25538a(Request request, boolean z, String str) {
        mo9812a(request, str);
        if (mo25547f()) {
            rzz.m34730a(z, "Non-batchable request in batch");
            rzz.m34730a(request instanceof she, "Non-batchable request in batch");
            ((shi) ((Stack) this.f44474k.get()).peek()).f44472a.add((she) request);
            return;
        }
        this.f44473j.add(request);
    }

    /* renamed from: a */
    public final void mo25539a(ClientContext clientContext, int i, String str, Object obj) {
        try {
            m35271b(clientContext, i, str, obj);
        } catch (VolleyError e) {
            if (sgv.m35241a(e)) {
                m35271b(clientContext, i, str, obj);
                return;
            }
            throw e;
        }
    }

    /* renamed from: a */
    public final void mo25540a(ClientContext clientContext, String str, Class cls, Response.Listener listener, Response.ErrorListener errorListener) {
        mo25541a(clientContext, str, cls, (FieldMappingDictionary) null, listener, errorListener);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: shj.a(com.android.volley.Request, boolean, java.lang.String):void
     arg types: [sha, int, java.lang.String]
     candidates:
      shj.a(android.content.Context, android.net.Uri, java.lang.String):byte[]
      shj.a(com.android.volley.Request, boolean, java.lang.String):void */
    /* renamed from: a */
    public final void mo25541a(ClientContext clientContext, String str, Class cls, FieldMappingDictionary fieldMappingDictionary, Response.Listener listener, Response.ErrorListener errorListener) {
        ClientContext clientContext2 = clientContext;
        String b = mo25527b(clientContext);
        String c = mo25528c(clientContext);
        if (b != null) {
            HashMap a = mo25519a(this.f44453i, clientContext);
            int a2 = sgv.m35239a(0, a);
            this.f44448h = clientContext2.f30212b;
            mo25538a((Request) mo25535a(clientContext, a2, mo25518a(this.f44444d, str), (Object) null, cls, fieldMappingDictionary, b, c, listener, errorListener, a), true, b);
            return;
        }
        errorListener.onErrorResponse(new VolleyError("Unable to obtain auth token - is the device online?"));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: shj.a(com.android.volley.Request, boolean, java.lang.String):void
     arg types: [shw, int, ?[OBJECT, ARRAY]]
     candidates:
      shj.a(android.content.Context, android.net.Uri, java.lang.String):byte[]
      shj.a(com.android.volley.Request, boolean, java.lang.String):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: shj.a(java.lang.String, com.android.volley.Response$Listener):com.android.volley.Response$Listener
     arg types: [java.lang.String, com.android.volley.toolbox.RequestFuture]
     candidates:
      shj.a(java.lang.String, com.android.volley.Response$ErrorListener):com.android.volley.Response$ErrorListener
      shj.a(android.content.Context, java.lang.String):byte[]
      sgv.a(int, java.util.Map):int
      sgv.a(java.lang.String, java.lang.String):java.lang.String
      sgv.a(android.content.Context, com.google.android.gms.common.internal.ClientContext):java.util.HashMap
      sgv.a(com.android.volley.Request, java.lang.String):void
      sgv.a(java.util.concurrent.ExecutionException, java.lang.String):void
      shj.a(java.lang.String, com.android.volley.Response$Listener):com.android.volley.Response$Listener */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: shj.a(java.lang.String, com.android.volley.Response$ErrorListener):com.android.volley.Response$ErrorListener
     arg types: [java.lang.String, com.android.volley.toolbox.RequestFuture]
     candidates:
      shj.a(java.lang.String, com.android.volley.Response$Listener):com.android.volley.Response$Listener
      shj.a(android.content.Context, java.lang.String):byte[]
      sgv.a(int, java.util.Map):int
      sgv.a(java.lang.String, java.lang.String):java.lang.String
      sgv.a(android.content.Context, com.google.android.gms.common.internal.ClientContext):java.util.HashMap
      sgv.a(com.android.volley.Request, java.lang.String):void
      sgv.a(java.util.concurrent.ExecutionException, java.lang.String):void
      shj.a(java.lang.String, com.android.volley.Response$ErrorListener):com.android.volley.Response$ErrorListener */
    /* renamed from: a */
    public final byte[] mo25542a(Context context, Uri uri, String str) {
        RequestFuture newFuture = RequestFuture.newFuture();
        mo25538a((Request) new shw(context, uri, str, this.f44441a, mo25534a(str, (Response.Listener) newFuture), mo25533a(str, (Response.ErrorListener) newFuture), mo25510a(), mo25524b()), false, (String) null);
        try {
            return (byte[]) newFuture.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new sid();
        } catch (ExecutionException e2) {
            String valueOf = String.valueOf(str);
            throw new VolleyError(valueOf.length() == 0 ? new String("Error executing network request for ") : "Error executing network request for ".concat(valueOf), e2);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: shj.a(com.android.volley.Request, boolean, java.lang.String):void
     arg types: [shw, int, ?[OBJECT, ARRAY]]
     candidates:
      shj.a(android.content.Context, android.net.Uri, java.lang.String):byte[]
      shj.a(com.android.volley.Request, boolean, java.lang.String):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: shj.a(java.lang.String, com.android.volley.Response$Listener):com.android.volley.Response$Listener
     arg types: [java.lang.String, com.android.volley.toolbox.RequestFuture]
     candidates:
      shj.a(java.lang.String, com.android.volley.Response$ErrorListener):com.android.volley.Response$ErrorListener
      shj.a(android.content.Context, java.lang.String):byte[]
      sgv.a(int, java.util.Map):int
      sgv.a(java.lang.String, java.lang.String):java.lang.String
      sgv.a(android.content.Context, com.google.android.gms.common.internal.ClientContext):java.util.HashMap
      sgv.a(com.android.volley.Request, java.lang.String):void
      sgv.a(java.util.concurrent.ExecutionException, java.lang.String):void
      shj.a(java.lang.String, com.android.volley.Response$Listener):com.android.volley.Response$Listener */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: shj.a(java.lang.String, com.android.volley.Response$ErrorListener):com.android.volley.Response$ErrorListener
     arg types: [java.lang.String, com.android.volley.toolbox.RequestFuture]
     candidates:
      shj.a(java.lang.String, com.android.volley.Response$Listener):com.android.volley.Response$Listener
      shj.a(android.content.Context, java.lang.String):byte[]
      sgv.a(int, java.util.Map):int
      sgv.a(java.lang.String, java.lang.String):java.lang.String
      sgv.a(android.content.Context, com.google.android.gms.common.internal.ClientContext):java.util.HashMap
      sgv.a(com.android.volley.Request, java.lang.String):void
      sgv.a(java.util.concurrent.ExecutionException, java.lang.String):void
      shj.a(java.lang.String, com.android.volley.Response$ErrorListener):com.android.volley.Response$ErrorListener */
    /* renamed from: a */
    public final byte[] mo25543a(Context context, String str) {
        RequestFuture newFuture = RequestFuture.newFuture();
        mo25538a((Request) new shw(context, null, str, this.f44441a, mo25534a(str, (Response.Listener) newFuture), mo25533a(str, (Response.ErrorListener) newFuture), mo25510a(), mo25524b()), false, (String) null);
        try {
            return (byte[]) newFuture.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new sid();
        } catch (ExecutionException e2) {
            String valueOf = String.valueOf(str);
            throw new VolleyError(valueOf.length() == 0 ? new String("Error executing network request for ") : "Error executing network request for ".concat(valueOf), e2);
        }
    }
}
