package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.util.EventLog;
import android.util.Log;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* renamed from: bjec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjec implements HttpClient {

    /* renamed from: a */
    public final bjdw f122569a;

    /* renamed from: b */
    public final ThreadLocal f122570b = new ThreadLocal();

    /* renamed from: c */
    private final bjdy f122571c;

    /* renamed from: d */
    private final ContentResolver f122572d;

    /* renamed from: e */
    private final String f122573e;

    /* renamed from: a */
    public static RequestWrapper m103253a(HttpRequest httpRequest) {
        EntityEnclosingRequestWrapper entityEnclosingRequestWrapper;
        try {
            if (httpRequest instanceof HttpEntityEnclosingRequest) {
                entityEnclosingRequestWrapper = new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest) httpRequest);
            } else {
                entityEnclosingRequestWrapper = new RequestWrapper(httpRequest);
            }
            entityEnclosingRequestWrapper.resetHeaders();
            return entityEnclosingRequestWrapper;
        } catch (ProtocolException e) {
            throw new ClientProtocolException(e);
        }
    }

    /* renamed from: b */
    private static RequestWrapper m103254b(HttpUriRequest httpUriRequest) {
        EntityEnclosingRequestWrapper entityEnclosingRequestWrapper;
        try {
            if (httpUriRequest instanceof HttpEntityEnclosingRequest) {
                entityEnclosingRequestWrapper = new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest) httpUriRequest);
            } else {
                entityEnclosingRequestWrapper = new RequestWrapper(httpUriRequest);
            }
            entityEnclosingRequestWrapper.resetHeaders();
            return entityEnclosingRequestWrapper;
        } catch (ProtocolException e) {
            throw new ClientProtocolException(e);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bjdw.execute(org.apache.http.HttpHost, org.apache.http.HttpRequest, org.apache.http.client.ResponseHandler):java.lang.Object
     arg types: [org.apache.http.HttpHost, org.apache.http.client.methods.HttpUriRequest, bjdz]
     candidates:
      bjdw.execute(org.apache.http.client.methods.HttpUriRequest, org.apache.http.client.ResponseHandler, org.apache.http.protocol.HttpContext):java.lang.Object
      bjdw.execute(org.apache.http.HttpHost, org.apache.http.HttpRequest, org.apache.http.protocol.HttpContext):org.apache.http.HttpResponse
      bjdw.execute(org.apache.http.HttpHost, org.apache.http.HttpRequest, org.apache.http.client.ResponseHandler):java.lang.Object */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bixi.a(org.apache.http.client.methods.HttpUriRequest, bixj):org.apache.http.client.methods.HttpUriRequest
     arg types: [org.apache.http.impl.client.RequestWrapper, ?[OBJECT, ARRAY]]
     candidates:
      bixi.a(java.lang.String, java.lang.String):java.lang.String
      bixi.a(org.apache.http.client.methods.HttpUriRequest, bixj):org.apache.http.client.methods.HttpUriRequest */
    public final Object execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler) {
        bjdy bjdy = this.f122571c;
        RequestWrapper a = m103253a(httpRequest);
        return bjdy.f122563a.execute(httpHost, (HttpRequest) bixi.m102934a((HttpUriRequest) a, (bixj) null), (ResponseHandler) new bjdz(responseHandler, a));
    }

    public final ClientConnectionManager getConnectionManager() {
        return this.f122569a.getConnectionManager();
    }

    public final HttpParams getParams() {
        return this.f122569a.getParams();
    }

    public bjec(Context context, String str) {
        SocketFactory socketFactory;
        String str2 = Build.DEVICE;
        String str3 = Build.ID;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(" (");
        sb.append(str2);
        sb.append(" ");
        sb.append(str3);
        sb.append(")");
        this.f122569a = bjdw.m103250a(String.valueOf(sb.toString()).concat("; gzip"), context);
        this.f122571c = new bjdy(this.f122569a);
        this.f122572d = context.getContentResolver();
        this.f122573e = str;
        SchemeRegistry schemeRegistry = getConnectionManager().getSchemeRegistry();
        for (String str4 : schemeRegistry.getSchemeNames()) {
            Scheme unregister = schemeRegistry.unregister(str4);
            SocketFactory socketFactory2 = unregister.getSocketFactory();
            if (socketFactory2 instanceof LayeredSocketFactory) {
                socketFactory = new bjea(this, (LayeredSocketFactory) socketFactory2);
            } else {
                socketFactory = new bjeb(this, socketFactory2);
            }
            schemeRegistry.register(new Scheme(str4, socketFactory, unregister.getDefaultPort()));
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean
     arg types: [android.content.ContentResolver, java.lang.String, int]
     candidates:
      aymn.a(android.content.ContentResolver, java.lang.String, int):int
      aymn.a(android.content.ContentResolver, java.lang.String, long):long
      aymn.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object
      aymn.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String
      aymn.a(java.lang.Object, java.lang.String, java.lang.String):void
      aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean */
    /* renamed from: a */
    public final HttpResponse mo65028a(HttpUriRequest httpUriRequest) {
        HttpResponse httpResponse;
        HttpEntity httpEntity;
        HttpUriRequest httpUriRequest2 = httpUriRequest;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            this.f122570b.set(null);
            if (aymn.m84269a(this.f122572d, "http_stats", false)) {
                int myUid = Process.myUid();
                long uidTxBytes = TrafficStats.getUidTxBytes(myUid);
                long uidRxBytes = TrafficStats.getUidRxBytes(myUid);
                HttpResponse a = this.f122571c.mo65022a(httpUriRequest2);
                if (a != null) {
                    httpEntity = a.getEntity();
                } else {
                    httpEntity = null;
                }
                if (httpEntity != null) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    a.setEntity(new dob(httpEntity, this.f122573e, myUid, uidTxBytes, uidRxBytes, elapsedRealtime2 - elapsedRealtime, elapsedRealtime2));
                }
                httpResponse = a;
            } else {
                httpResponse = this.f122571c.mo65022a(httpUriRequest2);
            }
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            try {
                EventLog.writeEvent(203002, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), Integer.valueOf(statusCode), this.f122573e, Integer.valueOf(this.f122570b.get() != null ? 0 : statusCode >= 0 ? 1 : 0));
            } catch (Exception e) {
                Log.e("GoogleHttpClient", "Error recording stats", e);
            }
            return httpResponse;
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                this.f122570b.get();
                EventLog.writeEvent(203002, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), -1, this.f122573e, 0);
            } catch (Exception e2) {
                Log.e("GoogleHttpClient", "Error recording stats", e2);
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bixi.a(org.apache.http.client.methods.HttpUriRequest, bixj):org.apache.http.client.methods.HttpUriRequest
     arg types: [org.apache.http.impl.client.RequestWrapper, ?[OBJECT, ARRAY]]
     candidates:
      bixi.a(java.lang.String, java.lang.String):java.lang.String
      bixi.a(org.apache.http.client.methods.HttpUriRequest, bixj):org.apache.http.client.methods.HttpUriRequest */
    public final Object execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, HttpContext httpContext) {
        bjdy bjdy = this.f122571c;
        RequestWrapper a = m103253a(httpRequest);
        return bjdy.f122563a.execute(httpHost, bixi.m102934a((HttpUriRequest) a, (bixj) null), new bjdz(responseHandler, a), httpContext);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bjdw.execute(org.apache.http.client.methods.HttpUriRequest, org.apache.http.client.ResponseHandler):java.lang.Object
     arg types: [org.apache.http.client.methods.HttpUriRequest, bjdz]
     candidates:
      bjdw.execute(org.apache.http.HttpHost, org.apache.http.HttpRequest):org.apache.http.HttpResponse
      bjdw.execute(org.apache.http.client.methods.HttpUriRequest, org.apache.http.protocol.HttpContext):org.apache.http.HttpResponse
      bjdw.execute(org.apache.http.client.methods.HttpUriRequest, org.apache.http.client.ResponseHandler):java.lang.Object */
    public final Object execute(HttpUriRequest httpUriRequest, ResponseHandler responseHandler) {
        bjdy bjdy = this.f122571c;
        return bjdy.f122563a.execute(bixi.m102934a(httpUriRequest, (bixj) null), (ResponseHandler) new bjdz(responseHandler, httpUriRequest));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bjdw.execute(org.apache.http.client.methods.HttpUriRequest, org.apache.http.client.ResponseHandler, org.apache.http.protocol.HttpContext):java.lang.Object
     arg types: [org.apache.http.client.methods.HttpUriRequest, bjdz, org.apache.http.protocol.HttpContext]
     candidates:
      bjdw.execute(org.apache.http.HttpHost, org.apache.http.HttpRequest, org.apache.http.client.ResponseHandler):java.lang.Object
      bjdw.execute(org.apache.http.HttpHost, org.apache.http.HttpRequest, org.apache.http.protocol.HttpContext):org.apache.http.HttpResponse
      bjdw.execute(org.apache.http.client.methods.HttpUriRequest, org.apache.http.client.ResponseHandler, org.apache.http.protocol.HttpContext):java.lang.Object */
    public final Object execute(HttpUriRequest httpUriRequest, ResponseHandler responseHandler, HttpContext httpContext) {
        bjdy bjdy = this.f122571c;
        return bjdy.f122563a.execute(httpUriRequest, (ResponseHandler) new bjdz(responseHandler, httpUriRequest), httpContext);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bjdw.execute(org.apache.http.HttpHost, org.apache.http.HttpRequest):org.apache.http.HttpResponse
     arg types: [org.apache.http.HttpHost, org.apache.http.client.methods.HttpUriRequest]
     candidates:
      bjdw.execute(org.apache.http.client.methods.HttpUriRequest, org.apache.http.client.ResponseHandler):java.lang.Object
      bjdw.execute(org.apache.http.client.methods.HttpUriRequest, org.apache.http.protocol.HttpContext):org.apache.http.HttpResponse
      bjdw.execute(org.apache.http.HttpHost, org.apache.http.HttpRequest):org.apache.http.HttpResponse */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bixi.a(org.apache.http.client.methods.HttpUriRequest, bixj):org.apache.http.client.methods.HttpUriRequest
     arg types: [org.apache.http.impl.client.RequestWrapper, ?[OBJECT, ARRAY]]
     candidates:
      bixi.a(java.lang.String, java.lang.String):java.lang.String
      bixi.a(org.apache.http.client.methods.HttpUriRequest, bixj):org.apache.http.client.methods.HttpUriRequest */
    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        bjdy bjdy = this.f122571c;
        RequestWrapper a = m103253a(httpRequest);
        HttpResponse execute = bjdy.f122563a.execute(httpHost, (HttpRequest) bixi.m102934a((HttpUriRequest) m103253a(httpRequest), (bixj) null));
        bixi.m102936a(a, execute, null);
        return execute;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bjdw.execute(org.apache.http.HttpHost, org.apache.http.HttpRequest, org.apache.http.protocol.HttpContext):org.apache.http.HttpResponse
     arg types: [org.apache.http.HttpHost, org.apache.http.client.methods.HttpUriRequest, org.apache.http.protocol.HttpContext]
     candidates:
      bjdw.execute(org.apache.http.HttpHost, org.apache.http.HttpRequest, org.apache.http.client.ResponseHandler):java.lang.Object
      bjdw.execute(org.apache.http.client.methods.HttpUriRequest, org.apache.http.client.ResponseHandler, org.apache.http.protocol.HttpContext):java.lang.Object
      bjdw.execute(org.apache.http.HttpHost, org.apache.http.HttpRequest, org.apache.http.protocol.HttpContext):org.apache.http.HttpResponse */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bixi.a(org.apache.http.client.methods.HttpUriRequest, bixj):org.apache.http.client.methods.HttpUriRequest
     arg types: [org.apache.http.impl.client.RequestWrapper, ?[OBJECT, ARRAY]]
     candidates:
      bixi.a(java.lang.String, java.lang.String):java.lang.String
      bixi.a(org.apache.http.client.methods.HttpUriRequest, bixj):org.apache.http.client.methods.HttpUriRequest */
    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        bjdy bjdy = this.f122571c;
        RequestWrapper a = m103253a(httpRequest);
        HttpResponse execute = bjdy.f122563a.execute(httpHost, (HttpRequest) bixi.m102934a((HttpUriRequest) m103253a(httpRequest), (bixj) null), httpContext);
        bixi.m102936a(a, execute, null);
        return execute;
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest) {
        return execute(httpUriRequest, (HttpContext) null);
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        doc doc;
        String str;
        String uri = httpUriRequest.getURI().toString();
        doe a = doe.m8922a(this.f122572d);
        Matcher matcher = a.f13684c.matcher(uri);
        if (matcher.lookingAt()) {
            int i = 0;
            while (true) {
                if (i >= a.f13683b.length) {
                    break;
                }
                int i2 = i + 1;
                if (matcher.group(i2) != null) {
                    doc = a.f13683b[i];
                    break;
                }
                i = i2;
            }
        }
        doc = doc.f13674e;
        if (!doc.f13678d) {
            String str2 = doc.f13677c;
            if (str2 != null) {
                String valueOf = String.valueOf(uri.substring(doc.f13676b.length()));
                str = valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf);
            } else {
                str = uri;
            }
        } else {
            str = null;
        }
        if (str == null) {
            String str3 = doc.f13675a;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 13 + String.valueOf(uri).length());
            sb.append("Blocked by ");
            sb.append(str3);
            sb.append(": ");
            sb.append(uri);
            Log.w("GoogleHttpClient", sb.toString());
            throw new bjdx(doc);
        } else if (str == uri) {
            return mo65028a(httpUriRequest);
        } else {
            try {
                URI uri2 = new URI(str);
                RequestWrapper b = m103254b(httpUriRequest);
                b.setURI(uri2);
                return mo65028a((HttpUriRequest) b);
            } catch (URISyntaxException e) {
                String valueOf2 = String.valueOf(doc.f13675a);
                throw new RuntimeException(valueOf2.length() == 0 ? new String("Bad URL from rule: ") : "Bad URL from rule: ".concat(valueOf2), e);
            }
        }
    }
}
