package com.google.android.gms.ads.nonagon.load.service;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.request.service.C0561k;
import com.google.android.gms.ads.internal.request.service.C0570t;
import com.google.android.gms.ads.internal.util.client.C0632g;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.nonagon.load.C0764a;
import com.google.android.gms.ads.nonagon.util.concurrent.C0855h;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.nonagon.load.service.s */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0783s implements C0855h {

    /* renamed from: a */
    private final Context f9212a;

    /* renamed from: b */
    private final String f9213b;

    /* renamed from: c */
    private final String f9214c;

    /* renamed from: d */
    private final ApplicationInfo f9215d;

    public C0783s(Context context, String str, String str2, ApplicationInfo applicationInfo) {
        this.f9212a = context;
        this.f9213b = str;
        this.f9214c = str2;
        this.f9215d = applicationInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r1 = new java.io.InputStreamReader(r10.getInputStream());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r2 = com.google.android.gms.ads.internal.C0387d.m5363a().mo6846a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        p000.srz.m36171a(r1);
        r11.mo6810a(r2);
        r9.f9208a = r0;
        r9.f9210c = r2;
        r9.f9209b = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x017e, code lost:
        if (android.text.TextUtils.isEmpty(r2) == false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x018c, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.config.C0371o.f8241as.mo6604a()).booleanValue() == false) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0195, code lost:
        throw new com.google.android.gms.ads.nonagon.load.C0764a(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0196, code lost:
        r9.f9211d = com.google.android.gms.ads.internal.C0387d.m5368f().mo20506b() - r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r10.disconnect();
        p000.shr.m35312a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a7, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a9, code lost:
        r11 = r1;
     */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo7051a(Object obj) {
        String str;
        String str2;
        String str3;
        byte[] bArr;
        int responseCode;
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        JSONObject optJSONObject;
        C0783s sVar = this;
        String str4 = "Received error HTTP response code: ";
        String str5 = "doritos_v2";
        String str6 = "doritos";
        C0781q qVar = (C0781q) obj;
        C0561k kVar = qVar.f9207b;
        String str7 = kVar.f8785f;
        JSONObject jSONObject = qVar.f9206a;
        String str8 = sVar.f9214c;
        try {
            int i = kVar.f8786g;
            if (i == -2) {
                C0782r rVar = new C0782r();
                String valueOf = String.valueOf(sVar.f9213b);
                C0633h.m5670c(valueOf.length() == 0 ? new String("SDK version: ") : "SDK version: ".concat(valueOf));
                String valueOf2 = String.valueOf(str7);
                C0633h.m5664a(valueOf2.length() == 0 ? new String("AdRequestServiceImpl: Sending request: ") : "AdRequestServiceImpl: Sending request: ".concat(valueOf2));
                URL url = new URL(str7);
                HashMap hashMap = new HashMap();
                long b = C0387d.m5368f().mo20506b();
                int i2 = 0;
                while (true) {
                    C0570t.m5572a(sVar.f9215d);
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    try {
                        str3 = str4;
                        C0387d.m5363a().mo6854a(sVar.f9212a, sVar.f9213b, httpURLConnection);
                        if (!TextUtils.isEmpty(str8)) {
                            httpURLConnection.addRequestProperty("Cookie", str8);
                        }
                        if (kVar.f8783d && (optJSONObject = jSONObject.optJSONObject("pii")) != null) {
                            if (!TextUtils.isEmpty(optJSONObject.optString(str, ""))) {
                                httpURLConnection.addRequestProperty("x-afma-drt-cookie", optJSONObject.optString(str, ""));
                            }
                            if (!TextUtils.isEmpty(optJSONObject.optString(str2, ""))) {
                                httpURLConnection.addRequestProperty("x-afma-drt-v2-cookie", optJSONObject.optString(str2, ""));
                            }
                        }
                        if (kVar == null || TextUtils.isEmpty(kVar.f8782c)) {
                            bArr = null;
                        } else {
                            httpURLConnection.setDoOutput(true);
                            bArr = kVar.f8782c.getBytes();
                            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                            try {
                                bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                bufferedOutputStream2.write(bArr);
                                srz.m36171a(bufferedOutputStream2);
                            } catch (Throwable th) {
                                th = th;
                                bufferedOutputStream = null;
                                srz.m36171a(bufferedOutputStream);
                                throw th;
                            }
                        }
                        C0632g gVar = new C0632g();
                        gVar.mo6813a(httpURLConnection, bArr);
                        responseCode = httpURLConnection.getResponseCode();
                        for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
                            String key = entry.getKey();
                            String str9 = str2;
                            List<String> value = entry.getValue();
                            if (!hashMap.containsKey(key)) {
                                hashMap.put(key, new ArrayList(value));
                                str = str;
                                str2 = str9;
                            } else {
                                ((List) hashMap.get(key)).addAll(value);
                                str = str;
                                str2 = str9;
                            }
                        }
                        String str10 = str2;
                        String str11 = str;
                        gVar.mo6812a(httpURLConnection, responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            try {
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                                InputStreamReader inputStreamReader = null;
                                srz.m36171a(inputStreamReader);
                                throw th;
                            }
                        } else if (responseCode < 300 || responseCode >= 400) {
                            StringBuilder sb = new StringBuilder(46);
                            sb.append(str3);
                            sb.append(responseCode);
                            C0633h.m5672d(sb.toString());
                            StringBuilder sb2 = new StringBuilder(46);
                            sb2.append(str3);
                            sb2.append(responseCode);
                        } else {
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (!TextUtils.isEmpty(headerField)) {
                                URL url2 = new URL(headerField);
                                i2++;
                                if (i2 <= ((Integer) C0371o.f8238ap.mo6604a()).intValue()) {
                                    httpURLConnection.disconnect();
                                    shr.m35312a();
                                    url = url2;
                                    str4 = str3;
                                    str6 = str11;
                                    str5 = str10;
                                    sVar = this;
                                } else {
                                    C0633h.m5672d("Too many redirects.");
                                    throw new C0764a(1, "Too many redirects");
                                }
                            } else {
                                C0633h.m5672d("No location header to follow redirect.");
                                throw new C0764a(1, "No location header to follow redirect");
                            }
                        }
                    } catch (Throwable th3) {
                        httpURLConnection.disconnect();
                        shr.m35312a();
                        throw th3;
                    }
                }
                StringBuilder sb3 = new StringBuilder(46);
                sb3.append(str3);
                sb3.append(responseCode);
                C0633h.m5672d(sb3.toString());
                StringBuilder sb22 = new StringBuilder(46);
                sb22.append(str3);
                sb22.append(responseCode);
                throw new C0764a(1, sb22.toString());
            } else if (i == 1) {
                List list = kVar.f8780a;
                if (list != null) {
                    C0633h.m5668b(TextUtils.join(", ", list));
                }
                throw new C0764a(2, "Error building request URL.");
            } else {
                throw new C0764a(1);
            }
        } catch (IOException e) {
            String valueOf3 = String.valueOf(e.getMessage());
            String str12 = valueOf3.length() == 0 ? new String("Error while connecting to ad server: ") : "Error while connecting to ad server: ".concat(valueOf3);
            C0633h.m5672d(str12);
            throw new C0764a(str12, e);
        }
    }
}
