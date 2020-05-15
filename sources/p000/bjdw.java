package p000;

import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerParamBean;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HttpContext;

/* renamed from: bjdw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjdw implements HttpClient {

    /* renamed from: a */
    public static final HttpRequestInterceptor f122559a = new bjdr();

    /* renamed from: b */
    public volatile bjdv f122560b;

    /* renamed from: c */
    private final HttpClient f122561c;

    /* renamed from: d */
    private RuntimeException f122562d = new IllegalStateException("AndroidHttpClient created and never closed");

    private bjdw(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.f122561c = new bjdt(this, clientConnectionManager, httpParams);
    }

    /* renamed from: a */
    public static bjdw m103250a(String str, Context context) {
        SSLSessionCache sSLSessionCache;
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, false);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 20000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 20000);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        HttpClientParams.setRedirecting(basicHttpParams, false);
        if (context != null) {
            sSLSessionCache = new SSLSessionCache(context);
        } else {
            sSLSessionCache = null;
        }
        HttpProtocolParams.setUserAgent(basicHttpParams, str);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", bjee.f122574a, 80));
        schemeRegistry.register(new Scheme("https", m103251a(sSLSessionCache), 443));
        ConnManagerParamBean connManagerParamBean = new ConnManagerParamBean(basicHttpParams);
        connManagerParamBean.setConnectionsPerRoute(new ConnPerRouteBean(4));
        connManagerParamBean.setMaxTotalConnections(8);
        return new bjdw(new bjek(basicHttpParams, schemeRegistry), basicHttpParams);
    }

    public final Object execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler) {
        return this.f122561c.execute(httpHost, httpRequest, responseHandler);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        super.finalize();
        RuntimeException runtimeException = this.f122562d;
        if (runtimeException != null) {
            Log.e("AndroidHttpClient", "Leak found", runtimeException);
            this.f122562d = null;
        }
    }

    public final ClientConnectionManager getConnectionManager() {
        return this.f122561c.getConnectionManager();
    }

    public final HttpParams getParams() {
        return this.f122561c.getParams();
    }

    public final Object execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, HttpContext httpContext) {
        return this.f122561c.execute(httpHost, httpRequest, responseHandler, httpContext);
    }

    public final Object execute(HttpUriRequest httpUriRequest, ResponseHandler responseHandler) {
        return this.f122561c.execute(httpUriRequest, responseHandler);
    }

    public final Object execute(HttpUriRequest httpUriRequest, ResponseHandler responseHandler, HttpContext httpContext) {
        return this.f122561c.execute(httpUriRequest, responseHandler, httpContext);
    }

    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        return this.f122561c.execute(httpHost, httpRequest);
    }

    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return this.f122561c.execute(httpHost, httpRequest, httpContext);
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest) {
        return this.f122561c.execute(httpUriRequest);
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return this.f122561c.execute(httpUriRequest, httpContext);
    }

    /* renamed from: a */
    private static SSLSocketFactory m103251a(SSLSessionCache sSLSessionCache) {
        javax.net.ssl.SSLSocketFactory sSLSocketFactory = SSLCertificateSocketFactory.getDefault(5000, sSLSessionCache);
        try {
            return (SSLSocketFactory) SSLSocketFactory.class.getConstructor(javax.net.ssl.SSLSocketFactory.class).newInstance(sSLSocketFactory);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException(e4);
        }
    }
}
