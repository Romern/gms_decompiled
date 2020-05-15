package p000;

import android.content.Context;
import android.text.TextUtils;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpClientStack;
import com.android.volley.toolbox.RequestFuture;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.internal.ClientContext;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: sgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class sgv extends sgw {

    /* renamed from: a */
    public final boolean f44441a;

    /* renamed from: b */
    protected final String f44442b;

    /* renamed from: c */
    public final boolean f44443c;

    /* renamed from: d */
    public final String f44444d;

    /* renamed from: e */
    public final String f44445e;

    /* renamed from: f */
    public final ConcurrentHashMap f44446f;

    /* renamed from: g */
    public int f44447g;

    /* renamed from: h */
    public int f44448h;

    /* renamed from: j */
    private String f44449j;

    /* renamed from: k */
    private String f44450k;

    /* renamed from: l */
    private final String f44451l;

    /* renamed from: m */
    private final String f44452m;

    public sgv(Context context, String str, String str2, boolean z, boolean z2, String str3, String str4) {
        this(context, str, str2, z, z2, str3, str4, null);
    }

    /* renamed from: a */
    public static final int m35239a(int i, Map map) {
        if (i != 7) {
            return i;
        }
        map.put("X-HTTP-Method-Override", HttpClientStack.HttpPatch.METHOD_NAME);
        return 1;
    }

    /* renamed from: c */
    protected static final RequestQueue m35242c() {
        return rpr.m34216b().getRequestQueue();
    }

    /* renamed from: a */
    public int mo25510a() {
        return this.f44447g;
    }

    /* renamed from: a */
    public void mo25521a(int i) {
        this.f44447g = i;
    }

    /* renamed from: b */
    public int mo25524b() {
        return this.f44448h;
    }

    public sgv(Context context, String str, String str2, boolean z, boolean z2, String str3, String str4, int i, String str5) {
        super(context);
        this.f44446f = new ConcurrentHashMap();
        this.f44445e = str;
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(str2);
        this.f44444d = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        this.f44441a = z;
        this.f44443c = z2;
        this.f44451l = str3;
        this.f44452m = str4;
        this.f44442b = str5;
        this.f44447g = i;
        this.f44448h = -1;
    }

    /* renamed from: a */
    private final Object m35240a(ClientContext clientContext, int i, String str, byte[] bArr, Object obj, int i2) {
        String d = mo25529d(clientContext);
        try {
            return mo25511a(d, clientContext, i, str, bArr, obj, i2).get();
        } catch (InterruptedException e) {
            throw new VolleyError("Thread interrupted");
        } catch (ExecutionException e2) {
            mo25523a(e2, d);
            throw new VolleyError("Error executing network request", e2);
        }
    }

    /* renamed from: b */
    public final void mo25525b(Request request, String str) {
        mo9812a(request, str);
        m35242c().add(request);
    }

    public sgv(Context context, String str, String str2, boolean z, boolean z2, String str3, String str4, String str5) {
        this(context, str, str2, z, z2, str3, str4, MfiClientException.TYPE_MFICLIENT_NOT_FOUND, str5);
    }

    /* renamed from: a */
    public static boolean m35241a(VolleyError volleyError) {
        String a;
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse == null || networkResponse.statusCode != 401 || (a = sil.m35352a(volleyError)) == null) {
            return false;
        }
        if ("authError".equalsIgnoreCase(a) || "expired".equalsIgnoreCase(a)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final RequestFuture mo25511a(String str, ClientContext clientContext, int i, String str2, byte[] bArr, Object obj, int i2) {
        String c = mo25528c(clientContext);
        RequestFuture newFuture = RequestFuture.newFuture();
        HashMap a = mo25519a(this.f44453i, clientContext);
        int a2 = m35239a(i, a);
        String a3 = mo25518a(this.f44444d, str2);
        this.f44448h = clientContext.f30212b;
        mo25525b(mo25520a(a2, a3, bArr, obj, str, c, newFuture, newFuture, a, i2, mo25524b()), str);
        return newFuture;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final RequestFuture mo25512a(String str, byte[] bArr, Object obj, String str2, String str3, int i) {
        RequestFuture newFuture = RequestFuture.newFuture();
        HashMap a = mo25519a(this.f44453i, (ClientContext) null);
        if (!TextUtils.isEmpty(str2)) {
            a.put("X-Android-Package", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            a.put("X-Android-Cert", str3);
        }
        mo25525b(mo25520a(m35239a(1, a), mo25518a(this.f44444d, str), bArr, obj, null, null, newFuture, newFuture, a, i, mo25524b()), null);
        return newFuture;
    }

    /* renamed from: a */
    public final Object mo25513a(ClientContext clientContext, int i, String str, byte[] bArr, Object obj) {
        int a = mo25510a();
        try {
            return m35240a(clientContext, i, str, bArr, obj, a);
        } catch (VolleyError e) {
            if (m35241a(e)) {
                return m35240a(clientContext, i, str, bArr, obj, a);
            }
            throw e;
        }
    }

    /* renamed from: a */
    public final Object mo25514a(ClientContext clientContext, int i, String str, byte[] bArr, Object obj, long j) {
        return mo25515a(clientContext, i, str, bArr, obj, j, mo25510a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* renamed from: a */
    public final Object mo25515a(ClientContext clientContext, int i, String str, byte[] bArr, Object obj, long j, int i2) {
        try {
            String d = mo25529d(clientContext);
            try {
                return mo25511a(d, clientContext, i, str, bArr, obj, i2).get(j, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                throw new VolleyError("Thread interrupted");
            } catch (ExecutionException e2) {
                mo25523a(e2, d);
                throw new VolleyError("Error executing network request", e2);
            } catch (VolleyError e3) {
                e = e3;
                if (!m35241a(e)) {
                    return m35240a(clientContext, i, str, bArr, obj, i2);
                }
                throw e;
            }
        } catch (VolleyError e4) {
            e = e4;
            if (!m35241a(e)) {
            }
        }
    }

    /* renamed from: a */
    public final Object mo25516a(String str, byte[] bArr, Object obj, String str2, String str3) {
        try {
            return mo25512a(str, bArr, obj, str2, str3, mo25510a()).get();
        } catch (InterruptedException e) {
            throw new VolleyError("Thread interrupted");
        } catch (ExecutionException e2) {
            if (e2.getCause() instanceof VolleyError) {
                throw ((VolleyError) e2.getCause());
            }
            throw new VolleyError("Error executing network request", e2);
        }
    }

    /* renamed from: a */
    public final Object mo25517a(String str, byte[] bArr, Object obj, String str2, String str3, long j, int i) {
        try {
            return mo25512a(str, bArr, obj, str2, str3, i).get(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new VolleyError("Thread interrupted");
        } catch (ExecutionException e2) {
            if (e2.getCause() instanceof VolleyError) {
                throw ((VolleyError) e2.getCause());
            }
            throw new VolleyError("Error executing network request", e2);
        }
    }

    /* renamed from: a */
    public String mo25518a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        if (!TextUtils.isEmpty(this.f44451l)) {
            sb.append(sb.indexOf("?") == -1 ? "?" : "&");
            sb.append("trace=");
            sb.append(this.f44451l);
            for (Map.Entry entry : this.f44446f.entrySet()) {
                sb.append("&");
                sb.append((String) entry.getKey());
                sb.append("=");
                sb.append((String) entry.getValue());
            }
        }
        String sb2 = sb.toString();
        if (this.f44442b == null) {
            return sb2;
        }
        char c = !sb2.contains("?") ? '?' : '&';
        String valueOf = String.valueOf(sb2);
        String str3 = this.f44442b;
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 5 + String.valueOf(str3).length());
        sb3.append(valueOf);
        sb3.append(c);
        sb3.append("key=");
        sb3.append(str3);
        return sb3.toString();
    }

    /* renamed from: a */
    public HashMap mo25519a(Context context, ClientContext clientContext) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.f44452m)) {
            hashMap.put("X-Google-Backend-Override", this.f44452m);
        }
        if (!(this.f44442b == null || clientContext == null)) {
            String str = clientContext.f30216f;
            if (!TextUtils.equals(str, this.f44449j)) {
                this.f44449j = str;
                this.f44450k = spn.m35895h(this.f44453i, str);
            }
            hashMap.put("X-Android-Package", this.f44449j);
            hashMap.put("X-Android-Cert", this.f44450k);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final sia mo25520a(int i, String str, byte[] bArr, Object obj, String str2, String str3, Response.Listener listener, Response.ErrorListener errorListener, HashMap hashMap, int i2, int i3) {
        return new sia(i, str, bArr, obj, listener, errorListener, str2, str3, this.f44441a, hashMap, i2, i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9812a(Request request, String str) {
        request.setRetryPolicy(new sgu(this.f44453i, str));
    }

    /* renamed from: a */
    public final void mo25522a(ClientContext clientContext, String str, byte[] bArr, Object obj, Response.Listener listener, Response.ErrorListener errorListener) {
        String str2;
        ClientContext clientContext2 = clientContext;
        int a = mo25510a();
        if (this.f44442b == null) {
            str2 = mo25528c(clientContext);
        } else {
            str2 = null;
        }
        HashMap a2 = mo25519a(this.f44453i, clientContext);
        int a3 = m35239a(1, a2);
        String a4 = mo25518a(this.f44444d, str);
        this.f44448h = clientContext2.f30212b;
        mo25525b(mo25520a(a3, a4, bArr, obj, null, str2, listener, errorListener, a2, a, mo25524b()), null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25523a(ExecutionException executionException, String str) {
        Throwable cause = executionException.getCause();
        if (cause instanceof VolleyError) {
            VolleyError volleyError = (VolleyError) cause;
            if (m35241a(volleyError)) {
                gie.m13192a(this.f44453i, str);
            }
            throw volleyError;
        }
    }
}
