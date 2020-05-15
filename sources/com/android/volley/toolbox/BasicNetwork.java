package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.Cache;
import com.android.volley.Header;
import com.android.volley.Network;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RetryPolicy;
import com.android.volley.ServerError;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BasicNetwork implements Network {
    protected static final boolean DEBUG = VolleyLog.DEBUG;

    /* renamed from: a */
    private final BaseHttpStack f7314a;
    @Deprecated
    protected final HttpStack mHttpStack;
    protected final ByteArrayPool mPool;

    public BasicNetwork(BaseHttpStack baseHttpStack) {
        this(baseHttpStack, new ByteArrayPool(4096));
    }

    /* renamed from: a */
    private static void m4768a(String str, Request request, VolleyError volleyError) {
        RetryPolicy retryPolicy = request.getRetryPolicy();
        int timeoutMs = request.getTimeoutMs();
        try {
            retryPolicy.retry(volleyError);
            request.addMarker(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(timeoutMs)));
        } catch (VolleyError e) {
            request.addMarker(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(timeoutMs)));
            throw e;
        }
    }

    @Deprecated
    protected static Map convertHeaders(Header[] headerArr) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < headerArr.length; i++) {
            treeMap.put(headerArr[i].getName(), headerArr[i].getValue());
        }
        return treeMap;
    }

    /* access modifiers changed from: protected */
    public void logError(String str, String str2, long j) {
        VolleyLog.m4767v("HTTP ERROR(%s) %d ms to fetch %s", str, Long.valueOf(SystemClock.elapsedRealtime() - j), str2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.android.volley.NetworkResponse.<init>(int, byte[], boolean, long, java.util.List):void
     arg types: [int, byte[], int, long, java.util.List]
     candidates:
      com.android.volley.NetworkResponse.<init>(int, byte[], java.util.Map, boolean, long):void
      com.android.volley.NetworkResponse.<init>(int, byte[], boolean, long, java.util.List):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.android.volley.NetworkResponse.<init>(int, byte[], boolean, long, java.util.List):void
     arg types: [int, byte[], int, long, java.util.ArrayList]
     candidates:
      com.android.volley.NetworkResponse.<init>(int, byte[], java.util.Map, boolean, long):void
      com.android.volley.NetworkResponse.<init>(int, byte[], boolean, long, java.util.List):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.android.volley.NetworkResponse.<init>(int, byte[], boolean, long, java.util.List):void
     arg types: [int, ?[OBJECT, ARRAY], int, long, java.util.List]
     candidates:
      com.android.volley.NetworkResponse.<init>(int, byte[], java.util.Map, boolean, long):void
      com.android.volley.NetworkResponse.<init>(int, byte[], boolean, long, java.util.List):void */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01e3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01e4, code lost:
        r17 = r6;
        r9 = r11;
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01e9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ea, code lost:
        r17 = r6;
        r9 = null;
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01f0, code lost:
        r0 = r9.getStatusCode();
        com.android.volley.VolleyLog.m4765e("Unexpected response code %d for %s", java.lang.Integer.valueOf(r0), r22.getUrl());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0208, code lost:
        if (r13 != null) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x020a, code lost:
        r6 = new com.android.volley.NetworkResponse(r0, r13, false, android.os.SystemClock.elapsedRealtime() - r4, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x021a, code lost:
        if (r0 != 401) goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0223, code lost:
        if (r0 < 400) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x022f, code lost:
        throw new com.android.volley.ClientError(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0232, code lost:
        if (r0 < 500) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x023c, code lost:
        if (r22.shouldRetryServerErrors() != false) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x023e, code lost:
        m4768a("server", r2, new com.android.volley.ServerError(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x024f, code lost:
        throw new com.android.volley.ServerError(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0256, code lost:
        m4768a("auth", r2, new com.android.volley.AuthFailureError(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0262, code lost:
        m4768a("network", r2, new com.android.volley.NetworkError());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0273, code lost:
        throw new com.android.volley.NoConnectionError(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0274, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0275, code lost:
        r2 = java.lang.String.valueOf(r22.getUrl());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0285, code lost:
        if (r2.length() == 0) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0287, code lost:
        r2 = new java.lang.String("Bad URL ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x028d, code lost:
        r2 = "Bad URL ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0294, code lost:
        throw new java.lang.RuntimeException(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0296, code lost:
        m4768a("socket", r2, new com.android.volley.TimeoutError());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0274 A[ExcHandler: MalformedURLException (r0v2 'e' java.net.MalformedURLException A[CUSTOM_DECLARE]), Splitter:B:2:0x0011] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0295 A[ExcHandler: SocketTimeoutException (e java.net.SocketTimeoutException), Splitter:B:2:0x0011] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x026e A[SYNTHETIC] */
    public NetworkResponse performRequest(Request request) {
        NetworkResponse networkResponse;
        Map map;
        HttpResponse executeRequest;
        byte[] bArr;
        Object obj;
        byte[] bArr2;
        Throwable th;
        Request request2 = request;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            List<Header> emptyList = Collections.emptyList();
            try {
                Cache.Entry cacheEntry = request.getCacheEntry();
                if (cacheEntry != null) {
                    map = new HashMap();
                    String str = cacheEntry.etag;
                    if (str != null) {
                        map.put("If-None-Match", str);
                    }
                    long j = cacheEntry.lastModified;
                    if (j > 0) {
                        map.put("If-Modified-Since", HttpHeaderParser.m4784a().format(new Date(j)));
                    }
                } else {
                    map = Collections.emptyMap();
                }
                executeRequest = this.f7314a.executeRequest(request2, map);
                int statusCode = executeRequest.getStatusCode();
                emptyList = executeRequest.getHeaders();
                if (statusCode != 304) {
                    InputStream content = executeRequest.getContent();
                    if (content != null) {
                        PoolingByteArrayOutputStream poolingByteArrayOutputStream = new PoolingByteArrayOutputStream(this.mPool, executeRequest.getContentLength());
                        try {
                            bArr2 = this.mPool.getBuf(1024);
                            while (true) {
                                try {
                                    int read = content.read(bArr2);
                                    if (read == -1) {
                                        break;
                                    }
                                    poolingByteArrayOutputStream.write(bArr2, 0, read);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            bArr = poolingByteArrayOutputStream.toByteArray();
                            try {
                                content.close();
                            } catch (IOException e) {
                                VolleyLog.m4767v("Error occurred when closing InputStream", new Object[0]);
                            }
                            this.mPool.returnBuf(bArr2);
                            poolingByteArrayOutputStream.close();
                        } catch (Throwable th3) {
                            th = th3;
                            bArr2 = null;
                            try {
                                content.close();
                                break;
                            } catch (IOException e2) {
                                VolleyLog.m4767v("Error occurred when closing InputStream", new Object[0]);
                                break;
                            }
                            this.mPool.returnBuf(bArr2);
                            poolingByteArrayOutputStream.close();
                            throw th;
                        }
                    } else {
                        bArr = new byte[0];
                    }
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (!DEBUG) {
                        if (elapsedRealtime2 <= 3000) {
                            if (statusCode < 200 && statusCode <= 299) {
                                return new NetworkResponse(statusCode, bArr, false, SystemClock.elapsedRealtime() - elapsedRealtime, emptyList);
                            }
                            throw new IOException();
                        }
                    }
                    Object[] objArr = new Object[5];
                    objArr[0] = request2;
                    objArr[1] = Long.valueOf(elapsedRealtime2);
                    if (bArr != null) {
                        obj = Integer.valueOf(bArr.length);
                    } else {
                        obj = "null";
                    }
                    objArr[2] = obj;
                    objArr[3] = Integer.valueOf(statusCode);
                    objArr[4] = Integer.valueOf(request.getRetryPolicy().getCurrentRetryCount());
                    VolleyLog.m4764d("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                    if (statusCode < 200) {
                    }
                    throw new IOException();
                }
                Cache.Entry cacheEntry2 = request.getCacheEntry();
                if (cacheEntry2 == null) {
                    return new NetworkResponse(304, (byte[]) null, true, SystemClock.elapsedRealtime() - elapsedRealtime, emptyList);
                }
                TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                if (!emptyList.isEmpty()) {
                    for (Header header : emptyList) {
                        treeSet.add(header.getName());
                    }
                }
                ArrayList arrayList = new ArrayList(emptyList);
                List list = cacheEntry2.allResponseHeaders;
                if (list == null) {
                    if (!cacheEntry2.responseHeaders.isEmpty()) {
                        for (Map.Entry entry : cacheEntry2.responseHeaders.entrySet()) {
                            if (!treeSet.contains(entry.getKey())) {
                                arrayList.add(new Header((String) entry.getKey(), (String) entry.getValue()));
                            }
                        }
                    }
                } else if (!list.isEmpty()) {
                    for (Header header2 : cacheEntry2.allResponseHeaders) {
                        if (!treeSet.contains(header2.getName())) {
                            arrayList.add(header2);
                        }
                    }
                }
                return new NetworkResponse(304, cacheEntry2.data, true, SystemClock.elapsedRealtime() - elapsedRealtime, (List) arrayList);
            } catch (SocketTimeoutException e3) {
            } catch (MalformedURLException e4) {
            } catch (IOException e5) {
                e = e5;
                List list2 = emptyList;
                byte[] bArr3 = bArr;
                HttpResponse httpResponse = executeRequest;
                if (httpResponse != null) {
                }
            }
        }
        throw new ServerError(networkResponse);
    }

    public BasicNetwork(BaseHttpStack baseHttpStack, ByteArrayPool byteArrayPool) {
        this.f7314a = baseHttpStack;
        this.mHttpStack = baseHttpStack;
        this.mPool = byteArrayPool;
    }

    @Deprecated
    public BasicNetwork(HttpStack httpStack) {
        this(httpStack, new ByteArrayPool(4096));
    }

    @Deprecated
    public BasicNetwork(HttpStack httpStack, ByteArrayPool byteArrayPool) {
        this.mHttpStack = httpStack;
        this.f7314a = new bnu(httpStack);
        this.mPool = byteArrayPool;
    }
}
