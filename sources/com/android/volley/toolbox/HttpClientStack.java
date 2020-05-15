package com.android.volley.toolbox;

import com.android.volley.Request;
import java.net.URI;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class HttpClientStack implements HttpStack {
    protected final HttpClient mClient;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class HttpPatch extends HttpEntityEnclosingRequestBase {
        public static final String METHOD_NAME = "PATCH";

        public HttpPatch() {
        }

        public String getMethod() {
            return METHOD_NAME;
        }

        public HttpPatch(String str) {
            setURI(URI.create(str));
        }

        public HttpPatch(URI uri) {
            setURI(uri);
        }
    }

    public HttpClientStack(HttpClient httpClient) {
        this.mClient = httpClient;
    }

    /* renamed from: a */
    private static void m4782a(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, Request request) {
        byte[] body = request.getBody();
        if (body != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(body));
        }
    }

    /* access modifiers changed from: protected */
    public void onPrepareRequest(HttpUriRequest httpUriRequest) {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.android.volley.toolbox.HttpClientStack.a(org.apache.http.client.methods.HttpEntityEnclosingRequestBase, com.android.volley.Request):void
     arg types: [com.android.volley.toolbox.HttpClientStack$HttpPatch, com.android.volley.Request]
     candidates:
      com.android.volley.toolbox.HttpClientStack.a(org.apache.http.client.methods.HttpUriRequest, java.util.Map):void
      com.android.volley.toolbox.HttpClientStack.a(org.apache.http.client.methods.HttpEntityEnclosingRequestBase, com.android.volley.Request):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.android.volley.toolbox.HttpClientStack.a(org.apache.http.client.methods.HttpUriRequest, java.util.Map):void
     arg types: [com.android.volley.toolbox.HttpClientStack$HttpPatch, java.util.Map]
     candidates:
      com.android.volley.toolbox.HttpClientStack.a(org.apache.http.client.methods.HttpEntityEnclosingRequestBase, com.android.volley.Request):void
      com.android.volley.toolbox.HttpClientStack.a(org.apache.http.client.methods.HttpUriRequest, java.util.Map):void */
    public HttpResponse performRequest(Request request, Map map) {
        HttpPatch httpPatch;
        switch (request.getMethod()) {
            case -1:
                byte[] postBody = request.getPostBody();
                if (postBody == null) {
                    httpPatch = new HttpGet(request.getUrl());
                    break;
                } else {
                    HttpPatch httpPost = new HttpPost(request.getUrl());
                    httpPost.addHeader("Content-Type", request.getPostBodyContentType());
                    httpPost.setEntity(new ByteArrayEntity(postBody));
                    httpPatch = httpPost;
                    break;
                }
            case 0:
                httpPatch = new HttpGet(request.getUrl());
                break;
            case 1:
                httpPatch = new HttpPost(request.getUrl());
                httpPatch.addHeader("Content-Type", request.getBodyContentType());
                m4782a((HttpEntityEnclosingRequestBase) httpPatch, request);
                break;
            case 2:
                httpPatch = new HttpPut(request.getUrl());
                httpPatch.addHeader("Content-Type", request.getBodyContentType());
                m4782a((HttpEntityEnclosingRequestBase) httpPatch, request);
                break;
            case 3:
                httpPatch = new HttpDelete(request.getUrl());
                break;
            case 4:
                httpPatch = new HttpHead(request.getUrl());
                break;
            case 5:
                httpPatch = new HttpOptions(request.getUrl());
                break;
            case 6:
                httpPatch = new HttpTrace(request.getUrl());
                break;
            case 7:
                httpPatch = new HttpPatch(request.getUrl());
                httpPatch.addHeader("Content-Type", request.getBodyContentType());
                m4782a((HttpEntityEnclosingRequestBase) httpPatch, request);
                break;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
        m4783a((HttpUriRequest) httpPatch, map);
        m4783a((HttpUriRequest) httpPatch, request.getHeaders());
        onPrepareRequest(httpPatch);
        HttpParams params = httpPatch.getParams();
        int timeoutMs = request.getTimeoutMs();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, timeoutMs);
        return this.mClient.execute(httpPatch);
    }

    /* renamed from: a */
    private static void m4783a(HttpUriRequest httpUriRequest, Map map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, (String) map.get(str));
        }
    }
}
