package p000;

import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;

/* renamed from: axwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axwn {

    /* renamed from: a */
    public static final axya f96609a = new axya("sendAsset");

    /* renamed from: h */
    private static final axya f96610h = new axya("getAsset");

    /* renamed from: b */
    public final int f96611b;

    /* renamed from: c */
    public final axui f96612c;

    /* renamed from: d */
    public final ayjq f96613d;

    /* renamed from: e */
    public final axyb f96614e;

    /* renamed from: f */
    public final axyd f96615f;

    /* renamed from: g */
    public final abop f96616g;

    /* renamed from: i */
    private final axxv f96617i;

    public axwn(int i, abop abop, axui axui, axxv axxv, ayjq ayjq, axyb axyb, axyd axyd) {
        this.f96611b = i;
        this.f96616g = abop;
        this.f96612c = axui;
        this.f96617i = axxv;
        this.f96613d = ayjq;
        this.f96614e = axyb;
        this.f96615f = axyd;
    }

    /* renamed from: a */
    public static void m83408a(String str) {
        if (Log.isLoggable("CloudNode", 3)) {
            Log.d("CloudNode", m83410c(str));
        }
    }

    /* renamed from: b */
    public static void m83409b(String str) {
        Log.w("CloudNode", m83410c(str));
    }

    /* renamed from: c */
    private static String m83410c(String str) {
        if (str.length() < 3000) {
            String valueOf = String.valueOf(str);
            return valueOf.length() == 0 ? new String("CloudNodeAssetClient: ") : "CloudNodeAssetClient: ".concat(valueOf);
        }
        String substring = str.substring(0, 3000);
        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 25);
        sb.append("CloudNodeAssetClient: ");
        sb.append(substring);
        sb.append("...");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ee, code lost:
        if (r4 != null) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0158, code lost:
        if (r4 != null) goto L_0x00f0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02cf  */
    /* renamed from: a */
    public final String mo53697a(String str, String str2) {
        long j;
        String valueOf = String.valueOf(str2);
        m83408a(valueOf.length() == 0 ? new String("Get URL: ") : "Get URL: ".concat(valueOf));
        HttpGet httpGet = new HttpGet(str2);
        httpGet.setHeader("Accept", "application/json");
        HttpEntity httpEntity = null;
        try {
            shr.m35313a(1795, this.f96611b);
            this.f96614e.mo53756a(f96610h, "requests", 1);
            this.f96615f.mo53758a("downloadAsset");
            HttpResponse execute = this.f96616g.execute(httpGet);
            HttpEntity entity = execute.getEntity();
            try {
                int statusCode = execute.getStatusLine().getStatusCode();
                if (statusCode == 200) {
                    this.f96613d.mo54035a();
                    m83408a("Retrieved message from server successfully");
                    axxv axxv = this.f96617i;
                    InputStream content = entity.getContent();
                    AtomicLong atomicLong = new AtomicLong(0);
                    axxv.f96696d.mo53579a(content, atomicLong);
                    j = atomicLong.get();
                    axyd axyd = this.f96615f;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 27);
                    sb.append(str);
                    sb.append(", size=");
                    sb.append(j);
                    axyd.mo53759a("downloadAsset", sb.toString());
                    this.f96614e.mo53756a(f96610h, "success", 1);
                    this.f96614e.mo53756a(f96610h, "bytesRecv", (int) j);
                    String valueOf2 = String.valueOf(str);
                    m83408a(valueOf2.length() == 0 ? new String("Saved asset with digest: ") : "Saved asset with digest: ".concat(valueOf2));
                    if (j <= 0) {
                        str = null;
                    }
                    this.f96615f.mo53759a("downloadAsset", "unknown result");
                } else if (statusCode >= 300 && statusCode < 400) {
                    axyd axyd2 = this.f96615f;
                    StringBuilder sb2 = new StringBuilder(18);
                    sb2.append("error: ");
                    sb2.append(statusCode);
                    axyd2.mo53759a("downloadAsset", sb2.toString());
                    this.f96614e.mo53756a(f96610h, "300s", 1);
                    Header[] headers = execute.getHeaders("Location");
                    if (headers != null) {
                        int length = headers.length;
                        if (length != 0) {
                            String value = headers[length - 1].getValue();
                            String valueOf3 = String.valueOf(value);
                            m83408a(valueOf3.length() == 0 ? new String("Redirected, fetching new url: ") : "Redirected, fetching new url: ".concat(valueOf3));
                            str = mo53697a(str, value);
                            this.f96615f.mo53759a("downloadAsset", "unknown result");
                        }
                    }
                    String valueOf4 = String.valueOf(str2);
                    throw new axwq(2, valueOf4.length() == 0 ? new String("Asset fetch got redirect without redirect url. Original url: ") : "Asset fetch got redirect without redirect url. Original url: ".concat(valueOf4));
                } else if (statusCode >= 400 && statusCode < 500) {
                    axyd axyd3 = this.f96615f;
                    StringBuilder sb3 = new StringBuilder(18);
                    sb3.append("error: ");
                    sb3.append(statusCode);
                    axyd3.mo53759a("downloadAsset", sb3.toString());
                    this.f96614e.mo53756a(f96610h, "400s", 1);
                    String valueOf5 = String.valueOf(str2);
                    Log.w("CloudNode", valueOf5.length() == 0 ? new String("error getting asset: ") : "error getting asset: ".concat(valueOf5));
                    String a = mo53698a(entity);
                    int statusCode2 = execute.getStatusLine().getStatusCode();
                    String reasonPhrase = execute.getStatusLine().getReasonPhrase();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 57 + String.valueOf(reasonPhrase).length() + String.valueOf(a).length());
                    sb4.append("error getting asset ");
                    sb4.append(str2);
                    sb4.append(", ");
                    sb4.append(statusCode2);
                    sb4.append(" reason was: ");
                    sb4.append(reasonPhrase);
                    sb4.append(", response ");
                    sb4.append(a);
                    m83409b(sb4.toString());
                    if (statusCode != 401) {
                        this.f96615f.mo53759a("downloadAsset", "unknown result");
                        if (entity != null) {
                            entity.consumeContent();
                        }
                        shr.m35312a();
                        return null;
                    }
                    throw new axwq(4, a);
                } else if (statusCode >= 500) {
                    axyd axyd4 = this.f96615f;
                    StringBuilder sb5 = new StringBuilder(18);
                    sb5.append("error: ");
                    sb5.append(statusCode);
                    axyd4.mo53759a("downloadAsset", sb5.toString());
                    this.f96614e.mo53756a(f96610h, "500s", 1);
                    String reasonPhrase2 = execute.getStatusLine().getReasonPhrase();
                    StringBuilder sb6 = new StringBuilder(String.valueOf(reasonPhrase2).length() + 53);
                    sb6.append("Failed! Server response code ");
                    sb6.append(statusCode);
                    sb6.append(" reason was: ");
                    sb6.append(reasonPhrase2);
                    m83409b(sb6.toString());
                    String reasonPhrase3 = execute.getStatusLine().getReasonPhrase();
                    StringBuilder sb7 = new StringBuilder(String.valueOf(reasonPhrase3).length() + 13);
                    sb7.append(statusCode);
                    sb7.append(": ");
                    sb7.append(reasonPhrase3);
                    throw new IOException(sb7.toString());
                } else {
                    this.f96614e.mo53756a(f96610h, "IOException", 1);
                    StringBuilder sb8 = new StringBuilder(44);
                    sb8.append("Received unexpected status code: ");
                    sb8.append(statusCode);
                    throw new IOException(sb8.toString());
                }
            } catch (IOException e) {
                String valueOf6 = String.valueOf(str);
                Log.w("DataItems", valueOf6.length() == 0 ? new String("Save asset data failed for asset: ") : "Save asset data failed for asset: ".concat(valueOf6));
                j = 0;
            } catch (Throwable th) {
                th = th;
                httpEntity = entity;
                this.f96615f.mo53759a("downloadAsset", "unknown result");
                if (httpEntity != null) {
                }
                shr.m35312a();
                throw th;
            }
            entity.consumeContent();
            shr.m35312a();
            return str;
        } catch (Throwable th2) {
            th = th2;
            this.f96615f.mo53759a("downloadAsset", "unknown result");
            if (httpEntity != null) {
                httpEntity.consumeContent();
            }
            shr.m35312a();
            throw th;
        }
    }

    /* renamed from: a */
    public final String mo53698a(HttpEntity httpEntity) {
        StringBuilder sb = new StringBuilder();
        if (httpEntity != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpEntity.getContent()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
        }
        return sb.toString();
    }
}
