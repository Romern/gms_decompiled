package com.android.volley.toolbox;

import com.android.volley.Header;
import com.android.volley.Request;
import com.android.volley.toolbox.HttpClientStack;
import com.felicanetworks.cmnctrl.net.DataParser;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class HurlStack extends BaseHttpStack {

    /* renamed from: a */
    private final UrlRewriter f7329a;

    /* renamed from: b */
    private final SSLSocketFactory f7330b;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface UrlRewriter {
        String rewriteUrl(String str);
    }

    public HurlStack() {
        this(null);
    }

    /* renamed from: a */
    static List m4785a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : (List) entry.getValue()) {
                    arrayList.add(new Header((String) entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public HttpURLConnection createConnection(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e4 A[Catch:{ all -> 0x0135 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0127 A[SYNTHETIC, Splitter:B:59:0x0127] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0138  */
    public HttpResponse executeRequest(Request request, Map map) {
        int responseCode;
        SSLSocketFactory sSLSocketFactory;
        String url = request.getUrl();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(request.getHeaders());
        UrlRewriter urlRewriter = this.f7329a;
        if (urlRewriter != null) {
            String rewriteUrl = urlRewriter.rewriteUrl(url);
            if (rewriteUrl != null) {
                url = rewriteUrl;
            } else {
                String valueOf = String.valueOf(url);
                throw new IOException(valueOf.length() == 0 ? new String("URL blocked by rewriter: ") : "URL blocked by rewriter: ".concat(valueOf));
            }
        }
        URL url2 = new URL(url);
        HttpURLConnection createConnection = createConnection(url2);
        int timeoutMs = request.getTimeoutMs();
        createConnection.setConnectTimeout(timeoutMs);
        createConnection.setReadTimeout(timeoutMs);
        boolean z = false;
        createConnection.setUseCaches(false);
        createConnection.setDoInput(true);
        if ("https".equals(url2.getProtocol()) && (sSLSocketFactory = this.f7330b) != null) {
            ((HttpsURLConnection) createConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        try {
            for (String str : hashMap.keySet()) {
                createConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            switch (request.getMethod()) {
                case -1:
                    byte[] postBody = request.getPostBody();
                    if (postBody != null) {
                        createConnection.setRequestMethod(DataParser.CONNECT_TYPE_POST);
                        m4787a(createConnection, request, postBody);
                    }
                    responseCode = createConnection.getResponseCode();
                    if (responseCode == -1) {
                        throw new IOException("Could not retrieve response code from HttpUrlConnection.");
                    } else if (request.getMethod() == 4 || ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304)) {
                        HttpResponse httpResponse = new HttpResponse(responseCode, m4785a(createConnection.getHeaderFields()));
                        createConnection.disconnect();
                        return httpResponse;
                    } else {
                        try {
                            return new HttpResponse(responseCode, m4785a(createConnection.getHeaderFields()), createConnection.getContentLength(), new bnz(createConnection));
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            if (!z) {
                                createConnection.disconnect();
                            }
                            throw th;
                        }
                    }
                case 0:
                    createConnection.setRequestMethod("GET");
                    responseCode = createConnection.getResponseCode();
                    if (responseCode == -1) {
                    }
                    break;
                case 1:
                    createConnection.setRequestMethod(DataParser.CONNECT_TYPE_POST);
                    m4786a(createConnection, request);
                    responseCode = createConnection.getResponseCode();
                    if (responseCode == -1) {
                    }
                    break;
                case 2:
                    createConnection.setRequestMethod("PUT");
                    m4786a(createConnection, request);
                    responseCode = createConnection.getResponseCode();
                    if (responseCode == -1) {
                    }
                    break;
                case 3:
                    createConnection.setRequestMethod("DELETE");
                    responseCode = createConnection.getResponseCode();
                    if (responseCode == -1) {
                    }
                    break;
                case 4:
                    createConnection.setRequestMethod("HEAD");
                    responseCode = createConnection.getResponseCode();
                    if (responseCode == -1) {
                    }
                    break;
                case 5:
                    createConnection.setRequestMethod("OPTIONS");
                    responseCode = createConnection.getResponseCode();
                    if (responseCode == -1) {
                    }
                    break;
                case 6:
                    createConnection.setRequestMethod("TRACE");
                    responseCode = createConnection.getResponseCode();
                    if (responseCode == -1) {
                    }
                    break;
                case 7:
                    createConnection.setRequestMethod(HttpClientStack.HttpPatch.METHOD_NAME);
                    m4786a(createConnection, request);
                    responseCode = createConnection.getResponseCode();
                    if (responseCode == -1) {
                    }
                    break;
                default:
                    throw new IllegalStateException("Unknown method type.");
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z) {
            }
            throw th;
        }
    }

    public HurlStack(UrlRewriter urlRewriter) {
        this(urlRewriter, null);
    }

    public HurlStack(UrlRewriter urlRewriter, SSLSocketFactory sSLSocketFactory) {
        this.f7329a = urlRewriter;
        this.f7330b = sSLSocketFactory;
    }

    /* renamed from: a */
    private static void m4786a(HttpURLConnection httpURLConnection, Request request) {
        byte[] body = request.getBody();
        if (body != null) {
            m4787a(httpURLConnection, request, body);
        }
    }

    /* renamed from: a */
    private static void m4787a(HttpURLConnection httpURLConnection, Request request, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", request.getBodyContentType());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }
}
