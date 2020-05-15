package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.params.HttpParams;

/* renamed from: rdz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rdz implements rec {

    /* renamed from: b */
    private static final bixj f42773b = new rdv();

    /* renamed from: a */
    final HttpClient f42774a;

    /* renamed from: c */
    private final bixj f42775c;

    /* renamed from: d */
    private final sqv f42776d;

    /* renamed from: e */
    private final rbp f42777e;

    /* renamed from: f */
    private final String f42778f;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    public rdz(Context context, String str, rbp rbp) {
        rdw rdw = new rdw(context, rbp);
        StringBuilder sb = new StringBuilder("Android/");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            sb.append(packageInfo.packageName);
            sb.append("/");
            sb.append(packageInfo.versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("ApacheHttpTransport", e.getMessage(), e);
        }
        abop abop = new abop(context, sb.toString(), true);
        srb srb = srb.f45012a;
        sdo.m34959a((Object) str);
        this.f42778f = str;
        sdo.m34959a(rbp);
        this.f42777e = rbp;
        sdo.m34959a(rdw);
        this.f42775c = rdw;
        sdo.m34959a(abop);
        this.f42774a = abop;
        HttpParams httpParams = abop.f57804b;
        httpParams.setParameter("http.connection.timeout", Integer.valueOf((int) Math.max(cdej.m132797c(), 10000L)));
        httpParams.setParameter("http.socket.timeout", Integer.valueOf((int) Math.max(cdej.f180585a.mo6606a().mo77334a(), 30000L)));
        sdo.m34959a(srb);
        this.f42776d = srb;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bixi.a(org.apache.http.client.methods.HttpUriRequest, bixj):org.apache.http.client.methods.HttpUriRequest
     arg types: [rdy, bixj]
     candidates:
      bixi.a(java.lang.String, java.lang.String):java.lang.String
      bixi.a(org.apache.http.client.methods.HttpUriRequest, bixj):org.apache.http.client.methods.HttpUriRequest */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rdz.a(rbp, caik, org.apache.http.client.methods.HttpPost, org.apache.http.HttpResponse):void
     arg types: [rbp, caik, rdy, org.apache.http.HttpResponse]
     candidates:
      rdz.a(caik, rea, java.lang.String, java.lang.String):reb
      rec.a(caik, rea, java.lang.String, java.lang.String):reb
      rdz.a(rbp, caik, org.apache.http.client.methods.HttpPost, org.apache.http.HttpResponse):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rdz.a(rbp, caik, org.apache.http.client.methods.HttpPost, org.apache.http.HttpResponse):void
     arg types: [rbp, caik, rdy, ?[OBJECT, ARRAY]]
     candidates:
      rdz.a(caik, rea, java.lang.String, java.lang.String):reb
      rec.a(caik, rea, java.lang.String, java.lang.String):reb
      rdz.a(rbp, caik, org.apache.http.client.methods.HttpPost, org.apache.http.HttpResponse):void */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d4 A[SYNTHETIC, Splitter:B:51:0x00d4] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e7 A[SYNTHETIC, Splitter:B:59:0x00e7] */
    /* renamed from: a */
    private final reb m33439a(caik caik, rea rea, String str, String str2, String str3, long j) {
        byte[] bArr;
        Throwable th;
        IOException iOException;
        InputStream inputStream;
        caik caik2 = caik;
        String str4 = str;
        String str5 = str2;
        sdo.m34959a(rea);
        sdo.m34959a((Object) str3);
        rdy rdy = new rdy(str3, rea, this.f42776d);
        if (cdej.m132799e() || "https".equals(rdy.getURI().getScheme())) {
            String valueOf = String.valueOf(str3);
            if (valueOf.length() == 0) {
                new String("requestUrl=");
            } else {
                "requestUrl=".concat(valueOf);
            }
            rea.mo24545f();
            if (str4 != null) {
                rdy.addHeader("Authorization", str4);
            }
            if (str5 != null && !str2.isEmpty()) {
                rdy.addHeader("X-SERVER-TOKEN", str5);
            }
            bixj bixj = !caik2.f174722j ? this.f42775c : f42773b;
            this.f42777e.mo24443a(caik);
            bArr = null;
            InputStream inputStream2 = null;
            bArr = null;
            bArr = null;
            bArr = null;
            bArr = null;
            bArr = null;
            bArr = null;
            try {
                HttpResponse execute = this.f42774a.execute(bixi.m102934a((HttpUriRequest) rdy, bixj));
                bixi.m102936a(rdy, execute, bixj);
                m33440a(this.f42777e, caik, (HttpPost) rdy, execute);
                StatusLine statusLine = execute.getStatusLine();
                int statusCode = statusLine.getStatusCode();
                if (statusCode >= 200 && statusCode < 300) {
                    try {
                        inputStream = execute.getEntity().getContent();
                        try {
                            bArr = boav.m111020a(inputStream);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e) {
                                    iOException = e;
                                }
                            }
                        } catch (IOException e2) {
                            e = e2;
                            try {
                                Log.e("ApacheHttpTransport", "Error reading the content of the response body. ", e);
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e3) {
                                        iOException = e3;
                                    }
                                }
                                return new reb(bArr, statusCode, statusLine.getReasonPhrase());
                            } catch (Throwable th2) {
                                inputStream2 = inputStream;
                                th = th2;
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (IOException e4) {
                                        Log.e("ApacheHttpTransport", "Error closing response stream.", e4);
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            inputStream2 = inputStream;
                            th = th3;
                            if (inputStream2 != null) {
                            }
                            throw th;
                        }
                    } catch (IOException e5) {
                        e = e5;
                        inputStream = null;
                        Log.e("ApacheHttpTransport", "Error reading the content of the response body. ", e);
                        if (inputStream != null) {
                        }
                        return new reb(bArr, statusCode, statusLine.getReasonPhrase());
                    } catch (Throwable th4) {
                        th = th4;
                        if (inputStream2 != null) {
                        }
                        throw th;
                    }
                } else if (statusCode >= 300 && statusCode < 400) {
                    if (j <= 0) {
                        StringBuilder sb = new StringBuilder(71);
                        sb.append("Server returned ");
                        sb.append(statusCode);
                        sb.append("... redirect, but no more redirects allowed.");
                        Log.e("ApacheHttpTransport", sb.toString());
                    } else {
                        Header firstHeader = execute.getFirstHeader("Location");
                        if (firstHeader != null) {
                            return m33439a(caik, rea, str, str2, firstHeader.getValue(), j - 1);
                        }
                        StringBuilder sb2 = new StringBuilder(50);
                        sb2.append("Status ");
                        sb2.append(statusCode);
                        sb2.append("... redirect: no location header");
                        Log.e("ApacheHttpTransport", sb2.toString());
                    }
                }
                return new reb(bArr, statusCode, statusLine.getReasonPhrase());
            } catch (Throwable th5) {
                m33440a(this.f42777e, caik, (HttpPost) rdy, (HttpResponse) null);
                throw th5;
            }
        } else {
            String valueOf2 = String.valueOf(str3);
            throw new IllegalStateException(valueOf2.length() == 0 ? new String("Abort attempt to upload logs in plaintext: requestUrl=") : "Abort attempt to upload logs in plaintext: requestUrl=".concat(valueOf2));
        }
        Log.e("ApacheHttpTransport", "Error closing response stream.", iOException);
        return new reb(bArr, statusCode, statusLine.getReasonPhrase());
    }

    /* renamed from: a */
    private static final void m33440a(rbp rbp, caik caik, HttpPost httpPost, HttpResponse httpResponse) {
        rbp.mo24445a(caik, httpPost.getEntity().f42768a);
        Header[] allHeaders = httpPost.getAllHeaders();
        int i = 0;
        for (Header header : allHeaders) {
            i = i + header.getName().length() + header.getValue().length() + 3;
        }
        rbp.mo24450b(caik, (long) i);
        if (httpResponse != null) {
            rbp.mo24440a(httpResponse.getStatusLine().getStatusCode());
        }
    }

    /* renamed from: a */
    public final reb mo24537a(caik caik, rea rea, String str, String str2) {
        return m33439a(caik, rea, str, str2, this.f42778f, cdej.f180585a.mo6606a().mo77347n());
    }
}
