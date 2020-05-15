package p000;

import android.content.Context;
import android.net.Network;
import android.os.Build;
import android.os.Looper;
import com.felicanetworks.cmnctrl.net.DataParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* renamed from: abop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abop implements HttpClient {

    /* renamed from: c */
    private static final HttpVersion f57802c = new HttpVersion(1, 1);

    /* renamed from: a */
    public abor f57803a;

    /* renamed from: b */
    public HttpParams f57804b;

    /* renamed from: d */
    private String f57805d;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abop.<init>(android.content.Context, java.lang.String, boolean, boolean):void
     arg types: [android.content.Context, java.lang.String, boolean, int]
     candidates:
      abop.<init>(android.content.Context, java.lang.String, boolean, aboq):void
      abop.<init>(android.content.Context, java.lang.String, boolean, boolean):void */
    public abop(Context context, String str, boolean z) {
        this(context, str, z, true);
    }

    /* renamed from: a */
    public static InputStream m48011a(HttpEntity httpEntity) {
        String value;
        InputStream content = httpEntity.getContent();
        if (content == null) {
            return null;
        }
        Header contentEncoding = httpEntity.getContentEncoding();
        return (contentEncoding == null || (value = contentEncoding.getValue()) == null || !value.contains("gzip")) ? content : new GZIPInputStream(content);
    }

    /* renamed from: a */
    public final SSLSocketFactory mo32249a() {
        SSLSocketFactory sSLSocketFactory = ((aboy) this.f57803a).f57826e;
        return sSLSocketFactory == null ? HttpsURLConnection.getDefaultSSLSocketFactory() : sSLSocketFactory;
    }

    public final Object execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler) {
        throw new UnsupportedOperationException();
    }

    public final ClientConnectionManager getConnectionManager() {
        throw new UnsupportedOperationException();
    }

    public final HttpParams getParams() {
        return this.f57804b;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [abov, org.apache.http.params.HttpParams], assign insn: 0x0006: CONSTRUCTOR  (r3v1 ? I:abov) = (r1v0 'this' abop A[THIS]) call: abov.<init>(abop):void type: CONSTRUCTOR */
    public abop(Context context, String str, boolean z, aboq aboq) {
        this(str, true);
        this.f57804b = new abov(this);
        this.f57803a = new aboy(context, z, aboq);
    }

    public final Object execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, HttpContext httpContext) {
        throw new UnsupportedOperationException();
    }

    public final Object execute(HttpUriRequest httpUriRequest, ResponseHandler responseHandler) {
        return execute(httpUriRequest, responseHandler, (HttpContext) null);
    }

    public final Object execute(HttpUriRequest httpUriRequest, ResponseHandler responseHandler, HttpContext httpContext) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [abov, org.apache.http.params.HttpParams], assign insn: 0x0005: CONSTRUCTOR  (r2v1 ? I:abov) = (r0v0 'this' abop A[THIS]) call: abov.<init>(abop):void type: CONSTRUCTOR */
    public abop(Context context, String str, boolean z, boolean z2) {
        this(str, z);
        this.f57804b = new abov(this);
        this.f57803a = new aboy(context, z2);
    }

    /* renamed from: a */
    static /* synthetic */ HttpURLConnection m48012a(abop abop, URL url) {
        HttpURLConnection a = ((aboy) abop.f57803a).mo32272a(url, (Network) null);
        a.setInstanceFollowRedirects(false);
        return a;
    }

    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        throw new UnsupportedOperationException();
    }

    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        throw new UnsupportedOperationException();
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest) {
        return execute(httpUriRequest, (HttpContext) null);
    }

    public abop(String str, boolean z) {
        String str2 = Build.DEVICE;
        String str3 = Build.ID;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(" (");
        sb.append(str2);
        sb.append(" ");
        sb.append(str3);
        sb.append(")");
        String sb2 = sb.toString();
        this.f57805d = z ? String.valueOf(sb2).concat("; gzip") : sb2;
    }

    /* renamed from: a */
    public static AbstractHttpEntity m48013a(byte[] bArr) {
        if (((long) bArr.length) < 256) {
            return new ByteArrayEntity(bArr);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        AbstractHttpEntity byteArrayEntity = new ByteArrayEntity(byteArrayOutputStream.toByteArray());
        byteArrayEntity.setContentEncoding("gzip");
        return byteArrayEntity;
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return mo32250a(httpUriRequest, new abou(this));
    }

    /* renamed from: a */
    public static void m48014a(HttpRequest httpRequest) {
        httpRequest.addHeader("Accept-Encoding", "gzip");
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x018d  */
    /* renamed from: a */
    public final HttpResponse mo32250a(HttpUriRequest httpUriRequest, aboo aboo) {
        long j;
        int responseCode;
        InputStream inputStream;
        if (Looper.myLooper() == null || Looper.myLooper() != Looper.getMainLooper()) {
            boolean z = httpUriRequest instanceof HttpEntityEnclosingRequest;
            if (z) {
                HttpEntity entity = ((HttpEntityEnclosingRequest) httpUriRequest).getEntity();
                j = entity != null ? !entity.isChunked() ? entity.getContentLength() : -1 : 0;
            } else {
                j = -1;
            }
            if (j >= 0) {
                httpUriRequest.addHeader(DataParser.CONTENT_LENGTH_KEY, Long.toString(j));
            }
            HttpURLConnection a = aboo.mo32248a(httpUriRequest.getURI().toURL());
            a.setRequestMethod(httpUriRequest.getMethod());
            Header[] allHeaders = httpUriRequest.getAllHeaders();
            for (Header header : allHeaders) {
                a.addRequestProperty(header.getName(), header.getValue());
            }
            if (a.getRequestProperty("User-Agent") == null) {
                a.setRequestProperty("User-Agent", this.f57805d);
            }
            if (z) {
                HttpEntityEnclosingRequest httpEntityEnclosingRequest = (HttpEntityEnclosingRequest) httpUriRequest;
                if (httpEntityEnclosingRequest.getEntity() != null) {
                    HttpEntity entity2 = httpEntityEnclosingRequest.getEntity();
                    a.setDoOutput(true);
                    if (entity2.isChunked()) {
                        a.setChunkedStreamingMode(2048);
                    } else if (entity2.getContentLength() > 0) {
                        a.setRequestProperty(DataParser.CONTENT_LENGTH_KEY, Long.toString(entity2.getContentLength()));
                    }
                    if (entity2.isStreaming()) {
                        if (entity2.getContentLength() > 0) {
                            int i = Build.VERSION.SDK_INT;
                            a.setFixedLengthStreamingMode(entity2.getContentLength());
                        } else {
                            a.setChunkedStreamingMode(2048);
                        }
                    }
                    Header contentType = entity2.getContentType();
                    Header contentEncoding = entity2.getContentEncoding();
                    if (contentType != null) {
                        a.setRequestProperty("content-type", contentType.getValue());
                    }
                    if (contentEncoding != null) {
                        a.setRequestProperty("content-encoding", contentEncoding.getValue());
                    }
                    entity2.writeTo(a.getOutputStream());
                    responseCode = a.getResponseCode();
                    if (responseCode < 0) {
                        this.f57803a.f57810a.mo32270a(a.getURL().toString(), responseCode);
                        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(f57802c, responseCode, a.getResponseMessage());
                        String str = null;
                        String str2 = null;
                        for (Map.Entry<String, List<String>> entry : a.getHeaderFields().entrySet()) {
                            String key = entry.getKey();
                            if (key != null) {
                                for (String str3 : entry.getValue()) {
                                    if (key.equalsIgnoreCase("content-type")) {
                                        str2 = str3;
                                    } else if (key.equalsIgnoreCase("content-encoding")) {
                                        str = str3;
                                    }
                                    basicHttpResponse.addHeader(new BasicHeader(key, str3));
                                }
                            }
                        }
                        if (responseCode < 400) {
                            inputStream = a.getInputStream();
                        } else {
                            inputStream = a.getErrorStream();
                        }
                        if (inputStream != null) {
                            InputStreamEntity inputStreamEntity = new InputStreamEntity(inputStream, -1);
                            if (str2 != null) {
                                inputStreamEntity.setContentType(str2);
                            }
                            if (str != null) {
                                inputStreamEntity.setContentEncoding(str);
                            }
                            basicHttpResponse.setEntity(inputStreamEntity);
                        }
                        return basicHttpResponse;
                    }
                    throw new IOException("Cannot retrieve a valid HTTP status code from server response");
                }
            }
            a.connect();
            responseCode = a.getResponseCode();
            if (responseCode < 0) {
            }
        } else {
            throw new RuntimeException("This thread forbids HTTP requests");
        }
    }

    /* renamed from: a */
    public final void mo32251a(String str) {
        if (str == null) {
            throw new NullPointerException("name");
        }
    }
}
