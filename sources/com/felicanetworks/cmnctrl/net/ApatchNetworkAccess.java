package com.felicanetworks.cmnctrl.net;

import com.felicanetworks.cmnlib.AppContext;
import com.felicanetworks.cmnlib.FunctionCodeInterface;
import com.felicanetworks.cmnlib.log.LogMgr;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.HashMap;
import java.util.Locale;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ApatchNetworkAccess extends BaseNetworkAccess implements FunctionCodeInterface {
    private static final String CHARCODE = "UTF-8";
    private static final String CONNECT_TYPE_GET = "GET";
    private static final String CONTENT_LENGTH_KEY = "content-length";
    public static final String CONTENT_TYPE_KEY = "content-type";
    private AppContext context;
    private boolean isCancel = false;

    public ApatchNetworkAccess(AppContext appContext) {
        this.context = appContext;
    }

    private NetworkAccessException createNetworkAccessException(Exception exc) {
        if (exc instanceof InterruptedException) {
            return new NetworkAccessException(exc, this.context.logMgr.out(LogMgr.CatExp.WAR, this, exc), 5);
        }
        if (exc instanceof SocketTimeoutException) {
            return new NetworkAccessException(exc, this.context.logMgr.out(LogMgr.CatExp.WAR, this, exc), 3);
        }
        return new NetworkAccessException(exc, this.context.logMgr.out(LogMgr.CatExp.WAR, this, exc), 4);
    }

    public void cancel() {
        this.isCancel = true;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX INFO: additional move instructions added (3) to help type inference */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream], assign insn: PHI: (r5v0 ?) = (r5v5 ?), (r5v26 ?), (r5v29 ?), (r5v31 ?) binds: [B:98:0x01c9, B:106:0x01df, B:57:0x016a, B:10:0x008c] */
    /* JADX WARN: Type inference failed for: r5v5, assign insn: 0x01ca: MOVE  (r5v5 ? I:?[OBJECT, ARRAY]) = (0 ?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r5v26, assign insn: ?: MOVE  (r5v26 ?) = (r5v1 java.io.ByteArrayOutputStream) */
    /* JADX WARN: Type inference failed for: r5v29, assign insn: ?: MOVE  (r5v29 ?) = (r5v12 java.io.InputStream) */
    /* JADX WARN: Type inference failed for: r5v31, assign insn: ?: MOVE  (r5v31 ?) = (r5v23 java.lang.Object) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01e2 A[SYNTHETIC, Splitter:B:108:0x01e2] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01ea A[SYNTHETIC, Splitter:B:112:0x01ea] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01fd  */
    /* JADX WARNING: Unknown variable types count: 1 */
    public NetworkAccessResponseData connect(NetworkAccessRequestData networkAccessRequestData) {
        ByteArrayOutputStream byteArrayOutputStream;
        HttpPost httpPost;
        HttpGet httpGet;
        ? r5;
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream2;
        HttpGet httpGet2;
        ByteArrayOutputStream byteArrayOutputStream3;
        HttpResponse httpResponse;
        ByteArrayOutputStream byteArrayOutputStream4;
        ByteArrayOutputStream byteArrayOutputStream5;
        ByteArrayOutputStream byteArrayOutputStream6;
        InputStream inputStream;
        NetworkAccessResponseData networkAccessResponseData;
        Object obj;
        NetworkAccessRequestData networkAccessRequestData2 = networkAccessRequestData;
        try {
            DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
            defaultHttpClient.getParams().setParameter("http.protocol.expect-continue", false);
            defaultHttpClient.getParams().setParameter("http.useragent", this.context.userAgent);
            HttpConnectionParams.setSoTimeout(defaultHttpClient.getParams(), networkAccessRequestData2.readTimeout);
            HttpConnectionParams.setConnectionTimeout(defaultHttpClient.getParams(), networkAccessRequestData2.connectTimeout);
            HttpProtocolParams.setVersion(defaultHttpClient.getParams(), HttpVersion.HTTP_1_1);
            if (networkAccessRequestData2.method.equals(CONNECT_TYPE_GET)) {
                httpGet = new HttpGet(new URI(networkAccessRequestData2.url + "?" + new String(networkAccessRequestData2.data, CHARCODE)).normalize().toURL().toString());
                try {
                    httpResponse = defaultHttpClient.execute(httpGet);
                    httpPost = null;
                } catch (Exception e) {
                    e = e;
                    httpGet2 = httpGet;
                    byteArrayOutputStream3 = null;
                    httpPost = null;
                    byteArrayOutputStream = null;
                    try {
                        throw createNetworkAccessException(e);
                    } catch (Throwable th2) {
                        th = th2;
                        httpGet = httpGet2;
                        byteArrayOutputStream2 = byteArrayOutputStream3;
                        th = th;
                        r5 = byteArrayOutputStream2;
                        if (r5 != 0) {
                        }
                        if (byteArrayOutputStream != null) {
                        }
                        if (networkAccessRequestData2.method.equals(CONNECT_TYPE_GET)) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = null;
                    httpPost = null;
                    byteArrayOutputStream = null;
                    r5 = obj;
                    if (r5 != 0) {
                    }
                    if (byteArrayOutputStream != null) {
                    }
                    if (networkAccessRequestData2.method.equals(CONNECT_TYPE_GET)) {
                    }
                    throw th;
                }
            } else {
                httpPost = new HttpPost(new URI(networkAccessRequestData2.url).normalize().toURL().toString());
                try {
                    httpPost.addHeader("content-type", (String) networkAccessRequestData2.header.get("content-type"));
                    httpPost.setEntity(new ByteArrayEntity(networkAccessRequestData2.data));
                    httpResponse = defaultHttpClient.execute(httpPost);
                    httpGet = null;
                } catch (Exception e2) {
                    e = e2;
                    byteArrayOutputStream3 = null;
                    httpGet2 = null;
                    byteArrayOutputStream = null;
                    throw createNetworkAccessException(e);
                } catch (Throwable th4) {
                    th = th4;
                    byteArrayOutputStream2 = null;
                    httpGet = null;
                    byteArrayOutputStream = null;
                    th = th;
                    r5 = byteArrayOutputStream2;
                    if (r5 != 0) {
                    }
                    if (byteArrayOutputStream != null) {
                    }
                    if (networkAccessRequestData2.method.equals(CONNECT_TYPE_GET)) {
                    }
                    throw th;
                }
            }
            try {
                NetworkAccessListener networkAccessListener = networkAccessRequestData2.listener;
                if (networkAccessListener != null) {
                    networkAccessListener.session();
                }
                int statusCode = httpResponse.getStatusLine().getStatusCode();
                HashMap hashMap = new HashMap();
                Header[] allHeaders = httpResponse.getAllHeaders();
                for (Header header : allHeaders) {
                    hashMap.put(header.getName().toLowerCase(Locale.US), header.getValue());
                }
                int parseInt = (hashMap.get("content-length") == null || Integer.parseInt((String) hashMap.get("content-length")) <= 0) ? 0 : Integer.parseInt((String) hashMap.get("content-length"));
                if (parseInt != 0) {
                    int i = parseInt / networkAccessRequestData2.noticeCnt;
                    InputStream content = httpResponse.getEntity().getContent();
                    try {
                        byteArrayOutputStream6 = new ByteArrayOutputStream();
                        int i2 = i;
                        int i3 = 0;
                        while (!this.isCancel) {
                            try {
                                int read = content.read();
                                if (read == -1) {
                                    networkAccessResponseData = new NetworkAccessResponseData(statusCode, hashMap, byteArrayOutputStream6.toByteArray());
                                    inputStream = content;
                                } else {
                                    byteArrayOutputStream6.write(read);
                                    if (byteArrayOutputStream6.size() >= i2 && i3 <= networkAccessRequestData2.noticeCnt) {
                                        i3++;
                                        NetworkAccessListener networkAccessListener2 = networkAccessRequestData2.listener;
                                        if (networkAccessListener2 != null) {
                                            networkAccessListener2.receiveRatio(i3);
                                        }
                                        i2 += i;
                                    }
                                }
                            } catch (Exception e3) {
                                e = e3;
                                byteArrayOutputStream3 = content;
                                httpGet2 = httpGet;
                                byteArrayOutputStream = byteArrayOutputStream6;
                                throw createNetworkAccessException(e);
                            } catch (Throwable th5) {
                                th = th5;
                                byteArrayOutputStream = byteArrayOutputStream6;
                                r5 = content;
                                if (r5 != 0) {
                                }
                                if (byteArrayOutputStream != null) {
                                }
                                if (networkAccessRequestData2.method.equals(CONNECT_TYPE_GET)) {
                                }
                                throw th;
                            }
                        }
                        this.isCancel = false;
                        throw new InterruptedException();
                    } catch (Exception e4) {
                        e = e4;
                        byteArrayOutputStream3 = content;
                        httpGet2 = httpGet;
                        byteArrayOutputStream = null;
                        throw createNetworkAccessException(e);
                    } catch (Throwable th6) {
                        th = th6;
                        obj = content;
                        byteArrayOutputStream = null;
                        r5 = obj;
                        if (r5 != 0) {
                        }
                        if (byteArrayOutputStream != null) {
                        }
                        if (networkAccessRequestData2.method.equals(CONNECT_TYPE_GET)) {
                        }
                        throw th;
                    }
                } else {
                    byteArrayOutputStream4 = null;
                    byteArrayOutputStream5 = null;
                    try {
                        inputStream = null;
                        byteArrayOutputStream6 = null;
                        networkAccessResponseData = new NetworkAccessResponseData(statusCode, hashMap, null);
                    } catch (Exception e5) {
                        e = e5;
                        byteArrayOutputStream = byteArrayOutputStream3;
                        httpGet2 = httpGet;
                        throw createNetworkAccessException(e);
                    } catch (Throwable th7) {
                        th = th7;
                        ByteArrayOutputStream byteArrayOutputStream7 = byteArrayOutputStream5;
                        byteArrayOutputStream = byteArrayOutputStream7;
                        byteArrayOutputStream2 = byteArrayOutputStream7;
                        th = th;
                        r5 = byteArrayOutputStream2;
                        if (r5 != 0) {
                        }
                        if (byteArrayOutputStream != null) {
                        }
                        if (networkAccessRequestData2.method.equals(CONNECT_TYPE_GET)) {
                        }
                        throw th;
                    }
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e6) {
                    }
                }
                if (byteArrayOutputStream6 != null) {
                    try {
                        byteArrayOutputStream6.close();
                    } catch (Exception e7) {
                    }
                }
                if (!networkAccessRequestData2.method.equals(CONNECT_TYPE_GET)) {
                    if (httpPost != null) {
                        httpPost.abort();
                    }
                } else if (httpGet != null) {
                    httpGet.abort();
                }
                return networkAccessResponseData;
            } catch (Exception e8) {
                e = e8;
                byteArrayOutputStream4 = null;
                byteArrayOutputStream = byteArrayOutputStream3;
                httpGet2 = httpGet;
                throw createNetworkAccessException(e);
            } catch (Throwable th8) {
                th = th8;
                byteArrayOutputStream5 = null;
                ByteArrayOutputStream byteArrayOutputStream72 = byteArrayOutputStream5;
                byteArrayOutputStream = byteArrayOutputStream72;
                byteArrayOutputStream2 = byteArrayOutputStream72;
                th = th;
                r5 = byteArrayOutputStream2;
                if (r5 != 0) {
                }
                if (byteArrayOutputStream != null) {
                }
                if (networkAccessRequestData2.method.equals(CONNECT_TYPE_GET)) {
                }
                throw th;
            }
        } catch (Exception e9) {
            e = e9;
            byteArrayOutputStream3 = null;
            httpGet2 = null;
            httpPost = null;
            byteArrayOutputStream = null;
            throw createNetworkAccessException(e);
        } catch (Throwable th9) {
            r5 = 0;
            httpGet = null;
            httpPost = null;
            byteArrayOutputStream = null;
            th = th9;
            if (r5 != 0) {
                try {
                    r5.close();
                } catch (Exception e10) {
                }
            }
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (Exception e11) {
                }
            }
            if (networkAccessRequestData2.method.equals(CONNECT_TYPE_GET)) {
                if (httpPost != null) {
                    httpPost.abort();
                }
            } else if (httpGet != null) {
                httpGet.abort();
            }
            throw th;
        }
    }

    public int getClassCode() {
        return 4;
    }

    public int getFunctionCode() {
        return 4;
    }
}
