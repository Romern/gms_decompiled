package com.google.android.gms.ads.internal.request.service;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.C0271c;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.csi.C0384i;
import com.google.android.gms.ads.internal.csi.C0386k;
import com.google.android.gms.ads.internal.flag.C0390c;
import com.google.android.gms.ads.internal.flag.C0395h;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.C0543d;
import com.google.android.gms.ads.internal.request.C0545f;
import com.google.android.gms.ads.internal.request.C0546g;
import com.google.android.gms.ads.internal.request.NonagonRequestParcel;
import com.google.android.gms.ads.internal.util.C0639d;
import com.google.android.gms.ads.internal.util.C0656n;
import com.google.android.gms.ads.internal.util.C0658o;
import com.google.android.gms.ads.internal.util.client.C0632g;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.internal.util.future.C0645d;
import com.google.android.gms.ads.internal.util.future.C0647f;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.request.service.g */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0557g extends C0543d {

    /* renamed from: a */
    private static final Object f8736a = new Object();

    /* renamed from: b */
    private static C0557g f8737b;

    /* renamed from: c */
    private final Context f8738c;

    /* renamed from: d */
    private final C0552b f8739d;

    public C0557g(Context context, C0552b bVar) {
        this.f8738c = context;
        this.f8739d = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0202  */
    /* renamed from: a */
    private static AdResponseParcel m5544a(Context context, C0552b bVar, AdRequestInfoParcel adRequestInfoParcel) {
        bqgg bqgg;
        boolean z;
        bqgg bqgg2;
        Bundle bundle;
        bqgg bqgg3;
        String str;
        C0386k kVar;
        String str2;
        C0384i iVar;
        C0563m mVar;
        AdResponseParcel adResponseParcel;
        char c;
        Context context2 = context;
        C0552b bVar2 = bVar;
        AdRequestInfoParcel adRequestInfoParcel2 = adRequestInfoParcel;
        C0633h.m5664a("Starting ad request from service using: google.afma.request.getAdDictionary");
        C0386k kVar2 = new C0386k(((Boolean) C0395h.f8335b.mo6621a()).booleanValue(), "load_ad", adRequestInfoParcel2.f8611d.f8140a);
        if (adRequestInfoParcel2.f8601a > 10) {
            long j = adRequestInfoParcel2.f8575A;
            if (j != -1) {
                kVar2.mo6618a(kVar2.mo6617a(j), "cts");
            }
        }
        C0384i a = kVar2.mo6616a();
        bqgg a2 = bqga.m112773a(bVar2.f8722f.mo6707a(context2), ((Long) C0371o.f8227ae.mo6604a()).longValue(), TimeUnit.MILLISECONDS, C0645d.f8975c);
        bqgg a3 = bqga.m112775a((Object) null);
        if (((Boolean) C0371o.f8214aA.mo6604a()).booleanValue()) {
            bqgg = bVar2.f8719c.getDoritosCookieAsynchronously(adRequestInfoParcel2.f8614g.packageName);
        } else {
            bqgg = a3;
        }
        bqgg doritosCookiesAsynchronously = bVar2.f8719c.getDoritosCookiesAsynchronously(adRequestInfoParcel2.f8614g.packageName);
        bqgg a4 = bVar2.f8723g.mo6382a(adRequestInfoParcel2.f8615h, adRequestInfoParcel2.f8614g);
        Future a5 = C0387d.m5369g().mo6747a(context2);
        bqgg a6 = bqga.m112775a((Object) null);
        Bundle bundle2 = adRequestInfoParcel2.f8610c.f8120c;
        if (bundle2 == null || bundle2.getString("_ad") == null) {
            z = false;
        } else {
            z = true;
        }
        if (adRequestInfoParcel2.f8581G && !z) {
            a6 = bVar2.f8721e.mo6698a(adRequestInfoParcel2.f8613f);
        }
        bqgg a7 = bqga.m112773a(a6, ((Long) C0371o.f8225ac.mo6604a()).longValue(), TimeUnit.MILLISECONDS, C0645d.f8975c);
        bqgg a8 = bqga.m112775a((Object) null);
        if (((Boolean) C0371o.f8192F.mo6604a()).booleanValue()) {
            bqgg2 = bqga.m112773a(bVar2.f8723g.mo6380a(context2), ((Long) C0371o.f8193G.mo6604a()).longValue(), TimeUnit.MILLISECONDS, C0645d.f8975c);
        } else {
            bqgg2 = a8;
        }
        if (adRequestInfoParcel2.f8601a < 4 || (bundle = adRequestInfoParcel2.f8622o) == null) {
            bundle = null;
        }
        if (bundle == null && ((Boolean) C0390c.f8324b.mo6621a()).booleanValue()) {
            bundle = new Bundle();
        }
        Bundle bundle3 = bundle;
        if (bundle3 != null) {
            bqgg3 = C0645d.f8973a.mo25819b(new C0554d(bVar2, context2, adRequestInfoParcel2, bundle3));
        } else {
            bqgg3 = null;
        }
        if (C0387d.m5363a().mo6856a(context2, "android.permission.ACCESS_NETWORK_STATE") && ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo() == null) {
            C0633h.m5664a("Device is offline.");
        }
        if (adRequestInfoParcel2.f8601a >= 7) {
            str = adRequestInfoParcel2.f8629v;
        } else {
            str = UUID.randomUUID().toString();
        }
        Bundle bundle4 = adRequestInfoParcel2.f8610c.f8120c;
        if (bundle4 != null) {
            kVar = kVar2;
            String string = bundle4.getString("_ad");
            if (string != null) {
                return C0558h.m5554a(context2, adRequestInfoParcel2, string);
            }
        } else {
            kVar = kVar2;
        }
        List a9 = bVar2.f8725i.mo6443a(adRequestInfoParcel2.f8630w);
        if (bqgg3 != null) {
            try {
                iVar = a;
                str2 = str;
                try {
                    bqgg3.get(((Long) C0390c.f8323a.mo6621a()).longValue(), TimeUnit.MILLISECONDS);
                } catch (InterruptedException | ExecutionException e) {
                    e = e;
                } catch (TimeoutException e2) {
                    C0633h.m5664a("Timed out waiting for app index fetching task");
                    Bundle bundle5 = (Bundle) C0647f.m5687a(a2, null, ((Long) C0371o.f8227ae.mo6604a()).longValue(), TimeUnit.MILLISECONDS);
                    Location location = (Location) C0647f.m5686a(a7);
                    C0271c cVar = (C0271c) C0647f.m5686a(bqgg2);
                    String str3 = (String) C0647f.m5686a(a4);
                    String str4 = (String) C0647f.m5686a(bqgg);
                    String str5 = (String) C0647f.m5686a(doritosCookiesAsynchronously);
                    mVar = (C0563m) C0647f.m5686a(a5);
                    if (mVar != null) {
                    }
                }
            } catch (InterruptedException | ExecutionException e3) {
                e = e3;
                iVar = a;
                str2 = str;
                C0633h.m5673d("Failed to fetch app index signal", e);
                Bundle bundle52 = (Bundle) C0647f.m5687a(a2, null, ((Long) C0371o.f8227ae.mo6604a()).longValue(), TimeUnit.MILLISECONDS);
                Location location2 = (Location) C0647f.m5686a(a7);
                C0271c cVar2 = (C0271c) C0647f.m5686a(bqgg2);
                String str32 = (String) C0647f.m5686a(a4);
                String str42 = (String) C0647f.m5686a(bqgg);
                String str52 = (String) C0647f.m5686a(doritosCookiesAsynchronously);
                mVar = (C0563m) C0647f.m5686a(a5);
                if (mVar != null) {
                }
            } catch (TimeoutException e4) {
                iVar = a;
                str2 = str;
                C0633h.m5664a("Timed out waiting for app index fetching task");
                Bundle bundle522 = (Bundle) C0647f.m5687a(a2, null, ((Long) C0371o.f8227ae.mo6604a()).longValue(), TimeUnit.MILLISECONDS);
                Location location22 = (Location) C0647f.m5686a(a7);
                C0271c cVar22 = (C0271c) C0647f.m5686a(bqgg2);
                String str322 = (String) C0647f.m5686a(a4);
                String str422 = (String) C0647f.m5686a(bqgg);
                String str522 = (String) C0647f.m5686a(doritosCookiesAsynchronously);
                mVar = (C0563m) C0647f.m5686a(a5);
                if (mVar != null) {
                }
            }
        } else {
            iVar = a;
            str2 = str;
        }
        Bundle bundle5222 = (Bundle) C0647f.m5687a(a2, null, ((Long) C0371o.f8227ae.mo6604a()).longValue(), TimeUnit.MILLISECONDS);
        Location location222 = (Location) C0647f.m5686a(a7);
        C0271c cVar222 = (C0271c) C0647f.m5686a(bqgg2);
        String str3222 = (String) C0647f.m5686a(a4);
        String str4222 = (String) C0647f.m5686a(bqgg);
        String str5222 = (String) C0647f.m5686a(doritosCookiesAsynchronously);
        mVar = (C0563m) C0647f.m5686a(a5);
        if (mVar != null) {
            C0633h.m5672d("Error fetching device info. This is not recoverable.");
            return new AdResponseParcel(0);
        }
        C0551a aVar = new C0551a();
        aVar.f8714i = adRequestInfoParcel2;
        aVar.f8715j = mVar;
        aVar.f8709d = location222;
        aVar.f8707b = bundle5222;
        aVar.f8712g = str3222;
        aVar.f8713h = cVar222;
        if (a9 == null) {
            aVar.f8708c.clear();
        }
        aVar.f8708c = a9;
        aVar.f8706a = bundle3;
        aVar.f8710e = str4222;
        aVar.f8711f = str5222;
        aVar.f8716k = bVar2.f8718b.mo6419a(context2);
        boolean z2 = bVar2.f8724h;
        JSONObject a10 = C0558h.m5556a(context2, aVar);
        if (a10 == null) {
            return new AdResponseParcel(0);
        }
        if (adRequestInfoParcel2.f8601a < 7) {
            try {
                a10.put("request_id", str2);
            } catch (JSONException e5) {
            }
        }
        C0386k kVar3 = kVar;
        C0384i iVar2 = iVar;
        kVar3.mo6618a(iVar2, "arc");
        bqgg a11 = bqga.m112773a(bqdx.m112674a(bVar2.f8726j.f8860a.mo6670b(a10), C0553c.f8727a, C0645d.f8973a), 10, TimeUnit.SECONDS, C0645d.f8975c);
        bqgg a12 = bVar2.f8720d.mo6748a();
        if (a12 != null) {
            C0647f.m5688a(a12, "AdRequestServiceImpl.loadAd.flags");
        }
        C0561k kVar4 = (C0561k) C0647f.m5686a(a11);
        if (kVar4 == null) {
            return new AdResponseParcel(0);
        }
        int i = kVar4.f8786g;
        if (i != -2) {
            return new AdResponseParcel(i);
        }
        synchronized (kVar3.f8298c) {
        }
        if (!TextUtils.isEmpty(kVar4.f8784e)) {
            adResponseParcel = C0558h.m5554a(context2, adRequestInfoParcel2, kVar4.f8784e);
        } else {
            adResponseParcel = null;
        }
        if (adResponseParcel == null && !TextUtils.isEmpty(kVar4.f8785f)) {
            adResponseParcel = m5545a(adRequestInfoParcel, context, adRequestInfoParcel2.f8618k.f8949a, kVar4.f8785f, str4222, str5222, kVar4, kVar3, bVar);
        }
        if (adResponseParcel != null) {
            c = 0;
        } else {
            c = 0;
            adResponseParcel = new AdResponseParcel(0);
        }
        String[] strArr = new String[1];
        strArr[c] = "tts";
        kVar3.mo6618a(iVar2, strArr);
        adResponseParcel.f8685y = kVar3.mo6619b();
        adResponseParcel.f8657X = kVar4.f8789j;
        return adResponseParcel;
    }

    /* renamed from: b */
    public final void mo6732b(NonagonRequestParcel nonagonRequestParcel, C0546g gVar) {
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public final void mo6733c(NonagonRequestParcel nonagonRequestParcel, C0546g gVar) {
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        com.google.android.gms.ads.internal.util.client.C0633h.m5672d("No location header to follow redirect.");
        r0 = new com.google.android.gms.ads.internal.request.AdResponseParcel(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        r3.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0244, code lost:
        if (r66 == null) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0246, code lost:
        p000.shr.m35312a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0249, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0273, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0274, code lost:
        r3 = r57;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e5, code lost:
        r0 = r7.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r5 = new java.io.InputStreamReader(r15.getInputStream());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r7 = com.google.android.gms.ads.internal.C0387d.m5363a().mo6846a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        p000.srz.m36171a(r5);
        r3.mo6810a(r7);
        m5547a(r0, r10, r7, r8);
        r6.f8756c = r7;
        r6.mo6744a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0108, code lost:
        if (r2 != null) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010b, code lost:
        r2.mo6618a(r4, "ufe");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0116, code lost:
        r10 = r6.f8753N;
        r11 = r6.f8755b;
        r12 = r6.f8756c;
        r13 = r6.f8757d;
        r14 = r6.f8761h;
        r2 = r6.f8763j;
        r4 = r6.f8764k;
        r5 = r6.f8765l;
        r7 = r6.f8766m;
        r9 = r6.f8767n;
        r19 = r7;
        r7 = r6.f8754a;
        r25 = r6.f8759f;
        r26 = r6.f8760g;
        r27 = r6.f8768o;
        r28 = r6.f8769p;
        r29 = r6.f8770q;
        r30 = r6.f8771r;
        r31 = r6.f8773t;
        r32 = r6.f8774u;
        r33 = r6.f8775v;
        r34 = r6.f8776w;
        r35 = r6.f8777x;
        r36 = r6.f8778y;
        r37 = r6.f8779z;
        r38 = r6.f8740A;
        r39 = r6.f8741B;
        r40 = r6.f8742C;
        r41 = r6.f8743D;
        r42 = r6.f8744E;
        r43 = r6.f8745F;
        r44 = r6.f8746G;
        r45 = r6.f8758e;
        r46 = r6.f8772s;
        r47 = r6.f8747H;
        r8 = r6.f8748I;
        r16 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0192, code lost:
        if (r1.f8787h != false) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0194, code lost:
        r49 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0197, code lost:
        r49 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01af, code lost:
        r57 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r9 = new com.google.android.gms.ads.internal.request.AdResponseParcel(r10, r11, r12, r13, r14, r2, r4, r5, r19, r16, r7, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r8, r49, r6.f8749J, r6.f8762i, r6.f8750K, r6.f8751L, r1.f8789j, r1.f8790k, r6.f8752M);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r57.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c9, code lost:
        if (r66 == null) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01cb, code lost:
        p000.shr.m35312a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ce, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01cf, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d0, code lost:
        r57 = r15;
        r3 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01d4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01d5, code lost:
        r57 = r15;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        p000.srz.m36171a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01db, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0212, code lost:
        com.google.android.gms.ads.internal.util.client.C0633h.m5672d("Too many redirects.");
        r0 = new com.google.android.gms.ads.internal.request.AdResponseParcel(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r3.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0220, code lost:
        if (r66 == null) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0222, code lost:
        p000.shr.m35312a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0225, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x027e A[Catch:{ IOException -> 0x0282 }] */
    /* renamed from: a */
    public static AdResponseParcel m5545a(AdRequestInfoParcel adRequestInfoParcel, Context context, String str, String str2, String str3, String str4, C0561k kVar, C0386k kVar2, C0552b bVar) {
        C0384i iVar;
        HttpURLConnection httpURLConnection;
        byte[] bArr;
        int responseCode;
        HttpURLConnection httpURLConnection2;
        BufferedOutputStream bufferedOutputStream;
        AdRequestInfoParcel adRequestInfoParcel2 = adRequestInfoParcel;
        C0561k kVar3 = kVar;
        C0386k kVar4 = kVar2;
        if (kVar4 != null) {
            iVar = kVar2.mo6616a();
        } else {
            iVar = null;
        }
        try {
            C0559i iVar2 = new C0559i(adRequestInfoParcel2, kVar3.f8781b);
            String valueOf = String.valueOf(str2);
            C0633h.m5664a(valueOf.length() == 0 ? new String("AdRequestServiceImpl: Sending request: ") : "AdRequestServiceImpl: Sending request: ".concat(valueOf));
            URL url = new URL(str2);
            long b = C0387d.m5368f().mo20506b();
            int i = 0;
            while (true) {
                if (bVar != null) {
                    C0570t.m5572a(adRequestInfoParcel2.f8613f);
                }
                HttpURLConnection httpURLConnection3 = (HttpURLConnection) url.openConnection();
                try {
                    C0387d.m5363a().mo6854a(context, str, httpURLConnection3);
                    if (kVar3.f8783d) {
                        if (!TextUtils.isEmpty(str3)) {
                            httpURLConnection3.addRequestProperty("x-afma-drt-cookie", str3);
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            httpURLConnection3.addRequestProperty("x-afma-drt-v2-cookie", str4);
                        }
                    }
                    String str5 = adRequestInfoParcel2.f8582H;
                    if (!TextUtils.isEmpty(str5)) {
                        C0633h.m5664a("Sending webview cookie in ad request header.");
                        httpURLConnection3.addRequestProperty("Cookie", str5);
                    }
                    if (kVar3 == null || TextUtils.isEmpty(kVar3.f8782c)) {
                        bArr = null;
                    } else {
                        httpURLConnection3.setDoOutput(true);
                        bArr = kVar3.f8782c.getBytes();
                        httpURLConnection3.setFixedLengthStreamingMode(bArr.length);
                        try {
                            bufferedOutputStream = new BufferedOutputStream(httpURLConnection3.getOutputStream());
                            bufferedOutputStream.write(bArr);
                            srz.m36171a(bufferedOutputStream);
                        } catch (Throwable th) {
                            th = th;
                            bufferedOutputStream = null;
                            srz.m36171a(bufferedOutputStream);
                            throw th;
                        }
                    }
                    C0632g gVar = new C0632g(adRequestInfoParcel2.f8629v);
                    gVar.mo6813a(httpURLConnection3, bArr);
                    responseCode = httpURLConnection3.getResponseCode();
                    Map<String, List<String>> headerFields = httpURLConnection3.getHeaderFields();
                    gVar.mo6812a(httpURLConnection3, responseCode);
                    if (responseCode < 200) {
                        httpURLConnection2 = httpURLConnection3;
                    } else if (responseCode < 300) {
                        break;
                    } else {
                        httpURLConnection2 = httpURLConnection3;
                    }
                    m5547a(url.toString(), headerFields, null, responseCode);
                    if (responseCode >= 300) {
                        if (responseCode >= 400) {
                            httpURLConnection = httpURLConnection2;
                            break;
                        }
                        httpURLConnection = httpURLConnection2;
                        try {
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (TextUtils.isEmpty(headerField)) {
                                break;
                            }
                            url = new URL(headerField);
                            i++;
                            if (i > ((Integer) C0371o.f8238ap.mo6604a()).intValue()) {
                                break;
                            }
                            iVar2.mo6744a(headerFields);
                            httpURLConnection.disconnect();
                            if (bVar != null) {
                                shr.m35312a();
                            }
                            adRequestInfoParcel2 = adRequestInfoParcel;
                        } catch (Throwable th2) {
                            th = th2;
                            httpURLConnection.disconnect();
                            if (bVar != null) {
                                shr.m35312a();
                            }
                            throw th;
                        }
                    } else {
                        httpURLConnection = httpURLConnection2;
                        break;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    httpURLConnection = httpURLConnection3;
                    httpURLConnection.disconnect();
                    if (bVar != null) {
                    }
                    throw th;
                }
            }
            StringBuilder sb = new StringBuilder(46);
            sb.append("Received error HTTP response code: ");
            sb.append(responseCode);
            C0633h.m5672d(sb.toString());
            AdResponseParcel adResponseParcel = new AdResponseParcel(0);
            httpURLConnection.disconnect();
            if (bVar != null) {
                shr.m35312a();
            }
            return adResponseParcel;
        } catch (IOException e) {
            String valueOf2 = String.valueOf(e.getMessage());
            C0633h.m5672d(valueOf2.length() == 0 ? new String("Error while connecting to ad server: ") : "Error while connecting to ad server: ".concat(valueOf2));
            return new AdResponseParcel(2);
        }
    }

    /* renamed from: a */
    public static C0557g m5546a(Context context, C0552b bVar) {
        C0557g gVar;
        synchronized (f8736a) {
            if (f8737b == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                C0371o.m5339a(context);
                f8737b = new C0557g(context, bVar);
                if (context.getApplicationContext() != null) {
                    C0658o a = C0387d.m5363a();
                    if (!a.f9015d) {
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
                        context.getApplicationContext().registerReceiver(new C0656n(), intentFilter);
                        a.f9015d = true;
                    }
                }
                C0639d.m5679a(context);
            }
            gVar = f8737b;
        }
        return gVar;
    }

    /* renamed from: a */
    private static void m5547a(String str, Map map, String str2, int i) {
        if (C0633h.m5667a(2)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
            sb.append("Http Response: {\n  URL:\n    ");
            sb.append(str);
            sb.append("\n  Headers:");
            sb.toString();
            if (map != null) {
                for (String str3 : map.keySet()) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 5);
                    sb2.append("    ");
                    sb2.append(str3);
                    sb2.append(":");
                    sb2.toString();
                    for (String str4 : (List) map.get(str3)) {
                        String valueOf = String.valueOf(str4);
                        if (valueOf.length() == 0) {
                            new String("      ");
                        } else {
                            "      ".concat(valueOf);
                        }
                    }
                }
            }
            if (str2 != null) {
                int i2 = 0;
                while (i2 < Math.min(str2.length(), 100000)) {
                    int i3 = i2 + 1000;
                    str2.substring(i2, Math.min(str2.length(), i3));
                    i2 = i3;
                }
            }
            StringBuilder sb3 = new StringBuilder(34);
            sb3.append("  Response Code:\n    ");
            sb3.append(i);
            sb3.append("\n}");
            sb3.toString();
        }
    }

    /* renamed from: a */
    public final AdResponseParcel mo6728a(AdRequestInfoParcel adRequestInfoParcel) {
        return m5544a(this.f8738c, this.f8739d, adRequestInfoParcel);
    }

    /* renamed from: a */
    public final void mo6729a(AdRequestInfoParcel adRequestInfoParcel, C0545f fVar) {
        C0387d.m5366d().mo6782a(this.f8738c, adRequestInfoParcel.f8618k);
        bqgg a = C0645d.f8973a.mo25812a(new C0555e(this, adRequestInfoParcel, fVar));
        C0387d.m5371i().mo6792a();
        C0387d.m5371i().f8923a.postDelayed(new C0556f(a), 60000);
    }

    /* renamed from: a */
    public final void mo6730a(NonagonRequestParcel nonagonRequestParcel, C0546g gVar) {
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo6731a(String str, C0546g gVar) {
        throw new IllegalArgumentException();
    }
}
